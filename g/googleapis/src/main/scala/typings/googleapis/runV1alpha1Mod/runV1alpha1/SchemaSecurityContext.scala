package typings.googleapis.runV1alpha1Mod.runV1alpha1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaSecurityContext extends StObject {
  
  /**
    * (Optional) The UID to run the entrypoint of the container process. Defaults to user specified in image metadata if unspecified. May also be set in PodSecurityContext. If set in both SecurityContext and PodSecurityContext, the value specified in SecurityContext takes precedence.
    */
  var runAsUser: js.UndefOr[Double | Null] = js.undefined
}
object SchemaSecurityContext {
  
  inline def apply(): SchemaSecurityContext = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaSecurityContext]
  }
  
  extension [Self <: SchemaSecurityContext](x: Self) {
    
    inline def setRunAsUser(value: Double): Self = StObject.set(x, "runAsUser", value.asInstanceOf[js.Any])
    
    inline def setRunAsUserNull: Self = StObject.set(x, "runAsUser", null)
    
    inline def setRunAsUserUndefined: Self = StObject.set(x, "runAsUser", js.undefined)
  }
}
