package typings.graphqlTools

import typings.graphqlTools.interfacesMod.MergeInfo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonMergeInfo extends js.Object {
  var mergeInfo: MergeInfo
}

object AnonMergeInfo {
  @scala.inline
  def apply(mergeInfo: MergeInfo): AnonMergeInfo = {
    val __obj = js.Dynamic.literal(mergeInfo = mergeInfo.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonMergeInfo]
  }
}

