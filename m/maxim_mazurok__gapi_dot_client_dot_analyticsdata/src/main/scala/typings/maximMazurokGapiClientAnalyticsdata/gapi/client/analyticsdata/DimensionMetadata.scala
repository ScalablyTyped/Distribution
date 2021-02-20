package typings.maximMazurokGapiClientAnalyticsdata.gapi.client.analyticsdata

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DimensionMetadata extends StObject {
  
  /** This dimension's name. Useable in [Dimension](#Dimension)'s `name`. For example, `eventName`. */
  var apiName: js.UndefOr[String] = js.native
  
  /** True if the dimension is a custom dimension for this property. */
  var customDefinition: js.UndefOr[Boolean] = js.native
  
  /**
    * Still usable but deprecated names for this dimension. If populated, this dimension is available by either `apiName` or one of `deprecatedApiNames` for a period of time. After the
    * deprecation period, the dimension will be available only by `apiName`.
    */
  var deprecatedApiNames: js.UndefOr[js.Array[String]] = js.native
  
  /** Description of how this dimension is used and calculated. */
  var description: js.UndefOr[String] = js.native
  
  /** This dimension's name within the Google Analytics user interface. For example, `Event name`. */
  var uiName: js.UndefOr[String] = js.native
}
object DimensionMetadata {
  
  @scala.inline
  def apply(): DimensionMetadata = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DimensionMetadata]
  }
  
  @scala.inline
  implicit class DimensionMetadataMutableBuilder[Self <: DimensionMetadata] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setApiName(value: String): Self = StObject.set(x, "apiName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setApiNameUndefined: Self = StObject.set(x, "apiName", js.undefined)
    
    @scala.inline
    def setCustomDefinition(value: Boolean): Self = StObject.set(x, "customDefinition", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCustomDefinitionUndefined: Self = StObject.set(x, "customDefinition", js.undefined)
    
    @scala.inline
    def setDeprecatedApiNames(value: js.Array[String]): Self = StObject.set(x, "deprecatedApiNames", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDeprecatedApiNamesUndefined: Self = StObject.set(x, "deprecatedApiNames", js.undefined)
    
    @scala.inline
    def setDeprecatedApiNamesVarargs(value: String*): Self = StObject.set(x, "deprecatedApiNames", js.Array(value :_*))
    
    @scala.inline
    def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    @scala.inline
    def setUiName(value: String): Self = StObject.set(x, "uiName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUiNameUndefined: Self = StObject.set(x, "uiName", js.undefined)
  }
}
