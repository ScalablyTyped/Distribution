package typings.jointjs.mod.attributes

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SVGPresentationAttributes extends js.Object {
  var `alignment-baseline`: js.UndefOr[js.Any] = js.native
  var `baseline-shift`: js.UndefOr[js.Any] = js.native
  var clip: js.UndefOr[js.Any] = js.native
  var `clip-path`: js.UndefOr[js.Any] = js.native
  var `clip-rule`: js.UndefOr[js.Any] = js.native
  var color: js.UndefOr[js.Any] = js.native
  var `color-interpolation`: js.UndefOr[js.Any] = js.native
  var `color-interpolation-filters`: js.UndefOr[js.Any] = js.native
  var `color-profile`: js.UndefOr[js.Any] = js.native
  var `color-rendering`: js.UndefOr[js.Any] = js.native
  var cursor: js.UndefOr[js.Any] = js.native
  var direction: js.UndefOr[js.Any] = js.native
  var display: js.UndefOr[js.Any] = js.native
  var `dominant-baseline`: js.UndefOr[js.Any] = js.native
  var `enable-background`: js.UndefOr[js.Any] = js.native
  var fill: js.UndefOr[js.Any] = js.native
  var `fill-opacity`: js.UndefOr[js.Any] = js.native
  var `fill-rule`: js.UndefOr[js.Any] = js.native
  var filter: js.UndefOr[js.Any] = js.native
  var `flood-color`: js.UndefOr[js.Any] = js.native
  var `flood-opacity`: js.UndefOr[js.Any] = js.native
  var `font-family`: js.UndefOr[js.Any] = js.native
  var `font-size`: js.UndefOr[js.Any] = js.native
  var `font-size-adjust`: js.UndefOr[js.Any] = js.native
  var `font-stretch`: js.UndefOr[js.Any] = js.native
  var `font-style`: js.UndefOr[js.Any] = js.native
  var `font-variant`: js.UndefOr[js.Any] = js.native
  var `font-weight`: js.UndefOr[js.Any] = js.native
  var `glyph-orientation-horizontal`: js.UndefOr[js.Any] = js.native
  var `glyph-orientation-vertical`: js.UndefOr[js.Any] = js.native
  var `image-rendering`: js.UndefOr[js.Any] = js.native
  var kerning: js.UndefOr[js.Any] = js.native
  var `letter-spacing`: js.UndefOr[js.Any] = js.native
  var `lighting-color`: js.UndefOr[js.Any] = js.native
  var `marker-end`: js.UndefOr[js.Any] = js.native
  var `marker-mid`: js.UndefOr[js.Any] = js.native
  var `marker-start`: js.UndefOr[js.Any] = js.native
  var mask: js.UndefOr[js.Any] = js.native
  var opacity: js.UndefOr[js.Any] = js.native
  var overflow: js.UndefOr[js.Any] = js.native
  var `pointer-events`: js.UndefOr[js.Any] = js.native
  var `shape-rendering`: js.UndefOr[js.Any] = js.native
  var `stop-color`: js.UndefOr[js.Any] = js.native
  var `stop-opacity`: js.UndefOr[js.Any] = js.native
  var stroke: js.UndefOr[js.Any] = js.native
  var `stroke-dasharray`: js.UndefOr[js.Any] = js.native
  var `stroke-dashoffset`: js.UndefOr[js.Any] = js.native
  var `stroke-linecap`: js.UndefOr[js.Any] = js.native
  var `stroke-linejoin`: js.UndefOr[js.Any] = js.native
  var `stroke-miterlimit`: js.UndefOr[js.Any] = js.native
  var `stroke-opacity`: js.UndefOr[js.Any] = js.native
  var `stroke-width`: js.UndefOr[js.Any] = js.native
  var `text-anchor`: js.UndefOr[js.Any] = js.native
  var `text-decoration`: js.UndefOr[js.Any] = js.native
  var `text-rendering`: js.UndefOr[js.Any] = js.native
  var `unicode-bidi`: js.UndefOr[js.Any] = js.native
  var visibility: js.UndefOr[js.Any] = js.native
  var `word-spacing`: js.UndefOr[js.Any] = js.native
  var `writing-mode`: js.UndefOr[js.Any] = js.native
}

