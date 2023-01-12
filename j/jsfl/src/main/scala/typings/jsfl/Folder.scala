package typings.jsfl

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Folder extends StObject {
  
  var contents: js.Array[File]
}
object Folder {
  
  inline def apply(contents: js.Array[File]): Folder = {
    val __obj = js.Dynamic.literal(contents = contents.asInstanceOf[js.Any])
    __obj.asInstanceOf[Folder]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Folder] (val x: Self) extends AnyVal {
    
    inline def setContents(value: js.Array[File]): Self = StObject.set(x, "contents", value.asInstanceOf[js.Any])
    
    inline def setContentsVarargs(value: File*): Self = StObject.set(x, "contents", js.Array(value*))
  }
}
