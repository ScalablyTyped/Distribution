package typings.jestMessageUtil

import typings.jestTypes.configMod.Glob
import typings.jestTypes.configMod.Path
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait Message extends StObject {
    
    var message: String
    
    var stack: String
  }
  object Message {
    
    inline def apply(message: String, stack: String): Message = {
      val __obj = js.Dynamic.literal(message = message.asInstanceOf[js.Any], stack = stack.asInstanceOf[js.Any])
      __obj.asInstanceOf[Message]
    }
    
    extension [Self <: Message](x: Self) {
      
      inline def setMessage(value: String): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
      
      inline def setStack(value: String): Self = StObject.set(x, "stack", value.asInstanceOf[js.Any])
    }
  }
  
  /* Inlined std.Pick<@jest/types.@jest/types.Config.ProjectConfig, 'rootDir' | 'testMatch'> */
  trait PickProjectConfigrootDirt extends StObject {
    
    var rootDir: Path
    
    var testMatch: js.Array[Glob]
  }
  object PickProjectConfigrootDirt {
    
    inline def apply(rootDir: Path, testMatch: js.Array[Glob]): PickProjectConfigrootDirt = {
      val __obj = js.Dynamic.literal(rootDir = rootDir.asInstanceOf[js.Any], testMatch = testMatch.asInstanceOf[js.Any])
      __obj.asInstanceOf[PickProjectConfigrootDirt]
    }
    
    extension [Self <: PickProjectConfigrootDirt](x: Self) {
      
      inline def setRootDir(value: Path): Self = StObject.set(x, "rootDir", value.asInstanceOf[js.Any])
      
      inline def setTestMatch(value: js.Array[Glob]): Self = StObject.set(x, "testMatch", value.asInstanceOf[js.Any])
      
      inline def setTestMatchVarargs(value: Glob*): Self = StObject.set(x, "testMatch", js.Array(value :_*))
    }
  }
}
