package typings.lib0

import typings.std.Element
import typings.std.HTMLCanvasElement
import typings.std.Node
import typings.std.Set
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distLoggingMod {
  
  @JSImport("lib0/dist/logging", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("lib0/dist/logging", "BLUE")
  @js.native
  val BLUE: js.Symbol = js.native
  
  @JSImport("lib0/dist/logging", "BOLD")
  @js.native
  val BOLD: js.Symbol = js.native
  
  @JSImport("lib0/dist/logging", "GREEN")
  @js.native
  val GREEN: js.Symbol = js.native
  
  @JSImport("lib0/dist/logging", "GREY")
  @js.native
  val GREY: js.Symbol = js.native
  
  @JSImport("lib0/dist/logging", "ORANGE")
  @js.native
  val ORANGE: js.Symbol = js.native
  
  @JSImport("lib0/dist/logging", "PURPLE")
  @js.native
  val PURPLE: js.Symbol = js.native
  
  @JSImport("lib0/dist/logging", "RED")
  @js.native
  val RED: js.Symbol = js.native
  
  @JSImport("lib0/dist/logging", "UNBOLD")
  @js.native
  val UNBOLD: js.Symbol = js.native
  
  @JSImport("lib0/dist/logging", "UNCOLOR")
  @js.native
  val UNCOLOR: js.Symbol = js.native
  
  @JSImport("lib0/dist/logging", "VConsole")
  @js.native
  open class VConsole protected () extends StObject {
    /**
      * @param {Element} dom
      */
    def this(dom: Element) = this()
    
    /**
      * @type {Element}
      */
    var ccontainer: Element = js.native
    
    var depth: Double = js.native
    
    def destroy(): Unit = js.native
    
    var dom: Element = js.native
    
    /**
      * @param {Array<string|Symbol|Object|number>} args
      * @param {boolean} collapsed
      */
    def group(args: js.Array[String | js.Symbol | js.Object | Double]): Unit = js.native
    def group(args: js.Array[String | js.Symbol | js.Object | Double], collapsed: Boolean): Unit = js.native
    
    /**
      * @param {Array<string|Symbol|Object|number>} args
      */
    def groupCollapsed(args: js.Array[String | js.Symbol | js.Object | Double]): Unit = js.native
    
    def groupEnd(): Unit = js.native
    
    /**
      * @param {Array<string|Symbol|Object|number>} args
      */
    def print(args: js.Array[String | js.Symbol | js.Object | Double]): Unit = js.native
    
    /**
      * @param {Node} node
      */
    def printDom(node: Node): Unit = js.native
    
    /**
      * @param {Error} err
      */
    def printError(err: js.Error): Unit = js.native
    
    /**
      * @param {string} url
      * @param {number} height
      */
    def printImg(url: String, height: Double): Unit = js.native
  }
  
  inline def createModuleLogger(moduleName: String): js.Function1[/* repeated */ Any, Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("createModuleLogger")(moduleName.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* repeated */ Any, Unit]]
  
  inline def createVConsole(dom: Element): VConsole = ^.asInstanceOf[js.Dynamic].applyDynamic("createVConsole")(dom.asInstanceOf[js.Any]).asInstanceOf[VConsole]
  
  inline def group(args: (String | js.Symbol | js.Object | Double)*): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("group")(args.asInstanceOf[Seq[js.Any]]*).asInstanceOf[Unit]
  
  inline def groupCollapsed(args: (String | js.Symbol | js.Object | Double)*): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("groupCollapsed")(args.asInstanceOf[Seq[js.Any]]*).asInstanceOf[Unit]
  
  inline def groupEnd(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("groupEnd")().asInstanceOf[Unit]
  
  inline def print(args: (String | js.Symbol | js.Object | Double)*): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("print")(args.asInstanceOf[Seq[js.Any]]*).asInstanceOf[Unit]
  
  inline def printCanvas(canvas: HTMLCanvasElement, height: Double): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("printCanvas")(canvas.asInstanceOf[js.Any], height.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def printDom(createNode: js.Function0[Node]): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("printDom")(createNode.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  inline def printError(err: js.Error): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("printError")(err.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  inline def printImg(url: String, height: Double): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("printImg")(url.asInstanceOf[js.Any], height.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def printImgBase64(base64: String, height: Double): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("printImgBase64")(base64.asInstanceOf[js.Any], height.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  @JSImport("lib0/dist/logging", "vconsoles")
  @js.native
  val vconsoles: Set[Any] = js.native
  
  inline def warn(args: (String | js.Symbol | js.Object | Double)*): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("warn")(args.asInstanceOf[Seq[js.Any]]*).asInstanceOf[Unit]
}
