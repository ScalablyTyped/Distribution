package typings.jsfl

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Folder extends StObject {
  
  var contents: js.Array[File]
}
object Folder {
  
  @scala.inline
  def apply(contents: js.Array[File]): Folder = {
    val __obj = js.Dynamic.literal(contents = contents.asInstanceOf[js.Any])
    __obj.asInstanceOf[Folder]
  }
  
  @scala.inline
  implicit class FolderMutableBuilder[Self <: Folder] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setContents(value: js.Array[File]): Self = StObject.set(x, "contents", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setContentsVarargs(value: File*): Self = StObject.set(x, "contents", js.Array(value :_*))
  }
}
