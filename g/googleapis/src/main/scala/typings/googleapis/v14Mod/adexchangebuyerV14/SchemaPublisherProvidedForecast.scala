package typings.googleapis.v14Mod.adexchangebuyerV14

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaPublisherProvidedForecast extends StObject {
  
  /**
    * Publisher provided dimensions. E.g. geo, sizes etc...
    */
  var dimensions: js.UndefOr[js.Array[SchemaDimension]] = js.undefined
  
  /**
    * Publisher provided weekly impressions.
    */
  var weeklyImpressions: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Publisher provided weekly uniques.
    */
  var weeklyUniques: js.UndefOr[String | Null] = js.undefined
}
object SchemaPublisherProvidedForecast {
  
  inline def apply(): SchemaPublisherProvidedForecast = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaPublisherProvidedForecast]
  }
  
  extension [Self <: SchemaPublisherProvidedForecast](x: Self) {
    
    inline def setDimensions(value: js.Array[SchemaDimension]): Self = StObject.set(x, "dimensions", value.asInstanceOf[js.Any])
    
    inline def setDimensionsUndefined: Self = StObject.set(x, "dimensions", js.undefined)
    
    inline def setDimensionsVarargs(value: SchemaDimension*): Self = StObject.set(x, "dimensions", js.Array(value*))
    
    inline def setWeeklyImpressions(value: String): Self = StObject.set(x, "weeklyImpressions", value.asInstanceOf[js.Any])
    
    inline def setWeeklyImpressionsNull: Self = StObject.set(x, "weeklyImpressions", null)
    
    inline def setWeeklyImpressionsUndefined: Self = StObject.set(x, "weeklyImpressions", js.undefined)
    
    inline def setWeeklyUniques(value: String): Self = StObject.set(x, "weeklyUniques", value.asInstanceOf[js.Any])
    
    inline def setWeeklyUniquesNull: Self = StObject.set(x, "weeklyUniques", null)
    
    inline def setWeeklyUniquesUndefined: Self = StObject.set(x, "weeklyUniques", js.undefined)
  }
}
