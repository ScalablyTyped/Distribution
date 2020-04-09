package typings.jestCore

import typings.jestChangedFiles.typesMod.ChangedFilesPromise
import typings.jestCore.failedTestsCacheMod.default
import typings.jestCore.typesMod.Filter
import typings.jestRuntime.mod.Context
import typings.jestTestResult.typesMod.AggregatedResult
import typings.jestTypes.configMod.GlobalConfig
import typings.jestWatcher.typesMod.JestHookEmitter
import typings.node.processMod._Global_.NodeJS.WriteStream
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonChangedFilesPromise extends js.Object {
  var changedFilesPromise: js.UndefOr[ChangedFilesPromise] = js.undefined
  var contexts: js.Array[Context]
  var failedTestsCache: js.UndefOr[default] = js.undefined
  var filter: js.UndefOr[Filter] = js.undefined
  var globalConfig: GlobalConfig
  var jestHooks: js.UndefOr[JestHookEmitter] = js.undefined
  var outputStream: WriteStream
  var testWatcher: typings.jestCore.testWatcherMod.default
  def onComplete(testResults: AggregatedResult): Unit
  def startRun(globalConfig: GlobalConfig): Unit
}

object AnonChangedFilesPromise {
  @scala.inline
  def apply(
    contexts: js.Array[Context],
    globalConfig: GlobalConfig,
    onComplete: AggregatedResult => Unit,
    outputStream: WriteStream,
    startRun: GlobalConfig => Unit,
    testWatcher: typings.jestCore.testWatcherMod.default,
    changedFilesPromise: ChangedFilesPromise = null,
    failedTestsCache: default = null,
    filter: /* testPaths */ js.Array[String] => js.Promise[AnonFiltered] = null,
    jestHooks: JestHookEmitter = null
  ): AnonChangedFilesPromise = {
    val __obj = js.Dynamic.literal(contexts = contexts.asInstanceOf[js.Any], globalConfig = globalConfig.asInstanceOf[js.Any], onComplete = js.Any.fromFunction1(onComplete), outputStream = outputStream.asInstanceOf[js.Any], startRun = js.Any.fromFunction1(startRun), testWatcher = testWatcher.asInstanceOf[js.Any])
    if (changedFilesPromise != null) __obj.updateDynamic("changedFilesPromise")(changedFilesPromise.asInstanceOf[js.Any])
    if (failedTestsCache != null) __obj.updateDynamic("failedTestsCache")(failedTestsCache.asInstanceOf[js.Any])
    if (filter != null) __obj.updateDynamic("filter")(js.Any.fromFunction1(filter))
    if (jestHooks != null) __obj.updateDynamic("jestHooks")(jestHooks.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonChangedFilesPromise]
  }
}

