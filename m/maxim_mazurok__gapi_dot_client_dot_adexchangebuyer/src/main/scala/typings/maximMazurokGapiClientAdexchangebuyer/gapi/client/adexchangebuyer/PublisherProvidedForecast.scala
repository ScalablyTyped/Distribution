package typings.maximMazurokGapiClientAdexchangebuyer.gapi.client.adexchangebuyer

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PublisherProvidedForecast extends StObject {
  
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
  implicit class PublisherProvidedForecastMutableBuilder[Self <: PublisherProvidedForecast] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDimensions(value: js.Array[Dimension]): Self = StObject.set(x, "dimensions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDimensionsUndefined: Self = StObject.set(x, "dimensions", js.undefined)
    
    @scala.inline
    def setDimensionsVarargs(value: Dimension*): Self = StObject.set(x, "dimensions", js.Array(value :_*))
    
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
