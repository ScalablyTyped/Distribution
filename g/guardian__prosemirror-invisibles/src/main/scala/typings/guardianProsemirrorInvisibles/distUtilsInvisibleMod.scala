package typings.guardianProsemirrorInvisibles

import typings.prosemirrorModel.mod.Node
import typings.prosemirrorState.mod.Selection
import typings.prosemirrorView.mod.DecorationSet
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distUtilsInvisibleMod {
  
  /* keyof @guardian/prosemirror-invisibles.anon.CHAR */ /* Rewritten from type alias, can be one of: 
    - typings.guardianProsemirrorInvisibles.guardianProsemirrorInvisiblesStrings.NODE
    - typings.guardianProsemirrorInvisibles.guardianProsemirrorInvisiblesStrings.CHAR
  */
  trait BuilderTypes extends StObject
  object BuilderTypes {
    
    @JSImport("@guardian/prosemirror-invisibles/dist/utils/invisible", "BuilderTypes.CHAR")
    @js.native
    val CHAR: typings.guardianProsemirrorInvisibles.guardianProsemirrorInvisiblesStrings.CHAR = js.native
    
    @JSImport("@guardian/prosemirror-invisibles/dist/utils/invisible", "BuilderTypes.NODE")
    @js.native
    val NODE: typings.guardianProsemirrorInvisibles.guardianProsemirrorInvisiblesStrings.NODE = js.native
  }
  
  /**
    * Append a set of decorations for an invisible character to the given DecorationSet.
    */
  @js.native
  trait AddDecorationsForInvisible extends StObject {
    
    def createDecorations(from: Double, to: Double, doc: Node, decos: DecorationSet): DecorationSet = js.native
    def createDecorations(from: Double, to: Double, doc: Node, decos: DecorationSet, selection: Selection): DecorationSet = js.native
    
    var `type`: BuilderTypes = js.native
  }
}
