package typings.iobroker.iobrokerMod._Global_.ioBroker

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Parameters for @link{Objects.getObjectView} */
trait GetObjectViewParams extends js.Object {
  /** Last id to include in the return list */
  var endkey: String
  /** First id to include in the return list */
  var startkey: String
}

object GetObjectViewParams {
  @scala.inline
  def apply(endkey: String, startkey: String): GetObjectViewParams = {
    val __obj = js.Dynamic.literal(endkey = endkey.asInstanceOf[js.Any], startkey = startkey.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[GetObjectViewParams]
  }
}

