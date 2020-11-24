package typings.heremaps.H.map.provider.MarkerTileProvider

import typings.heremaps.H.map.AbstractMarker
import typings.heremaps.H.util.ICancelable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Options which are used to initialize the MarkerTileProvider object.
  * @property min {number=} - The minimal supported zoom level, default is 0
  * @property max {number=} - The maximal supported zoom level, default is 22
  * @property requestData {function(number, number, number, function(Array<H.map.AbstractMarker>), Function): H.util.ICancelable} - function that fetches marker data and creates array
  * of H.map.AbstractMarker that is passed success callback, if function fails to fetch data onError callback must be called
  * @property providesDomMarkers {boolean=} - indicates if markers provided are of type H.map.DomMarker or H.map.Marker, default is H.map.Marker
  */
@js.native
trait Options extends js.Object {
  
  var max: js.UndefOr[Double] = js.native
  
  var min: js.UndefOr[Double] = js.native
  
  var providesDomMarkers: js.UndefOr[Boolean] = js.native
  
  def requestData(
    n1: Double,
    n2: Double,
    n3: Double,
    markerCallback: js.Function1[/* markers */ js.Array[AbstractMarker], Unit],
    f: js.Function0[Unit]
  ): ICancelable = js.native
}
object Options {
  
  @scala.inline
  def apply(
    requestData: (Double, Double, Double, js.Function1[/* markers */ js.Array[AbstractMarker], Unit], js.Function0[Unit]) => ICancelable
  ): Options = {
    val __obj = js.Dynamic.literal(requestData = js.Any.fromFunction5(requestData))
    __obj.asInstanceOf[Options]
  }
  
  @scala.inline
  implicit class OptionsOps[Self <: Options] (val x: Self) extends AnyVal {
    
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
    def setRequestData(
      value: (Double, Double, Double, js.Function1[/* markers */ js.Array[AbstractMarker], Unit], js.Function0[Unit]) => ICancelable
    ): Self = this.set("requestData", js.Any.fromFunction5(value))
    
    @scala.inline
    def setMax(value: Double): Self = this.set("max", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMax: Self = this.set("max", js.undefined)
    
    @scala.inline
    def setMin(value: Double): Self = this.set("min", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMin: Self = this.set("min", js.undefined)
    
    @scala.inline
    def setProvidesDomMarkers(value: Boolean): Self = this.set("providesDomMarkers", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteProvidesDomMarkers: Self = this.set("providesDomMarkers", js.undefined)
  }
}
