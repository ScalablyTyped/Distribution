package typings.interactjsTypes.dropPluginMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* augmented module */
object interactjsCoreScopeAugmentingMod {
  
  trait Scope extends StObject {
    
    var dynamicDrop: js.UndefOr[Boolean] = js.undefined
  }
  object Scope {
    
    inline def apply(): Scope = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Scope]
    }
    
    extension [Self <: Scope](x: Self) {
      
      inline def setDynamicDrop(value: Boolean): Self = StObject.set(x, "dynamicDrop", value.asInstanceOf[js.Any])
      
      inline def setDynamicDropUndefined: Self = StObject.set(x, "dynamicDrop", js.undefined)
    }
  }
  
  trait SignalArgs extends StObject {
    
    @JSName("actions/drop:end")
    var actionsSlashdropColonend: DropSignalArg
    
    @JSName("actions/drop:move")
    var actionsSlashdropColonmove: DropSignalArg
    
    @JSName("actions/drop:start")
    var actionsSlashdropColonstart: DropSignalArg
  }
  object SignalArgs {
    
    inline def apply(
      actionsSlashdropColonend: DropSignalArg,
      actionsSlashdropColonmove: DropSignalArg,
      actionsSlashdropColonstart: DropSignalArg
    ): SignalArgs = {
      val __obj = js.Dynamic.literal()
      __obj.updateDynamic("actions/drop:end")(actionsSlashdropColonend.asInstanceOf[js.Any])
      __obj.updateDynamic("actions/drop:move")(actionsSlashdropColonmove.asInstanceOf[js.Any])
      __obj.updateDynamic("actions/drop:start")(actionsSlashdropColonstart.asInstanceOf[js.Any])
      __obj.asInstanceOf[SignalArgs]
    }
    
    extension [Self <: SignalArgs](x: Self) {
      
      inline def setActionsSlashdropColonend(value: DropSignalArg): Self = StObject.set(x, "actions/drop:end", value.asInstanceOf[js.Any])
      
      inline def setActionsSlashdropColonmove(value: DropSignalArg): Self = StObject.set(x, "actions/drop:move", value.asInstanceOf[js.Any])
      
      inline def setActionsSlashdropColonstart(value: DropSignalArg): Self = StObject.set(x, "actions/drop:start", value.asInstanceOf[js.Any])
    }
  }
}
