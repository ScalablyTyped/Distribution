package typings.maplibreGl.mod

import typings.std.HTMLCanvasElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("maplibre-gl", "CanvasSource")
@js.native
open class CanvasSource protected () extends ImageSource {
  /**
  	 * @private
  	 */
  def this(id: String, options: CanvasSourceSpecification, dispatcher: Dispatcher, eventedParent: Evented) = this()
  
  def _hasInvalidDimensions(): Boolean = js.native
  
  var _playing: Boolean = js.native
  
  var animate: Boolean = js.native
  
  var canvas: HTMLCanvasElement = js.native
  
  /**
  	 * Returns the HTML `canvas` element.
  	 *
  	 * @returns {HTMLCanvasElement} The HTML `canvas` element.
  	 */
  def getCanvas(): HTMLCanvasElement = js.native
  
  var height: Double = js.native
  
  @JSName("onAdd")
  def onAdd_MCanvasSource(map: Map): scala.Unit = js.native
  
  @JSName("onRemove")
  def onRemove_MCanvasSource(): scala.Unit = js.native
  
  @JSName("options")
  var options_CanvasSource: CanvasSourceSpecification = js.native
  
  def pause(): scala.Unit = js.native
  
  def play(): scala.Unit = js.native
  
  @JSName("prepare")
  def prepare_MCanvasSource(): scala.Unit = js.native
  
  var width: Double = js.native
}
