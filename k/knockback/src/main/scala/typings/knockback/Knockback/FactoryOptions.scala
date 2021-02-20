package typings.knockback.Knockback

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FactoryOptions extends StObject {
  
  var factories: js.Any = js.native
}
object FactoryOptions {
  
  @scala.inline
  def apply(factories: js.Any): FactoryOptions = {
    val __obj = js.Dynamic.literal(factories = factories.asInstanceOf[js.Any])
    __obj.asInstanceOf[FactoryOptions]
  }
  
  @scala.inline
  implicit class FactoryOptionsMutableBuilder[Self <: FactoryOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFactories(value: js.Any): Self = StObject.set(x, "factories", value.asInstanceOf[js.Any])
  }
}
