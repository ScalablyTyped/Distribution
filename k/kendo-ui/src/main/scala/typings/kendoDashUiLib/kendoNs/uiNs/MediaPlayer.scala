package typings
package kendoDashUiLib.kendoNs.uiNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("kendo.ui.MediaPlayer")
@js.native
class MediaPlayer protected () extends Widget {
  def this(element: stdLib.Element) = this()
  def this(element: stdLib.Element, options: MediaPlayerOptions) = this()
  @JSName("options")
  var options_MediaPlayer: MediaPlayerOptions = js.native
  var wrapper: kendoDashUiLib.JQuery = js.native
  def fullScreen(): scala.Boolean = js.native
  def fullScreen(value: scala.Boolean): scala.Unit = js.native
  def isEnded(): scala.Boolean = js.native
  def isPaused(): scala.Boolean = js.native
  def isPlaying(): scala.Boolean = js.native
  def media(): js.Any = js.native
  def media(value: js.Any): scala.Unit = js.native
  def mute(value: scala.Boolean): scala.Boolean = js.native
  def pause(): scala.Unit = js.native
  def play(): scala.Unit = js.native
  def seek(milliseconds: scala.Double): scala.Double = js.native
  def stop(): scala.Unit = js.native
  def titlebar(): kendoDashUiLib.JQuery = js.native
  def toolbar(): ToolBar = js.native
  def volume(): scala.Double = js.native
  def volume(value: scala.Double): scala.Unit = js.native
}

@JSGlobal("kendo.ui.MediaPlayer")
@js.native
object MediaPlayer extends js.Object {
  var fn: kendoDashUiLib.kendoNs.uiNs.MediaPlayer = js.native
  def extend(proto: js.Object): kendoDashUiLib.kendoNs.uiNs.MediaPlayer = js.native
}

