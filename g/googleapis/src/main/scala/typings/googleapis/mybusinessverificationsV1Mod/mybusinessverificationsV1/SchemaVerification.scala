package typings.googleapis.mybusinessverificationsV1Mod.mybusinessverificationsV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaVerification extends StObject {
  
  /**
    * The timestamp when the verification is requested.
    */
  var createTime: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The method of the verification.
    */
  var method: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Resource name of the verification.
    */
  var name: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The state of the verification.
    */
  var state: js.UndefOr[String | Null] = js.undefined
}
object SchemaVerification {
  
  inline def apply(): SchemaVerification = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaVerification]
  }
  
  extension [Self <: SchemaVerification](x: Self) {
    
    inline def setCreateTime(value: String): Self = StObject.set(x, "createTime", value.asInstanceOf[js.Any])
    
    inline def setCreateTimeNull: Self = StObject.set(x, "createTime", null)
    
    inline def setCreateTimeUndefined: Self = StObject.set(x, "createTime", js.undefined)
    
    inline def setMethod(value: String): Self = StObject.set(x, "method", value.asInstanceOf[js.Any])
    
    inline def setMethodNull: Self = StObject.set(x, "method", null)
    
    inline def setMethodUndefined: Self = StObject.set(x, "method", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameNull: Self = StObject.set(x, "name", null)
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setState(value: String): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
    
    inline def setStateNull: Self = StObject.set(x, "state", null)
    
    inline def setStateUndefined: Self = StObject.set(x, "state", js.undefined)
  }
}
