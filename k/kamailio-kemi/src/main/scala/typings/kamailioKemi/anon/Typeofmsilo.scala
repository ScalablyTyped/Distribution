package typings.kamailioKemi.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Typeofmsilo extends js.Object {
  
  def mdump(): Double = js.native
  
  def mdump_uri(owner_s: String): Double = js.native
  
  def mstore(): Double = js.native
  
  def mstore_uri(owner_s: String): Double = js.native
}
object Typeofmsilo {
  
  @scala.inline
  def apply(
    mdump: () => Double,
    mdump_uri: String => Double,
    mstore: () => Double,
    mstore_uri: String => Double
  ): Typeofmsilo = {
    val __obj = js.Dynamic.literal(mdump = js.Any.fromFunction0(mdump), mdump_uri = js.Any.fromFunction1(mdump_uri), mstore = js.Any.fromFunction0(mstore), mstore_uri = js.Any.fromFunction1(mstore_uri))
    __obj.asInstanceOf[Typeofmsilo]
  }
  
  @scala.inline
  implicit class TypeofmsiloOps[Self <: Typeofmsilo] (val x: Self) extends AnyVal {
    
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
    def setMdump(value: () => Double): Self = this.set("mdump", js.Any.fromFunction0(value))
    
    @scala.inline
    def setMdump_uri(value: String => Double): Self = this.set("mdump_uri", js.Any.fromFunction1(value))
    
    @scala.inline
    def setMstore(value: () => Double): Self = this.set("mstore", js.Any.fromFunction0(value))
    
    @scala.inline
    def setMstore_uri(value: String => Double): Self = this.set("mstore_uri", js.Any.fromFunction1(value))
  }
}
