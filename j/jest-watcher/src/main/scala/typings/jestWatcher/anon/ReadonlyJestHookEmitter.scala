package typings.jestWatcher.anon

import typings.jestTestResult.typesMod.AggregatedResult
import typings.jestWatcher.typesMod.JestHookExposedFS
import typings.jestWatcher.typesMod.TestSuiteInfo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Readonly<jest-watcher.jest-watcher/build/types.JestHookEmitter> */
@js.native
trait ReadonlyJestHookEmitter extends js.Object {
  
  def onFileChange(fs: JestHookExposedFS): Unit = js.native
  
  def onTestRunComplete(results: AggregatedResult): Unit = js.native
  
  def shouldRunTestSuite(testSuiteInfo: TestSuiteInfo): js.Promise[Boolean] | Boolean = js.native
}
object ReadonlyJestHookEmitter {
  
  @scala.inline
  def apply(
    onFileChange: JestHookExposedFS => Unit,
    onTestRunComplete: AggregatedResult => Unit,
    shouldRunTestSuite: TestSuiteInfo => js.Promise[Boolean] | Boolean
  ): ReadonlyJestHookEmitter = {
    val __obj = js.Dynamic.literal(onFileChange = js.Any.fromFunction1(onFileChange), onTestRunComplete = js.Any.fromFunction1(onTestRunComplete), shouldRunTestSuite = js.Any.fromFunction1(shouldRunTestSuite))
    __obj.asInstanceOf[ReadonlyJestHookEmitter]
  }
  
  @scala.inline
  implicit class ReadonlyJestHookEmitterOps[Self <: ReadonlyJestHookEmitter] (val x: Self) extends AnyVal {
    
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
    def setOnFileChange(value: JestHookExposedFS => Unit): Self = this.set("onFileChange", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnTestRunComplete(value: AggregatedResult => Unit): Self = this.set("onTestRunComplete", js.Any.fromFunction1(value))
    
    @scala.inline
    def setShouldRunTestSuite(value: TestSuiteInfo => js.Promise[Boolean] | Boolean): Self = this.set("shouldRunTestSuite", js.Any.fromFunction1(value))
  }
}
