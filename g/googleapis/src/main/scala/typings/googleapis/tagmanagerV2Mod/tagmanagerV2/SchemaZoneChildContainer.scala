package typings.googleapis.tagmanagerV2Mod.tagmanagerV2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaZoneChildContainer extends StObject {
  
  /**
    * The zone's nickname for the child container.
    */
  var nickname: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The child container's public id.
    */
  var publicId: js.UndefOr[String | Null] = js.undefined
}
object SchemaZoneChildContainer {
  
  inline def apply(): SchemaZoneChildContainer = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaZoneChildContainer]
  }
  
  extension [Self <: SchemaZoneChildContainer](x: Self) {
    
    inline def setNickname(value: String): Self = StObject.set(x, "nickname", value.asInstanceOf[js.Any])
    
    inline def setNicknameNull: Self = StObject.set(x, "nickname", null)
    
    inline def setNicknameUndefined: Self = StObject.set(x, "nickname", js.undefined)
    
    inline def setPublicId(value: String): Self = StObject.set(x, "publicId", value.asInstanceOf[js.Any])
    
    inline def setPublicIdNull: Self = StObject.set(x, "publicId", null)
    
    inline def setPublicIdUndefined: Self = StObject.set(x, "publicId", js.undefined)
  }
}
