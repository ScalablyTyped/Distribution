package typings.grammarkdown.mod

import typings.esfxCancelable.distMod.Cancelable
import typings.grammarkdown.optionsMod.CompilerOptions
import typings.prex.mod.CancellationToken
import typings.std.Iterable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("grammarkdown", "Grammar")
@js.native
class Grammar protected ()
  extends typings.grammarkdown.grammarMod.Grammar {
  /**
    * @param rootNames The names of the root files used by the grammar.
    * @param options The {@link CompilerOptions} used by the grammar.
    * @param host The [Host](xref:hosts) the grammar uses to interact with the file system.
    */
  def this(rootNames: Iterable[String]) = this()
  def this(rootNames: Iterable[String], options: CompilerOptions) = this()
  def this(
    rootNames: Iterable[String],
    options: js.UndefOr[scala.Nothing],
    host: typings.grammarkdown.hostMod.CoreAsyncHost
  ) = this()
  def this(
    rootNames: Iterable[String],
    options: js.UndefOr[scala.Nothing],
    host: typings.grammarkdown.hostMod.CoreSyncHost
  ) = this()
  def this(
    rootNames: Iterable[String],
    options: js.UndefOr[scala.Nothing],
    host: typings.grammarkdown.nodeMod.Host
  ) = this()
  def this(
    rootNames: Iterable[String],
    options: CompilerOptions,
    host: typings.grammarkdown.hostMod.CoreAsyncHost
  ) = this()
  def this(
    rootNames: Iterable[String],
    options: CompilerOptions,
    host: typings.grammarkdown.hostMod.CoreSyncHost
  ) = this()
  def this(rootNames: Iterable[String], options: CompilerOptions, host: typings.grammarkdown.nodeMod.Host) = this()
}
/* static members */
object Grammar {
  
