package typings.googleapis.siteVerificationV1Mod.siteVerificationV1

import typings.googleapis.anon.Identifier
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaSiteVerificationWebResourceResource extends StObject {
  
  /**
    * The string used to identify this site. This value should be used in the
    * &quot;id&quot; portion of the REST URL for the Get, Update, and Delete
    * operations.
    */
  var id: js.UndefOr[String] = js.undefined
  
  /**
    * The email addresses of all verified owners.
    */
  var owners: js.UndefOr[js.Array[String]] = js.undefined
  
  /**
    * The address and type of a site that is verified or will be verified.
    */
  var site: js.UndefOr[Identifier] = js.undefined
}
object SchemaSiteVerificationWebResourceResource {
  
  inline def apply(): SchemaSiteVerificationWebResourceResource = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaSiteVerificationWebResourceResource]
  }
  
  extension [Self <: SchemaSiteVerificationWebResourceResource](x: Self) {
    
    inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    
    inline def setOwners(value: js.Array[String]): Self = StObject.set(x, "owners", value.asInstanceOf[js.Any])
    
    inline def setOwnersUndefined: Self = StObject.set(x, "owners", js.undefined)
    
    inline def setOwnersVarargs(value: String*): Self = StObject.set(x, "owners", js.Array(value :_*))
    
    inline def setSite(value: Identifier): Self = StObject.set(x, "site", value.asInstanceOf[js.Any])
    
    inline def setSiteUndefined: Self = StObject.set(x, "site", js.undefined)
  }
}
