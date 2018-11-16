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

