package typings.ipfsHttpServer.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Typeofvalidate3 extends js.Object {
  
  val options_7: Typeofoptions7 = js.native
  
  val query_3: js.Any = js.native
}
object Typeofvalidate3 {
  
  @scala.inline
  def apply(options_7: Typeofoptions7, query_3: js.Any): Typeofvalidate3 = {
    val __obj = js.Dynamic.literal(options_7 = options_7.asInstanceOf[js.Any], query_3 = query_3.asInstanceOf[js.Any])
    __obj.asInstanceOf[Typeofvalidate3]
  }
  
  @scala.inline
  implicit class Typeofvalidate3Ops[Self <: Typeofvalidate3] (val x: Self) extends AnyVal {
    
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
    def setOptions_7(value: Typeofoptions7): Self = this.set("options_7", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setQuery_3(value: js.Any): Self = this.set("query_3", value.asInstanceOf[js.Any])
  }
}
