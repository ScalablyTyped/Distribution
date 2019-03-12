package typings
package jqueryDashTruncateDashHtmlLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait JQueryStatic extends js.Object {
  def truncate(html: java.lang.String, options: TruncateOptions): java.lang.String
}

object JQueryStatic {
  @scala.inline
  def apply(truncate: (java.lang.String, TruncateOptions) => java.lang.String): JQueryStatic = {
    val __obj = js.Dynamic.literal(truncate = js.Any.fromFunction2(truncate))
  
    __obj.asInstanceOf[JQueryStatic]
  }
}

