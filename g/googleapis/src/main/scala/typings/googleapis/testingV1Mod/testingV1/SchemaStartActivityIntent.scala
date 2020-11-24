package typings.googleapis.testingV1Mod.testingV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A starting intent specified by an action, uri, and categories.
  */
@js.native
trait SchemaStartActivityIntent extends js.Object {
  
  /**
    * Action name. Required for START_ACTIVITY.
    */
  var action: js.UndefOr[String] = js.native
  
  /**
    * Intent categories to set on the intent.
    */
  var categories: js.UndefOr[js.Array[String]] = js.native
  
  /**
    * URI for the action.
    */
  var uri: js.UndefOr[String] = js.native
}
object SchemaStartActivityIntent {
  
  @scala.inline
  def apply(): SchemaStartActivityIntent = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaStartActivityIntent]
  }
  
  @scala.inline
  implicit class SchemaStartActivityIntentOps[Self <: SchemaStartActivityIntent] (val x: Self) extends AnyVal {
    
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
    def setAction(value: String): Self = this.set("action", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAction: Self = this.set("action", js.undefined)
    
    @scala.inline
    def setCategoriesVarargs(value: String*): Self = this.set("categories", js.Array(value :_*))
    
    @scala.inline
    def setCategories(value: js.Array[String]): Self = this.set("categories", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCategories: Self = this.set("categories", js.undefined)
    
    @scala.inline
    def setUri(value: String): Self = this.set("uri", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUri: Self = this.set("uri", js.undefined)
  }
}
