package typings.googleapis.doubleclickbidmanagerV1Mod.doubleclickbidmanagerV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Filter used to match traffic data in your report.
  */
trait SchemaFilterPair extends StObject {
  
  /**
    * Filter type.
    */
  var `type`: js.UndefOr[String] = js.undefined
  
  /**
    * Filter value.
    */
  var value: js.UndefOr[String] = js.undefined
}
object SchemaFilterPair {
  
  inline def apply(): SchemaFilterPair = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaFilterPair]
  }
  
  extension [Self <: SchemaFilterPair](x: Self) {
    
    inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    
    inline def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    
    inline def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
  }
}
