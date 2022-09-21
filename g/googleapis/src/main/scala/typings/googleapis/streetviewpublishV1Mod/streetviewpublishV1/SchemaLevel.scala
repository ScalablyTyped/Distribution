package typings.googleapis.streetviewpublishV1Mod.streetviewpublishV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaLevel extends StObject {
  
  /**
    * Required. A name assigned to this Level, restricted to 3 characters. Consider how the elevator buttons would be labeled for this level if there was an elevator.
    */
  var name: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Optional. Floor number, used for ordering. 0 indicates the ground level, 1 indicates the first level above ground level, -1 indicates the first level under ground level. Non-integer values are OK.
    */
  var number: js.UndefOr[Double | Null] = js.undefined
}
object SchemaLevel {
  
  inline def apply(): SchemaLevel = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaLevel]
  }
  
  extension [Self <: SchemaLevel](x: Self) {
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameNull: Self = StObject.set(x, "name", null)
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setNumber(value: Double): Self = StObject.set(x, "number", value.asInstanceOf[js.Any])
    
    inline def setNumberNull: Self = StObject.set(x, "number", null)
    
    inline def setNumberUndefined: Self = StObject.set(x, "number", js.undefined)
  }
}
