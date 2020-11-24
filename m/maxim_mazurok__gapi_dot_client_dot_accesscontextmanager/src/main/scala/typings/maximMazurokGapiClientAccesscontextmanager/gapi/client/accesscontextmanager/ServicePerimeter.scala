package typings.maximMazurokGapiClientAccesscontextmanager.gapi.client.accesscontextmanager

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ServicePerimeter extends js.Object {
  
  /** Description of the `ServicePerimeter` and its use. Does not affect behavior. */
  var description: js.UndefOr[String] = js.native
  
  /**
    * Required. Resource name for the ServicePerimeter. The `short_name` component must begin with a letter and only include alphanumeric and '_'. Format:
    * `accessPolicies/{policy_id}/servicePerimeters/{short_name}`
    */
  var name: js.UndefOr[String] = js.native
  
  /**
    * Perimeter type indicator. A single project is allowed to be a member of single regular perimeter, but multiple service perimeter bridges. A project cannot be a included in a
    * perimeter bridge without being included in regular perimeter. For perimeter bridges, the restricted service list as well as access level lists must be empty.
    */
  var perimeterType: js.UndefOr[String] = js.native
  
  /**
    * Proposed (or dry run) ServicePerimeter configuration. This configuration allows to specify and test ServicePerimeter configuration without enforcing actual access restrictions. Only
    * allowed to be set when the "use_explicit_dry_run_spec" flag is set.
    */
  var spec: js.UndefOr[ServicePerimeterConfig] = js.native
  
  /** Current ServicePerimeter configuration. Specifies sets of resources, restricted services and access levels that determine perimeter content and boundaries. */
  var status: js.UndefOr[ServicePerimeterConfig] = js.native
  
  /** Human readable title. Must be unique within the Policy. */
  var title: js.UndefOr[String] = js.native
  
  /**
    * Use explicit dry run spec flag. Ordinarily, a dry-run spec implicitly exists for all Service Perimeters, and that spec is identical to the status for those Service Perimeters. When
    * this flag is set, it inhibits the generation of the implicit spec, thereby allowing the user to explicitly provide a configuration ("spec") to use in a dry-run version of the
    * Service Perimeter. This allows the user to test changes to the enforced config ("status") without actually enforcing them. This testing is done through analyzing the differences
    * between currently enforced and suggested restrictions. use_explicit_dry_run_spec must bet set to True if any of the fields in the spec are set to non-default values.
    */
  var useExplicitDryRunSpec: js.UndefOr[Boolean] = js.native
}
object ServicePerimeter {
  
  @scala.inline
  def apply(): ServicePerimeter = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ServicePerimeter]
  }
  
  @scala.inline
  implicit class ServicePerimeterOps[Self <: ServicePerimeter] (val x: Self) extends AnyVal {
    
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
    def setDescription(value: String): Self = this.set("description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDescription: Self = this.set("description", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
    
    @scala.inline
    def setPerimeterType(value: String): Self = this.set("perimeterType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePerimeterType: Self = this.set("perimeterType", js.undefined)
    
    @scala.inline
    def setSpec(value: ServicePerimeterConfig): Self = this.set("spec", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSpec: Self = this.set("spec", js.undefined)
    
    @scala.inline
    def setStatus(value: ServicePerimeterConfig): Self = this.set("status", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStatus: Self = this.set("status", js.undefined)
    
    @scala.inline
    def setTitle(value: String): Self = this.set("title", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTitle: Self = this.set("title", js.undefined)
    
    @scala.inline
    def setUseExplicitDryRunSpec(value: Boolean): Self = this.set("useExplicitDryRunSpec", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUseExplicitDryRunSpec: Self = this.set("useExplicitDryRunSpec", js.undefined)
  }
}
