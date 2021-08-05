package typings.googleapis.contentV2Mod.contentV2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaLiasettingsCustomBatchResponseEntry extends StObject {
  
  /**
    * The ID of the request entry to which this entry responds.
    */
  var batchId: js.UndefOr[Double] = js.undefined
  
  /**
    * A list of errors defined if, and only if, the request failed.
    */
  var errors: js.UndefOr[SchemaErrors] = js.undefined
  
  /**
    * The the list of accessible GMB accounts.
    */
  var gmbAccounts: js.UndefOr[SchemaGmbAccounts] = js.undefined
  
  /**
    * Identifies what kind of resource this is. Value: the fixed string
    * &quot;content#liasettingsCustomBatchResponseEntry&quot;.
    */
  var kind: js.UndefOr[String] = js.undefined
  
  /**
    * The retrieved or updated Lia settings.
    */
  var liaSettings: js.UndefOr[SchemaLiaSettings] = js.undefined
  
  /**
    * The list of POS data providers.
    */
  var posDataProviders: js.UndefOr[js.Array[SchemaPosDataProviders]] = js.undefined
}
object SchemaLiasettingsCustomBatchResponseEntry {
  
  inline def apply(): SchemaLiasettingsCustomBatchResponseEntry = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaLiasettingsCustomBatchResponseEntry]
  }
  
  extension [Self <: SchemaLiasettingsCustomBatchResponseEntry](x: Self) {
    
    inline def setBatchId(value: Double): Self = StObject.set(x, "batchId", value.asInstanceOf[js.Any])
    
    inline def setBatchIdUndefined: Self = StObject.set(x, "batchId", js.undefined)
    
    inline def setErrors(value: SchemaErrors): Self = StObject.set(x, "errors", value.asInstanceOf[js.Any])
    
    inline def setErrorsUndefined: Self = StObject.set(x, "errors", js.undefined)
    
    inline def setGmbAccounts(value: SchemaGmbAccounts): Self = StObject.set(x, "gmbAccounts", value.asInstanceOf[js.Any])
    
    inline def setGmbAccountsUndefined: Self = StObject.set(x, "gmbAccounts", js.undefined)
    
    inline def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    inline def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
    
    inline def setLiaSettings(value: SchemaLiaSettings): Self = StObject.set(x, "liaSettings", value.asInstanceOf[js.Any])
    
    inline def setLiaSettingsUndefined: Self = StObject.set(x, "liaSettings", js.undefined)
    
    inline def setPosDataProviders(value: js.Array[SchemaPosDataProviders]): Self = StObject.set(x, "posDataProviders", value.asInstanceOf[js.Any])
    
    inline def setPosDataProvidersUndefined: Self = StObject.set(x, "posDataProviders", js.undefined)
    
    inline def setPosDataProvidersVarargs(value: SchemaPosDataProviders*): Self = StObject.set(x, "posDataProviders", js.Array(value :_*))
  }
}
