package typings
package graphqlDashRelayLib.graphqlDashRelayMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ArraySliceMetaInfo extends js.Object {
  var arrayLength: scala.Double
  var sliceStart: scala.Double
}

object ArraySliceMetaInfo {
  @scala.inline
  def apply(arrayLength: scala.Double, sliceStart: scala.Double): ArraySliceMetaInfo = {
    val __obj = js.Dynamic.literal(arrayLength = arrayLength, sliceStart = sliceStart)
  
    __obj.asInstanceOf[ArraySliceMetaInfo]
  }
}

