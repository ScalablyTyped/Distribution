package typings.jupyterlabCompleter.handlerMod.CompletionHandler

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A reply to a completion items fetch request.
  */
@js.native
trait ICompletionItemsReply extends js.Object {
  
  /**
    * The end index for the substring being replaced by completion.
    */
  var end: Double = js.native
  
  /**
    * A list of completion items.
    */
  var items: ICompletionItems = js.native
  
  /**
    * The starting index for the substring being replaced by completion.
    */
  var start: Double = js.native
}
object ICompletionItemsReply {
  
  @scala.inline
  def apply(end: Double, items: ICompletionItems, start: Double): ICompletionItemsReply = {
    val __obj = js.Dynamic.literal(end = end.asInstanceOf[js.Any], items = items.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any])
    __obj.asInstanceOf[ICompletionItemsReply]
  }
  
  @scala.inline
  implicit class ICompletionItemsReplyOps[Self <: ICompletionItemsReply] (val x: Self) extends AnyVal {
    
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
    def setEnd(value: Double): Self = this.set("end", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setItemsVarargs(value: ICompletionItem*): Self = this.set("items", js.Array(value :_*))
    
    @scala.inline
    def setItems(value: ICompletionItems): Self = this.set("items", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStart(value: Double): Self = this.set("start", value.asInstanceOf[js.Any])
  }
}
