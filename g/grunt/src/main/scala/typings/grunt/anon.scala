package typings.grunt

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait Custom extends StObject {
    
    var custom: js.UndefOr[Any] = js.undefined
    
    var cwd: js.UndefOr[java.lang.String] = js.undefined
    
    var detached: js.UndefOr[Boolean] = js.undefined
    
    var env: js.UndefOr[Any] = js.undefined
    
    var stdio: js.UndefOr[Any] = js.undefined
  }
  object Custom {
    
    inline def apply(): Custom = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Custom]
    }
    
    extension [Self <: Custom](x: Self) {
      
      inline def setCustom(value: Any): Self = StObject.set(x, "custom", value.asInstanceOf[js.Any])
      
      inline def setCustomUndefined: Self = StObject.set(x, "custom", js.undefined)
      
      inline def setCwd(value: java.lang.String): Self = StObject.set(x, "cwd", value.asInstanceOf[js.Any])
      
      inline def setCwdUndefined: Self = StObject.set(x, "cwd", js.undefined)
      
      inline def setDetached(value: Boolean): Self = StObject.set(x, "detached", value.asInstanceOf[js.Any])
      
      inline def setDetachedUndefined: Self = StObject.set(x, "detached", js.undefined)
      
      inline def setEnv(value: Any): Self = StObject.set(x, "env", value.asInstanceOf[js.Any])
      
      inline def setEnvUndefined: Self = StObject.set(x, "env", js.undefined)
      
      inline def setStdio(value: Any): Self = StObject.set(x, "stdio", value.asInstanceOf[js.Any])
      
      inline def setStdioUndefined: Self = StObject.set(x, "stdio", js.undefined)
    }
  }
  
  trait Force extends StObject {
    
    var force: js.UndefOr[Boolean] = js.undefined
  }
  object Force {
    
    inline def apply(): Force = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Force]
    }
    
    extension [Self <: Force](x: Self) {
      
      inline def setForce(value: Boolean): Self = StObject.set(x, "force", value.asInstanceOf[js.Any])
      
      inline def setForceUndefined: Self = StObject.set(x, "force", js.undefined)
    }
  }
}
