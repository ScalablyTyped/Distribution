package typings.lonaSvgModel

import typings.lonaSvgModel.libElementsMod.SVG_
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libPrintMod {
  
  @JSImport("@lona/svg-model/lib/print", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def printSVG(svg: SVG_): String = ^.asInstanceOf[js.Dynamic].applyDynamic("printSVG")(svg.asInstanceOf[js.Any]).asInstanceOf[String]
}
