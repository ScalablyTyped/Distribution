package typings.hafasClient.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait StopOptions extends js.Object {
  
  /**
    * parse & expose entrances of stops/stations?
    * @default true
    */
  var entrances: js.UndefOr[Boolean] = js.native
  
  /**
    * Language of the results
    * @default en
    */
  var language: js.UndefOr[String] = js.native
  
  /**
    * parse & expose lines at the stop/station?
    * @default false
    */
  var linesOfStops: js.UndefOr[Boolean] = js.native
  
  /**
    * parse & expose hints & warnings?
    * @default true
    */
  var remarks: js.UndefOr[Boolean] = js.native
  
  /**
    * parse & expose sub-stops of stations?
    * @default true
    */
  var subStops: js.UndefOr[Boolean] = js.native
}
object StopOptions {
  
  @scala.inline
  def apply(): StopOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[StopOptions]
  }
  
  @scala.inline
  implicit class StopOptionsOps[Self <: StopOptions] (val x: Self) extends AnyVal {
    
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
    def setEntrances(value: Boolean): Self = this.set("entrances", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEntrances: Self = this.set("entrances", js.undefined)
    
    @scala.inline
    def setLanguage(value: String): Self = this.set("language", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLanguage: Self = this.set("language", js.undefined)
    
    @scala.inline
    def setLinesOfStops(value: Boolean): Self = this.set("linesOfStops", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLinesOfStops: Self = this.set("linesOfStops", js.undefined)
    
    @scala.inline
    def setRemarks(value: Boolean): Self = this.set("remarks", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRemarks: Self = this.set("remarks", js.undefined)
    
    @scala.inline
    def setSubStops(value: Boolean): Self = this.set("subStops", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSubStops: Self = this.set("subStops", js.undefined)
  }
}
