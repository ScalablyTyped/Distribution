package typings.googleapis.toolresultsV1beta3Mod.toolresultsV1beta3

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaScreen extends StObject {
  
  /**
    * File reference of the png file. Required.
    */
  var fileReference: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Locale of the device that the screenshot was taken on. Required.
    */
  var locale: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Model of the device that the screenshot was taken on. Required.
    */
  var model: js.UndefOr[String | Null] = js.undefined
  
  /**
    * OS version of the device that the screenshot was taken on. Required.
    */
  var version: js.UndefOr[String | Null] = js.undefined
}
object SchemaScreen {
  
  inline def apply(): SchemaScreen = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaScreen]
  }
  
  extension [Self <: SchemaScreen](x: Self) {
    
    inline def setFileReference(value: String): Self = StObject.set(x, "fileReference", value.asInstanceOf[js.Any])
    
    inline def setFileReferenceNull: Self = StObject.set(x, "fileReference", null)
    
    inline def setFileReferenceUndefined: Self = StObject.set(x, "fileReference", js.undefined)
    
    inline def setLocale(value: String): Self = StObject.set(x, "locale", value.asInstanceOf[js.Any])
    
    inline def setLocaleNull: Self = StObject.set(x, "locale", null)
    
    inline def setLocaleUndefined: Self = StObject.set(x, "locale", js.undefined)
    
    inline def setModel(value: String): Self = StObject.set(x, "model", value.asInstanceOf[js.Any])
    
    inline def setModelNull: Self = StObject.set(x, "model", null)
    
    inline def setModelUndefined: Self = StObject.set(x, "model", js.undefined)
    
    inline def setVersion(value: String): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
    
    inline def setVersionNull: Self = StObject.set(x, "version", null)
    
    inline def setVersionUndefined: Self = StObject.set(x, "version", js.undefined)
  }
}
