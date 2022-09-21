package typings.i18next.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TFunctionDetailedResult[T] extends StObject {
  
  /**
    * The key with context / plural
    */
  var exactUsedKey: String
  
  /**
    * The translation result.
    */
  var res: T
  
  /**
    * The plain used key
    */
  var usedKey: String
  
  /**
    * The used language for this translation.
    */
  var usedLng: String
  
  /**
    * The used namespace for this translation.
    */
  var usedNS: String
}
object TFunctionDetailedResult {
  
  inline def apply[T](exactUsedKey: String, res: T, usedKey: String, usedLng: String, usedNS: String): TFunctionDetailedResult[T] = {
    val __obj = js.Dynamic.literal(exactUsedKey = exactUsedKey.asInstanceOf[js.Any], res = res.asInstanceOf[js.Any], usedKey = usedKey.asInstanceOf[js.Any], usedLng = usedLng.asInstanceOf[js.Any], usedNS = usedNS.asInstanceOf[js.Any])
    __obj.asInstanceOf[TFunctionDetailedResult[T]]
  }
  
  extension [Self <: TFunctionDetailedResult[?], T](x: Self & TFunctionDetailedResult[T]) {
    
    inline def setExactUsedKey(value: String): Self = StObject.set(x, "exactUsedKey", value.asInstanceOf[js.Any])
    
    inline def setRes(value: T): Self = StObject.set(x, "res", value.asInstanceOf[js.Any])
    
    inline def setUsedKey(value: String): Self = StObject.set(x, "usedKey", value.asInstanceOf[js.Any])
    
    inline def setUsedLng(value: String): Self = StObject.set(x, "usedLng", value.asInstanceOf[js.Any])
    
    inline def setUsedNS(value: String): Self = StObject.set(x, "usedNS", value.asInstanceOf[js.Any])
  }
}
