package typings
package jointjsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Args extends js.Object {
  var args: js.UndefOr[org.scalablytyped.runtime.StringDictionary[js.Any]] = js.undefined
  var name: js.UndefOr[java.lang.String] = js.undefined
}

object Anon_Args {
  @scala.inline
  def apply(args: org.scalablytyped.runtime.StringDictionary[js.Any] = null, name: java.lang.String = null): Anon_Args = {
    val __obj = js.Dynamic.literal()
    if (args != null) __obj.updateDynamic("args")(args)
    if (name != null) __obj.updateDynamic("name")(name)
    __obj.asInstanceOf[Anon_Args]
  }
}

