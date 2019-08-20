package typings.jsmediatags.build2MediaTagReaderMod

import typings.jsmediatags.typesMod.ByteRange
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("jsmediatags/build2/MediaTagReader", JSImport.Default)
@js.native
class default protected () extends MediaTagReader {
  def this(mediaFileReader: typings.jsmediatags.build2MediaFileReaderMod.default) = this()
}

/* static members */
@JSImport("jsmediatags/build2/MediaTagReader", JSImport.Default)
@js.native
object default extends js.Object {
  def canReadTagFormat(tagIdentifier: js.Array[Double]): Boolean = js.native
  def getTagIdentifierByteRange(): ByteRange = js.native
}

