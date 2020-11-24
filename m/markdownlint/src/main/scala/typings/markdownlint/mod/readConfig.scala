package typings.markdownlint.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("markdownlint", "readConfig")
@js.native
object readConfig extends js.Object {
  
  /**
    * Read specified configuration file.
    *
    * @param {string} file Configuration file name.
    * @param {ConfigurationParser[] | ReadConfigCallback} parsers Parsing
    * function(s).
    * @param {ReadConfigCallback} [callback] Callback (err, result) function.
    * @returns {void}
    */
  def apply(file: String, parsers: js.Array[ConfigurationParser]): Unit = js.native
  def apply(file: String, parsers: js.Array[ConfigurationParser], callback: ReadConfigCallback): Unit = js.native
  def apply(file: String, parsers: ReadConfigCallback): Unit = js.native
  def apply(file: String, parsers: ReadConfigCallback, callback: ReadConfigCallback): Unit = js.native
}
