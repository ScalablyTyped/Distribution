package typings.ipfsHttpServer.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Typeofvalidate2 extends js.Object {
  
  val options_5: Typeofoptions5 = js.native
  
  val query_2: js.Any = js.native
}
object Typeofvalidate2 {
  
  @scala.inline
  def apply(options_5: Typeofoptions5, query_2: js.Any): Typeofvalidate2 = {
    val __obj = js.Dynamic.literal(options_5 = options_5.asInstanceOf[js.Any], query_2 = query_2.asInstanceOf[js.Any])
    __obj.asInstanceOf[Typeofvalidate2]
  }
  
  @scala.inline
  implicit class Typeofvalidate2Ops[Self <: Typeofvalidate2] (val x: Self) extends AnyVal {
    
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
    def setOptions_5(value: Typeofoptions5): Self = this.set("options_5", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setQuery_2(value: js.Any): Self = this.set("query_2", value.asInstanceOf[js.Any])
  }
}
