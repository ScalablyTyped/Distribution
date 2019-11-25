package typings.atHapiJoi

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Global extends js.Object {
  /**
    * references to the globally provided context preference.
    *
    * @default '$'
    */
  var global: js.UndefOr[String] = js.undefined
  /**
    * references to error-specific or rule specific context.
    *
    * @default '#'
    */
  var local: js.UndefOr[String] = js.undefined
  /**
    * references to the root value being validated.
    *
    * @default '/'
    */
  var root: js.UndefOr[String] = js.undefined
}

object Anon_Global {
  @scala.inline
  def apply(global: String = null, local: String = null, root: String = null): Anon_Global = {
    val __obj = js.Dynamic.literal()
    if (global != null) __obj.updateDynamic("global")(global.asInstanceOf[js.Any])
    if (local != null) __obj.updateDynamic("local")(local.asInstanceOf[js.Any])
    if (root != null) __obj.updateDynamic("root")(root.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_Global]
  }
}

