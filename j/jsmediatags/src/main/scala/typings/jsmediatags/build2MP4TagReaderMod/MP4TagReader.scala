package typings.jsmediatags.build2MP4TagReaderMod

import typings.jsmediatags.typesMod.LoadCallbackType
import typings.jsmediatags.typesMod.TagFrame
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MP4TagReader
  extends typings.jsmediatags.build2MediaTagReaderMod.default {
  def _canReadAtom(atomName: String): Boolean = js.native
  def _isContainerAtom(atomName: String): Boolean = js.native
  def _loadAtom(
    mediaFileReader: typings.jsmediatags.build2MediaFileReaderMod.default,
    offset: Double,
    parentAtomFullName: String,
    callbacks: LoadCallbackType
  ): Unit = js.native
  def _readAtom(
    tags: js.Any,
    data: typings.jsmediatags.build2MediaFileReaderMod.default,
    offset: Double,
    length: Double
  ): Unit = js.native
  def _readAtom(
    tags: js.Any,
    data: typings.jsmediatags.build2MediaFileReaderMod.default,
    offset: Double,
    length: Double,
    tagsToRead: js.Array[String]
  ): Unit = js.native
  def _readAtom(
    tags: js.Any,
    data: typings.jsmediatags.build2MediaFileReaderMod.default,
    offset: Double,
    length: Double,
    tagsToRead: js.Array[String],
    parentAtomFullName: String
  ): Unit = js.native
  def _readAtom(
    tags: js.Any,
    data: typings.jsmediatags.build2MediaFileReaderMod.default,
    offset: Double,
    length: Double,
    tagsToRead: js.Array[String],
    parentAtomFullName: String,
    indent: String
  ): Unit = js.native
  def _readMetadataAtom(data: typings.jsmediatags.build2MediaFileReaderMod.default, offset: Double): TagFrame = js.native
}

