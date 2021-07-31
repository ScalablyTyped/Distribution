package typings.hapiHapi.anon

import typings.hapiHapi.hapiHapiBooleans.`true`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `0` extends StObject {
  
  @JSName("apply")
  var apply: js.UndefOr[Boolean] = js.undefined
  
  var extend: `true`
}
object `0` {
  
  @scala.inline
  def apply(): `0` = {
    val __obj = js.Dynamic.literal(extend = true)
    __obj.asInstanceOf[`0`]
  }
  
  @scala.inline
  implicit class `0MutableBuilder`[Self <: `0`] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setApply(value: Boolean): Self = StObject.set(x, "apply", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setApplyUndefined: Self = StObject.set(x, "apply", js.undefined)
    
    @scala.inline
    def setExtend(value: `true`): Self = StObject.set(x, "extend", value.asInstanceOf[js.Any])
  }
}
