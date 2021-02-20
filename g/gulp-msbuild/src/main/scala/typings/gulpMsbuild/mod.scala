package typings.gulpMsbuild

import org.scalablytyped.runtime.Shortcut
import typings.node.NodeJS.ReadWriteStream
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod extends Shortcut {
  
  @JSImport("gulp-msbuild", JSImport.Namespace)
  @js.native
  val ^ : GulpMsBuild = js.native
  
  type GulpMsBuild = js.Function1[/* options */ js.UndefOr[Options], ReadWriteStream]
  
  @js.native
  trait Options extends StObject {
    
    // 4.0
    var architecture: js.UndefOr[String] = js.native
    
    // ['Rebuild']
    var configuration: js.UndefOr[String] = js.native
    
    // msbuild({ fileLoggerParameters: 'LogFile=Build.log;Append;Verbosity=diagnostic' })
    var consoleLoggerParameters: js.UndefOr[String] = js.native
    
    // msbuild({ loggerParameters: 'XMLLogger,./MyLogger.dll;OutputAsHTML' })
    var emitEndEvent: js.UndefOr[Boolean] = js.native
    
    // true
    var errorOnFail: js.UndefOr[Boolean] = js.native
    
    // false -> Show Startup Banner and Copyright Message
    var fileLoggerParameters: js.UndefOr[String] = js.native
    
    // false
    var logCommand: js.UndefOr[Boolean] = js.native
    
    var loggerParameters: js.UndefOr[String] = js.native
    
    // 'quiet', 'minimal', 'normal', 'detailed', 'diagnostic'
    var maxcpucount: js.UndefOr[Double] = js.native
    
    // Default: 0 = Automatic selection | Possible Values: -1 (MSBuild Default), 0 (Automatic), > 0 (Concrete value)
    var nodeReuse: js.UndefOr[Boolean] = js.native
    
    // true = Nodes remain after the build finishes so that subsequent builds can use them
    var nologo: js.UndefOr[Boolean] = js.native
    
    // 'x86' | 'x64'
    var properties: js.UndefOr[js.Any] = js.native
    
    // false
    var stderr: js.UndefOr[Boolean] = js.native
    
    var stdout: js.UndefOr[Boolean] = js.native
    
    // false
    var targets: js.UndefOr[js.Array[String]] = js.native
    
    // 'Release' | 'Debug'
    var toolsVersion: js.UndefOr[Double] = js.native
    
    // msbuild({ properties: { WarningLevel: 2 } })
    var verbosity: js.UndefOr[String] = js.native
  }
  object Options {
    
    @scala.inline
    def apply(): Options = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Options]
    }
    
    @scala.inline
    implicit class OptionsMutableBuilder[Self <: Options] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setArchitecture(value: String): Self = StObject.set(x, "architecture", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setArchitectureUndefined: Self = StObject.set(x, "architecture", js.undefined)
      
      @scala.inline
      def setConfiguration(value: String): Self = StObject.set(x, "configuration", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setConfigurationUndefined: Self = StObject.set(x, "configuration", js.undefined)
      
      @scala.inline
      def setConsoleLoggerParameters(value: String): Self = StObject.set(x, "consoleLoggerParameters", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setConsoleLoggerParametersUndefined: Self = StObject.set(x, "consoleLoggerParameters", js.undefined)
      
      @scala.inline
      def setEmitEndEvent(value: Boolean): Self = StObject.set(x, "emitEndEvent", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEmitEndEventUndefined: Self = StObject.set(x, "emitEndEvent", js.undefined)
      
      @scala.inline
      def setErrorOnFail(value: Boolean): Self = StObject.set(x, "errorOnFail", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setErrorOnFailUndefined: Self = StObject.set(x, "errorOnFail", js.undefined)
      
      @scala.inline
      def setFileLoggerParameters(value: String): Self = StObject.set(x, "fileLoggerParameters", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFileLoggerParametersUndefined: Self = StObject.set(x, "fileLoggerParameters", js.undefined)
      
      @scala.inline
      def setLogCommand(value: Boolean): Self = StObject.set(x, "logCommand", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLogCommandUndefined: Self = StObject.set(x, "logCommand", js.undefined)
      
      @scala.inline
      def setLoggerParameters(value: String): Self = StObject.set(x, "loggerParameters", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLoggerParametersUndefined: Self = StObject.set(x, "loggerParameters", js.undefined)
      
      @scala.inline
      def setMaxcpucount(value: Double): Self = StObject.set(x, "maxcpucount", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMaxcpucountUndefined: Self = StObject.set(x, "maxcpucount", js.undefined)
      
      @scala.inline
      def setNodeReuse(value: Boolean): Self = StObject.set(x, "nodeReuse", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNodeReuseUndefined: Self = StObject.set(x, "nodeReuse", js.undefined)
      
      @scala.inline
      def setNologo(value: Boolean): Self = StObject.set(x, "nologo", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNologoUndefined: Self = StObject.set(x, "nologo", js.undefined)
      
      @scala.inline
      def setProperties(value: js.Any): Self = StObject.set(x, "properties", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPropertiesUndefined: Self = StObject.set(x, "properties", js.undefined)
      
      @scala.inline
      def setStderr(value: Boolean): Self = StObject.set(x, "stderr", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStderrUndefined: Self = StObject.set(x, "stderr", js.undefined)
      
      @scala.inline
      def setStdout(value: Boolean): Self = StObject.set(x, "stdout", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStdoutUndefined: Self = StObject.set(x, "stdout", js.undefined)
      
      @scala.inline
      def setTargets(value: js.Array[String]): Self = StObject.set(x, "targets", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTargetsUndefined: Self = StObject.set(x, "targets", js.undefined)
      
      @scala.inline
      def setTargetsVarargs(value: String*): Self = StObject.set(x, "targets", js.Array(value :_*))
      
      @scala.inline
      def setToolsVersion(value: Double): Self = StObject.set(x, "toolsVersion", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setToolsVersionUndefined: Self = StObject.set(x, "toolsVersion", js.undefined)
      
      @scala.inline
      def setVerbosity(value: String): Self = StObject.set(x, "verbosity", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVerbosityUndefined: Self = StObject.set(x, "verbosity", js.undefined)
    }
  }
  
  type _To = GulpMsBuild
  
  /* This means you don't have to write `^`, but can instead just say `mod.foo` */
  override def _to: GulpMsBuild = ^
}
