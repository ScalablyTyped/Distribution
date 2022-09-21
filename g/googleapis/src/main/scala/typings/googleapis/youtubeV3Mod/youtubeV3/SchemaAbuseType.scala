package typings.googleapis.youtubeV3Mod.youtubeV3

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaAbuseType extends StObject {
  
  var id: js.UndefOr[String | Null] = js.undefined
}
object SchemaAbuseType {
  
  inline def apply(): SchemaAbuseType = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaAbuseType]
  }
  
  extension [Self <: SchemaAbuseType](x: Self) {
    
    inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setIdNull: Self = StObject.set(x, "id", null)
    
    inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
  }
}
