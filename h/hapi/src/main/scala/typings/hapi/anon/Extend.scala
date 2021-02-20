package typings.hapi.anon

import typings.hapi.hapiBooleans.`true`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Extend extends StObject {
  
  @JSName("apply")
  var apply: `true` = js.native
  
  var extend: `true` = js.native
}
object Extend {
  
  @scala.inline
  def apply(apply: `true`, extend: `true`): Extend = {
    val __obj = js.Dynamic.literal(apply = apply.asInstanceOf[js.Any], extend = extend.asInstanceOf[js.Any])
    __obj.asInstanceOf[Extend]
  }
  
  @scala.inline
  implicit class ExtendMutableBuilder[Self <: Extend] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setApply(value: `true`): Self = StObject.set(x, "apply", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExtend(value: `true`): Self = StObject.set(x, "extend", value.asInstanceOf[js.Any])
  }
}
