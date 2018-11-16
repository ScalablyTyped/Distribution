package typings
package leveldownLib.leveldownMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LevelDown
  extends abstractDashLeveldownLib.abstractDashLeveldownMod.AbstractLevelDOWN[Bytes, Bytes] {
  def approximateSize(start: Bytes, end: Bytes, cb: ErrorSizeCallback): scala.Unit = js.native
  def batch(
    array: js.Array[abstractDashLeveldownLib.abstractDashLeveldownMod.AbstractBatch[_, _]],
    options: LevelDownBatchOptions,
    cb: abstractDashLeveldownLib.abstractDashLeveldownMod.ErrorCallback
  ): abstractDashLeveldownLib.abstractDashLeveldownMod.AbstractChainedBatch[Bytes, Bytes] = js.native
  def compactRange(start: Bytes, end: Bytes, cb: abstractDashLeveldownLib.abstractDashLeveldownMod.ErrorCallback): scala.Unit = js.native
  def del(
    key: Bytes,
    options: LevelDownDelOptions,
    cb: abstractDashLeveldownLib.abstractDashLeveldownMod.ErrorCallback
  ): scala.Unit = js.native
  def destroy(location: java.lang.String, cb: abstractDashLeveldownLib.abstractDashLeveldownMod.ErrorCallback): scala.Unit = js.native
  def get(
    key: Bytes,
    options: LevelDownGetOptions,
    cb: abstractDashLeveldownLib.abstractDashLeveldownMod.ErrorValueCallback[Bytes]
  ): scala.Unit = js.native
  def getProperty(property: java.lang.String): java.lang.String = js.native
  def iterator(options: LevelDownIteratorOptions): LevelDownIterator = js.native
  def open(options: LevelDownOpenOptions, cb: abstractDashLeveldownLib.abstractDashLeveldownMod.ErrorCallback): scala.Unit = js.native
  def put(
    key: Bytes,
    value: Bytes,
    options: LevelDownPutOptions,
    cb: abstractDashLeveldownLib.abstractDashLeveldownMod.ErrorCallback
  ): scala.Unit = js.native
  def repair(location: java.lang.String, cb: abstractDashLeveldownLib.abstractDashLeveldownMod.ErrorCallback): scala.Unit = js.native
}

