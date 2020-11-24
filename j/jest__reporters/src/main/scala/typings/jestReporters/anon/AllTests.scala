package typings.jestReporters.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AllTests extends js.Object {
  
  var allTests: Double = js.native
  
  var tests: js.Array[typings.jestReporters.typesMod.Test] = js.native
  
  var total: Double = js.native
}
object AllTests {
  
  @scala.inline
  def apply(allTests: Double, tests: js.Array[typings.jestReporters.typesMod.Test], total: Double): AllTests = {
    val __obj = js.Dynamic.literal(allTests = allTests.asInstanceOf[js.Any], tests = tests.asInstanceOf[js.Any], total = total.asInstanceOf[js.Any])
    __obj.asInstanceOf[AllTests]
  }
  
  @scala.inline
  implicit class AllTestsOps[Self <: AllTests] (val x: Self) extends AnyVal {
    
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
    def setAllTests(value: Double): Self = this.set("allTests", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTestsVarargs(value: typings.jestReporters.typesMod.Test*): Self = this.set("tests", js.Array(value :_*))
    
    @scala.inline
    def setTests(value: js.Array[typings.jestReporters.typesMod.Test]): Self = this.set("tests", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTotal(value: Double): Self = this.set("total", value.asInstanceOf[js.Any])
  }
}
