package typings.kendoUi.kendo.ui

import typings.kendoUi.JQuery
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait MediaPlayer extends Widget {
  
  def fullScreen(): Boolean = js.native
  def fullScreen(value: Boolean): Unit = js.native
  
  def isEnded(): Boolean = js.native
  
  def isPaused(): Boolean = js.native
  
  def isPlaying(): Boolean = js.native
  
  def media(): js.Any = js.native
  def media(value: js.Any): Unit = js.native
  
  def mute(value: Boolean): Boolean = js.native
  
  @JSName("options")
  var options_MediaPlayer: MediaPlayerOptions = js.native
  
  def pause(): Unit = js.native
  
  def play(): Unit = js.native
  
  def seek(milliseconds: Double): Double = js.native
  
  def stop(): Unit = js.native
  
  def titlebar(): JQuery = js.native
  
  def toolbar(): ToolBar = js.native
  
  def volume(): Double = js.native
  def volume(value: Double): Unit = js.native
  
  var wrapper: JQuery = js.native
}
