package typings.iobroker.iobrokerMod._Global_.ioBroker

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Parameters for @link{Objects.getObjectList} */
trait GetObjectListParams extends GetObjectViewParams {
  /** Whether docs should be included in the return list */ // TODO: What are docs?
  var include_docs: Boolean
}

object GetObjectListParams {
  @scala.inline
  def apply(endkey: String, include_docs: Boolean, startkey: String): GetObjectListParams = {
    val __obj = js.Dynamic.literal(endkey = endkey, include_docs = include_docs, startkey = startkey)
  
    __obj.asInstanceOf[GetObjectListParams]
  }
}

