package typings
package htmlDashToDashTextLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait HtmlToTextStatic extends js.Object {
  /**
       * Convert html content of file to text with the default options.
       *
       * @param file String with the path of the html file to convert
       * @param callback Function with signature function(err, result) called when the conversion is completed
       *
       */
  def fromFile(file: java.lang.String, callback: js.Function): scala.Unit = js.native
  /**
       * Convert html content of file to text
       *
       * @param file String with the path of the html file to convert
       * @param options Hash of options
       * @param callback Function with signature function(err, result) called when the conversion is completed
       *
       */
  def fromFile(file: java.lang.String, options: HtmlToTextOptions, callback: js.Function): scala.Unit = js.native
  /**
       * Convert html string to text
       *
       * @param file String with the path of the html file to convert
       * @param options Hash of options
       *
       * @return String with the converted text.
       */
  def fromString(str: java.lang.String): java.lang.String = js.native
  /**
       * Convert html string to text
       *
       * @param file String with the path of the html file to convert
       * @param options Hash of options
       *
       * @return String with the converted text.
       */
  def fromString(str: java.lang.String, options: HtmlToTextOptions): java.lang.String = js.native
}

