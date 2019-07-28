package typings.mailparser.mailparserMod

import org.scalablytyped.runtime.StringDictionary
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
  var params: StringDictionary[String]
  /**
  	 * The main value.
  	 */
  var value: String
}

object StructuredHeader {
  @scala.inline
  def apply(params: StringDictionary[String], value: String): StructuredHeader = {
    val __obj = js.Dynamic.literal(params = params, value = value)
  
    __obj.asInstanceOf[StructuredHeader]
  }
}

