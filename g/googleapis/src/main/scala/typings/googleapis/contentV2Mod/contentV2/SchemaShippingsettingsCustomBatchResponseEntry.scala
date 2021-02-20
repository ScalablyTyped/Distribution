package typings.googleapis.contentV2Mod.contentV2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A batch entry encoding a single non-batch shipping settings response.
  */
@js.native
trait SchemaShippingsettingsCustomBatchResponseEntry extends StObject {
  
  /**
    * The ID of the request entry to which this entry responds.
    */
  var batchId: js.UndefOr[Double] = js.native
  
  /**
    * A list of errors defined if, and only if, the request failed.
    */
  var errors: js.UndefOr[SchemaErrors] = js.native
  
  /**
    * Identifies what kind of resource this is. Value: the fixed string
    * &quot;content#shippingsettingsCustomBatchResponseEntry&quot;.
    */
  var kind: js.UndefOr[String] = js.native
  
  /**
    * The retrieved or updated account shipping settings.
    */
  var shippingSettings: js.UndefOr[SchemaShippingSettings] = js.native
}
object SchemaShippingsettingsCustomBatchResponseEntry {
  
  @scala.inline
  def apply(): SchemaShippingsettingsCustomBatchResponseEntry = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaShippingsettingsCustomBatchResponseEntry]
  }
  
  @scala.inline
  implicit class SchemaShippingsettingsCustomBatchResponseEntryMutableBuilder[Self <: SchemaShippingsettingsCustomBatchResponseEntry] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBatchId(value: Double): Self = StObject.set(x, "batchId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBatchIdUndefined: Self = StObject.set(x, "batchId", js.undefined)
    
    @scala.inline
    def setErrors(value: SchemaErrors): Self = StObject.set(x, "errors", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setErrorsUndefined: Self = StObject.set(x, "errors", js.undefined)
    
    @scala.inline
    def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
    
    @scala.inline
    def setShippingSettings(value: SchemaShippingSettings): Self = StObject.set(x, "shippingSettings", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setShippingSettingsUndefined: Self = StObject.set(x, "shippingSettings", js.undefined)
  }
}
