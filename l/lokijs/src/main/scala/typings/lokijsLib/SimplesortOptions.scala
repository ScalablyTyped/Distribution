package typings
package lokijsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SimplesortOptions extends js.Object {
  var desc: scala.Boolean
  var disableIndexIntersect: scala.Boolean
  var forceIndexIntersect: scala.Boolean
  var useJavascriptSorting: scala.Boolean
}

object SimplesortOptions {
  @scala.inline
  def apply(
    desc: scala.Boolean,
    disableIndexIntersect: scala.Boolean,
    forceIndexIntersect: scala.Boolean,
    useJavascriptSorting: scala.Boolean
  ): SimplesortOptions = {
    val __obj = js.Dynamic.literal(desc = desc, disableIndexIntersect = disableIndexIntersect, forceIndexIntersect = forceIndexIntersect, useJavascriptSorting = useJavascriptSorting)
  
    __obj.asInstanceOf[SimplesortOptions]
  }
}

