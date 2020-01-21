package typings.igniteUi.Infragistics

import typings.igniteUi.ZoombarProviderDefaultSettings
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Infragistics.ZoombarProviderDefault")
@js.native
class ZoombarProviderDefault protected () extends js.Object {
  def this(settings: ZoombarProviderDefaultSettings) = this()
  /**
  	 * Will be called before the provider instance is deleted (to unbind jQuery events, etc.)
  	 */
  def clean(): Unit = js.native
  /**
  	 * Alters specific options so that the the clone is more suitable for its purpose
  	 *
  	 * @param options the base options of the widget obtained from getBaseOpts
  	 */
  def cleanOptsForZoom(options: js.Object): Unit = js.native
  /**
  	 * Will be called by the Zoombar if a clone of the target widget should be created
  	 *
  	 * @param container a jQuery wrapped element to create the clone component in
  	 * @param options the options that are obtained from cleanOptsForZoom
  	 */
  def createClone(container: js.Object, options: js.Object): Unit = js.native
  /**
  	 * Gets basic options for initializing the clone, based on the options the target is initialized with
  	 *
  	 * @param options if the Zoombar has a copy of the options object it'll pass it to the provider
  	 */
  def getBaseOpts(options: js.Object): Unit = js.native
  /**
  	 * Sets the width and height of the clone component
  	 *
  	 * @param width The width to set in pixels or string (px or % -affixed).
  	 * @param height The height to set in pixels or string (px or % -affixed).
  	 */
  def setSize(width: js.Object, height: js.Object): Unit = js.native
  /**
  	 * Sets the target widget min window width (to be in sync with the same property of the zoombar)
  	 *
  	 * @param minWidth a number from 0 to 1 representing the minimal width (i.e. maximal zoom) the zoom window can take as a fraction of the total one
  	 */
  def syncMinWidth(minWidth: Double): Unit = js.native
  /**
  	 * Gets/sets the target object
  	 *
  	 * @param obj the new target component instance to set
  	 */
  def targetObject(): Unit = js.native
  def targetObject(obj: js.Object): Unit = js.native
  /**
  	 * Returns the target widget width property
  	 */
  def targetWidth(): Unit = js.native
  /**
  	 * Jshint ignore:line
  	 *
  	 * @param a
  	 * @param b
  	 */
  def update(a: js.Object, b: js.Object): Unit = js.native
  /**
  	 * Returns the provider"s widget name
  	 */
  def widgetName(): Unit = js.native
}

