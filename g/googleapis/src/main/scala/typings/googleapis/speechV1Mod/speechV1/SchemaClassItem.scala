package typings.googleapis.speechV1Mod.speechV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaClassItem extends StObject {
  
  /**
    * The class item's value.
    */
  var value: js.UndefOr[String | Null] = js.undefined
}
object SchemaClassItem {
  
  inline def apply(): SchemaClassItem = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaClassItem]
  }
  
  extension [Self <: SchemaClassItem](x: Self) {
    
    inline def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    
    inline def setValueNull: Self = StObject.set(x, "value", null)
    
    inline def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
  }
}
