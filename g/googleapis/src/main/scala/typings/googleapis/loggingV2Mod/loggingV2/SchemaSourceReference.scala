package typings.googleapis.loggingV2Mod.loggingV2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A reference to a particular snapshot of the source tree used to build and
  * deploy an application.
  */
trait SchemaSourceReference extends StObject {
  
  /**
    * Optional. A URI string identifying the repository. Example:
    * &quot;https://github.com/GoogleCloudPlatform/kubernetes.git&quot;
    */
  var repository: js.UndefOr[String] = js.undefined
  
  /**
    * The canonical and persistent identifier of the deployed revision. Example
    * (git): &quot;0035781c50ec7aa23385dc841529ce8a4b70db1b&quot;
    */
  var revisionId: js.UndefOr[String] = js.undefined
}
object SchemaSourceReference {
  
  inline def apply(): SchemaSourceReference = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaSourceReference]
  }
  
  extension [Self <: SchemaSourceReference](x: Self) {
    
    inline def setRepository(value: String): Self = StObject.set(x, "repository", value.asInstanceOf[js.Any])
    
    inline def setRepositoryUndefined: Self = StObject.set(x, "repository", js.undefined)
    
    inline def setRevisionId(value: String): Self = StObject.set(x, "revisionId", value.asInstanceOf[js.Any])
    
    inline def setRevisionIdUndefined: Self = StObject.set(x, "revisionId", js.undefined)
  }
}
