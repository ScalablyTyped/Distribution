package typings.jscodeshift.variableDeclaratorMod

import typings.jscodeshift.collectionMod.Collection
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TransformMethods[N] extends js.Object {
  
  /**
    * Renames a variable and all its occurrences.
    * This method only applies to VariableDeclarator typed collections.
    */
  def renameTo(newName: String): Collection[N] = js.native
}
object TransformMethods {
  
  @scala.inline
  def apply[N](renameTo: String => Collection[N]): TransformMethods[N] = {
    val __obj = js.Dynamic.literal(renameTo = js.Any.fromFunction1(renameTo))
    __obj.asInstanceOf[TransformMethods[N]]
  }
  
  @scala.inline
  implicit class TransformMethodsOps[Self <: TransformMethods[_], N] (val x: Self with TransformMethods[N]) extends AnyVal {
    
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
    def setRenameTo(value: String => Collection[N]): Self = this.set("renameTo", js.Any.fromFunction1(value))
  }
}
