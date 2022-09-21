package typings.maximMazurokGapiClientContent.gapi.client.content

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ProductViewItemIssueIssueSeverityPerDestination extends StObject {
  
  /** List of demoted countries in the destination. */
  var demotedCountries: js.UndefOr[js.Array[String]] = js.undefined
  
  /** Issue destination. */
  var destination: js.UndefOr[String] = js.undefined
  
  /** List of disapproved countries in the destination. */
  var disapprovedCountries: js.UndefOr[js.Array[String]] = js.undefined
}
object ProductViewItemIssueIssueSeverityPerDestination {
  
  inline def apply(): ProductViewItemIssueIssueSeverityPerDestination = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ProductViewItemIssueIssueSeverityPerDestination]
  }
  
  extension [Self <: ProductViewItemIssueIssueSeverityPerDestination](x: Self) {
    
    inline def setDemotedCountries(value: js.Array[String]): Self = StObject.set(x, "demotedCountries", value.asInstanceOf[js.Any])
    
    inline def setDemotedCountriesUndefined: Self = StObject.set(x, "demotedCountries", js.undefined)
    
    inline def setDemotedCountriesVarargs(value: String*): Self = StObject.set(x, "demotedCountries", js.Array(value*))
    
    inline def setDestination(value: String): Self = StObject.set(x, "destination", value.asInstanceOf[js.Any])
    
    inline def setDestinationUndefined: Self = StObject.set(x, "destination", js.undefined)
    
    inline def setDisapprovedCountries(value: js.Array[String]): Self = StObject.set(x, "disapprovedCountries", value.asInstanceOf[js.Any])
    
    inline def setDisapprovedCountriesUndefined: Self = StObject.set(x, "disapprovedCountries", js.undefined)
    
    inline def setDisapprovedCountriesVarargs(value: String*): Self = StObject.set(x, "disapprovedCountries", js.Array(value*))
  }
}
