package typings.googleapis.cloudsearchV1Mod.cloudsearchV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Media resource.
  */
trait SchemaMedia extends StObject {
  
  /**
    * Name of the media resource.
    */
  var resourceName: js.UndefOr[String] = js.undefined
}
object SchemaMedia {
  
  inline def apply(): SchemaMedia = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaMedia]
  }
  
  extension [Self <: SchemaMedia](x: Self) {
    
    inline def setResourceName(value: String): Self = StObject.set(x, "resourceName", value.asInstanceOf[js.Any])
    
    inline def setResourceNameUndefined: Self = StObject.set(x, "resourceName", js.undefined)
  }
}
