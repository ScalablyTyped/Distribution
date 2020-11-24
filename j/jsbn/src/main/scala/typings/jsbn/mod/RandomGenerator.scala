package typings.jsbn.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RandomGenerator extends js.Object {
  
  def nextBytes(bytes: js.Array[Double]): Unit = js.native
}
object RandomGenerator {
  
  @scala.inline
  def apply(nextBytes: js.Array[Double] => Unit): RandomGenerator = {
    val __obj = js.Dynamic.literal(nextBytes = js.Any.fromFunction1(nextBytes))
    __obj.asInstanceOf[RandomGenerator]
  }
  
  @scala.inline
  implicit class RandomGeneratorOps[Self <: RandomGenerator] (val x: Self) extends AnyVal {
    
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
    def setNextBytes(value: js.Array[Double] => Unit): Self = this.set("nextBytes", js.Any.fromFunction1(value))
  }
}
