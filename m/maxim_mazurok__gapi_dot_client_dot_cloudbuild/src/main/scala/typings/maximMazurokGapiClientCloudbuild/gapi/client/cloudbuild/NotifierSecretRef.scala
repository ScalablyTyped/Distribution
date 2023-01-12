package typings.maximMazurokGapiClientCloudbuild.gapi.client.cloudbuild

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait NotifierSecretRef extends StObject {
  
  /** The value of `secret_ref` should be a `name` that is registered in a `Secret` in the `secrets` list of the `Spec`. */
  var secretRef: js.UndefOr[String] = js.undefined
}
object NotifierSecretRef {
  
  inline def apply(): NotifierSecretRef = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[NotifierSecretRef]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: NotifierSecretRef] (val x: Self) extends AnyVal {
    
    inline def setSecretRef(value: String): Self = StObject.set(x, "secretRef", value.asInstanceOf[js.Any])
    
    inline def setSecretRefUndefined: Self = StObject.set(x, "secretRef", js.undefined)
  }
}
