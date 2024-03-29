package typings.googleapis.v2alpha1Mod.genomicsV2alpha1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaPullStartedEvent extends StObject {
  
  /**
    * The URI of the image that was pulled.
    */
  var imageUri: js.UndefOr[String | Null] = js.undefined
}
object SchemaPullStartedEvent {
  
  inline def apply(): SchemaPullStartedEvent = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaPullStartedEvent]
  }
  
  extension [Self <: SchemaPullStartedEvent](x: Self) {
    
    inline def setImageUri(value: String): Self = StObject.set(x, "imageUri", value.asInstanceOf[js.Any])
    
    inline def setImageUriNull: Self = StObject.set(x, "imageUri", null)
    
    inline def setImageUriUndefined: Self = StObject.set(x, "imageUri", js.undefined)
  }
}
