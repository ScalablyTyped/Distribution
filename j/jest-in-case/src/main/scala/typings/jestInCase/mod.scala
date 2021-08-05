package typings.jestInCase

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  inline def apply[Opts /* <: Config */](title: String, tester: Tester[Opts], testCases: TestCases[Opts]): Unit = (^.asInstanceOf[js.Dynamic].apply(title.asInstanceOf[js.Any], tester.asInstanceOf[js.Any], testCases.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  @JSImport("jest-in-case", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  trait Config
    extends StObject
       with /* key */ StringDictionary[js.Any] {
    
    var name: js.UndefOr[String] = js.undefined
    
    var only: js.UndefOr[Boolean] = js.undefined
    
    var skip: js.UndefOr[Boolean] = js.undefined
  }
  object Config {
    
    inline def apply(): Config = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Config]
    }
    
    extension [Self <: Config](x: Self) {
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
      
      inline def setOnly(value: Boolean): Self = StObject.set(x, "only", value.asInstanceOf[js.Any])
      
      inline def setOnlyUndefined: Self = StObject.set(x, "only", js.undefined)
      
      inline def setSkip(value: Boolean): Self = StObject.set(x, "skip", value.asInstanceOf[js.Any])
      
      inline def setSkipUndefined: Self = StObject.set(x, "skip", js.undefined)
    }
  }
  
  type TestCases[Opts] = js.Array[Opts] | StringDictionary[Opts]
  
  type Tester[Opts] = js.Function2[
    /* opts */ Opts, 
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify jest.DoneCallback */ /* done */ js.Any, 
    js.Any
  ]
}
