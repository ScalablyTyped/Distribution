package typings.googleapis.dlpV2Mod.dlpV2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Location of a finding within a table.
  */
trait SchemaGooglePrivacyDlpV2TableLocation extends StObject {
  
  /**
    * The zero-based index of the row where the finding is located.
    */
  var rowIndex: js.UndefOr[String] = js.undefined
}
object SchemaGooglePrivacyDlpV2TableLocation {
  
  inline def apply(): SchemaGooglePrivacyDlpV2TableLocation = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGooglePrivacyDlpV2TableLocation]
  }
  
  extension [Self <: SchemaGooglePrivacyDlpV2TableLocation](x: Self) {
    
    inline def setRowIndex(value: String): Self = StObject.set(x, "rowIndex", value.asInstanceOf[js.Any])
    
    inline def setRowIndexUndefined: Self = StObject.set(x, "rowIndex", js.undefined)
  }
}
