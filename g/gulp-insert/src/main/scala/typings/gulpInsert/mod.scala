package typings.gulpInsert

import typings.std.File
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("gulp-insert", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Appends a string onto the contents
    * @param {string} content
    * @returns {NodeJS.ReadWriteStream}
    */
  inline def append(content: String): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("append")(content.asInstanceOf[js.Any]).asInstanceOf[Any]
  
  /**
    * Prepends a string onto the contents
    * @param {string} content
    * @returns {NodeJS.ReadWriteStream}
    */
  inline def prepend(content: String): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("prepend")(content.asInstanceOf[js.Any]).asInstanceOf[Any]
  
  /**
    * Calls a function with the contents of the file
    * @param {Transformer} transformer
    * @returns {NodeJS.ReadWriteStream}
    */
  inline def transform(transformer: Transformer): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("transform")(transformer.asInstanceOf[js.Any]).asInstanceOf[Any]
  
  /**
    * Wraps the contents with two strings
    * @param {string} prepend
    * @param {string} append
    * @returns {NodeJS.ReadWriteStream}
    */
  inline def wrap(prepend: String, append: String): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("wrap")(prepend.asInstanceOf[js.Any], append.asInstanceOf[js.Any])).asInstanceOf[Any]
  
  type Transformer = js.Function2[/* contents */ String, /* file */ File, String]
}
