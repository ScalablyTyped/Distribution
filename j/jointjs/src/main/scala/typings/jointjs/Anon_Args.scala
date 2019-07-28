package typings.jointjs

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Args extends js.Object {
  var args: js.UndefOr[StringDictionary[js.Any]] = js.undefined
  var name: js.UndefOr[String] = js.undefined
}

object Anon_Args {
  @scala.inline
  def apply(args: StringDictionary[js.Any] = null, name: String = null): Anon_Args = {
    val __obj = js.Dynamic.literal()
    if (args != null) __obj.updateDynamic("args")(args)
    if (name != null) __obj.updateDynamic("name")(name)
    __obj.asInstanceOf[Anon_Args]
  }
}

