package typings.googleapis.v1b3Mod.dataflowV1b3

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaQueryInfo extends StObject {
  
  /**
    * Includes an entry for each satisfied QueryProperty.
    */
  var queryProperty: js.UndefOr[js.Array[String] | Null] = js.undefined
}
object SchemaQueryInfo {
  
  inline def apply(): SchemaQueryInfo = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaQueryInfo]
  }
  
  extension [Self <: SchemaQueryInfo](x: Self) {
    
    inline def setQueryProperty(value: js.Array[String]): Self = StObject.set(x, "queryProperty", value.asInstanceOf[js.Any])
    
    inline def setQueryPropertyNull: Self = StObject.set(x, "queryProperty", null)
    
    inline def setQueryPropertyUndefined: Self = StObject.set(x, "queryProperty", js.undefined)
    
    inline def setQueryPropertyVarargs(value: String*): Self = StObject.set(x, "queryProperty", js.Array(value*))
  }
}
