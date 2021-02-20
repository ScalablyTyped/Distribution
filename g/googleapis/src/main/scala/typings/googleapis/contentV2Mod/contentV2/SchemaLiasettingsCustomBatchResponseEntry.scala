package typings.googleapis.contentV2Mod.contentV2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SchemaLiasettingsCustomBatchResponseEntry extends StObject {
  
  /**
    * The ID of the request entry to which this entry responds.
    */
  var batchId: js.UndefOr[Double] = js.native
  
  /**
    * A list of errors defined if, and only if, the request failed.
    */
  var errors: js.UndefOr[SchemaErrors] = js.native
  
  /**
    * The the list of accessible GMB accounts.
    */
  var gmbAccounts: js.UndefOr[SchemaGmbAccounts] = js.native
  
  /**
    * Identifies what kind of resource this is. Value: the fixed string
    * &quot;content#liasettingsCustomBatchResponseEntry&quot;.
    */
  var kind: js.UndefOr[String] = js.native
  
  /**
    * The retrieved or updated Lia settings.
    */
  var liaSettings: js.UndefOr[SchemaLiaSettings] = js.native
  
  /**
    * The list of POS data providers.
    */
  var posDataProviders: js.UndefOr[js.Array[SchemaPosDataProviders]] = js.native
}
object SchemaLiasettingsCustomBatchResponseEntry {
  
  @scala.inline
  def apply(): SchemaLiasettingsCustomBatchResponseEntry = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaLiasettingsCustomBatchResponseEntry]
  }
  
  @scala.inline
  implicit class SchemaLiasettingsCustomBatchResponseEntryMutableBuilder[Self <: SchemaLiasettingsCustomBatchResponseEntry] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBatchId(value: Double): Self = StObject.set(x, "batchId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBatchIdUndefined: Self = StObject.set(x, "batchId", js.undefined)
    
    @scala.inline
    def setErrors(value: SchemaErrors): Self = StObject.set(x, "errors", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setErrorsUndefined: Self = StObject.set(x, "errors", js.undefined)
    
    @scala.inline
    def setGmbAccounts(value: SchemaGmbAccounts): Self = StObject.set(x, "gmbAccounts", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGmbAccountsUndefined: Self = StObject.set(x, "gmbAccounts", js.undefined)
    
    @scala.inline
    def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
    
    @scala.inline
    def setLiaSettings(value: SchemaLiaSettings): Self = StObject.set(x, "liaSettings", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLiaSettingsUndefined: Self = StObject.set(x, "liaSettings", js.undefined)
    
    @scala.inline
    def setPosDataProviders(value: js.Array[SchemaPosDataProviders]): Self = StObject.set(x, "posDataProviders", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPosDataProvidersUndefined: Self = StObject.set(x, "posDataProviders", js.undefined)
    
    @scala.inline
    def setPosDataProvidersVarargs(value: SchemaPosDataProviders*): Self = StObject.set(x, "posDataProviders", js.Array(value :_*))
  }
}
