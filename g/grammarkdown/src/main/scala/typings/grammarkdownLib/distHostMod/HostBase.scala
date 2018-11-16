package typings
package grammarkdownLib.distHostMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("grammarkdown/dist/host", "HostBase")
@js.native
abstract class HostBase () extends js.Object {
  def this(hasIgnoreCaseKnownGrammarsUseBuiltinGrammars: HostBaseOptions) = this()
  val ignoreCase: scala.Boolean = js.native
  var innerParser: js.Any = js.native
  var knownGrammars: js.Any = js.native
  val parser: grammarkdownLib.distParserMod.Parser = js.native
  var useBuiltinGrammars: js.Any = js.native
  /* protected */ def createParser(): grammarkdownLib.distParserMod.Parser = js.native
  def normalizeFile(file: java.lang.String): java.lang.String = js.native
  def parseSourceFile(file: java.lang.String, text: java.lang.String): grammarkdownLib.distNodesMod.SourceFile = js.native
  def parseSourceFile(
    file: java.lang.String,
    text: java.lang.String,
    cancellationToken: prexLib.prexMod.CancellationToken
  ): grammarkdownLib.distNodesMod.SourceFile = js.native
  def registerKnownGrammar(name: java.lang.String, file: java.lang.String): scala.Unit = js.native
  /* protected */ def resolveBuiltInGrammar(name: java.lang.String): js.UndefOr[java.lang.String] = js.native
  def resolveFile(file: java.lang.String): java.lang.String = js.native
  def resolveFile(file: java.lang.String, referer: java.lang.String): java.lang.String = js.native
  def resolveKnownGrammar(name: java.lang.String): js.UndefOr[java.lang.String] = js.native
}

