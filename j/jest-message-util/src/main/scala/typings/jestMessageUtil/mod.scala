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
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("jest-message-util", "formatExecError")
  @js.native
  def formatExecError(error: js.UndefOr[scala.Nothing], config: PickProjectConfigrootDirt, options: StackTraceOptions): String = js.native
  @JSImport("jest-message-util", "formatExecError")
  @js.native
  def formatExecError(
    error: js.UndefOr[scala.Nothing],
    config: PickProjectConfigrootDirt,
    options: StackTraceOptions,
    testPath: js.UndefOr[scala.Nothing],
    reuseMessage: Boolean
  ): String = js.native
  @JSImport("jest-message-util", "formatExecError")
  @js.native
  def formatExecError(
    error: js.UndefOr[scala.Nothing],
    config: PickProjectConfigrootDirt,
    options: StackTraceOptions,
    testPath: String
  ): String = js.native
  @JSImport("jest-message-util", "formatExecError")
  @js.native
  def formatExecError(
    error: js.UndefOr[scala.Nothing],
    config: PickProjectConfigrootDirt,
    options: StackTraceOptions,
    testPath: String,
    reuseMessage: Boolean
  ): String = js.native
  @JSImport("jest-message-util", "formatExecError")
  @js.native
  def formatExecError(error: String, config: PickProjectConfigrootDirt, options: StackTraceOptions): String = js.native
  @JSImport("jest-message-util", "formatExecError")
  @js.native
  def formatExecError(
    error: String,
    config: PickProjectConfigrootDirt,
    options: StackTraceOptions,
    testPath: js.UndefOr[scala.Nothing],
    reuseMessage: Boolean
  ): String = js.native
  @JSImport("jest-message-util", "formatExecError")
  @js.native
  def formatExecError(error: String, config: PickProjectConfigrootDirt, options: StackTraceOptions, testPath: String): String = js.native
  @JSImport("jest-message-util", "formatExecError")
  @js.native
  def formatExecError(
    error: String,
    config: PickProjectConfigrootDirt,
    options: StackTraceOptions,
    testPath: String,
    reuseMessage: Boolean
  ): String = js.native
  @JSImport("jest-message-util", "formatExecError")
  @js.native
  def formatExecError(error: SerializableError, config: PickProjectConfigrootDirt, options: StackTraceOptions): String = js.native
  @JSImport("jest-message-util", "formatExecError")
  @js.native
  def formatExecError(
    error: SerializableError,
    config: PickProjectConfigrootDirt,
    options: StackTraceOptions,
    testPath: js.UndefOr[scala.Nothing],
    reuseMessage: Boolean
  ): String = js.native
  @JSImport("jest-message-util", "formatExecError")
  @js.native
  def formatExecError(
    error: SerializableError,
    config: PickProjectConfigrootDirt,
    options: StackTraceOptions,
    testPath: String
  ): String = js.native
  @JSImport("jest-message-util", "formatExecError")
  @js.native
  def formatExecError(
    error: SerializableError,
    config: PickProjectConfigrootDirt,
    options: StackTraceOptions,
    testPath: String,
    reuseMessage: Boolean
  ): String = js.native
  @JSImport("jest-message-util", "formatExecError")
  @js.native
  def formatExecError(error: Error, config: PickProjectConfigrootDirt, options: StackTraceOptions): String = js.native
  @JSImport("jest-message-util", "formatExecError")
  @js.native
  def formatExecError(
    error: Error,
    config: PickProjectConfigrootDirt,
    options: StackTraceOptions,
    testPath: js.UndefOr[scala.Nothing],
    reuseMessage: Boolean
  ): String = js.native
  @JSImport("jest-message-util", "formatExecError")
  @js.native
  def formatExecError(error: Error, config: PickProjectConfigrootDirt, options: StackTraceOptions, testPath: String): String = js.native
  @JSImport("jest-message-util", "formatExecError")
  @js.native
  def formatExecError(
    error: Error,
    config: PickProjectConfigrootDirt,
    options: StackTraceOptions,
    testPath: String,
    reuseMessage: Boolean
  ): String = js.native
  
  @JSImport("jest-message-util", "formatResultsErrors")
  @js.native
  def formatResultsErrors(
    testResults: js.Array[AssertionResult],
    config: PickProjectConfigrootDirt,
    options: StackTraceOptions
  ): String | Null = js.native
  @JSImport("jest-message-util", "formatResultsErrors")
  @js.native
  def formatResultsErrors(
    testResults: js.Array[AssertionResult],
    config: PickProjectConfigrootDirt,
    options: StackTraceOptions,
    testPath: String
  ): String | Null = js.native
  
  @JSImport("jest-message-util", "formatStackTrace")
  @js.native
  def formatStackTrace(stack: String, config: PickProjectConfigrootDirt, options: StackTraceOptions): String = js.native
  @JSImport("jest-message-util", "formatStackTrace")
  @js.native
  def formatStackTrace(stack: String, config: PickProjectConfigrootDirt, options: StackTraceOptions, testPath: String): String = js.native
  
  @JSImport("jest-message-util", "getStackTraceLines")
  @js.native
  def getStackTraceLines(stack: String): js.Array[String] = js.native
  @JSImport("jest-message-util", "getStackTraceLines")
  @js.native
  def getStackTraceLines(stack: String, options: StackTraceOptions): js.Array[String] = js.native
  
  @JSImport("jest-message-util", "getTopFrame")
  @js.native
  def getTopFrame(lines: js.Array[String]): Frame | Null = js.native
  
  @JSImport("jest-message-util", "separateMessageFromStack")
  @js.native
  def separateMessageFromStack(content: String): Message = js.native
  
  /* Inlined std.Pick<@jest/types.@jest/types.Config.ProjectConfig, 'rootDir' | 'testMatch'> */
  @js.native
  trait StackTraceConfig extends StObject {
    
    var rootDir: Path = js.native
    
    var testMatch: js.Array[Glob] = js.native
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
  
  @js.native
  trait StackTraceOptions extends StObject {
    
    var noStackTrace: Boolean = js.native
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
