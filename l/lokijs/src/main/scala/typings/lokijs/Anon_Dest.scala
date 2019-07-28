package typings.lokijs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Dest extends js.Object {
  var inflate: js.UndefOr[js.Function2[/* src */ js.Object, /* dest */ js.UndefOr[js.Object], Unit]] = js.undefined
  var proto: js.UndefOr[js.Any] = js.undefined
}

object Anon_Dest {
  @scala.inline
  def apply(
    inflate: (/* src */ js.Object, /* dest */ js.UndefOr[js.Object]) => Unit = null,
    proto: js.Any = null
  ): Anon_Dest = {
    val __obj = js.Dynamic.literal()
    if (inflate != null) __obj.updateDynamic("inflate")(js.Any.fromFunction2(inflate))
    if (proto != null) __obj.updateDynamic("proto")(proto)
    __obj.asInstanceOf[Anon_Dest]
  }
}

