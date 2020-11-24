package typings.maximMazurokGapiClientClouddebugger.gapi.client.clouddebugger

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Breakpoint extends js.Object {
  
  /** Action that the agent should perform when the code at the breakpoint location is hit. */
  var action: js.UndefOr[String] = js.native
  
  /** The deadline for the breakpoint to stay in CANARY_ACTIVE state. The value is meaningless when the breakpoint is not in CANARY_ACTIVE state. */
  var canaryExpireTime: js.UndefOr[String] = js.native
  
  /** Condition that triggers the breakpoint. The condition is a compound boolean expression composed using expressions in a programming language at the source location. */
  var condition: js.UndefOr[String] = js.native
  
  /** Time this breakpoint was created by the server in seconds resolution. */
  var createTime: js.UndefOr[String] = js.native
  
  /**
    * Values of evaluated expressions at breakpoint time. The evaluated expressions appear in exactly the same order they are listed in the `expressions` field. The `name` field holds the
    * original expression text, the `value` or `members` field holds the result of the evaluated expression. If the expression cannot be evaluated, the `status` inside the `Variable` will
    * indicate an error and contain the error text.
    */
  var evaluatedExpressions: js.UndefOr[js.Array[Variable]] = js.native
  
  /**
    * List of read-only expressions to evaluate at the breakpoint location. The expressions are composed using expressions in the programming language at the source location. If the
    * breakpoint action is `LOG`, the evaluated expressions are included in log statements.
    */
  var expressions: js.UndefOr[js.Array[String]] = js.native
  
  /** Time this breakpoint was finalized as seen by the server in seconds resolution. */
  var finalTime: js.UndefOr[String] = js.native
  
  /** Breakpoint identifier, unique in the scope of the debuggee. */
  var id: js.UndefOr[String] = js.native
  
  /** When true, indicates that this is a final result and the breakpoint state will not change from here on. */
  var isFinalState: js.UndefOr[Boolean] = js.native
  
  /** A set of custom breakpoint properties, populated by the agent, to be displayed to the user. */
  var labels: js.UndefOr[
    /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ P in string ]: string}
    */ typings.maximMazurokGapiClientClouddebugger.maximMazurokGapiClientClouddebuggerStrings.Breakpoint with TopLevel[js.Any]
  ] = js.native
  
  /** Breakpoint source location. */
  var location: js.UndefOr[SourceLocation] = js.native
  
  /** Indicates the severity of the log. Only relevant when action is `LOG`. */
  var logLevel: js.UndefOr[String] = js.native
  
  /**
    * Only relevant when action is `LOG`. Defines the message to log when the breakpoint hits. The message may include parameter placeholders `$0`, `$1`, etc. These placeholders are
    * replaced with the evaluated value of the appropriate expression. Expressions not referenced in `log_message_format` are not logged. Example: `Message received, id = $0, count = $1`
    * with `expressions` = `[ message.id, message.count ]`.
    */
  var logMessageFormat: js.UndefOr[String] = js.native
  
  /** The stack at breakpoint time, where stack_frames[0] represents the most recently entered function. */
  var stackFrames: js.UndefOr[js.Array[StackFrame]] = js.native
  
  /** The current state of the breakpoint. */
  var state: js.UndefOr[String] = js.native
  
  /**
    * Breakpoint status. The status includes an error flag and a human readable message. This field is usually unset. The message can be either informational or an error message.
    * Regardless, clients should always display the text message back to the user. Error status indicates complete failure of the breakpoint. Example (non-final state): `Still loading
    * symbols...` Examples (final state): * `Invalid line number` referring to location * `Field f not found in class C` referring to condition
    */
  var status: js.UndefOr[StatusMessage] = js.native
  
  /** E-mail address of the user that created this breakpoint */
  var userEmail: js.UndefOr[String] = js.native
  
  /**
    * The `variable_table` exists to aid with computation, memory and network traffic optimization. It enables storing a variable once and reference it from multiple variables, including
    * variables stored in the `variable_table` itself. For example, the same `this` object, which may appear at many levels of the stack, can have all of its data stored once in this
    * table. The stack frame variables then would hold only a reference to it. The variable `var_table_index` field is an index into this repeated field. The stored objects are nameless
    * and get their name from the referencing variable. The effective variable is a merge of the referencing variable and the referenced variable.
    */
  var variableTable: js.UndefOr[js.Array[Variable]] = js.native
}
object Breakpoint {
  
