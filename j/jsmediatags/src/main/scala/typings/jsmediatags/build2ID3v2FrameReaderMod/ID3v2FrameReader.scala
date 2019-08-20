package typings.jsmediatags.build2ID3v2FrameReaderMod

import typings.jsmediatags.build2MediaFileReaderMod.default
import typings.jsmediatags.typesMod.FrameReaderSignature
import typings.jsmediatags.typesMod.TagFrameFlags
import typings.jsmediatags.typesMod.TagFrameHeader
import typings.jsmediatags.typesMod.TagFrames
import typings.jsmediatags.typesMod.TagHeader
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// tslint:disable-next-line:interface-name
@js.native
trait ID3v2FrameReader extends js.Object {
  def _getFrameDescription(frameId: String): String = js.native
  def _getFrameHeaderSize(id3header: TagHeader): Double = js.native
  def _readFrameFlags(data: default, offset: Double): TagFrameFlags = js.native
  def _readFrameHeader(data: default, offset: Double, id3header: TagHeader): TagFrameHeader = js.native
  def getFrameReaderFunction(frameId: String): FrameReaderSignature | Null = js.native
  def getUnsyncFileReader(data: default, offset: Double, size: Double): default = js.native
  def readFrames(offset: Double, end: Double, data: default, id3header: TagHeader): TagFrames = js.native
  def readFrames(offset: Double, end: Double, data: default, id3header: TagHeader, tags: js.Array[String]): TagFrames = js.native
}

