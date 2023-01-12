package typings.jsfl

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait _URI extends StObject {
  
  var `extension`: String
  
  var folder: String
  
  var name: String
  
  var path: String
  
  def toURI(string: String): String
  
  var `type`: String
  
  var uri: String
}
object _URI {
  
  inline def apply(
    `extension`: String,
    folder: String,
    name: String,
    path: String,
    toURI: String => String,
    `type`: String,
    uri: String
  ): _URI = {
    val __obj = js.Dynamic.literal(folder = folder.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any], toURI = js.Any.fromFunction1(toURI), uri = uri.asInstanceOf[js.Any])
    __obj.updateDynamic("extension")(`extension`.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[_URI]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: _URI] (val x: Self) extends AnyVal {
    
    inline def setExtension(value: String): Self = StObject.set(x, "extension", value.asInstanceOf[js.Any])
    
    inline def setFolder(value: String): Self = StObject.set(x, "folder", value.asInstanceOf[js.Any])
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
    
    inline def setToURI(value: String => String): Self = StObject.set(x, "toURI", js.Any.fromFunction1(value))
    
    inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setUri(value: String): Self = StObject.set(x, "uri", value.asInstanceOf[js.Any])
  }
}
