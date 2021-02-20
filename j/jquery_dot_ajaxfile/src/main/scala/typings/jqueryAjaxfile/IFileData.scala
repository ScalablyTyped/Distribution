package typings.jqueryAjaxfile

import typings.std.HTMLInputElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IFileData extends StObject {
  
  var element: HTMLInputElement = js.native
  
  var name: String = js.native
}
object IFileData {
  
  @scala.inline
  def apply(element: HTMLInputElement, name: String): IFileData = {
    val __obj = js.Dynamic.literal(element = element.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[IFileData]
  }
  
  @scala.inline
  implicit class IFileDataMutableBuilder[Self <: IFileData] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setElement(value: HTMLInputElement): Self = StObject.set(x, "element", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
  }
}
