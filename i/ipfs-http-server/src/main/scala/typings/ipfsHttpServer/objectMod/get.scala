package typings.ipfsHttpServer.objectMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object get {
  
  @JSImport("ipfs-http-server/dist/src/api/resources/object", "get.handler")
  @js.native
  def handler(request: js.Any, h: js.Any): js.Promise[_] = js.native
  
  object options2 {
    
    object validate1 {
      
      object options3 {
        
        @JSImport("ipfs-http-server/dist/src/api/resources/object", "get.options_2.validate_1.options_3.allowUnknown_1")
        @js.native
        val allowUnknown1: Boolean = js.native
        
        @JSImport("ipfs-http-server/dist/src/api/resources/object", "get.options_2.validate_1.options_3.stripUnknown_1")
        @js.native
        val stripUnknown1: Boolean = js.native
      }
      
      @JSImport("ipfs-http-server/dist/src/api/resources/object", "get.options_2.validate_1.query_1")
      @js.native
      val query1: js.Any = js.native
    }
  }
}
