package typings.gulpShell

import typings.gulpShell.gulpShellBooleans.`true`
import typings.node.NodeJS.ReadWriteStream
import typings.node.processMod.global.NodeJS.ProcessEnv
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("gulp-shell", JSImport.Namespace)
  @js.native
  def apply(commands: String): ReadWriteStream = js.native
  @JSImport("gulp-shell", JSImport.Namespace)
  @js.native
  def apply(commands: String, options: Options): ReadWriteStream = js.native
  @JSImport("gulp-shell", JSImport.Namespace)
  @js.native
  def apply(commands: js.Array[String]): ReadWriteStream = js.native
  @JSImport("gulp-shell", JSImport.Namespace)
  @js.native
  def apply(commands: js.Array[String], options: Options): ReadWriteStream = js.native
  
  @JSImport("gulp-shell", "task")
  @js.native
  def task(commands: String): js.Function0[js.Promise[Unit]] = js.native
  @JSImport("gulp-shell", "task")
  @js.native
  def task(commands: String, options: Options): js.Function0[js.Promise[Unit]] = js.native
  @JSImport("gulp-shell", "task")
  @js.native
  def task(commands: js.Array[String]): js.Function0[js.Promise[Unit]] = js.native
  @JSImport("gulp-shell", "task")
  @js.native
  def task(commands: js.Array[String], options: Options): js.Function0[js.Promise[Unit]] = js.native
  
  @js.native
  trait Options extends StObject {
    
    var cwd: js.UndefOr[String] = js.native
    
    var env: js.UndefOr[ProcessEnv] = js.native
    
    var errorMessage: js.UndefOr[String] = js.native
    
    var ignoreErrors: js.UndefOr[Boolean] = js.native
    
    var quiet: js.UndefOr[Boolean] = js.native
    
    var shell: js.UndefOr[`true` | String] = js.native
    
    var templateData: js.UndefOr[js.Object] = js.native
    
    var verbose: js.UndefOr[Boolean] = js.native
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
      def setCwd(value: String): Self = StObject.set(x, "cwd", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCwdUndefined: Self = StObject.set(x, "cwd", js.undefined)
      
      @scala.inline
      def setEnv(value: ProcessEnv): Self = StObject.set(x, "env", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEnvUndefined: Self = StObject.set(x, "env", js.undefined)
      
      @scala.inline
      def setErrorMessage(value: String): Self = StObject.set(x, "errorMessage", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setErrorMessageUndefined: Self = StObject.set(x, "errorMessage", js.undefined)
      
      @scala.inline
      def setIgnoreErrors(value: Boolean): Self = StObject.set(x, "ignoreErrors", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIgnoreErrorsUndefined: Self = StObject.set(x, "ignoreErrors", js.undefined)
      
      @scala.inline
      def setQuiet(value: Boolean): Self = StObject.set(x, "quiet", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setQuietUndefined: Self = StObject.set(x, "quiet", js.undefined)
      
      @scala.inline
      def setShell(value: `true` | String): Self = StObject.set(x, "shell", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setShellUndefined: Self = StObject.set(x, "shell", js.undefined)
      
      @scala.inline
      def setTemplateData(value: js.Object): Self = StObject.set(x, "templateData", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTemplateDataUndefined: Self = StObject.set(x, "templateData", js.undefined)
      
      @scala.inline
      def setVerbose(value: Boolean): Self = StObject.set(x, "verbose", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVerboseUndefined: Self = StObject.set(x, "verbose", js.undefined)
    }
  }
}
