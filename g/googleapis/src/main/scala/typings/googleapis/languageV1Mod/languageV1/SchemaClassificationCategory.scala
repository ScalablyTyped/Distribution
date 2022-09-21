package typings.googleapis.languageV1Mod.languageV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaClassificationCategory extends StObject {
  
  /**
    * The classifier's confidence of the category. Number represents how certain the classifier is that this category represents the given text.
    */
  var confidence: js.UndefOr[Double | Null] = js.undefined
  
  /**
    * The name of the category representing the document, from the [predefined taxonomy](https://cloud.google.com/natural-language/docs/categories).
    */
  var name: js.UndefOr[String | Null] = js.undefined
}
object SchemaClassificationCategory {
  
  inline def apply(): SchemaClassificationCategory = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaClassificationCategory]
  }
  
  extension [Self <: SchemaClassificationCategory](x: Self) {
    
    inline def setConfidence(value: Double): Self = StObject.set(x, "confidence", value.asInstanceOf[js.Any])
    
    inline def setConfidenceNull: Self = StObject.set(x, "confidence", null)
    
    inline def setConfidenceUndefined: Self = StObject.set(x, "confidence", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameNull: Self = StObject.set(x, "name", null)
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
  }
}
