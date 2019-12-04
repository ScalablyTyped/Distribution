package typings.atJupyterlabSettingeditor.libPluginlistMod

import typings.atJupyterlabCoreutils.libTokensMod.ISettingRegistry
import typings.atJupyterlabSettingeditor.libPluginlistMod.PluginList.IOptions
import typings.atPhosphorSignaling.atPhosphorSignalingMod.ISignal
import typings.atPhosphorWidgets.atPhosphorWidgetsMod.Widget
import typings.std.Event
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@jupyterlab/settingeditor/lib/pluginlist", "PluginList")
@js.native
class PluginList_ protected () extends Widget {
  /**
    * Create a new plugin list.
    */
  def this(options: IOptions) = this()
  var _changed: js.Any = js.native
  var _confirm: js.Any = js.native
  /**
    * Handle the `'mousedown'` event for the plugin list.
    *
    * @param event - The DOM event sent to the widget
    */
  var _evtMousedown: js.Any = js.native
  var _scrollTop: js.Any = js.native
  var _selection: js.Any = js.native
  /**
    * A signal emitted when a list user interaction happens.
    */
  val changed: ISignal[this.type, Unit] = js.native
  /**
    * The setting registry.
    */
  val registry: ISettingRegistry = js.native
  /**
    * The selection value of the plugin list.
    */
  val scrollTop: Double = js.native
  /**
    * The selection value of the plugin list.
    */
  var selection: String = js.native
  /**
    * Handle the DOM events for the widget.
    *
    * @param event - The DOM event sent to the widget.
    *
    * #### Notes
    * This method implements the DOM `EventListener` interface and is
    * called in response to events on the plugin list's node. It should
    * not be called directly by user code.
    */
  def handleEvent(event: Event): Unit = js.native
}

