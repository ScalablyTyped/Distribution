package typings.googleapis.v1beta4Mod.sqladminV1beta4

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Database demote master request.
  */
trait SchemaInstancesDemoteMasterRequest extends StObject {
  
  /**
    * Contains details about the demoteMaster operation.
    */
  var demoteMasterContext: js.UndefOr[SchemaDemoteMasterContext] = js.undefined
}
object SchemaInstancesDemoteMasterRequest {
  
  @scala.inline
  def apply(): SchemaInstancesDemoteMasterRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaInstancesDemoteMasterRequest]
  }
  
  @scala.inline
  implicit class SchemaInstancesDemoteMasterRequestMutableBuilder[Self <: SchemaInstancesDemoteMasterRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDemoteMasterContext(value: SchemaDemoteMasterContext): Self = StObject.set(x, "demoteMasterContext", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDemoteMasterContextUndefined: Self = StObject.set(x, "demoteMasterContext", js.undefined)
  }
}
