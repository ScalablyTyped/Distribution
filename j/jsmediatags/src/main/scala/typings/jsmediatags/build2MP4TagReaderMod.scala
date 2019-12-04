package typings.jsmediatags

import typings.jsmediatags.build2MP4TagReaderMod.MP4TagReader
import typings.jsmediatags.typesMod.ByteRange
import typings.jsmediatags.typesMod.LoadCallbackType
import typings.jsmediatags.typesMod.TagFrame
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("jsmediatags/build2/MP4TagReader", JSImport.Namespace)
@js.native
object build2MP4TagReaderMod extends js.Object {
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
  
  @js.native
  class default () extends MP4TagReader
  
  /* static members */
  @js.native
  object default extends js.Object {
    def canReadTagFormat(tagIdentifier: js.Array[Double]): Boolean = js.native
    def getTagIdentifierByteRange(): ByteRange = js.native
  }
  
}

