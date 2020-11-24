package typings.jestTypes.circusMod

import typings.std.RegExp
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait State extends js.Object {
  
  var currentDescribeBlock: DescribeBlock = js.native
  
  var currentlyRunningTest: js.UndefOr[TestEntry | Null] = js.native
  
  var expand: js.UndefOr[Boolean] = js.native
  
  var hasFocusedTests: Boolean = js.native
  
  var hasStarted: Boolean = js.native
  
  var includeTestLocationInResult: Boolean = js.native
  
  var originalGlobalErrorHandlers: js.UndefOr[GlobalErrorHandlers] = js.native
  
  var parentProcess: Process | Null = js.native
  
  var rootDescribeBlock: DescribeBlock = js.native
  
  var testNamePattern: js.UndefOr[RegExp | Null] = js.native
  
  var testTimeout: Double = js.native
  
  var unhandledErrors: js.Array[Exception] = js.native
}
object State {
  
  @scala.inline
  def apply(
    currentDescribeBlock: DescribeBlock,
    hasFocusedTests: Boolean,
    hasStarted: Boolean,
    includeTestLocationInResult: Boolean,
    rootDescribeBlock: DescribeBlock,
    testTimeout: Double,
    unhandledErrors: js.Array[Exception]
  ): State = {
    val __obj = js.Dynamic.literal(currentDescribeBlock = currentDescribeBlock.asInstanceOf[js.Any], hasFocusedTests = hasFocusedTests.asInstanceOf[js.Any], hasStarted = hasStarted.asInstanceOf[js.Any], includeTestLocationInResult = includeTestLocationInResult.asInstanceOf[js.Any], rootDescribeBlock = rootDescribeBlock.asInstanceOf[js.Any], testTimeout = testTimeout.asInstanceOf[js.Any], unhandledErrors = unhandledErrors.asInstanceOf[js.Any])
    __obj.asInstanceOf[State]
  }
  
  @scala.inline
  implicit class StateOps[Self <: State] (val x: Self) extends AnyVal {
    
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
    def setCurrentDescribeBlock(value: DescribeBlock): Self = this.set("currentDescribeBlock", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHasFocusedTests(value: Boolean): Self = this.set("hasFocusedTests", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHasStarted(value: Boolean): Self = this.set("hasStarted", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIncludeTestLocationInResult(value: Boolean): Self = this.set("includeTestLocationInResult", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRootDescribeBlock(value: DescribeBlock): Self = this.set("rootDescribeBlock", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTestTimeout(value: Double): Self = this.set("testTimeout", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUnhandledErrorsVarargs(value: Exception*): Self = this.set("unhandledErrors", js.Array(value :_*))
    
    @scala.inline
    def setUnhandledErrors(value: js.Array[Exception]): Self = this.set("unhandledErrors", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCurrentlyRunningTest(value: TestEntry): Self = this.set("currentlyRunningTest", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCurrentlyRunningTest: Self = this.set("currentlyRunningTest", js.undefined)
    
    @scala.inline
    def setCurrentlyRunningTestNull: Self = this.set("currentlyRunningTest", null)
    
    @scala.inline
    def setExpand(value: Boolean): Self = this.set("expand", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteExpand: Self = this.set("expand", js.undefined)
    
    @scala.inline
    def setOriginalGlobalErrorHandlers(value: GlobalErrorHandlers): Self = this.set("originalGlobalErrorHandlers", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOriginalGlobalErrorHandlers: Self = this.set("originalGlobalErrorHandlers", js.undefined)
    
    @scala.inline
    def setParentProcess(value: Process): Self = this.set("parentProcess", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParentProcessNull: Self = this.set("parentProcess", null)
    
    @scala.inline
    def setTestNamePattern(value: RegExp): Self = this.set("testNamePattern", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTestNamePattern: Self = this.set("testNamePattern", js.undefined)
    
    @scala.inline
    def setTestNamePatternNull: Self = this.set("testNamePattern", null)
  }
}
