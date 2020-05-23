package typings.jsmediatags.chunkedFileDataMod

import typings.jsmediatags.anon.EndIx
import typings.jsmediatags.typesMod.DataType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("jsmediatags/build2/ChunkedFileData", JSImport.Default)
@js.native
class default () extends ChunkedFileData {
  /* CompleteClass */
  override def _concatData(dataA: DataType, dataB: DataType): DataType = js.native
  /* CompleteClass */
  override def _getChunkRange(offsetStart: Double, offsetEnd: Double): EndIx = js.native
  /* CompleteClass */
  override def _sliceData(data: DataType, begin: Double, end: Double): DataType = js.native
  /* CompleteClass */
  override def addData(offset: Double, data: DataType): Unit = js.native
  /* CompleteClass */
  override def getByteAt(offset: Double): js.Any = js.native
  /* CompleteClass */
  override def hasDataRange(offsetStart: Double, offsetEnd: Double): Boolean = js.native
}

/* static members */
@JSImport("jsmediatags/build2/ChunkedFileData", JSImport.Default)
@js.native
object default extends js.Object {
  var NOT_FOUND: Double = js.native
}

