package typings.googleapis.v31Mod.dfareportingV31

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Contains properties of a placement strategy.
  */
trait SchemaPlacementStrategy extends StObject {
  
  /**
    * Account ID of this placement strategy.This is a read-only field that can
    * be left blank.
    */
  var accountId: js.UndefOr[String] = js.undefined
  
  /**
    * ID of this placement strategy. This is a read-only, auto-generated field.
    */
  var id: js.UndefOr[String] = js.undefined
  
  /**
    * Identifies what kind of resource this is. Value: the fixed string
    * &quot;dfareporting#placementStrategy&quot;.
    */
  var kind: js.UndefOr[String] = js.undefined
  
  /**
    * Name of this placement strategy. This is a required field. It must be
    * less than 256 characters long and unique among placement strategies of
    * the same account.
    */
  var name: js.UndefOr[String] = js.undefined
}
object SchemaPlacementStrategy {
  
  inline def apply(): SchemaPlacementStrategy = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaPlacementStrategy]
  }
  
  extension [Self <: SchemaPlacementStrategy](x: Self) {
    
    inline def setAccountId(value: String): Self = StObject.set(x, "accountId", value.asInstanceOf[js.Any])
    
    inline def setAccountIdUndefined: Self = StObject.set(x, "accountId", js.undefined)
    
    inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    
    inline def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    inline def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
  }
}
