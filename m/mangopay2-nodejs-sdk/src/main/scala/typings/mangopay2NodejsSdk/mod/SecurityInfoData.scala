package typings.mangopay2NodejsSdk.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SecurityInfoData extends js.Object {
  var AVSResult: typings.mangopay2NodejsSdk.mod.AVSResult
}

object SecurityInfoData {
  @scala.inline
  def apply(AVSResult: AVSResult): SecurityInfoData = {
    val __obj = js.Dynamic.literal(AVSResult = AVSResult.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[SecurityInfoData]
  }
}

