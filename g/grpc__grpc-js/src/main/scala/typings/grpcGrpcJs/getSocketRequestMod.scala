package typings.grpcGrpcJs

import typings.grpcProtoLoader.mod.Long
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object getSocketRequestMod {
  
  trait GetSocketRequest extends StObject {
    
    /**
      * socket_id is the identifier of the specific socket to get.
      */
    var socket_id: js.UndefOr[Double | String | Long] = js.undefined
    
    /**
      * If true, the response will contain only high level information
      * that is inexpensive to obtain. Fields thay may be omitted are
      * documented.
      */
    var summary: js.UndefOr[Boolean] = js.undefined
  }
  object GetSocketRequest {
    
    inline def apply(): GetSocketRequest = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[GetSocketRequest]
    }
    
    extension [Self <: GetSocketRequest](x: Self) {
      
      inline def setSocket_id(value: Double | String | Long): Self = StObject.set(x, "socket_id", value.asInstanceOf[js.Any])
      
      inline def setSocket_idUndefined: Self = StObject.set(x, "socket_id", js.undefined)
      
      inline def setSummary(value: Boolean): Self = StObject.set(x, "summary", value.asInstanceOf[js.Any])
      
      inline def setSummaryUndefined: Self = StObject.set(x, "summary", js.undefined)
    }
  }
  
  trait GetSocketRequestOutput extends StObject {
    
    /**
      * socket_id is the identifier of the specific socket to get.
      */
    var socket_id: String
    
    /**
      * If true, the response will contain only high level information
      * that is inexpensive to obtain. Fields thay may be omitted are
      * documented.
      */
    var summary: Boolean
  }
  object GetSocketRequestOutput {
    
    inline def apply(socket_id: String, summary: Boolean): GetSocketRequestOutput = {
      val __obj = js.Dynamic.literal(socket_id = socket_id.asInstanceOf[js.Any], summary = summary.asInstanceOf[js.Any])
      __obj.asInstanceOf[GetSocketRequestOutput]
    }
    
    extension [Self <: GetSocketRequestOutput](x: Self) {
      
      inline def setSocket_id(value: String): Self = StObject.set(x, "socket_id", value.asInstanceOf[js.Any])
      
      inline def setSummary(value: Boolean): Self = StObject.set(x, "summary", value.asInstanceOf[js.Any])
    }
  }
}
