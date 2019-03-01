package typings
package jqueryDotToolsLib.JQueryToolsNs.overlayNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OverlayStatic extends js.Object {
  def addEffect(
    effectName: java.lang.String,
    effectFn: js.ThisFunction2[
      /* this */ Overlay, 
      /* position */ CssOptions, 
      /* done */ js.Function0[scala.Unit], 
      scala.Unit
    ],
    closeFn: js.ThisFunction1[/* this */ Overlay, /* done */ js.Function0[scala.Unit], scala.Unit]
  ): scala.Unit
}

object OverlayStatic {
  @scala.inline
  def apply(
    addEffect: js.Function3[
      java.lang.String, 
      js.ThisFunction2[
        /* this */ Overlay, 
        /* position */ CssOptions, 
        /* done */ js.Function0[scala.Unit], 
        scala.Unit
      ], 
      js.ThisFunction1[/* this */ Overlay, /* done */ js.Function0[scala.Unit], scala.Unit], 
      scala.Unit
    ]
  ): OverlayStatic = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("addEffect")(addEffect)
    __obj.asInstanceOf[OverlayStatic]
  }
}

