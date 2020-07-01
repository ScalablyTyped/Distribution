package typings.googleapis.peopleV1Mod.peopleV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A Google Apps Domain membership.
  */
@js.native
trait SchemaDomainMembership extends js.Object {
  /**
    * True if the person is in the viewer&#39;s Google Apps domain.
    */
  var inViewerDomain: js.UndefOr[Boolean] = js.native
}

object SchemaDomainMembership {
  @scala.inline
  def apply(inViewerDomain: js.UndefOr[Boolean] = js.undefined): SchemaDomainMembership = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(inViewerDomain)) __obj.updateDynamic("inViewerDomain")(inViewerDomain.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaDomainMembership]
  }
}

