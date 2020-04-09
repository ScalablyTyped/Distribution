package typings.mapboxGl.mod

import typings.mapboxGl.mapboxGlStrings.linear
import typings.mapboxGl.mapboxGlStrings.map
import typings.mapboxGl.mapboxGlStrings.nearest
import typings.mapboxGl.mapboxGlStrings.viewport
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.mapboxGl.mod.BackgroundPaint
  - typings.mapboxGl.mod.FillPaint
  - typings.mapboxGl.mod.FillExtrusionPaint
  - typings.mapboxGl.mod.LinePaint
  - typings.mapboxGl.mod.SymbolPaint
  - typings.mapboxGl.mod.RasterPaint
  - typings.mapboxGl.mod.CirclePaint
  - typings.mapboxGl.mod.HeatmapPaint
  - typings.mapboxGl.mod.HillshadePaint
*/
trait AnyPaint extends js.Object

object AnyPaint {
  @scala.inline
  def HeatmapPaint(
    `heatmap-color`: String | StyleFunction | Expression = null,
    `heatmap-intensity`: Double | StyleFunction | Expression = null,
    `heatmap-intensity-transition`: Transition = null,
    `heatmap-opacity`: Double | StyleFunction | Expression = null,
    `heatmap-opacity-transition`: Transition = null,
    `heatmap-radius`: Double | StyleFunction | Expression = null,
    `heatmap-radius-transition`: Transition = null,
    `heatmap-weight`: Double | StyleFunction | Expression = null
  ): AnyPaint = {
    val __obj = js.Dynamic.literal()
    if (`heatmap-color` != null) __obj.updateDynamic("heatmap-color")(`heatmap-color`.asInstanceOf[js.Any])
    if (`heatmap-intensity` != null) __obj.updateDynamic("heatmap-intensity")(`heatmap-intensity`.asInstanceOf[js.Any])
    if (`heatmap-intensity-transition` != null) __obj.updateDynamic("heatmap-intensity-transition")(`heatmap-intensity-transition`.asInstanceOf[js.Any])
    if (`heatmap-opacity` != null) __obj.updateDynamic("heatmap-opacity")(`heatmap-opacity`.asInstanceOf[js.Any])
    if (`heatmap-opacity-transition` != null) __obj.updateDynamic("heatmap-opacity-transition")(`heatmap-opacity-transition`.asInstanceOf[js.Any])
    if (`heatmap-radius` != null) __obj.updateDynamic("heatmap-radius")(`heatmap-radius`.asInstanceOf[js.Any])
    if (`heatmap-radius-transition` != null) __obj.updateDynamic("heatmap-radius-transition")(`heatmap-radius-transition`.asInstanceOf[js.Any])
    if (`heatmap-weight` != null) __obj.updateDynamic("heatmap-weight")(`heatmap-weight`.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnyPaint]
  }
  @scala.inline
  def SymbolPaint(
    `icon-color`: String | StyleFunction | Expression = null,
    `icon-color-transition`: Transition = null,
    `icon-halo-blur`: Double | StyleFunction | Expression = null,
    `icon-halo-blur-transition`: Transition = null,
    `icon-halo-color`: String | StyleFunction | Expression = null,
    `icon-halo-color-transition`: Transition = null,
    `icon-halo-width`: Double | StyleFunction | Expression = null,
    `icon-halo-width-transition`: Transition = null,
    `icon-opacity`: Double | StyleFunction | Expression = null,
    `icon-opacity-transition`: Transition = null,
    `icon-translate`: js.Array[Double] | Expression = null,
    `icon-translate-anchor`: map | viewport = null,
    `icon-translate-transition`: Transition = null,
    `text-color`: String | StyleFunction | Expression = null,
    `text-color-transition`: Transition = null,
    `text-halo-blur`: Double | StyleFunction | Expression = null,
    `text-halo-blur-transition`: Transition = null,
    `text-halo-color`: String | StyleFunction | Expression = null,
    `text-halo-color-transition`: Transition = null,
    `text-halo-width`: Double | StyleFunction | Expression = null,
    `text-halo-width-transition`: Transition = null,
    `text-opacity`: Double | StyleFunction | Expression = null,
    `text-opacity-transition`: Transition = null,
    `text-translate`: js.Array[Double] | Expression = null,
    `text-translate-anchor`: map | viewport = null,
    `text-translate-transition`: Transition = null
  ): AnyPaint = {
    val __obj = js.Dynamic.literal()
    if (`icon-color` != null) __obj.updateDynamic("icon-color")(`icon-color`.asInstanceOf[js.Any])
    if (`icon-color-transition` != null) __obj.updateDynamic("icon-color-transition")(`icon-color-transition`.asInstanceOf[js.Any])
    if (`icon-halo-blur` != null) __obj.updateDynamic("icon-halo-blur")(`icon-halo-blur`.asInstanceOf[js.Any])
    if (`icon-halo-blur-transition` != null) __obj.updateDynamic("icon-halo-blur-transition")(`icon-halo-blur-transition`.asInstanceOf[js.Any])
    if (`icon-halo-color` != null) __obj.updateDynamic("icon-halo-color")(`icon-halo-color`.asInstanceOf[js.Any])
    if (`icon-halo-color-transition` != null) __obj.updateDynamic("icon-halo-color-transition")(`icon-halo-color-transition`.asInstanceOf[js.Any])
    if (`icon-halo-width` != null) __obj.updateDynamic("icon-halo-width")(`icon-halo-width`.asInstanceOf[js.Any])
    if (`icon-halo-width-transition` != null) __obj.updateDynamic("icon-halo-width-transition")(`icon-halo-width-transition`.asInstanceOf[js.Any])
    if (`icon-opacity` != null) __obj.updateDynamic("icon-opacity")(`icon-opacity`.asInstanceOf[js.Any])
    if (`icon-opacity-transition` != null) __obj.updateDynamic("icon-opacity-transition")(`icon-opacity-transition`.asInstanceOf[js.Any])
    if (`icon-translate` != null) __obj.updateDynamic("icon-translate")(`icon-translate`.asInstanceOf[js.Any])
    if (`icon-translate-anchor` != null) __obj.updateDynamic("icon-translate-anchor")(`icon-translate-anchor`.asInstanceOf[js.Any])
    if (`icon-translate-transition` != null) __obj.updateDynamic("icon-translate-transition")(`icon-translate-transition`.asInstanceOf[js.Any])
    if (`text-color` != null) __obj.updateDynamic("text-color")(`text-color`.asInstanceOf[js.Any])
    if (`text-color-transition` != null) __obj.updateDynamic("text-color-transition")(`text-color-transition`.asInstanceOf[js.Any])
    if (`text-halo-blur` != null) __obj.updateDynamic("text-halo-blur")(`text-halo-blur`.asInstanceOf[js.Any])
    if (`text-halo-blur-transition` != null) __obj.updateDynamic("text-halo-blur-transition")(`text-halo-blur-transition`.asInstanceOf[js.Any])
    if (`text-halo-color` != null) __obj.updateDynamic("text-halo-color")(`text-halo-color`.asInstanceOf[js.Any])
    if (`text-halo-color-transition` != null) __obj.updateDynamic("text-halo-color-transition")(`text-halo-color-transition`.asInstanceOf[js.Any])
    if (`text-halo-width` != null) __obj.updateDynamic("text-halo-width")(`text-halo-width`.asInstanceOf[js.Any])
    if (`text-halo-width-transition` != null) __obj.updateDynamic("text-halo-width-transition")(`text-halo-width-transition`.asInstanceOf[js.Any])
    if (`text-opacity` != null) __obj.updateDynamic("text-opacity")(`text-opacity`.asInstanceOf[js.Any])
    if (`text-opacity-transition` != null) __obj.updateDynamic("text-opacity-transition")(`text-opacity-transition`.asInstanceOf[js.Any])
    if (`text-translate` != null) __obj.updateDynamic("text-translate")(`text-translate`.asInstanceOf[js.Any])
    if (`text-translate-anchor` != null) __obj.updateDynamic("text-translate-anchor")(`text-translate-anchor`.asInstanceOf[js.Any])
    if (`text-translate-transition` != null) __obj.updateDynamic("text-translate-transition")(`text-translate-transition`.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnyPaint]
  }
  @scala.inline
  def LinePaint(
    `line-blur`: Double | StyleFunction | Expression = null,
    `line-blur-transition`: Transition = null,
    `line-color`: String | StyleFunction | Expression = null,
    `line-color-transition`: Transition = null,
    `line-dasharray`: js.Array[Double] | Expression = null,
    `line-dasharray-transition`: Transition = null,
    `line-gap-width`: Double | StyleFunction | Expression = null,
    `line-gap-width-transition`: Transition = null,
    `line-gradient`: Expression = null,
    `line-offset`: Double | StyleFunction | Expression = null,
    `line-offset-transition`: Transition = null,
    `line-opacity`: Double | StyleFunction | Expression = null,
    `line-opacity-transition`: Transition = null,
    `line-pattern`: String | Expression = null,
    `line-pattern-transition`: Transition = null,
    `line-translate`: js.Array[Double] | Expression = null,
    `line-translate-anchor`: map | viewport = null,
    `line-translate-transition`: Transition = null,
    `line-width`: Double | StyleFunction | Expression = null,
    `line-width-transition`: Transition = null
  ): AnyPaint = {
    val __obj = js.Dynamic.literal()
    if (`line-blur` != null) __obj.updateDynamic("line-blur")(`line-blur`.asInstanceOf[js.Any])
    if (`line-blur-transition` != null) __obj.updateDynamic("line-blur-transition")(`line-blur-transition`.asInstanceOf[js.Any])
    if (`line-color` != null) __obj.updateDynamic("line-color")(`line-color`.asInstanceOf[js.Any])
    if (`line-color-transition` != null) __obj.updateDynamic("line-color-transition")(`line-color-transition`.asInstanceOf[js.Any])
    if (`line-dasharray` != null) __obj.updateDynamic("line-dasharray")(`line-dasharray`.asInstanceOf[js.Any])
    if (`line-dasharray-transition` != null) __obj.updateDynamic("line-dasharray-transition")(`line-dasharray-transition`.asInstanceOf[js.Any])
    if (`line-gap-width` != null) __obj.updateDynamic("line-gap-width")(`line-gap-width`.asInstanceOf[js.Any])
    if (`line-gap-width-transition` != null) __obj.updateDynamic("line-gap-width-transition")(`line-gap-width-transition`.asInstanceOf[js.Any])
    if (`line-gradient` != null) __obj.updateDynamic("line-gradient")(`line-gradient`.asInstanceOf[js.Any])
    if (`line-offset` != null) __obj.updateDynamic("line-offset")(`line-offset`.asInstanceOf[js.Any])
    if (`line-offset-transition` != null) __obj.updateDynamic("line-offset-transition")(`line-offset-transition`.asInstanceOf[js.Any])
    if (`line-opacity` != null) __obj.updateDynamic("line-opacity")(`line-opacity`.asInstanceOf[js.Any])
    if (`line-opacity-transition` != null) __obj.updateDynamic("line-opacity-transition")(`line-opacity-transition`.asInstanceOf[js.Any])
    if (`line-pattern` != null) __obj.updateDynamic("line-pattern")(`line-pattern`.asInstanceOf[js.Any])
    if (`line-pattern-transition` != null) __obj.updateDynamic("line-pattern-transition")(`line-pattern-transition`.asInstanceOf[js.Any])
    if (`line-translate` != null) __obj.updateDynamic("line-translate")(`line-translate`.asInstanceOf[js.Any])
    if (`line-translate-anchor` != null) __obj.updateDynamic("line-translate-anchor")(`line-translate-anchor`.asInstanceOf[js.Any])
    if (`line-translate-transition` != null) __obj.updateDynamic("line-translate-transition")(`line-translate-transition`.asInstanceOf[js.Any])
    if (`line-width` != null) __obj.updateDynamic("line-width")(`line-width`.asInstanceOf[js.Any])
    if (`line-width-transition` != null) __obj.updateDynamic("line-width-transition")(`line-width-transition`.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnyPaint]
  }
  @scala.inline
  def BackgroundPaint(
    `background-color`: String | Expression = null,
    `background-color-transition`: Transition = null,
    `background-opacity`: Double | Expression = null,
    `background-opacity-transition`: Transition = null,
    `background-pattern`: String = null,
    `background-pattern-transition`: Transition = null
  ): AnyPaint = {
    val __obj = js.Dynamic.literal()
    if (`background-color` != null) __obj.updateDynamic("background-color")(`background-color`.asInstanceOf[js.Any])
    if (`background-color-transition` != null) __obj.updateDynamic("background-color-transition")(`background-color-transition`.asInstanceOf[js.Any])
    if (`background-opacity` != null) __obj.updateDynamic("background-opacity")(`background-opacity`.asInstanceOf[js.Any])
    if (`background-opacity-transition` != null) __obj.updateDynamic("background-opacity-transition")(`background-opacity-transition`.asInstanceOf[js.Any])
    if (`background-pattern` != null) __obj.updateDynamic("background-pattern")(`background-pattern`.asInstanceOf[js.Any])
    if (`background-pattern-transition` != null) __obj.updateDynamic("background-pattern-transition")(`background-pattern-transition`.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnyPaint]
  }
  @scala.inline
  def HillshadePaint(
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
  ): AnyPaint = {
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
    __obj.asInstanceOf[AnyPaint]
  }
  @scala.inline
  def CirclePaint(
    `circle-blur`: Double | StyleFunction | Expression = null,
    `circle-blur-transition`: Transition = null,
    `circle-color`: String | StyleFunction | Expression = null,
    `circle-color-transition`: Transition = null,
    `circle-opacity`: Double | StyleFunction | Expression = null,
    `circle-opacity-transition`: Transition = null,
    `circle-pitch-alignment`: map | viewport = null,
    `circle-pitch-scale`: map | viewport = null,
    `circle-radius`: Double | StyleFunction | Expression = null,
    `circle-radius-transition`: Transition = null,
    `circle-stroke-color`: String | StyleFunction | Expression = null,
    `circle-stroke-color-transition`: Transition = null,
    `circle-stroke-opacity`: Double | StyleFunction | Expression = null,
    `circle-stroke-opacity-transition`: Transition = null,
    `circle-stroke-width`: Double | StyleFunction | Expression = null,
    `circle-stroke-width-transition`: Transition = null,
    `circle-translate`: js.Array[Double] | Expression = null,
    `circle-translate-anchor`: map | viewport = null,
    `circle-translate-transition`: Transition = null
  ): AnyPaint = {
    val __obj = js.Dynamic.literal()
    if (`circle-blur` != null) __obj.updateDynamic("circle-blur")(`circle-blur`.asInstanceOf[js.Any])
    if (`circle-blur-transition` != null) __obj.updateDynamic("circle-blur-transition")(`circle-blur-transition`.asInstanceOf[js.Any])
    if (`circle-color` != null) __obj.updateDynamic("circle-color")(`circle-color`.asInstanceOf[js.Any])
    if (`circle-color-transition` != null) __obj.updateDynamic("circle-color-transition")(`circle-color-transition`.asInstanceOf[js.Any])
    if (`circle-opacity` != null) __obj.updateDynamic("circle-opacity")(`circle-opacity`.asInstanceOf[js.Any])
    if (`circle-opacity-transition` != null) __obj.updateDynamic("circle-opacity-transition")(`circle-opacity-transition`.asInstanceOf[js.Any])
    if (`circle-pitch-alignment` != null) __obj.updateDynamic("circle-pitch-alignment")(`circle-pitch-alignment`.asInstanceOf[js.Any])
    if (`circle-pitch-scale` != null) __obj.updateDynamic("circle-pitch-scale")(`circle-pitch-scale`.asInstanceOf[js.Any])
    if (`circle-radius` != null) __obj.updateDynamic("circle-radius")(`circle-radius`.asInstanceOf[js.Any])
    if (`circle-radius-transition` != null) __obj.updateDynamic("circle-radius-transition")(`circle-radius-transition`.asInstanceOf[js.Any])
    if (`circle-stroke-color` != null) __obj.updateDynamic("circle-stroke-color")(`circle-stroke-color`.asInstanceOf[js.Any])
    if (`circle-stroke-color-transition` != null) __obj.updateDynamic("circle-stroke-color-transition")(`circle-stroke-color-transition`.asInstanceOf[js.Any])
    if (`circle-stroke-opacity` != null) __obj.updateDynamic("circle-stroke-opacity")(`circle-stroke-opacity`.asInstanceOf[js.Any])
    if (`circle-stroke-opacity-transition` != null) __obj.updateDynamic("circle-stroke-opacity-transition")(`circle-stroke-opacity-transition`.asInstanceOf[js.Any])
    if (`circle-stroke-width` != null) __obj.updateDynamic("circle-stroke-width")(`circle-stroke-width`.asInstanceOf[js.Any])
    if (`circle-stroke-width-transition` != null) __obj.updateDynamic("circle-stroke-width-transition")(`circle-stroke-width-transition`.asInstanceOf[js.Any])
    if (`circle-translate` != null) __obj.updateDynamic("circle-translate")(`circle-translate`.asInstanceOf[js.Any])
    if (`circle-translate-anchor` != null) __obj.updateDynamic("circle-translate-anchor")(`circle-translate-anchor`.asInstanceOf[js.Any])
    if (`circle-translate-transition` != null) __obj.updateDynamic("circle-translate-transition")(`circle-translate-transition`.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnyPaint]
  }
  @scala.inline
  def FillExtrusionPaint(
    `fill-extrusion-base`: Double | StyleFunction | Expression = null,
    `fill-extrusion-base-transition`: Transition = null,
    `fill-extrusion-color`: String | StyleFunction | Expression = null,
    `fill-extrusion-color-transition`: Transition = null,
    `fill-extrusion-height`: Double | StyleFunction | Expression = null,
    `fill-extrusion-height-transition`: Transition = null,
    `fill-extrusion-opacity`: Double | Expression = null,
    `fill-extrusion-opacity-transition`: Transition = null,
    `fill-extrusion-pattern`: String | Expression = null,
    `fill-extrusion-pattern-transition`: Transition = null,
    `fill-extrusion-translate`: js.Array[Double] | Expression = null,
    `fill-extrusion-translate-anchor`: map | viewport = null,
    `fill-extrusion-translate-transition`: Transition = null,
    `fill-extrusion-vertical-gradient`: js.UndefOr[Boolean] = js.undefined
  ): AnyPaint = {
    val __obj = js.Dynamic.literal()
    if (`fill-extrusion-base` != null) __obj.updateDynamic("fill-extrusion-base")(`fill-extrusion-base`.asInstanceOf[js.Any])
    if (`fill-extrusion-base-transition` != null) __obj.updateDynamic("fill-extrusion-base-transition")(`fill-extrusion-base-transition`.asInstanceOf[js.Any])
    if (`fill-extrusion-color` != null) __obj.updateDynamic("fill-extrusion-color")(`fill-extrusion-color`.asInstanceOf[js.Any])
    if (`fill-extrusion-color-transition` != null) __obj.updateDynamic("fill-extrusion-color-transition")(`fill-extrusion-color-transition`.asInstanceOf[js.Any])
    if (`fill-extrusion-height` != null) __obj.updateDynamic("fill-extrusion-height")(`fill-extrusion-height`.asInstanceOf[js.Any])
    if (`fill-extrusion-height-transition` != null) __obj.updateDynamic("fill-extrusion-height-transition")(`fill-extrusion-height-transition`.asInstanceOf[js.Any])
    if (`fill-extrusion-opacity` != null) __obj.updateDynamic("fill-extrusion-opacity")(`fill-extrusion-opacity`.asInstanceOf[js.Any])
    if (`fill-extrusion-opacity-transition` != null) __obj.updateDynamic("fill-extrusion-opacity-transition")(`fill-extrusion-opacity-transition`.asInstanceOf[js.Any])
    if (`fill-extrusion-pattern` != null) __obj.updateDynamic("fill-extrusion-pattern")(`fill-extrusion-pattern`.asInstanceOf[js.Any])
    if (`fill-extrusion-pattern-transition` != null) __obj.updateDynamic("fill-extrusion-pattern-transition")(`fill-extrusion-pattern-transition`.asInstanceOf[js.Any])
    if (`fill-extrusion-translate` != null) __obj.updateDynamic("fill-extrusion-translate")(`fill-extrusion-translate`.asInstanceOf[js.Any])
    if (`fill-extrusion-translate-anchor` != null) __obj.updateDynamic("fill-extrusion-translate-anchor")(`fill-extrusion-translate-anchor`.asInstanceOf[js.Any])
    if (`fill-extrusion-translate-transition` != null) __obj.updateDynamic("fill-extrusion-translate-transition")(`fill-extrusion-translate-transition`.asInstanceOf[js.Any])
    if (!js.isUndefined(`fill-extrusion-vertical-gradient`)) __obj.updateDynamic("fill-extrusion-vertical-gradient")(`fill-extrusion-vertical-gradient`.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnyPaint]
  }
  @scala.inline
  def RasterPaint(
    `circle-sort-key`: Int | Double = null,
    `raster-brightness-max`: Double | Expression = null,
    `raster-brightness-max-transition`: Transition = null,
    `raster-brightness-min`: Double | Expression = null,
    `raster-brightness-min-transition`: Transition = null,
    `raster-contrast`: Double | Expression = null,
    `raster-contrast-transition`: Transition = null,
    `raster-fade-duration`: Double | Expression = null,
    `raster-hue-rotate`: Double | Expression = null,
    `raster-hue-rotate-transition`: Transition = null,
    `raster-opacity`: Double | Expression = null,
    `raster-opacity-transition`: Transition = null,
    `raster-resampling`: linear | nearest = null,
    `raster-saturation`: Double | Expression = null,
    `raster-saturation-transition`: Transition = null
  ): AnyPaint = {
    val __obj = js.Dynamic.literal()
    if (`circle-sort-key` != null) __obj.updateDynamic("circle-sort-key")(`circle-sort-key`.asInstanceOf[js.Any])
    if (`raster-brightness-max` != null) __obj.updateDynamic("raster-brightness-max")(`raster-brightness-max`.asInstanceOf[js.Any])
    if (`raster-brightness-max-transition` != null) __obj.updateDynamic("raster-brightness-max-transition")(`raster-brightness-max-transition`.asInstanceOf[js.Any])
    if (`raster-brightness-min` != null) __obj.updateDynamic("raster-brightness-min")(`raster-brightness-min`.asInstanceOf[js.Any])
    if (`raster-brightness-min-transition` != null) __obj.updateDynamic("raster-brightness-min-transition")(`raster-brightness-min-transition`.asInstanceOf[js.Any])
    if (`raster-contrast` != null) __obj.updateDynamic("raster-contrast")(`raster-contrast`.asInstanceOf[js.Any])
    if (`raster-contrast-transition` != null) __obj.updateDynamic("raster-contrast-transition")(`raster-contrast-transition`.asInstanceOf[js.Any])
    if (`raster-fade-duration` != null) __obj.updateDynamic("raster-fade-duration")(`raster-fade-duration`.asInstanceOf[js.Any])
    if (`raster-hue-rotate` != null) __obj.updateDynamic("raster-hue-rotate")(`raster-hue-rotate`.asInstanceOf[js.Any])
    if (`raster-hue-rotate-transition` != null) __obj.updateDynamic("raster-hue-rotate-transition")(`raster-hue-rotate-transition`.asInstanceOf[js.Any])
    if (`raster-opacity` != null) __obj.updateDynamic("raster-opacity")(`raster-opacity`.asInstanceOf[js.Any])
    if (`raster-opacity-transition` != null) __obj.updateDynamic("raster-opacity-transition")(`raster-opacity-transition`.asInstanceOf[js.Any])
    if (`raster-resampling` != null) __obj.updateDynamic("raster-resampling")(`raster-resampling`.asInstanceOf[js.Any])
    if (`raster-saturation` != null) __obj.updateDynamic("raster-saturation")(`raster-saturation`.asInstanceOf[js.Any])
    if (`raster-saturation-transition` != null) __obj.updateDynamic("raster-saturation-transition")(`raster-saturation-transition`.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnyPaint]
  }
  @scala.inline
  def FillPaint(
    `fill-antialias`: Boolean | Expression = null,
    `fill-color`: String | StyleFunction | Expression = null,
    `fill-color-transition`: Transition = null,
    `fill-opacity`: Double | StyleFunction | Expression = null,
    `fill-opacity-transition`: Transition = null,
    `fill-outline-color`: String | StyleFunction | Expression = null,
    `fill-outline-color-transition`: Transition = null,
    `fill-pattern`: String | Expression = null,
    `fill-pattern-transition`: Transition = null,
    `fill-translate`: js.Array[Double] = null,
    `fill-translate-anchor`: map | viewport = null,
    `fill-translate-transition`: Transition = null
  ): AnyPaint = {
    val __obj = js.Dynamic.literal()
    if (`fill-antialias` != null) __obj.updateDynamic("fill-antialias")(`fill-antialias`.asInstanceOf[js.Any])
    if (`fill-color` != null) __obj.updateDynamic("fill-color")(`fill-color`.asInstanceOf[js.Any])
    if (`fill-color-transition` != null) __obj.updateDynamic("fill-color-transition")(`fill-color-transition`.asInstanceOf[js.Any])
    if (`fill-opacity` != null) __obj.updateDynamic("fill-opacity")(`fill-opacity`.asInstanceOf[js.Any])
    if (`fill-opacity-transition` != null) __obj.updateDynamic("fill-opacity-transition")(`fill-opacity-transition`.asInstanceOf[js.Any])
    if (`fill-outline-color` != null) __obj.updateDynamic("fill-outline-color")(`fill-outline-color`.asInstanceOf[js.Any])
    if (`fill-outline-color-transition` != null) __obj.updateDynamic("fill-outline-color-transition")(`fill-outline-color-transition`.asInstanceOf[js.Any])
    if (`fill-pattern` != null) __obj.updateDynamic("fill-pattern")(`fill-pattern`.asInstanceOf[js.Any])
    if (`fill-pattern-transition` != null) __obj.updateDynamic("fill-pattern-transition")(`fill-pattern-transition`.asInstanceOf[js.Any])
    if (`fill-translate` != null) __obj.updateDynamic("fill-translate")(`fill-translate`.asInstanceOf[js.Any])
    if (`fill-translate-anchor` != null) __obj.updateDynamic("fill-translate-anchor")(`fill-translate-anchor`.asInstanceOf[js.Any])
    if (`fill-translate-transition` != null) __obj.updateDynamic("fill-translate-transition")(`fill-translate-transition`.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnyPaint]
  }
}

