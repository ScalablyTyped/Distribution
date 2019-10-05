package typings.jqueryDotTools.JQueryTools.overlay

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OverlayStatic extends js.Object {
  def addEffect(
    effectName: String,
    effectFn: js.ThisFunction2[/* this */ Overlay, /* position */ CssOptions, /* done */ js.Function0[Unit], Unit],
    closeFn: js.ThisFunction1[/* this */ Overlay, /* done */ js.Function0[Unit], Unit]
  ): Unit
}

object OverlayStatic {
  @scala.inline
  def apply(
    addEffect: (String, js.ThisFunction2[/* this */ Overlay, /* position */ CssOptions, /* done */ js.Function0[Unit], Unit], js.ThisFunction1[/* this */ Overlay, /* done */ js.Function0[Unit], Unit]) => Unit
  ): OverlayStatic = {
    val __obj = js.Dynamic.literal(addEffect = js.Any.fromFunction3(addEffect))
  
    __obj.asInstanceOf[OverlayStatic]
  }
}

