package typings.maximMazurokGapiClientDfareporting.gapi.client.dfareporting

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DimensionValue extends StObject {
  
  /** The name of the dimension. */
  var dimensionName: js.UndefOr[String] = js.undefined
  
  /** The eTag of this response for caching purposes. */
  var etag: js.UndefOr[String] = js.undefined
  
  /** The ID associated with the value if available. */
  var id: js.UndefOr[String] = js.undefined
  
  /** The kind of resource this is, in this case dfareporting#dimensionValue. */
  var kind: js.UndefOr[String] = js.undefined
  
  /**
    * Determines how the 'value' field is matched when filtering. If not specified, defaults to EXACT. If set to WILDCARD_EXPRESSION, '*' is allowed as a placeholder for variable length
    * character sequences, and it can be escaped with a backslash. Note, only paid search dimensions ('dfa:paidSearch*') allow a matchType other than EXACT.
    */
  var matchType: js.UndefOr[String] = js.undefined
  
  /** The value of the dimension. */
  var value: js.UndefOr[String] = js.undefined
}
object DimensionValue {
  
  inline def apply(): DimensionValue = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DimensionValue]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DimensionValue] (val x: Self) extends AnyVal {
    
    inline def setDimensionName(value: String): Self = StObject.set(x, "dimensionName", value.asInstanceOf[js.Any])
    
    inline def setDimensionNameUndefined: Self = StObject.set(x, "dimensionName", js.undefined)
    
    inline def setEtag(value: String): Self = StObject.set(x, "etag", value.asInstanceOf[js.Any])
    
    inline def setEtagUndefined: Self = StObject.set(x, "etag", js.undefined)
    
    inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    
    inline def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    inline def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
    
    inline def setMatchType(value: String): Self = StObject.set(x, "matchType", value.asInstanceOf[js.Any])
    
    inline def setMatchTypeUndefined: Self = StObject.set(x, "matchType", js.undefined)
    
    inline def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    
    inline def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
  }
}
