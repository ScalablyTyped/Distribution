package typings.lib0

import typings.std.Element
import typings.std.HTMLCanvasElement
import typings.std.Node
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object loggingDotnodeMod {
  
  @JSImport("lib0/logging.node", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("lib0/logging.node", "BLUE")
  @js.native
  val BLUE: js.Symbol = js.native
  
  @JSImport("lib0/logging.node", "BOLD")
  @js.native
  val BOLD: js.Symbol = js.native
  
  @JSImport("lib0/logging.node", "GREEN")
  @js.native
  val GREEN: js.Symbol = js.native
  
  @JSImport("lib0/logging.node", "GREY")
  @js.native
  val GREY: js.Symbol = js.native
  
  @JSImport("lib0/logging.node", "ORANGE")
  @js.native
  val ORANGE: js.Symbol = js.native
  
  @JSImport("lib0/logging.node", "PURPLE")
  @js.native
  val PURPLE: js.Symbol = js.native
  
  @JSImport("lib0/logging.node", "RED")
  @js.native
  val RED: js.Symbol = js.native
  
  @JSImport("lib0/logging.node", "UNBOLD")
  @js.native
  val UNBOLD: js.Symbol = js.native
  
  @JSImport("lib0/logging.node", "UNCOLOR")
  @js.native
  val UNCOLOR: js.Symbol = js.native
  
  inline def createModuleLogger(moduleName: String): js.Function1[/* repeated */ Any, Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("createModuleLogger")(moduleName.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* repeated */ Any, Unit]]
  
  inline def createVConsole(_dom: Element): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("createVConsole")(_dom.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  inline def group(args: (String | js.Symbol | js.Object | Double)*): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("group")(args.asInstanceOf[Seq[js.Any]]*).asInstanceOf[Unit]
  
  inline def groupCollapsed(args: (String | js.Symbol | js.Object | Double)*): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("groupCollapsed")(args.asInstanceOf[Seq[js.Any]]*).asInstanceOf[Unit]
  
  inline def groupEnd(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("groupEnd")().asInstanceOf[Unit]
  
  inline def print(args: (String | js.Symbol | js.Object | Double)*): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("print")(args.asInstanceOf[Seq[js.Any]]*).asInstanceOf[Unit]
  
  inline def printCanvas(canvas: HTMLCanvasElement, height: Double): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("printCanvas")(canvas.asInstanceOf[js.Any], height.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def printDom(_createNode: js.Function0[Node]): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("printDom")(_createNode.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  inline def printError(err: js.Error): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("printError")(err.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  inline def printImg(_url: String, _height: Double): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("printImg")(_url.asInstanceOf[js.Any], _height.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def printImgBase64(base64: String, height: Double): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("printImgBase64")(base64.asInstanceOf[js.Any], height.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def warn(args: (String | js.Symbol | js.Object | Double)*): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("warn")(args.asInstanceOf[Seq[js.Any]]*).asInstanceOf[Unit]
}
