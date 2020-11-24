package typings.maximMazurokGapiClientDataflow.gapi.client.dataflow

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait HotKeyDetection extends js.Object {
  
  /** The age of the hot key measured from when it was first detected. */
  var hotKeyAge: js.UndefOr[String] = js.native
  
  /** System-defined name of the step containing this hot key. Unique across the workflow. */
  var systemName: js.UndefOr[String] = js.native
  
  /** User-provided name of the step that contains this hot key. */
  var userStepName: js.UndefOr[String] = js.native
}
object HotKeyDetection {
  
  @scala.inline
  def apply(): HotKeyDetection = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[HotKeyDetection]
  }
  
  @scala.inline
  implicit class HotKeyDetectionOps[Self <: HotKeyDetection] (val x: Self) extends AnyVal {
    
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
    def setHotKeyAge(value: String): Self = this.set("hotKeyAge", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHotKeyAge: Self = this.set("hotKeyAge", js.undefined)
    
    @scala.inline
    def setSystemName(value: String): Self = this.set("systemName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSystemName: Self = this.set("systemName", js.undefined)
    
    @scala.inline
    def setUserStepName(value: String): Self = this.set("userStepName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUserStepName: Self = this.set("userStepName", js.undefined)
  }
}
