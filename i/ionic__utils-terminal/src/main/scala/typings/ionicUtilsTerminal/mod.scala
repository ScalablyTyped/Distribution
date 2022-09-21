package typings.ionicUtilsTerminal

import typings.ionicUtilsTerminal.formatMod.ColumnarOptions
import typings.ionicUtilsTerminal.formatMod.WordWrapOptions
import typings.ionicUtilsTerminal.infoMod.TerminalInfo
import typings.node.processMod.global.NodeJS.WriteStream
import typings.stringWidth.mod.Options
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("@ionic/utils-terminal", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@ionic/utils-terminal", "CI_ENVIRONMENT_VARIABLES")
  @js.native
  val CI_ENVIRONMENT_VARIABLES: js.Array[String] = js.native
  
  @JSImport("@ionic/utils-terminal", "CI_ENVIRONMENT_VARIABLES_DETECTED")
  @js.native
  val CI_ENVIRONMENT_VARIABLES_DETECTED: js.Array[String] = js.native
  
  @JSImport("@ionic/utils-terminal", "Cursor")
  @js.native
  open class Cursor ()
    extends typings.ionicUtilsTerminal.cursorMod.Cursor
  /* static members */
  object Cursor {
    
    @JSImport("@ionic/utils-terminal", "Cursor")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("@ionic/utils-terminal", "Cursor._isVisible")
    @js.native
    def _isVisible: Any = js.native
    inline def _isVisible_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("_isVisible")(x.asInstanceOf[js.Any])
    
    @JSImport("@ionic/utils-terminal", "Cursor._listenerAttached")
    @js.native
    def _listenerAttached: Any = js.native
    inline def _listenerAttached_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("_listenerAttached")(x.asInstanceOf[js.Any])
    
    inline def hide(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("hide")().asInstanceOf[Unit]
    
    inline def show(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("show")().asInstanceOf[Unit]
    
    @JSImport("@ionic/utils-terminal", "Cursor.stream")
    @js.native
    def stream: WriteStream = js.native
    inline def stream_=(x: WriteStream): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("stream")(x.asInstanceOf[js.Any])
    
    inline def toggle(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("toggle")().asInstanceOf[Unit]
  }
  
  @JSImport("@ionic/utils-terminal", "EscapeCode")
  @js.native
  open class EscapeCode ()
    extends typings.ionicUtilsTerminal.ansiMod.EscapeCode
  /* static members */
  object EscapeCode {
    
    @JSImport("@ionic/utils-terminal", "EscapeCode")
    @js.native
    val ^ : js.Any = js.native
    
    inline def cursorBackward(): String = ^.asInstanceOf[js.Dynamic].applyDynamic("cursorBackward")().asInstanceOf[String]
    inline def cursorBackward(count: Double): String = ^.asInstanceOf[js.Dynamic].applyDynamic("cursorBackward")(count.asInstanceOf[js.Any]).asInstanceOf[String]
    
    inline def cursorDown(): String = ^.asInstanceOf[js.Dynamic].applyDynamic("cursorDown")().asInstanceOf[String]
    inline def cursorDown(count: Double): String = ^.asInstanceOf[js.Dynamic].applyDynamic("cursorDown")(count.asInstanceOf[js.Any]).asInstanceOf[String]
    
    inline def cursorForward(): String = ^.asInstanceOf[js.Dynamic].applyDynamic("cursorForward")().asInstanceOf[String]
    inline def cursorForward(count: Double): String = ^.asInstanceOf[js.Dynamic].applyDynamic("cursorForward")(count.asInstanceOf[js.Any]).asInstanceOf[String]
    
    inline def cursorHide(): String = ^.asInstanceOf[js.Dynamic].applyDynamic("cursorHide")().asInstanceOf[String]
    
    inline def cursorLeft(): String = ^.asInstanceOf[js.Dynamic].applyDynamic("cursorLeft")().asInstanceOf[String]
    
    inline def cursorShow(): String = ^.asInstanceOf[js.Dynamic].applyDynamic("cursorShow")().asInstanceOf[String]
    
    inline def cursorUp(): String = ^.asInstanceOf[js.Dynamic].applyDynamic("cursorUp")().asInstanceOf[String]
    inline def cursorUp(count: Double): String = ^.asInstanceOf[js.Dynamic].applyDynamic("cursorUp")(count.asInstanceOf[js.Any]).asInstanceOf[String]
    
    inline def eraseDown(): String = ^.asInstanceOf[js.Dynamic].applyDynamic("eraseDown")().asInstanceOf[String]
    
    inline def eraseLine(): String = ^.asInstanceOf[js.Dynamic].applyDynamic("eraseLine")().asInstanceOf[String]
    
    inline def eraseLines(count: Double): String = ^.asInstanceOf[js.Dynamic].applyDynamic("eraseLines")(count.asInstanceOf[js.Any]).asInstanceOf[String]
    
    inline def eraseScreen(): String = ^.asInstanceOf[js.Dynamic].applyDynamic("eraseScreen")().asInstanceOf[String]
    
    inline def eraseUp(): String = ^.asInstanceOf[js.Dynamic].applyDynamic("eraseUp")().asInstanceOf[String]
  }
  
  @JSImport("@ionic/utils-terminal", "TERMINAL_INFO")
  @js.native
  val TERMINAL_INFO: TerminalInfo = js.native
  
  @JSImport("@ionic/utils-terminal", "TTY_WIDTH")
  @js.native
  val TTY_WIDTH: Double = js.native
  
  inline def columnar(rows: js.Array[js.Array[String]], hasHsepVsepHeaders: ColumnarOptions): String = (^.asInstanceOf[js.Dynamic].applyDynamic("columnar")(rows.asInstanceOf[js.Any], hasHsepVsepHeaders.asInstanceOf[js.Any])).asInstanceOf[String]
  
  inline def expandPath(p: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("expandPath")(p.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def generateFillSpaceStringList(list: js.Array[String]): js.Array[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("generateFillSpaceStringList")(list.asInstanceOf[js.Any]).asInstanceOf[js.Array[String]]
  inline def generateFillSpaceStringList(list: js.Array[String], optimalLength: Double): js.Array[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("generateFillSpaceStringList")(list.asInstanceOf[js.Any], optimalLength.asInstanceOf[js.Any])).asInstanceOf[js.Array[String]]
  inline def generateFillSpaceStringList(list: js.Array[String], optimalLength: Double, fillCharacter: String): js.Array[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("generateFillSpaceStringList")(list.asInstanceOf[js.Any], optimalLength.asInstanceOf[js.Any], fillCharacter.asInstanceOf[js.Any])).asInstanceOf[js.Array[String]]
  inline def generateFillSpaceStringList(list: js.Array[String], optimalLength: Unit, fillCharacter: String): js.Array[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("generateFillSpaceStringList")(list.asInstanceOf[js.Any], optimalLength.asInstanceOf[js.Any], fillCharacter.asInstanceOf[js.Any])).asInstanceOf[js.Array[String]]
  
  inline def indent(): String = ^.asInstanceOf[js.Dynamic].applyDynamic("indent")().asInstanceOf[String]
  inline def indent(n: Double): String = ^.asInstanceOf[js.Dynamic].applyDynamic("indent")(n.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def prettyPath(p: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("prettyPath")(p.asInstanceOf[js.Any]).asInstanceOf[String]
  
  object sliceAnsi {
    
    @JSImport("@ionic/utils-terminal", "sliceAnsi")
    @js.native
    val ^ : js.Any = js.native
    
    inline def default(input: String, beginSlice: Double): String = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(input.asInstanceOf[js.Any], beginSlice.asInstanceOf[js.Any])).asInstanceOf[String]
    inline def default(input: String, beginSlice: Double, endSlice: Double): String = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(input.asInstanceOf[js.Any], beginSlice.asInstanceOf[js.Any], endSlice.asInstanceOf[js.Any])).asInstanceOf[String]
  }
  
  object stringWidth {
    
    @JSImport("@ionic/utils-terminal", "stringWidth")
    @js.native
    val ^ : js.Any = js.native
    
    inline def default(string: String): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(string.asInstanceOf[js.Any]).asInstanceOf[Double]
    inline def default(string: String, options: Options): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(string.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Double]
  }
  
  object stripAnsi {
    
    @JSImport("@ionic/utils-terminal", "stripAnsi")
    @js.native
    val ^ : js.Any = js.native
    
    inline def default(string: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(string.asInstanceOf[js.Any]).asInstanceOf[String]
  }
  
  inline def wordWrap(msg: String, hasWidthIndentationAppend: WordWrapOptions): String = (^.asInstanceOf[js.Dynamic].applyDynamic("wordWrap")(msg.asInstanceOf[js.Any], hasWidthIndentationAppend.asInstanceOf[js.Any])).asInstanceOf[String]
}
