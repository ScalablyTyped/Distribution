package typings.googleapis.remotebuildexecutionV1alphaMod.remotebuildexecutionV1alpha

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Details for the tool used to call the API.
  */
trait SchemaGoogleDevtoolsRemoteexecutionV1testToolDetails extends StObject {
  
  /**
    * Name of the tool, e.g. bazel.
    */
  var toolName: js.UndefOr[String] = js.undefined
  
  /**
    * Version of the tool used for the request, e.g. 5.0.3.
    */
  var toolVersion: js.UndefOr[String] = js.undefined
}
object SchemaGoogleDevtoolsRemoteexecutionV1testToolDetails {
  
  inline def apply(): SchemaGoogleDevtoolsRemoteexecutionV1testToolDetails = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleDevtoolsRemoteexecutionV1testToolDetails]
  }
  
  extension [Self <: SchemaGoogleDevtoolsRemoteexecutionV1testToolDetails](x: Self) {
    
    inline def setToolName(value: String): Self = StObject.set(x, "toolName", value.asInstanceOf[js.Any])
    
    inline def setToolNameUndefined: Self = StObject.set(x, "toolName", js.undefined)
    
    inline def setToolVersion(value: String): Self = StObject.set(x, "toolVersion", value.asInstanceOf[js.Any])
    
    inline def setToolVersionUndefined: Self = StObject.set(x, "toolVersion", js.undefined)
  }
}
