package typings.ink

import typings.ink.anon.OffsetX
import typings.ink.domMod.DOMElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object renderNodeToOutputMod {
  
  @JSImport("ink/build/render-node-to-output", JSImport.Default)
  @js.native
  def default(node: DOMElement, output: typings.ink.outputMod.default, options: OffsetX): Unit = js.native
  
  type OutputTransformer = js.Function1[/* s */ String, String]
}
