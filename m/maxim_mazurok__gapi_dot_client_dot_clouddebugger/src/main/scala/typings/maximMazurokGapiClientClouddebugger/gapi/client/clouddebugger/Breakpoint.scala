package typings.maximMazurokGapiClientClouddebugger.gapi.client.clouddebugger

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Breakpoint extends StObject {
  
  /** Action that the agent should perform when the code at the breakpoint location is hit. */
  var action: js.UndefOr[String] = js.undefined
  
  /** The deadline for the breakpoint to stay in CANARY_ACTIVE state. The value is meaningless when the breakpoint is not in CANARY_ACTIVE state. */
  var canaryExpireTime: js.UndefOr[String] = js.undefined
  
  /** Condition that triggers the breakpoint. The condition is a compound boolean expression composed using expressions in a programming language at the source location. */
  var condition: js.UndefOr[String] = js.undefined
  
  /** Time this breakpoint was created by the server in seconds resolution. */
  var createTime: js.UndefOr[String] = js.undefined
  
  /**
    * Values of evaluated expressions at breakpoint time. The evaluated expressions appear in exactly the same order they are listed in the `expressions` field. The `name` field holds the
    * original expression text, the `value` or `members` field holds the result of the evaluated expression. If the expression cannot be evaluated, the `status` inside the `Variable` will
    * indicate an error and contain the error text.
    */
  var evaluatedExpressions: js.UndefOr[js.Array[Variable]] = js.undefined
  
  /**
    * List of read-only expressions to evaluate at the breakpoint location. The expressions are composed using expressions in the programming language at the source location. If the
    * breakpoint action is `LOG`, the evaluated expressions are included in log statements.
    */
  var expressions: js.UndefOr[js.Array[String]] = js.undefined
  
  /** Time this breakpoint was finalized as seen by the server in seconds resolution. */
  var finalTime: js.UndefOr[String] = js.undefined
  
  /** Breakpoint identifier, unique in the scope of the debuggee. */
  var id: js.UndefOr[String] = js.undefined
  
  /** When true, indicates that this is a final result and the breakpoint state will not change from here on. */
  var isFinalState: js.UndefOr[Boolean] = js.undefined
  
  /** A set of custom breakpoint properties, populated by the agent, to be displayed to the user. */
  var labels: js.UndefOr[
    /* import warning: importer.ImportType#apply Failed type conversion: {[ P in string ]: string} */ js.Any
  ] = js.undefined
  
  /** Breakpoint source location. */
  var location: js.UndefOr[SourceLocation] = js.undefined
  
  /** Indicates the severity of the log. Only relevant when action is `LOG`. */
  var logLevel: js.UndefOr[String] = js.undefined
  
  /**
    * Only relevant when action is `LOG`. Defines the message to log when the breakpoint hits. The message may include parameter placeholders `$0`, `$1`, etc. These placeholders are
    * replaced with the evaluated value of the appropriate expression. Expressions not referenced in `log_message_format` are not logged. Example: `Message received, id = $0, count = $1`
    * with `expressions` = `[ message.id, message.count ]`.
    */
  var logMessageFormat: js.UndefOr[String] = js.undefined
  
  /** The stack at breakpoint time, where stack_frames[0] represents the most recently entered function. */
  var stackFrames: js.UndefOr[js.Array[StackFrame]] = js.undefined
  
  /** The current state of the breakpoint. */
  var state: js.UndefOr[String] = js.undefined
  
  /**
    * Breakpoint status. The status includes an error flag and a human readable message. This field is usually unset. The message can be either informational or an error message.
    * Regardless, clients should always display the text message back to the user. Error status indicates complete failure of the breakpoint. Example (non-final state): `Still loading
    * symbols...` Examples (final state): * `Invalid line number` referring to location * `Field f not found in class C` referring to condition
    */
  var status: js.UndefOr[StatusMessage] = js.undefined
  
  /** E-mail address of the user that created this breakpoint */
  var userEmail: js.UndefOr[String] = js.undefined
  
  /**
    * The `variable_table` exists to aid with computation, memory and network traffic optimization. It enables storing a variable once and reference it from multiple variables, including
    * variables stored in the `variable_table` itself. For example, the same `this` object, which may appear at many levels of the stack, can have all of its data stored once in this
    * table. The stack frame variables then would hold only a reference to it. The variable `var_table_index` field is an index into this repeated field. The stored objects are nameless
    * and get their name from the referencing variable. The effective variable is a merge of the referencing variable and the referenced variable.
    */
  var variableTable: js.UndefOr[js.Array[Variable]] = js.undefined
}
object Breakpoint {
  
