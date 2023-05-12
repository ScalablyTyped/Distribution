package typings.guardianProsemirrorInvisibles

import typings.guardianProsemirrorInvisibles.distStateMod.Command
import typings.guardianProsemirrorInvisibles.distStateMod.PluginState
import typings.guardianProsemirrorInvisibles.distUtilsInvisibleMod.AddDecorationsForInvisible
import typings.guardianProsemirrorInvisibles.distUtilsTextBetweenMod.Position
import typings.prosemirrorModel.mod.Node
import typings.prosemirrorState.mod.EditorState
import typings.prosemirrorState.mod.Plugin
import typings.prosemirrorView.mod.Decoration
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("@guardian/prosemirror-invisibles", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  object commands {
    
    @JSImport("@guardian/prosemirror-invisibles", "commands")
    @js.native
    val ^ : js.Any = js.native
    
    inline def setActiveState(shouldShowInvisibles: Boolean): Command = ^.asInstanceOf[js.Dynamic].applyDynamic("setActiveState")(shouldShowInvisibles.asInstanceOf[js.Any]).asInstanceOf[Command]
    
    inline def setFocusedState(isFocused: Boolean): Command = ^.asInstanceOf[js.Dynamic].applyDynamic("setFocusedState")(isFocused.asInstanceOf[js.Any]).asInstanceOf[Command]
    
    inline def toggleActiveState(): Command = ^.asInstanceOf[js.Dynamic].applyDynamic("toggleActiveState")().asInstanceOf[Command]
  }
  
  /**
    * Create a decoration for an invisible char of the given type.
    */
  inline def createDeco(pos: Double, `type`: String): Decoration = (^.asInstanceOf[js.Dynamic].applyDynamic("createDeco")(pos.asInstanceOf[js.Any], `type`.asInstanceOf[js.Any])).asInstanceOf[Decoration]
  inline def createDeco(pos: Double, `type`: String, markAsSelected: Boolean): Decoration = (^.asInstanceOf[js.Dynamic].applyDynamic("createDeco")(pos.asInstanceOf[js.Any], `type`.asInstanceOf[js.Any], markAsSelected.asInstanceOf[js.Any])).asInstanceOf[Decoration]
  
  inline def createInvisibleDecosForCharacter(`type`: String, predicate: js.Function1[/* text */ String, Boolean]): AddDecorationsForInvisible = (^.asInstanceOf[js.Dynamic].applyDynamic("createInvisibleDecosForCharacter")(`type`.asInstanceOf[js.Any], predicate.asInstanceOf[js.Any])).asInstanceOf[AddDecorationsForInvisible]
  
  inline def createInvisibleDecosForNode(
    `type`: String,
    toPosition: js.Function2[/* node */ Node, /* pos */ Double, Double],
    predicate: js.Function1[/* node */ Node, Boolean]
  ): AddDecorationsForInvisible = (^.asInstanceOf[js.Dynamic].applyDynamic("createInvisibleDecosForNode")(`type`.asInstanceOf[js.Any], toPosition.asInstanceOf[js.Any], predicate.asInstanceOf[js.Any])).asInstanceOf[AddDecorationsForInvisible]
  
  /**
    * Create a plugin to render invisible characters. Accepts a list of
    * creator functions, examples of which are defined in './invisibles'.
    *
    * Example usage: ```
    *  import hardBreak from 'invisibles/hard-break';
    *  import paragraph from 'invisibles/paragraph';
    *  const plugin = createInvisiblesPlugin([hardBreak(), paragraph()])
    * ```
    */
  inline def createInvisiblesPlugin(builders: js.Array[AddDecorationsForInvisible]): Plugin[PluginState] = ^.asInstanceOf[js.Dynamic].applyDynamic("createInvisiblesPlugin")(builders.asInstanceOf[js.Any]).asInstanceOf[Plugin[PluginState]]
  inline def createInvisiblesPlugin(builders: js.Array[AddDecorationsForInvisible], param1: InvisiblesOptions): Plugin[PluginState] = (^.asInstanceOf[js.Dynamic].applyDynamic("createInvisiblesPlugin")(builders.asInstanceOf[js.Any], param1.asInstanceOf[js.Any])).asInstanceOf[Plugin[PluginState]]
  
  @JSImport("@guardian/prosemirror-invisibles", "hardBreak")
  @js.native
  val hardBreak: AddDecorationsForInvisible = js.native
  
  @JSImport("@guardian/prosemirror-invisibles", "heading")
  @js.native
  val heading: AddDecorationsForInvisible = js.native
  
  @JSImport("@guardian/prosemirror-invisibles", "nbSpace")
  @js.native
  val nbSpace: AddDecorationsForInvisible = js.native
  
  @JSImport("@guardian/prosemirror-invisibles", "paragraph")
  @js.native
  val paragraph: AddDecorationsForInvisible = js.native
  
  inline def selectActiveState(state: EditorState): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("selectActiveState")(state.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  @JSImport("@guardian/prosemirror-invisibles", "space")
  @js.native
  val space: AddDecorationsForInvisible = js.native
  
  inline def textBetween(from: Double, to: Double, doc: Node): js.Array[Position] = (^.asInstanceOf[js.Dynamic].applyDynamic("textBetween")(from.asInstanceOf[js.Any], to.asInstanceOf[js.Any], doc.asInstanceOf[js.Any])).asInstanceOf[js.Array[Position]]
  
  trait InvisiblesOptions extends StObject {
    
    var displayLineEndSelection: js.UndefOr[Boolean] = js.undefined
    
    var shouldShowInvisibles: js.UndefOr[Boolean] = js.undefined
  }
  object InvisiblesOptions {
    
    inline def apply(): InvisiblesOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[InvisiblesOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: InvisiblesOptions] (val x: Self) extends AnyVal {
      
      inline def setDisplayLineEndSelection(value: Boolean): Self = StObject.set(x, "displayLineEndSelection", value.asInstanceOf[js.Any])
      
      inline def setDisplayLineEndSelectionUndefined: Self = StObject.set(x, "displayLineEndSelection", js.undefined)
      
      inline def setShouldShowInvisibles(value: Boolean): Self = StObject.set(x, "shouldShowInvisibles", value.asInstanceOf[js.Any])
      
      inline def setShouldShowInvisiblesUndefined: Self = StObject.set(x, "shouldShowInvisibles", js.undefined)
    }
  }
}
