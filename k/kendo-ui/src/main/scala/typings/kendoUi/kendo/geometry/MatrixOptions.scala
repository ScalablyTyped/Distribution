package typings.kendoUi.kendo.geometry

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MatrixOptions extends StObject {
  
  var name: js.UndefOr[String] = js.undefined
}
object MatrixOptions {
  
  inline def apply(): MatrixOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MatrixOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: MatrixOptions] (val x: Self) extends AnyVal {
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
  }
}
