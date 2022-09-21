package typings.googleapis.youtubeV3Mod.youtubeV3

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaRelatedEntity extends StObject {
  
  var entity: js.UndefOr[SchemaEntity] = js.undefined
}
object SchemaRelatedEntity {
  
  inline def apply(): SchemaRelatedEntity = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaRelatedEntity]
  }
  
  extension [Self <: SchemaRelatedEntity](x: Self) {
    
    inline def setEntity(value: SchemaEntity): Self = StObject.set(x, "entity", value.asInstanceOf[js.Any])
    
    inline def setEntityUndefined: Self = StObject.set(x, "entity", js.undefined)
  }
}
