package typings.gulpInsert

import typings.node.NodeJS.ReadWriteStream
import typings.std.File
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  /**
    * Appends a string onto the contents
    * @param {string} content
    * @returns {NodeJS.ReadWriteStream}
    */
  @JSImport("gulp-insert", "append")
  @js.native
  def append(content: String): ReadWriteStream = js.native
  
  /**
    * Prepends a string onto the contents
    * @param {string} content
    * @returns {NodeJS.ReadWriteStream}
    */
  @JSImport("gulp-insert", "prepend")
  @js.native
  def prepend(content: String): ReadWriteStream = js.native
  
  /**
    * Calls a function with the contents of the file
    * @param {Transformer} transformer
    * @returns {NodeJS.ReadWriteStream}
    */
  @JSImport("gulp-insert", "transform")
  @js.native
  def transform(transformer: Transformer): ReadWriteStream = js.native
  
  /**
    * Wraps the contents with two strings
    * @param {string} prepend
    * @param {string} append
    * @returns {NodeJS.ReadWriteStream}
    */
  @JSImport("gulp-insert", "wrap")
  @js.native
  def wrap(prepend: String, append: String): ReadWriteStream = js.native
  
  type Transformer = js.Function2[/* contents */ String, /* file */ File, String]
}
