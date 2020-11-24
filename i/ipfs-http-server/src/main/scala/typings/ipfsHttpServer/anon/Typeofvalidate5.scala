package typings.ipfsHttpServer.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Typeofvalidate5 extends js.Object {
  
  val options_11: Typeofoptions11 = js.native
  
  val query_5: js.Any = js.native
}
object Typeofvalidate5 {
  
  @scala.inline
  def apply(options_11: Typeofoptions11, query_5: js.Any): Typeofvalidate5 = {
    val __obj = js.Dynamic.literal(options_11 = options_11.asInstanceOf[js.Any], query_5 = query_5.asInstanceOf[js.Any])
    __obj.asInstanceOf[Typeofvalidate5]
  }
  
  @scala.inline
  implicit class Typeofvalidate5Ops[Self <: Typeofvalidate5] (val x: Self) extends AnyVal {
    
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
    def setOptions_11(value: Typeofoptions11): Self = this.set("options_11", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setQuery_5(value: js.Any): Self = this.set("query_5", value.asInstanceOf[js.Any])
  }
}
