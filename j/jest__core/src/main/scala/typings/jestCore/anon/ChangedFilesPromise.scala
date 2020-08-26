package typings.jestCore.anon

import typings.jestCore.failedTestsCacheMod.default
import typings.jestCore.typesMod.Filter
import typings.jestTestResult.typesMod.AggregatedResult
import typings.jestWatcher.typesMod.JestHookEmitter
import typings.node.processMod.global.NodeJS.WriteStream
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ChangedFilesPromise extends js.Object {
  var changedFilesPromise: js.UndefOr[typings.jestChangedFiles.typesMod.ChangedFilesPromise] = js.native
  var contexts: js.Array[typings.jestRuntime.mod.Context] = js.native
  var failedTestsCache: js.UndefOr[default] = js.native
  var filter: js.UndefOr[Filter] = js.native
  var globalConfig: typings.jestTypes.configMod.GlobalConfig = js.native
  var jestHooks: js.UndefOr[JestHookEmitter] = js.native
  var outputStream: WriteStream = js.native
  var testWatcher: typings.jestCore.testWatcherMod.default = js.native
  def onComplete(testResults: AggregatedResult): Unit = js.native
  def startRun(globalConfig: typings.jestTypes.configMod.GlobalConfig): Unit = js.native
}

object ChangedFilesPromise {
  @scala.inline
  def apply(
    contexts: js.Array[typings.jestRuntime.mod.Context],
    globalConfig: typings.jestTypes.configMod.GlobalConfig,
    onComplete: AggregatedResult => Unit,
    outputStream: WriteStream,
    startRun: typings.jestTypes.configMod.GlobalConfig => Unit,
    testWatcher: typings.jestCore.testWatcherMod.default
  ): ChangedFilesPromise = {
    val __obj = js.Dynamic.literal(contexts = contexts.asInstanceOf[js.Any], globalConfig = globalConfig.asInstanceOf[js.Any], onComplete = js.Any.fromFunction1(onComplete), outputStream = outputStream.asInstanceOf[js.Any], startRun = js.Any.fromFunction1(startRun), testWatcher = testWatcher.asInstanceOf[js.Any])
    __obj.asInstanceOf[ChangedFilesPromise]
  }
  @scala.inline
  implicit class ChangedFilesPromiseOps[Self <: ChangedFilesPromise] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setContextsVarargs(value: typings.jestRuntime.mod.Context*): Self = this.set("contexts", js.Array(value :_*))
    @scala.inline
    def setContexts(value: js.Array[typings.jestRuntime.mod.Context]): Self = this.set("contexts", value.asInstanceOf[js.Any])
    @scala.inline
    def setGlobalConfig(value: typings.jestTypes.configMod.GlobalConfig): Self = this.set("globalConfig", value.asInstanceOf[js.Any])
    @scala.inline
    def setOnComplete(value: AggregatedResult => Unit): Self = this.set("onComplete", js.Any.fromFunction1(value))
    @scala.inline
    def setOutputStream(value: WriteStream): Self = this.set("outputStream", value.asInstanceOf[js.Any])
    @scala.inline
    def setStartRun(value: typings.jestTypes.configMod.GlobalConfig => Unit): Self = this.set("startRun", js.Any.fromFunction1(value))
    @scala.inline
    def setTestWatcher(value: typings.jestCore.testWatcherMod.default): Self = this.set("testWatcher", value.asInstanceOf[js.Any])
    @scala.inline
    def setChangedFilesPromise(value: typings.jestChangedFiles.typesMod.ChangedFilesPromise): Self = this.set("changedFilesPromise", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteChangedFilesPromise: Self = this.set("changedFilesPromise", js.undefined)
    @scala.inline
    def setFailedTestsCache(value: default): Self = this.set("failedTestsCache", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFailedTestsCache: Self = this.set("failedTestsCache", js.undefined)
    @scala.inline
    def setFilter(value: /* testPaths */ js.Array[String] => js.Promise[Filtered]): Self = this.set("filter", js.Any.fromFunction1(value))
    @scala.inline
    def deleteFilter: Self = this.set("filter", js.undefined)
    @scala.inline
    def setJestHooks(value: JestHookEmitter): Self = this.set("jestHooks", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteJestHooks: Self = this.set("jestHooks", js.undefined)
  }
  
}

