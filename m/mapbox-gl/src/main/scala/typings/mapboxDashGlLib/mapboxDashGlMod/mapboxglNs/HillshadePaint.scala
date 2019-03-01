package typings
package mapboxDashGlLib.mapboxDashGlMod.mapboxglNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait HillshadePaint extends js.Object {
  var `hillshade-accent-color`: js.UndefOr[java.lang.String | Expression] = js.undefined
  var `hillshade-accent-color-transition`: js.UndefOr[Transition] = js.undefined
  var `hillshade-exaggeration`: js.UndefOr[scala.Double | Expression] = js.undefined
  var `hillshade-exaggeration-transition`: js.UndefOr[Transition] = js.undefined
  var `hillshade-highlight-color`: js.UndefOr[java.lang.String | Expression] = js.undefined
  var `hillshade-highlight-color-transition`: js.UndefOr[Transition] = js.undefined
  var `hillshade-illumination-anchor`: js.UndefOr[
    mapboxDashGlLib.mapboxDashGlLibStrings.map | mapboxDashGlLib.mapboxDashGlLibStrings.viewport
  ] = js.undefined
  var `hillshade-illumination-direction`: js.UndefOr[scala.Double | Expression] = js.undefined
  var `hillshade-shadow-color`: js.UndefOr[java.lang.String | Expression] = js.undefined
  var `hillshade-shadow-color-transition`: js.UndefOr[Transition] = js.undefined
}

object HillshadePaint {
  @scala.inline
  def apply(
    `hillshade-accent-color`: java.lang.String | Expression = null,
    `hillshade-accent-color-transition`: Transition = null,
    `hillshade-exaggeration`: scala.Double | Expression = null,
    `hillshade-exaggeration-transition`: Transition = null,
    `hillshade-highlight-color`: java.lang.String | Expression = null,
    `hillshade-highlight-color-transition`: Transition = null,
    `hillshade-illumination-anchor`: mapboxDashGlLib.mapboxDashGlLibStrings.map | mapboxDashGlLib.mapboxDashGlLibStrings.viewport = null,
    `hillshade-illumination-direction`: scala.Double | Expression = null,
    `hillshade-shadow-color`: java.lang.String | Expression = null,
    `hillshade-shadow-color-transition`: Transition = null
  ): HillshadePaint = {
    val __obj = js.Dynamic.literal()
    if (`hillshade-accent-color` != null) __obj.updateDynamic("hillshade-accent-color")(`hillshade-accent-color`.asInstanceOf[js.Any])
    if (`hillshade-accent-color-transition` != null) __obj.updateDynamic("hillshade-accent-color-transition")(`hillshade-accent-color-transition`)
    if (`hillshade-exaggeration` != null) __obj.updateDynamic("hillshade-exaggeration")(`hillshade-exaggeration`.asInstanceOf[js.Any])
    if (`hillshade-exaggeration-transition` != null) __obj.updateDynamic("hillshade-exaggeration-transition")(`hillshade-exaggeration-transition`)
    if (`hillshade-highlight-color` != null) __obj.updateDynamic("hillshade-highlight-color")(`hillshade-highlight-color`.asInstanceOf[js.Any])
    if (`hillshade-highlight-color-transition` != null) __obj.updateDynamic("hillshade-highlight-color-transition")(`hillshade-highlight-color-transition`)
    if (`hillshade-illumination-anchor` != null) __obj.updateDynamic("hillshade-illumination-anchor")(`hillshade-illumination-anchor`.asInstanceOf[js.Any])
    if (`hillshade-illumination-direction` != null) __obj.updateDynamic("hillshade-illumination-direction")(`hillshade-illumination-direction`.asInstanceOf[js.Any])
    if (`hillshade-shadow-color` != null) __obj.updateDynamic("hillshade-shadow-color")(`hillshade-shadow-color`.asInstanceOf[js.Any])
    if (`hillshade-shadow-color-transition` != null) __obj.updateDynamic("hillshade-shadow-color-transition")(`hillshade-shadow-color-transition`)
    __obj.asInstanceOf[HillshadePaint]
  }
}

