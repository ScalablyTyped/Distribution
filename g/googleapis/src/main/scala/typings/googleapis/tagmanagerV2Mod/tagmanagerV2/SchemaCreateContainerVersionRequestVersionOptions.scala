package typings.googleapis.tagmanagerV2Mod.tagmanagerV2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaCreateContainerVersionRequestVersionOptions extends StObject {
  
  /**
    * The name of the container version to be created.
    */
  var name: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The notes of the container version to be created.
    */
  var notes: js.UndefOr[String | Null] = js.undefined
}
object SchemaCreateContainerVersionRequestVersionOptions {
  
  inline def apply(): SchemaCreateContainerVersionRequestVersionOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaCreateContainerVersionRequestVersionOptions]
  }
  
  extension [Self <: SchemaCreateContainerVersionRequestVersionOptions](x: Self) {
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameNull: Self = StObject.set(x, "name", null)
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setNotes(value: String): Self = StObject.set(x, "notes", value.asInstanceOf[js.Any])
    
    inline def setNotesNull: Self = StObject.set(x, "notes", null)
    
    inline def setNotesUndefined: Self = StObject.set(x, "notes", js.undefined)
  }
}
