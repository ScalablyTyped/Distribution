package typings.googleapis.v3Mod.analyticsV3

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * JSON template for a profile filter link.
  */
trait SchemaFilterRef extends StObject {
  
  /**
    * Account ID to which this filter belongs.
    */
  var accountId: js.UndefOr[String] = js.undefined
  
  /**
    * Link for this filter.
    */
  var href: js.UndefOr[String] = js.undefined
  
  /**
    * Filter ID.
    */
  var id: js.UndefOr[String] = js.undefined
  
  /**
    * Kind value for filter reference.
    */
  var kind: js.UndefOr[String] = js.undefined
  
  /**
    * Name of this filter.
    */
  var name: js.UndefOr[String] = js.undefined
}
object SchemaFilterRef {
  
  inline def apply(): SchemaFilterRef = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaFilterRef]
  }
  
  extension [Self <: SchemaFilterRef](x: Self) {
    
    inline def setAccountId(value: String): Self = StObject.set(x, "accountId", value.asInstanceOf[js.Any])
    
    inline def setAccountIdUndefined: Self = StObject.set(x, "accountId", js.undefined)
    
    inline def setHref(value: String): Self = StObject.set(x, "href", value.asInstanceOf[js.Any])
    
    inline def setHrefUndefined: Self = StObject.set(x, "href", js.undefined)
    
    inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    
    inline def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    inline def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
  }
}
