package typings.istanbulLibInstrument.mod

import typings.istanbulLibInstrument.PartialVisitorOptions
import typings.istanbulLibInstrument.TypeofbabelTypes
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("istanbul-lib-instrument", "programVisitor")
@js.native
object programVisitor extends js.Object {
  def apply(types: TypeofbabelTypes): Visitor = js.native
  def apply(types: TypeofbabelTypes, sourceFilePath: String): Visitor = js.native
  def apply(types: TypeofbabelTypes, sourceFilePath: String, opts: PartialVisitorOptions): Visitor = js.native
}

