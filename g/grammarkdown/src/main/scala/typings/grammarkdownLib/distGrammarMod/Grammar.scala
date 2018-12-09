package typings
package grammarkdownLib.distGrammarMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("grammarkdown/dist/grammar", "Grammar")
@js.native
class Grammar protected () extends js.Object {
  def this(rootNames: stdLib.Iterable[java.lang.String]) = this()
  def this(rootNames: stdLib.Iterable[java.lang.String], options: grammarkdownLib.distOptionsMod.CompilerOptions) = this()
  def this(rootNames: stdLib.Iterable[java.lang.String], options: grammarkdownLib.distOptionsMod.CompilerOptions, host: grammarkdownLib.distHostMod.AsyncHost) = this()
  def this(rootNames: stdLib.Iterable[java.lang.String], options: grammarkdownLib.distOptionsMod.CompilerOptions, host: grammarkdownLib.distHostMod.Host) = this()
  def this(rootNames: stdLib.Iterable[java.lang.String], options: grammarkdownLib.distOptionsMod.CompilerOptions, host: grammarkdownLib.distHostMod.SyncHost) = this()
  var beginParsePossiblyAsync: js.Any = js.native
  var bindPossiblyAsync: js.Any = js.native
  val binder: grammarkdownLib.distBinderMod.Binder = js.native
  var bindings: js.Any = js.native
  var checkPossiblyAsync: js.Any = js.native
  val checker: grammarkdownLib.distCheckerMod.Checker = js.native
  var diagnostics: grammarkdownLib.distDiagnosticsMod.DiagnosticMessages = js.native
  var emitOnePossiblyAsync: js.Any = js.native
  var emitPossiblyAsync: js.Any = js.native
  var emitStringPossiblyAsync: js.Any = js.native
  val emitter: grammarkdownLib.distEmitterMod.Emitter = js.native
  var endBind: js.Any = js.native
  var endCheck: js.Any = js.native
  var endEmitPossiblyAsync: js.Any = js.native
  var endParse: js.Any = js.native
  var endProcessFilePossiblyAsync: js.Any = js.native
  var endProcessRootFile: js.Any = js.native
  var getSourceFileNoResolve: js.Any = js.native
  val host: grammarkdownLib.distHostMod.Host | grammarkdownLib.distHostMod.SyncHost | grammarkdownLib.distHostMod.AsyncHost = js.native
  var innerBinder: js.Any = js.native
  var innerChecker: js.Any = js.native
  var innerEmitter: js.Any = js.native
  var innerResolver: js.Any = js.native
  val isBound: scala.Boolean = js.native
  val isParsed: scala.Boolean = js.native
  var normalizeFile: js.Any = js.native
  var options: grammarkdownLib.distOptionsMod.CompilerOptions = js.native
  var parsePossiblyAsync: js.Any = js.native
  var parsePromise: js.Any = js.native
  var parseState: js.Any = js.native
  var processFilePossiblyAsync: js.Any = js.native
  var processImportsPossiblyAsync: js.Any = js.native
  var processRootFilePossiblyAsync: js.Any = js.native
  var resolveFile: js.Any = js.native
  val resolver: grammarkdownLib.distCheckerMod.Resolver = js.native
  val rootFiles: js.Array[grammarkdownLib.distNodesMod.SourceFile] = js.native
  var rootNames: js.Any = js.native
  var setSourceFileNoResolve: js.Any = js.native
  val sourceFiles: js.Array[grammarkdownLib.distNodesMod.SourceFile] = js.native
  var writeFileFallback: js.Any = js.native
  var writeFileSyncFallback: js.Any = js.native
  def bind(): js.Promise[scala.Unit] = js.native
  def bind(cancellationToken: prexLib.prexMod.CancellationToken): js.Promise[scala.Unit] = js.native
  def bindSync(): scala.Unit = js.native
  def bindSync(cancellationToken: prexLib.prexMod.CancellationToken): scala.Unit = js.native
  def check(): js.Promise[scala.Unit] = js.native
  def check(sourceFile: grammarkdownLib.distNodesMod.SourceFile): js.Promise[scala.Unit] = js.native
  def check(
    sourceFile: grammarkdownLib.distNodesMod.SourceFile,
    cancellationToken: prexLib.prexMod.CancellationToken
  ): js.Promise[scala.Unit] = js.native
  def checkSync(): scala.Unit = js.native
  def checkSync(sourceFile: grammarkdownLib.distNodesMod.SourceFile): scala.Unit = js.native
  def checkSync(
    sourceFile: grammarkdownLib.distNodesMod.SourceFile,
    cancellationToken: prexLib.prexMod.CancellationToken
  ): scala.Unit = js.native
  /* protected */ def createBinder(options: grammarkdownLib.distOptionsMod.CompilerOptions): grammarkdownLib.distBinderMod.Binder = js.native
  /* protected */ def createChecker(options: grammarkdownLib.distOptionsMod.CompilerOptions): grammarkdownLib.distCheckerMod.Checker = js.native
  /* protected */ def createEmitter(options: grammarkdownLib.distOptionsMod.CompilerOptions): grammarkdownLib.distEmitterMod.Emitter = js.native
  /* protected */ def createResolver(bindings: grammarkdownLib.distBinderMod.BindingTable): grammarkdownLib.distCheckerMod.Resolver = js.native
  def emit(): js.Promise[scala.Unit] = js.native
  def emit(sourceFile: grammarkdownLib.distNodesMod.SourceFile): js.Promise[scala.Unit] = js.native
  def emit(
    sourceFile: grammarkdownLib.distNodesMod.SourceFile,
    writeFile: js.Function2[
      /* file */ java.lang.String, 
      /* output */ java.lang.String, 
      scala.Unit | js.Promise[scala.Unit]
    ]
  ): js.Promise[scala.Unit] = js.native
  def emit(
    sourceFile: grammarkdownLib.distNodesMod.SourceFile,
    writeFile: js.Function2[
      /* file */ java.lang.String, 
      /* output */ java.lang.String, 
      scala.Unit | js.Promise[scala.Unit]
    ],
    cancellationToken: prexLib.prexMod.CancellationToken
  ): js.Promise[scala.Unit] = js.native
  def emitString(sourceFile: grammarkdownLib.distNodesMod.SourceFile): js.Promise[java.lang.String] = js.native
  def emitString(
    sourceFile: grammarkdownLib.distNodesMod.SourceFile,
    cancellationToken: prexLib.prexMod.CancellationToken
  ): js.Promise[java.lang.String] = js.native
  def emitStringSync(sourceFile: grammarkdownLib.distNodesMod.SourceFile): java.lang.String = js.native
  def emitStringSync(
    sourceFile: grammarkdownLib.distNodesMod.SourceFile,
    cancellationToken: prexLib.prexMod.CancellationToken
  ): java.lang.String = js.native
  def emitSync(): scala.Unit = js.native
  def emitSync(sourceFile: grammarkdownLib.distNodesMod.SourceFile): scala.Unit = js.native
  def emitSync(
    sourceFile: grammarkdownLib.distNodesMod.SourceFile,
    writeFile: js.Function2[/* file */ java.lang.String, /* output */ java.lang.String, scala.Unit]
  ): scala.Unit = js.native
  def emitSync(
    sourceFile: grammarkdownLib.distNodesMod.SourceFile,
    writeFile: js.Function2[/* file */ java.lang.String, /* output */ java.lang.String, scala.Unit],
    cancellationToken: prexLib.prexMod.CancellationToken
  ): scala.Unit = js.native
  def getSourceFile(file: java.lang.String): js.UndefOr[grammarkdownLib.distNodesMod.SourceFile] = js.native
  def parse(): js.Promise[scala.Unit] = js.native
  def parse(cancellationToken: prexLib.prexMod.CancellationToken): js.Promise[scala.Unit] = js.native
  def parseSync(): scala.Unit = js.native
  def parseSync(cancellationToken: prexLib.prexMod.CancellationToken): scala.Unit = js.native
  /* protected */ def readFile(file: java.lang.String): js.UndefOr[js.Promise[js.UndefOr[java.lang.String]] | java.lang.String] = js.native
  /* protected */ def readFile(file: java.lang.String, cancellationToken: prexLib.prexMod.CancellationToken): js.UndefOr[js.Promise[js.UndefOr[java.lang.String]] | java.lang.String] = js.native
  /* protected */ def readFileSync(file: java.lang.String): js.UndefOr[js.Promise[js.UndefOr[java.lang.String]] | java.lang.String] = js.native
  /* protected */ def writeFile(file: java.lang.String, content: java.lang.String): scala.Unit | js.Promise[scala.Unit] = js.native
  /* protected */ def writeFile(
    file: java.lang.String,
    content: java.lang.String,
    cancellationToken: prexLib.prexMod.CancellationToken
  ): scala.Unit | js.Promise[scala.Unit] = js.native
  /* protected */ def writeFileSync(file: java.lang.String, content: java.lang.String): scala.Unit = js.native
}

@JSImport("grammarkdown/dist/grammar", "Grammar")
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

