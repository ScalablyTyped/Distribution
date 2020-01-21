package typings.grammarkdown.mod

import typings.prex.mod.CancellationToken
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("grammarkdown", "Scanner")
@js.native
class Scanner protected ()
  extends typings.grammarkdown.scannerMod.Scanner {
  def this(
    filename: String,
    text: String,
    diagnostics: typings.grammarkdown.diagnosticsMod.DiagnosticMessages
  ) = this()
  def this(
    filename: String,
    text: String,
    diagnostics: typings.grammarkdown.diagnosticsMod.DiagnosticMessages,
    cancellationToken: CancellationToken
  ) = this()
}

