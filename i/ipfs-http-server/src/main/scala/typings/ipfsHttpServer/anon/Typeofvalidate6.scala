package typings.ipfsHttpServer.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Typeofvalidate6 extends js.Object {
  
  val options_13: Typeofoptions13 = js.native
  
  val query_6: js.Any = js.native
}
object Typeofvalidate6 {
  
  @scala.inline
  def apply(options_13: Typeofoptions13, query_6: js.Any): Typeofvalidate6 = {
    val __obj = js.Dynamic.literal(options_13 = options_13.asInstanceOf[js.Any], query_6 = query_6.asInstanceOf[js.Any])
    __obj.asInstanceOf[Typeofvalidate6]
  }
  
  @scala.inline
  implicit class Typeofvalidate6Ops[Self <: Typeofvalidate6] (val x: Self) extends AnyVal {
    
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
    def setOptions_13(value: Typeofoptions13): Self = this.set("options_13", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setQuery_6(value: js.Any): Self = this.set("query_6", value.asInstanceOf[js.Any])
  }
}
