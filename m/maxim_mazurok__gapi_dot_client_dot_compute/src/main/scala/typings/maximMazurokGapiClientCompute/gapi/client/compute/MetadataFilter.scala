package typings.maximMazurokGapiClientCompute.gapi.client.compute

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MetadataFilter extends StObject {
  
  /** The list of label value pairs that must match labels in the provided metadata based on filterMatchCriteria This list must not be empty and can have at the most 64 entries. */
  var filterLabels: js.UndefOr[js.Array[MetadataFilterLabelMatch]] = js.undefined
  
  /**
    * Specifies how individual filterLabel matches within the list of filterLabels contribute towards the overall metadataFilter match. Supported values are: - MATCH_ANY: At least one of
    * the filterLabels must have a matching label in the provided metadata. - MATCH_ALL: All filterLabels must have matching labels in the provided metadata.
    */
  var filterMatchCriteria: js.UndefOr[String] = js.undefined
}
object MetadataFilter {
  
  inline def apply(): MetadataFilter = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MetadataFilter]
  }
  
  extension [Self <: MetadataFilter](x: Self) {
    
    inline def setFilterLabels(value: js.Array[MetadataFilterLabelMatch]): Self = StObject.set(x, "filterLabels", value.asInstanceOf[js.Any])
    
    inline def setFilterLabelsUndefined: Self = StObject.set(x, "filterLabels", js.undefined)
    
    inline def setFilterLabelsVarargs(value: MetadataFilterLabelMatch*): Self = StObject.set(x, "filterLabels", js.Array(value*))
    
    inline def setFilterMatchCriteria(value: String): Self = StObject.set(x, "filterMatchCriteria", value.asInstanceOf[js.Any])
    
    inline def setFilterMatchCriteriaUndefined: Self = StObject.set(x, "filterMatchCriteria", js.undefined)
  }
}
