package typings.inversify

import typings.inversify.inversifyStrings.`Ambiguous match found for serviceIdentifier:`
import typings.inversify.inversifyStrings.`Cannot apply @injectable decorator multiple timesDOT`
import typings.inversify.inversifyStrings.`Cannot apply @postConstruct decorator multiple times in the same class`
import typings.inversify.inversifyStrings.`Circular dependency found:`
import typings.inversify.inversifyStrings.`Could not unbind serviceIdentifier:`
import typings.inversify.inversifyStrings.`Invalid binding type:`
import typings.inversify.inversifyStrings.`Invalid return type in middlewareDOT Middleware must return!`
import typings.inversify.inversifyStrings.`Key Not Found`
import typings.inversify.inversifyStrings.`Maximum call stack size exceeded`
import typings.inversify.inversifyStrings.`Metadata key was used more than once in a parameter:`
import typings.inversify.inversifyStrings.`Missing required @inject or @multiInject annotation in:`
import typings.inversify.inversifyStrings.`Missing required @injectable annotation in:`
import typings.inversify.inversifyStrings.`NULL argument`
import typings.inversify.inversifyStrings.`No matching bindings found for serviceIdentifier:`
import typings.inversify.inversifyStrings.`No snapshot available to restoreDOT`
import typings.inversify.inversifyStrings.`Sorry, this feature is not fully implemented yetDOT`
import typings.inversify.inversifyStrings.`Value provided to function binding must be a function!`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("inversify/dts/constants/error_msgs", JSImport.Namespace)
@js.native
object dtsConstantsErrorUnderscoreMsgsMod extends js.Object {
  val AMBIGUOUS_MATCH: `Ambiguous match found for serviceIdentifier:` = js.native
  val CANNOT_UNBIND: `Could not unbind serviceIdentifier:` = js.native
  val CIRCULAR_DEPENDENCY: `Circular dependency found:` = js.native
  val CONTAINER_OPTIONS_INVALID_AUTO_BIND_INJECTABLE: String = js.native
  val CONTAINER_OPTIONS_INVALID_DEFAULT_SCOPE: String = js.native
  val CONTAINER_OPTIONS_INVALID_SKIP_BASE_CHECK: String = js.native
  val CONTAINER_OPTIONS_MUST_BE_AN_OBJECT: String = js.native
  val DUPLICATED_INJECTABLE_DECORATOR: `Cannot apply @injectable decorator multiple timesDOT` = js.native
  val DUPLICATED_METADATA: `Metadata key was used more than once in a parameter:` = js.native
  val INVALID_BINDING_TYPE: `Invalid binding type:` = js.native
  val INVALID_DECORATOR_OPERATION: String = js.native
  val INVALID_FUNCTION_BINDING: `Value provided to function binding must be a function!` = js.native
  val INVALID_MIDDLEWARE_RETURN: `Invalid return type in middlewareDOT Middleware must return!` = js.native
  val INVALID_TO_SELF_VALUE: String = js.native
  val KEY_NOT_FOUND: `Key Not Found` = js.native
  val MISSING_INJECTABLE_ANNOTATION: `Missing required @injectable annotation in:` = js.native
  val MISSING_INJECT_ANNOTATION: `Missing required @inject or @multiInject annotation in:` = js.native
  val MULTIPLE_POST_CONSTRUCT_METHODS: `Cannot apply @postConstruct decorator multiple times in the same class` = js.native
  val NOT_IMPLEMENTED: `Sorry, this feature is not fully implemented yetDOT` = js.native
  val NOT_REGISTERED: `No matching bindings found for serviceIdentifier:` = js.native
  val NO_MORE_SNAPSHOTS_AVAILABLE: `No snapshot available to restoreDOT` = js.native
  val NULL_ARGUMENT: `NULL argument` = js.native
  val STACK_OVERFLOW: `Maximum call stack size exceeded` = js.native
  def ARGUMENTS_LENGTH_MISMATCH(values: js.Any*): String = js.native
  def CIRCULAR_DEPENDENCY_IN_FACTORY(values: js.Any*): String = js.native
  def POST_CONSTRUCT_ERROR(values: js.Any*): String = js.native
  def UNDEFINED_INJECT_ANNOTATION(name: String): String = js.native
}

