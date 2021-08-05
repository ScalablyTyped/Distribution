package typings.maximMazurokGapiClientAdexchangebuyer.gapi.client.adexchangebuyer

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PublisherProvidedForecast extends StObject {
  
  /** Publisher provided dimensions. E.g. geo, sizes etc... */
  var dimensions: js.UndefOr[js.Array[Dimension]] = js.undefined
  
  /** Publisher provided weekly impressions. */
  var weeklyImpressions: js.UndefOr[String] = js.undefined
  
  /** Publisher provided weekly uniques. */
  var weeklyUniques: js.UndefOr[String] = js.undefined
}
object PublisherProvidedForecast {
  
  inline def apply(): PublisherProvidedForecast = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PublisherProvidedForecast]
  }
  
  extension [Self <: PublisherProvidedForecast](x: Self) {
    
    inline def setDimensions(value: js.Array[Dimension]): Self = StObject.set(x, "dimensions", value.asInstanceOf[js.Any])
    
    inline def setDimensionsUndefined: Self = StObject.set(x, "dimensions", js.undefined)
    
    inline def setDimensionsVarargs(value: Dimension*): Self = StObject.set(x, "dimensions", js.Array(value :_*))
    
    inline def setWeeklyImpressions(value: String): Self = StObject.set(x, "weeklyImpressions", value.asInstanceOf[js.Any])
    
    inline def setWeeklyImpressionsUndefined: Self = StObject.set(x, "weeklyImpressions", js.undefined)
    
    inline def setWeeklyUniques(value: String): Self = StObject.set(x, "weeklyUniques", value.asInstanceOf[js.Any])
    
    inline def setWeeklyUniquesUndefined: Self = StObject.set(x, "weeklyUniques", js.undefined)
  }
}
