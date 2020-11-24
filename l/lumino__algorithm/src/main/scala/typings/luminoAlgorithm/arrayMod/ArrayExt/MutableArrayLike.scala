package typings.luminoAlgorithm.arrayMod.ArrayExt

import org.scalablytyped.runtime.NumberDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * An array-like object which supports item assignment.
  */
@js.native
trait MutableArrayLike[T] extends /* index */ NumberDictionary[T] {
  
  val length: Double = js.native
}
object MutableArrayLike {
  
  @scala.inline
  def apply[T](length: Double): MutableArrayLike[T] = {
    val __obj = js.Dynamic.literal(length = length.asInstanceOf[js.Any])
    __obj.asInstanceOf[MutableArrayLike[T]]
  }
  
  @scala.inline
  implicit class MutableArrayLikeOps[Self <: MutableArrayLike[_], T] (val x: Self with MutableArrayLike[T]) extends AnyVal {
    
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
    def setLength(value: Double): Self = this.set("length", value.asInstanceOf[js.Any])
  }
}
