package typings.kendoUi.kendo.effects

import typings.kendoUi.JQuery
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Element extends js.Object {
  def expand(direction: String): Expand
  def expandHorizontal(): Expand
  def expandVertical(): Expand
  def fade(direction: String): Fade
  def fadeIn(): Fade
  def fadeOut(): Fade
  def flip(axis: String, face: JQuery, back: JQuery): Flip
  def flipHorizontal(face: JQuery, back: JQuery): Flip
  def flipVertical(face: JQuery, back: JQuery): Flip
  def pageturn(axis: String, face: JQuery, back: JQuery): PageTurn
  def pageturnHorizontal(face: JQuery, back: JQuery): PageTurn
  def pageturnVertical(face: JQuery, back: JQuery): PageTurn
  def slideIn(direction: String): SlideIn
  def slideInDown(): SlideIn
  def slideInLeft(): SlideIn
  def slideInRight(): SlideIn
  def slideInUp(): SlideIn
  def tile(direction: String, previous: JQuery): Tile
  def tileDown(previous: JQuery): Tile
  def tileLeft(previous: JQuery): Tile
  def tileRight(previous: JQuery): Tile
  def tileUp(previous: JQuery): Tile
  def transfer(target: JQuery): Transfer
  def zoom(direction: String): Zoom
  def zoomIn(): Zoom
  def zoomOut(): Zoom
}

object Element {
  @scala.inline
  def apply(
    expand: String => Expand,
    expandHorizontal: () => Expand,
    expandVertical: () => Expand,
    fade: String => Fade,
    fadeIn: () => Fade,
    fadeOut: () => Fade,
    flip: (String, JQuery, JQuery) => Flip,
    flipHorizontal: (JQuery, JQuery) => Flip,
    flipVertical: (JQuery, JQuery) => Flip,
    pageturn: (String, JQuery, JQuery) => PageTurn,
    pageturnHorizontal: (JQuery, JQuery) => PageTurn,
    pageturnVertical: (JQuery, JQuery) => PageTurn,
    slideIn: String => SlideIn,
    slideInDown: () => SlideIn,
    slideInLeft: () => SlideIn,
    slideInRight: () => SlideIn,
    slideInUp: () => SlideIn,
    tile: (String, JQuery) => Tile,
    tileDown: JQuery => Tile,
    tileLeft: JQuery => Tile,
    tileRight: JQuery => Tile,
    tileUp: JQuery => Tile,
    transfer: JQuery => Transfer,
    zoom: String => Zoom,
    zoomIn: () => Zoom,
    zoomOut: () => Zoom
  ): Element = {
    val __obj = js.Dynamic.literal(expand = js.Any.fromFunction1(expand), expandHorizontal = js.Any.fromFunction0(expandHorizontal), expandVertical = js.Any.fromFunction0(expandVertical), fade = js.Any.fromFunction1(fade), fadeIn = js.Any.fromFunction0(fadeIn), fadeOut = js.Any.fromFunction0(fadeOut), flip = js.Any.fromFunction3(flip), flipHorizontal = js.Any.fromFunction2(flipHorizontal), flipVertical = js.Any.fromFunction2(flipVertical), pageturn = js.Any.fromFunction3(pageturn), pageturnHorizontal = js.Any.fromFunction2(pageturnHorizontal), pageturnVertical = js.Any.fromFunction2(pageturnVertical), slideIn = js.Any.fromFunction1(slideIn), slideInDown = js.Any.fromFunction0(slideInDown), slideInLeft = js.Any.fromFunction0(slideInLeft), slideInRight = js.Any.fromFunction0(slideInRight), slideInUp = js.Any.fromFunction0(slideInUp), tile = js.Any.fromFunction2(tile), tileDown = js.Any.fromFunction1(tileDown), tileLeft = js.Any.fromFunction1(tileLeft), tileRight = js.Any.fromFunction1(tileRight), tileUp = js.Any.fromFunction1(tileUp), transfer = js.Any.fromFunction1(transfer), zoom = js.Any.fromFunction1(zoom), zoomIn = js.Any.fromFunction0(zoomIn), zoomOut = js.Any.fromFunction0(zoomOut))
  
    __obj.asInstanceOf[Element]
  }
}

