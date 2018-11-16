package typings
package heremapsLib.HNs.mapNs.renderNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
             * This is an abstract class representing a render engine. Render engines are used to render the geographical position from a view model on the
             * screen (viewport element). The rendered result may be different for different engines, because every engine uses its own capabilities and
             * specific implementation to present the current view model data in best possible way. For example, 2D engines create a two-dimensional flat
             * map composed of tiles, while 3D engines can generate panoramas displaying the same coordinates as a 'street view'.
             */
@JSGlobal("H.map.render.RenderEngine")
@js.native
class RenderEngine protected ()
  extends heremapsLib.HNs.utilNs.EventTarget {
  /**
                   * Constructor
                   * @param viewPort {H.map.ViewPort} - An object representing the map viewport
                   * @param viewModel {H.map.ViewModel} - An object representing a view of the map
                   * @param dataModel {H.map.DataModel} - An object encapsulating the data to be rendered on the map (layers and objects)
                   * @param options {H.map.render.RenderEngine.Options} - An object containing the render engine initialization options
                   */
  def this(viewPort: heremapsLib.HNs.mapNs.ViewPort, viewModel: heremapsLib.HNs.mapNs.ViewModel, dataModel: heremapsLib.HNs.mapNs.DataModel, options: heremapsLib.HNs.mapNs.renderNs.RenderEngineNs.Options) = this()
  /**
                   * This method adds a listener for a specific event.
                   * Note that to prevent potential memory leaks, you must either call removeEventListener or dispose on the given object when you no longer need it.
                   * @param type {string} - The name of the event
                   * @param handler {!Function} - An event handler function
                   * @param opt_capture {boolean=} - true indicates that the method should listen in the capture phase (bubble otherwise)
                   * @param opt_scope {Object=} - An object defining the scope for the handler function
                   */
  def addEventListener(`type`: java.lang.String, handler: js.Function1[/* evt */ stdLib.Event, scala.Unit]): scala.Unit = js.native
  /**
                   * This method adds a listener for a specific event.
                   * Note that to prevent potential memory leaks, you must either call removeEventListener or dispose on the given object when you no longer need it.
                   * @param type {string} - The name of the event
                   * @param handler {!Function} - An event handler function
                   * @param opt_capture {boolean=} - true indicates that the method should listen in the capture phase (bubble otherwise)
                   * @param opt_scope {Object=} - An object defining the scope for the handler function
                   */
  def addEventListener(
    `type`: java.lang.String,
    handler: js.Function1[/* evt */ stdLib.Event, scala.Unit],
    opt_capture: scala.Boolean
  ): scala.Unit = js.native
  /**
                   * This method adds a listener for a specific event.
                   * Note that to prevent potential memory leaks, you must either call removeEventListener or dispose on the given object when you no longer need it.
                   * @param type {string} - The name of the event
                   * @param handler {!Function} - An event handler function
                   * @param opt_capture {boolean=} - true indicates that the method should listen in the capture phase (bubble otherwise)
                   * @param opt_scope {Object=} - An object defining the scope for the handler function
                   */
  def addEventListener(
    `type`: java.lang.String,
    handler: js.Function1[/* evt */ stdLib.Event, scala.Unit],
    opt_capture: scala.Boolean,
    opt_scope: js.Object
  ): scala.Unit = js.native
  /**
                   * This method adds a callback which is triggered when the EventTarget object is being disposed.
                   * @param callback {!Function} - The callback function.
                   * @param opt_scope {Object=} - An optional scope for the callback function
                   */
  def addOnDisposeCallback(callback: js.Function0[scala.Unit], opt_scope: js.Object): scala.Unit = js.native
  /**
                   * This method removes a previously added listener from the EventTarget instance.
                   * @param type {string} - The name of the event
                   * @param handler {!Function} - A previously added event handler
                   * @param opt_capture {boolean=} - true indicates that the method should listen in the capture phase (bubble otherwise)
                   * @param opt_scope {Object=} - An object defining the scope for the handler function
                   */
  def removeEventListener(`type`: java.lang.String, handler: js.Function1[/* evt */ stdLib.Event, scala.Unit]): scala.Unit = js.native
  /**
                   * This method removes a previously added listener from the EventTarget instance.
                   * @param type {string} - The name of the event
                   * @param handler {!Function} - A previously added event handler
                   * @param opt_capture {boolean=} - true indicates that the method should listen in the capture phase (bubble otherwise)
                   * @param opt_scope {Object=} - An object defining the scope for the handler function
                   */
  def removeEventListener(
    `type`: java.lang.String,
    handler: js.Function1[/* evt */ stdLib.Event, scala.Unit],
    opt_capture: scala.Boolean
  ): scala.Unit = js.native
  /**
                   * This method removes a previously added listener from the EventTarget instance.
                   * @param type {string} - The name of the event
                   * @param handler {!Function} - A previously added event handler
                   * @param opt_capture {boolean=} - true indicates that the method should listen in the capture phase (bubble otherwise)
                   * @param opt_scope {Object=} - An object defining the scope for the handler function
                   */
  def removeEventListener(
    `type`: java.lang.String,
    handler: js.Function1[/* evt */ stdLib.Event, scala.Unit],
    opt_capture: scala.Boolean,
    opt_scope: js.Object
  ): scala.Unit = js.native
}

