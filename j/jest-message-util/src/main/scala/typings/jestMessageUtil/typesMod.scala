package typings.jestMessageUtil

import typings.stackUtils.mod.StackData
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesMod {
  
  trait Frame
    extends StObject
       with StackData {
    
    @JSName("file")
    var file_Frame: String
  }
  object Frame {
    
    inline def apply(file: String): Frame = {
      val __obj = js.Dynamic.literal(file = file.asInstanceOf[js.Any])
      __obj.asInstanceOf[Frame]
    }
    
    extension [Self <: Frame](x: Self) {
      
      inline def setFile(value: String): Self = StObject.set(x, "file", value.asInstanceOf[js.Any])
    }
  }
}
