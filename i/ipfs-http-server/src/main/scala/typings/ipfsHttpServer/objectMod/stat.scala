package typings.ipfsHttpServer.objectMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object stat {
  
  @JSImport("ipfs-http-server/dist/src/api/resources/object", "stat.handler")
  @js.native
  def handler(request: js.Any, h: js.Any): js.Promise[_] = js.native
  
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
