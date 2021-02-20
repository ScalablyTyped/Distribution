package typings.grunt

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  @js.native
  trait Custom extends StObject {
    
    var custom: js.UndefOr[js.Any] = js.native
    
    var cwd: js.UndefOr[java.lang.String] = js.native
    
    var detached: js.UndefOr[Boolean] = js.native
    
    var env: js.UndefOr[js.Any] = js.native
    
    var stdio: js.UndefOr[js.Any] = js.native
  }
  object Custom {
    
    @scala.inline
    def apply(): Custom = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Custom]
    }
    
    @scala.inline
    implicit class CustomMutableBuilder[Self <: Custom] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCustom(value: js.Any): Self = StObject.set(x, "custom", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCustomUndefined: Self = StObject.set(x, "custom", js.undefined)
      
      @scala.inline
      def setCwd(value: java.lang.String): Self = StObject.set(x, "cwd", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCwdUndefined: Self = StObject.set(x, "cwd", js.undefined)
      
      @scala.inline
      def setDetached(value: Boolean): Self = StObject.set(x, "detached", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDetachedUndefined: Self = StObject.set(x, "detached", js.undefined)
      
      @scala.inline
      def setEnv(value: js.Any): Self = StObject.set(x, "env", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEnvUndefined: Self = StObject.set(x, "env", js.undefined)
      
      @scala.inline
      def setStdio(value: js.Any): Self = StObject.set(x, "stdio", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStdioUndefined: Self = StObject.set(x, "stdio", js.undefined)
    }
  }
  
  @js.native
  trait Force extends StObject {
    
    var force: js.UndefOr[Boolean] = js.native
  }
  object Force {
    
    @scala.inline
    def apply(): Force = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Force]
    }
    
    @scala.inline
    implicit class ForceMutableBuilder[Self <: Force] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setForce(value: Boolean): Self = StObject.set(x, "force", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setForceUndefined: Self = StObject.set(x, "force", js.undefined)
    }
  }
}
