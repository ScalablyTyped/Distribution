package typings.mailgen.mailgenMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ContentBody extends js.Object {
  var action: js.UndefOr[Action | js.Array[Action]] = js.undefined
  var dictionary: js.UndefOr[js.Any] = js.undefined
  var goToAction: js.UndefOr[GoToAction] = js.undefined
  var greeting: js.UndefOr[String] = js.undefined
  var intro: js.UndefOr[String | js.Array[String]] = js.undefined
  var name: js.UndefOr[String] = js.undefined
  var outro: js.UndefOr[String | js.Array[String]] = js.undefined
  var signature: js.UndefOr[String] = js.undefined
  var table: js.UndefOr[Table] = js.undefined
  var title: js.UndefOr[String] = js.undefined
}

object ContentBody {
  @scala.inline
  def apply(
    action: Action | js.Array[Action] = null,
    dictionary: js.Any = null,
    goToAction: GoToAction = null,
    greeting: String = null,
    intro: String | js.Array[String] = null,
    name: String = null,
    outro: String | js.Array[String] = null,
    signature: String = null,
    table: Table = null,
    title: String = null
  ): ContentBody = {
    val __obj = js.Dynamic.literal()
    if (action != null) __obj.updateDynamic("action")(action.asInstanceOf[js.Any])
    if (dictionary != null) __obj.updateDynamic("dictionary")(dictionary)
    if (goToAction != null) __obj.updateDynamic("goToAction")(goToAction)
    if (greeting != null) __obj.updateDynamic("greeting")(greeting)
    if (intro != null) __obj.updateDynamic("intro")(intro.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name)
    if (outro != null) __obj.updateDynamic("outro")(outro.asInstanceOf[js.Any])
    if (signature != null) __obj.updateDynamic("signature")(signature)
    if (table != null) __obj.updateDynamic("table")(table)
    if (title != null) __obj.updateDynamic("title")(title)
    __obj.asInstanceOf[ContentBody]
  }
}

