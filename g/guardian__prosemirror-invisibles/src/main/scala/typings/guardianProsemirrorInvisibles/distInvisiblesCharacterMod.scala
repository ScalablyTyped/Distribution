package typings.guardianProsemirrorInvisibles

import typings.guardianProsemirrorInvisibles.distUtilsInvisibleMod.AddDecorationsForInvisible
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distInvisiblesCharacterMod {
  
  @JSImport("@guardian/prosemirror-invisibles/dist/invisibles/character", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def createInvisibleDecosForCharacter(`type`: String, predicate: js.Function1[/* text */ String, Boolean]): AddDecorationsForInvisible = (^.asInstanceOf[js.Dynamic].applyDynamic("createInvisibleDecosForCharacter")(`type`.asInstanceOf[js.Any], predicate.asInstanceOf[js.Any])).asInstanceOf[AddDecorationsForInvisible]
}
