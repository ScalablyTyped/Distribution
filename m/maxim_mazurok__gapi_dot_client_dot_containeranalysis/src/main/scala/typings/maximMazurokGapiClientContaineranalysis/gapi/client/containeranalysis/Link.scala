package typings.maximMazurokGapiClientContaineranalysis.gapi.client.containeranalysis

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Link extends js.Object {
  
  /** ByProducts are data generated as part of a software supply chain step, but are not the actual result of the step. */
  var byproducts: js.UndefOr[ByProducts] = js.native
  
  /**
    * This field contains the full command executed for the step. This can also be empty if links are generated for operations that aren't directly mapped to a specific command. Each term
    * in the command is an independent string in the list. An example of a command in the in-toto metadata field is: "command": ["git", "clone",
    * "https://github.com/in-toto/demo-project.git"]
    */
  var command: js.UndefOr[js.Array[String]] = js.native
  
  /**
    * This is a field that can be used to capture information about the environment. It is suggested for this field to contain information that details environment variables, filesystem
    * information, and the present working directory. The recommended structure of this field is: "environment": { "custom_values": { "variables": "", "filesystem": "", "workdir": "", "":
    * "..." } }
    */
  var environment: js.UndefOr[Environment] = js.native
  
  /**
    * Materials are the supply chain artifacts that go into the step and are used for the operation performed. The key of the map is the path of the artifact and the structure contains
    * the recorded hash information. An example is: "materials": [ { "resource_uri": "foo/bar", "hashes": { "sha256": "ebebf...", : } } ]
    */
  var materials: js.UndefOr[js.Array[GrafeasV1beta1IntotoArtifact]] = js.native
  
  /** Products are the supply chain artifacts generated as a result of the step. The structure is identical to that of materials. */
  var products: js.UndefOr[js.Array[GrafeasV1beta1IntotoArtifact]] = js.native
}
object Link {
  
  @scala.inline
  def apply(): Link = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Link]
  }
  
  @scala.inline
  implicit class LinkOps[Self <: Link] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setByproducts(value: ByProducts): Self = this.set("byproducts", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteByproducts: Self = this.set("byproducts", js.undefined)
    
    @scala.inline
    def setCommandVarargs(value: String*): Self = this.set("command", js.Array(value :_*))
    
    @scala.inline
    def setCommand(value: js.Array[String]): Self = this.set("command", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCommand: Self = this.set("command", js.undefined)
    
    @scala.inline
    def setEnvironment(value: Environment): Self = this.set("environment", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEnvironment: Self = this.set("environment", js.undefined)
    
    @scala.inline
    def setMaterialsVarargs(value: GrafeasV1beta1IntotoArtifact*): Self = this.set("materials", js.Array(value :_*))
    
    @scala.inline
    def setMaterials(value: js.Array[GrafeasV1beta1IntotoArtifact]): Self = this.set("materials", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMaterials: Self = this.set("materials", js.undefined)
    
    @scala.inline
    def setProductsVarargs(value: GrafeasV1beta1IntotoArtifact*): Self = this.set("products", js.Array(value :_*))
    
    @scala.inline
    def setProducts(value: js.Array[GrafeasV1beta1IntotoArtifact]): Self = this.set("products", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteProducts: Self = this.set("products", js.undefined)
  }
}
