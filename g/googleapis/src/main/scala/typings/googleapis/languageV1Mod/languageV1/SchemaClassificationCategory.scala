package typings.googleapis.languageV1Mod.languageV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Represents a category returned from the text classifier.
  */
@js.native
trait SchemaClassificationCategory extends js.Object {
  
  /**
    * The classifier&#39;s confidence of the category. Number represents how
    * certain the classifier is that this category represents the given text.
    */
  var confidence: js.UndefOr[Double] = js.native
  
  /**
    * The name of the category representing the document, from the [predefined
    * taxonomy](/natural-language/docs/categories).
    */
  var name: js.UndefOr[String] = js.native
}
object SchemaClassificationCategory {
  
  @scala.inline
  def apply(): SchemaClassificationCategory = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaClassificationCategory]
  }
  
  @scala.inline
  implicit class SchemaClassificationCategoryOps[Self <: SchemaClassificationCategory] (val x: Self) extends AnyVal {
    
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
    def setConfidence(value: Double): Self = this.set("confidence", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteConfidence: Self = this.set("confidence", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
  }
}
