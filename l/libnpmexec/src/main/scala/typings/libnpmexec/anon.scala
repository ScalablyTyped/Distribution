package typings.libnpmexec

import typings.node.bufferMod.global.Buffer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait Args extends StObject {
    
    val args: js.Array[String]
    
    val cache: js.UndefOr[String] = js.undefined
    
    val call: js.UndefOr[String] = js.undefined
    
    val color: js.UndefOr[Boolean] = js.undefined
    
    val globalBin: js.UndefOr[String] = js.undefined
    
    val localBin: js.UndefOr[String] = js.undefined
    
    val locationMsg: js.UndefOr[String] = js.undefined
    
    val log: js.UndefOr[DisableProgress] = js.undefined
    
    val npxCache: js.UndefOr[String] = js.undefined
    
    val output: js.UndefOr[js.Function1[/* message */ String, Unit]] = js.undefined
    
    val packages: js.UndefOr[js.Array[String]] = js.undefined
    
    val path: js.UndefOr[String] = js.undefined
    
    val registry: js.UndefOr[String] = js.undefined
    
    val runPath: js.UndefOr[String] = js.undefined
    
    val scriptShell: js.UndefOr[String] = js.undefined
    
    val yes: js.UndefOr[Boolean] = js.undefined
  }
  object Args {
    
    inline def apply(args: js.Array[String]): Args = {
      val __obj = js.Dynamic.literal(args = args.asInstanceOf[js.Any])
      __obj.asInstanceOf[Args]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Args] (val x: Self) extends AnyVal {
      
      inline def setArgs(value: js.Array[String]): Self = StObject.set(x, "args", value.asInstanceOf[js.Any])
      
      inline def setArgsVarargs(value: String*): Self = StObject.set(x, "args", js.Array(value*))
      
      inline def setCache(value: String): Self = StObject.set(x, "cache", value.asInstanceOf[js.Any])
      
      inline def setCacheUndefined: Self = StObject.set(x, "cache", js.undefined)
      
      inline def setCall(value: String): Self = StObject.set(x, "call", value.asInstanceOf[js.Any])
      
      inline def setCallUndefined: Self = StObject.set(x, "call", js.undefined)
      
      inline def setColor(value: Boolean): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
      
      inline def setColorUndefined: Self = StObject.set(x, "color", js.undefined)
      
      inline def setGlobalBin(value: String): Self = StObject.set(x, "globalBin", value.asInstanceOf[js.Any])
      
      inline def setGlobalBinUndefined: Self = StObject.set(x, "globalBin", js.undefined)
      
      inline def setLocalBin(value: String): Self = StObject.set(x, "localBin", value.asInstanceOf[js.Any])
      
      inline def setLocalBinUndefined: Self = StObject.set(x, "localBin", js.undefined)
      
      inline def setLocationMsg(value: String): Self = StObject.set(x, "locationMsg", value.asInstanceOf[js.Any])
      
      inline def setLocationMsgUndefined: Self = StObject.set(x, "locationMsg", js.undefined)
      
      inline def setLog(value: DisableProgress): Self = StObject.set(x, "log", value.asInstanceOf[js.Any])
      
      inline def setLogUndefined: Self = StObject.set(x, "log", js.undefined)
      
      inline def setNpxCache(value: String): Self = StObject.set(x, "npxCache", value.asInstanceOf[js.Any])
      
      inline def setNpxCacheUndefined: Self = StObject.set(x, "npxCache", js.undefined)
      
      inline def setOutput(value: /* message */ String => Unit): Self = StObject.set(x, "output", js.Any.fromFunction1(value))
      
      inline def setOutputUndefined: Self = StObject.set(x, "output", js.undefined)
      
      inline def setPackages(value: js.Array[String]): Self = StObject.set(x, "packages", value.asInstanceOf[js.Any])
      
      inline def setPackagesUndefined: Self = StObject.set(x, "packages", js.undefined)
      
      inline def setPackagesVarargs(value: String*): Self = StObject.set(x, "packages", js.Array(value*))
      
      inline def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
      
      inline def setPathUndefined: Self = StObject.set(x, "path", js.undefined)
      
      inline def setRegistry(value: String): Self = StObject.set(x, "registry", value.asInstanceOf[js.Any])
      
      inline def setRegistryUndefined: Self = StObject.set(x, "registry", js.undefined)
      
      inline def setRunPath(value: String): Self = StObject.set(x, "runPath", value.asInstanceOf[js.Any])
      
      inline def setRunPathUndefined: Self = StObject.set(x, "runPath", js.undefined)
      
      inline def setScriptShell(value: String): Self = StObject.set(x, "scriptShell", value.asInstanceOf[js.Any])
      
      inline def setScriptShellUndefined: Self = StObject.set(x, "scriptShell", js.undefined)
      
      inline def setYes(value: Boolean): Self = StObject.set(x, "yes", value.asInstanceOf[js.Any])
      
      inline def setYesUndefined: Self = StObject.set(x, "yes", js.undefined)
    }
  }
  
  trait Code extends StObject {
    
    val code: Double
    
    val event: String
    
    val path: String
    
    val script: String
    
    val signal: String
    
    val stderr: Buffer | String
    
    val stdout: Buffer | String
  }
  object Code {
    
    inline def apply(
      code: Double,
      event: String,
      path: String,
      script: String,
      signal: String,
      stderr: Buffer | String,
      stdout: Buffer | String
    ): Code = {
      val __obj = js.Dynamic.literal(code = code.asInstanceOf[js.Any], event = event.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any], script = script.asInstanceOf[js.Any], signal = signal.asInstanceOf[js.Any], stderr = stderr.asInstanceOf[js.Any], stdout = stdout.asInstanceOf[js.Any])
      __obj.asInstanceOf[Code]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Code] (val x: Self) extends AnyVal {
      
      inline def setCode(value: Double): Self = StObject.set(x, "code", value.asInstanceOf[js.Any])
      
      inline def setEvent(value: String): Self = StObject.set(x, "event", value.asInstanceOf[js.Any])
      
      inline def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
      
      inline def setScript(value: String): Self = StObject.set(x, "script", value.asInstanceOf[js.Any])
      
      inline def setSignal(value: String): Self = StObject.set(x, "signal", value.asInstanceOf[js.Any])
      
      inline def setStderr(value: Buffer | String): Self = StObject.set(x, "stderr", value.asInstanceOf[js.Any])
      
      inline def setStdout(value: Buffer | String): Self = StObject.set(x, "stdout", value.asInstanceOf[js.Any])
    }
  }
  
  trait DisableProgress extends StObject {
    
    var disableProgress: js.UndefOr[js.Function0[Unit]] = js.undefined
    
    var enableProgress: js.UndefOr[js.Function0[Unit]] = js.undefined
    
    def warn(title: String, message: String): Unit
  }
  object DisableProgress {
    
    inline def apply(warn: (String, String) => Unit): DisableProgress = {
      val __obj = js.Dynamic.literal(warn = js.Any.fromFunction2(warn))
      __obj.asInstanceOf[DisableProgress]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: DisableProgress] (val x: Self) extends AnyVal {
      
      inline def setDisableProgress(value: () => Unit): Self = StObject.set(x, "disableProgress", js.Any.fromFunction0(value))
      
      inline def setDisableProgressUndefined: Self = StObject.set(x, "disableProgress", js.undefined)
      
      inline def setEnableProgress(value: () => Unit): Self = StObject.set(x, "enableProgress", js.Any.fromFunction0(value))
      
      inline def setEnableProgressUndefined: Self = StObject.set(x, "enableProgress", js.undefined)
      
      inline def setWarn(value: (String, String) => Unit): Self = StObject.set(x, "warn", js.Any.fromFunction2(value))
    }
  }
}
