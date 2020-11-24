package typings.kamailioKemi.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Typeofmqueue extends js.Object {
  
  def mq_add(mq: String, key: String, `val`: String): Double = js.native
  
  def mq_fetch(mq: String): Double = js.native
  
  def mq_pv_free(mq: String): Double = js.native
  
  def mq_size(mq: String): Double = js.native
}
object Typeofmqueue {
  
  @scala.inline
  def apply(
    mq_add: (String, String, String) => Double,
    mq_fetch: String => Double,
    mq_pv_free: String => Double,
    mq_size: String => Double
  ): Typeofmqueue = {
    val __obj = js.Dynamic.literal(mq_add = js.Any.fromFunction3(mq_add), mq_fetch = js.Any.fromFunction1(mq_fetch), mq_pv_free = js.Any.fromFunction1(mq_pv_free), mq_size = js.Any.fromFunction1(mq_size))
    __obj.asInstanceOf[Typeofmqueue]
  }
  
  @scala.inline
  implicit class TypeofmqueueOps[Self <: Typeofmqueue] (val x: Self) extends AnyVal {
    
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
    def setMq_add(value: (String, String, String) => Double): Self = this.set("mq_add", js.Any.fromFunction3(value))
    
    @scala.inline
    def setMq_fetch(value: String => Double): Self = this.set("mq_fetch", js.Any.fromFunction1(value))
    
    @scala.inline
    def setMq_pv_free(value: String => Double): Self = this.set("mq_pv_free", js.Any.fromFunction1(value))
    
    @scala.inline
    def setMq_size(value: String => Double): Self = this.set("mq_size", js.Any.fromFunction1(value))
  }
}
