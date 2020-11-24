package typings.googleapis.v14Mod.adexchangebuyerV14

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * This message carries publisher provided forecasting information.
  */
@js.native
trait SchemaPublisherProvidedForecast extends js.Object {
  
  /**
    * Publisher provided dimensions. E.g. geo, sizes etc...
    */
  var dimensions: js.UndefOr[js.Array[SchemaDimension]] = js.native
  
  /**
    * Publisher provided weekly impressions.
    */
  var weeklyImpressions: js.UndefOr[String] = js.native
  
  /**
    * Publisher provided weekly uniques.
    */
  var weeklyUniques: js.UndefOr[String] = js.native
}
object SchemaPublisherProvidedForecast {
  
  @scala.inline
  def apply(): SchemaPublisherProvidedForecast = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaPublisherProvidedForecast]
  }
  
  @scala.inline
  implicit class SchemaPublisherProvidedForecastOps[Self <: SchemaPublisherProvidedForecast] (val x: Self) extends AnyVal {
    
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
    def setDimensionsVarargs(value: SchemaDimension*): Self = this.set("dimensions", js.Array(value :_*))
    
    @scala.inline
    def setDimensions(value: js.Array[SchemaDimension]): Self = this.set("dimensions", value.asInstanceOf[js.Any])
    
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
