package typings.kbar

import typings.kbar.libActionCommandMod.Command
import typings.kbar.libTypesMod.Action
import typings.kbar.libTypesMod.ActionId
import typings.kbar.libTypesMod.ActionStore
import typings.kbar.libTypesMod.History
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libActionActionImplMod {
  
  @JSImport("kbar/lib/action/ActionImpl", "ActionImpl")
  @js.native
  open class ActionImpl protected ()
    extends StObject
       with Action {
    def this(action: Action, options: ActionImplOptions) = this()
    
    def addChild(childActionImpl: ActionImpl): Unit = js.native
    
    var ancestors: js.Array[ActionImpl] = js.native
    
    var children: js.Array[ActionImpl] = js.native
    
    var command: js.UndefOr[Command] = js.native
    
    /* CompleteClass */
    var id: ActionId = js.native
    
    /* CompleteClass */
    var name: String = js.native
    
    def parentActionImpl: ActionImpl = js.native
    
    @JSName("priority")
    var priority_ActionImpl: Double = js.native
    
    def removeChild(actionImpl: ActionImpl): Unit = js.native
  }
  /* static members */
  object ActionImpl {
    
    @JSImport("kbar/lib/action/ActionImpl", "ActionImpl")
    @js.native
    val ^ : js.Any = js.native
    
    inline def create(action: Action, options: ActionImplOptions): ActionImpl = (^.asInstanceOf[js.Dynamic].applyDynamic("create")(action.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[ActionImpl]
  }
  
  trait ActionImplOptions extends StObject {
    
    var ancestors: js.UndefOr[js.Array[ActionImpl]] = js.undefined
    
    var history: js.UndefOr[History] = js.undefined
    
    var store: ActionStore
  }
  object ActionImplOptions {
    
    inline def apply(store: ActionStore): ActionImplOptions = {
      val __obj = js.Dynamic.literal(store = store.asInstanceOf[js.Any])
      __obj.asInstanceOf[ActionImplOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ActionImplOptions] (val x: Self) extends AnyVal {
      
      inline def setAncestors(value: js.Array[ActionImpl]): Self = StObject.set(x, "ancestors", value.asInstanceOf[js.Any])
      
      inline def setAncestorsUndefined: Self = StObject.set(x, "ancestors", js.undefined)
      
      inline def setAncestorsVarargs(value: ActionImpl*): Self = StObject.set(x, "ancestors", js.Array(value*))
      
      inline def setHistory(value: History): Self = StObject.set(x, "history", value.asInstanceOf[js.Any])
      
      inline def setHistoryUndefined: Self = StObject.set(x, "history", js.undefined)
      
      inline def setStore(value: ActionStore): Self = StObject.set(x, "store", value.asInstanceOf[js.Any])
    }
  }
}
