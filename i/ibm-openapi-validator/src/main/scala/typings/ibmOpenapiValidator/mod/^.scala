package typings.ibmOpenapiValidator.mod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("ibm-openapi-validator", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  
  /**
    * OpenAPI document validator
    * @param openApiDoc - OpenAPI document object
    * @param defaultMode - If set to true, the validator will ignore the .validaterc file and will use the [configuration defaults](https://github.com/IBM/openapi-validator#default-values).
    * @returns Validation results
    */
  def apply(openApiDoc: StringDictionary[js.Any]): js.Promise[validatorResult] = js.native
  def apply(openApiDoc: StringDictionary[js.Any], defaultMode: validatorParameterDefaultMode): js.Promise[validatorResult] = js.native
}
