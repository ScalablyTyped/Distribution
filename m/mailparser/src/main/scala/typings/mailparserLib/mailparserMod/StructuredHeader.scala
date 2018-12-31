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
trait StructuredHeader extends js.Object {
  /**
  	 * Additional arguments.
  	 */
  var params: org.scalablytyped.runtime.StringDictionary[java.lang.String]
  /**
  	 * The main value.
  	 */
  var value: java.lang.String
}

