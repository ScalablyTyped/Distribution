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
    val __obj = js.Dynamic.literal(expand = expand, expandHorizontal = expandHorizontal, expandVertical = expandVertical, fade = fade, fadeIn = fadeIn, fadeOut = fadeOut, flip = flip, flipHorizontal = flipHorizontal, flipVertical = flipVertical, pageturn = pageturn, pageturnHorizontal = pageturnHorizontal, pageturnVertical = pageturnVertical, slideIn = slideIn, slideInDown = slideInDown, slideInLeft = slideInLeft, slideInRight = slideInRight, slideInUp = slideInUp, tile = tile, tileDown = tileDown, tileLeft = tileLeft, tileRight = tileRight, tileUp = tileUp, transfer = transfer, zoom = zoom, zoomIn = zoomIn, zoomOut = zoomOut)
  
    __obj.asInstanceOf[Element]
  }
}

