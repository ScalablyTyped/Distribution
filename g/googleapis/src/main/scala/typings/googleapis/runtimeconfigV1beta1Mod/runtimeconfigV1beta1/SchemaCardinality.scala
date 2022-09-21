package typings.googleapis.runtimeconfigV1beta1Mod.runtimeconfigV1beta1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaCardinality extends StObject {
  
  /**
    * The number variables under the `path` that must exist to meet this condition. Defaults to 1 if not specified.
    */
  var number: js.UndefOr[Double | Null] = js.undefined
  
  /**
    * The root of the variable subtree to monitor. For example, `/foo`.
    */
  var path: js.UndefOr[String | Null] = js.undefined
}
object SchemaCardinality {
  
  inline def apply(): SchemaCardinality = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaCardinality]
  }
  
  extension [Self <: SchemaCardinality](x: Self) {
    
    inline def setNumber(value: Double): Self = StObject.set(x, "number", value.asInstanceOf[js.Any])
    
    inline def setNumberNull: Self = StObject.set(x, "number", null)
    
    inline def setNumberUndefined: Self = StObject.set(x, "number", js.undefined)
    
    inline def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
    
    inline def setPathNull: Self = StObject.set(x, "path", null)
    
    inline def setPathUndefined: Self = StObject.set(x, "path", js.undefined)
  }
}
