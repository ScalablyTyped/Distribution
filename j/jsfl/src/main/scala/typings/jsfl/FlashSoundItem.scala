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
    val __obj = js.Dynamic.literal(bitRate = bitRate.asInstanceOf[js.Any], bits = bits.asInstanceOf[js.Any], compressionType = compressionType.asInstanceOf[js.Any], convertStereoToMono = convertStereoToMono.asInstanceOf[js.Any], exportToFile = js.Any.fromFunction1(exportToFile), fileLastModifiedDate = fileLastModifiedDate.asInstanceOf[js.Any], originalCompressionType = originalCompressionType.asInstanceOf[js.Any], quality = quality.asInstanceOf[js.Any], sampleRate = sampleRate.asInstanceOf[js.Any], sourceFileExists = sourceFileExists.asInstanceOf[js.Any])
    __obj.asInstanceOf[FlashSoundItem]
  }
}

