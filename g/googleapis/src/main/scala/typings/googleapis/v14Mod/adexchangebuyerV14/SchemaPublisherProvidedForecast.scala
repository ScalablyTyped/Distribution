package typings.googleapis.v14Mod.adexchangebuyerV14

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * This message carries publisher provided forecasting information.
  */
trait SchemaPublisherProvidedForecast extends StObject {
  
  /**
    * Publisher provided dimensions. E.g. geo, sizes etc...
    */
  var dimensions: js.UndefOr[js.Array[SchemaDimension]] = js.undefined
  
  /**
    * Publisher provided weekly impressions.
    */
  var weeklyImpressions: js.UndefOr[String] = js.undefined
  
  /**
    * Publisher provided weekly uniques.
    */
  var weeklyUniques: js.UndefOr[String] = js.undefined
}
object SchemaPublisherProvidedForecast {
  
  @scala.inline
  def apply(): SchemaPublisherProvidedForecast = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaPublisherProvidedForecast]
  }
  
  @scala.inline
  implicit class SchemaPublisherProvidedForecastMutableBuilder[Self <: SchemaPublisherProvidedForecast] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDimensions(value: js.Array[SchemaDimension]): Self = StObject.set(x, "dimensions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDimensionsUndefined: Self = StObject.set(x, "dimensions", js.undefined)
    
    @scala.inline
    def setDimensionsVarargs(value: SchemaDimension*): Self = StObject.set(x, "dimensions", js.Array(value :_*))
    
    @scala.inline
    def setWeeklyImpressions(value: String): Self = StObject.set(x, "weeklyImpressions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWeeklyImpressionsUndefined: Self = StObject.set(x, "weeklyImpressions", js.undefined)
    
    @scala.inline
    def setWeeklyUniques(value: String): Self = StObject.set(x, "weeklyUniques", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWeeklyUniquesUndefined: Self = StObject.set(x, "weeklyUniques", js.undefined)
  }
}
