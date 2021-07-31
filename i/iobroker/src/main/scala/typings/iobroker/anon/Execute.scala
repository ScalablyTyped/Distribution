package typings.iobroker.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Execute extends StObject {
  
  var execute: Boolean
  
  var http: Boolean
  
  var sendto: Boolean
}
object Execute {
  
  @scala.inline
  def apply(execute: Boolean, http: Boolean, sendto: Boolean): Execute = {
    val __obj = js.Dynamic.literal(execute = execute.asInstanceOf[js.Any], http = http.asInstanceOf[js.Any], sendto = sendto.asInstanceOf[js.Any])
    __obj.asInstanceOf[Execute]
  }
  
  @scala.inline
  implicit class ExecuteMutableBuilder[Self <: Execute] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setExecute(value: Boolean): Self = StObject.set(x, "execute", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHttp(value: Boolean): Self = StObject.set(x, "http", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSendto(value: Boolean): Self = StObject.set(x, "sendto", value.asInstanceOf[js.Any])
  }
}
