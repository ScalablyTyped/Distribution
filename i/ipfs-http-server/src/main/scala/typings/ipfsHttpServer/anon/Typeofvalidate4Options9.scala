package typings.ipfsHttpServer.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Typeofvalidate4Options9 extends js.Object {
  
  val options_9: js.Any = js.native
}
object Typeofvalidate4Options9 {
  
  @scala.inline
  def apply(options_9: js.Any): Typeofvalidate4Options9 = {
    val __obj = js.Dynamic.literal(options_9 = options_9.asInstanceOf[js.Any])
    __obj.asInstanceOf[Typeofvalidate4Options9]
  }
  
  @scala.inline
  implicit class Typeofvalidate4Options9Ops[Self <: Typeofvalidate4Options9] (val x: Self) extends AnyVal {
    
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
    def setOptions_9(value: js.Any): Self = this.set("options_9", value.asInstanceOf[js.Any])
  }
}
