package typings.handsontable.handsontableMod.Handsontable.plugins

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SamplesGenerator extends js.Object {
  var allowDuplicates: Boolean | Null = js.native
  var customSampleCount: Boolean | Null = js.native
  var samples: js.Object | Null = js.native
  def dataFactory(): Unit = js.native
  def generateColumnSamples(colRange: js.Object, rowRange: js.Object): js.Object = js.native
  def generateRowSamples(rowRange: js.Object, colRange: js.Object): js.Object = js.native
  def generateRowSamples(rowRange: Double, colRange: js.Object): js.Object = js.native
  def generateSample(`type`: String, range: js.Object, specifierValue: Double): js.Object = js.native
  def generateSamples(`type`: String, range: js.Object, specifierRange: js.Object): js.Object = js.native
  def generateSamples(`type`: String, range: js.Object, specifierRange: Double): js.Object = js.native
  def getSampleCount(): Double = js.native
  def setAllowDuplicates(allowDuplicates: Boolean): Unit = js.native
  def setSampleCount(sampleCount: Double): Unit = js.native
}

