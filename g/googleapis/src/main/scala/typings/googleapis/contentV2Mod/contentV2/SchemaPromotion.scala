package typings.googleapis.contentV2Mod.contentV2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SchemaPromotion extends js.Object {
  
  /**
    * [required] Amount of the promotion. The values here are the promotion
    * applied to the unit price pretax and to the total of the tax amounts.
    */
  var promotionAmount: js.UndefOr[SchemaAmount] = js.native
  
  /**
    * [required] ID of the promotion.
    */
  var promotionId: js.UndefOr[String] = js.native
}
object SchemaPromotion {
  
  @scala.inline
  def apply(): SchemaPromotion = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaPromotion]
  }
  
  @scala.inline
  implicit class SchemaPromotionOps[Self <: SchemaPromotion] (val x: Self) extends AnyVal {
    
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
    def setPromotionAmount(value: SchemaAmount): Self = this.set("promotionAmount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePromotionAmount: Self = this.set("promotionAmount", js.undefined)
    
    @scala.inline
    def setPromotionId(value: String): Self = this.set("promotionId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePromotionId: Self = this.set("promotionId", js.undefined)
  }
}
