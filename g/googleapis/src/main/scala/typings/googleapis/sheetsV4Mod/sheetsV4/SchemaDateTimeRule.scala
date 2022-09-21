package typings.googleapis.sheetsV4Mod.sheetsV4

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaDateTimeRule extends StObject {
  
  /**
    * The type of date-time grouping to apply.
    */
  var `type`: js.UndefOr[String | Null] = js.undefined
}
object SchemaDateTimeRule {
  
  inline def apply(): SchemaDateTimeRule = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaDateTimeRule]
  }
  
  extension [Self <: SchemaDateTimeRule](x: Self) {
    
    inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypeNull: Self = StObject.set(x, "type", null)
    
    inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
  }
}
