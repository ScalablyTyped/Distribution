package typings.googleapis.drivelabelsV2Mod.drivelabelsV2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaGoogleAppsDriveLabelsV2FieldAppliedCapabilities extends StObject {
  
  /**
    * Whether the user can read related applied metadata on items.
    */
  var canRead: js.UndefOr[Boolean | Null] = js.undefined
  
  /**
    * Whether the user can search for Drive items referencing this field.
    */
  var canSearch: js.UndefOr[Boolean | Null] = js.undefined
  
  /**
    * Whether the user can set this field on Drive items.
    */
  var canWrite: js.UndefOr[Boolean | Null] = js.undefined
}
object SchemaGoogleAppsDriveLabelsV2FieldAppliedCapabilities {
  
  inline def apply(): SchemaGoogleAppsDriveLabelsV2FieldAppliedCapabilities = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleAppsDriveLabelsV2FieldAppliedCapabilities]
  }
  
  extension [Self <: SchemaGoogleAppsDriveLabelsV2FieldAppliedCapabilities](x: Self) {
    
    inline def setCanRead(value: Boolean): Self = StObject.set(x, "canRead", value.asInstanceOf[js.Any])
    
    inline def setCanReadNull: Self = StObject.set(x, "canRead", null)
    
    inline def setCanReadUndefined: Self = StObject.set(x, "canRead", js.undefined)
    
    inline def setCanSearch(value: Boolean): Self = StObject.set(x, "canSearch", value.asInstanceOf[js.Any])
    
    inline def setCanSearchNull: Self = StObject.set(x, "canSearch", null)
    
    inline def setCanSearchUndefined: Self = StObject.set(x, "canSearch", js.undefined)
    
    inline def setCanWrite(value: Boolean): Self = StObject.set(x, "canWrite", value.asInstanceOf[js.Any])
    
    inline def setCanWriteNull: Self = StObject.set(x, "canWrite", null)
    
    inline def setCanWriteUndefined: Self = StObject.set(x, "canWrite", js.undefined)
  }
}
