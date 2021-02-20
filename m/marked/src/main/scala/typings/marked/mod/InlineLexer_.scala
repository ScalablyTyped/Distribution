package typings.marked.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
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
  @JSImport("marked", "InlineLexer.escapes")
  @js.native
  def escapes(text: String): String = js.native
  
  /* static member */
  @JSImport("marked", "InlineLexer.output")
  @js.native
  def output(src: String, links: js.Array[String]): String = js.native
  @JSImport("marked", "InlineLexer.output")
  @js.native
  def output(src: String, links: js.Array[String], options: MarkedOptions): String = js.native
  
  /* static member */
  @JSImport("marked", "InlineLexer.rules")
  @js.native
  def rules: Rules = js.native
  @scala.inline
  def rules_=(x: Rules): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("rules")(x.asInstanceOf[js.Any])
}
