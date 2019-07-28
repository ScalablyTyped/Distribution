package typings.grammarkdown.grammarkdownMod

import typings.grammarkdown.distOptionsMod.CompilerOptions
import typings.prex.prexMod.CancellationToken
import typings.std.Iterable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("grammarkdown", "Grammar")
@js.native
class Grammar protected ()
  extends typings.grammarkdown.distGrammarMod.Grammar {
  def this(rootNames: Iterable[String]) = this()
  def this(rootNames: Iterable[String], options: CompilerOptions) = this()
  def this(
    rootNames: Iterable[String],
    options: CompilerOptions,
    host: typings.grammarkdown.distHostMod.AsyncHost
  ) = this()
  def this(rootNames: Iterable[String], options: CompilerOptions, host: typings.grammarkdown.distHostMod.Host) = this()
  def this(
    rootNames: Iterable[String],
    options: CompilerOptions,
    host: typings.grammarkdown.distHostMod.SyncHost
  ) = this()
}

/* static members */
@JSImport("grammarkdown", "Grammar")
@js.native
object Grammar extends js.Object {
  def convert(content: String): String = js.native
  def convert(content: String, options: CompilerOptions): String = js.native
  def convert(
    content: String,
    options: CompilerOptions,
    hostFallback: typings.grammarkdown.distHostMod.AsyncHost
  ): String = js.native
  def convert(
    content: String,
    options: CompilerOptions,
    hostFallback: typings.grammarkdown.distHostMod.AsyncHost,
    cancellationToken: CancellationToken
  ): String = js.native
  def convert(content: String, options: CompilerOptions, hostFallback: typings.grammarkdown.distHostMod.Host): String = js.native
  def convert(
    content: String,
    options: CompilerOptions,
    hostFallback: typings.grammarkdown.distHostMod.Host,
    cancellationToken: CancellationToken
  ): String = js.native
  def convert(content: String, options: CompilerOptions, hostFallback: typings.grammarkdown.distHostMod.SyncHost): String = js.native
  def convert(
    content: String,
    options: CompilerOptions,
    hostFallback: typings.grammarkdown.distHostMod.SyncHost,
    cancellationToken: CancellationToken
  ): String = js.native
}

