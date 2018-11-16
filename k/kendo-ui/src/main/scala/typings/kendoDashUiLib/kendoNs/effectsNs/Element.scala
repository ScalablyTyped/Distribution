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

