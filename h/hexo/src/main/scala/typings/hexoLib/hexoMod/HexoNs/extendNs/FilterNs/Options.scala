package typings
package hexoLib.hexoMod.HexoNs.extendNs.FilterNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Options extends js.Object {
  /**
    * Arguments. This must be an array.
    */
  var args: js.UndefOr[js.Array[_]] = js.undefined
  /**
    * `hexo` object.
    */
  var context: js.UndefOr[hexoLib.hexoMod.Hexo] = js.undefined
}

object Options {
  @scala.inline
  def apply(args: js.Array[_] = null, context: hexoLib.hexoMod.Hexo = null): Options = {
    val __obj = js.Dynamic.literal()
    if (args != null) __obj.updateDynamic("args")(args)
    if (context != null) __obj.updateDynamic("context")(context)
    __obj.asInstanceOf[Options]
  }
}

