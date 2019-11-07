package typings.leveldown.leveldownMod

import typings.abstractDashLeveldown.abstractDashLeveldownMod.AbstractBatch
import typings.abstractDashLeveldown.abstractDashLeveldownMod.AbstractChainedBatch
import typings.abstractDashLeveldown.abstractDashLeveldownMod.AbstractLevelDOWN
import typings.abstractDashLeveldown.abstractDashLeveldownMod.ErrorCallback
import typings.abstractDashLeveldown.abstractDashLeveldownMod.ErrorValueCallback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LevelDown extends AbstractLevelDOWN[Bytes, Bytes] {
  def approximateSize(start: Bytes, end: Bytes, cb: ErrorSizeCallback): Unit = js.native
  def batch(array: js.Array[AbstractBatch[_, _]], options: LevelDownBatchOptions, cb: ErrorCallback): AbstractChainedBatch[Bytes, Bytes] = js.native
  def clear(cb: ErrorCallback): Unit = js.native
  def clear(options: LevelDownClearOptions, cb: ErrorCallback): Unit = js.native
  def compactRange(start: Bytes, end: Bytes, cb: ErrorCallback): Unit = js.native
  def del(key: Bytes, options: LevelDownDelOptions, cb: ErrorCallback): Unit = js.native
  def get(key: Bytes, options: LevelDownGetOptions, cb: ErrorValueCallback[Bytes]): Unit = js.native
  def getProperty(property: String): String = js.native
  def iterator(options: LevelDownIteratorOptions): LevelDownIterator = js.native
  def open(options: LevelDownOpenOptions, cb: ErrorCallback): Unit = js.native
  def put(key: Bytes, value: Bytes, options: LevelDownPutOptions, cb: ErrorCallback): Unit = js.native
}

