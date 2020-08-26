package typings.jestConfig

import typings.jestTypes.configMod.ReporterConfig
import typings.jestValidate.mod.ValidationError
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
  ): ValidationError = js.native
  def createArrayReporterError(
    arrayReporter: ReporterConfig,
    reporterIndex: Double,
    valueIndex: Double,
    value: Record[String, _],
    expectedType: String,
    valueName: String
  ): ValidationError = js.native
  def createReporterError(reporterIndex: Double, reporterValue: String): ValidationError = js.native
  def createReporterError(reporterIndex: Double, reporterValue: js.Array[ReporterConfig]): ValidationError = js.native
  def validateReporters(reporterConfig: js.Array[ReporterConfig | String]): Boolean = js.native
}

