package typings.jsmediatags

import typings.jsmediatags.typesMod.FrameReaderSignature
import typings.jsmediatags.typesMod.TagFrameFlags
import typings.jsmediatags.typesMod.TagFrameHeader
import typings.jsmediatags.typesMod.TagFrames
import typings.jsmediatags.typesMod.TagHeader
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("jsmediatags/build2/ID3v2FrameReader", JSImport.Namespace)
@js.native
object id3v2framereaderMod extends js.Object {
  // tslint:disable-next-line:interface-name
  @js.native
  trait ID3v2FrameReader extends js.Object {
    def _getFrameDescription(frameId: String): String = js.native
    def _getFrameHeaderSize(id3header: TagHeader): Double = js.native
    def _readFrameFlags(data: typings.jsmediatags.mediaFileReaderMod.default, offset: Double): TagFrameFlags = js.native
    def _readFrameHeader(data: typings.jsmediatags.mediaFileReaderMod.default, offset: Double, id3header: TagHeader): TagFrameHeader = js.native
    def getFrameReaderFunction(frameId: String): FrameReaderSignature | Null = js.native
    def getUnsyncFileReader(data: typings.jsmediatags.mediaFileReaderMod.default, offset: Double, size: Double): typings.jsmediatags.mediaFileReaderMod.default = js.native
    def readFrames(
      offset: Double,
      end: Double,
      data: typings.jsmediatags.mediaFileReaderMod.default,
      id3header: TagHeader
    ): TagFrames = js.native
    def readFrames(
      offset: Double,
      end: Double,
      data: typings.jsmediatags.mediaFileReaderMod.default,
      id3header: TagHeader,
      tags: js.Array[String]
    ): TagFrames = js.native
  }
  
  val default: ID3v2FrameReader = js.native
}

