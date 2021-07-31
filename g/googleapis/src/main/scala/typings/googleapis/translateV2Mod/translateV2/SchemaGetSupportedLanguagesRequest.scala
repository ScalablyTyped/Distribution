package typings.googleapis.translateV2Mod.translateV2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * The request message for discovering supported languages.
  */
trait SchemaGetSupportedLanguagesRequest extends StObject {
  
  /**
    * The language to use to return localized, human readable names of
    * supported languages.
    */
  var target: js.UndefOr[String] = js.undefined
}
object SchemaGetSupportedLanguagesRequest {
  
  @scala.inline
  def apply(): SchemaGetSupportedLanguagesRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGetSupportedLanguagesRequest]
  }
  
  @scala.inline
  implicit class SchemaGetSupportedLanguagesRequestMutableBuilder[Self <: SchemaGetSupportedLanguagesRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setTarget(value: String): Self = StObject.set(x, "target", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTargetUndefined: Self = StObject.set(x, "target", js.undefined)
  }
}
