package typings.maximMazurokGapiClientContent.gapi.client.content

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ShippingsettingsCustomBatchResponseEntry extends StObject {
  
  /** The ID of the request entry to which this entry responds. */
  var batchId: js.UndefOr[Double] = js.undefined
  
  /** A list of errors defined if, and only if, the request failed. */
  var errors: js.UndefOr[Errors] = js.undefined
  
  /** Identifies what kind of resource this is. Value: the fixed string "`content#shippingsettingsCustomBatchResponseEntry`" */
  var kind: js.UndefOr[String] = js.undefined
  
  /** The retrieved or updated account shipping settings. */
  var shippingSettings: js.UndefOr[ShippingSettings] = js.undefined
}
object ShippingsettingsCustomBatchResponseEntry {
  
  @scala.inline
  def apply(): ShippingsettingsCustomBatchResponseEntry = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ShippingsettingsCustomBatchResponseEntry]
  }
  
  @scala.inline
  implicit class ShippingsettingsCustomBatchResponseEntryMutableBuilder[Self <: ShippingsettingsCustomBatchResponseEntry] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBatchId(value: Double): Self = StObject.set(x, "batchId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBatchIdUndefined: Self = StObject.set(x, "batchId", js.undefined)
    
    @scala.inline
    def setErrors(value: Errors): Self = StObject.set(x, "errors", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setErrorsUndefined: Self = StObject.set(x, "errors", js.undefined)
    
    @scala.inline
    def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
    
    @scala.inline
    def setShippingSettings(value: ShippingSettings): Self = StObject.set(x, "shippingSettings", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setShippingSettingsUndefined: Self = StObject.set(x, "shippingSettings", js.undefined)
  }
}
