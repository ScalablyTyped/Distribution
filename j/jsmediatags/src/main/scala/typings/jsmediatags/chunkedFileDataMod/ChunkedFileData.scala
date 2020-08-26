package typings.jsmediatags.chunkedFileDataMod

import typings.jsmediatags.anon.EndIx
import typings.jsmediatags.typesMod.DataType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ChunkedFileData extends js.Object {
  def _concatData(dataA: DataType, dataB: DataType): DataType = js.native
  def _getChunkRange(offsetStart: Double, offsetEnd: Double): EndIx = js.native
  def _sliceData(data: DataType, begin: Double, end: Double): DataType = js.native
  def addData(offset: Double, data: DataType): Unit = js.native
  def getByteAt(offset: Double): js.Any = js.native
  def hasDataRange(offsetStart: Double, offsetEnd: Double): Boolean = js.native
}

object ChunkedFileData {
  @scala.inline
  def apply(
    _concatData: (DataType, DataType) => DataType,
    _getChunkRange: (Double, Double) => EndIx,
    _sliceData: (DataType, Double, Double) => DataType,
    addData: (Double, DataType) => Unit,
    getByteAt: Double => js.Any,
    hasDataRange: (Double, Double) => Boolean
  ): ChunkedFileData = {
    val __obj = js.Dynamic.literal(_concatData = js.Any.fromFunction2(_concatData), _getChunkRange = js.Any.fromFunction2(_getChunkRange), _sliceData = js.Any.fromFunction3(_sliceData), addData = js.Any.fromFunction2(addData), getByteAt = js.Any.fromFunction1(getByteAt), hasDataRange = js.Any.fromFunction2(hasDataRange))
    __obj.asInstanceOf[ChunkedFileData]
  }
  @scala.inline
  implicit class ChunkedFileDataOps[Self <: ChunkedFileData] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def set_concatData(value: (DataType, DataType) => DataType): Self = this.set("_concatData", js.Any.fromFunction2(value))
    @scala.inline
    def set_getChunkRange(value: (Double, Double) => EndIx): Self = this.set("_getChunkRange", js.Any.fromFunction2(value))
    @scala.inline
    def set_sliceData(value: (DataType, Double, Double) => DataType): Self = this.set("_sliceData", js.Any.fromFunction3(value))
    @scala.inline
    def setAddData(value: (Double, DataType) => Unit): Self = this.set("addData", js.Any.fromFunction2(value))
    @scala.inline
    def setGetByteAt(value: Double => js.Any): Self = this.set("getByteAt", js.Any.fromFunction1(value))
    @scala.inline
    def setHasDataRange(value: (Double, Double) => Boolean): Self = this.set("hasDataRange", js.Any.fromFunction2(value))
  }
  
}

