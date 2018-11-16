package typings
package istanbulDashLibDashInstrumentLib.istanbulDashLibDashInstrumentMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("istanbul-lib-instrument", "Instrumenter")
@js.native
class Instrumenter () extends js.Object {
  def this(options: stdLib.Partial[InstrumenterOptions]) = this()
  var fileCoverage: istanbulDashLibDashCoverageLib.istanbulDashLibDashCoverageMod.FileCoverage = js.native
  var opts: InstrumenterOptions = js.native
  var sourceMap: sourceDashMapLib.sourceDashMapMod.RawSourceMap | scala.Null = js.native
  def instrument(code: java.lang.String, filenameOrCallback: InstrumenterCallback): scala.Unit = js.native
  def instrument(code: java.lang.String, filenameOrCallback: InstrumenterCallback, callback: InstrumenterCallback): scala.Unit = js.native
  def instrument(
    code: java.lang.String,
    filenameOrCallback: InstrumenterCallback,
    callback: InstrumenterCallback,
    inputSourceMap: sourceDashMapLib.sourceDashMapMod.RawSourceMap
  ): scala.Unit = js.native
  def instrument(code: java.lang.String, filenameOrCallback: java.lang.String): scala.Unit = js.native
  def instrument(code: java.lang.String, filenameOrCallback: java.lang.String, callback: InstrumenterCallback): scala.Unit = js.native
  def instrument(
    code: java.lang.String,
    filenameOrCallback: java.lang.String,
    callback: InstrumenterCallback,
    inputSourceMap: sourceDashMapLib.sourceDashMapMod.RawSourceMap
  ): scala.Unit = js.native
  def instrumentSync(code: java.lang.String, filename: java.lang.String): java.lang.String = js.native
  def instrumentSync(
    code: java.lang.String,
    filename: java.lang.String,
    inputSourceMap: sourceDashMapLib.sourceDashMapMod.RawSourceMap
  ): java.lang.String = js.native
  def lastFileCoverage(): istanbulDashLibDashCoverageLib.istanbulDashLibDashCoverageMod.FileCoverageData = js.native
  def lastSourceMap(): sourceDashMapLib.sourceDashMapMod.RawSourceMap = js.native
  def normalizeOpts(): InstrumenterOptions = js.native
  def normalizeOpts(options: stdLib.Partial[InstrumenterOptions]): InstrumenterOptions = js.native
}

