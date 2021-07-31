package typings.googleapis.v1b3Mod.dataflowV1b3

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Response to a get debug configuration request.
  */
trait SchemaGetDebugConfigResponse extends StObject {
  
  /**
    * The encoded debug configuration for the requested component.
    */
  var config: js.UndefOr[String] = js.undefined
}
object SchemaGetDebugConfigResponse {
  
  @scala.inline
  def apply(): SchemaGetDebugConfigResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGetDebugConfigResponse]
  }
  
  @scala.inline
  implicit class SchemaGetDebugConfigResponseMutableBuilder[Self <: SchemaGetDebugConfigResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setConfig(value: String): Self = StObject.set(x, "config", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setConfigUndefined: Self = StObject.set(x, "config", js.undefined)
  }
}
