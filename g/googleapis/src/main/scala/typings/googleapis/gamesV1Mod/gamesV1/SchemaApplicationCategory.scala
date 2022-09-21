package typings.googleapis.gamesV1Mod.gamesV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaApplicationCategory extends StObject {
  
  /**
    * Uniquely identifies the type of this resource. Value is always the fixed string `games#applicationCategory`.
    */
  var kind: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The primary category.
    */
  var primary: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The secondary category.
    */
  var secondary: js.UndefOr[String | Null] = js.undefined
}
object SchemaApplicationCategory {
  
  inline def apply(): SchemaApplicationCategory = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaApplicationCategory]
  }
  
  extension [Self <: SchemaApplicationCategory](x: Self) {
    
    inline def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    inline def setKindNull: Self = StObject.set(x, "kind", null)
    
    inline def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
    
    inline def setPrimary(value: String): Self = StObject.set(x, "primary", value.asInstanceOf[js.Any])
    
    inline def setPrimaryNull: Self = StObject.set(x, "primary", null)
    
    inline def setPrimaryUndefined: Self = StObject.set(x, "primary", js.undefined)
    
    inline def setSecondary(value: String): Self = StObject.set(x, "secondary", value.asInstanceOf[js.Any])
    
    inline def setSecondaryNull: Self = StObject.set(x, "secondary", null)
    
    inline def setSecondaryUndefined: Self = StObject.set(x, "secondary", js.undefined)
  }
}
