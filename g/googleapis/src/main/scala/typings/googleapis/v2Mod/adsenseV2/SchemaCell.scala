package typings.googleapis.v2Mod.adsenseV2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaCell extends StObject {
  
  /**
    * Value in the cell. The dimension cells contain strings, and the metric cells contain numbers.
    */
  var value: js.UndefOr[String | Null] = js.undefined
}
object SchemaCell {
  
  inline def apply(): SchemaCell = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaCell]
  }
  
  extension [Self <: SchemaCell](x: Self) {
    
    inline def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    
    inline def setValueNull: Self = StObject.set(x, "value", null)
    
    inline def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
  }
}
