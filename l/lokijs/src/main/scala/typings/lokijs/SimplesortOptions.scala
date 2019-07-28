package typings.lokijs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SimplesortOptions extends js.Object {
  var desc: Boolean
  var disableIndexIntersect: Boolean
  var forceIndexIntersect: Boolean
  var useJavascriptSorting: Boolean
}

object SimplesortOptions {
  @scala.inline
  def apply(
    desc: Boolean,
    disableIndexIntersect: Boolean,
    forceIndexIntersect: Boolean,
    useJavascriptSorting: Boolean
  ): SimplesortOptions = {
    val __obj = js.Dynamic.literal(desc = desc, disableIndexIntersect = disableIndexIntersect, forceIndexIntersect = forceIndexIntersect, useJavascriptSorting = useJavascriptSorting)
  
    __obj.asInstanceOf[SimplesortOptions]
  }
}

