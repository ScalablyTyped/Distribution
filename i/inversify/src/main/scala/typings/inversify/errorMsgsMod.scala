package typings.inversify

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("inversify/dts/constants/error_msgs", JSImport.Namespace)
@js.native
object errorMsgsMod extends js.Object {
  val AMBIGUOUS_MATCH: /* "Ambiguous match found for serviceIdentifier:" */ String = js.native
  val CANNOT_UNBIND: /* "Could not unbind serviceIdentifier:" */ String = js.native
  val CIRCULAR_DEPENDENCY: /* "Circular dependency found:" */ String = js.native
  val CONTAINER_OPTIONS_INVALID_AUTO_BIND_INJECTABLE: String = js.native
  val CONTAINER_OPTIONS_INVALID_DEFAULT_SCOPE: String = js.native
  val CONTAINER_OPTIONS_INVALID_SKIP_BASE_CHECK: String = js.native
  val CONTAINER_OPTIONS_MUST_BE_AN_OBJECT: String = js.native
  val DUPLICATED_INJECTABLE_DECORATOR: /* "Cannot apply @injectable decorator multiple times." */ String = js.native
  val DUPLICATED_METADATA: /* "Metadata key was used more than once in a parameter:" */ String = js.native
  val INVALID_BINDING_TYPE: /* "Invalid binding type:" */ String = js.native
  val INVALID_DECORATOR_OPERATION: String = js.native
  val INVALID_FUNCTION_BINDING: /* "Value provided to function binding must be a function!" */ String = js.native
  val INVALID_MIDDLEWARE_RETURN: /* "Invalid return type in middleware. Middleware must return!" */ String = js.native
  val INVALID_TO_SELF_VALUE: String = js.native
  val KEY_NOT_FOUND: /* "Key Not Found" */ String = js.native
  val MISSING_INJECTABLE_ANNOTATION: /* "Missing required @injectable annotation in:" */ String = js.native
  val MISSING_INJECT_ANNOTATION: /* "Missing required @inject or @multiInject annotation in:" */ String = js.native
  val MULTIPLE_POST_CONSTRUCT_METHODS: /* "Cannot apply @postConstruct decorator multiple times in the same class" */ String = js.native
  val NOT_IMPLEMENTED: /* "Sorry, this feature is not fully implemented yet." */ String = js.native
  val NOT_REGISTERED: /* "No matching bindings found for serviceIdentifier:" */ String = js.native
  val NO_MORE_SNAPSHOTS_AVAILABLE: /* "No snapshot available to restore." */ String = js.native
  val NULL_ARGUMENT: /* "NULL argument" */ String = js.native
  val STACK_OVERFLOW: /* "Maximum call stack size exceeded" */ String = js.native
  def ARGUMENTS_LENGTH_MISMATCH(values: js.Any*): String = js.native
  def CIRCULAR_DEPENDENCY_IN_FACTORY(values: js.Any*): String = js.native
  def POST_CONSTRUCT_ERROR(values: js.Any*): String = js.native
  def UNDEFINED_INJECT_ANNOTATION(name: String): String = js.native
}

