package typings.hafasClient.mod

import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RadarOptions extends js.Object {
  
  /**
    * compute frames for the next n seconds
    * @default 20
    */
  var duration: js.UndefOr[Double] = js.native
  
  /**
    * parse & expose entrances of stops/stations?
    * @default true
    */
  var entrances: js.UndefOr[Boolean] = js.native
  
  /**
    * nr of frames to compute
    * @default 3
    */
  var frames: js.UndefOr[Double] = js.native
  
  /**
    * return a shape for the trip?
    * @default false
    */
  var polylines: js.UndefOr[Boolean] = js.native
  
  /**
    * optionally an object of booleans
    * @default null
    */
  var products: js.UndefOr[Boolean | js.Object] = js.native
  
  /**
    * maximum number of vehicles
    * @default 256
    */
  var results: js.UndefOr[Double] = js.native
  
  /**
    * parse & expose sub-stops of stations?
    * @default true
    */
  var subStops: js.UndefOr[Boolean] = js.native
  
  /**
    * when
    * @default undefined
    */
  var when: js.UndefOr[Date] = js.native
}
object RadarOptions {
  
  @scala.inline
  def apply(): RadarOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RadarOptions]
  }
  
  @scala.inline
  implicit class RadarOptionsOps[Self <: RadarOptions] (val x: Self) extends AnyVal {
    
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
    def setDuration(value: Double): Self = this.set("duration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDuration: Self = this.set("duration", js.undefined)
    
    @scala.inline
    def setEntrances(value: Boolean): Self = this.set("entrances", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEntrances: Self = this.set("entrances", js.undefined)
    
    @scala.inline
    def setFrames(value: Double): Self = this.set("frames", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFrames: Self = this.set("frames", js.undefined)
    
    @scala.inline
    def setPolylines(value: Boolean): Self = this.set("polylines", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePolylines: Self = this.set("polylines", js.undefined)
    
    @scala.inline
    def setProducts(value: Boolean | js.Object): Self = this.set("products", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteProducts: Self = this.set("products", js.undefined)
    
    @scala.inline
    def setResults(value: Double): Self = this.set("results", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteResults: Self = this.set("results", js.undefined)
    
    @scala.inline
    def setSubStops(value: Boolean): Self = this.set("subStops", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSubStops: Self = this.set("subStops", js.undefined)
    
    @scala.inline
    def setWhen(value: Date): Self = this.set("when", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteWhen: Self = this.set("when", js.undefined)
  }
}
