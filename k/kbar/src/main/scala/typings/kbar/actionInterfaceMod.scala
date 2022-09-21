package typings.kbar

import org.scalablytyped.runtime.StringDictionary
import typings.kbar.actionImplMod.ActionImpl
import typings.kbar.typesMod.Action
import typings.kbar.typesMod.ActionId
import typings.kbar.typesMod.History
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object actionInterfaceMod {
  
  @JSImport("kbar/lib/action/ActionInterface", "ActionInterface")
  @js.native
  open class ActionInterface () extends StObject {
    def this(actions: js.Array[Action]) = this()
    def this(actions: js.Array[Action], options: ActionInterfaceOptions) = this()
    def this(actions: Unit, options: ActionInterfaceOptions) = this()
    
    var actions: Record[ActionId, ActionImpl] = js.native
    
    def add(actions: js.Array[Action]): StringDictionary[ActionImpl] = js.native
    
    var options: ActionInterfaceOptions = js.native
    
    def remove(actions: js.Array[Action]): StringDictionary[ActionImpl] = js.native
  }
  
  trait ActionInterfaceOptions extends StObject {
    
    var historyManager: js.UndefOr[History] = js.undefined
  }
  object ActionInterfaceOptions {
    
    inline def apply(): ActionInterfaceOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ActionInterfaceOptions]
    }
    
    extension [Self <: ActionInterfaceOptions](x: Self) {
      
      inline def setHistoryManager(value: History): Self = StObject.set(x, "historyManager", value.asInstanceOf[js.Any])
      
      inline def setHistoryManagerUndefined: Self = StObject.set(x, "historyManager", js.undefined)
    }
  }
}
