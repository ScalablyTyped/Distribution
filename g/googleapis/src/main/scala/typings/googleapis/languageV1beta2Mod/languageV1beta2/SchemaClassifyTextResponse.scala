package typings.googleapis.languageV1beta2Mod.languageV1beta2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * The document classification response message.
  */
@js.native
trait SchemaClassifyTextResponse extends StObject {
  
  /**
    * Categories representing the input document.
    */
  var categories: js.UndefOr[js.Array[SchemaClassificationCategory]] = js.native
}
object SchemaClassifyTextResponse {
  
  @scala.inline
  def apply(): SchemaClassifyTextResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaClassifyTextResponse]
  }
  
  @scala.inline
  implicit class SchemaClassifyTextResponseMutableBuilder[Self <: SchemaClassifyTextResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCategories(value: js.Array[SchemaClassificationCategory]): Self = StObject.set(x, "categories", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCategoriesUndefined: Self = StObject.set(x, "categories", js.undefined)
    
    @scala.inline
    def setCategoriesVarargs(value: SchemaClassificationCategory*): Self = StObject.set(x, "categories", js.Array(value :_*))
  }
}
