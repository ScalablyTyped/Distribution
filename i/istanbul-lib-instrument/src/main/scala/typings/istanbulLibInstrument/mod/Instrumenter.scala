package typings.istanbulLibInstrument.mod

import typings.istanbulLibCoverage.mod.FileCoverage
import typings.istanbulLibCoverage.mod.FileCoverageData
import typings.istanbulLibInstrument.anon.PartialInstrumenterOption
import typings.sourceMap.mod.RawSourceMap
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("istanbul-lib-instrument", "Instrumenter")
@js.native
class Instrumenter () extends js.Object {
  def this(options: PartialInstrumenterOption) = this()
  var fileCoverage: FileCoverage = js.native
  var opts: InstrumenterOptions = js.native
  var sourceMap: RawSourceMap | Null = js.native
  def instrument(code: String, filenameOrCallback: String): Unit = js.native
  def instrument(code: String, filenameOrCallback: String, callback: InstrumenterCallback): Unit = js.native
  def instrument(
    code: String,
    filenameOrCallback: String,
    callback: InstrumenterCallback,
    inputSourceMap: RawSourceMap
  ): Unit = js.native
  def instrument(code: String, filenameOrCallback: InstrumenterCallback): Unit = js.native
  def instrument(code: String, filenameOrCallback: InstrumenterCallback, callback: InstrumenterCallback): Unit = js.native
  def instrument(
    code: String,
    filenameOrCallback: InstrumenterCallback,
    callback: InstrumenterCallback,
    inputSourceMap: RawSourceMap
  ): Unit = js.native
  def instrumentSync(code: String, filename: String): String = js.native
  def instrumentSync(code: String, filename: String, inputSourceMap: RawSourceMap): String = js.native
  def lastFileCoverage(): FileCoverageData = js.native
  def lastSourceMap(): RawSourceMap = js.native
  def normalizeOpts(): InstrumenterOptions = js.native
  def normalizeOpts(options: PartialInstrumenterOption): InstrumenterOptions = js.native
}

