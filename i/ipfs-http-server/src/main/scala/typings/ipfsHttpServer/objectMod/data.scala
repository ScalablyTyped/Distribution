package typings.ipfsHttpServer.objectMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object data {
  
  @JSImport("ipfs-http-server/dist/src/api/resources/object", "data")
  @js.native
  val ^ : js.Any = js.native
  
  inline def handler(request: js.Any, h: js.Any): js.Promise[js.Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("handler")(request.asInstanceOf[js.Any], h.asInstanceOf[js.Any])).asInstanceOf[js.Promise[js.Any]]
  
  object options8 {
    
    object validate4 {
      
      object options9 {
        
        @JSImport("ipfs-http-server/dist/src/api/resources/object", "data.options_8.validate_4.options_9.allowUnknown_4")
        @js.native
        val allowUnknown4: Boolean = js.native
        
        @JSImport("ipfs-http-server/dist/src/api/resources/object", "data.options_8.validate_4.options_9.stripUnknown_4")
        @js.native
        val stripUnknown4: Boolean = js.native
      }
      
      @JSImport("ipfs-http-server/dist/src/api/resources/object", "data.options_8.validate_4.query_4")
      @js.native
      val query4: js.Any = js.native
    }
  }
}
