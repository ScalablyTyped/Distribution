package typings.guardianProsemirrorInvisibles

import typings.guardianProsemirrorInvisibles.distUtilsInvisibleMod.AddDecorationsForInvisible
import typings.prosemirrorModel.mod.Node
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distInvisiblesNodeMod {
  
  @JSImport("@guardian/prosemirror-invisibles/dist/invisibles/node", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def createInvisibleDecosForNode(
    `type`: String,
    toPosition: js.Function2[/* node */ Node, /* pos */ Double, Double],
    predicate: js.Function1[/* node */ Node, Boolean]
  ): AddDecorationsForInvisible = (^.asInstanceOf[js.Dynamic].applyDynamic("createInvisibleDecosForNode")(`type`.asInstanceOf[js.Any], toPosition.asInstanceOf[js.Any], predicate.asInstanceOf[js.Any])).asInstanceOf[AddDecorationsForInvisible]
  inline def createInvisibleDecosForNode(
    `type`: String,
    toPosition: js.Function2[/* node */ Node, /* pos */ Double, Double],
    predicate: js.Function1[/* node */ Node, Boolean],
    shouldMarkAsSelected: Boolean
  ): AddDecorationsForInvisible = (^.asInstanceOf[js.Dynamic].applyDynamic("createInvisibleDecosForNode")(`type`.asInstanceOf[js.Any], toPosition.asInstanceOf[js.Any], predicate.asInstanceOf[js.Any], shouldMarkAsSelected.asInstanceOf[js.Any])).asInstanceOf[AddDecorationsForInvisible]
}
