package typings.kendoUi.kendo.effects

import typings.kendoUi.JQuery
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Element extends js.Object {
  def expand(direction: String): Expand = js.native
  def expandHorizontal(): Expand = js.native
  def expandVertical(): Expand = js.native
  def fade(direction: String): Fade = js.native
  def fadeIn(): Fade = js.native
  def fadeOut(): Fade = js.native
  def flip(axis: String, face: JQuery, back: JQuery): Flip = js.native
  def flipHorizontal(face: JQuery, back: JQuery): Flip = js.native
  def flipVertical(face: JQuery, back: JQuery): Flip = js.native
  def pageturn(axis: String, face: JQuery, back: JQuery): PageTurn = js.native
  def pageturnHorizontal(face: JQuery, back: JQuery): PageTurn = js.native
  def pageturnVertical(face: JQuery, back: JQuery): PageTurn = js.native
  def slideIn(direction: String): SlideIn = js.native
  def slideInDown(): SlideIn = js.native
  def slideInLeft(): SlideIn = js.native
  def slideInRight(): SlideIn = js.native
  def slideInUp(): SlideIn = js.native
  def tile(direction: String, previous: JQuery): Tile = js.native
  def tileDown(previous: JQuery): Tile = js.native
  def tileLeft(previous: JQuery): Tile = js.native
  def tileRight(previous: JQuery): Tile = js.native
  def tileUp(previous: JQuery): Tile = js.native
  def transfer(target: JQuery): Transfer = js.native
  def zoom(direction: String): Zoom = js.native
  def zoomIn(): Zoom = js.native
  def zoomOut(): Zoom = js.native
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
  @scala.inline
  implicit class ElementOps[Self <: Element] (val x: Self) extends AnyVal {
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
    def setExpand(value: String => Expand): Self = this.set("expand", js.Any.fromFunction1(value))
    @scala.inline
    def setExpandHorizontal(value: () => Expand): Self = this.set("expandHorizontal", js.Any.fromFunction0(value))
    @scala.inline
    def setExpandVertical(value: () => Expand): Self = this.set("expandVertical", js.Any.fromFunction0(value))
    @scala.inline
    def setFade(value: String => Fade): Self = this.set("fade", js.Any.fromFunction1(value))
    @scala.inline
    def setFadeIn(value: () => Fade): Self = this.set("fadeIn", js.Any.fromFunction0(value))
    @scala.inline
    def setFadeOut(value: () => Fade): Self = this.set("fadeOut", js.Any.fromFunction0(value))
    @scala.inline
    def setFlip(value: (String, JQuery, JQuery) => Flip): Self = this.set("flip", js.Any.fromFunction3(value))
    @scala.inline
    def setFlipHorizontal(value: (JQuery, JQuery) => Flip): Self = this.set("flipHorizontal", js.Any.fromFunction2(value))
    @scala.inline
    def setFlipVertical(value: (JQuery, JQuery) => Flip): Self = this.set("flipVertical", js.Any.fromFunction2(value))
    @scala.inline
    def setPageturn(value: (String, JQuery, JQuery) => PageTurn): Self = this.set("pageturn", js.Any.fromFunction3(value))
    @scala.inline
    def setPageturnHorizontal(value: (JQuery, JQuery) => PageTurn): Self = this.set("pageturnHorizontal", js.Any.fromFunction2(value))
    @scala.inline
    def setPageturnVertical(value: (JQuery, JQuery) => PageTurn): Self = this.set("pageturnVertical", js.Any.fromFunction2(value))
    @scala.inline
    def setSlideIn(value: String => SlideIn): Self = this.set("slideIn", js.Any.fromFunction1(value))
    @scala.inline
    def setSlideInDown(value: () => SlideIn): Self = this.set("slideInDown", js.Any.fromFunction0(value))
    @scala.inline
    def setSlideInLeft(value: () => SlideIn): Self = this.set("slideInLeft", js.Any.fromFunction0(value))
    @scala.inline
    def setSlideInRight(value: () => SlideIn): Self = this.set("slideInRight", js.Any.fromFunction0(value))
    @scala.inline
    def setSlideInUp(value: () => SlideIn): Self = this.set("slideInUp", js.Any.fromFunction0(value))
    @scala.inline
    def setTile(value: (String, JQuery) => Tile): Self = this.set("tile", js.Any.fromFunction2(value))
    @scala.inline
    def setTileDown(value: JQuery => Tile): Self = this.set("tileDown", js.Any.fromFunction1(value))
    @scala.inline
    def setTileLeft(value: JQuery => Tile): Self = this.set("tileLeft", js.Any.fromFunction1(value))
    @scala.inline
    def setTileRight(value: JQuery => Tile): Self = this.set("tileRight", js.Any.fromFunction1(value))
    @scala.inline
    def setTileUp(value: JQuery => Tile): Self = this.set("tileUp", js.Any.fromFunction1(value))
    @scala.inline
    def setTransfer(value: JQuery => Transfer): Self = this.set("transfer", js.Any.fromFunction1(value))
    @scala.inline
    def setZoom(value: String => Zoom): Self = this.set("zoom", js.Any.fromFunction1(value))
    @scala.inline
    def setZoomIn(value: () => Zoom): Self = this.set("zoomIn", js.Any.fromFunction0(value))
    @scala.inline
    def setZoomOut(value: () => Zoom): Self = this.set("zoomOut", js.Any.fromFunction0(value))
  }
  
}

