package typings.ipfsHttpServer.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Typeofvalidate7 extends js.Object {
  
  val options_15: Typeofoptions15 = js.native
  
  val query_7: js.Any = js.native
}
object Typeofvalidate7 {
  
  @scala.inline
  def apply(options_15: Typeofoptions15, query_7: js.Any): Typeofvalidate7 = {
    val __obj = js.Dynamic.literal(options_15 = options_15.asInstanceOf[js.Any], query_7 = query_7.asInstanceOf[js.Any])
    __obj.asInstanceOf[Typeofvalidate7]
  }
  
  @scala.inline
  implicit class Typeofvalidate7Ops[Self <: Typeofvalidate7] (val x: Self) extends AnyVal {
    
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
    def setOptions_15(value: Typeofoptions15): Self = this.set("options_15", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setQuery_7(value: js.Any): Self = this.set("query_7", value.asInstanceOf[js.Any])
  }
}
