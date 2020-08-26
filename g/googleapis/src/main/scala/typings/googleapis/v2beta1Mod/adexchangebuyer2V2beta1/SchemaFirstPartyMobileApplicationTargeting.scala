package typings.googleapis.v2beta1Mod.adexchangebuyer2V2beta1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Represents a list of targeted and excluded mobile application IDs that
  * publishers own. Mobile application IDs are from App Store and Google Play
  * Store. Android App ID, for example, com.google.android.apps.maps, can be
  * found in Google Play Store URL. iOS App ID (which is a number) can be found
  * at the end of iTunes store URL. First party mobile applications is either
  * included or excluded.
  */
@js.native
trait SchemaFirstPartyMobileApplicationTargeting extends js.Object {
  /**
    * A list of application IDs to be excluded.
    */
  var excludedAppIds: js.UndefOr[js.Array[String]] = js.native
  /**
    * A list of application IDs to be included.
    */
  var targetedAppIds: js.UndefOr[js.Array[String]] = js.native
}

object SchemaFirstPartyMobileApplicationTargeting {
  @scala.inline
  def apply(): SchemaFirstPartyMobileApplicationTargeting = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaFirstPartyMobileApplicationTargeting]
  }
  @scala.inline
  implicit class SchemaFirstPartyMobileApplicationTargetingOps[Self <: SchemaFirstPartyMobileApplicationTargeting] (val x: Self) extends AnyVal {
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
    def setExcludedAppIdsVarargs(value: String*): Self = this.set("excludedAppIds", js.Array(value :_*))
    @scala.inline
    def setExcludedAppIds(value: js.Array[String]): Self = this.set("excludedAppIds", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteExcludedAppIds: Self = this.set("excludedAppIds", js.undefined)
    @scala.inline
    def setTargetedAppIdsVarargs(value: String*): Self = this.set("targetedAppIds", js.Array(value :_*))
    @scala.inline
    def setTargetedAppIds(value: js.Array[String]): Self = this.set("targetedAppIds", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTargetedAppIds: Self = this.set("targetedAppIds", js.undefined)
  }
  
}

