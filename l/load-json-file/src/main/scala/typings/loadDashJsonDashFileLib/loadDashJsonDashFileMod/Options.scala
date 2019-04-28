package typings
package loadDashJsonDashFileLib.loadDashJsonDashFileMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Options extends js.Object {
  /**
  		Applies a function to the JSON string before parsing.
  		*/
  val beforeParse: js.UndefOr[BeforeParse] = js.undefined
  /**
  		Prescribes how the value originally produced by parsing is transformed, before being returned.
  		See the [`JSON.parse` docs](https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Global_Objects/JSON/parse#Using_the_reviver_parameter) for more.
  		*/
  val reviver: js.UndefOr[Reviver] = js.undefined
}

object Options {
  @scala.inline
  def apply(beforeParse: BeforeParse = null, reviver: Reviver = null): Options = {
    val __obj = js.Dynamic.literal()
    if (beforeParse != null) __obj.updateDynamic("beforeParse")(beforeParse)
    if (reviver != null) __obj.updateDynamic("reviver")(reviver)
    __obj.asInstanceOf[Options]
  }
}

