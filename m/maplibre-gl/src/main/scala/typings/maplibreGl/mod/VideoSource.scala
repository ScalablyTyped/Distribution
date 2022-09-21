package typings.maplibreGl.mod

import typings.std.HTMLVideoElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("maplibre-gl", "VideoSource")
@js.native
open class VideoSource protected () extends ImageSource {
  /**
  	 * @private
  	 */
  def this(id: String, options: VideoSourceSpecification, dispatcher: Dispatcher, eventedParent: Evented) = this()
  
  /**
  	 * Returns the HTML `video` element.
  	 *
  	 * @returns {HTMLVideoElement} The HTML `video` element.
  	 */
  def getVideo(): HTMLVideoElement = js.native
  
  @JSName("onAdd")
  def onAdd_MVideoSource(map: Map): scala.Unit = js.native
  
  @JSName("options")
  var options_VideoSource: VideoSourceSpecification = js.native
  
  /**
  	 * Pauses the video.
  	 */
  def pause(): scala.Unit = js.native
  
  /**
  	 * Plays the video.
  	 */
  def play(): scala.Unit = js.native
  
  /**
  	 * Sets the video's coordinates and re-renders the map.
  	 *
  	 * @method setCoordinates
  	 * @instance
  	 * @memberof VideoSource
  	 * @returns {VideoSource} this
  	 */
  @JSName("prepare")
  def prepare_MVideoSource(): scala.Unit = js.native
  
  @JSName("roundZoom")
  var roundZoom_VideoSource: Boolean = js.native
  
  /**
  	 * Sets playback to a timestamp, in seconds.
  	 * @private
  	 */
  def seek(seconds: Double): scala.Unit = js.native
  
  var urls: js.Array[String] = js.native
  
  var video: HTMLVideoElement = js.native
}
