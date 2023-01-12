package typings.imapflow.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListTreeResponse extends StObject {
  
  var delimiter: String
  
  var disabled: Boolean
  
  var flags: js.Array[Any]
  
  var folders: js.Array[ListTreeResponse]
  
  var listed: Boolean
  
  var name: String
  
  var path: String
  
  var root: Boolean
  
  var specialUse: String
  
  var subscribed: Boolean
}
object ListTreeResponse {
  
  inline def apply(
    delimiter: String,
    disabled: Boolean,
    flags: js.Array[Any],
    folders: js.Array[ListTreeResponse],
    listed: Boolean,
    name: String,
    path: String,
    root: Boolean,
    specialUse: String,
    subscribed: Boolean
  ): ListTreeResponse = {
    val __obj = js.Dynamic.literal(delimiter = delimiter.asInstanceOf[js.Any], disabled = disabled.asInstanceOf[js.Any], flags = flags.asInstanceOf[js.Any], folders = folders.asInstanceOf[js.Any], listed = listed.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any], root = root.asInstanceOf[js.Any], specialUse = specialUse.asInstanceOf[js.Any], subscribed = subscribed.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListTreeResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ListTreeResponse] (val x: Self) extends AnyVal {
    
    inline def setDelimiter(value: String): Self = StObject.set(x, "delimiter", value.asInstanceOf[js.Any])
    
    inline def setDisabled(value: Boolean): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
    
    inline def setFlags(value: js.Array[Any]): Self = StObject.set(x, "flags", value.asInstanceOf[js.Any])
    
    inline def setFlagsVarargs(value: Any*): Self = StObject.set(x, "flags", js.Array(value*))
    
    inline def setFolders(value: js.Array[ListTreeResponse]): Self = StObject.set(x, "folders", value.asInstanceOf[js.Any])
    
    inline def setFoldersVarargs(value: ListTreeResponse*): Self = StObject.set(x, "folders", js.Array(value*))
    
    inline def setListed(value: Boolean): Self = StObject.set(x, "listed", value.asInstanceOf[js.Any])
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
    
    inline def setRoot(value: Boolean): Self = StObject.set(x, "root", value.asInstanceOf[js.Any])
    
    inline def setSpecialUse(value: String): Self = StObject.set(x, "specialUse", value.asInstanceOf[js.Any])
    
    inline def setSubscribed(value: Boolean): Self = StObject.set(x, "subscribed", value.asInstanceOf[js.Any])
  }
}
