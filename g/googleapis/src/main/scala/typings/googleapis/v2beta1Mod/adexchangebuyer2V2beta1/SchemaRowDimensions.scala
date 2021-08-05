package typings.googleapis.v2beta1Mod.adexchangebuyer2V2beta1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A response may include multiple rows, breaking down along various
  * dimensions. Encapsulates the values of all dimensions for a given row.
  */
trait SchemaRowDimensions extends StObject {
  
  /**
    * The publisher identifier for this row, if a breakdown by
    * [BreakdownDimension.PUBLISHER_IDENTIFIER](https://developers.google.com/authorized-buyers/apis/reference/rest/v2beta1/bidders.accounts.filterSets#FilterSet.BreakdownDimension)
    * was requested.
    */
  var publisherIdentifier: js.UndefOr[String] = js.undefined
  
  /**
    * The time interval that this row represents.
    */
  var timeInterval: js.UndefOr[SchemaTimeInterval] = js.undefined
}
object SchemaRowDimensions {
  
  inline def apply(): SchemaRowDimensions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaRowDimensions]
  }
  
  extension [Self <: SchemaRowDimensions](x: Self) {
    
    inline def setPublisherIdentifier(value: String): Self = StObject.set(x, "publisherIdentifier", value.asInstanceOf[js.Any])
    
    inline def setPublisherIdentifierUndefined: Self = StObject.set(x, "publisherIdentifier", js.undefined)
    
    inline def setTimeInterval(value: SchemaTimeInterval): Self = StObject.set(x, "timeInterval", value.asInstanceOf[js.Any])
    
    inline def setTimeIntervalUndefined: Self = StObject.set(x, "timeInterval", js.undefined)
  }
}
