package typings
package indentDashStringLib.indentDashStringMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

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
  def apply(string: java.lang.String): java.lang.String = js.native
  def apply(string: java.lang.String, count: scala.Double): java.lang.String = js.native
  def apply(string: java.lang.String, count: scala.Double, options: Options): java.lang.String = js.native
}

