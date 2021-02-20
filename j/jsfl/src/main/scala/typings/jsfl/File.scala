package typings.jsfl

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait File extends StObject {
  
  var contents: String = js.native
  
  def copy(path: String): File = js.native
  
  def write(data: String): File = js.native
}
object File {
  
  @scala.inline
  def apply(contents: String, copy: String => File, write: String => File): File = {
    val __obj = js.Dynamic.literal(contents = contents.asInstanceOf[js.Any], copy = js.Any.fromFunction1(copy), write = js.Any.fromFunction1(write))
    __obj.asInstanceOf[File]
  }
  
  @scala.inline
  implicit class FileMutableBuilder[Self <: File] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setContents(value: String): Self = StObject.set(x, "contents", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCopy(value: String => File): Self = StObject.set(x, "copy", js.Any.fromFunction1(value))
    
    @scala.inline
    def setWrite(value: String => File): Self = StObject.set(x, "write", js.Any.fromFunction1(value))
  }
}
