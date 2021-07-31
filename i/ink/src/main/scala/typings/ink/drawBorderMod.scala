package typings.ink

import typings.ink.anon.NodeName
import typings.ink.domMod.DOMNode
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object drawBorderMod {
  
  @JSImport("ink/build/draw-border", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def default(x: Double, y: Double, node: DOMNode[NodeName], output: typings.ink.outputMod.default): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(x.asInstanceOf[js.Any], y.asInstanceOf[js.Any], node.asInstanceOf[js.Any], output.asInstanceOf[js.Any])).asInstanceOf[Unit]
}
