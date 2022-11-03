package typings.guardianProsemirrorInvisibles

import typings.guardianProsemirrorInvisibles.anon.Payload
import typings.guardianProsemirrorInvisibles.anon.Type
import typings.prosemirrorState.mod.EditorState
import typings.prosemirrorState.mod.PluginKey
import typings.prosemirrorState.mod.Transaction
import typings.prosemirrorView.mod.DecorationSet
import typings.std.ReturnType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distStateMod {
  
  @JSImport("@guardian/prosemirror-invisibles/dist/state", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  object commands {
    
    @JSImport("@guardian/prosemirror-invisibles/dist/state", "commands")
    @js.native
    val ^ : js.Any = js.native
    
    inline def setActiveState(shouldShowInvisibles: Boolean): Command = ^.asInstanceOf[js.Dynamic].applyDynamic("setActiveState")(shouldShowInvisibles.asInstanceOf[js.Any]).asInstanceOf[Command]
    
    inline def setFocusedState(isFocused: Boolean): Command = ^.asInstanceOf[js.Dynamic].applyDynamic("setFocusedState")(isFocused.asInstanceOf[js.Any]).asInstanceOf[Command]
    
    inline def toggleActiveState(): Command = ^.asInstanceOf[js.Dynamic].applyDynamic("toggleActiveState")().asInstanceOf[Command]
  }
  
  inline def getActionFromTransaction(tr: Transaction): js.UndefOr[Actions] = ^.asInstanceOf[js.Dynamic].applyDynamic("getActionFromTransaction")(tr.asInstanceOf[js.Any]).asInstanceOf[js.UndefOr[Actions]]
  
  @JSImport("@guardian/prosemirror-invisibles/dist/state", "pluginKey")
  @js.native
  val pluginKey: PluginKey[PluginState] = js.native
  
  inline def reducer(state: PluginState): PluginState = ^.asInstanceOf[js.Dynamic].applyDynamic("reducer")(state.asInstanceOf[js.Any]).asInstanceOf[PluginState]
  inline def reducer(state: PluginState, action: Actions): PluginState = (^.asInstanceOf[js.Dynamic].applyDynamic("reducer")(state.asInstanceOf[js.Any], action.asInstanceOf[js.Any])).asInstanceOf[PluginState]
  
  inline def selectActiveState(state: EditorState): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("selectActiveState")(state.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  type Actions = ReturnType[js.Function1[/* shouldShowInvisibles */ Boolean, Payload | Type]]
  
  /**
    * Commands
    */
  type Command = js.Function2[
    /* state */ EditorState, 
    /* dispatch */ js.UndefOr[js.Function1[/* tr */ Transaction, Unit]], 
    Boolean
  ]
  
  trait PluginState extends StObject {
    
    var decorations: DecorationSet
    
    var shouldShowInvisibles: Boolean
    
    var shouldShowLineEndSelectionDecorations: Boolean
  }
  object PluginState {
    
    inline def apply(
      decorations: DecorationSet,
      shouldShowInvisibles: Boolean,
      shouldShowLineEndSelectionDecorations: Boolean
    ): PluginState = {
      val __obj = js.Dynamic.literal(decorations = decorations.asInstanceOf[js.Any], shouldShowInvisibles = shouldShowInvisibles.asInstanceOf[js.Any], shouldShowLineEndSelectionDecorations = shouldShowLineEndSelectionDecorations.asInstanceOf[js.Any])
      __obj.asInstanceOf[PluginState]
    }
    
    extension [Self <: PluginState](x: Self) {
      
      inline def setDecorations(value: DecorationSet): Self = StObject.set(x, "decorations", value.asInstanceOf[js.Any])
      
      inline def setShouldShowInvisibles(value: Boolean): Self = StObject.set(x, "shouldShowInvisibles", value.asInstanceOf[js.Any])
      
      inline def setShouldShowLineEndSelectionDecorations(value: Boolean): Self = StObject.set(x, "shouldShowLineEndSelectionDecorations", value.asInstanceOf[js.Any])
    }
  }
}
