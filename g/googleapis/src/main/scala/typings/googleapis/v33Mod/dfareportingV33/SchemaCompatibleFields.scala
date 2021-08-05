package typings.googleapis.v33Mod.dfareportingV33

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Represents a response to the queryCompatibleFields method.
  */
trait SchemaCompatibleFields extends StObject {
  
  /**
    * Contains items that are compatible to be selected for a report of type
    * &quot;CROSS_DIMENSION_REACH&quot;.
    */
  var crossDimensionReachReportCompatibleFields: js.UndefOr[SchemaCrossDimensionReachReportCompatibleFields] = js.undefined
  
  /**
    * Contains items that are compatible to be selected for a report of type
    * &quot;FLOODLIGHT&quot;.
    */
  var floodlightReportCompatibleFields: js.UndefOr[SchemaFloodlightReportCompatibleFields] = js.undefined
  
  /**
    * The kind of resource this is, in this case dfareporting#compatibleFields.
    */
  var kind: js.UndefOr[String] = js.undefined
  
  /**
    * Contains items that are compatible to be selected for a report of type
    * &quot;PATH_TO_CONVERSION&quot;.
    */
  var pathToConversionReportCompatibleFields: js.UndefOr[SchemaPathToConversionReportCompatibleFields] = js.undefined
  
  /**
    * Contains items that are compatible to be selected for a report of type
    * &quot;REACH&quot;.
    */
  var reachReportCompatibleFields: js.UndefOr[SchemaReachReportCompatibleFields] = js.undefined
  
  /**
    * Contains items that are compatible to be selected for a report of type
    * &quot;STANDARD&quot;.
    */
  var reportCompatibleFields: js.UndefOr[SchemaReportCompatibleFields] = js.undefined
}
object SchemaCompatibleFields {
  
  inline def apply(): SchemaCompatibleFields = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaCompatibleFields]
  }
  
  extension [Self <: SchemaCompatibleFields](x: Self) {
    
    inline def setCrossDimensionReachReportCompatibleFields(value: SchemaCrossDimensionReachReportCompatibleFields): Self = StObject.set(x, "crossDimensionReachReportCompatibleFields", value.asInstanceOf[js.Any])
    
    inline def setCrossDimensionReachReportCompatibleFieldsUndefined: Self = StObject.set(x, "crossDimensionReachReportCompatibleFields", js.undefined)
    
    inline def setFloodlightReportCompatibleFields(value: SchemaFloodlightReportCompatibleFields): Self = StObject.set(x, "floodlightReportCompatibleFields", value.asInstanceOf[js.Any])
    
    inline def setFloodlightReportCompatibleFieldsUndefined: Self = StObject.set(x, "floodlightReportCompatibleFields", js.undefined)
    
    inline def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    inline def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
    
    inline def setPathToConversionReportCompatibleFields(value: SchemaPathToConversionReportCompatibleFields): Self = StObject.set(x, "pathToConversionReportCompatibleFields", value.asInstanceOf[js.Any])
    
    inline def setPathToConversionReportCompatibleFieldsUndefined: Self = StObject.set(x, "pathToConversionReportCompatibleFields", js.undefined)
    
    inline def setReachReportCompatibleFields(value: SchemaReachReportCompatibleFields): Self = StObject.set(x, "reachReportCompatibleFields", value.asInstanceOf[js.Any])
    
    inline def setReachReportCompatibleFieldsUndefined: Self = StObject.set(x, "reachReportCompatibleFields", js.undefined)
    
    inline def setReportCompatibleFields(value: SchemaReportCompatibleFields): Self = StObject.set(x, "reportCompatibleFields", value.asInstanceOf[js.Any])
    
    inline def setReportCompatibleFieldsUndefined: Self = StObject.set(x, "reportCompatibleFields", js.undefined)
  }
}
