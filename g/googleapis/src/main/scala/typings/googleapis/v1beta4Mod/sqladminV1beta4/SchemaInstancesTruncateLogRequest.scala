package typings.googleapis.v1beta4Mod.sqladminV1beta4

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Instance truncate log request.
  */
@js.native
trait SchemaInstancesTruncateLogRequest extends StObject {
  
  /**
    * Contains details about the truncate log operation.
    */
  var truncateLogContext: js.UndefOr[SchemaTruncateLogContext] = js.native
}
object SchemaInstancesTruncateLogRequest {
  
  @scala.inline
  def apply(): SchemaInstancesTruncateLogRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaInstancesTruncateLogRequest]
  }
  
  @scala.inline
  implicit class SchemaInstancesTruncateLogRequestMutableBuilder[Self <: SchemaInstancesTruncateLogRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setTruncateLogContext(value: SchemaTruncateLogContext): Self = StObject.set(x, "truncateLogContext", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTruncateLogContextUndefined: Self = StObject.set(x, "truncateLogContext", js.undefined)
  }
}
