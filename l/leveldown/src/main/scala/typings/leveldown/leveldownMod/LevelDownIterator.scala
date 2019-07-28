package typings.leveldown.leveldownMod

import typings.abstractDashLeveldown.abstractDashLeveldownMod.AbstractIterator
import typings.abstractDashLeveldown.abstractDashLeveldownMod.AbstractLevelDOWN
import typings.abstractDashLeveldown.abstractDashLeveldownMod.ErrorCallback
import typings.abstractDashLeveldown.abstractDashLeveldownMod.ErrorKeyValueCallback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LevelDownIterator extends AbstractIterator[Bytes, Bytes] {
  var binding: js.Any
  var cache: js.Any
  var fastFuture: js.Any
  var finished: js.Any
  def seek(key: Bytes): Unit
}

object LevelDownIterator {
  @scala.inline
  def apply(
    binding: js.Any,
    cache: js.Any,
    db: AbstractLevelDOWN[Bytes, Bytes],
    end: ErrorCallback => Unit,
    fastFuture: js.Any,
    finished: js.Any,
    next: ErrorKeyValueCallback[Bytes, Bytes] => LevelDownIterator,
    seek: Bytes => Unit
  ): LevelDownIterator = {
    val __obj = js.Dynamic.literal(binding = binding, cache = cache, db = db, end = js.Any.fromFunction1(end), fastFuture = fastFuture, finished = finished, next = js.Any.fromFunction1(next), seek = js.Any.fromFunction1(seek))
  
    __obj.asInstanceOf[LevelDownIterator]
  }
}

