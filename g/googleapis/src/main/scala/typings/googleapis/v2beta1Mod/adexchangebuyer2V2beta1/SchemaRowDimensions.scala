package typings.googleapis.v2beta1Mod.adexchangebuyer2V2beta1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A response may include multiple rows, breaking down along various
  * dimensions. Encapsulates the values of all dimensions for a given row.
  */
@js.native
trait SchemaRowDimensions extends StObject {
  
  /**
    * The publisher identifier for this row, if a breakdown by
    * [BreakdownDimension.PUBLISHER_IDENTIFIER](https://developers.google.com/authorized-buyers/apis/reference/rest/v2beta1/bidders.accounts.filterSets#FilterSet.BreakdownDimension)
    * was requested.
    */
  var publisherIdentifier: js.UndefOr[String] = js.native
  
  /**
    * The time interval that this row represents.
    */
  var timeInterval: js.UndefOr[SchemaTimeInterval] = js.native
}
object SchemaRowDimensions {
  
  @scala.inline
  def apply(): SchemaRowDimensions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaRowDimensions]
  }
  
  @scala.inline
  implicit class SchemaRowDimensionsMutableBuilder[Self <: SchemaRowDimensions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setPublisherIdentifier(value: String): Self = StObject.set(x, "publisherIdentifier", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPublisherIdentifierUndefined: Self = StObject.set(x, "publisherIdentifier", js.undefined)
    
    @scala.inline
    def setTimeInterval(value: SchemaTimeInterval): Self = StObject.set(x, "timeInterval", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTimeIntervalUndefined: Self = StObject.set(x, "timeInterval", js.undefined)
  }
}