object SVGPresentationAttributes {
  @scala.inline
  def apply(): SVGPresentationAttributes = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SVGPresentationAttributes]
  }
  @scala.inline
  implicit class SVGPresentationAttributesOps[Self <: SVGPresentationAttributes] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def `setAlignment-baseline`(value: js.Any): Self = this.set("alignment-baseline", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteAlignment-baseline`: Self = this.set("alignment-baseline", js.undefined)
    @scala.inline
    def `setBaseline-shift`(value: js.Any): Self = this.set("baseline-shift", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteBaseline-shift`: Self = this.set("baseline-shift", js.undefined)
    @scala.inline
    def setClip(value: js.Any): Self = this.set("clip", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteClip: Self = this.set("clip", js.undefined)
    @scala.inline
    def `setClip-path`(value: js.Any): Self = this.set("clip-path", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteClip-path`: Self = this.set("clip-path", js.undefined)
    @scala.inline
    def `setClip-rule`(value: js.Any): Self = this.set("clip-rule", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteClip-rule`: Self = this.set("clip-rule", js.undefined)
    @scala.inline
    def setColor(value: js.Any): Self = this.set("color", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteColor: Self = this.set("color", js.undefined)
    @scala.inline
    def `setColor-interpolation`(value: js.Any): Self = this.set("color-interpolation", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteColor-interpolation`: Self = this.set("color-interpolation", js.undefined)
    @scala.inline
    def `setColor-interpolation-filters`(value: js.Any): Self = this.set("color-interpolation-filters", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteColor-interpolation-filters`: Self = this.set("color-interpolation-filters", js.undefined)
    @scala.inline
    def `setColor-profile`(value: js.Any): Self = this.set("color-profile", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteColor-profile`: Self = this.set("color-profile", js.undefined)
    @scala.inline
    def `setColor-rendering`(value: js.Any): Self = this.set("color-rendering", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteColor-rendering`: Self = this.set("color-rendering", js.undefined)
    @scala.inline
    def setCursor(value: js.Any): Self = this.set("cursor", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCursor: Self = this.set("cursor", js.undefined)
    @scala.inline
    def setDirection(value: js.Any): Self = this.set("direction", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDirection: Self = this.set("direction", js.undefined)
    @scala.inline
    def setDisplay(value: js.Any): Self = this.set("display", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDisplay: Self = this.set("display", js.undefined)
    @scala.inline
    def `setDominant-baseline`(value: js.Any): Self = this.set("dominant-baseline", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteDominant-baseline`: Self = this.set("dominant-baseline", js.undefined)
    @scala.inline
    def `setEnable-background`(value: js.Any): Self = this.set("enable-background", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteEnable-background`: Self = this.set("enable-background", js.undefined)
    @scala.inline
    def setFill(value: js.Any): Self = this.set("fill", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFill: Self = this.set("fill", js.undefined)
    @scala.inline
    def `setFill-opacity`(value: js.Any): Self = this.set("fill-opacity", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteFill-opacity`: Self = this.set("fill-opacity", js.undefined)
    @scala.inline
    def `setFill-rule`(value: js.Any): Self = this.set("fill-rule", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteFill-rule`: Self = this.set("fill-rule", js.undefined)
    @scala.inline
    def setFilter(value: js.Any): Self = this.set("filter", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFilter: Self = this.set("filter", js.undefined)
    @scala.inline
    def `setFlood-color`(value: js.Any): Self = this.set("flood-color", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteFlood-color`: Self = this.set("flood-color", js.undefined)
    @scala.inline
    def `setFlood-opacity`(value: js.Any): Self = this.set("flood-opacity", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteFlood-opacity`: Self = this.set("flood-opacity", js.undefined)
    @scala.inline
    def `setFont-family`(value: js.Any): Self = this.set("font-family", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteFont-family`: Self = this.set("font-family", js.undefined)
    @scala.inline
    def `setFont-size`(value: js.Any): Self = this.set("font-size", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteFont-size`: Self = this.set("font-size", js.undefined)
    @scala.inline
    def `setFont-size-adjust`(value: js.Any): Self = this.set("font-size-adjust", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteFont-size-adjust`: Self = this.set("font-size-adjust", js.undefined)
    @scala.inline
    def `setFont-stretch`(value: js.Any): Self = this.set("font-stretch", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteFont-stretch`: Self = this.set("font-stretch", js.undefined)
    @scala.inline
    def `setFont-style`(value: js.Any): Self = this.set("font-style", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteFont-style`: Self = this.set("font-style", js.undefined)
    @scala.inline
    def `setFont-variant`(value: js.Any): Self = this.set("font-variant", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteFont-variant`: Self = this.set("font-variant", js.undefined)
    @scala.inline
    def `setFont-weight`(value: js.Any): Self = this.set("font-weight", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteFont-weight`: Self = this.set("font-weight", js.undefined)
    @scala.inline
    def `setGlyph-orientation-horizontal`(value: js.Any): Self = this.set("glyph-orientation-horizontal", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteGlyph-orientation-horizontal`: Self = this.set("glyph-orientation-horizontal", js.undefined)
    @scala.inline
    def `setGlyph-orientation-vertical`(value: js.Any): Self = this.set("glyph-orientation-vertical", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteGlyph-orientation-vertical`: Self = this.set("glyph-orientation-vertical", js.undefined)
    @scala.inline
    def `setImage-rendering`(value: js.Any): Self = this.set("image-rendering", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteImage-rendering`: Self = this.set("image-rendering", js.undefined)
    @scala.inline
    def setKerning(value: js.Any): Self = this.set("kerning", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteKerning: Self = this.set("kerning", js.undefined)
    @scala.inline
    def `setLetter-spacing`(value: js.Any): Self = this.set("letter-spacing", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteLetter-spacing`: Self = this.set("letter-spacing", js.undefined)
    @scala.inline
    def `setLighting-color`(value: js.Any): Self = this.set("lighting-color", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteLighting-color`: Self = this.set("lighting-color", js.undefined)
    @scala.inline
    def `setMarker-end`(value: js.Any): Self = this.set("marker-end", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteMarker-end`: Self = this.set("marker-end", js.undefined)
    @scala.inline
    def `setMarker-mid`(value: js.Any): Self = this.set("marker-mid", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteMarker-mid`: Self = this.set("marker-mid", js.undefined)
    @scala.inline
    def `setMarker-start`(value: js.Any): Self = this.set("marker-start", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteMarker-start`: Self = this.set("marker-start", js.undefined)
    @scala.inline
    def setMask(value: js.Any): Self = this.set("mask", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMask: Self = this.set("mask", js.undefined)
    @scala.inline
    def setOpacity(value: js.Any): Self = this.set("opacity", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOpacity: Self = this.set("opacity", js.undefined)
    @scala.inline
    def setOverflow(value: js.Any): Self = this.set("overflow", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOverflow: Self = this.set("overflow", js.undefined)
    @scala.inline
    def `setPointer-events`(value: js.Any): Self = this.set("pointer-events", value.asInstanceOf[js.Any])
    @scala.inline
    def `deletePointer-events`: Self = this.set("pointer-events", js.undefined)
    @scala.inline
    def `setShape-rendering`(value: js.Any): Self = this.set("shape-rendering", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteShape-rendering`: Self = this.set("shape-rendering", js.undefined)
    @scala.inline
    def `setStop-color`(value: js.Any): Self = this.set("stop-color", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteStop-color`: Self = this.set("stop-color", js.undefined)
    @scala.inline
    def `setStop-opacity`(value: js.Any): Self = this.set("stop-opacity", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteStop-opacity`: Self = this.set("stop-opacity", js.undefined)
    @scala.inline
    def setStroke(value: js.Any): Self = this.set("stroke", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStroke: Self = this.set("stroke", js.undefined)
    @scala.inline
    def `setStroke-dasharray`(value: js.Any): Self = this.set("stroke-dasharray", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteStroke-dasharray`: Self = this.set("stroke-dasharray", js.undefined)
    @scala.inline
    def `setStroke-dashoffset`(value: js.Any): Self = this.set("stroke-dashoffset", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteStroke-dashoffset`: Self = this.set("stroke-dashoffset", js.undefined)
    @scala.inline
    def `setStroke-linecap`(value: js.Any): Self = this.set("stroke-linecap", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteStroke-linecap`: Self = this.set("stroke-linecap", js.undefined)
    @scala.inline
    def `setStroke-linejoin`(value: js.Any): Self = this.set("stroke-linejoin", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteStroke-linejoin`: Self = this.set("stroke-linejoin", js.undefined)
    @scala.inline
    def `setStroke-miterlimit`(value: js.Any): Self = this.set("stroke-miterlimit", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteStroke-miterlimit`: Self = this.set("stroke-miterlimit", js.undefined)
    @scala.inline
    def `setStroke-opacity`(value: js.Any): Self = this.set("stroke-opacity", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteStroke-opacity`: Self = this.set("stroke-opacity", js.undefined)
    @scala.inline
    def `setStroke-width`(value: js.Any): Self = this.set("stroke-width", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteStroke-width`: Self = this.set("stroke-width", js.undefined)
    @scala.inline
    def `setText-anchor`(value: js.Any): Self = this.set("text-anchor", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteText-anchor`: Self = this.set("text-anchor", js.undefined)
    @scala.inline
    def `setText-decoration`(value: js.Any): Self = this.set("text-decoration", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteText-decoration`: Self = this.set("text-decoration", js.undefined)
    @scala.inline
    def `setText-rendering`(value: js.Any): Self = this.set("text-rendering", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteText-rendering`: Self = this.set("text-rendering", js.undefined)
    @scala.inline
    def `setUnicode-bidi`(value: js.Any): Self = this.set("unicode-bidi", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteUnicode-bidi`: Self = this.set("unicode-bidi", js.undefined)
    @scala.inline
    def setVisibility(value: js.Any): Self = this.set("visibility", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteVisibility: Self = this.set("visibility", js.undefined)
    @scala.inline
    def `setWord-spacing`(value: js.Any): Self = this.set("word-spacing", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteWord-spacing`: Self = this.set("word-spacing", js.undefined)
    @scala.inline
    def `setWriting-mode`(value: js.Any): Self = this.set("writing-mode", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteWriting-mode`: Self = this.set("writing-mode", js.undefined)
  }
  
}

