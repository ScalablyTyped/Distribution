package typings.interactjsTypes.anon

import typings.interactjsTypes.scopeMod.Scope
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AutoStartbeforestart extends StObject {
  
  @JSName("autoStart:before-start")
  def `autoStartColonbefore-start`(hasInteractionEventTargetDxDy: PointerArgPropstypemovedx, scope: Scope): Unit
  @JSName("autoStart:before-start")
  var `autoStartColonbefore-start_Original`: js.Function2[
    /* hasInteractionEventTargetDxDy */ PointerArgPropstypemovedx, 
    /* scope */ Scope, 
    Unit
  ]
}
object AutoStartbeforestart {
  
  inline def apply(
    `autoStartColonbefore-start`: (/* hasInteractionEventTargetDxDy */ PointerArgPropstypemovedx, /* scope */ Scope) => Unit
  ): AutoStartbeforestart = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("autoStart:before-start")(js.Any.fromFunction2(`autoStartColonbefore-start`))
    __obj.asInstanceOf[AutoStartbeforestart]
  }
  
  extension [Self <: AutoStartbeforestart](x: Self) {
    
    inline def `setAutoStartColonbefore-start`(value: (/* hasInteractionEventTargetDxDy */ PointerArgPropstypemovedx, /* scope */ Scope) => Unit): Self = StObject.set(x, "autoStart:before-start", js.Any.fromFunction2(value))
  }
}
