package typings.googleapis.v33Mod.dfareportingV33

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Represents a response to the queryCompatibleFields method.
  */
@js.native
trait SchemaCompatibleFields extends StObject {
  
  /**
    * Contains items that are compatible to be selected for a report of type
    * &quot;CROSS_DIMENSION_REACH&quot;.
    */
  var crossDimensionReachReportCompatibleFields: js.UndefOr[SchemaCrossDimensionReachReportCompatibleFields] = js.native
  
  /**
    * Contains items that are compatible to be selected for a report of type
    * &quot;FLOODLIGHT&quot;.
    */
  var floodlightReportCompatibleFields: js.UndefOr[SchemaFloodlightReportCompatibleFields] = js.native
  
  /**
    * The kind of resource this is, in this case dfareporting#compatibleFields.
    */
  var kind: js.UndefOr[String] = js.native
  
  /**
    * Contains items that are compatible to be selected for a report of type
    * &quot;PATH_TO_CONVERSION&quot;.
    */
  var pathToConversionReportCompatibleFields: js.UndefOr[SchemaPathToConversionReportCompatibleFields] = js.native
  
  /**
    * Contains items that are compatible to be selected for a report of type
    * &quot;REACH&quot;.
    */
  var reachReportCompatibleFields: js.UndefOr[SchemaReachReportCompatibleFields] = js.native
  
  /**
    * Contains items that are compatible to be selected for a report of type
    * &quot;STANDARD&quot;.
    */
  var reportCompatibleFields: js.UndefOr[SchemaReportCompatibleFields] = js.native
}
object SchemaCompatibleFields {
  
  @scala.inline
  def apply(): SchemaCompatibleFields = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaCompatibleFields]
  }
  
  @scala.inline
  implicit class SchemaCompatibleFieldsMutableBuilder[Self <: SchemaCompatibleFields] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCrossDimensionReachReportCompatibleFields(value: SchemaCrossDimensionReachReportCompatibleFields): Self = StObject.set(x, "crossDimensionReachReportCompatibleFields", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCrossDimensionReachReportCompatibleFieldsUndefined: Self = StObject.set(x, "crossDimensionReachReportCompatibleFields", js.undefined)
    
    @scala.inline
    def setFloodlightReportCompatibleFields(value: SchemaFloodlightReportCompatibleFields): Self = StObject.set(x, "floodlightReportCompatibleFields", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFloodlightReportCompatibleFieldsUndefined: Self = StObject.set(x, "floodlightReportCompatibleFields", js.undefined)
    
    @scala.inline
    def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
    
    @scala.inline
    def setPathToConversionReportCompatibleFields(value: SchemaPathToConversionReportCompatibleFields): Self = StObject.set(x, "pathToConversionReportCompatibleFields", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPathToConversionReportCompatibleFieldsUndefined: Self = StObject.set(x, "pathToConversionReportCompatibleFields", js.undefined)
    
    @scala.inline
    def setReachReportCompatibleFields(value: SchemaReachReportCompatibleFields): Self = StObject.set(x, "reachReportCompatibleFields", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReachReportCompatibleFieldsUndefined: Self = StObject.set(x, "reachReportCompatibleFields", js.undefined)
    
    @scala.inline
    def setReportCompatibleFields(value: SchemaReportCompatibleFields): Self = StObject.set(x, "reportCompatibleFields", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReportCompatibleFieldsUndefined: Self = StObject.set(x, "reportCompatibleFields", js.undefined)
  }
}
