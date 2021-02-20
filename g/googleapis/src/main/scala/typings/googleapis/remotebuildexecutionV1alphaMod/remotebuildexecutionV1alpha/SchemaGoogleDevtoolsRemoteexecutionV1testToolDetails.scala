package typings.googleapis.remotebuildexecutionV1alphaMod.remotebuildexecutionV1alpha

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Details for the tool used to call the API.
  */
@js.native
trait SchemaGoogleDevtoolsRemoteexecutionV1testToolDetails extends StObject {
  
  /**
    * Name of the tool, e.g. bazel.
    */
  var toolName: js.UndefOr[String] = js.native
  
  /**
    * Version of the tool used for the request, e.g. 5.0.3.
    */
  var toolVersion: js.UndefOr[String] = js.native
}
object SchemaGoogleDevtoolsRemoteexecutionV1testToolDetails {
  
  @scala.inline
  def apply(): SchemaGoogleDevtoolsRemoteexecutionV1testToolDetails = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleDevtoolsRemoteexecutionV1testToolDetails]
  }
  
  @scala.inline
  implicit class SchemaGoogleDevtoolsRemoteexecutionV1testToolDetailsMutableBuilder[Self <: SchemaGoogleDevtoolsRemoteexecutionV1testToolDetails] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setToolName(value: String): Self = StObject.set(x, "toolName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setToolNameUndefined: Self = StObject.set(x, "toolName", js.undefined)
    
    @scala.inline
    def setToolVersion(value: String): Self = StObject.set(x, "toolVersion", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setToolVersionUndefined: Self = StObject.set(x, "toolVersion", js.undefined)
  }
}
