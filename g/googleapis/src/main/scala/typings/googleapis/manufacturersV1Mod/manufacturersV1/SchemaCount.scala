package typings.googleapis.manufacturersV1Mod.manufacturersV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * The number of products in a single package. For more information, see
  * https://support.google.com/manufacturers/answer/6124116#count.
  */
trait SchemaCount extends StObject {
  
  /**
    * The unit in which these products are counted.
    */
  var unit: js.UndefOr[String] = js.undefined
  
  /**
    * The numeric value of the number of products in a package.
    */
  var value: js.UndefOr[String] = js.undefined
}
object SchemaCount {
  
  inline def apply(): SchemaCount = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaCount]
  }
  
  extension [Self <: SchemaCount](x: Self) {
    
    inline def setUnit(value: String): Self = StObject.set(x, "unit", value.asInstanceOf[js.Any])
    
    inline def setUnitUndefined: Self = StObject.set(x, "unit", js.undefined)
    
    inline def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    
    inline def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
  }
}
