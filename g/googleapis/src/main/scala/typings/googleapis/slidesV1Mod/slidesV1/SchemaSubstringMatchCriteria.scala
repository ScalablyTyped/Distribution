package typings.googleapis.slidesV1Mod.slidesV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A criteria that matches a specific string of text in a shape or table.
  */
@js.native
trait SchemaSubstringMatchCriteria extends js.Object {
  
  /**
    * Indicates whether the search should respect case:  - `True`: the search
    * is case sensitive. - `False`: the search is case insensitive.
    */
  var matchCase: js.UndefOr[Boolean] = js.native
  
  /**
    * The text to search for in the shape or table.
    */
  var text: js.UndefOr[String] = js.native
}
object SchemaSubstringMatchCriteria {
  
  @scala.inline
  def apply(): SchemaSubstringMatchCriteria = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaSubstringMatchCriteria]
  }
  
  @scala.inline
  implicit class SchemaSubstringMatchCriteriaOps[Self <: SchemaSubstringMatchCriteria] (val x: Self) extends AnyVal {
    
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
    def setMatchCase(value: Boolean): Self = this.set("matchCase", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMatchCase: Self = this.set("matchCase", js.undefined)
    
    @scala.inline
    def setText(value: String): Self = this.set("text", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteText: Self = this.set("text", js.undefined)
  }
}
