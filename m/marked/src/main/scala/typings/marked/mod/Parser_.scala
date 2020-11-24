package typings.marked.mod

import typings.marked.markedNumbers.`0`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("marked", "Parser")
@js.native
class Parser_ () extends js.Object {
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
/* static members */
@JSImport("marked", "Parser")
@js.native
object Parser_ extends js.Object {
  
  def parse(src: TokensList): String = js.native
  def parse(src: TokensList, options: MarkedOptions): String = js.native
}
