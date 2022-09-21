package typings.googleapis.serviceusageV1beta1Mod.serviceusageV1beta1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaCustomHttpPattern extends StObject {
  
  /**
    * The name of this custom HTTP verb.
    */
  var kind: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The path matched by this custom verb.
    */
  var path: js.UndefOr[String | Null] = js.undefined
}
object SchemaCustomHttpPattern {
  
  inline def apply(): SchemaCustomHttpPattern = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaCustomHttpPattern]
  }
  
  extension [Self <: SchemaCustomHttpPattern](x: Self) {
    
    inline def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    inline def setKindNull: Self = StObject.set(x, "kind", null)
    
    inline def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
    
    inline def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
    
    inline def setPathNull: Self = StObject.set(x, "path", null)
    
    inline def setPathUndefined: Self = StObject.set(x, "path", js.undefined)
  }
}
