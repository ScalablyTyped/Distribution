package typings.jestMessageUtil

import typings.jestMessageUtil.anon.Message
import typings.jestMessageUtil.anon.PickProjectConfigrootDirt
import typings.jestMessageUtil.typesMod.Frame
import typings.jestTestResult.typesMod.AssertionResult
import typings.jestTestResult.typesMod.SerializableError
import typings.jestTypes.configMod.Glob
import typings.jestTypes.configMod.Path
import typings.std.Error
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("jest-message-util", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def formatExecError(error: String, config: PickProjectConfigrootDirt, options: StackTraceOptions): String = (^.asInstanceOf[js.Dynamic].applyDynamic("formatExecError")(error.asInstanceOf[js.Any], config.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[String]
  @scala.inline
  def formatExecError(error: String, config: PickProjectConfigrootDirt, options: StackTraceOptions, testPath: String): String = (^.asInstanceOf[js.Dynamic].applyDynamic("formatExecError")(error.asInstanceOf[js.Any], config.asInstanceOf[js.Any], options.asInstanceOf[js.Any], testPath.asInstanceOf[js.Any])).asInstanceOf[String]
  @scala.inline
  def formatExecError(
    error: String,
    config: PickProjectConfigrootDirt,
    options: StackTraceOptions,
    testPath: String,
    reuseMessage: Boolean
  ): String = (^.asInstanceOf[js.Dynamic].applyDynamic("formatExecError")(error.asInstanceOf[js.Any], config.asInstanceOf[js.Any], options.asInstanceOf[js.Any], testPath.asInstanceOf[js.Any], reuseMessage.asInstanceOf[js.Any])).asInstanceOf[String]
  @scala.inline
  def formatExecError(
    error: String,
    config: PickProjectConfigrootDirt,
    options: StackTraceOptions,
    testPath: Unit,
    reuseMessage: Boolean
  ): String = (^.asInstanceOf[js.Dynamic].applyDynamic("formatExecError")(error.asInstanceOf[js.Any], config.asInstanceOf[js.Any], options.asInstanceOf[js.Any], testPath.asInstanceOf[js.Any], reuseMessage.asInstanceOf[js.Any])).asInstanceOf[String]
  @scala.inline
  def formatExecError(error: Unit, config: PickProjectConfigrootDirt, options: StackTraceOptions): String = (^.asInstanceOf[js.Dynamic].applyDynamic("formatExecError")(error.asInstanceOf[js.Any], config.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[String]
  @scala.inline
  def formatExecError(error: Unit, config: PickProjectConfigrootDirt, options: StackTraceOptions, testPath: String): String = (^.asInstanceOf[js.Dynamic].applyDynamic("formatExecError")(error.asInstanceOf[js.Any], config.asInstanceOf[js.Any], options.asInstanceOf[js.Any], testPath.asInstanceOf[js.Any])).asInstanceOf[String]
  @scala.inline
  def formatExecError(
    error: Unit,
    config: PickProjectConfigrootDirt,
    options: StackTraceOptions,
    testPath: String,
    reuseMessage: Boolean
  ): String = (^.asInstanceOf[js.Dynamic].applyDynamic("formatExecError")(error.asInstanceOf[js.Any], config.asInstanceOf[js.Any], options.asInstanceOf[js.Any], testPath.asInstanceOf[js.Any], reuseMessage.asInstanceOf[js.Any])).asInstanceOf[String]
  @scala.inline
  def formatExecError(
    error: Unit,
    config: PickProjectConfigrootDirt,
    options: StackTraceOptions,
    testPath: Unit,
    reuseMessage: Boolean
  ): String = (^.asInstanceOf[js.Dynamic].applyDynamic("formatExecError")(error.asInstanceOf[js.Any], config.asInstanceOf[js.Any], options.asInstanceOf[js.Any], testPath.asInstanceOf[js.Any], reuseMessage.asInstanceOf[js.Any])).asInstanceOf[String]
  @scala.inline
  def formatExecError(error: SerializableError, config: PickProjectConfigrootDirt, options: StackTraceOptions): String = (^.asInstanceOf[js.Dynamic].applyDynamic("formatExecError")(error.asInstanceOf[js.Any], config.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[String]
  @scala.inline
  def formatExecError(
    error: SerializableError,
    config: PickProjectConfigrootDirt,
    options: StackTraceOptions,
    testPath: String
  ): String = (^.asInstanceOf[js.Dynamic].applyDynamic("formatExecError")(error.asInstanceOf[js.Any], config.asInstanceOf[js.Any], options.asInstanceOf[js.Any], testPath.asInstanceOf[js.Any])).asInstanceOf[String]
  @scala.inline
  def formatExecError(
    error: SerializableError,
    config: PickProjectConfigrootDirt,
    options: StackTraceOptions,
    testPath: String,
    reuseMessage: Boolean
  ): String = (^.asInstanceOf[js.Dynamic].applyDynamic("formatExecError")(error.asInstanceOf[js.Any], config.asInstanceOf[js.Any], options.asInstanceOf[js.Any], testPath.asInstanceOf[js.Any], reuseMessage.asInstanceOf[js.Any])).asInstanceOf[String]
  @scala.inline
  def formatExecError(
    error: SerializableError,
    config: PickProjectConfigrootDirt,
    options: StackTraceOptions,
    testPath: Unit,
    reuseMessage: Boolean
  ): String = (^.asInstanceOf[js.Dynamic].applyDynamic("formatExecError")(error.asInstanceOf[js.Any], config.asInstanceOf[js.Any], options.asInstanceOf[js.Any], testPath.asInstanceOf[js.Any], reuseMessage.asInstanceOf[js.Any])).asInstanceOf[String]
  @scala.inline
  def formatExecError(error: Error, config: PickProjectConfigrootDirt, options: StackTraceOptions): String = (^.asInstanceOf[js.Dynamic].applyDynamic("formatExecError")(error.asInstanceOf[js.Any], config.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[String]
  @scala.inline
  def formatExecError(error: Error, config: PickProjectConfigrootDirt, options: StackTraceOptions, testPath: String): String = (^.asInstanceOf[js.Dynamic].applyDynamic("formatExecError")(error.asInstanceOf[js.Any], config.asInstanceOf[js.Any], options.asInstanceOf[js.Any], testPath.asInstanceOf[js.Any])).asInstanceOf[String]
  @scala.inline
  def formatExecError(
    error: Error,
    config: PickProjectConfigrootDirt,
    options: StackTraceOptions,
    testPath: String,
    reuseMessage: Boolean
  ): String = (^.asInstanceOf[js.Dynamic].applyDynamic("formatExecError")(error.asInstanceOf[js.Any], config.asInstanceOf[js.Any], options.asInstanceOf[js.Any], testPath.asInstanceOf[js.Any], reuseMessage.asInstanceOf[js.Any])).asInstanceOf[String]
  @scala.inline
  def formatExecError(
    error: Error,
    config: PickProjectConfigrootDirt,
    options: StackTraceOptions,
    testPath: Unit,
    reuseMessage: Boolean
  ): String = (^.asInstanceOf[js.Dynamic].applyDynamic("formatExecError")(error.asInstanceOf[js.Any], config.asInstanceOf[js.Any], options.asInstanceOf[js.Any], testPath.asInstanceOf[js.Any], reuseMessage.asInstanceOf[js.Any])).asInstanceOf[String]
  
  @scala.inline
  def formatResultsErrors(
    testResults: js.Array[AssertionResult],
    config: PickProjectConfigrootDirt,
    options: StackTraceOptions
  ): String | Null = (^.asInstanceOf[js.Dynamic].applyDynamic("formatResultsErrors")(testResults.asInstanceOf[js.Any], config.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[String | Null]
  @scala.inline
  def formatResultsErrors(
    testResults: js.Array[AssertionResult],
    config: PickProjectConfigrootDirt,
    options: StackTraceOptions,
    testPath: String
  ): String | Null = (^.asInstanceOf[js.Dynamic].applyDynamic("formatResultsErrors")(testResults.asInstanceOf[js.Any], config.asInstanceOf[js.Any], options.asInstanceOf[js.Any], testPath.asInstanceOf[js.Any])).asInstanceOf[String | Null]
  
  @scala.inline
  def formatStackTrace(stack: String, config: PickProjectConfigrootDirt, options: StackTraceOptions): String = (^.asInstanceOf[js.Dynamic].applyDynamic("formatStackTrace")(stack.asInstanceOf[js.Any], config.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[String]
  @scala.inline
  def formatStackTrace(stack: String, config: PickProjectConfigrootDirt, options: StackTraceOptions, testPath: String): String = (^.asInstanceOf[js.Dynamic].applyDynamic("formatStackTrace")(stack.asInstanceOf[js.Any], config.asInstanceOf[js.Any], options.asInstanceOf[js.Any], testPath.asInstanceOf[js.Any])).asInstanceOf[String]
  
  @scala.inline
  def getStackTraceLines(stack: String): js.Array[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("getStackTraceLines")(stack.asInstanceOf[js.Any]).asInstanceOf[js.Array[String]]
  @scala.inline
  def getStackTraceLines(stack: String, options: StackTraceOptions): js.Array[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("getStackTraceLines")(stack.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Array[String]]
  
  @scala.inline
  def getTopFrame(lines: js.Array[String]): Frame | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("getTopFrame")(lines.asInstanceOf[js.Any]).asInstanceOf[Frame | Null]
  
  @scala.inline
  def separateMessageFromStack(content: String): Message = ^.asInstanceOf[js.Dynamic].applyDynamic("separateMessageFromStack")(content.asInstanceOf[js.Any]).asInstanceOf[Message]
  
  /* Inlined std.Pick<@jest/types.@jest/types.Config.ProjectConfig, 'rootDir' | 'testMatch'> */
  trait StackTraceConfig extends StObject {
    
    var rootDir: Path
    
    var testMatch: js.Array[Glob]
  }
  object StackTraceConfig {
    
    @scala.inline
    def apply(rootDir: Path, testMatch: js.Array[Glob]): StackTraceConfig = {
      val __obj = js.Dynamic.literal(rootDir = rootDir.asInstanceOf[js.Any], testMatch = testMatch.asInstanceOf[js.Any])
      __obj.asInstanceOf[StackTraceConfig]
    }
    
    @scala.inline
    implicit class StackTraceConfigMutableBuilder[Self <: StackTraceConfig] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setRootDir(value: Path): Self = StObject.set(x, "rootDir", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTestMatch(value: js.Array[Glob]): Self = StObject.set(x, "testMatch", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTestMatchVarargs(value: Glob*): Self = StObject.set(x, "testMatch", js.Array(value :_*))
    }
  }
  
  trait StackTraceOptions extends StObject {
    
    var noStackTrace: Boolean
  }
  object StackTraceOptions {
    
    @scala.inline
    def apply(noStackTrace: Boolean): StackTraceOptions = {
      val __obj = js.Dynamic.literal(noStackTrace = noStackTrace.asInstanceOf[js.Any])
      __obj.asInstanceOf[StackTraceOptions]
    }
    
    @scala.inline
    implicit class StackTraceOptionsMutableBuilder[Self <: StackTraceOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setNoStackTrace(value: Boolean): Self = StObject.set(x, "noStackTrace", value.asInstanceOf[js.Any])
    }
  }
}
