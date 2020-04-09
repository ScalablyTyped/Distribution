package typings.mapboxGl.mod

import typings.mapboxGl.mapboxGlStrings.map
import typings.mapboxGl.mapboxGlStrings.viewport
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait HillshadePaint extends AnyPaint {
  var `hillshade-accent-color`: js.UndefOr[String | Expression] = js.undefined
  var `hillshade-accent-color-transition`: js.UndefOr[Transition] = js.undefined
  var `hillshade-exaggeration`: js.UndefOr[Double | Expression] = js.undefined
  var `hillshade-exaggeration-transition`: js.UndefOr[Transition] = js.undefined
  var `hillshade-highlight-color`: js.UndefOr[String | Expression] = js.undefined
  var `hillshade-highlight-color-transition`: js.UndefOr[Transition] = js.undefined
  var `hillshade-illumination-anchor`: js.UndefOr[map | viewport] = js.undefined
  var `hillshade-illumination-direction`: js.UndefOr[Double | Expression] = js.undefined
  var `hillshade-shadow-color`: js.UndefOr[String | Expression] = js.undefined
  var `hillshade-shadow-color-transition`: js.UndefOr[Transition] = js.undefined
}

object HillshadePaint {
  @scala.inline
  def apply(
    `hillshade-accent-color`: String | Expression = null,
    `hillshade-accent-color-transition`: Transition = null,
    `hillshade-exaggeration`: Double | Expression = null,
    `hillshade-exaggeration-transition`: Transition = null,
    `hillshade-highlight-color`: String | Expression = null,
    `hillshade-highlight-color-transition`: Transition = null,
    `hillshade-illumination-anchor`: map | viewport = null,
    `hillshade-illumination-direction`: Double | Expression = null,
    `hillshade-shadow-color`: String | Expression = null,
    `hillshade-shadow-color-transition`: Transition = null
  ): HillshadePaint = {
    val __obj = js.Dynamic.literal()
    if (`hillshade-accent-color` != null) __obj.updateDynamic("hillshade-accent-color")(`hillshade-accent-color`.asInstanceOf[js.Any])
    if (`hillshade-accent-color-transition` != null) __obj.updateDynamic("hillshade-accent-color-transition")(`hillshade-accent-color-transition`.asInstanceOf[js.Any])
    if (`hillshade-exaggeration` != null) __obj.updateDynamic("hillshade-exaggeration")(`hillshade-exaggeration`.asInstanceOf[js.Any])
    if (`hillshade-exaggeration-transition` != null) __obj.updateDynamic("hillshade-exaggeration-transition")(`hillshade-exaggeration-transition`.asInstanceOf[js.Any])
    if (`hillshade-highlight-color` != null) __obj.updateDynamic("hillshade-highlight-color")(`hillshade-highlight-color`.asInstanceOf[js.Any])
    if (`hillshade-highlight-color-transition` != null) __obj.updateDynamic("hillshade-highlight-color-transition")(`hillshade-highlight-color-transition`.asInstanceOf[js.Any])
    if (`hillshade-illumination-anchor` != null) __obj.updateDynamic("hillshade-illumination-anchor")(`hillshade-illumination-anchor`.asInstanceOf[js.Any])
    if (`hillshade-illumination-direction` != null) __obj.updateDynamic("hillshade-illumination-direction")(`hillshade-illumination-direction`.asInstanceOf[js.Any])
    if (`hillshade-shadow-color` != null) __obj.updateDynamic("hillshade-shadow-color")(`hillshade-shadow-color`.asInstanceOf[js.Any])
    if (`hillshade-shadow-color-transition` != null) __obj.updateDynamic("hillshade-shadow-color-transition")(`hillshade-shadow-color-transition`.asInstanceOf[js.Any])
    __obj.asInstanceOf[HillshadePaint]
  }
}

