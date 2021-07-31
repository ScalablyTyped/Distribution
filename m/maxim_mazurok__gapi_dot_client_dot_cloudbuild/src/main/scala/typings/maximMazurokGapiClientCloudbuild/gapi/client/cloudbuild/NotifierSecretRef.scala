package typings.maximMazurokGapiClientCloudbuild.gapi.client.cloudbuild

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait NotifierSecretRef extends StObject {
  
  /** The value of `secret_ref` should be a `name` that is registered in a `Secret` in the `secrets` list of the `Spec`. */
  var secretRef: js.UndefOr[String] = js.undefined
}
object NotifierSecretRef {
  
  @scala.inline
  def apply(): NotifierSecretRef = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[NotifierSecretRef]
  }
  
  @scala.inline
  implicit class NotifierSecretRefMutableBuilder[Self <: NotifierSecretRef] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setSecretRef(value: String): Self = StObject.set(x, "secretRef", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSecretRefUndefined: Self = StObject.set(x, "secretRef", js.undefined)
  }
}
