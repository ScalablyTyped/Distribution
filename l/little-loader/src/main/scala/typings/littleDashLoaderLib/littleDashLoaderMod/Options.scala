package typings
package littleDashLoaderLib.littleDashLoaderMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Options extends js.Object {
  var callback: js.UndefOr[js.ThisFunction1[/* this */ js.Any, /* err */ java.lang.String, scala.Unit]] = js.undefined
  var context: js.UndefOr[js.Any] = js.undefined
  var setup: js.UndefOr[js.ThisFunction1[/* this */ js.Any, /* script */ js.Any, scala.Unit]] = js.undefined
}

object Options {
  @scala.inline
  def apply(
    callback: js.ThisFunction1[/* this */ js.Any, /* err */ java.lang.String, scala.Unit] = null,
    context: js.Any = null,
    setup: js.ThisFunction1[/* this */ js.Any, /* script */ js.Any, scala.Unit] = null
  ): Options = {
    val __obj = js.Dynamic.literal()
    if (callback != null) __obj.updateDynamic("callback")(callback)
    if (context != null) __obj.updateDynamic("context")(context)
    if (setup != null) __obj.updateDynamic("setup")(setup)
    __obj.asInstanceOf[Options]
  }
}

