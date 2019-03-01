package typings
package kendoDashUiLib.kendoNs.effectsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Element extends js.Object {
  def expand(direction: java.lang.String): Expand
  def expandHorizontal(): Expand
  def expandVertical(): Expand
  def fade(direction: java.lang.String): Fade
  def fadeIn(): Fade
  def fadeOut(): Fade
  def flip(axis: java.lang.String, face: kendoDashUiLib.JQuery, back: kendoDashUiLib.JQuery): Flip
  def flipHorizontal(face: kendoDashUiLib.JQuery, back: kendoDashUiLib.JQuery): Flip
  def flipVertical(face: kendoDashUiLib.JQuery, back: kendoDashUiLib.JQuery): Flip
  def pageturn(axis: java.lang.String, face: kendoDashUiLib.JQuery, back: kendoDashUiLib.JQuery): PageTurn
  def pageturnHorizontal(face: kendoDashUiLib.JQuery, back: kendoDashUiLib.JQuery): PageTurn
  def pageturnVertical(face: kendoDashUiLib.JQuery, back: kendoDashUiLib.JQuery): PageTurn
  def slideIn(direction: java.lang.String): SlideIn
  def slideInDown(): SlideIn
  def slideInLeft(): SlideIn
  def slideInRight(): SlideIn
  def slideInUp(): SlideIn
  def tile(direction: java.lang.String, previous: kendoDashUiLib.JQuery): Tile
  def tileDown(previous: kendoDashUiLib.JQuery): Tile
  def tileLeft(previous: kendoDashUiLib.JQuery): Tile
  def tileRight(previous: kendoDashUiLib.JQuery): Tile
  def tileUp(previous: kendoDashUiLib.JQuery): Tile
  def transfer(target: kendoDashUiLib.JQuery): Transfer
  def zoom(direction: java.lang.String): Zoom
  def zoomIn(): Zoom
  def zoomOut(): Zoom
}

object Element {
  @scala.inline
  def apply(
    expand: js.Function1[java.lang.String, Expand],
    expandHorizontal: js.Function0[Expand],
    expandVertical: js.Function0[Expand],
    fade: js.Function1[java.lang.String, Fade],
    fadeIn: js.Function0[Fade],
    fadeOut: js.Function0[Fade],
    flip: js.Function3[java.lang.String, kendoDashUiLib.JQuery, kendoDashUiLib.JQuery, Flip],
    flipHorizontal: js.Function2[kendoDashUiLib.JQuery, kendoDashUiLib.JQuery, Flip],
    flipVertical: js.Function2[kendoDashUiLib.JQuery, kendoDashUiLib.JQuery, Flip],
    pageturn: js.Function3[java.lang.String, kendoDashUiLib.JQuery, kendoDashUiLib.JQuery, PageTurn],
    pageturnHorizontal: js.Function2[kendoDashUiLib.JQuery, kendoDashUiLib.JQuery, PageTurn],
    pageturnVertical: js.Function2[kendoDashUiLib.JQuery, kendoDashUiLib.JQuery, PageTurn],
    slideIn: js.Function1[java.lang.String, SlideIn],
    slideInDown: js.Function0[SlideIn],
    slideInLeft: js.Function0[SlideIn],
    slideInRight: js.Function0[SlideIn],
    slideInUp: js.Function0[SlideIn],
    tile: js.Function2[java.lang.String, kendoDashUiLib.JQuery, Tile],
    tileDown: js.Function1[kendoDashUiLib.JQuery, Tile],
    tileLeft: js.Function1[kendoDashUiLib.JQuery, Tile],
    tileRight: js.Function1[kendoDashUiLib.JQuery, Tile],
    tileUp: js.Function1[kendoDashUiLib.JQuery, Tile],
    transfer: js.Function1[kendoDashUiLib.JQuery, Transfer],
    zoom: js.Function1[java.lang.String, Zoom],
    zoomIn: js.Function0[Zoom],
    zoomOut: js.Function0[Zoom]
  ): Element = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("expand")(expand)
    __obj.updateDynamic("expandHorizontal")(expandHorizontal)
    __obj.updateDynamic("expandVertical")(expandVertical)
    __obj.updateDynamic("fade")(fade)
    __obj.updateDynamic("fadeIn")(fadeIn)
    __obj.updateDynamic("fadeOut")(fadeOut)
    __obj.updateDynamic("flip")(flip)
    __obj.updateDynamic("flipHorizontal")(flipHorizontal)
    __obj.updateDynamic("flipVertical")(flipVertical)
    __obj.updateDynamic("pageturn")(pageturn)
    __obj.updateDynamic("pageturnHorizontal")(pageturnHorizontal)
    __obj.updateDynamic("pageturnVertical")(pageturnVertical)
    __obj.updateDynamic("slideIn")(slideIn)
    __obj.updateDynamic("slideInDown")(slideInDown)
    __obj.updateDynamic("slideInLeft")(slideInLeft)
    __obj.updateDynamic("slideInRight")(slideInRight)
    __obj.updateDynamic("slideInUp")(slideInUp)
    __obj.updateDynamic("tile")(tile)
    __obj.updateDynamic("tileDown")(tileDown)
    __obj.updateDynamic("tileLeft")(tileLeft)
    __obj.updateDynamic("tileRight")(tileRight)
    __obj.updateDynamic("tileUp")(tileUp)
    __obj.updateDynamic("transfer")(transfer)
    __obj.updateDynamic("zoom")(zoom)
    __obj.updateDynamic("zoomIn")(zoomIn)
    __obj.updateDynamic("zoomOut")(zoomOut)
    __obj.asInstanceOf[Element]
  }
}

