package typings.gulpShell

import typings.gulpShell.gulpShellBooleans.`true`
import typings.node.processMod.global.NodeJS.ProcessEnv
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  inline def apply(commands: String): Any = ^.asInstanceOf[js.Dynamic].apply(commands.asInstanceOf[js.Any]).asInstanceOf[Any]
  inline def apply(commands: String, options: Options): Any = (^.asInstanceOf[js.Dynamic].apply(commands.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Any]
  inline def apply(commands: js.Array[String]): Any = ^.asInstanceOf[js.Dynamic].apply(commands.asInstanceOf[js.Any]).asInstanceOf[Any]
  inline def apply(commands: js.Array[String], options: Options): Any = (^.asInstanceOf[js.Dynamic].apply(commands.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Any]
  
  @JSImport("gulp-shell", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def task(commands: String): js.Function0[js.Promise[Unit]] = ^.asInstanceOf[js.Dynamic].applyDynamic("task")(commands.asInstanceOf[js.Any]).asInstanceOf[js.Function0[js.Promise[Unit]]]
  inline def task(commands: String, options: Options): js.Function0[js.Promise[Unit]] = (^.asInstanceOf[js.Dynamic].applyDynamic("task")(commands.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Function0[js.Promise[Unit]]]
  inline def task(commands: js.Array[String]): js.Function0[js.Promise[Unit]] = ^.asInstanceOf[js.Dynamic].applyDynamic("task")(commands.asInstanceOf[js.Any]).asInstanceOf[js.Function0[js.Promise[Unit]]]
  inline def task(commands: js.Array[String], options: Options): js.Function0[js.Promise[Unit]] = (^.asInstanceOf[js.Dynamic].applyDynamic("task")(commands.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Function0[js.Promise[Unit]]]
  
  trait Options extends StObject {
    
    var cwd: js.UndefOr[String] = js.undefined
    
    var env: js.UndefOr[ProcessEnv] = js.undefined
    
    var errorMessage: js.UndefOr[String] = js.undefined
    
    var ignoreErrors: js.UndefOr[Boolean] = js.undefined
    
    var quiet: js.UndefOr[Boolean] = js.undefined
    
    var shell: js.UndefOr[`true` | String] = js.undefined
    
    var templateData: js.UndefOr[js.Object] = js.undefined
    
    var verbose: js.UndefOr[Boolean] = js.undefined
  }
  object Options {
    
    inline def apply(): Options = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Options]
    }
    
    extension [Self <: Options](x: Self) {
      
      inline def setCwd(value: String): Self = StObject.set(x, "cwd", value.asInstanceOf[js.Any])
      
      inline def setCwdUndefined: Self = StObject.set(x, "cwd", js.undefined)
      
      inline def setEnv(value: ProcessEnv): Self = StObject.set(x, "env", value.asInstanceOf[js.Any])
      
      inline def setEnvUndefined: Self = StObject.set(x, "env", js.undefined)
      
      inline def setErrorMessage(value: String): Self = StObject.set(x, "errorMessage", value.asInstanceOf[js.Any])
      
      inline def setErrorMessageUndefined: Self = StObject.set(x, "errorMessage", js.undefined)
      
      inline def setIgnoreErrors(value: Boolean): Self = StObject.set(x, "ignoreErrors", value.asInstanceOf[js.Any])
      
      inline def setIgnoreErrorsUndefined: Self = StObject.set(x, "ignoreErrors", js.undefined)
      
      inline def setQuiet(value: Boolean): Self = StObject.set(x, "quiet", value.asInstanceOf[js.Any])
      
      inline def setQuietUndefined: Self = StObject.set(x, "quiet", js.undefined)
      
      inline def setShell(value: `true` | String): Self = StObject.set(x, "shell", value.asInstanceOf[js.Any])
      
      inline def setShellUndefined: Self = StObject.set(x, "shell", js.undefined)
      
      inline def setTemplateData(value: js.Object): Self = StObject.set(x, "templateData", value.asInstanceOf[js.Any])
      
      inline def setTemplateDataUndefined: Self = StObject.set(x, "templateData", js.undefined)
      
      inline def setVerbose(value: Boolean): Self = StObject.set(x, "verbose", value.asInstanceOf[js.Any])
      
      inline def setVerboseUndefined: Self = StObject.set(x, "verbose", js.undefined)
    }
  }
}
