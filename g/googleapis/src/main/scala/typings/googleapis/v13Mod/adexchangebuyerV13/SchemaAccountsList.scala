package typings.googleapis.v13Mod.adexchangebuyerV13

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * An account feed lists Ad Exchange buyer accounts that the user has access
  * to. Each entry in the feed corresponds to a single buyer account.
  */
trait SchemaAccountsList extends StObject {
  
  /**
    * A list of accounts.
    */
  var items: js.UndefOr[js.Array[SchemaAccount]] = js.undefined
  
  /**
    * Resource type.
    */
  var kind: js.UndefOr[String] = js.undefined
}
object SchemaAccountsList {
  
  inline def apply(): SchemaAccountsList = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaAccountsList]
  }
  
  extension [Self <: SchemaAccountsList](x: Self) {
    
    inline def setItems(value: js.Array[SchemaAccount]): Self = StObject.set(x, "items", value.asInstanceOf[js.Any])
    
    inline def setItemsUndefined: Self = StObject.set(x, "items", js.undefined)
    
    inline def setItemsVarargs(value: SchemaAccount*): Self = StObject.set(x, "items", js.Array(value :_*))
    
    inline def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    inline def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
  }
}
