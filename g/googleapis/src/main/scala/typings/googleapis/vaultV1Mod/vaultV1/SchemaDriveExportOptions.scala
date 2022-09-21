package typings.googleapis.vaultV1Mod.vaultV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaDriveExportOptions extends StObject {
  
  /**
    * To include access level information for users with [indirect access](https://support.google.com/vault/answer/6099459#metadata) to files, set to **true**.
    */
  var includeAccessInfo: js.UndefOr[Boolean | Null] = js.undefined
}
object SchemaDriveExportOptions {
  
  inline def apply(): SchemaDriveExportOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaDriveExportOptions]
  }
  
  extension [Self <: SchemaDriveExportOptions](x: Self) {
    
    inline def setIncludeAccessInfo(value: Boolean): Self = StObject.set(x, "includeAccessInfo", value.asInstanceOf[js.Any])
    
    inline def setIncludeAccessInfoNull: Self = StObject.set(x, "includeAccessInfo", null)
    
    inline def setIncludeAccessInfoUndefined: Self = StObject.set(x, "includeAccessInfo", js.undefined)
  }
}
