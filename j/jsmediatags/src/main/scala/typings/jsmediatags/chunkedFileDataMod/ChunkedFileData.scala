package typings.jsmediatags.chunkedFileDataMod

import typings.jsmediatags.AnonEndIx
import typings.jsmediatags.typesMod.DataType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ChunkedFileData extends js.Object {
  def _concatData(dataA: DataType, dataB: DataType): DataType
  def _getChunkRange(offsetStart: Double, offsetEnd: Double): AnonEndIx
  def _sliceData(data: DataType, begin: Double, end: Double): DataType
  def addData(offset: Double, data: DataType): Unit
  def getByteAt(offset: Double): js.Any
  def hasDataRange(offsetStart: Double, offsetEnd: Double): Boolean
}

object ChunkedFileData {
  @scala.inline
  def apply(
    _concatData: (DataType, DataType) => DataType,
    _getChunkRange: (Double, Double) => AnonEndIx,
    _sliceData: (DataType, Double, Double) => DataType,
    addData: (Double, DataType) => Unit,
    getByteAt: Double => js.Any,
    hasDataRange: (Double, Double) => Boolean
  ): ChunkedFileData = {
    val __obj = js.Dynamic.literal(_concatData = js.Any.fromFunction2(_concatData), _getChunkRange = js.Any.fromFunction2(_getChunkRange), _sliceData = js.Any.fromFunction3(_sliceData), addData = js.Any.fromFunction2(addData), getByteAt = js.Any.fromFunction1(getByteAt), hasDataRange = js.Any.fromFunction2(hasDataRange))
    __obj.asInstanceOf[ChunkedFileData]
  }
}

