package typings.ipfsHttpServer.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Typeofvalidate4 extends js.Object {
  
  val options_9: Typeofoptions9 = js.native
  
  val query_4: js.Any = js.native
}
object Typeofvalidate4 {
  
  @scala.inline
  def apply(options_9: Typeofoptions9, query_4: js.Any): Typeofvalidate4 = {
    val __obj = js.Dynamic.literal(options_9 = options_9.asInstanceOf[js.Any], query_4 = query_4.asInstanceOf[js.Any])
    __obj.asInstanceOf[Typeofvalidate4]
  }
  
  @scala.inline
  implicit class Typeofvalidate4Ops[Self <: Typeofvalidate4] (val x: Self) extends AnyVal {
    
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
    def setOptions_9(value: Typeofoptions9): Self = this.set("options_9", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setQuery_4(value: js.Any): Self = this.set("query_4", value.asInstanceOf[js.Any])
  }
}
