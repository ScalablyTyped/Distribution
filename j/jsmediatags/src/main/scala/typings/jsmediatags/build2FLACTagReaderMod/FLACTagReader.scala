package typings.jsmediatags.build2FLACTagReaderMod

import typings.jsmediatags.typesMod.LoadCallbackType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FLACTagReader
  extends typings.jsmediatags.build2MediaTagReaderMod.default {
  var _commentOffset: Double = js.native
  var _pictureOffset: Double = js.native
  def _loadBlock(
    mediaFileReader: typings.jsmediatags.build2MediaFileReaderMod.default,
    offset: Double,
    callbacks: LoadCallbackType
  ): Unit = js.native
  def _nextBlock(
    mediaFileReader: typings.jsmediatags.build2MediaFileReaderMod.default,
    offset: Double,
    blockHeader: Double,
    blockSize: Double,
    callbacks: LoadCallbackType
  ): Unit = js.native
}

