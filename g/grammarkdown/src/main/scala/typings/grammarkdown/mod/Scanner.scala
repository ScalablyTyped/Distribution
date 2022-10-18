package typings.grammarkdown.mod

import typings.esfxCancelable.mod.Cancelable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("grammarkdown", "Scanner")
@js.native
open class Scanner protected ()
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
    cancelable: Cancelable
  ) = this()
}
