package typings.ipfsHttpServer.objectMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object patchRmLink {
  
  @JSImport("ipfs-http-server/dist/src/api/resources/object", "patchRmLink")
  @js.native
  val ^ : js.Any = js.native
  
  inline def handler(request: js.Any, h: js.Any): js.Promise[js.Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("handler")(request.asInstanceOf[js.Any], h.asInstanceOf[js.Any])).asInstanceOf[js.Promise[js.Any]]
  
  object options18 {
    
    object validate9 {
      
      object options19 {
        
        @JSImport("ipfs-http-server/dist/src/api/resources/object", "patchRmLink.options_18.validate_9.options_19.allowUnknown_9")
        @js.native
        val allowUnknown9: Boolean = js.native
        
        @JSImport("ipfs-http-server/dist/src/api/resources/object", "patchRmLink.options_18.validate_9.options_19.stripUnknown_9")
        @js.native
        val stripUnknown9: Boolean = js.native
      }
      
      @JSImport("ipfs-http-server/dist/src/api/resources/object", "patchRmLink.options_18.validate_9.query_9")
      @js.native
      val query9: js.Any = js.native
    }
  }
}
