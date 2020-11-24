package typings.maximMazurokGapiClientChat.gapi.client.chat

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Card extends js.Object {
  
  /** The actions of this card. */
  var cardActions: js.UndefOr[js.Array[CardAction]] = js.native
  
  /** The header of the card. A header usually contains a title and an image. */
  var header: js.UndefOr[CardHeader] = js.native
  
  /** Name of the card. */
  var name: js.UndefOr[String] = js.native
  
  /** Sections are separated by a line divider. */
  var sections: js.UndefOr[js.Array[Section]] = js.native
}
object Card {
  
  @scala.inline
  def apply(): Card = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Card]
  }
  
  @scala.inline
  implicit class CardOps[Self <: Card] (val x: Self) extends AnyVal {
    
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
    def setCardActionsVarargs(value: CardAction*): Self = this.set("cardActions", js.Array(value :_*))
    
    @scala.inline
    def setCardActions(value: js.Array[CardAction]): Self = this.set("cardActions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCardActions: Self = this.set("cardActions", js.undefined)
    
    @scala.inline
    def setHeader(value: CardHeader): Self = this.set("header", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHeader: Self = this.set("header", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
    
    @scala.inline
    def setSectionsVarargs(value: Section*): Self = this.set("sections", js.Array(value :_*))
    
    @scala.inline
    def setSections(value: js.Array[Section]): Self = this.set("sections", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSections: Self = this.set("sections", js.undefined)
  }
}
