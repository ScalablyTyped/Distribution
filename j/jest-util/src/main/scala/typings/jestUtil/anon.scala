package typings.jestUtil

import org.scalablytyped.runtime.Instantiable1
import typings.jestConsole.mod.BufferedConsole
import typings.jestConsole.typesMod.ConsoleBuffer
import typings.jestConsole.typesMod.LogEntry
import typings.jestConsole.typesMod.LogMessage
import typings.jestConsole.typesMod.LogType
import typings.jestSourceMap.typesMod.SourceMapRegistry
import typings.jestTestResult.typesMod.AggregatedResult
import typings.jestTestResult.typesMod.CodeCoverageFormatter
import typings.jestTestResult.typesMod.CodeCoverageReporter
import typings.jestTestResult.typesMod.FormattedTestResults
import typings.jestUtil.deepCyclicCopyMod.DeepCyclicCopyOptions
import typings.node.NodeJS.WritableStream
import typings.std.WeakMap
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  @js.native
  trait Failed extends StObject {
    
    var failed: String = js.native
    
    var pending: String = js.native
    
    var success: String = js.native
    
    var todo: String = js.native
  }
  object Failed {
    
    @scala.inline
    def apply(failed: String, pending: String, success: String, todo: String): Failed = {
      val __obj = js.Dynamic.literal(failed = failed.asInstanceOf[js.Any], pending = pending.asInstanceOf[js.Any], success = success.asInstanceOf[js.Any], todo = todo.asInstanceOf[js.Any])
      __obj.asInstanceOf[Failed]
    }
    
    @scala.inline
    implicit class FailedMutableBuilder[Self <: Failed] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setFailed(value: String): Self = StObject.set(x, "failed", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPending(value: String): Self = StObject.set(x, "pending", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSuccess(value: String): Self = StObject.set(x, "success", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTodo(value: String): Self = StObject.set(x, "todo", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait FnCall extends StObject {
    
    def apply(descriptor: js.UndefOr[scala.Nothing]): js.UndefOr[String] = js.native
    def apply(descriptor: String): String = js.native
    def apply(descriptor: js.Function): js.Function | String = js.native
    def apply(descriptor: Double): Double | String = js.native
  }
  
  @js.native
  trait FnCallResultsCodeCoverageFormatterReporter extends StObject {
    
    def apply(results: AggregatedResult): FormattedTestResults = js.native
    def apply(
      results: AggregatedResult,
      codeCoverageFormatter: js.UndefOr[scala.Nothing],
      reporter: CodeCoverageReporter
    ): FormattedTestResults = js.native
    def apply(results: AggregatedResult, codeCoverageFormatter: CodeCoverageFormatter): FormattedTestResults = js.native
    def apply(
      results: AggregatedResult,
      codeCoverageFormatter: CodeCoverageFormatter,
      reporter: CodeCoverageReporter
    ): FormattedTestResults = js.native
  }
  
  @js.native
  trait FnCallValueOptionsCycles extends StObject {
    
    def apply[T](value: T): T = js.native
    def apply[T](value: T, options: js.UndefOr[scala.Nothing], cycles: WeakMap[_, _]): T = js.native
    def apply[T](value: T, options: DeepCyclicCopyOptions): T = js.native
    def apply[T](value: T, options: DeepCyclicCopyOptions, cycles: WeakMap[_, _]): T = js.native
  }
  
  @js.native
  trait TypeofBufferedConsole
    extends Instantiable1[
          /* getSourceMaps */ js.Function0[js.UndefOr[SourceMapRegistry | Null]], 
          BufferedConsole
        ] {
    
    def write(buffer: ConsoleBuffer, `type`: LogType, message: LogMessage): js.Array[LogEntry] = js.native
    def write(
      buffer: ConsoleBuffer,
      `type`: LogType,
      message: LogMessage,
      level: js.UndefOr[scala.Nothing],
      sourceMaps: SourceMapRegistry
    ): js.Array[LogEntry] = js.native
    def write(buffer: ConsoleBuffer, `type`: LogType, message: LogMessage, level: Double): js.Array[LogEntry] = js.native
    def write(
      buffer: ConsoleBuffer,
      `type`: LogType,
      message: LogMessage,
      level: Double,
      sourceMaps: SourceMapRegistry
    ): js.Array[LogEntry] = js.native
    def write(
      buffer: ConsoleBuffer,
      `type`: LogType,
      message: LogMessage,
      level: Null,
      sourceMaps: SourceMapRegistry
    ): js.Array[LogEntry] = js.native
  }
  
  @js.native
  trait TypeofpreRunMessage extends StObject {
    
    def print(stream: WritableStream): Unit = js.native
    
    def remove(stream: WritableStream): Unit = js.native
  }
  object TypeofpreRunMessage {
    
    @scala.inline
    def apply(print: WritableStream => Unit, remove: WritableStream => Unit): TypeofpreRunMessage = {
      val __obj = js.Dynamic.literal(print = js.Any.fromFunction1(print), remove = js.Any.fromFunction1(remove))
      __obj.asInstanceOf[TypeofpreRunMessage]
    }
    
    @scala.inline
    implicit class TypeofpreRunMessageMutableBuilder[Self <: TypeofpreRunMessage] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setPrint(value: WritableStream => Unit): Self = StObject.set(x, "print", js.Any.fromFunction1(value))
      
      @scala.inline
      def setRemove(value: WritableStream => Unit): Self = StObject.set(x, "remove", js.Any.fromFunction1(value))
    }
  }
  
  @js.native
  trait TypeofspecialChars extends StObject {
    
    val ARROW: /* " \\u203A " */ String = js.native
    
    val CLEAR: String = js.native
    
    val ICONS: Failed = js.native
  }
  object TypeofspecialChars {
    
    @scala.inline
    def apply(ARROW: /* " \\u203A " */ String, CLEAR: String, ICONS: Failed): TypeofspecialChars = {
      val __obj = js.Dynamic.literal(ARROW = ARROW.asInstanceOf[js.Any], CLEAR = CLEAR.asInstanceOf[js.Any], ICONS = ICONS.asInstanceOf[js.Any])
      __obj.asInstanceOf[TypeofspecialChars]
    }
    
    @scala.inline
    implicit class TypeofspecialCharsMutableBuilder[Self <: TypeofspecialChars] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setARROW(value: /* " \\u203A " */ String): Self = StObject.set(x, "ARROW", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCLEAR(value: String): Self = StObject.set(x, "CLEAR", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setICONS(value: Failed): Self = StObject.set(x, "ICONS", value.asInstanceOf[js.Any])
    }
  }
}
