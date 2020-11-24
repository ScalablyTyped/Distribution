package typings.ipfsHttpServer.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Typeofvalidate9 extends js.Object {
  
  val options_19: Typeofoptions19 = js.native
  
  val query_9: js.Any = js.native
}
object Typeofvalidate9 {
  
  @scala.inline
  def apply(options_19: Typeofoptions19, query_9: js.Any): Typeofvalidate9 = {
    val __obj = js.Dynamic.literal(options_19 = options_19.asInstanceOf[js.Any], query_9 = query_9.asInstanceOf[js.Any])
    __obj.asInstanceOf[Typeofvalidate9]
  }
  
  @scala.inline
  implicit class Typeofvalidate9Ops[Self <: Typeofvalidate9] (val x: Self) extends AnyVal {
    
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
    def setOptions_19(value: Typeofoptions19): Self = this.set("options_19", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setQuery_9(value: js.Any): Self = this.set("query_9", value.asInstanceOf[js.Any])
  }
}
