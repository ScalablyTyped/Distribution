package typings.googleapis.securitycenterV1Mod.securitycenterV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaRole extends StObject {
  
  /**
    * Role type.
    */
  var kind: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Role name.
    */
  var name: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Role namespace.
    */
  var ns: js.UndefOr[String | Null] = js.undefined
}
object SchemaRole {
  
  inline def apply(): SchemaRole = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaRole]
  }
  
  extension [Self <: SchemaRole](x: Self) {
    
    inline def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    inline def setKindNull: Self = StObject.set(x, "kind", null)
    
    inline def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameNull: Self = StObject.set(x, "name", null)
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setNs(value: String): Self = StObject.set(x, "ns", value.asInstanceOf[js.Any])
    
    inline def setNsNull: Self = StObject.set(x, "ns", null)
    
    inline def setNsUndefined: Self = StObject.set(x, "ns", js.undefined)
  }
}
