package typings.immer.mod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ImmerState[T] extends js.Object {
  
  var assigned: StringDictionary[Boolean] = js.native
  
  var base: T = js.native
  
  var copy: T = js.native
  
  var parent: js.UndefOr[ImmerState[_]] = js.native
}
object ImmerState {
  
  @scala.inline
  def apply[T](assigned: StringDictionary[Boolean], base: T, copy: T): ImmerState[T] = {
    val __obj = js.Dynamic.literal(assigned = assigned.asInstanceOf[js.Any], base = base.asInstanceOf[js.Any], copy = copy.asInstanceOf[js.Any])
    __obj.asInstanceOf[ImmerState[T]]
  }
  
  @scala.inline
  implicit class ImmerStateOps[Self <: ImmerState[_], T] (val x: Self with ImmerState[T]) extends AnyVal {
    
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
    def setAssigned(value: StringDictionary[Boolean]): Self = this.set("assigned", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBase(value: T): Self = this.set("base", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCopy(value: T): Self = this.set("copy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParent(value: ImmerState[_]): Self = this.set("parent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteParent: Self = this.set("parent", js.undefined)
  }
}
