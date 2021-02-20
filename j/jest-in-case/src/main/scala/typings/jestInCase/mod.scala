package typings.jestInCase

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("jest-in-case", JSImport.Namespace)
  @js.native
  def apply[Opts /* <: Config */](title: String, tester: Tester[Opts], testCases: TestCases[Opts]): Unit = js.native
  
  @js.native
  trait Config
    extends /* key */ StringDictionary[js.Any] {
    
    var name: js.UndefOr[String] = js.native
    
    var only: js.UndefOr[Boolean] = js.native
    
    var skip: js.UndefOr[Boolean] = js.native
  }
  object Config {
    
    @scala.inline
    def apply(): Config = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Config]
    }
    
    @scala.inline
    implicit class ConfigMutableBuilder[Self <: Config] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
      
      @scala.inline
      def setOnly(value: Boolean): Self = StObject.set(x, "only", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOnlyUndefined: Self = StObject.set(x, "only", js.undefined)
      
      @scala.inline
      def setSkip(value: Boolean): Self = StObject.set(x, "skip", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSkipUndefined: Self = StObject.set(x, "skip", js.undefined)
    }
  }
  
  type TestCases[Opts] = js.Array[Opts] | StringDictionary[Opts]
  
  type Tester[Opts] = js.Function2[
    /* opts */ Opts, 
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify jest.DoneCallback */ /* done */ js.Any, 
    js.Any
  ]
}
