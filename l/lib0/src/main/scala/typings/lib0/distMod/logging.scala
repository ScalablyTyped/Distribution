package typings.lib0.distMod

import typings.std.Element
import typings.std.HTMLCanvasElement
import typings.std.Node
import typings.std.Set
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object logging {
  
  @JSImport("lib0/dist", "logging")
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("lib0/dist", "logging.BLUE")
  @js.native
  val BLUE: js.Symbol = js.native
  
  @JSImport("lib0/dist", "logging.BOLD")
  @js.native
  val BOLD: js.Symbol = js.native
  
  @JSImport("lib0/dist", "logging.GREEN")
  @js.native
  val GREEN: js.Symbol = js.native
  
  @JSImport("lib0/dist", "logging.GREY")
  @js.native
  val GREY: js.Symbol = js.native
  
  @JSImport("lib0/dist", "logging.ORANGE")
  @js.native
  val ORANGE: js.Symbol = js.native
  
  @JSImport("lib0/dist", "logging.PURPLE")
  @js.native
  val PURPLE: js.Symbol = js.native
  
  @JSImport("lib0/dist", "logging.RED")
  @js.native
  val RED: js.Symbol = js.native
  
  @JSImport("lib0/dist", "logging.UNBOLD")
  @js.native
  val UNBOLD: js.Symbol = js.native
  
  @JSImport("lib0/dist", "logging.UNCOLOR")
  @js.native
  val UNCOLOR: js.Symbol = js.native
  
  @JSImport("lib0/dist", "logging.VConsole")
  @js.native
  open class VConsole protected ()
    extends typings.lib0.distLoggingMod.VConsole {
    /**
      * @param {Element} dom
      */
    def this(dom: Element) = this()
  }
  
  inline def createModuleLogger(moduleName: String): js.Function1[/* repeated */ Any, Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("createModuleLogger")(moduleName.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* repeated */ Any, Unit]]
  
  inline def createVConsole(dom: Element): typings.lib0.distLoggingMod.VConsole = ^.asInstanceOf[js.Dynamic].applyDynamic("createVConsole")(dom.asInstanceOf[js.Any]).asInstanceOf[typings.lib0.distLoggingMod.VConsole]
  
  inline def group(args: (String | js.Symbol | js.Object | Double)*): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("group")(args.asInstanceOf[Seq[js.Any]]*).asInstanceOf[Unit]
  
  inline def groupCollapsed(args: (String | js.Symbol | js.Object | Double)*): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("groupCollapsed")(args.asInstanceOf[Seq[js.Any]]*).asInstanceOf[Unit]
  
  inline def groupEnd(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("groupEnd")().asInstanceOf[Unit]
  
  inline def print(args: (String | js.Symbol | js.Object | Double)*): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("print")(args.asInstanceOf[Seq[js.Any]]*).asInstanceOf[Unit]
  
  inline def printCanvas(canvas: HTMLCanvasElement, height: Double): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("printCanvas")(canvas.asInstanceOf[js.Any], height.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def printDom(createNode: js.Function0[Node]): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("printDom")(createNode.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  inline def printError(err: js.Error): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("printError")(err.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  inline def printImg(url: String, height: Double): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("printImg")(url.asInstanceOf[js.Any], height.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def printImgBase64(base64: String, height: Double): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("printImgBase64")(base64.asInstanceOf[js.Any], height.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  @JSImport("lib0/dist", "logging.vconsoles")
  @js.native
  val vconsoles: Set[Any] = js.native
  
  inline def warn(args: (String | js.Symbol | js.Object | Double)*): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("warn")(args.asInstanceOf[Seq[js.Any]]*).asInstanceOf[Unit]
}
