package typings.guardianProsemirrorInvisibles

import typings.prosemirrorView.mod.Decoration
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distUtilsCreateDecoMod {
  
  @JSImport("@guardian/prosemirror-invisibles/dist/utils/create-deco", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Create a decoration for an invisible char of the given type.
    */
  inline def default(pos: Double, `type`: String): Decoration = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(pos.asInstanceOf[js.Any], `type`.asInstanceOf[js.Any])).asInstanceOf[Decoration]
  inline def default(pos: Double, `type`: String, markAsSelected: Boolean): Decoration = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(pos.asInstanceOf[js.Any], `type`.asInstanceOf[js.Any], markAsSelected.asInstanceOf[js.Any])).asInstanceOf[Decoration]
}