  /**
    * Converts a string containing Grammarkdown syntax into output based on the provided options.
    * @param content The Grammarkdown source text to convert.
    * @param options The {@link CompilerOptions} used by the grammar.
    * @param hostFallback An optional host to use as a fallback for file system operations.
    * @param cancelable A cancelable object that can be used to abort the operation.
    */
  /**
    * {@inheritDoc Grammar.(convert:1)}
    * @deprecated since 2.1.0 - `prex.CancellationToken` may no longer be accepted in future releases. Please use a token that implements `@esfx/cancelable.Cancelable`
    */
  @JSImport("grammarkdown", "Grammar.convert")
  @js.native
  def convert(content: String): String = js.native
  @JSImport("grammarkdown", "Grammar.convert")
  @js.native
  def convert(
    content: String,
    options: js.UndefOr[scala.Nothing],
    hostFallback: js.UndefOr[scala.Nothing],
    cancelable: Cancelable
  ): String = js.native
  @JSImport("grammarkdown", "Grammar.convert")
  @js.native
  def convert(
    content: String,
    options: js.UndefOr[scala.Nothing],
    hostFallback: js.UndefOr[scala.Nothing],
    cancelable: CancellationToken
  ): String = js.native
  @JSImport("grammarkdown", "Grammar.convert")
  @js.native
  def convert(
    content: String,
    options: js.UndefOr[scala.Nothing],
    hostFallback: typings.grammarkdown.hostMod.CoreAsyncHost
  ): String = js.native
  @JSImport("grammarkdown", "Grammar.convert")
  @js.native
  def convert(
    content: String,
    options: js.UndefOr[scala.Nothing],
    hostFallback: typings.grammarkdown.hostMod.CoreAsyncHost,
    cancelable: Cancelable
  ): String = js.native
  @JSImport("grammarkdown", "Grammar.convert")
  @js.native
  def convert(
    content: String,
    options: js.UndefOr[scala.Nothing],
    hostFallback: typings.grammarkdown.hostMod.CoreAsyncHost,
    cancelable: CancellationToken
  ): String = js.native
  @JSImport("grammarkdown", "Grammar.convert")
  @js.native
  def convert(
    content: String,
    options: js.UndefOr[scala.Nothing],
    hostFallback: typings.grammarkdown.hostMod.CoreSyncHost
  ): String = js.native
  @JSImport("grammarkdown", "Grammar.convert")
  @js.native
  def convert(
    content: String,
    options: js.UndefOr[scala.Nothing],
    hostFallback: typings.grammarkdown.hostMod.CoreSyncHost,
    cancelable: Cancelable
  ): String = js.native
  @JSImport("grammarkdown", "Grammar.convert")
  @js.native
  def convert(
    content: String,
    options: js.UndefOr[scala.Nothing],
    hostFallback: typings.grammarkdown.hostMod.CoreSyncHost,
    cancelable: CancellationToken
  ): String = js.native
  @JSImport("grammarkdown", "Grammar.convert")
  @js.native
  def convert(
    content: String,
    options: js.UndefOr[scala.Nothing],
    hostFallback: typings.grammarkdown.nodeMod.Host
  ): String = js.native
  @JSImport("grammarkdown", "Grammar.convert")
  @js.native
  def convert(
    content: String,
    options: js.UndefOr[scala.Nothing],
    hostFallback: typings.grammarkdown.nodeMod.Host,
    cancelable: Cancelable
  ): String = js.native
  @JSImport("grammarkdown", "Grammar.convert")
  @js.native
  def convert(
    content: String,
    options: js.UndefOr[scala.Nothing],
    hostFallback: typings.grammarkdown.nodeMod.Host,
    cancelable: CancellationToken
  ): String = js.native
  @JSImport("grammarkdown", "Grammar.convert")
  @js.native
  def convert(content: String, options: CompilerOptions): String = js.native
  @JSImport("grammarkdown", "Grammar.convert")
  @js.native
  def convert(
    content: String,
    options: CompilerOptions,
    hostFallback: js.UndefOr[scala.Nothing],
    cancelable: Cancelable
  ): String = js.native
  @JSImport("grammarkdown", "Grammar.convert")
  @js.native
  def convert(
    content: String,
    options: CompilerOptions,
    hostFallback: js.UndefOr[scala.Nothing],
    cancelable: CancellationToken
  ): String = js.native
  @JSImport("grammarkdown", "Grammar.convert")
  @js.native
  def convert(
    content: String,
    options: CompilerOptions,
    hostFallback: typings.grammarkdown.hostMod.CoreAsyncHost
  ): String = js.native
  @JSImport("grammarkdown", "Grammar.convert")
  @js.native
  def convert(
    content: String,
    options: CompilerOptions,
    hostFallback: typings.grammarkdown.hostMod.CoreAsyncHost,
    cancelable: Cancelable
  ): String = js.native
  @JSImport("grammarkdown", "Grammar.convert")
  @js.native
  def convert(
    content: String,
    options: CompilerOptions,
    hostFallback: typings.grammarkdown.hostMod.CoreAsyncHost,
    cancelable: CancellationToken
  ): String = js.native
  @JSImport("grammarkdown", "Grammar.convert")
  @js.native
  def convert(content: String, options: CompilerOptions, hostFallback: typings.grammarkdown.hostMod.CoreSyncHost): String = js.native
  @JSImport("grammarkdown", "Grammar.convert")
  @js.native
  def convert(
    content: String,
    options: CompilerOptions,
    hostFallback: typings.grammarkdown.hostMod.CoreSyncHost,
    cancelable: Cancelable
  ): String = js.native
  @JSImport("grammarkdown", "Grammar.convert")
  @js.native
  def convert(
    content: String,
    options: CompilerOptions,
    hostFallback: typings.grammarkdown.hostMod.CoreSyncHost,
    cancelable: CancellationToken
  ): String = js.native
  @JSImport("grammarkdown", "Grammar.convert")
  @js.native
  def convert(content: String, options: CompilerOptions, hostFallback: typings.grammarkdown.nodeMod.Host): String = js.native
  @JSImport("grammarkdown", "Grammar.convert")
  @js.native
  def convert(
    content: String,
    options: CompilerOptions,
    hostFallback: typings.grammarkdown.nodeMod.Host,
    cancelable: Cancelable
  ): String = js.native
  @JSImport("grammarkdown", "Grammar.convert")
  @js.native
  def convert(
    content: String,
    options: CompilerOptions,
    hostFallback: typings.grammarkdown.nodeMod.Host,
    cancelable: CancellationToken
  ): String = js.native
}
