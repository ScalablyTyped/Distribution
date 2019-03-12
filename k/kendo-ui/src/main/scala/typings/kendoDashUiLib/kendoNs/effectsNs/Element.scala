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
    expand: java.lang.String => Expand,
    expandHorizontal: () => Expand,
    expandVertical: () => Expand,
    fade: java.lang.String => Fade,
    fadeIn: () => Fade,
    fadeOut: () => Fade,
    flip: (java.lang.String, kendoDashUiLib.JQuery, kendoDashUiLib.JQuery) => Flip,
    flipHorizontal: (kendoDashUiLib.JQuery, kendoDashUiLib.JQuery) => Flip,
    flipVertical: (kendoDashUiLib.JQuery, kendoDashUiLib.JQuery) => Flip,
    pageturn: (java.lang.String, kendoDashUiLib.JQuery, kendoDashUiLib.JQuery) => PageTurn,
    pageturnHorizontal: (kendoDashUiLib.JQuery, kendoDashUiLib.JQuery) => PageTurn,
    pageturnVertical: (kendoDashUiLib.JQuery, kendoDashUiLib.JQuery) => PageTurn,
    slideIn: java.lang.String => SlideIn,
    slideInDown: () => SlideIn,
    slideInLeft: () => SlideIn,
    slideInRight: () => SlideIn,
    slideInUp: () => SlideIn,
    tile: (java.lang.String, kendoDashUiLib.JQuery) => Tile,
    tileDown: kendoDashUiLib.JQuery => Tile,
    tileLeft: kendoDashUiLib.JQuery => Tile,
    tileRight: kendoDashUiLib.JQuery => Tile,
    tileUp: kendoDashUiLib.JQuery => Tile,
    transfer: kendoDashUiLib.JQuery => Transfer,
    zoom: java.lang.String => Zoom,
    zoomIn: () => Zoom,
    zoomOut: () => Zoom
  ): Element = {
    val __obj = js.Dynamic.literal(expand = js.Any.fromFunction1(expand), expandHorizontal = js.Any.fromFunction0(expandHorizontal), expandVertical = js.Any.fromFunction0(expandVertical), fade = js.Any.fromFunction1(fade), fadeIn = js.Any.fromFunction0(fadeIn), fadeOut = js.Any.fromFunction0(fadeOut), flip = js.Any.fromFunction3(flip), flipHorizontal = js.Any.fromFunction2(flipHorizontal), flipVertical = js.Any.fromFunction2(flipVertical), pageturn = js.Any.fromFunction3(pageturn), pageturnHorizontal = js.Any.fromFunction2(pageturnHorizontal), pageturnVertical = js.Any.fromFunction2(pageturnVertical), slideIn = js.Any.fromFunction1(slideIn), slideInDown = js.Any.fromFunction0(slideInDown), slideInLeft = js.Any.fromFunction0(slideInLeft), slideInRight = js.Any.fromFunction0(slideInRight), slideInUp = js.Any.fromFunction0(slideInUp), tile = js.Any.fromFunction2(tile), tileDown = js.Any.fromFunction1(tileDown), tileLeft = js.Any.fromFunction1(tileLeft), tileRight = js.Any.fromFunction1(tileRight), tileUp = js.Any.fromFunction1(tileUp), transfer = js.Any.fromFunction1(transfer), zoom = js.Any.fromFunction1(zoom), zoomIn = js.Any.fromFunction0(zoomIn), zoomOut = js.Any.fromFunction0(zoomOut))
  
    __obj.asInstanceOf[Element]
  }
}

