package typings.googleapis.v1alpha2Mod.genomicsV1alpha2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * An event generated when the worker stops pulling an image.
  */
trait SchemaPullStoppedEvent extends StObject {
  
  /**
    * The URI of the image that was pulled.
    */
  var imageUri: js.UndefOr[String] = js.undefined
}
object SchemaPullStoppedEvent {
  
  inline def apply(): SchemaPullStoppedEvent = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaPullStoppedEvent]
  }
  
  extension [Self <: SchemaPullStoppedEvent](x: Self) {
    
    inline def setImageUri(value: String): Self = StObject.set(x, "imageUri", value.asInstanceOf[js.Any])
    
    inline def setImageUriUndefined: Self = StObject.set(x, "imageUri", js.undefined)
  }
}
