package typings.marked.mod

import typings.marked.markedNumbers.`0`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("marked", "Parser")
@js.native
class Parser_ () extends StObject {
  def this(options: MarkedOptions) = this()
  
  def next(): Token = js.native
  
  var options: MarkedOptions = js.native
  
  def parse(src: TokensList): String = js.native
  
  def parseText(): String = js.native
  
  def peek(): Token | `0` = js.native
  
  var renderer: Renderer = js.native
  
  var slugger: Slugger = js.native
  
  def tok(): String = js.native
  
  var token: Token | Null = js.native
  
  var tokens: TokensList = js.native
}
object Parser_ {
  
  @JSImport("marked", "Parser")
  @js.native
  val ^ : js.Any = js.native
  
  /* static member */
  inline def parse(src: TokensList): String = ^.asInstanceOf[js.Dynamic].applyDynamic("parse")(src.asInstanceOf[js.Any]).asInstanceOf[String]
  inline def parse(src: TokensList, options: MarkedOptions): String = (^.asInstanceOf[js.Dynamic].applyDynamic("parse")(src.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[String]
}
