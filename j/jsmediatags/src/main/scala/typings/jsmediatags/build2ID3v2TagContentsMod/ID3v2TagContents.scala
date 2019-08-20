package typings.jsmediatags.build2ID3v2TagContentsMod

import org.scalablytyped.runtime.StringDictionary
import typings.jsmediatags.Anon_CRC
import typings.jsmediatags.typesMod.ByteArray
import typings.jsmediatags.typesMod.TagFrameFlags
import typings.jsmediatags.typesMod.TagHeaderFlags
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ID3v2TagContents extends js.Object {
  var _contents: ByteArray = js.native
  var _extendedHeader: Anon_CRC = js.native
  var _frames: StringDictionary[js.Array[ByteArray]] = js.native
  var _hasExtendedHeader: Boolean = js.native
  var _major: Double = js.native
  var _nextFrameOffset: Double = js.native
  var _revision: Double = js.native
  var _size: Double = js.native
  def _addData(offset: Double, data: ByteArray): Unit = js.native
  def _addExtendedHeaderData(tagKey: String, tagData: ByteArray): Unit = js.native
  def _getData(offset: Double, length: Double): ByteArray = js.native
  def _initExtendedHeader(): Unit = js.native
  def _setBitAtOffset(offset: Double, bit: Double): Unit = js.native
  def _setData(offset: Double, data: ByteArray): Unit = js.native
  def _updateFlags(flags: TagHeaderFlags): ID3v2TagContents = js.native
  def _updateFlags(flags: TagHeaderFlags, binaryFlags: Double): ID3v2TagContents = js.native
  def _updateSize(): Unit = js.native
  def addFrame(id: String, data: ByteArray): ID3v2TagContents = js.native
  def addFrame(id: String, data: ByteArray, flags: TagFrameFlags): ID3v2TagContents = js.native
  def addFrame(id: String, data: ByteArray, flags: TagFrameFlags, noFlagsDataLength: Double): ID3v2TagContents = js.native
  def setCrc(crc: ByteArray): ID3v2TagContents = js.native
  def setFlags(flags: TagHeaderFlags): ID3v2TagContents = js.native
  def setTagIsUpdate(): ID3v2TagContents = js.native
  def setTagRestrictions(size: Double, textEncoding: Double, textSize: Double, imageEncoding: Double, imageSize: Double): ID3v2TagContents = js.native
  def toArray(): ByteArray = js.native
}

