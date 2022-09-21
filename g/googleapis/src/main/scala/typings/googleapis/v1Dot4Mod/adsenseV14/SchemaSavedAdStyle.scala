package typings.googleapis.v1Dot4Mod.adsenseV14

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaSavedAdStyle extends StObject {
  
  /**
    * The AdStyle itself.
    */
  var adStyle: js.UndefOr[SchemaAdStyle] = js.undefined
  
  /**
    * Unique identifier of this saved ad style. This should be considered an opaque identifier; it is not safe to rely on it being in any particular format.
    */
  var id: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Kind of resource this is, in this case adsense#savedAdStyle.
    */
  var kind: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The user selected name of this SavedAdStyle.
    */
  var name: js.UndefOr[String | Null] = js.undefined
}
object SchemaSavedAdStyle {
  
  inline def apply(): SchemaSavedAdStyle = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaSavedAdStyle]
  }
  
  extension [Self <: SchemaSavedAdStyle](x: Self) {
    
    inline def setAdStyle(value: SchemaAdStyle): Self = StObject.set(x, "adStyle", value.asInstanceOf[js.Any])
    
    inline def setAdStyleUndefined: Self = StObject.set(x, "adStyle", js.undefined)
    
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
