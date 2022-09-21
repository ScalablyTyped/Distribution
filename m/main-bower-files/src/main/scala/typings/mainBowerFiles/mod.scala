package typings.mainBowerFiles

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  inline def apply(): js.Array[String] = ^.asInstanceOf[js.Dynamic].apply().asInstanceOf[js.Array[String]]
  inline def apply(options: Unit, callback: js.Function1[/* error */ js.Error | Null, Unit]): js.Array[String] = (^.asInstanceOf[js.Dynamic].apply(options.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[js.Array[String]]
  inline def apply(options: IOptions): js.Array[String] = ^.asInstanceOf[js.Dynamic].apply(options.asInstanceOf[js.Any]).asInstanceOf[js.Array[String]]
  inline def apply(options: IOptions, callback: js.Function1[/* error */ js.Error | Null, Unit]): js.Array[String] = (^.asInstanceOf[js.Dynamic].apply(options.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[js.Array[String]]
  
  @JSImport("main-bower-files", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  type IFilterFunction = js.Function1[/* filepath */ String, Boolean]
  
  trait IOptions extends StObject {
    
    var checkExistence: js.UndefOr[Boolean] = js.undefined
    
    var debugging: js.UndefOr[Boolean] = js.undefined
    
    var env: js.UndefOr[String] = js.undefined
    
    var filter: js.UndefOr[js.RegExp | IFilterFunction | String | js.Array[String]] = js.undefined
    
    var includeDev: js.UndefOr[Boolean | String] = js.undefined
    
    var includeSelf: js.UndefOr[Boolean] = js.undefined
    
    var main: js.UndefOr[String | js.Array[String] | js.Object] = js.undefined
    
    var paths: js.UndefOr[IPaths | String] = js.undefined
  }
  object IOptions {
    
    inline def apply(): IOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[IOptions]
    }
    
    extension [Self <: IOptions](x: Self) {
      
      inline def setCheckExistence(value: Boolean): Self = StObject.set(x, "checkExistence", value.asInstanceOf[js.Any])
      
      inline def setCheckExistenceUndefined: Self = StObject.set(x, "checkExistence", js.undefined)
      
      inline def setDebugging(value: Boolean): Self = StObject.set(x, "debugging", value.asInstanceOf[js.Any])
      
      inline def setDebuggingUndefined: Self = StObject.set(x, "debugging", js.undefined)
      
      inline def setEnv(value: String): Self = StObject.set(x, "env", value.asInstanceOf[js.Any])
      
      inline def setEnvUndefined: Self = StObject.set(x, "env", js.undefined)
      
      inline def setFilter(value: js.RegExp | IFilterFunction | String | js.Array[String]): Self = StObject.set(x, "filter", value.asInstanceOf[js.Any])
      
      inline def setFilterFunction1(value: /* filepath */ String => Boolean): Self = StObject.set(x, "filter", js.Any.fromFunction1(value))
      
      inline def setFilterUndefined: Self = StObject.set(x, "filter", js.undefined)
      
      inline def setFilterVarargs(value: String*): Self = StObject.set(x, "filter", js.Array(value*))
      
      inline def setIncludeDev(value: Boolean | String): Self = StObject.set(x, "includeDev", value.asInstanceOf[js.Any])
      
      inline def setIncludeDevUndefined: Self = StObject.set(x, "includeDev", js.undefined)
      
      inline def setIncludeSelf(value: Boolean): Self = StObject.set(x, "includeSelf", value.asInstanceOf[js.Any])
      
      inline def setIncludeSelfUndefined: Self = StObject.set(x, "includeSelf", js.undefined)
      
      inline def setMain(value: String | js.Array[String] | js.Object): Self = StObject.set(x, "main", value.asInstanceOf[js.Any])
      
      inline def setMainUndefined: Self = StObject.set(x, "main", js.undefined)
      
      inline def setMainVarargs(value: String*): Self = StObject.set(x, "main", js.Array(value*))
      
      inline def setPaths(value: IPaths | String): Self = StObject.set(x, "paths", value.asInstanceOf[js.Any])
      
      inline def setPathsUndefined: Self = StObject.set(x, "paths", js.undefined)
    }
  }
  
  trait IPaths extends StObject {
    
    var bowerDirectory: js.UndefOr[String] = js.undefined
    
    var bowerJson: js.UndefOr[String] = js.undefined
    
    var bowerrc: js.UndefOr[String] = js.undefined
  }
  object IPaths {
    
    inline def apply(): IPaths = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[IPaths]
    }
    
    extension [Self <: IPaths](x: Self) {
      
      inline def setBowerDirectory(value: String): Self = StObject.set(x, "bowerDirectory", value.asInstanceOf[js.Any])
      
      inline def setBowerDirectoryUndefined: Self = StObject.set(x, "bowerDirectory", js.undefined)
      
      inline def setBowerJson(value: String): Self = StObject.set(x, "bowerJson", value.asInstanceOf[js.Any])
      
      inline def setBowerJsonUndefined: Self = StObject.set(x, "bowerJson", js.undefined)
      
      inline def setBowerrc(value: String): Self = StObject.set(x, "bowerrc", value.asInstanceOf[js.Any])
      
      inline def setBowerrcUndefined: Self = StObject.set(x, "bowerrc", js.undefined)
    }
  }
}
