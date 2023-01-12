package typings.jqueryAjaxfile

import typings.std.HTMLInputElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IFileData extends StObject {
  
  var element: HTMLInputElement
  
  var name: String
}
object IFileData {
  
  inline def apply(element: HTMLInputElement, name: String): IFileData = {
    val __obj = js.Dynamic.literal(element = element.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[IFileData]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: IFileData] (val x: Self) extends AnyVal {
    
    inline def setElement(value: HTMLInputElement): Self = StObject.set(x, "element", value.asInstanceOf[js.Any])
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
  }
}
