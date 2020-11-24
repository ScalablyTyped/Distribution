package typings.jestSpecificSnapshot.mod.global.jest

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Matchers[R, T] extends js.Object {
  
  def toMatchSpecificSnapshot(snapshotFilename: String): R = js.native
}
object Matchers {
  
  @scala.inline
  def apply[R, T](toMatchSpecificSnapshot: String => R): Matchers[R, T] = {
    val __obj = js.Dynamic.literal(toMatchSpecificSnapshot = js.Any.fromFunction1(toMatchSpecificSnapshot))
    __obj.asInstanceOf[Matchers[R, T]]
  }
  
  @scala.inline
  implicit class MatchersOps[Self <: Matchers[_, _], R, T] (val x: Self with (Matchers[R, T])) extends AnyVal {
    
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
    def setToMatchSpecificSnapshot(value: String => R): Self = this.set("toMatchSpecificSnapshot", js.Any.fromFunction1(value))
  }
}
