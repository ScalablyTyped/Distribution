package typings
package jsflLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FlashSymbolItem extends js.Object {
  var scalingGrid: scala.Boolean
  var scalingGridRect: FlashRectangle
  var sourceAutoUpdate: scala.Boolean
  var sourceFilePath: java.lang.String
  var sourceLibraryName: java.lang.String
  var symbolType: java.lang.String
  var timeline: FlashTimeline
  def convertToCompiledClip(): scala.Unit
  def exportSWC(outputURI: java.lang.String): scala.Unit
  def exportSWF(outputURI: java.lang.String): scala.Unit
}

