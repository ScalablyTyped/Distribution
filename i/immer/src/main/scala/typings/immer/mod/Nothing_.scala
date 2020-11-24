package typings.immer.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Use a class type for `nothing` so its type is unique */
@js.native
trait Nothing_ extends js.Object {
  
  // This lets us do `Exclude<T, Nothing>`
  @JSName("_")
  var _underscore: js.Any = js.native
}
object Nothing_ {
  
  @scala.inline
  def apply(_underscore: js.Any): Nothing_ = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("_")(_underscore.asInstanceOf[js.Any])
    __obj.asInstanceOf[Nothing_]
  }
  
  @scala.inline
  implicit class Nothing_Ops[Self <: Nothing_] (val x: Self) extends AnyVal {
    
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
    def set_underscore(value: js.Any): Self = this.set("_", value.asInstanceOf[js.Any])
  }
}
