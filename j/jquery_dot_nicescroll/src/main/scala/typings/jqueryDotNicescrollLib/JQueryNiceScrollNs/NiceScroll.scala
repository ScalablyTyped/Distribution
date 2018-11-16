package typings
package jqueryDotNicescrollLib.JQueryNiceScrollNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait NiceScroll extends js.Object {
  def doScrollLeft(x: scala.Double, duration: scala.Double): scala.Unit = js.native
  def doScrollPos(x: scala.Double, y: scala.Double, spd: scala.Double): scala.Unit = js.native
  def doScrollTop(x: scala.Double, duration: scala.Double): scala.Unit = js.native
  def hide(): NiceScroll = js.native
  def onResize(): NiceScroll = js.native
  def onResize(e: stdLib.Event): NiceScroll = js.native
  def onResize(e: stdLib.Event, page: NiceScrollPage): NiceScroll = js.native
  def remove(): scala.Unit = js.native
  def resize(): NiceScroll = js.native
  def resize(e: stdLib.Event): NiceScroll = js.native
  def resize(e: stdLib.Event, page: NiceScrollPage): NiceScroll = js.native
  def show(): NiceScroll = js.native
  def stop(): NiceScroll = js.native
  def toggle(): NiceScroll = js.native
}

