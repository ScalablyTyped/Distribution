package typings.leafletGeosearch.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Editurl extends StObject {
  
  var edit_url: String
  
  var note_url: String
  
  var url: String
}
object Editurl {
  
  inline def apply(edit_url: String, note_url: String, url: String): Editurl = {
    val __obj = js.Dynamic.literal(edit_url = edit_url.asInstanceOf[js.Any], note_url = note_url.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
    __obj.asInstanceOf[Editurl]
  }
  
  extension [Self <: Editurl](x: Self) {
    
    inline def setEdit_url(value: String): Self = StObject.set(x, "edit_url", value.asInstanceOf[js.Any])
    
    inline def setNote_url(value: String): Self = StObject.set(x, "note_url", value.asInstanceOf[js.Any])
    
    inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
  }
}
