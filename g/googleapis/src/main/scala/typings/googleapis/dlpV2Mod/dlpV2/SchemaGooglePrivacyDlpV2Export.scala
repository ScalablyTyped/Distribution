package typings.googleapis.dlpV2Mod.dlpV2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaGooglePrivacyDlpV2Export extends StObject {
  
  /**
    * Store all table and column profiles in an existing table or a new table in an existing dataset. Each re-generation will result in a new row in BigQuery.
    */
  var profileTable: js.UndefOr[SchemaGooglePrivacyDlpV2BigQueryTable] = js.undefined
}
object SchemaGooglePrivacyDlpV2Export {
  
  inline def apply(): SchemaGooglePrivacyDlpV2Export = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGooglePrivacyDlpV2Export]
  }
  
  extension [Self <: SchemaGooglePrivacyDlpV2Export](x: Self) {
    
    inline def setProfileTable(value: SchemaGooglePrivacyDlpV2BigQueryTable): Self = StObject.set(x, "profileTable", value.asInstanceOf[js.Any])
    
    inline def setProfileTableUndefined: Self = StObject.set(x, "profileTable", js.undefined)
  }
}
