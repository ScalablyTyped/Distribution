package typings.jsmediatags.jsmediatagsMod

import typings.jsmediatags.TypeofClassMediaFileReader
import typings.jsmediatags.TypeofClassMediaTagReader
import typings.jsmediatags.build2MediaFileReaderMod.default
import typings.jsmediatags.typesMod.CallbackType
import typings.jsmediatags.typesMod.LoadCallbackType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("jsmediatags", "Reader")
@js.native
class Reader protected () extends js.Object {
  def this(file: js.Any) = this()
  var _file: js.Any = js.native
  var _fileReader: TypeofClassMediaFileReader = js.native
  var _tagReader: TypeofClassMediaTagReader = js.native
  var _tagsToRead: js.Array[String] = js.native
  def _findFileReader(): TypeofClassMediaFileReader = js.native
  def _findTagReader(fileReader: default, callbacks: CallbackType): Unit = js.native
  def _getFileReader(): TypeofClassMediaFileReader = js.native
  def _getTagReader(fileReader: default, callbacks: CallbackType): Unit = js.native
  def _loadTagIdentifierRanges(fileReader: default, tagReaders: js.Array[TypeofClassMediaTagReader], callbacks: LoadCallbackType): Unit = js.native
  def read(callbacks: CallbackType): Unit = js.native
  def setFileReader(fileReader: TypeofClassMediaFileReader): Reader = js.native
  def setTagReader(tagReader: TypeofClassMediaTagReader): Reader = js.native
  def setTagsToRead(tagsToRead: js.Array[String]): Reader = js.native
}

