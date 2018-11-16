package typings
package handsontableLib.handsontableMod.HandsontableNs.pluginsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SamplesGenerator extends js.Object {
  var allowDuplicates: scala.Boolean | scala.Null = js.native
  var customSampleCount: scala.Boolean | scala.Null = js.native
  var samples: js.Object | scala.Null = js.native
  def dataFactory(): scala.Unit = js.native
  def generateColumnSamples(colRange: js.Object, rowRange: js.Object): js.Object = js.native
  def generateRowSamples(rowRange: js.Object, colRange: js.Object): js.Object = js.native
  def generateRowSamples(rowRange: scala.Double, colRange: js.Object): js.Object = js.native
  def generateSample(`type`: java.lang.String, range: js.Object, specifierValue: scala.Double): js.Object = js.native
  def generateSamples(`type`: java.lang.String, range: js.Object, specifierRange: js.Object): js.Object = js.native
  def generateSamples(`type`: java.lang.String, range: js.Object, specifierRange: scala.Double): js.Object = js.native
  def getSampleCount(): scala.Double = js.native
  def setAllowDuplicates(allowDuplicates: scala.Boolean): scala.Unit = js.native
  def setSampleCount(sampleCount: scala.Double): scala.Unit = js.native
}

