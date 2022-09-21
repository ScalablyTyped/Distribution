package typings.googleapis.directoryV1Mod.adminDirectoryV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaUserAbout extends StObject {
  
  /**
    * About entry can have a type which indicates the content type. It can either be plain or html. By default, notes contents are assumed to contain plain text.
    */
  var contentType: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Actual value of notes.
    */
  var value: js.UndefOr[String | Null] = js.undefined
}
object SchemaUserAbout {
  
  inline def apply(): SchemaUserAbout = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaUserAbout]
  }
  
  extension [Self <: SchemaUserAbout](x: Self) {
    
    inline def setContentType(value: String): Self = StObject.set(x, "contentType", value.asInstanceOf[js.Any])
    
    inline def setContentTypeNull: Self = StObject.set(x, "contentType", null)
    
    inline def setContentTypeUndefined: Self = StObject.set(x, "contentType", js.undefined)
    
    inline def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    
    inline def setValueNull: Self = StObject.set(x, "value", null)
    
    inline def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
  }
}
