package typings.googleapis.streetviewpublishV1Mod.streetviewpublishV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaConnection extends StObject {
  
  /**
    * Required. The destination of the connection from the containing photo to another photo.
    */
  var target: js.UndefOr[SchemaPhotoId] = js.undefined
}
object SchemaConnection {
  
  inline def apply(): SchemaConnection = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaConnection]
  }
  
  extension [Self <: SchemaConnection](x: Self) {
    
    inline def setTarget(value: SchemaPhotoId): Self = StObject.set(x, "target", value.asInstanceOf[js.Any])
    
    inline def setTargetUndefined: Self = StObject.set(x, "target", js.undefined)
  }
}
