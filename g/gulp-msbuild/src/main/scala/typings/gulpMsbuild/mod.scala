package typings.gulpMsbuild

import org.scalablytyped.runtime.Shortcut
import typings.node.NodeJS.ReadWriteStream
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod extends Shortcut {
  
  @JSImport("gulp-msbuild", JSImport.Namespace)
  @js.native
  val ^ : GulpMsBuild = js.native
  
  type GulpMsBuild = js.Function1[/* options */ js.UndefOr[Options], ReadWriteStream]
  
  trait Options extends StObject {
    
    // 4.0
    var architecture: js.UndefOr[String] = js.undefined
    
    // ['Rebuild']
    var configuration: js.UndefOr[String] = js.undefined
    
    // msbuild({ fileLoggerParameters: 'LogFile=Build.log;Append;Verbosity=diagnostic' })
    var consoleLoggerParameters: js.UndefOr[String] = js.undefined
    
    // msbuild({ loggerParameters: 'XMLLogger,./MyLogger.dll;OutputAsHTML' })
    var emitEndEvent: js.UndefOr[Boolean] = js.undefined
    
    // true
    var errorOnFail: js.UndefOr[Boolean] = js.undefined
    
    // false -> Show Startup Banner and Copyright Message
    var fileLoggerParameters: js.UndefOr[String] = js.undefined
    
    // false
    var logCommand: js.UndefOr[Boolean] = js.undefined
    
    var loggerParameters: js.UndefOr[String] = js.undefined
    
    // 'quiet', 'minimal', 'normal', 'detailed', 'diagnostic'
    var maxcpucount: js.UndefOr[Double] = js.undefined
    
    // Default: 0 = Automatic selection | Possible Values: -1 (MSBuild Default), 0 (Automatic), > 0 (Concrete value)
    var nodeReuse: js.UndefOr[Boolean] = js.undefined
    
    // true = Nodes remain after the build finishes so that subsequent builds can use them
    var nologo: js.UndefOr[Boolean] = js.undefined
    
    // 'x86' | 'x64'
    var properties: js.UndefOr[Any] = js.undefined
    
    // false
    var stderr: js.UndefOr[Boolean] = js.undefined
    
    var stdout: js.UndefOr[Boolean] = js.undefined
    
    // false
    var targets: js.UndefOr[js.Array[String]] = js.undefined
    
    // 'Release' | 'Debug'
    var toolsVersion: js.UndefOr[Double] = js.undefined
    
    // msbuild({ properties: { WarningLevel: 2 } })
    var verbosity: js.UndefOr[String] = js.undefined
  }
  object Options {
    
    inline def apply(): Options = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Options]
    }
    
    extension [Self <: Options](x: Self) {
      
      inline def setArchitecture(value: String): Self = StObject.set(x, "architecture", value.asInstanceOf[js.Any])
      
      inline def setArchitectureUndefined: Self = StObject.set(x, "architecture", js.undefined)
      
      inline def setConfiguration(value: String): Self = StObject.set(x, "configuration", value.asInstanceOf[js.Any])
      
      inline def setConfigurationUndefined: Self = StObject.set(x, "configuration", js.undefined)
      
      inline def setConsoleLoggerParameters(value: String): Self = StObject.set(x, "consoleLoggerParameters", value.asInstanceOf[js.Any])
      
      inline def setConsoleLoggerParametersUndefined: Self = StObject.set(x, "consoleLoggerParameters", js.undefined)
      
      inline def setEmitEndEvent(value: Boolean): Self = StObject.set(x, "emitEndEvent", value.asInstanceOf[js.Any])
      
      inline def setEmitEndEventUndefined: Self = StObject.set(x, "emitEndEvent", js.undefined)
      
      inline def setErrorOnFail(value: Boolean): Self = StObject.set(x, "errorOnFail", value.asInstanceOf[js.Any])
      
      inline def setErrorOnFailUndefined: Self = StObject.set(x, "errorOnFail", js.undefined)
      
      inline def setFileLoggerParameters(value: String): Self = StObject.set(x, "fileLoggerParameters", value.asInstanceOf[js.Any])
      
      inline def setFileLoggerParametersUndefined: Self = StObject.set(x, "fileLoggerParameters", js.undefined)
      
      inline def setLogCommand(value: Boolean): Self = StObject.set(x, "logCommand", value.asInstanceOf[js.Any])
      
      inline def setLogCommandUndefined: Self = StObject.set(x, "logCommand", js.undefined)
      
      inline def setLoggerParameters(value: String): Self = StObject.set(x, "loggerParameters", value.asInstanceOf[js.Any])
      
      inline def setLoggerParametersUndefined: Self = StObject.set(x, "loggerParameters", js.undefined)
      
      inline def setMaxcpucount(value: Double): Self = StObject.set(x, "maxcpucount", value.asInstanceOf[js.Any])
      
      inline def setMaxcpucountUndefined: Self = StObject.set(x, "maxcpucount", js.undefined)
      
      inline def setNodeReuse(value: Boolean): Self = StObject.set(x, "nodeReuse", value.asInstanceOf[js.Any])
      
      inline def setNodeReuseUndefined: Self = StObject.set(x, "nodeReuse", js.undefined)
      
      inline def setNologo(value: Boolean): Self = StObject.set(x, "nologo", value.asInstanceOf[js.Any])
      
      inline def setNologoUndefined: Self = StObject.set(x, "nologo", js.undefined)
      
      inline def setProperties(value: Any): Self = StObject.set(x, "properties", value.asInstanceOf[js.Any])
      
      inline def setPropertiesUndefined: Self = StObject.set(x, "properties", js.undefined)
      
      inline def setStderr(value: Boolean): Self = StObject.set(x, "stderr", value.asInstanceOf[js.Any])
      
      inline def setStderrUndefined: Self = StObject.set(x, "stderr", js.undefined)
      
      inline def setStdout(value: Boolean): Self = StObject.set(x, "stdout", value.asInstanceOf[js.Any])
      
      inline def setStdoutUndefined: Self = StObject.set(x, "stdout", js.undefined)
      
      inline def setTargets(value: js.Array[String]): Self = StObject.set(x, "targets", value.asInstanceOf[js.Any])
      
      inline def setTargetsUndefined: Self = StObject.set(x, "targets", js.undefined)
      
      inline def setTargetsVarargs(value: String*): Self = StObject.set(x, "targets", js.Array(value*))
      
      inline def setToolsVersion(value: Double): Self = StObject.set(x, "toolsVersion", value.asInstanceOf[js.Any])
      
      inline def setToolsVersionUndefined: Self = StObject.set(x, "toolsVersion", js.undefined)
      
      inline def setVerbosity(value: String): Self = StObject.set(x, "verbosity", value.asInstanceOf[js.Any])
      
      inline def setVerbosityUndefined: Self = StObject.set(x, "verbosity", js.undefined)
    }
  }
  
  type _To = GulpMsBuild
  
  /* This means you don't have to write `^`, but can instead just say `mod.foo` */
  override def _to: GulpMsBuild = ^
}
