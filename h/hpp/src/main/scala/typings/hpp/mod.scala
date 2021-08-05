package typings.hpp

import typings.express.mod.RequestHandler
import typings.expressServeStaticCore.mod.ParamsDictionary
import typings.expressServeStaticCore.mod.Query
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  inline def apply(): RequestHandler[ParamsDictionary, js.Any, js.Any, Query] = ^.asInstanceOf[js.Dynamic].apply().asInstanceOf[RequestHandler[ParamsDictionary, js.Any, js.Any, Query]]
  inline def apply(options: Options): RequestHandler[ParamsDictionary, js.Any, js.Any, Query] = ^.asInstanceOf[js.Dynamic].apply(options.asInstanceOf[js.Any]).asInstanceOf[RequestHandler[ParamsDictionary, js.Any, js.Any, Query]]
  
  @JSImport("hpp", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  trait Options extends StObject {
    
    var checkBody: js.UndefOr[Boolean] = js.undefined
    
    var checkBodyOnlyForContentType: js.UndefOr[String] = js.undefined
    
    var checkQuery: js.UndefOr[Boolean] = js.undefined
    
    var whitelist: js.UndefOr[String | js.Array[String]] = js.undefined
  }
  object Options {
    
    inline def apply(): Options = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Options]
    }
    
    extension [Self <: Options](x: Self) {
      
      inline def setCheckBody(value: Boolean): Self = StObject.set(x, "checkBody", value.asInstanceOf[js.Any])
      
      inline def setCheckBodyOnlyForContentType(value: String): Self = StObject.set(x, "checkBodyOnlyForContentType", value.asInstanceOf[js.Any])
      
      inline def setCheckBodyOnlyForContentTypeUndefined: Self = StObject.set(x, "checkBodyOnlyForContentType", js.undefined)
      
      inline def setCheckBodyUndefined: Self = StObject.set(x, "checkBody", js.undefined)
      
      inline def setCheckQuery(value: Boolean): Self = StObject.set(x, "checkQuery", value.asInstanceOf[js.Any])
      
      inline def setCheckQueryUndefined: Self = StObject.set(x, "checkQuery", js.undefined)
      
      inline def setWhitelist(value: String | js.Array[String]): Self = StObject.set(x, "whitelist", value.asInstanceOf[js.Any])
      
      inline def setWhitelistUndefined: Self = StObject.set(x, "whitelist", js.undefined)
      
      inline def setWhitelistVarargs(value: String*): Self = StObject.set(x, "whitelist", js.Array(value :_*))
    }
  }
}
