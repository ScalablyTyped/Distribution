package typings.marked.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("marked", "InlineLexer")
@js.native
class InlineLexer_ protected () extends StObject {
  def this(links: js.Array[String]) = this()
  def this(links: js.Array[String], options: MarkedOptions) = this()
  
  var links: js.Array[String] = js.native
  
  def mangle(text: String): String = js.native
  
  var options: MarkedOptions = js.native
  
  def output(src: String): String = js.native
  
  def outputLink(cap: js.Array[String], link: String): String = js.native
  
  var renderer: Renderer = js.native
  
  var rules: Rules = js.native
  
  def smartypants(text: String): String = js.native
}
object InlineLexer_ {
  
  @JSImport("marked", "InlineLexer")
  @js.native
  val ^ : js.Any = js.native
  
  /* static member */
  inline def escapes(text: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("escapes")(text.asInstanceOf[js.Any]).asInstanceOf[String]
  
  /* static member */
  inline def output(src: String, links: js.Array[String]): String = (^.asInstanceOf[js.Dynamic].applyDynamic("output")(src.asInstanceOf[js.Any], links.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def output(src: String, links: js.Array[String], options: MarkedOptions): String = (^.asInstanceOf[js.Dynamic].applyDynamic("output")(src.asInstanceOf[js.Any], links.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[String]
  
  /* static member */
  @JSImport("marked", "InlineLexer.rules")
  @js.native
  def rules: Rules = js.native
  inline def rules_=(x: Rules): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("rules")(x.asInstanceOf[js.Any])
}
