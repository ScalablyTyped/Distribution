package typings
package leafletLib.leafletMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* RemoveMultipleInheritance: Dropped parents List(leafletLib.leafletMod.PanOptions because Would inherit conflicting mutable fields List(animate))*/
trait FitBoundsOptions extends ZoomOptions {
  var maxZoom: js.UndefOr[scala.Double] = js.undefined
  var padding: js.UndefOr[PointExpression] = js.undefined
  var paddingBottomRight: js.UndefOr[PointExpression] = js.undefined
  var paddingTopLeft: js.UndefOr[PointExpression] = js.undefined
}

