package typings.googleapis.v2beta1Mod.adexchangebuyer2V2beta1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Represents the size of an ad unit that can be targeted on an ad request. It
  * only applies to Private Auction, AdX Preferred Deals and Auction Packages.
  * This targeting does not apply to Programmatic Guaranteed and Preferred
  * Deals in Ad Manager.
  */
@js.native
trait SchemaInventorySizeTargeting extends js.Object {
  
  /**
    * A list of inventory sizes to be excluded.
    */
  var excludedInventorySizes: js.UndefOr[js.Array[SchemaAdSize]] = js.native
  
  /**
    * A list of inventory sizes to be included.
    */
  var targetedInventorySizes: js.UndefOr[js.Array[SchemaAdSize]] = js.native
}
object SchemaInventorySizeTargeting {
  
  @scala.inline
  def apply(): SchemaInventorySizeTargeting = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaInventorySizeTargeting]
  }
  
  @scala.inline
  implicit class SchemaInventorySizeTargetingOps[Self <: SchemaInventorySizeTargeting] (val x: Self) extends AnyVal {
    
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
    def setExcludedInventorySizesVarargs(value: SchemaAdSize*): Self = this.set("excludedInventorySizes", js.Array(value :_*))
    
    @scala.inline
    def setExcludedInventorySizes(value: js.Array[SchemaAdSize]): Self = this.set("excludedInventorySizes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteExcludedInventorySizes: Self = this.set("excludedInventorySizes", js.undefined)
    
    @scala.inline
    def setTargetedInventorySizesVarargs(value: SchemaAdSize*): Self = this.set("targetedInventorySizes", js.Array(value :_*))
    
    @scala.inline
    def setTargetedInventorySizes(value: js.Array[SchemaAdSize]): Self = this.set("targetedInventorySizes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTargetedInventorySizes: Self = this.set("targetedInventorySizes", js.undefined)
  }
}
