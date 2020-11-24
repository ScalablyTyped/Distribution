package typings.heremaps.H.map.layer

import typings.heremaps.H.geo.Rect
import typings.heremaps.H.map.layer.IMarkerLayer.Response
import typings.heremaps.H.map.layer.IMarkerLayer.TiledResponse
import typings.heremaps.H.math.Point
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * This interface describes a layer which provides marker objects to the renderer.
  */
@js.native
trait IMarkerLayer_ extends js.Object {
  
  /**
    * This method requests dom marker objects for provided bounding rectangle.
    * @param boundingRect {H.geo.Rect} - the bounding rectangle for which marker are to be returned
    * @param zoomLevel {number} - The zoom level for which the objects are requested
    * @param cacheOnly {boolean} - Indicates whether only cached objects are to be considered
    * @param prioCenter {H.math.Point} - The priority center as an offset in screen pixel relative to the center
    * @returns {(H.map.layer.IMarkerLayer.Response | H.map.layer.IMarkerLayer.TiledResponse)} - a response object containing the number of markers and the markers themselves
    */
  def requestDomMarkers(boundingRect: Rect, zoomLevel: Double, cacheOnly: Boolean, prioCenter: Point): Response | TiledResponse = js.native
  
  /**
    * This method requests marker objects for provided bounding rectangle.
    * @param boundingRect {H.geo.Rect} - the bounding rectangle for which marker are to be returned
    * @param zoomLevel {number} - The zoom level for which the objects are requested
    * @param cacheOnly {boolean} - Indicates whether only cached objects are to be considered
    * @param prioCenter {H.math.Point} - The priority center as an offset in screen pixel relative to the center
    * @returns {(H.map.layer.IMarkerLayer.Response | H.map.layer.IMarkerLayer.TiledResponse)} - a response object containing the number of markers and the markers themselves
    */
  def requestMarkers(boundingRect: Rect, zoomLevel: Double, cacheOnly: Boolean, prioCenter: Point): Response | TiledResponse = js.native
}
object IMarkerLayer_ {
  
  @scala.inline
  def apply(
    requestDomMarkers: (Rect, Double, Boolean, Point) => Response | TiledResponse,
    requestMarkers: (Rect, Double, Boolean, Point) => Response | TiledResponse
  ): IMarkerLayer_ = {
    val __obj = js.Dynamic.literal(requestDomMarkers = js.Any.fromFunction4(requestDomMarkers), requestMarkers = js.Any.fromFunction4(requestMarkers))
    __obj.asInstanceOf[IMarkerLayer_]
  }
  
  @scala.inline
  implicit class IMarkerLayer_Ops[Self <: IMarkerLayer_] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setRequestDomMarkers(value: (Rect, Double, Boolean, Point) => Response | TiledResponse): Self = this.set("requestDomMarkers", js.Any.fromFunction4(value))
    
    @scala.inline
    def setRequestMarkers(value: (Rect, Double, Boolean, Point) => Response | TiledResponse): Self = this.set("requestMarkers", js.Any.fromFunction4(value))
  }
}
