package typings.googleapis.translateV2Mod.translateV2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * The main language translation response message.
  */
trait SchemaTranslationsListResponse extends StObject {
  
  /**
    * Translations contains list of translation results of given text
    */
  var translations: js.UndefOr[js.Array[SchemaTranslationsResource]] = js.undefined
}
object SchemaTranslationsListResponse {
  
  @scala.inline
  def apply(): SchemaTranslationsListResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaTranslationsListResponse]
  }
  
  @scala.inline
  implicit class SchemaTranslationsListResponseMutableBuilder[Self <: SchemaTranslationsListResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setTranslations(value: js.Array[SchemaTranslationsResource]): Self = StObject.set(x, "translations", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTranslationsUndefined: Self = StObject.set(x, "translations", js.undefined)
    
    @scala.inline
    def setTranslationsVarargs(value: SchemaTranslationsResource*): Self = StObject.set(x, "translations", js.Array(value :_*))
  }
}
