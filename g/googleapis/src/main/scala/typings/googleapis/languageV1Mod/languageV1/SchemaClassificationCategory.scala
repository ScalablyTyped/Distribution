package typings.googleapis.languageV1Mod.languageV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Represents a category returned from the text classifier.
  */
@js.native
trait SchemaClassificationCategory extends StObject {
  
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
  implicit class SchemaClassificationCategoryMutableBuilder[Self <: SchemaClassificationCategory] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setConfidence(value: Double): Self = StObject.set(x, "confidence", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setConfidenceUndefined: Self = StObject.set(x, "confidence", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
  }
}
