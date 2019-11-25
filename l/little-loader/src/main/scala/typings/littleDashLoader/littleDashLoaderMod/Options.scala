package typings.littleDashLoader.littleDashLoaderMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Options extends js.Object {
  var callback: js.UndefOr[js.ThisFunction1[/* this */ js.Any, /* err */ String, Unit]] = js.undefined
  var context: js.UndefOr[js.Any] = js.undefined
  var setup: js.UndefOr[js.ThisFunction1[/* this */ js.Any, /* script */ js.Any, Unit]] = js.undefined
}

object Options {
  @scala.inline
  def apply(
    callback: js.ThisFunction1[/* this */ js.Any, /* err */ String, Unit] = null,
    context: js.Any = null,
    setup: js.ThisFunction1[/* this */ js.Any, /* script */ js.Any, Unit] = null
  ): Options = {
    val __obj = js.Dynamic.literal()
    if (callback != null) __obj.updateDynamic("callback")(callback.asInstanceOf[js.Any])
    if (context != null) __obj.updateDynamic("context")(context.asInstanceOf[js.Any])
    if (setup != null) __obj.updateDynamic("setup")(setup.asInstanceOf[js.Any])
    __obj.asInstanceOf[Options]
  }
}

