package typings
package lobiboxLib.LobiboxModuleNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait NotifyOptions
  extends NotifyDefault
     with NotifyMethods {
  var `class`: js.UndefOr[java.lang.String] = js.undefined
  var error: js.UndefOr[lobiboxLib.Anon_Sound] = js.undefined
  var info: js.UndefOr[lobiboxLib.Anon_Sound] = js.undefined
   //You can override options for large notifications from here
  var large: js.UndefOr[lobiboxLib.Anon_Width] = js.undefined
    //You can override options for small notifications from here
  var mini: js.UndefOr[lobiboxLib.Anon_Class] = js.undefined
     //Default options of different style notifications
  var success: js.UndefOr[lobiboxLib.Anon_Sound] = js.undefined
  var warning: js.UndefOr[lobiboxLib.Anon_Sound] = js.undefined
}

