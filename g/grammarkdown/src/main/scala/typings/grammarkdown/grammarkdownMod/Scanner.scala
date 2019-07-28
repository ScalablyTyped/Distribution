package typings.grammarkdown.grammarkdownMod

import typings.prex.prexMod.CancellationToken
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("grammarkdown", "Scanner")
@js.native
class Scanner protected ()
  extends typings.grammarkdown.distScannerMod.Scanner {
  def this(
    filename: String,
    text: String,
    diagnostics: typings.grammarkdown.distDiagnosticsMod.DiagnosticMessages
  ) = this()
  def this(
    filename: String,
    text: String,
    diagnostics: typings.grammarkdown.distDiagnosticsMod.DiagnosticMessages,
    cancellationToken: CancellationToken
  ) = this()
}

