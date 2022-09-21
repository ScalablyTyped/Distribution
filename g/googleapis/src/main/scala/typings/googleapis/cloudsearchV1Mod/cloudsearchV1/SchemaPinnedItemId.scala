package typings.googleapis.cloudsearchV1Mod.cloudsearchV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaPinnedItemId extends StObject {
  
  /**
    * Identifier for a Drive file (e.g. Docs, Sheets, Slides).
    */
  var driveId: js.UndefOr[String | Null] = js.undefined
}
object SchemaPinnedItemId {
  
  inline def apply(): SchemaPinnedItemId = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaPinnedItemId]
  }
  
  extension [Self <: SchemaPinnedItemId](x: Self) {
    
    inline def setDriveId(value: String): Self = StObject.set(x, "driveId", value.asInstanceOf[js.Any])
    
    inline def setDriveIdNull: Self = StObject.set(x, "driveId", null)
    
    inline def setDriveIdUndefined: Self = StObject.set(x, "driveId", js.undefined)
  }
}
