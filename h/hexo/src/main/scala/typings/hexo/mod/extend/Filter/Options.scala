package typings.hexo.mod.extend.Filter

import typings.hexo.mod.Hexo
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
  var context: js.UndefOr[Hexo] = js.undefined
}

object Options {
  @scala.inline
  def apply(args: js.Array[_] = null, context: Hexo = null): Options = {
    val __obj = js.Dynamic.literal()
    if (args != null) __obj.updateDynamic("args")(args.asInstanceOf[js.Any])
    if (context != null) __obj.updateDynamic("context")(context.asInstanceOf[js.Any])
    __obj.asInstanceOf[Options]
  }
}

