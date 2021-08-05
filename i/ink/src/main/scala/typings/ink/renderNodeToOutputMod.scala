package typings.ink

import typings.ink.anon.OffsetX
import typings.ink.domMod.DOMElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object renderNodeToOutputMod {
  
  @JSImport("ink/build/render-node-to-output", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(node: DOMElement, output: typings.ink.outputMod.default, options: OffsetX): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(node.asInstanceOf[js.Any], output.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  type OutputTransformer = js.Function1[/* s */ String, String]
}
