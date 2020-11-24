package typings.maximMazurokGapiClientAndroidmanagement.gapi.client.androidmanagement

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BlockAction extends js.Object {
  
  /** Number of days the policy is non-compliant before the device or work profile is blocked. To block access immediately, set to 0. blockAfterDays must be less than wipeAfterDays. */
  var blockAfterDays: js.UndefOr[Double] = js.native
  
  /** Specifies the scope of this BlockAction. Only applicable to devices that are company-owned. */
  var blockScope: js.UndefOr[String] = js.native
}
object BlockAction {
  
  @scala.inline
  def apply(): BlockAction = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BlockAction]
  }
  
  @scala.inline
  implicit class BlockActionOps[Self <: BlockAction] (val x: Self) extends AnyVal {
    
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
    def setBlockAfterDays(value: Double): Self = this.set("blockAfterDays", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBlockAfterDays: Self = this.set("blockAfterDays", js.undefined)
    
    @scala.inline
    def setBlockScope(value: String): Self = this.set("blockScope", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBlockScope: Self = this.set("blockScope", js.undefined)
  }
}
