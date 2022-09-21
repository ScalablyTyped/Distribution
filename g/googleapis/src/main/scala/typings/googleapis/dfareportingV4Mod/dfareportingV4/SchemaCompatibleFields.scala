package typings.googleapis.dfareportingV4Mod.dfareportingV4

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaCompatibleFields extends StObject {
  
  /**
    * Contains items that are compatible to be selected for a report of type "CROSS_DIMENSION_REACH".
    */
  var crossDimensionReachReportCompatibleFields: js.UndefOr[SchemaCrossDimensionReachReportCompatibleFields] = js.undefined
  
  /**
    * Contains items that are compatible to be selected for a report of type "FLOODLIGHT".
    */
  var floodlightReportCompatibleFields: js.UndefOr[SchemaFloodlightReportCompatibleFields] = js.undefined
  
  /**
    * The kind of resource this is, in this case dfareporting#compatibleFields.
    */
  var kind: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Contains items that are compatible to be selected for a report of type "PATH_ATTRIBUTION".
    */
  var pathAttributionReportCompatibleFields: js.UndefOr[SchemaPathReportCompatibleFields] = js.undefined
  
  /**
    * Contains items that are compatible to be selected for a report of type "PATH".
    */
  var pathReportCompatibleFields: js.UndefOr[SchemaPathReportCompatibleFields] = js.undefined
  
  /**
    * Contains items that are compatible to be selected for a report of type "PATH_TO_CONVERSION".
    */
  var pathToConversionReportCompatibleFields: js.UndefOr[SchemaPathToConversionReportCompatibleFields] = js.undefined
  
  /**
    * Contains items that are compatible to be selected for a report of type "REACH".
    */
  var reachReportCompatibleFields: js.UndefOr[SchemaReachReportCompatibleFields] = js.undefined
  
  /**
    * Contains items that are compatible to be selected for a report of type "STANDARD".
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
    
    inline def setKindNull: Self = StObject.set(x, "kind", null)
    
    inline def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
    
    inline def setPathAttributionReportCompatibleFields(value: SchemaPathReportCompatibleFields): Self = StObject.set(x, "pathAttributionReportCompatibleFields", value.asInstanceOf[js.Any])
    
    inline def setPathAttributionReportCompatibleFieldsUndefined: Self = StObject.set(x, "pathAttributionReportCompatibleFields", js.undefined)
    
    inline def setPathReportCompatibleFields(value: SchemaPathReportCompatibleFields): Self = StObject.set(x, "pathReportCompatibleFields", value.asInstanceOf[js.Any])
    
    inline def setPathReportCompatibleFieldsUndefined: Self = StObject.set(x, "pathReportCompatibleFields", js.undefined)
    
    inline def setPathToConversionReportCompatibleFields(value: SchemaPathToConversionReportCompatibleFields): Self = StObject.set(x, "pathToConversionReportCompatibleFields", value.asInstanceOf[js.Any])
    
    inline def setPathToConversionReportCompatibleFieldsUndefined: Self = StObject.set(x, "pathToConversionReportCompatibleFields", js.undefined)
    
    inline def setReachReportCompatibleFields(value: SchemaReachReportCompatibleFields): Self = StObject.set(x, "reachReportCompatibleFields", value.asInstanceOf[js.Any])
    
    inline def setReachReportCompatibleFieldsUndefined: Self = StObject.set(x, "reachReportCompatibleFields", js.undefined)
    
    inline def setReportCompatibleFields(value: SchemaReportCompatibleFields): Self = StObject.set(x, "reportCompatibleFields", value.asInstanceOf[js.Any])
    
    inline def setReportCompatibleFieldsUndefined: Self = StObject.set(x, "reportCompatibleFields", js.undefined)
  }
}
