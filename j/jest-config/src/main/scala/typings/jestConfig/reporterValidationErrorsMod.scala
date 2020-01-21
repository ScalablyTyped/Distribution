package typings.jestConfig

import typings.jestTypes.configMod.ReporterConfig
import typings.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("jest-config/build/ReporterValidationErrors", JSImport.Namespace)
@js.native
object reporterValidationErrorsMod extends js.Object {
  def createArrayReporterError(
    arrayReporter: ReporterConfig,
    reporterIndex: Double,
    valueIndex: Double,
    value: String,
    expectedType: String,
    valueName: String
  ): js.Any = js.native
  def createArrayReporterError(
    arrayReporter: ReporterConfig,
    reporterIndex: Double,
    valueIndex: Double,
    value: Record[String, _],
    expectedType: String,
    valueName: String
  ): js.Any = js.native
  def createReporterError(reporterIndex: Double, reporterValue: String): js.Any = js.native
  def createReporterError(reporterIndex: Double, reporterValue: js.Array[ReporterConfig]): js.Any = js.native
  def validateReporters(reporterConfig: js.Array[ReporterConfig | String]): Boolean = js.native
}

