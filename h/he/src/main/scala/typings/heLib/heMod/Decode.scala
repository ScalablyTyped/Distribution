package typings
package heLib.heMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Decode extends js.Object {
  var options: DecodeOptions = js.native
  /**
       * Decode a string of HTML text
       *
       * This function takes a string of HTML and decodes any named and numerical
       * character references in it using the algorithm described in section
       * 12.2.4.69 of the HTML spec.
       */
  def apply(html: java.lang.String): java.lang.String = js.native
  /**
       * Decode a string of HTML text
       *
       * This function takes a string of HTML and decodes any named and numerical
       * character references in it using the algorithm described in section
       * 12.2.4.69 of the HTML spec.
       */
  def apply(html: java.lang.String, options: DecodeOptions): java.lang.String = js.native
}

