package typings.istanbulDashLibDashInstrument.istanbulDashLibDashInstrumentMod

import typings.istanbulDashLibDashInstrument.TypeofbabelTypes
import typings.std.Partial
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("istanbul-lib-instrument", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  def createInstrumenter(): Instrumenter = js.native
  def createInstrumenter(options: Partial[InstrumenterOptions]): Instrumenter = js.native
  def programVisitor(types: TypeofbabelTypes): Visitor = js.native
  def programVisitor(types: TypeofbabelTypes, sourceFilePath: String): Visitor = js.native
  def programVisitor(types: TypeofbabelTypes, sourceFilePath: String, opts: Partial[VisitorOptions]): Visitor = js.native
  def readInitialCoverage(code: String): InitialCoverage = js.native
}

