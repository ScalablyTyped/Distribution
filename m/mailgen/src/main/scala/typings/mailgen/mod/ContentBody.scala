package typings.mailgen.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ContentBody extends js.Object {
  
  var action: js.UndefOr[Action | js.Array[Action]] = js.native
  
  var dictionary: js.UndefOr[js.Any] = js.native
  
  var goToAction: js.UndefOr[GoToAction] = js.native
  
  var greeting: js.UndefOr[String] = js.native
  
  var intro: js.UndefOr[String | js.Array[String]] = js.native
  
  var name: js.UndefOr[String] = js.native
  
  var outro: js.UndefOr[String | js.Array[String]] = js.native
  
  var signature: js.UndefOr[String] = js.native
  
  var table: js.UndefOr[Table | js.Array[Table]] = js.native
  
  var title: js.UndefOr[String] = js.native
}
object ContentBody {
  
  @scala.inline
  def apply(): ContentBody = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ContentBody]
  }
  
  @scala.inline
  implicit class ContentBodyOps[Self <: ContentBody] (val x: Self) extends AnyVal {
    
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
    def setActionVarargs(value: Action*): Self = this.set("action", js.Array(value :_*))
    
    @scala.inline
    def setAction(value: Action | js.Array[Action]): Self = this.set("action", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAction: Self = this.set("action", js.undefined)
    
    @scala.inline
    def setDictionary(value: js.Any): Self = this.set("dictionary", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDictionary: Self = this.set("dictionary", js.undefined)
    
    @scala.inline
    def setGoToAction(value: GoToAction): Self = this.set("goToAction", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteGoToAction: Self = this.set("goToAction", js.undefined)
    
    @scala.inline
    def setGreeting(value: String): Self = this.set("greeting", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteGreeting: Self = this.set("greeting", js.undefined)
    
    @scala.inline
    def setIntroVarargs(value: String*): Self = this.set("intro", js.Array(value :_*))
    
    @scala.inline
    def setIntro(value: String | js.Array[String]): Self = this.set("intro", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIntro: Self = this.set("intro", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
    
    @scala.inline
    def setOutroVarargs(value: String*): Self = this.set("outro", js.Array(value :_*))
    
    @scala.inline
    def setOutro(value: String | js.Array[String]): Self = this.set("outro", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOutro: Self = this.set("outro", js.undefined)
    
    @scala.inline
    def setSignature(value: String): Self = this.set("signature", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSignature: Self = this.set("signature", js.undefined)
    
    @scala.inline
    def setTableVarargs(value: Table*): Self = this.set("table", js.Array(value :_*))
    
    @scala.inline
    def setTable(value: Table | js.Array[Table]): Self = this.set("table", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTable: Self = this.set("table", js.undefined)
    
    @scala.inline
    def setTitle(value: String): Self = this.set("title", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTitle: Self = this.set("title", js.undefined)
  }
}
