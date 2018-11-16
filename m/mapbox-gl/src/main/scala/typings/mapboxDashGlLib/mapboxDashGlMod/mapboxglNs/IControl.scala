package typings
package mapboxDashGlLib.mapboxDashGlMod.mapboxglNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait IControl extends js.Object {
  var getDefaultPosition: js.UndefOr[js.Function0[java.lang.String]] = js.undefined
  def onAdd(map: Map): stdLib.HTMLElement
  def onRemove(map: Map): js.Any
}

