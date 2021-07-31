package typings.ipfsHttpServer.objectMod

import typings.ipfsHttpServer.anon.AssignStringMethod
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object put {
  
  @JSImport("ipfs-http-server/dist/src/api/resources/object", "put")
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def handler(request: js.Any, h: js.Any): js.Promise[js.Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("handler")(request.asInstanceOf[js.Any], h.asInstanceOf[js.Any])).asInstanceOf[js.Promise[js.Any]]
  
  object options4 {
    
    object payload {
      
      @JSImport("ipfs-http-server/dist/src/api/resources/object", "put.options_4.payload.output")
      @js.native
      val output: String = js.native
      
      @JSImport("ipfs-http-server/dist/src/api/resources/object", "put.options_4.payload.parse")
      @js.native
      val parse: Boolean = js.native
    }
    
    @JSImport("ipfs-http-server/dist/src/api/resources/object", "put.options_4.pre")
    @js.native
    val pre: js.Array[AssignStringMethod] = js.native
    
    object validate2 {
      
      object options5 {
        
        @JSImport("ipfs-http-server/dist/src/api/resources/object", "put.options_4.validate_2.options_5.allowUnknown_2")
        @js.native
        val allowUnknown2: Boolean = js.native
        
        @JSImport("ipfs-http-server/dist/src/api/resources/object", "put.options_4.validate_2.options_5.stripUnknown_2")
        @js.native
        val stripUnknown2: Boolean = js.native
      }
      
      @JSImport("ipfs-http-server/dist/src/api/resources/object", "put.options_4.validate_2.query_2")
      @js.native
      val query2: js.Any = js.native
    }
  }
}
