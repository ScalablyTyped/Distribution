package typings.googleapis.cloudsearchV1Mod.cloudsearchV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaUpdateSchemaRequest extends StObject {
  
  /**
    * Common debug options.
    */
  var debugOptions: js.UndefOr[SchemaDebugOptions] = js.undefined
  
  /**
    * The new schema for the source.
    */
  var schema: js.UndefOr[SchemaSchema] = js.undefined
  
  /**
    * If true, the request will be validated without side effects.
    */
  var validateOnly: js.UndefOr[Boolean] = js.undefined
}
object SchemaUpdateSchemaRequest {
  
  @scala.inline
  def apply(): SchemaUpdateSchemaRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaUpdateSchemaRequest]
  }
  
  @scala.inline
  implicit class SchemaUpdateSchemaRequestMutableBuilder[Self <: SchemaUpdateSchemaRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDebugOptions(value: SchemaDebugOptions): Self = StObject.set(x, "debugOptions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDebugOptionsUndefined: Self = StObject.set(x, "debugOptions", js.undefined)
    
    @scala.inline
    def setSchema(value: SchemaSchema): Self = StObject.set(x, "schema", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSchemaUndefined: Self = StObject.set(x, "schema", js.undefined)
    
    @scala.inline
    def setValidateOnly(value: Boolean): Self = StObject.set(x, "validateOnly", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValidateOnlyUndefined: Self = StObject.set(x, "validateOnly", js.undefined)
  }
}
