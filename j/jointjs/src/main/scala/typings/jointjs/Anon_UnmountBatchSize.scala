package typings.jointjs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_UnmountBatchSize extends js.Object {
  var unmountBatchSize: js.UndefOr[Double] = js.undefined
}

object Anon_UnmountBatchSize {
  @scala.inline
  def apply(unmountBatchSize: Int | Double = null): Anon_UnmountBatchSize = {
    val __obj = js.Dynamic.literal()
    if (unmountBatchSize != null) __obj.updateDynamic("unmountBatchSize")(unmountBatchSize.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_UnmountBatchSize]
  }
}

