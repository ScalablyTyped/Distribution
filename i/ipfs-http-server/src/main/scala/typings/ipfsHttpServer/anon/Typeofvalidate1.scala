package typings.ipfsHttpServer.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Typeofvalidate1 extends js.Object {
  
  val options_3: Typeofoptions3 = js.native
  
  val query_1: js.Any = js.native
}
object Typeofvalidate1 {
  
  @scala.inline
  def apply(options_3: Typeofoptions3, query_1: js.Any): Typeofvalidate1 = {
    val __obj = js.Dynamic.literal(options_3 = options_3.asInstanceOf[js.Any], query_1 = query_1.asInstanceOf[js.Any])
    __obj.asInstanceOf[Typeofvalidate1]
  }
  
  @scala.inline
  implicit class Typeofvalidate1Ops[Self <: Typeofvalidate1] (val x: Self) extends AnyVal {
    
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
    def setOptions_3(value: Typeofoptions3): Self = this.set("options_3", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setQuery_1(value: js.Any): Self = this.set("query_1", value.asInstanceOf[js.Any])
  }
}
