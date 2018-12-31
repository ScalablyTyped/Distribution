package typings
package lobiboxLib.LobiboxModuleNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MessageBoxesOptions extends MessageBoxesDefault {
  var bodyClass: js.UndefOr[java.lang.String] = js.undefined
  var buttons: js.UndefOr[lobiboxLib.Anon_Cancel | js.Any] = js.undefined
  @JSName("buttonsAlign")
  var buttonsAlign_MessageBoxesOptions: js.UndefOr[js.Any] = js.undefined
  var callback: js.UndefOr[
    js.Function3[
      /* lobibox */ js.Any, 
      /* type */ js.UndefOr[java.lang.String], 
      /* ev */ js.UndefOr[js.Any], 
      scala.Unit
    ]
  ] = js.undefined
  var modalClasses: js.UndefOr[lobiboxLib.Anon_Window] = js.undefined
}

