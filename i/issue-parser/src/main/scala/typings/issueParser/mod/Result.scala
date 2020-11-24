package typings.issueParser.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Result extends js.Object {
  
  var actions: Actions = js.native
  
  var allRefs: js.Array[Reference | Action] = js.native
  
  var mentions: js.Array[Mention] = js.native
  
  var refs: js.Array[Reference] = js.native
}
object Result {
  
  @scala.inline
  def apply(
    actions: Actions,
    allRefs: js.Array[Reference | Action],
    mentions: js.Array[Mention],
    refs: js.Array[Reference]
  ): Result = {
    val __obj = js.Dynamic.literal(actions = actions.asInstanceOf[js.Any], allRefs = allRefs.asInstanceOf[js.Any], mentions = mentions.asInstanceOf[js.Any], refs = refs.asInstanceOf[js.Any])
    __obj.asInstanceOf[Result]
  }
  
  @scala.inline
  implicit class ResultOps[Self <: Result] (val x: Self) extends AnyVal {
    
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
    def setActions(value: Actions): Self = this.set("actions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAllRefsVarargs(value: (Reference | Action)*): Self = this.set("allRefs", js.Array(value :_*))
    
    @scala.inline
    def setAllRefs(value: js.Array[Reference | Action]): Self = this.set("allRefs", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMentionsVarargs(value: Mention*): Self = this.set("mentions", js.Array(value :_*))
    
    @scala.inline
    def setMentions(value: js.Array[Mention]): Self = this.set("mentions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRefsVarargs(value: Reference*): Self = this.set("refs", js.Array(value :_*))
    
    @scala.inline
    def setRefs(value: js.Array[Reference]): Self = this.set("refs", value.asInstanceOf[js.Any])
  }
}
