package typings.jsmediatags

import org.scalablytyped.runtime.StringDictionary
import typings.jsmediatags.build2MediaTagReaderMod.MediaTagReader
import typings.jsmediatags.typesMod.ByteRange
import typings.jsmediatags.typesMod.CallbackType
import typings.jsmediatags.typesMod.LoadCallbackType
import typings.jsmediatags.typesMod.TagType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("jsmediatags/build2/MediaTagReader", JSImport.Namespace)
@js.native
object build2MediaTagReaderMod extends js.Object {
  @js.native
  trait MediaTagReader extends js.Object {
    var _mediaFileReader: typings.jsmediatags.build2MediaFileReaderMod.default = js.native
    var _tags: js.UndefOr[js.Array[String]] = js.native
    def _expandShortcutTags(): js.Array[String] | Null = js.native
    def _expandShortcutTags(tagsWithShortcuts: js.Array[String]): js.Array[String] | Null = js.native
    def _loadData(mediaFileReader: typings.jsmediatags.build2MediaFileReaderMod.default, callbacks: LoadCallbackType): Unit = js.native
    def _parseData(mediaFileReader: typings.jsmediatags.build2MediaFileReaderMod.default): TagType = js.native
    def _parseData(mediaFileReader: typings.jsmediatags.build2MediaFileReaderMod.default, tags: js.Array[String]): TagType = js.native
    def getShortcuts(): StringDictionary[String | js.Array[String]] = js.native
    def read(callbacks: CallbackType): Unit = js.native
    def setTagsToRead(tags: js.Array[String]): MediaTagReader = js.native
  }
  
  @js.native
  class default protected () extends MediaTagReader {
    def this(mediaFileReader: typings.jsmediatags.build2MediaFileReaderMod.default) = this()
  }
  
  /* static members */
  @js.native
  object default extends js.Object {
    def canReadTagFormat(tagIdentifier: js.Array[Double]): Boolean = js.native
    def getTagIdentifierByteRange(): ByteRange = js.native
  }
  
}

