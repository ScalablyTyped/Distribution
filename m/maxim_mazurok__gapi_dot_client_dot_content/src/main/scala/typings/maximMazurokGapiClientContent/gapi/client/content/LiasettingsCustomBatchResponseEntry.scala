package typings.maximMazurokGapiClientContent.gapi.client.content

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait LiasettingsCustomBatchResponseEntry extends StObject {
  
  /** The ID of the request entry to which this entry responds. */
  var batchId: js.UndefOr[Double] = js.native
  
  /** A list of errors defined if, and only if, the request failed. */
  var errors: js.UndefOr[Errors] = js.native
  
  /** The the list of accessible GMB accounts. */
  var gmbAccounts: js.UndefOr[GmbAccounts] = js.native
  
  /** Identifies what kind of resource this is. Value: the fixed string "`content#liasettingsCustomBatchResponseEntry`" */
  var kind: js.UndefOr[String] = js.native
  
  /** The retrieved or updated Lia settings. */
  var liaSettings: js.UndefOr[LiaSettings] = js.native
  
  /** The list of POS data providers. */
  var posDataProviders: js.UndefOr[js.Array[PosDataProviders]] = js.native
}
object LiasettingsCustomBatchResponseEntry {
  
  @scala.inline
  def apply(): LiasettingsCustomBatchResponseEntry = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LiasettingsCustomBatchResponseEntry]
  }
  
  @scala.inline
  implicit class LiasettingsCustomBatchResponseEntryMutableBuilder[Self <: LiasettingsCustomBatchResponseEntry] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBatchId(value: Double): Self = StObject.set(x, "batchId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBatchIdUndefined: Self = StObject.set(x, "batchId", js.undefined)
    
    @scala.inline
    def setErrors(value: Errors): Self = StObject.set(x, "errors", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setErrorsUndefined: Self = StObject.set(x, "errors", js.undefined)
    
    @scala.inline
    def setGmbAccounts(value: GmbAccounts): Self = StObject.set(x, "gmbAccounts", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGmbAccountsUndefined: Self = StObject.set(x, "gmbAccounts", js.undefined)
    
    @scala.inline
    def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
    
    @scala.inline
    def setLiaSettings(value: LiaSettings): Self = StObject.set(x, "liaSettings", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLiaSettingsUndefined: Self = StObject.set(x, "liaSettings", js.undefined)
    
    @scala.inline
    def setPosDataProviders(value: js.Array[PosDataProviders]): Self = StObject.set(x, "posDataProviders", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPosDataProvidersUndefined: Self = StObject.set(x, "posDataProviders", js.undefined)
    
    @scala.inline
    def setPosDataProvidersVarargs(value: PosDataProviders*): Self = StObject.set(x, "posDataProviders", js.Array(value :_*))
  }
}
