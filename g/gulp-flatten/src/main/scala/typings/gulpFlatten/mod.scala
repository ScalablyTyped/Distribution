package typings.gulpFlatten

import typings.node.NodeJS.ReadWriteStream
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("gulp-flatten", JSImport.Namespace)
  @js.native
  def apply(): ReadWriteStream = js.native
  @JSImport("gulp-flatten", JSImport.Namespace)
  @js.native
  def apply(options: IOptions): ReadWriteStream = js.native
  
  @js.native
  trait IOptions extends StObject {
    
    var newPath: String = js.native
  }
  object IOptions {
    
    @scala.inline
    def apply(newPath: String): IOptions = {
      val __obj = js.Dynamic.literal(newPath = newPath.asInstanceOf[js.Any])
      __obj.asInstanceOf[IOptions]
    }
    
    @scala.inline
    implicit class IOptionsMutableBuilder[Self <: IOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setNewPath(value: String): Self = StObject.set(x, "newPath", value.asInstanceOf[js.Any])
    }
  }
}
