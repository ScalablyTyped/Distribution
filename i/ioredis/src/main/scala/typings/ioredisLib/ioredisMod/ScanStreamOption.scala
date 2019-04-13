package typings
package ioredisLib.ioredisMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ScanStreamOption extends js.Object {
  var count: js.UndefOr[scala.Double] = js.undefined
  var `match`: js.UndefOr[java.lang.String] = js.undefined
}

object ScanStreamOption {
  @scala.inline
  def apply(count: scala.Int | scala.Double = null, `match`: java.lang.String = null): ScanStreamOption = {
    val __obj = js.Dynamic.literal()
    if (count != null) __obj.updateDynamic("count")(count.asInstanceOf[js.Any])
    if (`match` != null) __obj.updateDynamic("match")(`match`)
    __obj.asInstanceOf[ScanStreamOption]
  }
}

