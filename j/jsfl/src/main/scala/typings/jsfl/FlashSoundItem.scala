package typings.jsfl

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FlashSoundItem extends js.Object {
  var bitRate: String
  var bits: String
  var compressionType: String
  var convertStereoToMono: Boolean
  var fileLastModifiedDate: String
  var originalCompressionType: String
  var quality: String
  var sampleRate: String
  var sourceFileExists: Boolean
  def exportToFile(fileURI: String): Boolean
}

object FlashSoundItem {
  @scala.inline
  def apply(
    bitRate: String,
    bits: String,
    compressionType: String,
    convertStereoToMono: Boolean,
    exportToFile: String => Boolean,
    fileLastModifiedDate: String,
    originalCompressionType: String,
    quality: String,
    sampleRate: String,
    sourceFileExists: Boolean
  ): FlashSoundItem = {
    val __obj = js.Dynamic.literal(bitRate = bitRate, bits = bits, compressionType = compressionType, convertStereoToMono = convertStereoToMono, exportToFile = js.Any.fromFunction1(exportToFile), fileLastModifiedDate = fileLastModifiedDate, originalCompressionType = originalCompressionType, quality = quality, sampleRate = sampleRate, sourceFileExists = sourceFileExists)
  
    __obj.asInstanceOf[FlashSoundItem]
  }
}

