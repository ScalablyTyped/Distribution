package typings.googleapis.contentV2Mod.contentV2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SchemaAccountStatusExampleItem extends js.Object {
  var itemId: js.UndefOr[String] = js.native
  var link: js.UndefOr[String] = js.native
  var submittedValue: js.UndefOr[String] = js.native
  var title: js.UndefOr[String] = js.native
  var valueOnLandingPage: js.UndefOr[String] = js.native
}

object SchemaAccountStatusExampleItem {
  @scala.inline
  def apply(
    itemId: String = null,
    link: String = null,
    submittedValue: String = null,
    title: String = null,
    valueOnLandingPage: String = null
  ): SchemaAccountStatusExampleItem = {
    val __obj = js.Dynamic.literal()
    if (itemId != null) __obj.updateDynamic("itemId")(itemId.asInstanceOf[js.Any])
    if (link != null) __obj.updateDynamic("link")(link.asInstanceOf[js.Any])
    if (submittedValue != null) __obj.updateDynamic("submittedValue")(submittedValue.asInstanceOf[js.Any])
    if (title != null) __obj.updateDynamic("title")(title.asInstanceOf[js.Any])
    if (valueOnLandingPage != null) __obj.updateDynamic("valueOnLandingPage")(valueOnLandingPage.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaAccountStatusExampleItem]
  }
}

