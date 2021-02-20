package typings.hpp

import typings.express.mod.RequestHandler
import typings.expressServeStaticCore.mod.ParamsDictionary
import typings.expressServeStaticCore.mod.Query
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("hpp", JSImport.Namespace)
  @js.native
  def apply(): RequestHandler[ParamsDictionary, _, _, Query] = js.native
  @JSImport("hpp", JSImport.Namespace)
  @js.native
  def apply(options: Options): RequestHandler[ParamsDictionary, _, _, Query] = js.native
  
  @js.native
  trait Options extends StObject {
    
    var checkBody: js.UndefOr[Boolean] = js.native
    
    var checkBodyOnlyForContentType: js.UndefOr[String] = js.native
    
    var checkQuery: js.UndefOr[Boolean] = js.native
    
    var whitelist: js.UndefOr[String | js.Array[String]] = js.native
  }
  object Options {
    
    @scala.inline
    def apply(): Options = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Options]
    }
    
    @scala.inline
    implicit class OptionsMutableBuilder[Self <: Options] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCheckBody(value: Boolean): Self = StObject.set(x, "checkBody", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCheckBodyOnlyForContentType(value: String): Self = StObject.set(x, "checkBodyOnlyForContentType", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCheckBodyOnlyForContentTypeUndefined: Self = StObject.set(x, "checkBodyOnlyForContentType", js.undefined)
      
      @scala.inline
      def setCheckBodyUndefined: Self = StObject.set(x, "checkBody", js.undefined)
      
      @scala.inline
      def setCheckQuery(value: Boolean): Self = StObject.set(x, "checkQuery", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCheckQueryUndefined: Self = StObject.set(x, "checkQuery", js.undefined)
      
      @scala.inline
      def setWhitelist(value: String | js.Array[String]): Self = StObject.set(x, "whitelist", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWhitelistUndefined: Self = StObject.set(x, "whitelist", js.undefined)
      
      @scala.inline
      def setWhitelistVarargs(value: String*): Self = StObject.set(x, "whitelist", js.Array(value :_*))
    }
  }
}
