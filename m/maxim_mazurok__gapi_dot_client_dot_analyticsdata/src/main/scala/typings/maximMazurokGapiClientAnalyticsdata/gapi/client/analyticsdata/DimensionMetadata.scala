package typings.maximMazurokGapiClientAnalyticsdata.gapi.client.analyticsdata

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DimensionMetadata extends StObject {
  
  /** This dimension's name. Useable in [Dimension](#Dimension)'s `name`. For example, `eventName`. */
  var apiName: js.UndefOr[String] = js.undefined
  
  /** The display name of the category that this dimension belongs to. Similar dimensions and metrics are categorized together. */
  var category: js.UndefOr[String] = js.undefined
  
  /** True if the dimension is a custom dimension for this property. */
  var customDefinition: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Still usable but deprecated names for this dimension. If populated, this dimension is available by either `apiName` or one of `deprecatedApiNames` for a period of time. After the
    * deprecation period, the dimension will be available only by `apiName`.
    */
  var deprecatedApiNames: js.UndefOr[js.Array[String]] = js.undefined
  
  /** Description of how this dimension is used and calculated. */
  var description: js.UndefOr[String] = js.undefined
  
  /** This dimension's name within the Google Analytics user interface. For example, `Event name`. */
  var uiName: js.UndefOr[String] = js.undefined
}
object DimensionMetadata {
  
  inline def apply(): DimensionMetadata = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DimensionMetadata]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DimensionMetadata] (val x: Self) extends AnyVal {
    
    inline def setApiName(value: String): Self = StObject.set(x, "apiName", value.asInstanceOf[js.Any])
    
    inline def setApiNameUndefined: Self = StObject.set(x, "apiName", js.undefined)
    
    inline def setCategory(value: String): Self = StObject.set(x, "category", value.asInstanceOf[js.Any])
    
    inline def setCategoryUndefined: Self = StObject.set(x, "category", js.undefined)
    
    inline def setCustomDefinition(value: Boolean): Self = StObject.set(x, "customDefinition", value.asInstanceOf[js.Any])
    
    inline def setCustomDefinitionUndefined: Self = StObject.set(x, "customDefinition", js.undefined)
    
    inline def setDeprecatedApiNames(value: js.Array[String]): Self = StObject.set(x, "deprecatedApiNames", value.asInstanceOf[js.Any])
    
    inline def setDeprecatedApiNamesUndefined: Self = StObject.set(x, "deprecatedApiNames", js.undefined)
    
    inline def setDeprecatedApiNamesVarargs(value: String*): Self = StObject.set(x, "deprecatedApiNames", js.Array(value*))
    
    inline def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    inline def setUiName(value: String): Self = StObject.set(x, "uiName", value.asInstanceOf[js.Any])
    
    inline def setUiNameUndefined: Self = StObject.set(x, "uiName", js.undefined)
  }
}
