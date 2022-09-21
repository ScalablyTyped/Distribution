package typings.googleapis.cloudsearchV1Mod.cloudsearchV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaUploadItemRef extends StObject {
  
  /**
    * The name of the content reference. The maximum length is 2048 characters.
    */
  var name: js.UndefOr[String | Null] = js.undefined
}
object SchemaUploadItemRef {
  
  inline def apply(): SchemaUploadItemRef = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaUploadItemRef]
  }
  
  extension [Self <: SchemaUploadItemRef](x: Self) {
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameNull: Self = StObject.set(x, "name", null)
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
  }
}
