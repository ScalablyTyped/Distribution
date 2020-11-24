package typings.kamailioKemi.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Typeofsipjson extends js.Object {
  
  def sj_serialize(smode: String, pvn: String): Double = js.native
}
object Typeofsipjson {
  
  @scala.inline
  def apply(sj_serialize: (String, String) => Double): Typeofsipjson = {
    val __obj = js.Dynamic.literal(sj_serialize = js.Any.fromFunction2(sj_serialize))
    __obj.asInstanceOf[Typeofsipjson]
  }
  
  @scala.inline
  implicit class TypeofsipjsonOps[Self <: Typeofsipjson] (val x: Self) extends AnyVal {
    
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
    def setSj_serialize(value: (String, String) => Double): Self = this.set("sj_serialize", js.Any.fromFunction2(value))
  }
}
