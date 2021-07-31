package typings.inversify

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object errorMsgsMod {
  
  @JSImport("inversify/dts/constants/error_msgs", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("inversify/dts/constants/error_msgs", "AMBIGUOUS_MATCH")
  @js.native
  val AMBIGUOUS_MATCH: /* "Ambiguous match found for serviceIdentifier:" */ String = js.native
  
  @scala.inline
  def ARGUMENTS_LENGTH_MISMATCH(values: js.Any*): String = ^.asInstanceOf[js.Dynamic].applyDynamic("ARGUMENTS_LENGTH_MISMATCH")(values.asInstanceOf[js.Any]).asInstanceOf[String]
  
  @JSImport("inversify/dts/constants/error_msgs", "CANNOT_UNBIND")
  @js.native
  val CANNOT_UNBIND: /* "Could not unbind serviceIdentifier:" */ String = js.native
  
  @JSImport("inversify/dts/constants/error_msgs", "CIRCULAR_DEPENDENCY")
  @js.native
  val CIRCULAR_DEPENDENCY: /* "Circular dependency found:" */ String = js.native
  
  @scala.inline
  def CIRCULAR_DEPENDENCY_IN_FACTORY(values: js.Any*): String = ^.asInstanceOf[js.Dynamic].applyDynamic("CIRCULAR_DEPENDENCY_IN_FACTORY")(values.asInstanceOf[js.Any]).asInstanceOf[String]
  
  @JSImport("inversify/dts/constants/error_msgs", "CONTAINER_OPTIONS_INVALID_AUTO_BIND_INJECTABLE")
  @js.native
  val CONTAINER_OPTIONS_INVALID_AUTO_BIND_INJECTABLE: String = js.native
  
  @JSImport("inversify/dts/constants/error_msgs", "CONTAINER_OPTIONS_INVALID_DEFAULT_SCOPE")
  @js.native
  val CONTAINER_OPTIONS_INVALID_DEFAULT_SCOPE: String = js.native
  
  @JSImport("inversify/dts/constants/error_msgs", "CONTAINER_OPTIONS_INVALID_SKIP_BASE_CHECK")
  @js.native
  val CONTAINER_OPTIONS_INVALID_SKIP_BASE_CHECK: String = js.native
  
  @JSImport("inversify/dts/constants/error_msgs", "CONTAINER_OPTIONS_MUST_BE_AN_OBJECT")
  @js.native
  val CONTAINER_OPTIONS_MUST_BE_AN_OBJECT: String = js.native
  
  @JSImport("inversify/dts/constants/error_msgs", "DUPLICATED_INJECTABLE_DECORATOR")
  @js.native
  val DUPLICATED_INJECTABLE_DECORATOR: /* "Cannot apply @injectable decorator multiple times." */ String = js.native
  
  @JSImport("inversify/dts/constants/error_msgs", "DUPLICATED_METADATA")
  @js.native
  val DUPLICATED_METADATA: /* "Metadata key was used more than once in a parameter:" */ String = js.native
  
  @JSImport("inversify/dts/constants/error_msgs", "INVALID_BINDING_TYPE")
  @js.native
  val INVALID_BINDING_TYPE: /* "Invalid binding type:" */ String = js.native
  
  @JSImport("inversify/dts/constants/error_msgs", "INVALID_DECORATOR_OPERATION")
  @js.native
  val INVALID_DECORATOR_OPERATION: String = js.native
  
  @JSImport("inversify/dts/constants/error_msgs", "INVALID_FUNCTION_BINDING")
  @js.native
  val INVALID_FUNCTION_BINDING: /* "Value provided to function binding must be a function!" */ String = js.native
  
  @JSImport("inversify/dts/constants/error_msgs", "INVALID_MIDDLEWARE_RETURN")
  @js.native
  val INVALID_MIDDLEWARE_RETURN: /* "Invalid return type in middleware. Middleware must return!" */ String = js.native
  
  @JSImport("inversify/dts/constants/error_msgs", "INVALID_TO_SELF_VALUE")
  @js.native
  val INVALID_TO_SELF_VALUE: String = js.native
  
  @JSImport("inversify/dts/constants/error_msgs", "KEY_NOT_FOUND")
  @js.native
  val KEY_NOT_FOUND: /* "Key Not Found" */ String = js.native
  
  @JSImport("inversify/dts/constants/error_msgs", "MISSING_INJECTABLE_ANNOTATION")
  @js.native
  val MISSING_INJECTABLE_ANNOTATION: /* "Missing required @injectable annotation in:" */ String = js.native
  
  @JSImport("inversify/dts/constants/error_msgs", "MISSING_INJECT_ANNOTATION")
  @js.native
  val MISSING_INJECT_ANNOTATION: /* "Missing required @inject or @multiInject annotation in:" */ String = js.native
  
  @JSImport("inversify/dts/constants/error_msgs", "MULTIPLE_POST_CONSTRUCT_METHODS")
  @js.native
  val MULTIPLE_POST_CONSTRUCT_METHODS: /* "Cannot apply @postConstruct decorator multiple times in the same class" */ String = js.native
  
  @JSImport("inversify/dts/constants/error_msgs", "NOT_IMPLEMENTED")
  @js.native
  val NOT_IMPLEMENTED: /* "Sorry, this feature is not fully implemented yet." */ String = js.native
  
  @JSImport("inversify/dts/constants/error_msgs", "NOT_REGISTERED")
  @js.native
  val NOT_REGISTERED: /* "No matching bindings found for serviceIdentifier:" */ String = js.native
  
  @JSImport("inversify/dts/constants/error_msgs", "NO_MORE_SNAPSHOTS_AVAILABLE")
  @js.native
  val NO_MORE_SNAPSHOTS_AVAILABLE: /* "No snapshot available to restore." */ String = js.native
  
  @JSImport("inversify/dts/constants/error_msgs", "NULL_ARGUMENT")
  @js.native
  val NULL_ARGUMENT: /* "NULL argument" */ String = js.native
  
  @scala.inline
  def POST_CONSTRUCT_ERROR(values: js.Any*): String = ^.asInstanceOf[js.Dynamic].applyDynamic("POST_CONSTRUCT_ERROR")(values.asInstanceOf[js.Any]).asInstanceOf[String]
  
  @JSImport("inversify/dts/constants/error_msgs", "STACK_OVERFLOW")
  @js.native
  val STACK_OVERFLOW: /* "Maximum call stack size exceeded" */ String = js.native
  
  @scala.inline
  def UNDEFINED_INJECT_ANNOTATION(name: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("UNDEFINED_INJECT_ANNOTATION")(name.asInstanceOf[js.Any]).asInstanceOf[String]
}
