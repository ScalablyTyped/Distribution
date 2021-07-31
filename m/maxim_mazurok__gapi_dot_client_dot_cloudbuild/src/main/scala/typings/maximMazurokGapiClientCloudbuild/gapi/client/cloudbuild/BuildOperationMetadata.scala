package typings.maximMazurokGapiClientCloudbuild.gapi.client.cloudbuild

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BuildOperationMetadata extends StObject {
  
  /** The build that the operation is tracking. */
  var build: js.UndefOr[Build] = js.undefined
}
object BuildOperationMetadata {
  
  @scala.inline
  def apply(): BuildOperationMetadata = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BuildOperationMetadata]
  }
  
  @scala.inline
  implicit class BuildOperationMetadataMutableBuilder[Self <: BuildOperationMetadata] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBuild(value: Build): Self = StObject.set(x, "build", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBuildUndefined: Self = StObject.set(x, "build", js.undefined)
  }
}
