package typings.hapiHapi.anon

import typings.hapiHapi.hapiHapiBooleans.`true`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Extend extends StObject {
  
  @JSName("apply")
  var apply: `true`
  
  var extend: `true`
}
object Extend {
  
  @scala.inline
  def apply(): Extend = {
    val __obj = js.Dynamic.literal(apply = true, extend = true)
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
