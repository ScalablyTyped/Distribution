package typings.googleapis.remotebuildexecutionV2Mod.remotebuildexecutionV2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * An `ExecutionPolicy` can be used to control the scheduling of the action.
  */
trait SchemaBuildBazelRemoteExecutionV2ExecutionPolicy extends StObject {
  
  /**
    * The priority (relative importance) of this action. Generally, a lower
    * value means that the action should be run sooner than actions having a
    * greater priority value, but the interpretation of a given value is
    * server- dependent. A priority of 0 means the *default* priority.
    * Priorities may be positive or negative, and such actions should run later
    * or sooner than actions having the default priority, respectively. The
    * particular semantics of this field is up to the server. In particular,
    * every server will have their own supported range of priorities, and will
    * decide how these map into scheduling policy.
    */
  var priority: js.UndefOr[Double] = js.undefined
}
object SchemaBuildBazelRemoteExecutionV2ExecutionPolicy {
  
  @scala.inline
  def apply(): SchemaBuildBazelRemoteExecutionV2ExecutionPolicy = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaBuildBazelRemoteExecutionV2ExecutionPolicy]
  }
  
  @scala.inline
  implicit class SchemaBuildBazelRemoteExecutionV2ExecutionPolicyMutableBuilder[Self <: SchemaBuildBazelRemoteExecutionV2ExecutionPolicy] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setPriority(value: Double): Self = StObject.set(x, "priority", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPriorityUndefined: Self = StObject.set(x, "priority", js.undefined)
  }
}
