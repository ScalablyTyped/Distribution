package typings.lokijs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PageIterator extends js.Object {
  var collection: Double
  var docIndex: Double
  var pageIndex: Double
}

object PageIterator {
  @scala.inline
  def apply(collection: Double, docIndex: Double, pageIndex: Double): PageIterator = {
    val __obj = js.Dynamic.literal(collection = collection.asInstanceOf[js.Any], docIndex = docIndex.asInstanceOf[js.Any], pageIndex = pageIndex.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[PageIterator]
  }
}

