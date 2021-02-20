package typings.jestMessageUtil

import typings.jestTypes.configMod.Glob
import typings.jestTypes.configMod.Path
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  @js.native
  trait Message extends StObject {
    
    var message: String = js.native
    
    var stack: String = js.native
  }
  object Message {
    
    @scala.inline
    def apply(message: String, stack: String): Message = {
      val __obj = js.Dynamic.literal(message = message.asInstanceOf[js.Any], stack = stack.asInstanceOf[js.Any])
      __obj.asInstanceOf[Message]
    }
    
    @scala.inline
    implicit class MessageMutableBuilder[Self <: Message] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setMessage(value: String): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStack(value: String): Self = StObject.set(x, "stack", value.asInstanceOf[js.Any])
    }
  }
  
  /* Inlined std.Pick<@jest/types.@jest/types.Config.ProjectConfig, 'rootDir' | 'testMatch'> */
  @js.native
  trait PickProjectConfigrootDirt extends StObject {
    
    var rootDir: Path = js.native
    
    var testMatch: js.Array[Glob] = js.native
  }
  object PickProjectConfigrootDirt {
    
    @scala.inline
    def apply(rootDir: Path, testMatch: js.Array[Glob]): PickProjectConfigrootDirt = {
      val __obj = js.Dynamic.literal(rootDir = rootDir.asInstanceOf[js.Any], testMatch = testMatch.asInstanceOf[js.Any])
      __obj.asInstanceOf[PickProjectConfigrootDirt]
    }
    
    @scala.inline
    implicit class PickProjectConfigrootDirtMutableBuilder[Self <: PickProjectConfigrootDirt] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setRootDir(value: Path): Self = StObject.set(x, "rootDir", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTestMatch(value: js.Array[Glob]): Self = StObject.set(x, "testMatch", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTestMatchVarargs(value: Glob*): Self = StObject.set(x, "testMatch", js.Array(value :_*))
    }
  }
}
