package typings.grammarkdown.mod

import typings.grammarkdown.optionsMod.CompilerOptions
import typings.prex.mod.CancellationToken
import typings.std.Iterable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("grammarkdown", "Grammar")
@js.native
class Grammar protected ()
  extends typings.grammarkdown.grammarMod.Grammar {
  def this(rootNames: Iterable[String]) = this()
  def this(rootNames: Iterable[String], options: CompilerOptions) = this()
  def this(
    rootNames: Iterable[String],
    options: CompilerOptions,
    host: typings.grammarkdown.hostMod.AsyncHost
  ) = this()
  def this(rootNames: Iterable[String], options: CompilerOptions, host: typings.grammarkdown.hostMod.Host) = this()
  def this(rootNames: Iterable[String], options: CompilerOptions, host: typings.grammarkdown.hostMod.SyncHost) = this()
}

/* static members */
@JSImport("grammarkdown", "Grammar")
@js.native
object Grammar extends js.Object {
  def convert(content: String): String = js.native
  def convert(content: String, options: CompilerOptions): String = js.native
  def convert(content: String, options: CompilerOptions, hostFallback: typings.grammarkdown.hostMod.AsyncHost): String = js.native
  def convert(
    content: String,
    options: CompilerOptions,
    hostFallback: typings.grammarkdown.hostMod.AsyncHost,
    cancellationToken: CancellationToken
  ): String = js.native
  def convert(content: String, options: CompilerOptions, hostFallback: typings.grammarkdown.hostMod.Host): String = js.native
  def convert(
    content: String,
    options: CompilerOptions,
    hostFallback: typings.grammarkdown.hostMod.Host,
    cancellationToken: CancellationToken
  ): String = js.native
  def convert(content: String, options: CompilerOptions, hostFallback: typings.grammarkdown.hostMod.SyncHost): String = js.native
  def convert(
    content: String,
    options: CompilerOptions,
    hostFallback: typings.grammarkdown.hostMod.SyncHost,
    cancellationToken: CancellationToken
  ): String = js.native
}

