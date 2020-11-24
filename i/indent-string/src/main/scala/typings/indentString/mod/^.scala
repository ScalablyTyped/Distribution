package typings.indentString.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("indent-string", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  
  /**
  Indent each line in a string.
  @param string - The string to indent.
  @param count - How many times you want `options.indent` repeated. Default: `1`.
  @example
  ```
  import indentString = require('indent-string');
  indentString('Unicorns\nRainbows', 4);
  //=> '    Unicorns\n    Rainbows'
  indentString('Unicorns\nRainbows', 4, {indent: '♥'});
  //=> '♥♥♥♥Unicorns\n♥♥♥♥Rainbows'
  ```
  */
  def apply(string: String): String = js.native
  def apply(string: String, count: js.UndefOr[scala.Nothing], options: Options): String = js.native
  def apply(string: String, count: Double): String = js.native
  def apply(string: String, count: Double, options: Options): String = js.native
}
