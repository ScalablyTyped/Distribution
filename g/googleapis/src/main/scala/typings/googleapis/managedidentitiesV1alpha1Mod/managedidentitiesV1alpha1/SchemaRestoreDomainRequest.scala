package typings.googleapis.managedidentitiesV1alpha1Mod.managedidentitiesV1alpha1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaRestoreDomainRequest extends StObject {
  
  /**
    * Required. ID of the backup to be restored
    */
  var backupId: js.UndefOr[String | Null] = js.undefined
}
object SchemaRestoreDomainRequest {
  
  inline def apply(): SchemaRestoreDomainRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaRestoreDomainRequest]
  }
  
  extension [Self <: SchemaRestoreDomainRequest](x: Self) {
    
    inline def setBackupId(value: String): Self = StObject.set(x, "backupId", value.asInstanceOf[js.Any])
    
    inline def setBackupIdNull: Self = StObject.set(x, "backupId", null)
    
    inline def setBackupIdUndefined: Self = StObject.set(x, "backupId", js.undefined)
  }
}
