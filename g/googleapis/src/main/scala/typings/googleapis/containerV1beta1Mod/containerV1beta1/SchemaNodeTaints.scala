package typings.googleapis.containerV1beta1Mod.containerV1beta1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaNodeTaints extends StObject {
  
  /**
    * List of node taints.
    */
  var taints: js.UndefOr[js.Array[SchemaNodeTaint]] = js.undefined
}
object SchemaNodeTaints {
  
  inline def apply(): SchemaNodeTaints = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaNodeTaints]
  }
  
  extension [Self <: SchemaNodeTaints](x: Self) {
    
    inline def setTaints(value: js.Array[SchemaNodeTaint]): Self = StObject.set(x, "taints", value.asInstanceOf[js.Any])
    
    inline def setTaintsUndefined: Self = StObject.set(x, "taints", js.undefined)
    
    inline def setTaintsVarargs(value: SchemaNodeTaint*): Self = StObject.set(x, "taints", js.Array(value*))
  }
}