  @scala.inline
  def apply(): Breakpoint = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Breakpoint]
  }
  
  @scala.inline
  implicit class BreakpointOps[Self <: Breakpoint] (val x: Self) extends AnyVal {
    
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
    def setAction(value: String): Self = this.set("action", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAction: Self = this.set("action", js.undefined)
    
    @scala.inline
    def setCanaryExpireTime(value: String): Self = this.set("canaryExpireTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCanaryExpireTime: Self = this.set("canaryExpireTime", js.undefined)
    
    @scala.inline
    def setCondition(value: String): Self = this.set("condition", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCondition: Self = this.set("condition", js.undefined)
    
    @scala.inline
    def setCreateTime(value: String): Self = this.set("createTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCreateTime: Self = this.set("createTime", js.undefined)
    
    @scala.inline
    def setEvaluatedExpressionsVarargs(value: Variable*): Self = this.set("evaluatedExpressions", js.Array(value :_*))
    
    @scala.inline
    def setEvaluatedExpressions(value: js.Array[Variable]): Self = this.set("evaluatedExpressions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEvaluatedExpressions: Self = this.set("evaluatedExpressions", js.undefined)
    
    @scala.inline
    def setExpressionsVarargs(value: String*): Self = this.set("expressions", js.Array(value :_*))
    
    @scala.inline
    def setExpressions(value: js.Array[String]): Self = this.set("expressions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteExpressions: Self = this.set("expressions", js.undefined)
    
    @scala.inline
    def setFinalTime(value: String): Self = this.set("finalTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFinalTime: Self = this.set("finalTime", js.undefined)
    
    @scala.inline
    def setId(value: String): Self = this.set("id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteId: Self = this.set("id", js.undefined)
    
    @scala.inline
    def setIsFinalState(value: Boolean): Self = this.set("isFinalState", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIsFinalState: Self = this.set("isFinalState", js.undefined)
    
    @scala.inline
    def setLabels(
      value: /* import warning: importer.ImportType#apply c Unsupported type mapping: 
    {[ P in string ]: string}
      */ typings.maximMazurokGapiClientClouddebugger.maximMazurokGapiClientClouddebuggerStrings.Breakpoint with TopLevel[js.Any]
    ): Self = this.set("labels", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLabels: Self = this.set("labels", js.undefined)
    
    @scala.inline
    def setLocation(value: SourceLocation): Self = this.set("location", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLocation: Self = this.set("location", js.undefined)
    
    @scala.inline
    def setLogLevel(value: String): Self = this.set("logLevel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLogLevel: Self = this.set("logLevel", js.undefined)
    
    @scala.inline
    def setLogMessageFormat(value: String): Self = this.set("logMessageFormat", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLogMessageFormat: Self = this.set("logMessageFormat", js.undefined)
    
    @scala.inline
    def setStackFramesVarargs(value: StackFrame*): Self = this.set("stackFrames", js.Array(value :_*))
    
    @scala.inline
    def setStackFrames(value: js.Array[StackFrame]): Self = this.set("stackFrames", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStackFrames: Self = this.set("stackFrames", js.undefined)
    
    @scala.inline
    def setState(value: String): Self = this.set("state", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteState: Self = this.set("state", js.undefined)
    
    @scala.inline
    def setStatus(value: StatusMessage): Self = this.set("status", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStatus: Self = this.set("status", js.undefined)
    
    @scala.inline
    def setUserEmail(value: String): Self = this.set("userEmail", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUserEmail: Self = this.set("userEmail", js.undefined)
    
    @scala.inline
    def setVariableTableVarargs(value: Variable*): Self = this.set("variableTable", js.Array(value :_*))
    
    @scala.inline
    def setVariableTable(value: js.Array[Variable]): Self = this.set("variableTable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteVariableTable: Self = this.set("variableTable", js.undefined)
  }
}
