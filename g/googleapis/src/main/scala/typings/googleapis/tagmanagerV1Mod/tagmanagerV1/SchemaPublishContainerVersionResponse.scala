package typings.googleapis.tagmanagerV1Mod.tagmanagerV1

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
  
  inline def apply(): SchemaPublishContainerVersionResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaPublishContainerVersionResponse]
  }
  
  extension [Self <: SchemaPublishContainerVersionResponse](x: Self) {
    
    inline def setCompilerError(value: Boolean): Self = StObject.set(x, "compilerError", value.asInstanceOf[js.Any])
    
    inline def setCompilerErrorUndefined: Self = StObject.set(x, "compilerError", js.undefined)
    
    inline def setContainerVersion(value: SchemaContainerVersion): Self = StObject.set(x, "containerVersion", value.asInstanceOf[js.Any])
    
    inline def setContainerVersionUndefined: Self = StObject.set(x, "containerVersion", js.undefined)
  }
}
