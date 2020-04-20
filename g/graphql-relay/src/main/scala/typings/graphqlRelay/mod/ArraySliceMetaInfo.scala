package typings.graphqlRelay.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ArraySliceMetaInfo extends js.Object {
  var arrayLength: Double
  var sliceStart: Double
}

object ArraySliceMetaInfo {
  @scala.inline
  def apply(arrayLength: Double, sliceStart: Double): ArraySliceMetaInfo = {
    val __obj = js.Dynamic.literal(arrayLength = arrayLength.asInstanceOf[js.Any], sliceStart = sliceStart.asInstanceOf[js.Any])
    __obj.asInstanceOf[ArraySliceMetaInfo]
  }
}

