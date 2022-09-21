package typings.googleapis.gkehubV1Mod.gkehubV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaResourceOptions extends StObject {
  
  /**
    * Optional. The Connect agent version to use for connect_resources. Defaults to the latest GKE Connect version. The version must be a currently supported version, obsolete versions will be rejected.
    */
  var connectVersion: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Optional. Major version of the Kubernetes cluster. This is only used to determine which version to use for the CustomResourceDefinition resources, `apiextensions/v1beta1` or`apiextensions/v1`.
    */
  var k8sVersion: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Optional. Use `apiextensions/v1beta1` instead of `apiextensions/v1` for CustomResourceDefinition resources. This option should be set for clusters with Kubernetes apiserver versions <1.16.
    */
  var v1beta1Crd: js.UndefOr[Boolean | Null] = js.undefined
}
object SchemaResourceOptions {
  
  inline def apply(): SchemaResourceOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaResourceOptions]
  }
  
  extension [Self <: SchemaResourceOptions](x: Self) {
    
    inline def setConnectVersion(value: String): Self = StObject.set(x, "connectVersion", value.asInstanceOf[js.Any])
    
    inline def setConnectVersionNull: Self = StObject.set(x, "connectVersion", null)
    
    inline def setConnectVersionUndefined: Self = StObject.set(x, "connectVersion", js.undefined)
    
    inline def setK8sVersion(value: String): Self = StObject.set(x, "k8sVersion", value.asInstanceOf[js.Any])
    
    inline def setK8sVersionNull: Self = StObject.set(x, "k8sVersion", null)
    
    inline def setK8sVersionUndefined: Self = StObject.set(x, "k8sVersion", js.undefined)
    
    inline def setV1beta1Crd(value: Boolean): Self = StObject.set(x, "v1beta1Crd", value.asInstanceOf[js.Any])
    
    inline def setV1beta1CrdNull: Self = StObject.set(x, "v1beta1Crd", null)
    
    inline def setV1beta1CrdUndefined: Self = StObject.set(x, "v1beta1Crd", js.undefined)
  }
}
