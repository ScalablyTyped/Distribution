package typings.googleapis.cloudsearchV1Mod.cloudsearchV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaRoomRenameMetadata extends StObject {
  
  var newName: js.UndefOr[String | Null] = js.undefined
  
  /**
    * NEXT_TAG: 3
    */
  var prevName: js.UndefOr[String | Null] = js.undefined
}
object SchemaRoomRenameMetadata {
  
  inline def apply(): SchemaRoomRenameMetadata = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaRoomRenameMetadata]
  }
  
  extension [Self <: SchemaRoomRenameMetadata](x: Self) {
    
    inline def setNewName(value: String): Self = StObject.set(x, "newName", value.asInstanceOf[js.Any])
    
    inline def setNewNameNull: Self = StObject.set(x, "newName", null)
    
    inline def setNewNameUndefined: Self = StObject.set(x, "newName", js.undefined)
    
    inline def setPrevName(value: String): Self = StObject.set(x, "prevName", value.asInstanceOf[js.Any])
    
    inline def setPrevNameNull: Self = StObject.set(x, "prevName", null)
    
    inline def setPrevNameUndefined: Self = StObject.set(x, "prevName", js.undefined)
  }
}
