package typings.googleapis.v1beta4Mod.sqladminV1beta4

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Database instance clone request.
  */
trait SchemaInstancesCloneRequest extends StObject {
  
  /**
    * Contains details about the clone operation.
    */
  var cloneContext: js.UndefOr[SchemaCloneContext] = js.undefined
}
object SchemaInstancesCloneRequest {
  
  @scala.inline
  def apply(): SchemaInstancesCloneRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaInstancesCloneRequest]
  }
  
  @scala.inline
  implicit class SchemaInstancesCloneRequestMutableBuilder[Self <: SchemaInstancesCloneRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCloneContext(value: SchemaCloneContext): Self = StObject.set(x, "cloneContext", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCloneContextUndefined: Self = StObject.set(x, "cloneContext", js.undefined)
  }
}
