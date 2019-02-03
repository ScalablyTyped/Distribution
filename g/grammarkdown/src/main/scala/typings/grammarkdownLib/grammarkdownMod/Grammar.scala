package typings
package grammarkdownLib.grammarkdownMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("grammarkdown", "Grammar")
@js.native
class Grammar protected ()
  extends grammarkdownLib.distGrammarMod.Grammar {
  def this(rootNames: stdLib.Iterable[java.lang.String]) = this()
  def this(rootNames: stdLib.Iterable[java.lang.String], options: grammarkdownLib.distOptionsMod.CompilerOptions) = this()
  def this(rootNames: stdLib.Iterable[java.lang.String], options: grammarkdownLib.distOptionsMod.CompilerOptions, host: grammarkdownLib.distHostMod.AsyncHost) = this()
  def this(rootNames: stdLib.Iterable[java.lang.String], options: grammarkdownLib.distOptionsMod.CompilerOptions, host: grammarkdownLib.distHostMod.Host) = this()
  def this(rootNames: stdLib.Iterable[java.lang.String], options: grammarkdownLib.distOptionsMod.CompilerOptions, host: grammarkdownLib.distHostMod.SyncHost) = this()
}

/* static members */
@JSImport("grammarkdown", "Grammar")
@js.native
object Grammar extends js.Object {
  def convert(content: java.lang.String): java.lang.String = js.native
  def convert(content: java.lang.String, options: grammarkdownLib.distOptionsMod.CompilerOptions): java.lang.String = js.native
  def convert(
    content: java.lang.String,
    options: grammarkdownLib.distOptionsMod.CompilerOptions,
    hostFallback: grammarkdownLib.distHostMod.AsyncHost
  ): java.lang.String = js.native
  def convert(
    content: java.lang.String,
    options: grammarkdownLib.distOptionsMod.CompilerOptions,
    hostFallback: grammarkdownLib.distHostMod.AsyncHost,
    cancellationToken: prexLib.prexMod.CancellationToken
  ): java.lang.String = js.native
  def convert(
    content: java.lang.String,
    options: grammarkdownLib.distOptionsMod.CompilerOptions,
    hostFallback: grammarkdownLib.distHostMod.Host
  ): java.lang.String = js.native
  def convert(
    content: java.lang.String,
    options: grammarkdownLib.distOptionsMod.CompilerOptions,
    hostFallback: grammarkdownLib.distHostMod.Host,
    cancellationToken: prexLib.prexMod.CancellationToken
  ): java.lang.String = js.native
  def convert(
    content: java.lang.String,
    options: grammarkdownLib.distOptionsMod.CompilerOptions,
    hostFallback: grammarkdownLib.distHostMod.SyncHost
  ): java.lang.String = js.native
  def convert(
    content: java.lang.String,
    options: grammarkdownLib.distOptionsMod.CompilerOptions,
    hostFallback: grammarkdownLib.distHostMod.SyncHost,
    cancellationToken: prexLib.prexMod.CancellationToken
  ): java.lang.String = js.native
}

