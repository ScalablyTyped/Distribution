package typings.lockfileLintApi.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("lockfile-lint-api", "ValidateHost")
@js.native
class ValidateHost protected () extends js.Object {
  def this(packages: typings.lockfileLintApi.anon.Packages) = this()
  
  def validate(hosts: Hosts): ValidationResult = js.native
  def validate(hosts: Hosts, options: ValidationOptions): ValidationResult = js.native
  
  def validateSingle(packageName: String, hosts: Hosts): Boolean = js.native
}
