package typings.knockback.Knockback

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FactoryOptions extends StObject {
  
  var factories: Any
}
object FactoryOptions {
  
  inline def apply(factories: Any): FactoryOptions = {
    val __obj = js.Dynamic.literal(factories = factories.asInstanceOf[js.Any])
    __obj.asInstanceOf[FactoryOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: FactoryOptions] (val x: Self) extends AnyVal {
    
    inline def setFactories(value: Any): Self = StObject.set(x, "factories", value.asInstanceOf[js.Any])
  }
}
