package typings.maximMazurokGapiClientAdexchangebuyer.gapi.client.adexchangebuyer

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PublisherProvidedForecast extends js.Object {
  
  /** Publisher provided dimensions. E.g. geo, sizes etc... */
  var dimensions: js.UndefOr[js.Array[Dimension]] = js.native
  
  /** Publisher provided weekly impressions. */
  var weeklyImpressions: js.UndefOr[String] = js.native
  
  /** Publisher provided weekly uniques. */
  var weeklyUniques: js.UndefOr[String] = js.native
}
object PublisherProvidedForecast {
  
  @scala.inline
  def apply(): PublisherProvidedForecast = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PublisherProvidedForecast]
  }
  
  @scala.inline
  implicit class PublisherProvidedForecastOps[Self <: PublisherProvidedForecast] (val x: Self) extends AnyVal {
    
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
    def setDimensionsVarargs(value: Dimension*): Self = this.set("dimensions", js.Array(value :_*))
    
    @scala.inline
    def setDimensions(value: js.Array[Dimension]): Self = this.set("dimensions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDimensions: Self = this.set("dimensions", js.undefined)
    
    @scala.inline
    def setWeeklyImpressions(value: String): Self = this.set("weeklyImpressions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteWeeklyImpressions: Self = this.set("weeklyImpressions", js.undefined)
    
    @scala.inline
    def setWeeklyUniques(value: String): Self = this.set("weeklyUniques", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteWeeklyUniques: Self = this.set("weeklyUniques", js.undefined)
  }
}
