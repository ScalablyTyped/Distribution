package typings.ink

import typings.ink.domMod.DOMElement
import typings.ink.domMod.TextNode
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object calculateWrappedTextMod {
  
  @JSImport("ink/build/calculate-wrapped-text", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def calculateWrappedText(node: DOMElement): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("calculateWrappedText")(node.asInstanceOf[js.Any]).asInstanceOf[Unit]
  inline def calculateWrappedText(node: TextNode): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("calculateWrappedText")(node.asInstanceOf[js.Any]).asInstanceOf[Unit]
}
