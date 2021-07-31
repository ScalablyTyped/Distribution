package typings.googleapis.toolresultsV1beta3Mod.toolresultsV1beta3

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaScreen extends StObject {
  
  /**
    * File reference of the png file. Required.
    */
  var fileReference: js.UndefOr[String] = js.undefined
  
  /**
    * Locale of the device that the screenshot was taken on. Required.
    */
  var locale: js.UndefOr[String] = js.undefined
  
  /**
    * Model of the device that the screenshot was taken on. Required.
    */
  var model: js.UndefOr[String] = js.undefined
  
  /**
    * OS version of the device that the screenshot was taken on. Required.
    */
  var version: js.UndefOr[String] = js.undefined
}
object SchemaScreen {
  
  @scala.inline
  def apply(): SchemaScreen = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaScreen]
  }
  
  @scala.inline
  implicit class SchemaScreenMutableBuilder[Self <: SchemaScreen] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFileReference(value: String): Self = StObject.set(x, "fileReference", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFileReferenceUndefined: Self = StObject.set(x, "fileReference", js.undefined)
    
    @scala.inline
    def setLocale(value: String): Self = StObject.set(x, "locale", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLocaleUndefined: Self = StObject.set(x, "locale", js.undefined)
    
    @scala.inline
    def setModel(value: String): Self = StObject.set(x, "model", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setModelUndefined: Self = StObject.set(x, "model", js.undefined)
    
    @scala.inline
    def setVersion(value: String): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVersionUndefined: Self = StObject.set(x, "version", js.undefined)
  }
}
