package typings.kendoUi.kendo.geometry

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait MatrixOptions extends StObject {
  
  var name: js.UndefOr[String] = js.native
}
object MatrixOptions {
  
  @scala.inline
  def apply(): MatrixOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MatrixOptions]
  }
  
  @scala.inline
  implicit class MatrixOptionsMutableBuilder[Self <: MatrixOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
  }
}
