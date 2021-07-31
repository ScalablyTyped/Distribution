package typings.hapi.anon

import typings.hapi.hapiBooleans.`true`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ApplyExtend extends StObject {
  
  @JSName("apply")
  var apply: `true`
  
  var extend: js.UndefOr[Boolean] = js.undefined
}
object ApplyExtend {
  
  @scala.inline
  def apply(): ApplyExtend = {
    val __obj = js.Dynamic.literal(apply = true)
    __obj.asInstanceOf[ApplyExtend]
  }
  
  @scala.inline
  implicit class ApplyExtendMutableBuilder[Self <: ApplyExtend] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setApply(value: `true`): Self = StObject.set(x, "apply", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExtend(value: Boolean): Self = StObject.set(x, "extend", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExtendUndefined: Self = StObject.set(x, "extend", js.undefined)
  }
}
