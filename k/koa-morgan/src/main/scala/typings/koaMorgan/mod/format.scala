package typings.koaMorgan.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("koa-morgan", "format")
@js.native
object format extends js.Object {
  
  /**
    * Define a named custom format by specifying a format string in token notation
    */
  def apply(name: String, fmt: String): KoaMorgan = js.native
  /**
    * Define a named custom format by specifying a format function
    */
  def apply(name: String, fmt: FormatFn): KoaMorgan = js.native
}
