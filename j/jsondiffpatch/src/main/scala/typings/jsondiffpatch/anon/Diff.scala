package typings.jsondiffpatch.anon

import typings.jsondiffpatch.mod.DiffContext
import typings.jsondiffpatch.mod.PatchContext
import typings.jsondiffpatch.mod.Pipe
import typings.jsondiffpatch.mod.ReverseContext
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Diff extends js.Object {
  
  var diff: Pipe[DiffContext] = js.native
  
  var patch: Pipe[PatchContext] = js.native
  
  var reverse: Pipe[ReverseContext] = js.native
}
object Diff {
  
  @scala.inline
  def apply(diff: Pipe[DiffContext], patch: Pipe[PatchContext], reverse: Pipe[ReverseContext]): Diff = {
    val __obj = js.Dynamic.literal(diff = diff.asInstanceOf[js.Any], patch = patch.asInstanceOf[js.Any], reverse = reverse.asInstanceOf[js.Any])
    __obj.asInstanceOf[Diff]
  }
  
  @scala.inline
  implicit class DiffOps[Self <: Diff] (val x: Self) extends AnyVal {
    
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
    def setDiff(value: Pipe[DiffContext]): Self = this.set("diff", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPatch(value: Pipe[PatchContext]): Self = this.set("patch", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReverse(value: Pipe[ReverseContext]): Self = this.set("reverse", value.asInstanceOf[js.Any])
  }
}
