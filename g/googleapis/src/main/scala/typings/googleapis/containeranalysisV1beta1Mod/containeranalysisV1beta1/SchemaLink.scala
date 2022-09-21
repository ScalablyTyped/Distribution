package typings.googleapis.containeranalysisV1beta1Mod.containeranalysisV1beta1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaLink extends StObject {
  
  /**
    * ByProducts are data generated as part of a software supply chain step, but are not the actual result of the step.
    */
  var byproducts: js.UndefOr[SchemaByProducts] = js.undefined
  
  /**
    * This field contains the full command executed for the step. This can also be empty if links are generated for operations that aren't directly mapped to a specific command. Each term in the command is an independent string in the list. An example of a command in the in-toto metadata field is: "command": ["git", "clone", "https://github.com/in-toto/demo-project.git"]
    */
  var command: js.UndefOr[js.Array[String] | Null] = js.undefined
  
  /**
    * This is a field that can be used to capture information about the environment. It is suggested for this field to contain information that details environment variables, filesystem information, and the present working directory. The recommended structure of this field is: "environment": { "custom_values": { "variables": "", "filesystem": "", "workdir": "", "": "..." \} \}
    */
  var environment: js.UndefOr[SchemaEnvironment] = js.undefined
  
  /**
    * Materials are the supply chain artifacts that go into the step and are used for the operation performed. The key of the map is the path of the artifact and the structure contains the recorded hash information. An example is: "materials": [ { "resource_uri": "foo/bar", "hashes": { "sha256": "ebebf...", : \} \} ]
    */
  var materials: js.UndefOr[js.Array[SchemaGrafeasV1beta1IntotoArtifact]] = js.undefined
  
  /**
    * Products are the supply chain artifacts generated as a result of the step. The structure is identical to that of materials.
    */
  var products: js.UndefOr[js.Array[SchemaGrafeasV1beta1IntotoArtifact]] = js.undefined
}
object SchemaLink {
  
  inline def apply(): SchemaLink = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaLink]
  }
  
  extension [Self <: SchemaLink](x: Self) {
    
    inline def setByproducts(value: SchemaByProducts): Self = StObject.set(x, "byproducts", value.asInstanceOf[js.Any])
    
    inline def setByproductsUndefined: Self = StObject.set(x, "byproducts", js.undefined)
    
    inline def setCommand(value: js.Array[String]): Self = StObject.set(x, "command", value.asInstanceOf[js.Any])
    
    inline def setCommandNull: Self = StObject.set(x, "command", null)
    
    inline def setCommandUndefined: Self = StObject.set(x, "command", js.undefined)
    
    inline def setCommandVarargs(value: String*): Self = StObject.set(x, "command", js.Array(value*))
    
    inline def setEnvironment(value: SchemaEnvironment): Self = StObject.set(x, "environment", value.asInstanceOf[js.Any])
    
    inline def setEnvironmentUndefined: Self = StObject.set(x, "environment", js.undefined)
    
    inline def setMaterials(value: js.Array[SchemaGrafeasV1beta1IntotoArtifact]): Self = StObject.set(x, "materials", value.asInstanceOf[js.Any])
    
    inline def setMaterialsUndefined: Self = StObject.set(x, "materials", js.undefined)
    
    inline def setMaterialsVarargs(value: SchemaGrafeasV1beta1IntotoArtifact*): Self = StObject.set(x, "materials", js.Array(value*))
    
    inline def setProducts(value: js.Array[SchemaGrafeasV1beta1IntotoArtifact]): Self = StObject.set(x, "products", value.asInstanceOf[js.Any])
    
    inline def setProductsUndefined: Self = StObject.set(x, "products", js.undefined)
    
    inline def setProductsVarargs(value: SchemaGrafeasV1beta1IntotoArtifact*): Self = StObject.set(x, "products", js.Array(value*))
  }
}
