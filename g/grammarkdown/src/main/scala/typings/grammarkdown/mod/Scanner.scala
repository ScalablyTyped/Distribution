package typings.grammarkdown.mod

import typings.esfxCancelable.distMod.Cancelable
import typings.prex.mod.CancellationToken
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

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
    cancelable: Cancelable
  ) = this()
  def this(
    filename: String,
    text: String,
    diagnostics: typings.grammarkdown.diagnosticsMod.DiagnosticMessages,
    cancelable: CancellationToken
  ) = this()
}
