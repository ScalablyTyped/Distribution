package typings.ipfsHttpServer.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Typeofvalidate8 extends js.Object {
  
  val options_17: Typeofoptions17 = js.native
  
  val query_8: js.Any = js.native
}
object Typeofvalidate8 {
  
  @scala.inline
  def apply(options_17: Typeofoptions17, query_8: js.Any): Typeofvalidate8 = {
    val __obj = js.Dynamic.literal(options_17 = options_17.asInstanceOf[js.Any], query_8 = query_8.asInstanceOf[js.Any])
    __obj.asInstanceOf[Typeofvalidate8]
  }
  
  @scala.inline
  implicit class Typeofvalidate8Ops[Self <: Typeofvalidate8] (val x: Self) extends AnyVal {
    
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
    def setOptions_17(value: Typeofoptions17): Self = this.set("options_17", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setQuery_8(value: js.Any): Self = this.set("query_8", value.asInstanceOf[js.Any])
  }
}
