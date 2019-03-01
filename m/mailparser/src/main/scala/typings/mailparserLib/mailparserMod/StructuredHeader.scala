package typings
package mailparserLib.mailparserMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Structured object for headers with arguments.
  *
  * `content-type: text/plain; CHARSET="UTF-8"` =>
  * ```
  * {
  *     "value": "text/plain",
  *     "params": {
  *         "charset": "UTF-8"
  *     }
  * }
  * ```
  */
trait StructuredHeader extends _HeaderValue {
  /**
  	 * Additional arguments.
  	 */
  var params: org.scalablytyped.runtime.StringDictionary[java.lang.String]
  /**
  	 * The main value.
  	 */
  var value: java.lang.String
}

object StructuredHeader {
  @scala.inline
  def apply(params: org.scalablytyped.runtime.StringDictionary[java.lang.String], value: java.lang.String): StructuredHeader = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("params")(params)
    __obj.updateDynamic("value")(value)
    __obj.asInstanceOf[StructuredHeader]
  }
}

