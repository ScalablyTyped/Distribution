package typings.googleapis.computeV1Mod.computeV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaBackendServiceReference extends StObject {
  
  var backendService: js.UndefOr[String] = js.undefined
}
object SchemaBackendServiceReference {
  
  @scala.inline
  def apply(): SchemaBackendServiceReference = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaBackendServiceReference]
  }
  
  @scala.inline
  implicit class SchemaBackendServiceReferenceMutableBuilder[Self <: SchemaBackendServiceReference] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBackendService(value: String): Self = StObject.set(x, "backendService", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBackendServiceUndefined: Self = StObject.set(x, "backendService", js.undefined)
  }
}
