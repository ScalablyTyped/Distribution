package typings.googleapis.v3Mod.analyticsV3

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaAccountRef extends StObject {
  
  /**
    * Link for this account.
    */
  var href: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Account ID.
    */
  var id: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Analytics account reference.
    */
  var kind: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Account name.
    */
  var name: js.UndefOr[String | Null] = js.undefined
}
object SchemaAccountRef {
  
  inline def apply(): SchemaAccountRef = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaAccountRef]
  }
  
  extension [Self <: SchemaAccountRef](x: Self) {
    
    inline def setHref(value: String): Self = StObject.set(x, "href", value.asInstanceOf[js.Any])
    
    inline def setHrefNull: Self = StObject.set(x, "href", null)
    
    inline def setHrefUndefined: Self = StObject.set(x, "href", js.undefined)
    
    inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setIdNull: Self = StObject.set(x, "id", null)
    
    inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    
    inline def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    inline def setKindNull: Self = StObject.set(x, "kind", null)
    
    inline def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameNull: Self = StObject.set(x, "name", null)
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
  }
}
