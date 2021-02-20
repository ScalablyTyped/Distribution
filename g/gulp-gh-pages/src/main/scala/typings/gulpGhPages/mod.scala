package typings.gulpGhPages

import typings.node.NodeJS.ReadWriteStream
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("gulp-gh-pages", JSImport.Namespace)
  @js.native
  def apply(): ReadWriteStream = js.native
  @JSImport("gulp-gh-pages", JSImport.Namespace)
  @js.native
  def apply(opts: Options): ReadWriteStream = js.native
  
  @js.native
  trait Options extends StObject {
    
    var branch: js.UndefOr[String] = js.native
    
    var cacheDir: js.UndefOr[String] = js.native
    
    var force: js.UndefOr[Boolean] = js.native
    
    var message: js.UndefOr[String] = js.native
    
    var origin: js.UndefOr[String] = js.native
    
    var push: js.UndefOr[Boolean] = js.native
    
    var remoteUrl: js.UndefOr[String] = js.native
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
      def setBranch(value: String): Self = StObject.set(x, "branch", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBranchUndefined: Self = StObject.set(x, "branch", js.undefined)
      
      @scala.inline
      def setCacheDir(value: String): Self = StObject.set(x, "cacheDir", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCacheDirUndefined: Self = StObject.set(x, "cacheDir", js.undefined)
      
      @scala.inline
      def setForce(value: Boolean): Self = StObject.set(x, "force", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setForceUndefined: Self = StObject.set(x, "force", js.undefined)
      
      @scala.inline
      def setMessage(value: String): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMessageUndefined: Self = StObject.set(x, "message", js.undefined)
      
      @scala.inline
      def setOrigin(value: String): Self = StObject.set(x, "origin", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOriginUndefined: Self = StObject.set(x, "origin", js.undefined)
      
      @scala.inline
      def setPush(value: Boolean): Self = StObject.set(x, "push", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPushUndefined: Self = StObject.set(x, "push", js.undefined)
      
      @scala.inline
      def setRemoteUrl(value: String): Self = StObject.set(x, "remoteUrl", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRemoteUrlUndefined: Self = StObject.set(x, "remoteUrl", js.undefined)
    }
  }
}
