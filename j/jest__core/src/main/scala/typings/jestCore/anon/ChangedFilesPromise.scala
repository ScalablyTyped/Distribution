package typings.jestCore.anon

import typings.jestChangedFiles.typesMod.ChangedFiles
import typings.jestCore.failedTestsCacheMod.default
import typings.jestCore.typesMod.Filter
import typings.jestTestResult.typesMod.AggregatedResult
import typings.node.NodeJS.WritableStream
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ChangedFilesPromise extends js.Object {
  var changedFilesPromise: js.UndefOr[js.Promise[ChangedFiles]] = js.undefined
  var contexts: js.Array[typings.jestRuntime.typesMod.Context]
  var failedTestsCache: js.UndefOr[default] = js.undefined
  var filter: js.UndefOr[Filter] = js.undefined
  var globalConfig: typings.jestTypes.configMod.GlobalConfig
  var jestHooks: js.UndefOr[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify JestHookEmitter */ js.Any
  ] = js.undefined
  var outputStream: WritableStream
  var testWatcher: typings.jestCore.testWatcherMod.default
  def onComplete(testResults: AggregatedResult): Unit
  def startRun(globalConfig: typings.jestTypes.configMod.GlobalConfig): Unit
}

object ChangedFilesPromise {
  @scala.inline
  def apply(
    contexts: js.Array[typings.jestRuntime.typesMod.Context],
    globalConfig: typings.jestTypes.configMod.GlobalConfig,
    onComplete: AggregatedResult => Unit,
    outputStream: WritableStream,
    startRun: typings.jestTypes.configMod.GlobalConfig => Unit,
    testWatcher: typings.jestCore.testWatcherMod.default,
    changedFilesPromise: js.Promise[ChangedFiles] = null,
    failedTestsCache: default = null,
    filter: /* testPaths */ js.Array[String] => js.Promise[Filtered] = null,
    jestHooks: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify JestHookEmitter */ js.Any = null
  ): ChangedFilesPromise = {
    val __obj = js.Dynamic.literal(contexts = contexts.asInstanceOf[js.Any], globalConfig = globalConfig.asInstanceOf[js.Any], onComplete = js.Any.fromFunction1(onComplete), outputStream = outputStream.asInstanceOf[js.Any], startRun = js.Any.fromFunction1(startRun), testWatcher = testWatcher.asInstanceOf[js.Any])
    if (changedFilesPromise != null) __obj.updateDynamic("changedFilesPromise")(changedFilesPromise.asInstanceOf[js.Any])
    if (failedTestsCache != null) __obj.updateDynamic("failedTestsCache")(failedTestsCache.asInstanceOf[js.Any])
    if (filter != null) __obj.updateDynamic("filter")(js.Any.fromFunction1(filter))
    if (jestHooks != null) __obj.updateDynamic("jestHooks")(jestHooks.asInstanceOf[js.Any])
    __obj.asInstanceOf[ChangedFilesPromise]
  }
}

