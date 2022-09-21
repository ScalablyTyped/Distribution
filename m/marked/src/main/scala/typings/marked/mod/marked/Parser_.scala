package typings.marked.mod.marked

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("marked", "marked.Parser")
@js.native
open class Parser_ () extends StObject {
  def this(options: MarkedOptions) = this()
  
  def next(): Token = js.native
  
  var options: MarkedOptions = js.native
  
  def parse(src: js.Array[Token]): String = js.native
  def parse(src: TokensList): String = js.native
  
  def parseInline(src: js.Array[Token]): String = js.native
  def parseInline(src: js.Array[Token], renderer: Renderer[scala.Nothing]): String = js.native
  
  var renderer: Renderer[scala.Nothing] = js.native
  
  var slugger: Slugger = js.native
  
  var textRenderer: TextRenderer = js.native
  
  var token: Token | Null = js.native
  
  var tokens: js.Array[Token] | TokensList = js.native
}
object Parser_ {
  
  @JSImport("marked", "marked.Parser")
  @js.native
  val ^ : js.Any = js.native
  
  /* static member */
  inline def parse(src: js.Array[Token]): String = ^.asInstanceOf[js.Dynamic].applyDynamic("parse")(src.asInstanceOf[js.Any]).asInstanceOf[String]
  inline def parse(src: js.Array[Token], options: MarkedOptions): String = (^.asInstanceOf[js.Dynamic].applyDynamic("parse")(src.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def parse(src: TokensList): String = ^.asInstanceOf[js.Dynamic].applyDynamic("parse")(src.asInstanceOf[js.Any]).asInstanceOf[String]
  inline def parse(src: TokensList, options: MarkedOptions): String = (^.asInstanceOf[js.Dynamic].applyDynamic("parse")(src.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[String]
  
  /* static member */
  inline def parseInline(src: js.Array[Token]): String = ^.asInstanceOf[js.Dynamic].applyDynamic("parseInline")(src.asInstanceOf[js.Any]).asInstanceOf[String]
  inline def parseInline(src: js.Array[Token], options: MarkedOptions): String = (^.asInstanceOf[js.Dynamic].applyDynamic("parseInline")(src.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[String]
}
