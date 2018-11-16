package typings
package leveldownLib.leveldownMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait LevelDownIterator
  extends abstractDashLeveldownLib.abstractDashLeveldownMod.AbstractIterator[Bytes, Bytes] {
  var binding: js.Any
  var cache: js.Any
  var fastFuture: js.Any
  var finished: js.Any
  def seek(key: Bytes): scala.Unit
}

