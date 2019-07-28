package typings.igniteDashUi

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IgButtonLink
  extends /**
	 * Option for IgButtonLink
	 */
/* optionName */ StringDictionary[js.Any] {
  var href: js.UndefOr[js.Any] = js.undefined
  var target: js.UndefOr[js.Any] = js.undefined
  var title: js.UndefOr[js.Any] = js.undefined
}

object IgButtonLink {
  @scala.inline
  def apply(
    StringDictionary: /**
  	 * Option for IgButtonLink
  	 */
  /* optionName */ StringDictionary[js.Any] = null,
    href: js.Any = null,
    target: js.Any = null,
    title: js.Any = null
  ): IgButtonLink = {
    val __obj = js.Dynamic.literal()
    js.Dynamic.global.Object.assign(__obj, StringDictionary)
    if (href != null) __obj.updateDynamic("href")(href)
    if (target != null) __obj.updateDynamic("target")(target)
    if (title != null) __obj.updateDynamic("title")(title)
    __obj.asInstanceOf[IgButtonLink]
  }
}

