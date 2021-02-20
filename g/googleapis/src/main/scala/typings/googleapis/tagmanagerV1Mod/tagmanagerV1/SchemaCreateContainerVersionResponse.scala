package typings.googleapis.tagmanagerV1Mod.tagmanagerV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Create container versions response.
  */
@js.native
trait SchemaCreateContainerVersionResponse extends StObject {
  
  /**
    * Compiler errors or not.
    */
  var compilerError: js.UndefOr[Boolean] = js.native
  
  /**
    * The container version created.
    */
  var containerVersion: js.UndefOr[SchemaContainerVersion] = js.native
}
object SchemaCreateContainerVersionResponse {
  
  @scala.inline
  def apply(): SchemaCreateContainerVersionResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaCreateContainerVersionResponse]
  }
  
  @scala.inline
  implicit class SchemaCreateContainerVersionResponseMutableBuilder[Self <: SchemaCreateContainerVersionResponse] (val x: Self) extends AnyVal {
    
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
