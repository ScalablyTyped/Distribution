package typings.listr2.mod

import typings.listr2.listr2Booleans.`false`
import typings.listr2.listr2Strings.duration
import typings.listr2.listr2Strings.error
import typings.listr2.listr2Strings.paused
import typings.listr2.listr2Strings.retry
import typings.listr2.listr2Strings.rollback
import typings.listr2.listr2Strings.skip
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListrTestRendererOptions
  extends StObject
     with RendererLoggerOptions[ListrLogLevels] {
  
  /**
    * Log given messages.
    */
  var messages: js.UndefOr[js.Array[duration | error | skip | rollback | retry | paused]] = js.undefined
  
  /**
    * Log given messages to stderr instead of stdout.
    */
  var messagesToStderr: js.UndefOr[js.Array[duration | error | skip | rollback | retry | paused]] = js.undefined
  
  /**
    * Log output.
    */
  var output: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Log prompt.
    */
  var prompt: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Log given task states.
    */
  var state: js.UndefOr[js.Array[ListrTaskState]] = js.undefined
  
  /**
    * Log subtasks.
    *
    * @defaultValue `true`
    */
  var subtasks: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Serialize the given properties of the task inside the logs.
    */
  var task: js.UndefOr[`false` | js.Array[TestRendererSerializerTaskKeys]] = js.undefined
  
  /**
    * Log title changes.
    */
  var title: js.UndefOr[Boolean] = js.undefined
}
object ListrTestRendererOptions {
  
  inline def apply(): ListrTestRendererOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListrTestRendererOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ListrTestRendererOptions] (val x: Self) extends AnyVal {
    
    inline def setMessages(value: js.Array[duration | error | skip | rollback | retry | paused]): Self = StObject.set(x, "messages", value.asInstanceOf[js.Any])
    
    inline def setMessagesToStderr(value: js.Array[duration | error | skip | rollback | retry | paused]): Self = StObject.set(x, "messagesToStderr", value.asInstanceOf[js.Any])
    
    inline def setMessagesToStderrUndefined: Self = StObject.set(x, "messagesToStderr", js.undefined)
    
    inline def setMessagesToStderrVarargs(value: (duration | error | skip | rollback | retry | paused)*): Self = StObject.set(x, "messagesToStderr", js.Array(value*))
    
    inline def setMessagesUndefined: Self = StObject.set(x, "messages", js.undefined)
    
    inline def setMessagesVarargs(value: (duration | error | skip | rollback | retry | paused)*): Self = StObject.set(x, "messages", js.Array(value*))
    
    inline def setOutput(value: Boolean): Self = StObject.set(x, "output", value.asInstanceOf[js.Any])
    
    inline def setOutputUndefined: Self = StObject.set(x, "output", js.undefined)
    
    inline def setPrompt(value: Boolean): Self = StObject.set(x, "prompt", value.asInstanceOf[js.Any])
    
    inline def setPromptUndefined: Self = StObject.set(x, "prompt", js.undefined)
    
    inline def setState(value: js.Array[ListrTaskState]): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
    
    inline def setStateUndefined: Self = StObject.set(x, "state", js.undefined)
    
    inline def setStateVarargs(value: ListrTaskState*): Self = StObject.set(x, "state", js.Array(value*))
    
    inline def setSubtasks(value: Boolean): Self = StObject.set(x, "subtasks", value.asInstanceOf[js.Any])
    
    inline def setSubtasksUndefined: Self = StObject.set(x, "subtasks", js.undefined)
    
    inline def setTask(value: `false` | js.Array[TestRendererSerializerTaskKeys]): Self = StObject.set(x, "task", value.asInstanceOf[js.Any])
    
    inline def setTaskUndefined: Self = StObject.set(x, "task", js.undefined)
    
    inline def setTaskVarargs(value: TestRendererSerializerTaskKeys*): Self = StObject.set(x, "task", js.Array(value*))
    
    inline def setTitle(value: Boolean): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
    
    inline def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
  }
}
