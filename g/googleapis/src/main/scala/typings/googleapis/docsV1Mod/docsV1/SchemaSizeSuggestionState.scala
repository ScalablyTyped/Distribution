package typings.googleapis.docsV1Mod.docsV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A mask that indicates which of the fields on the base Size have been
  * changed in this suggestion. For any field set to true, the Size has a new
  * suggested value.
  */
@js.native
trait SchemaSizeSuggestionState extends js.Object {
  
  /**
    * Indicates if there was a suggested change to height.
    */
  var heightSuggested: js.UndefOr[Boolean] = js.native
  
  /**
    * Indicates if there was a suggested change to width.
    */
  var widthSuggested: js.UndefOr[Boolean] = js.native
}
object SchemaSizeSuggestionState {
  
  @scala.inline
  def apply(): SchemaSizeSuggestionState = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaSizeSuggestionState]
  }
  
  @scala.inline
  implicit class SchemaSizeSuggestionStateOps[Self <: SchemaSizeSuggestionState] (val x: Self) extends AnyVal {
    
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
    def setHeightSuggested(value: Boolean): Self = this.set("heightSuggested", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHeightSuggested: Self = this.set("heightSuggested", js.undefined)
    
    @scala.inline
    def setWidthSuggested(value: Boolean): Self = this.set("widthSuggested", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteWidthSuggested: Self = this.set("widthSuggested", js.undefined)
  }
}
