package typings.googleapis.remotebuildexecutionV1Mod.remotebuildexecutionV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaGoogleBytestreamMedia extends StObject {
  
  /**
    * Name of the media resource.
    */
  var resourceName: js.UndefOr[String | Null] = js.undefined
}
object SchemaGoogleBytestreamMedia {
  
  inline def apply(): SchemaGoogleBytestreamMedia = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleBytestreamMedia]
  }
  
  extension [Self <: SchemaGoogleBytestreamMedia](x: Self) {
    
    inline def setResourceName(value: String): Self = StObject.set(x, "resourceName", value.asInstanceOf[js.Any])
    
    inline def setResourceNameNull: Self = StObject.set(x, "resourceName", null)
    
    inline def setResourceNameUndefined: Self = StObject.set(x, "resourceName", js.undefined)
  }
}
