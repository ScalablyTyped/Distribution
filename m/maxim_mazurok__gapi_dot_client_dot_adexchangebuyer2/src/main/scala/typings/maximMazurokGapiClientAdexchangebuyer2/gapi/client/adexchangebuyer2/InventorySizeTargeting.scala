package typings.maximMazurokGapiClientAdexchangebuyer2.gapi.client.adexchangebuyer2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait InventorySizeTargeting extends js.Object {
  
  /** A list of inventory sizes to be excluded. */
  var excludedInventorySizes: js.UndefOr[js.Array[AdSize]] = js.native
  
  /** A list of inventory sizes to be included. */
  var targetedInventorySizes: js.UndefOr[js.Array[AdSize]] = js.native
}
object InventorySizeTargeting {
  
  @scala.inline
  def apply(): InventorySizeTargeting = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[InventorySizeTargeting]
  }
  
  @scala.inline
  implicit class InventorySizeTargetingOps[Self <: InventorySizeTargeting] (val x: Self) extends AnyVal {
    
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
    def setExcludedInventorySizesVarargs(value: AdSize*): Self = this.set("excludedInventorySizes", js.Array(value :_*))
    
    @scala.inline
    def setExcludedInventorySizes(value: js.Array[AdSize]): Self = this.set("excludedInventorySizes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteExcludedInventorySizes: Self = this.set("excludedInventorySizes", js.undefined)
    
    @scala.inline
    def setTargetedInventorySizesVarargs(value: AdSize*): Self = this.set("targetedInventorySizes", js.Array(value :_*))
    
    @scala.inline
    def setTargetedInventorySizes(value: js.Array[AdSize]): Self = this.set("targetedInventorySizes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTargetedInventorySizes: Self = this.set("targetedInventorySizes", js.undefined)
  }
}
