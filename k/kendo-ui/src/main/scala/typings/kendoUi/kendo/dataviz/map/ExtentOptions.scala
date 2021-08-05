package typings.kendoUi.kendo.dataviz.map

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ExtentOptions extends StObject {
  
  var name: js.UndefOr[String] = js.undefined
}
object ExtentOptions {
  
  inline def apply(): ExtentOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ExtentOptions]
  }
  
  extension [Self <: ExtentOptions](x: Self) {
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
  }
}
