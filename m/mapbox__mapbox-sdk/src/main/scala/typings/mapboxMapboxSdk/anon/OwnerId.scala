package typings.mapboxMapboxSdk.anon

import typings.mapboxMapboxSdk.servicesStylesMod.Style
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait OwnerId extends StObject {
  
  var ownerId: js.UndefOr[String] = js.undefined
  
  var style: Style
}
object OwnerId {
  
  inline def apply(style: Style): OwnerId = {
    val __obj = js.Dynamic.literal(style = style.asInstanceOf[js.Any])
    __obj.asInstanceOf[OwnerId]
  }
  
  extension [Self <: OwnerId](x: Self) {
    
    inline def setOwnerId(value: String): Self = StObject.set(x, "ownerId", value.asInstanceOf[js.Any])
    
    inline def setOwnerIdUndefined: Self = StObject.set(x, "ownerId", js.undefined)
    
    inline def setStyle(value: Style): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
  }
}
