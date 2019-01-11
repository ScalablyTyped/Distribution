package typings
package istanbulDashLibDashInstrumentLib.istanbulDashLibDashInstrumentMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("istanbul-lib-instrument", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  def createInstrumenter(): istanbulDashLibDashInstrumentLib.istanbulDashLibDashInstrumentMod.Instrumenter = js.native
  def createInstrumenter(
    options: stdLib.Partial[
      istanbulDashLibDashInstrumentLib.istanbulDashLibDashInstrumentMod.InstrumenterOptions
    ]
  ): istanbulDashLibDashInstrumentLib.istanbulDashLibDashInstrumentMod.Instrumenter = js.native
  def programVisitor(types: istanbulDashLibDashInstrumentLib.`Anon_`): istanbulDashLibDashInstrumentLib.istanbulDashLibDashInstrumentMod.Visitor = js.native
  def programVisitor(types: istanbulDashLibDashInstrumentLib.`Anon_`, sourceFilePath: java.lang.String): istanbulDashLibDashInstrumentLib.istanbulDashLibDashInstrumentMod.Visitor = js.native
  def programVisitor(
    types: istanbulDashLibDashInstrumentLib.`Anon_`,
    sourceFilePath: java.lang.String,
    opts: stdLib.Partial[istanbulDashLibDashInstrumentLib.istanbulDashLibDashInstrumentMod.VisitorOptions]
  ): istanbulDashLibDashInstrumentLib.istanbulDashLibDashInstrumentMod.Visitor = js.native
  def readInitialCoverage(code: java.lang.String): istanbulDashLibDashInstrumentLib.istanbulDashLibDashInstrumentMod.InitialCoverage = js.native
}

