package typings.instagramPrivateApi

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object statusResponseMod {
  
  @js.native
  trait StatusResponse extends StObject {
    
    var status: String = js.native
  }
  object StatusResponse {
    
    @scala.inline
    def apply(status: String): StatusResponse = {
      val __obj = js.Dynamic.literal(status = status.asInstanceOf[js.Any])
      __obj.asInstanceOf[StatusResponse]
    }
    
    @scala.inline
    implicit class StatusResponseMutableBuilder[Self <: StatusResponse] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setStatus(value: String): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    }
  }
}
