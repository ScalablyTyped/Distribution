package typings.kbar

import typings.kbar.actionImplMod.ActionImplOptions
import typings.kbar.actionInterfaceMod.ActionInterfaceOptions
import typings.kbar.typesMod.Action
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object actionMod {
  
  @JSImport("kbar/lib/action", "ActionImpl")
  @js.native
  open class ActionImpl protected ()
    extends typings.kbar.actionImplMod.ActionImpl {
    def this(action: Action, options: ActionImplOptions) = this()
  }
  /* static members */
  object ActionImpl {
    
    @JSImport("kbar/lib/action", "ActionImpl")
    @js.native
    val ^ : js.Any = js.native
    
    inline def create(action: Action, options: ActionImplOptions): typings.kbar.actionImplMod.ActionImpl = (^.asInstanceOf[js.Dynamic].applyDynamic("create")(action.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[typings.kbar.actionImplMod.ActionImpl]
  }
  
  @JSImport("kbar/lib/action", "ActionInterface")
  @js.native
  open class ActionInterface ()
    extends typings.kbar.actionInterfaceMod.ActionInterface {
    def this(actions: js.Array[Action]) = this()
    def this(actions: js.Array[Action], options: ActionInterfaceOptions) = this()
    def this(actions: Unit, options: ActionInterfaceOptions) = this()
  }
}
