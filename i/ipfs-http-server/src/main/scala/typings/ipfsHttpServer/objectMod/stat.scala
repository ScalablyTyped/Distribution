package typings.ipfsHttpServer.objectMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object stat {
  
  @JSImport("ipfs-http-server/dist/src/api/resources/object", "stat")
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def handler(request: js.Any, h: js.Any): js.Promise[js.Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("handler")(request.asInstanceOf[js.Any], h.asInstanceOf[js.Any])).asInstanceOf[js.Promise[js.Any]]
  
  object options6 {
    
    object validate3 {
      
      object options7 {
        
        @JSImport("ipfs-http-server/dist/src/api/resources/object", "stat.options_6.validate_3.options_7.allowUnknown_3")
        @js.native
        val allowUnknown3: Boolean = js.native
        
        @JSImport("ipfs-http-server/dist/src/api/resources/object", "stat.options_6.validate_3.options_7.stripUnknown_3")
        @js.native
        val stripUnknown3: Boolean = js.native
      }
      
      @JSImport("ipfs-http-server/dist/src/api/resources/object", "stat.options_6.validate_3.query_3")
      @js.native
      val query3: js.Any = js.native
    }
  }
}
