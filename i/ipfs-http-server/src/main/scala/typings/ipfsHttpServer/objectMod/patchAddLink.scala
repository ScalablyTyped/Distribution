package typings.ipfsHttpServer.objectMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object patchAddLink {
  
  @JSImport("ipfs-http-server/dist/src/api/resources/object", "patchAddLink")
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def handler(request: js.Any, h: js.Any): js.Promise[js.Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("handler")(request.asInstanceOf[js.Any], h.asInstanceOf[js.Any])).asInstanceOf[js.Promise[js.Any]]
  
  object options16 {
    
    object validate8 {
      
      object options17 {
        
        @JSImport("ipfs-http-server/dist/src/api/resources/object", "patchAddLink.options_16.validate_8.options_17.allowUnknown_8")
        @js.native
        val allowUnknown8: Boolean = js.native
        
        @JSImport("ipfs-http-server/dist/src/api/resources/object", "patchAddLink.options_16.validate_8.options_17.stripUnknown_8")
        @js.native
        val stripUnknown8: Boolean = js.native
      }
      
      @JSImport("ipfs-http-server/dist/src/api/resources/object", "patchAddLink.options_16.validate_8.query_8")
      @js.native
      val query8: js.Any = js.native
    }
  }
}
