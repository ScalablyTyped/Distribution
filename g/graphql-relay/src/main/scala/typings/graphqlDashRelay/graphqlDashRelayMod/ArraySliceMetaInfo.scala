package typings.graphqlDashRelay.graphqlDashRelayMod

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
    val __obj = js.Dynamic.literal(arrayLength = arrayLength, sliceStart = sliceStart)
  
    __obj.asInstanceOf[ArraySliceMetaInfo]
  }
}

