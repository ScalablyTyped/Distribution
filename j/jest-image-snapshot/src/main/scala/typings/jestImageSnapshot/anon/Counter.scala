package typings.jestImageSnapshot.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Counter extends js.Object {
  
  var counter: Double = js.native
  
  var currentTestName: String = js.native
  
  var defaultIdentifier: String = js.native
  
  var testPath: String = js.native
}
object Counter {
  
  @scala.inline
  def apply(counter: Double, currentTestName: String, defaultIdentifier: String, testPath: String): Counter = {
    val __obj = js.Dynamic.literal(counter = counter.asInstanceOf[js.Any], currentTestName = currentTestName.asInstanceOf[js.Any], defaultIdentifier = defaultIdentifier.asInstanceOf[js.Any], testPath = testPath.asInstanceOf[js.Any])
    __obj.asInstanceOf[Counter]
  }
  
  @scala.inline
  implicit class CounterOps[Self <: Counter] (val x: Self) extends AnyVal {
    
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
    def setCounter(value: Double): Self = this.set("counter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCurrentTestName(value: String): Self = this.set("currentTestName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDefaultIdentifier(value: String): Self = this.set("defaultIdentifier", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTestPath(value: String): Self = this.set("testPath", value.asInstanceOf[js.Any])
  }
}
