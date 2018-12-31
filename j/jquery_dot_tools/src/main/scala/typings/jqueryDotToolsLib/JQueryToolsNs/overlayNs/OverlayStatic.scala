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

