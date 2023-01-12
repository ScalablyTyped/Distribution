package typings.maximMazurokGapiClientAdexchangebuyer2.gapi.client.adexchangebuyer2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RowDimensions extends StObject {
  
  /**
    * The publisher identifier for this row, if a breakdown by
    * [BreakdownDimension.PUBLISHER_IDENTIFIER](https://developers.google.com/authorized-buyers/apis/reference/rest/v2beta1/bidders.accounts.filterSets#FilterSet.BreakdownDimension) was
    * requested.
    */
  var publisherIdentifier: js.UndefOr[String] = js.undefined
  
  /** The time interval that this row represents. */
  var timeInterval: js.UndefOr[TimeInterval] = js.undefined
}
object RowDimensions {
  
  inline def apply(): RowDimensions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RowDimensions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: RowDimensions] (val x: Self) extends AnyVal {
    
    inline def setPublisherIdentifier(value: String): Self = StObject.set(x, "publisherIdentifier", value.asInstanceOf[js.Any])
    
    inline def setPublisherIdentifierUndefined: Self = StObject.set(x, "publisherIdentifier", js.undefined)
    
    inline def setTimeInterval(value: TimeInterval): Self = StObject.set(x, "timeInterval", value.asInstanceOf[js.Any])
    
    inline def setTimeIntervalUndefined: Self = StObject.set(x, "timeInterval", js.undefined)
  }
}
