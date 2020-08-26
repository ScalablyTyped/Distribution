package typings.mailparser.mod

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
@js.native
trait StructuredHeader extends _HeaderValue {
  /**
    * Additional arguments.
    */
  var params: StringDictionary[String] = js.native
  /**
    * The main value.
    */
  var value: String = js.native
}

object StructuredHeader {
  @scala.inline
  def apply(params: StringDictionary[String], value: String): StructuredHeader = {
    val __obj = js.Dynamic.literal(params = params.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[StructuredHeader]
  }
  @scala.inline
  implicit class StructuredHeaderOps[Self <: StructuredHeader] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setParams(value: StringDictionary[String]): Self = this.set("params", value.asInstanceOf[js.Any])
    @scala.inline
    def setValue(value: String): Self = this.set("value", value.asInstanceOf[js.Any])
  }
  
}

