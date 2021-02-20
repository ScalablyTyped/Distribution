package typings.googleapis.contentV2Mod.contentV2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A batch entry encoding a single non-batch productstatuses response.
  */
@js.native
trait SchemaProductstatusesCustomBatchResponseEntry extends StObject {
  
  /**
    * The ID of the request entry this entry responds to.
    */
  var batchId: js.UndefOr[Double] = js.native
  
  /**
    * A list of errors, if the request failed.
    */
  var errors: js.UndefOr[SchemaErrors] = js.native
  
  /**
    * Identifies what kind of resource this is. Value: the fixed string
    * &quot;content#productstatusesCustomBatchResponseEntry&quot;.
    */
  var kind: js.UndefOr[String] = js.native
  
  /**
    * The requested product status. Only defined if the request was successful.
    */
  var productStatus: js.UndefOr[SchemaProductStatus] = js.native
}
object SchemaProductstatusesCustomBatchResponseEntry {
  
  @scala.inline
  def apply(): SchemaProductstatusesCustomBatchResponseEntry = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaProductstatusesCustomBatchResponseEntry]
  }
  
  @scala.inline
  implicit class SchemaProductstatusesCustomBatchResponseEntryMutableBuilder[Self <: SchemaProductstatusesCustomBatchResponseEntry] (val x: Self) extends AnyVal {
    
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
    def setProductStatus(value: SchemaProductStatus): Self = StObject.set(x, "productStatus", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProductStatusUndefined: Self = StObject.set(x, "productStatus", js.undefined)
  }
}
