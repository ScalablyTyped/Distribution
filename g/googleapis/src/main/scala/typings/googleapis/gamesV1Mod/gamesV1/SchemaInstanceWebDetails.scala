package typings.googleapis.gamesV1Mod.gamesV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * This is a JSON template for the Web details resource.
  */
@js.native
trait SchemaInstanceWebDetails extends js.Object {
  /**
    * Uniquely identifies the type of this resource. Value is always the fixed
    * string games#instanceWebDetails.
    */
  var kind: js.UndefOr[String] = js.native
  /**
    * Launch URL for the game.
    */
  var launchUrl: js.UndefOr[String] = js.native
  /**
    * Indicates that this instance is the default for new installations.
    */
  var preferred: js.UndefOr[Boolean] = js.native
}

object SchemaInstanceWebDetails {
  @scala.inline
  def apply(): SchemaInstanceWebDetails = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaInstanceWebDetails]
  }
  @scala.inline
  implicit class SchemaInstanceWebDetailsOps[Self <: SchemaInstanceWebDetails] (val x: Self) extends AnyVal {
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
    def setKind(value: String): Self = this.set("kind", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteKind: Self = this.set("kind", js.undefined)
    @scala.inline
    def setLaunchUrl(value: String): Self = this.set("launchUrl", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLaunchUrl: Self = this.set("launchUrl", js.undefined)
    @scala.inline
    def setPreferred(value: Boolean): Self = this.set("preferred", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePreferred: Self = this.set("preferred", js.undefined)
  }
  
}

