package typings.jointjs.global.joint

import typings.jointjs.jointjsStrings.addClass
import typings.jointjs.jointjsStrings.opacity
import typings.jointjs.jointjsStrings.stroke
import typings.jointjs.mod.highlighters.GenericHighlighter
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object highlighters {
  
  @JSGlobal("joint.highlighters")
  @js.native
  val ^ : js.Any = js.native
  
  @JSGlobal("joint.highlighters.addClass")
  @js.native
  def addClass: GenericHighlighter[typings.jointjs.jointjsStrings.addClass] = js.native
  inline def addClass_=(x: GenericHighlighter[addClass]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("addClass")(x.asInstanceOf[js.Any])
  
  @JSGlobal("joint.highlighters.opacity")
  @js.native
  def opacity: GenericHighlighter[typings.jointjs.jointjsStrings.opacity] = js.native
  inline def opacity_=(x: GenericHighlighter[opacity]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("opacity")(x.asInstanceOf[js.Any])
  
  @JSGlobal("joint.highlighters.stroke")
  @js.native
  def stroke: GenericHighlighter[typings.jointjs.jointjsStrings.stroke] = js.native
  inline def stroke_=(x: GenericHighlighter[stroke]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("stroke")(x.asInstanceOf[js.Any])
}
