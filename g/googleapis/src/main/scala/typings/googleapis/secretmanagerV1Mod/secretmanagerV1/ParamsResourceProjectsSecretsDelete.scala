package typings.googleapis.secretmanagerV1Mod.secretmanagerV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceProjectsSecretsDelete
  extends StObject
     with StandardParameters {
  
  /**
    * Optional. Etag of the Secret. The request succeeds if it matches the etag of the currently stored secret object. If the etag is omitted, the request succeeds.
    */
  var etag: js.UndefOr[String] = js.undefined
  
  /**
    * Required. The resource name of the Secret to delete in the format `projects/x/secrets/x`.
    */
  var name: js.UndefOr[String] = js.undefined
}
object ParamsResourceProjectsSecretsDelete {
  
  inline def apply(): ParamsResourceProjectsSecretsDelete = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceProjectsSecretsDelete]
  }
  
  extension [Self <: ParamsResourceProjectsSecretsDelete](x: Self) {
    
    inline def setEtag(value: String): Self = StObject.set(x, "etag", value.asInstanceOf[js.Any])
    
    inline def setEtagUndefined: Self = StObject.set(x, "etag", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
  }
}
