package typings.jsfl

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait _URI extends StObject {
  
  var extension: String = js.native
  
  var folder: String = js.native
  
  var name: String = js.native
  
  var path: String = js.native
  
  def toURI(string: String): String = js.native
  
  var `type`: String = js.native
  
  var uri: String = js.native
}
object _URI {
  
  @scala.inline
  def apply(
    extension: String,
    folder: String,
    name: String,
    path: String,
    toURI: String => String,
    `type`: String,
    uri: String
  ): _URI = {
    val __obj = js.Dynamic.literal(extension = extension.asInstanceOf[js.Any], folder = folder.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any], toURI = js.Any.fromFunction1(toURI), uri = uri.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[_URI]
  }
  
  @scala.inline
  implicit class _URIMutableBuilder[Self <: _URI] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setExtension(value: String): Self = StObject.set(x, "extension", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFolder(value: String): Self = StObject.set(x, "folder", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setToURI(value: String => String): Self = StObject.set(x, "toURI", js.Any.fromFunction1(value))
    
    @scala.inline
    def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUri(value: String): Self = StObject.set(x, "uri", value.asInstanceOf[js.Any])
  }
}
