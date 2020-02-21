package typings.hapiJoi.mod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AddRuleOptions extends js.Object {
  var args: js.UndefOr[StringDictionary[js.Any]] = js.undefined
  var name: String
}

object AddRuleOptions {
  @scala.inline
  def apply(name: String, args: StringDictionary[js.Any] = null): AddRuleOptions = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    if (args != null) __obj.updateDynamic("args")(args.asInstanceOf[js.Any])
    __obj.asInstanceOf[AddRuleOptions]
  }
}

