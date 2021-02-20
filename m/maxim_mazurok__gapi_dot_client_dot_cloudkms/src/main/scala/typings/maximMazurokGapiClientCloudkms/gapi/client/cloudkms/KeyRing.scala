package typings.maximMazurokGapiClientCloudkms.gapi.client.cloudkms

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait KeyRing extends StObject {
  
  /** Output only. The time at which this KeyRing was created. */
  var createTime: js.UndefOr[String] = js.native
  
  /** Output only. The resource name for the KeyRing in the format `projects/∗/locations/∗/keyRings/ *`. */
  var name: js.UndefOr[String] = js.native
}
object KeyRing {
  
  @scala.inline
  def apply(): KeyRing = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[KeyRing]
  }
  
  @scala.inline
  implicit class KeyRingMutableBuilder[Self <: KeyRing] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCreateTime(value: String): Self = StObject.set(x, "createTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCreateTimeUndefined: Self = StObject.set(x, "createTime", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
  }
}
