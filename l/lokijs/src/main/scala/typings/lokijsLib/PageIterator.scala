package typings
package lokijsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PageIterator extends js.Object {
  var collection: scala.Double
  var docIndex: scala.Double
  var pageIndex: scala.Double
}

object PageIterator {
  @scala.inline
  def apply(collection: scala.Double, docIndex: scala.Double, pageIndex: scala.Double): PageIterator = {
    val __obj = js.Dynamic.literal(collection = collection, docIndex = docIndex, pageIndex = pageIndex)
  
    __obj.asInstanceOf[PageIterator]
  }
}

