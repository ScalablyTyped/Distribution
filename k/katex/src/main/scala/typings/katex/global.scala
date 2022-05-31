package typings.katex

import typings.katex.mod.KatexOptions
import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object global {
  
  object katex {
    
    @JSGlobal("katex")
    @js.native
    val ^ : js.Any = js.native
    
    @JSGlobal("katex.ParseError")
    @js.native
    class ParseError protected ()
      extends typings.katex.mod.ParseError {
      def this(message: String, lexer: js.Any, position: Double) = this()
    }
    
    inline def render(tex: String, element: HTMLElement): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("render")(tex.asInstanceOf[js.Any], element.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def render(tex: String, element: HTMLElement, options: KatexOptions): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("render")(tex.asInstanceOf[js.Any], element.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    inline def renderToString(tex: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("renderToString")(tex.asInstanceOf[js.Any]).asInstanceOf[String]
    inline def renderToString(tex: String, options: KatexOptions): String = (^.asInstanceOf[js.Dynamic].applyDynamic("renderToString")(tex.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[String]
  }
}
