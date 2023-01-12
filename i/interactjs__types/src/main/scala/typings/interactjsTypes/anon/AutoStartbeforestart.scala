package typings.interactjsTypes.anon

import typings.interactjsTypes.coreScopeMod.Scope
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AutoStartbeforestart extends StObject {
  
  @JSName("autoStart:before-start")
  def `autoStartColonbefore-start`(param0: PointerArgPropstypemovedx, scope: Scope): Unit
  @JSName("autoStart:before-start")
  var `autoStartColonbefore-start_Original`: js.Function2[/* param0 */ PointerArgPropstypemovedx, /* scope */ Scope, Unit]
}
object AutoStartbeforestart {
  
  inline def apply(`autoStartColonbefore-start`: (/* param0 */ PointerArgPropstypemovedx, /* scope */ Scope) => Unit): AutoStartbeforestart = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("autoStart:before-start")(js.Any.fromFunction2(`autoStartColonbefore-start`))
    __obj.asInstanceOf[AutoStartbeforestart]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: AutoStartbeforestart] (val x: Self) extends AnyVal {
    
    inline def `setAutoStartColonbefore-start`(value: (/* param0 */ PointerArgPropstypemovedx, /* scope */ Scope) => Unit): Self = StObject.set(x, "autoStart:before-start", js.Any.fromFunction2(value))
  }
}
