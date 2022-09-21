package typings.knockstrap

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait KnockoutUtils extends StObject {
  
  def uniqueId(prefix: String): String
  
  def unwrapProperties(wrappedProperies: Any): Any
}
object KnockoutUtils {
  
  inline def apply(uniqueId: String => String, unwrapProperties: Any => Any): KnockoutUtils = {
    val __obj = js.Dynamic.literal(uniqueId = js.Any.fromFunction1(uniqueId), unwrapProperties = js.Any.fromFunction1(unwrapProperties))
    __obj.asInstanceOf[KnockoutUtils]
  }
  
  extension [Self <: KnockoutUtils](x: Self) {
    
    inline def setUniqueId(value: String => String): Self = StObject.set(x, "uniqueId", js.Any.fromFunction1(value))
    
    inline def setUnwrapProperties(value: Any => Any): Self = StObject.set(x, "unwrapProperties", js.Any.fromFunction1(value))
  }
}
