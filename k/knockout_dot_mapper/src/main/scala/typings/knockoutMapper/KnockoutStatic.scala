package typings.knockoutMapper

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait KnockoutStatic extends StObject {
  
  var mapper: KnockoutMapper = js.native
}
object KnockoutStatic {
  
  @scala.inline
  def apply(mapper: KnockoutMapper): KnockoutStatic = {
    val __obj = js.Dynamic.literal(mapper = mapper.asInstanceOf[js.Any])
    __obj.asInstanceOf[KnockoutStatic]
  }
  
  @scala.inline
  implicit class KnockoutStaticMutableBuilder[Self <: KnockoutStatic] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setMapper(value: KnockoutMapper): Self = StObject.set(x, "mapper", value.asInstanceOf[js.Any])
  }
}
