package typings.googleapis.factchecktoolsV1alpha1Mod.factchecktoolsV1alpha1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaGoogleFactcheckingFactchecktoolsV1alpha1Publisher extends StObject {
  
  /**
    * The name of this publisher. For instance, "Awesome Fact Checks".
    */
  var name: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Host-level site name, without the protocol or "www" prefix. For instance, "awesomefactchecks.com". This value of this field is based purely on the claim review URL.
    */
  var site: js.UndefOr[String | Null] = js.undefined
}
object SchemaGoogleFactcheckingFactchecktoolsV1alpha1Publisher {
  
  inline def apply(): SchemaGoogleFactcheckingFactchecktoolsV1alpha1Publisher = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleFactcheckingFactchecktoolsV1alpha1Publisher]
  }
  
  extension [Self <: SchemaGoogleFactcheckingFactchecktoolsV1alpha1Publisher](x: Self) {
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameNull: Self = StObject.set(x, "name", null)
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setSite(value: String): Self = StObject.set(x, "site", value.asInstanceOf[js.Any])
    
    inline def setSiteNull: Self = StObject.set(x, "site", null)
    
    inline def setSiteUndefined: Self = StObject.set(x, "site", js.undefined)
  }
}
