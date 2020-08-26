package typings.googleapis.v2beta1Mod.adexchangebuyer2V2beta1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Represents targeting about where the ads can appear, e.g., certain sites or
  * mobile applications. Different placement targeting types will be logically
  * OR&#39;ed.
  */
@js.native
trait SchemaPlacementTargeting extends js.Object {
  /**
    * Mobile application targeting information in a deal. This doesn&#39;t
    * apply to Auction Packages.
    */
  var mobileApplicationTargeting: js.UndefOr[SchemaMobileApplicationTargeting] = js.native
  /**
    * URLs to be included/excluded.
    */
  var urlTargeting: js.UndefOr[SchemaUrlTargeting] = js.native
}

object SchemaPlacementTargeting {
  @scala.inline
  def apply(): SchemaPlacementTargeting = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaPlacementTargeting]
  }
  @scala.inline
  implicit class SchemaPlacementTargetingOps[Self <: SchemaPlacementTargeting] (val x: Self) extends AnyVal {
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
    def setMobileApplicationTargeting(value: SchemaMobileApplicationTargeting): Self = this.set("mobileApplicationTargeting", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMobileApplicationTargeting: Self = this.set("mobileApplicationTargeting", js.undefined)
    @scala.inline
    def setUrlTargeting(value: SchemaUrlTargeting): Self = this.set("urlTargeting", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUrlTargeting: Self = this.set("urlTargeting", js.undefined)
  }
  
}

