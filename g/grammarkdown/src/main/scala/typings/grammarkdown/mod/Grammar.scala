package typings.grammarkdown.mod

import typings.esfxCancelable.distMod.Cancelable
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
  /** @deprecated since 2.1.0 - `prex.CancellationToken` may no longer be accepted in future releases. Please use a token that implements `@esfx/cancelable.Cancelable` */
  def convert(content: String): String = js.native
  def convert(content: String, options: CompilerOptions): String = js.native
  def convert(content: String, options: CompilerOptions, hostFallback: typings.grammarkdown.hostMod.AsyncHost): String = js.native
  def convert(
    content: String,
    options: CompilerOptions,
    hostFallback: typings.grammarkdown.hostMod.AsyncHost,
    cancelable: Cancelable
  ): String = js.native
  def convert(
    content: String,
    options: CompilerOptions,
    hostFallback: typings.grammarkdown.hostMod.AsyncHost,
    cancelable: CancellationToken
  ): String = js.native
  def convert(content: String, options: CompilerOptions, hostFallback: typings.grammarkdown.hostMod.Host): String = js.native
  def convert(
    content: String,
    options: CompilerOptions,
    hostFallback: typings.grammarkdown.hostMod.Host,
    cancelable: Cancelable
  ): String = js.native
  def convert(
    content: String,
    options: CompilerOptions,
    hostFallback: typings.grammarkdown.hostMod.Host,
    cancelable: CancellationToken
  ): String = js.native
  def convert(content: String, options: CompilerOptions, hostFallback: typings.grammarkdown.hostMod.SyncHost): String = js.native
  def convert(
    content: String,
    options: CompilerOptions,
    hostFallback: typings.grammarkdown.hostMod.SyncHost,
    cancelable: Cancelable
  ): String = js.native
  def convert(
    content: String,
    options: CompilerOptions,
    hostFallback: typings.grammarkdown.hostMod.SyncHost,
    cancelable: CancellationToken
  ): String = js.native
}

