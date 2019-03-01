package typings
package jsflLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FlashSoundItem extends js.Object {
  var bitRate: java.lang.String
  var bits: java.lang.String
  var compressionType: java.lang.String
  var convertStereoToMono: scala.Boolean
  var fileLastModifiedDate: java.lang.String
  var originalCompressionType: java.lang.String
  var quality: java.lang.String
  var sampleRate: java.lang.String
  var sourceFileExists: scala.Boolean
  def exportToFile(fileURI: java.lang.String): scala.Boolean
}

object FlashSoundItem {
  @scala.inline
  def apply(
    bitRate: java.lang.String,
    bits: java.lang.String,
    compressionType: java.lang.String,
    convertStereoToMono: scala.Boolean,
    exportToFile: js.Function1[java.lang.String, scala.Boolean],
    fileLastModifiedDate: java.lang.String,
    originalCompressionType: java.lang.String,
    quality: java.lang.String,
    sampleRate: java.lang.String,
    sourceFileExists: scala.Boolean
  ): FlashSoundItem = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("bitRate")(bitRate)
    __obj.updateDynamic("bits")(bits)
    __obj.updateDynamic("compressionType")(compressionType)
    __obj.updateDynamic("convertStereoToMono")(convertStereoToMono)
    __obj.updateDynamic("exportToFile")(exportToFile)
    __obj.updateDynamic("fileLastModifiedDate")(fileLastModifiedDate)
    __obj.updateDynamic("originalCompressionType")(originalCompressionType)
    __obj.updateDynamic("quality")(quality)
    __obj.updateDynamic("sampleRate")(sampleRate)
    __obj.updateDynamic("sourceFileExists")(sourceFileExists)
    __obj.asInstanceOf[FlashSoundItem]
  }
}

