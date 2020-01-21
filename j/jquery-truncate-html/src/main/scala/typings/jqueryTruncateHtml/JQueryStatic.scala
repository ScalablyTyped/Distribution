package typings.jqueryTruncateHtml

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait JQueryStatic extends js.Object {
  def truncate(html: String, options: TruncateOptions): String
}

object JQueryStatic {
  @scala.inline
  def apply(truncate: (String, TruncateOptions) => String): JQueryStatic = {
    val __obj = js.Dynamic.literal(truncate = js.Any.fromFunction2(truncate))
  
    __obj.asInstanceOf[JQueryStatic]
  }
}

