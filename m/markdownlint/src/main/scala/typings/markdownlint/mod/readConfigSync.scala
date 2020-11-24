package typings.markdownlint.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("markdownlint", "readConfigSync")
@js.native
object readConfigSync extends js.Object {
  
  /**
    * Read specified configuration file synchronously.
    *
    * @param {string} file Configuration file name.
    * @param {ConfigurationParser[]} [parsers] Parsing function(s).
    * @returns {Configuration} Configuration object.
    */
  def apply(file: String): Configuration = js.native
  def apply(file: String, parsers: js.Array[ConfigurationParser]): Configuration = js.native
}
