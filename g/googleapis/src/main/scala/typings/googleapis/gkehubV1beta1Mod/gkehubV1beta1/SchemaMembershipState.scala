package typings.googleapis.gkehubV1beta1Mod.gkehubV1beta1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaMembershipState extends StObject {
  
  /**
    * Output only. The current state of the Membership resource.
    */
  var code: js.UndefOr[String | Null] = js.undefined
  
  /**
    * This field is never set by the Hub Service.
    */
  var description: js.UndefOr[String | Null] = js.undefined
  
  /**
    * This field is never set by the Hub Service.
    */
  var updateTime: js.UndefOr[String | Null] = js.undefined
}
object SchemaMembershipState {
  
  inline def apply(): SchemaMembershipState = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaMembershipState]
  }
  
  extension [Self <: SchemaMembershipState](x: Self) {
    
    inline def setCode(value: String): Self = StObject.set(x, "code", value.asInstanceOf[js.Any])
    
    inline def setCodeNull: Self = StObject.set(x, "code", null)
    
    inline def setCodeUndefined: Self = StObject.set(x, "code", js.undefined)
    
    inline def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionNull: Self = StObject.set(x, "description", null)
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    inline def setUpdateTime(value: String): Self = StObject.set(x, "updateTime", value.asInstanceOf[js.Any])
    
    inline def setUpdateTimeNull: Self = StObject.set(x, "updateTime", null)
    
    inline def setUpdateTimeUndefined: Self = StObject.set(x, "updateTime", js.undefined)
  }
}
