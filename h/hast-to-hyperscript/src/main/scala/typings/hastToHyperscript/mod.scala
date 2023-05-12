package typings.hastToHyperscript

import typings.hastToHyperscript.libMod.Node
import typings.std.ReturnType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("hast-to-hyperscript", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def toH[H /* <: typings.hastToHyperscript.libMod.CreateElementLike */](h: H, tree: Node): ReturnType[H] = (^.asInstanceOf[js.Dynamic].applyDynamic("toH")(h.asInstanceOf[js.Any], tree.asInstanceOf[js.Any])).asInstanceOf[ReturnType[H]]
  inline def toH[H /* <: typings.hastToHyperscript.libMod.CreateElementLike */](h: H, tree: Node, options: String): ReturnType[H] = (^.asInstanceOf[js.Dynamic].applyDynamic("toH")(h.asInstanceOf[js.Any], tree.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[ReturnType[H]]
  inline def toH[H /* <: typings.hastToHyperscript.libMod.CreateElementLike */](h: H, tree: Node, options: Boolean): ReturnType[H] = (^.asInstanceOf[js.Dynamic].applyDynamic("toH")(h.asInstanceOf[js.Any], tree.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[ReturnType[H]]
  inline def toH[H /* <: typings.hastToHyperscript.libMod.CreateElementLike */](h: H, tree: Node, options: typings.hastToHyperscript.libMod.Options): ReturnType[H] = (^.asInstanceOf[js.Dynamic].applyDynamic("toH")(h.asInstanceOf[js.Any], tree.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[ReturnType[H]]
  
  type CreateElementLike = typings.hastToHyperscript.libMod.CreateElementLike
  
  type Options = typings.hastToHyperscript.libMod.Options
}
