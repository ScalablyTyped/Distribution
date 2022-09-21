package typings.googleapis.firestoreV1beta1Mod.firestoreV1beta1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaPrecondition extends StObject {
  
  /**
    * When set to `true`, the target document must exist. When set to `false`, the target document must not exist.
    */
  var exists: js.UndefOr[Boolean | Null] = js.undefined
  
  /**
    * When set, the target document must exist and have been last updated at that time. Timestamp must be microsecond aligned.
    */
  var updateTime: js.UndefOr[String | Null] = js.undefined
}
object SchemaPrecondition {
  
  inline def apply(): SchemaPrecondition = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaPrecondition]
  }
  
  extension [Self <: SchemaPrecondition](x: Self) {
    
    inline def setExists(value: Boolean): Self = StObject.set(x, "exists", value.asInstanceOf[js.Any])
    
    inline def setExistsNull: Self = StObject.set(x, "exists", null)
    
    inline def setExistsUndefined: Self = StObject.set(x, "exists", js.undefined)
    
    inline def setUpdateTime(value: String): Self = StObject.set(x, "updateTime", value.asInstanceOf[js.Any])
    
    inline def setUpdateTimeNull: Self = StObject.set(x, "updateTime", null)
    
    inline def setUpdateTimeUndefined: Self = StObject.set(x, "updateTime", js.undefined)
  }
}
