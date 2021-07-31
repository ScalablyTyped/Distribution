package typings.googleapis.healthcareV1alphaMod.healthcareV1alpha

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * The content of a HL7v2 message in a structured format.
  */
trait SchemaParsedData extends StObject {
  
  var segments: js.UndefOr[js.Array[SchemaSegment]] = js.undefined
}
object SchemaParsedData {
  
  @scala.inline
  def apply(): SchemaParsedData = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaParsedData]
  }
  
  @scala.inline
  implicit class SchemaParsedDataMutableBuilder[Self <: SchemaParsedData] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setSegments(value: js.Array[SchemaSegment]): Self = StObject.set(x, "segments", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSegmentsUndefined: Self = StObject.set(x, "segments", js.undefined)
    
    @scala.inline
    def setSegmentsVarargs(value: SchemaSegment*): Self = StObject.set(x, "segments", js.Array(value :_*))
  }
}
