package typings.jsfl

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait File extends StObject {
  
  var contents: String
  
  def copy(path: String): File
  
  def write(data: String): File
}
object File {
  
  inline def apply(contents: String, copy: String => File, write: String => File): File = {
    val __obj = js.Dynamic.literal(contents = contents.asInstanceOf[js.Any], copy = js.Any.fromFunction1(copy), write = js.Any.fromFunction1(write))
    __obj.asInstanceOf[File]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: File] (val x: Self) extends AnyVal {
    
    inline def setContents(value: String): Self = StObject.set(x, "contents", value.asInstanceOf[js.Any])
    
    inline def setCopy(value: String => File): Self = StObject.set(x, "copy", js.Any.fromFunction1(value))
    
    inline def setWrite(value: String => File): Self = StObject.set(x, "write", js.Any.fromFunction1(value))
  }
}
