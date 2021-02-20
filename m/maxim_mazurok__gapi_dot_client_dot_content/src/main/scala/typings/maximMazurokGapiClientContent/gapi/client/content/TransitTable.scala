package typings.maximMazurokGapiClientContent.gapi.client.content

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TransitTable extends StObject {
  
  /**
    * A list of postal group names. The last value can be `"all other locations"`. Example: `["zone 1", "zone 2", "all other locations"]`. The referred postal code groups must match the
    * delivery country of the service.
    */
  var postalCodeGroupNames: js.UndefOr[js.Array[String]] = js.native
  
  var rows: js.UndefOr[js.Array[TransitTableTransitTimeRow]] = js.native
  
  /** A list of transit time labels. The last value can be `"all other labels"`. Example: `["food", "electronics", "all other labels"]`. */
  var transitTimeLabels: js.UndefOr[js.Array[String]] = js.native
}
object TransitTable {
  
  @scala.inline
  def apply(): TransitTable = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TransitTable]
  }
  
  @scala.inline
  implicit class TransitTableMutableBuilder[Self <: TransitTable] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setPostalCodeGroupNames(value: js.Array[String]): Self = StObject.set(x, "postalCodeGroupNames", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPostalCodeGroupNamesUndefined: Self = StObject.set(x, "postalCodeGroupNames", js.undefined)
    
    @scala.inline
    def setPostalCodeGroupNamesVarargs(value: String*): Self = StObject.set(x, "postalCodeGroupNames", js.Array(value :_*))
    
    @scala.inline
    def setRows(value: js.Array[TransitTableTransitTimeRow]): Self = StObject.set(x, "rows", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRowsUndefined: Self = StObject.set(x, "rows", js.undefined)
    
    @scala.inline
    def setRowsVarargs(value: TransitTableTransitTimeRow*): Self = StObject.set(x, "rows", js.Array(value :_*))
    
    @scala.inline
    def setTransitTimeLabels(value: js.Array[String]): Self = StObject.set(x, "transitTimeLabels", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTransitTimeLabelsUndefined: Self = StObject.set(x, "transitTimeLabels", js.undefined)
    
    @scala.inline
    def setTransitTimeLabelsVarargs(value: String*): Self = StObject.set(x, "transitTimeLabels", js.Array(value :_*))
  }
}
