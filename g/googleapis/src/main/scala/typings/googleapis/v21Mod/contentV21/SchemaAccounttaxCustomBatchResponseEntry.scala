package typings.googleapis.v21Mod.contentV21

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A batch entry encoding a single non-batch accounttax response.
  */
@js.native
trait SchemaAccounttaxCustomBatchResponseEntry extends StObject {
  
  /**
    * The retrieved or updated account tax settings.
    */
  var accountTax: js.UndefOr[SchemaAccountTax] = js.native
  
  /**
    * The ID of the request entry this entry responds to.
    */
  var batchId: js.UndefOr[Double] = js.native
  
  /**
    * A list of errors defined if and only if the request failed.
    */
  var errors: js.UndefOr[SchemaErrors] = js.native
  
  /**
    * Identifies what kind of resource this is. Value: the fixed string
    * &quot;content#accounttaxCustomBatchResponseEntry&quot;.
    */
  var kind: js.UndefOr[String] = js.native
}
object SchemaAccounttaxCustomBatchResponseEntry {
  
  @scala.inline
  def apply(): SchemaAccounttaxCustomBatchResponseEntry = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaAccounttaxCustomBatchResponseEntry]
  }
  
  @scala.inline
  implicit class SchemaAccounttaxCustomBatchResponseEntryMutableBuilder[Self <: SchemaAccounttaxCustomBatchResponseEntry] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAccountTax(value: SchemaAccountTax): Self = StObject.set(x, "accountTax", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAccountTaxUndefined: Self = StObject.set(x, "accountTax", js.undefined)
    
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
  }
}
