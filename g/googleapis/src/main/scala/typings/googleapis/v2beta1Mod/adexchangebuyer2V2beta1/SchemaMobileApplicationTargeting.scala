package typings.googleapis.v2beta1Mod.adexchangebuyer2V2beta1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Mobile application targeting settings.
  */
@js.native
trait SchemaMobileApplicationTargeting extends js.Object {
  /**
    * Publisher owned apps to be targeted or excluded by the publisher to
    * display the ads in.
    */
  var firstPartyTargeting: js.UndefOr[SchemaFirstPartyMobileApplicationTargeting] = js.native
}

object SchemaMobileApplicationTargeting {
  @scala.inline
  def apply(): SchemaMobileApplicationTargeting = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaMobileApplicationTargeting]
  }
  @scala.inline
  implicit class SchemaMobileApplicationTargetingOps[Self <: SchemaMobileApplicationTargeting] (val x: Self) extends AnyVal {
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
    def setFirstPartyTargeting(value: SchemaFirstPartyMobileApplicationTargeting): Self = this.set("firstPartyTargeting", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFirstPartyTargeting: Self = this.set("firstPartyTargeting", js.undefined)
  }
  
}

