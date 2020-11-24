package typings.jqueryAppear.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Options[T] extends js.Object {
  
  /**
    * X accuracy
    */
  var accX: js.UndefOr[Double] = js.native
  
  /**
    * Y accuracy
    */
  var accY: js.UndefOr[Double] = js.native
  
  /**
    * Data to pass into callback
    */
  var data: js.UndefOr[T] = js.native
  
  /**
    * Callback is called only in first appear
    */
  var one: js.UndefOr[Boolean] = js.native
}
object Options {
  
  @scala.inline
  def apply[T](): Options[T] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Options[T]]
  }
  
  @scala.inline
  implicit class OptionsOps[Self <: Options[_], T] (val x: Self with Options[T]) extends AnyVal {
    
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
    def setAccX(value: Double): Self = this.set("accX", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAccX: Self = this.set("accX", js.undefined)
    
    @scala.inline
    def setAccY(value: Double): Self = this.set("accY", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAccY: Self = this.set("accY", js.undefined)
    
    @scala.inline
    def setData(value: T): Self = this.set("data", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteData: Self = this.set("data", js.undefined)
    
    @scala.inline
    def setOne(value: Boolean): Self = this.set("one", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOne: Self = this.set("one", js.undefined)
  }
}
