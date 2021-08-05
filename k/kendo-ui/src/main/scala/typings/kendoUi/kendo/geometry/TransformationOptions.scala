package typings.kendoUi.kendo.geometry

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TransformationOptions extends StObject {
  
  var name: js.UndefOr[String] = js.undefined
}
object TransformationOptions {
  
  inline def apply(): TransformationOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TransformationOptions]
  }
  
  extension [Self <: TransformationOptions](x: Self) {
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
  }
}