  inline def apply(): Breakpoint = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Breakpoint]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Breakpoint] (val x: Self) extends AnyVal {
    
    inline def setAction(value: String): Self = StObject.set(x, "action", value.asInstanceOf[js.Any])
    
    inline def setActionUndefined: Self = StObject.set(x, "action", js.undefined)
    
    inline def setCanaryExpireTime(value: String): Self = StObject.set(x, "canaryExpireTime", value.asInstanceOf[js.Any])
    
    inline def setCanaryExpireTimeUndefined: Self = StObject.set(x, "canaryExpireTime", js.undefined)
    
    inline def setCondition(value: String): Self = StObject.set(x, "condition", value.asInstanceOf[js.Any])
    
    inline def setConditionUndefined: Self = StObject.set(x, "condition", js.undefined)
    
    inline def setCreateTime(value: String): Self = StObject.set(x, "createTime", value.asInstanceOf[js.Any])
    
    inline def setCreateTimeUndefined: Self = StObject.set(x, "createTime", js.undefined)
    
    inline def setEvaluatedExpressions(value: js.Array[Variable]): Self = StObject.set(x, "evaluatedExpressions", value.asInstanceOf[js.Any])
    
    inline def setEvaluatedExpressionsUndefined: Self = StObject.set(x, "evaluatedExpressions", js.undefined)
    
    inline def setEvaluatedExpressionsVarargs(value: Variable*): Self = StObject.set(x, "evaluatedExpressions", js.Array(value*))
    
    inline def setExpressions(value: js.Array[String]): Self = StObject.set(x, "expressions", value.asInstanceOf[js.Any])
    
    inline def setExpressionsUndefined: Self = StObject.set(x, "expressions", js.undefined)
    
    inline def setExpressionsVarargs(value: String*): Self = StObject.set(x, "expressions", js.Array(value*))
    
    inline def setFinalTime(value: String): Self = StObject.set(x, "finalTime", value.asInstanceOf[js.Any])
    
    inline def setFinalTimeUndefined: Self = StObject.set(x, "finalTime", js.undefined)
    
    inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    
    inline def setIsFinalState(value: Boolean): Self = StObject.set(x, "isFinalState", value.asInstanceOf[js.Any])
    
    inline def setIsFinalStateUndefined: Self = StObject.set(x, "isFinalState", js.undefined)
    
    inline def setLabels(
      value: /* import warning: importer.ImportType#apply Failed type conversion: {[ P in string ]: string} */ js.Any
    ): Self = StObject.set(x, "labels", value.asInstanceOf[js.Any])
    
    inline def setLabelsUndefined: Self = StObject.set(x, "labels", js.undefined)
    
    inline def setLocation(value: SourceLocation): Self = StObject.set(x, "location", value.asInstanceOf[js.Any])
    
    inline def setLocationUndefined: Self = StObject.set(x, "location", js.undefined)
    
    inline def setLogLevel(value: String): Self = StObject.set(x, "logLevel", value.asInstanceOf[js.Any])
    
    inline def setLogLevelUndefined: Self = StObject.set(x, "logLevel", js.undefined)
    
    inline def setLogMessageFormat(value: String): Self = StObject.set(x, "logMessageFormat", value.asInstanceOf[js.Any])
    
    inline def setLogMessageFormatUndefined: Self = StObject.set(x, "logMessageFormat", js.undefined)
    
    inline def setStackFrames(value: js.Array[StackFrame]): Self = StObject.set(x, "stackFrames", value.asInstanceOf[js.Any])
    
    inline def setStackFramesUndefined: Self = StObject.set(x, "stackFrames", js.undefined)
    
    inline def setStackFramesVarargs(value: StackFrame*): Self = StObject.set(x, "stackFrames", js.Array(value*))
    
    inline def setState(value: String): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
    
    inline def setStateUndefined: Self = StObject.set(x, "state", js.undefined)
    
    inline def setStatus(value: StatusMessage): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
    inline def setStatusUndefined: Self = StObject.set(x, "status", js.undefined)
    
    inline def setUserEmail(value: String): Self = StObject.set(x, "userEmail", value.asInstanceOf[js.Any])
    
    inline def setUserEmailUndefined: Self = StObject.set(x, "userEmail", js.undefined)
    
    inline def setVariableTable(value: js.Array[Variable]): Self = StObject.set(x, "variableTable", value.asInstanceOf[js.Any])
    
    inline def setVariableTableUndefined: Self = StObject.set(x, "variableTable", js.undefined)
    
    inline def setVariableTableVarargs(value: Variable*): Self = StObject.set(x, "variableTable", js.Array(value*))
  }
}
