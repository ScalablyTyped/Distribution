package typings.googleapis.tagmanagerV2Mod.tagmanagerV2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Publish container version response.
  */
trait SchemaPublishContainerVersionResponse extends StObject {
  
  /**
    * Compiler errors or not.
    */
  var compilerError: js.UndefOr[Boolean] = js.undefined
  
  /**
    * The container version created.
    */
  var containerVersion: js.UndefOr[SchemaContainerVersion] = js.undefined
}
object SchemaPublishContainerVersionResponse {
  
  @scala.inline
  def apply(): SchemaPublishContainerVersionResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaPublishContainerVersionResponse]
  }
  
  @scala.inline
  implicit class SchemaPublishContainerVersionResponseMutableBuilder[Self <: SchemaPublishContainerVersionResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCompilerError(value: Boolean): Self = StObject.set(x, "compilerError", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCompilerErrorUndefined: Self = StObject.set(x, "compilerError", js.undefined)
    
    @scala.inline
    def setContainerVersion(value: SchemaContainerVersion): Self = StObject.set(x, "containerVersion", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setContainerVersionUndefined: Self = StObject.set(x, "containerVersion", js.undefined)
  }
}
