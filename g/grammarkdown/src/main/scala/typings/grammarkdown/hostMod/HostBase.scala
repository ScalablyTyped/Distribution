package typings.grammarkdown.hostMod

import typings.esfxCancelable.distMod.Cancelable
import typings.grammarkdown.nodesMod.SourceFile
import typings.grammarkdown.parserMod.Parser
import typings.prex.mod.CancellationToken
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("grammarkdown/dist/host", "HostBase")
@js.native
/**
  * @param options The options used to configure the host.
  */
abstract class HostBase () extends js.Object {
  def this(options: HostBaseOptions) = this()
  
  var _innerParser: js.Any = js.native
  
  var _knownGrammars: js.Any = js.native
  
  var _useBuiltinGrammars: js.Any = js.native
  
  /**
    * Creates a {@link Parser} for this host.
    * @virtual
    */
  /* protected */ def createParser(): Parser = js.native
  
  /**
    * Indicates whether comparisons for this host should be case insensitive.
    */
  val ignoreCase: Boolean = js.native
  
  /**
    * Normalize a file path's string representation for use as a key based on the case sensitivity of the host.
    * @param file The file path.
    */
  def normalizeFile(file: String): String = js.native
  
  /**
    * When overridden in a derived class, normalizes a file path's string representation for use as a key based on the case sensitivity of the host.
    * @param file The file path.
    * @virtual
    */
  /* protected */ def normalizeFileCore(file: String): String = js.native
  
  /**
    * Parse a source file.
    * @param file The path to the source file.
    * @param text The text of the source file.
    * @param cancelable An optional cancelable object that can be used to abort a long-running parse.
    */
  def parseSourceFile(file: String, text: String): SourceFile = js.native
  def parseSourceFile(file: String, text: String, cancelable: Cancelable): SourceFile = js.native
  def parseSourceFile(file: String, text: String, cancelable: CancellationToken): SourceFile = js.native
  
  /**
    * Gets the parser instance associated with this host.
    */
  /* protected */ def parser: Parser = js.native
  
  /**
    * Registers a known grammar for use with `@import` directives.
    * @param name The name for the grammar.
    * @param file The file path of the grammar.
    */
  def registerKnownGrammar(name: String, file: String): Unit = js.native
  
  /**
    * When overridden in a derived clas, registers a known grammar for use with `@import` directives.
    * @param name The name for the grammar.
    * @param file The file path of the grammar.
    * @virtual
    */
  /* protected */ def registerKnownGrammarCore(name: String, file: String): Unit = js.native
  
  /**
    * Resolve the full path of a file relative to the provided referer.
    * @param file The path to the requested file.
    * @param referer An optional path indicating the file from which the path should be resolved.
    */
  def resolveFile(file: String): String = js.native
  def resolveFile(file: String, referer: String): String = js.native
  
  /**
    * When overridden in a derived class, resolves the full path of a file relative to the provided referer.
    * @param file The path to the requested file.
    * @param referer An optional path indicating the file from which the path should be resolved.
    * @virtual
    */
  /* protected */ def resolveFileCore(file: String): String = js.native
  /* protected */ def resolveFileCore(file: String, referer: String): String = js.native
  
  /**
    * Returns the path for a known or built-in grammar based on its name (i.e., `"es2015"`, etc.)
    * @param name The name of the grammar.
    */
  def resolveKnownGrammar(name: String): js.UndefOr[String] = js.native
  
  /**
    * When overridden in a derived class, returns the path for a known or built-in grammar based on its name (i.e., `"es2015"`, etc.)
    * @param name The name of the grammar.
    * @virtual
    */
  /* protected */ def resolveKnownGrammarCore(name: String): js.UndefOr[String] = js.native
}
