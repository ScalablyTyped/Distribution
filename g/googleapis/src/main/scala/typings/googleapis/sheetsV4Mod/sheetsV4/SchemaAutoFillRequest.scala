package typings.googleapis.sheetsV4Mod.sheetsV4

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Fills in more data based on existing data.
  */
trait SchemaAutoFillRequest extends StObject {
  
  /**
    * The range to autofill. This will examine the range and detect the
    * location that has data and automatically fill that data in to the rest of
    * the range.
    */
  var range: js.UndefOr[SchemaGridRange] = js.undefined
  
  /**
    * The source and destination areas to autofill. This explicitly lists the
    * source of the autofill and where to extend that data.
    */
  var sourceAndDestination: js.UndefOr[SchemaSourceAndDestination] = js.undefined
  
  /**
    * True if we should generate data with the &quot;alternate&quot; series.
    * This differs based on the type and amount of source data.
    */
  var useAlternateSeries: js.UndefOr[Boolean] = js.undefined
}
object SchemaAutoFillRequest {
  
  @scala.inline
  def apply(): SchemaAutoFillRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaAutoFillRequest]
  }
  
  @scala.inline
  implicit class SchemaAutoFillRequestMutableBuilder[Self <: SchemaAutoFillRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setRange(value: SchemaGridRange): Self = StObject.set(x, "range", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRangeUndefined: Self = StObject.set(x, "range", js.undefined)
    
    @scala.inline
    def setSourceAndDestination(value: SchemaSourceAndDestination): Self = StObject.set(x, "sourceAndDestination", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSourceAndDestinationUndefined: Self = StObject.set(x, "sourceAndDestination", js.undefined)
    
    @scala.inline
    def setUseAlternateSeries(value: Boolean): Self = StObject.set(x, "useAlternateSeries", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUseAlternateSeriesUndefined: Self = StObject.set(x, "useAlternateSeries", js.undefined)
  }
}
