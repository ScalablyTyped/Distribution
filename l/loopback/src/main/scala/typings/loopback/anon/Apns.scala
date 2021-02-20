package typings.loopback.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Apns extends StObject {
  
  var apns: CerData = js.native
  
  var gcm: ServerApiKey = js.native
}
object Apns {
  
  @scala.inline
  def apply(apns: CerData, gcm: ServerApiKey): Apns = {
    val __obj = js.Dynamic.literal(apns = apns.asInstanceOf[js.Any], gcm = gcm.asInstanceOf[js.Any])
    __obj.asInstanceOf[Apns]
  }
  
  @scala.inline
  implicit class ApnsMutableBuilder[Self <: Apns] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setApns(value: CerData): Self = StObject.set(x, "apns", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGcm(value: ServerApiKey): Self = StObject.set(x, "gcm", value.asInstanceOf[js.Any])
  }
}
