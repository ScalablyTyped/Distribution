package typings.maximMazurokGapiClientAndroidmanagement.gapi.client.androidmanagement

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SecurityPosture extends js.Object {
  
  /** Device's security posture value. */
  var devicePosture: js.UndefOr[String] = js.native
  
  /** Additional details regarding the security posture of the device. */
  var postureDetails: js.UndefOr[js.Array[PostureDetail]] = js.native
}
object SecurityPosture {
  
  @scala.inline
  def apply(): SecurityPosture = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SecurityPosture]
  }
  
  @scala.inline
  implicit class SecurityPostureOps[Self <: SecurityPosture] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setDevicePosture(value: String): Self = this.set("devicePosture", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDevicePosture: Self = this.set("devicePosture", js.undefined)
    
    @scala.inline
    def setPostureDetailsVarargs(value: PostureDetail*): Self = this.set("postureDetails", js.Array(value :_*))
    
    @scala.inline
    def setPostureDetails(value: js.Array[PostureDetail]): Self = this.set("postureDetails", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePostureDetails: Self = this.set("postureDetails", js.undefined)
  }
}
