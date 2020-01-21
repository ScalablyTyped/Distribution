package typings.jqueryNicescroll.JQueryNiceScroll

import typings.std.Event_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait NiceScroll extends js.Object {
  def doScrollLeft(x: Double, duration: Double): Unit = js.native
  def doScrollPos(x: Double, y: Double, spd: Double): Unit = js.native
  def doScrollTop(x: Double, duration: Double): Unit = js.native
  def hide(): NiceScroll = js.native
  def onResize(): NiceScroll = js.native
  def onResize(e: Event_): NiceScroll = js.native
  def onResize(e: Event_, page: NiceScrollPage): NiceScroll = js.native
  def remove(): Unit = js.native
  def resize(): NiceScroll = js.native
  def resize(e: Event_): NiceScroll = js.native
  def resize(e: Event_, page: NiceScrollPage): NiceScroll = js.native
  def show(): NiceScroll = js.native
  def stop(): NiceScroll = js.native
  def toggle(): NiceScroll = js.native
}

