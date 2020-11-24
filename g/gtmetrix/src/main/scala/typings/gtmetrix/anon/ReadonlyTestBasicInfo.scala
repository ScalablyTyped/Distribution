package typings.gtmetrix.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Readonly<gtmetrix.gtmetrix.TestBasicInfo> */
@js.native
trait ReadonlyTestBasicInfo extends js.Object {
  
  val credits_left: Double = js.native
  
  val poll_state_url: String = js.native
  
  val test_id: String = js.native
}
object ReadonlyTestBasicInfo {
  
  @scala.inline
  def apply(credits_left: Double, poll_state_url: String, test_id: String): ReadonlyTestBasicInfo = {
    val __obj = js.Dynamic.literal(credits_left = credits_left.asInstanceOf[js.Any], poll_state_url = poll_state_url.asInstanceOf[js.Any], test_id = test_id.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReadonlyTestBasicInfo]
  }
  
  @scala.inline
  implicit class ReadonlyTestBasicInfoOps[Self <: ReadonlyTestBasicInfo] (val x: Self) extends AnyVal {
    
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
    def setCredits_left(value: Double): Self = this.set("credits_left", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPoll_state_url(value: String): Self = this.set("poll_state_url", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTest_id(value: String): Self = this.set("test_id", value.asInstanceOf[js.Any])
  }
}
