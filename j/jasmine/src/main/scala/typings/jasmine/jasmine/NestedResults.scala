package typings.jasmine.jasmine

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait NestedResults extends Result {
  
  def addResult(result: Result): Unit = js.native
  
  var description: String = js.native
  
  var failedCount: Double = js.native
  
  def getItems(): js.Array[Result] = js.native
  
  def log(values: js.Any): Unit = js.native
  
  def passed(): Boolean = js.native
  
  var passedCount: Double = js.native
  
  def rollupCounts(result: NestedResults): Unit = js.native
  
  var skipped: Boolean = js.native
  
  var totalCount: Double = js.native
}
object NestedResults {
  
  @scala.inline
  def apply(
    addResult: Result => Unit,
    description: String,
    failedCount: Double,
    getItems: () => js.Array[Result],
    log: js.Any => Unit,
    passed: () => Boolean,
    passedCount: Double,
    rollupCounts: NestedResults => Unit,
    skipped: Boolean,
    totalCount: Double,
    `type`: String
  ): NestedResults = {
    val __obj = js.Dynamic.literal(addResult = js.Any.fromFunction1(addResult), description = description.asInstanceOf[js.Any], failedCount = failedCount.asInstanceOf[js.Any], getItems = js.Any.fromFunction0(getItems), log = js.Any.fromFunction1(log), passed = js.Any.fromFunction0(passed), passedCount = passedCount.asInstanceOf[js.Any], rollupCounts = js.Any.fromFunction1(rollupCounts), skipped = skipped.asInstanceOf[js.Any], totalCount = totalCount.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[NestedResults]
  }
  
  @scala.inline
  implicit class NestedResultsOps[Self <: NestedResults] (val x: Self) extends AnyVal {
    
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
    def setAddResult(value: Result => Unit): Self = this.set("addResult", js.Any.fromFunction1(value))
    
    @scala.inline
    def setDescription(value: String): Self = this.set("description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFailedCount(value: Double): Self = this.set("failedCount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGetItems(value: () => js.Array[Result]): Self = this.set("getItems", js.Any.fromFunction0(value))
    
    @scala.inline
    def setLog(value: js.Any => Unit): Self = this.set("log", js.Any.fromFunction1(value))
    
    @scala.inline
    def setPassed(value: () => Boolean): Self = this.set("passed", js.Any.fromFunction0(value))
    
    @scala.inline
    def setPassedCount(value: Double): Self = this.set("passedCount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRollupCounts(value: NestedResults => Unit): Self = this.set("rollupCounts", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSkipped(value: Boolean): Self = this.set("skipped", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTotalCount(value: Double): Self = this.set("totalCount", value.asInstanceOf[js.Any])
  }
}
