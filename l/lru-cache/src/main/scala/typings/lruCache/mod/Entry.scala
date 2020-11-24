package typings.lruCache.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Entry[K, V] extends js.Object {
  
  var e: Double = js.native
  
  var k: K = js.native
  
  var v: V = js.native
}
object Entry {
  
  @scala.inline
  def apply[K, V](e: Double, k: K, v: V): Entry[K, V] = {
    val __obj = js.Dynamic.literal(e = e.asInstanceOf[js.Any], k = k.asInstanceOf[js.Any], v = v.asInstanceOf[js.Any])
    __obj.asInstanceOf[Entry[K, V]]
  }
  
  @scala.inline
  implicit class EntryOps[Self <: Entry[_, _], K, V] (val x: Self with (Entry[K, V])) extends AnyVal {
    
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
    def setE(value: Double): Self = this.set("e", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setK(value: K): Self = this.set("k", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setV(value: V): Self = this.set("v", value.asInstanceOf[js.Any])
  }
}
