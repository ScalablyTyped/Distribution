package typings.lockfileLintApi.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("lockfile-lint-api", "ValidateUrl")
@js.native
class ValidateUrl protected () extends js.Object {
  def this(packages: typings.lockfileLintApi.anon.Packages) = this()
  
  def validate(allowedUrls: js.Array[String]): ValidationResult = js.native
  def validate(allowedUrls: js.Array[String], options: ValidationOptions): ValidationResult = js.native
  
  def validateSingle(packageName: String, allowedUrls: Hosts): Boolean = js.native
}
