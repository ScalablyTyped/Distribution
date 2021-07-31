package typings.hapi.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Payload extends StObject {
  
  /**
    * if true, requires payload validation as part of the scheme and forbids routes from disabling payload auth validation. Defaults to false.
    */
  var payload: js.UndefOr[Boolean] = js.undefined
}
object Payload {
  
  @scala.inline
  def apply(): Payload = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Payload]
  }
  
  @scala.inline
  implicit class PayloadMutableBuilder[Self <: Payload] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setPayload(value: Boolean): Self = StObject.set(x, "payload", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPayloadUndefined: Self = StObject.set(x, "payload", js.undefined)
  }
}
