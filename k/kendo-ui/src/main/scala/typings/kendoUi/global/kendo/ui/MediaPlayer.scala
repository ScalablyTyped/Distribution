package typings.kendoUi.global.kendo.ui

import typings.kendoUi.kendo.ui.MediaPlayerOptions
import typings.std.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("kendo.ui.MediaPlayer")
@js.native
class MediaPlayer protected ()
  extends StObject
     with typings.kendoUi.kendo.ui.MediaPlayer {
  def this(element: Element) = this()
  def this(element: Element, options: MediaPlayerOptions) = this()
}
object MediaPlayer {
  
  @JSGlobal("kendo.ui.MediaPlayer")
  @js.native
  val ^ : js.Any = js.native
  
  /* static member */
  inline def extend(proto: js.Object): typings.kendoUi.kendo.ui.MediaPlayer = ^.asInstanceOf[js.Dynamic].applyDynamic("extend")(proto.asInstanceOf[js.Any]).asInstanceOf[typings.kendoUi.kendo.ui.MediaPlayer]
  
  /* static member */
  @JSGlobal("kendo.ui.MediaPlayer.fn")
  @js.native
  def fn: typings.kendoUi.kendo.ui.MediaPlayer = js.native
  inline def fn_=(x: typings.kendoUi.kendo.ui.MediaPlayer): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("fn")(x.asInstanceOf[js.Any])
}
