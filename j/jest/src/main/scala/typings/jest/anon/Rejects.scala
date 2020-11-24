package typings.jest.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Rejects[TPromise /* <: js.Object */] extends js.Object {
  
  /**
    * Unwraps the reason of a rejected promise so any other matcher can be chained.
    * If the promise is fulfilled the assertion fails.
    */
  var rejects: typings.jest.mod.jest.AndNot[TPromise] = js.native
  
  /**
    * Use resolves to unwrap the value of a fulfilled promise so any other
    * matcher can be chained. If the promise is rejected the assertion fails.
    */
  var resolves: typings.jest.mod.jest.AndNot[TPromise] = js.native
}
object Rejects {
  
  @scala.inline
  def apply[TPromise /* <: js.Object */](rejects: typings.jest.mod.jest.AndNot[TPromise], resolves: typings.jest.mod.jest.AndNot[TPromise]): Rejects[TPromise] = {
    val __obj = js.Dynamic.literal(rejects = rejects.asInstanceOf[js.Any], resolves = resolves.asInstanceOf[js.Any])
    __obj.asInstanceOf[Rejects[TPromise]]
  }
  
  @scala.inline
  implicit class RejectsOps[Self <: Rejects[_], TPromise /* <: js.Object */] (val x: Self with Rejects[TPromise]) extends AnyVal {
    
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
    def setRejects(value: typings.jest.mod.jest.AndNot[TPromise]): Self = this.set("rejects", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResolves(value: typings.jest.mod.jest.AndNot[TPromise]): Self = this.set("resolves", value.asInstanceOf[js.Any])
  }
}
