package typings.knockstrap

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait KnockoutUtils extends StObject {
  
  def uniqueId(prefix: String): String
  
  def unwrapProperties(wrappedProperies: js.Any): js.Any
}
object KnockoutUtils {
  
  @scala.inline
  def apply(uniqueId: String => String, unwrapProperties: js.Any => js.Any): KnockoutUtils = {
    val __obj = js.Dynamic.literal(uniqueId = js.Any.fromFunction1(uniqueId), unwrapProperties = js.Any.fromFunction1(unwrapProperties))
    __obj.asInstanceOf[KnockoutUtils]
  }
  
  @scala.inline
  implicit class KnockoutUtilsMutableBuilder[Self <: KnockoutUtils] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setUniqueId(value: String => String): Self = StObject.set(x, "uniqueId", js.Any.fromFunction1(value))
    
    @scala.inline
    def setUnwrapProperties(value: js.Any => js.Any): Self = StObject.set(x, "unwrapProperties", js.Any.fromFunction1(value))
  }
}
