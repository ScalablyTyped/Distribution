package typings.googleapis.privatecaV1Mod.privatecaV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaObjectId extends StObject {
  
  /**
    * Required. The parts of an OID path. The most significant parts of the path come first.
    */
  var objectIdPath: js.UndefOr[js.Array[Double] | Null] = js.undefined
}
object SchemaObjectId {
  
  inline def apply(): SchemaObjectId = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaObjectId]
  }
  
  extension [Self <: SchemaObjectId](x: Self) {
    
    inline def setObjectIdPath(value: js.Array[Double]): Self = StObject.set(x, "objectIdPath", value.asInstanceOf[js.Any])
    
    inline def setObjectIdPathNull: Self = StObject.set(x, "objectIdPath", null)
    
    inline def setObjectIdPathUndefined: Self = StObject.set(x, "objectIdPath", js.undefined)
    
    inline def setObjectIdPathVarargs(value: Double*): Self = StObject.set(x, "objectIdPath", js.Array(value*))
  }
}
