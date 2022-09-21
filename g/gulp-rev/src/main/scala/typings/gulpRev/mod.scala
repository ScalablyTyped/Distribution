package typings.gulpRev

import org.scalablytyped.runtime.Shortcut
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod extends Shortcut {
  
  @JSImport("gulp-rev", JSImport.Namespace)
  @js.native
  val ^ : IRev = js.native
  
  trait IOptions extends StObject {
    
    var base: js.UndefOr[String] = js.undefined
    
    var cwd: js.UndefOr[String] = js.undefined
    
    var merge: js.UndefOr[Boolean] = js.undefined
  }
  object IOptions {
    
    inline def apply(): IOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[IOptions]
    }
    
    extension [Self <: IOptions](x: Self) {
      
      inline def setBase(value: String): Self = StObject.set(x, "base", value.asInstanceOf[js.Any])
      
      inline def setBaseUndefined: Self = StObject.set(x, "base", js.undefined)
      
      inline def setCwd(value: String): Self = StObject.set(x, "cwd", value.asInstanceOf[js.Any])
      
      inline def setCwdUndefined: Self = StObject.set(x, "cwd", js.undefined)
      
      inline def setMerge(value: Boolean): Self = StObject.set(x, "merge", value.asInstanceOf[js.Any])
      
      inline def setMergeUndefined: Self = StObject.set(x, "merge", js.undefined)
    }
  }
  
  @js.native
  trait IRev extends StObject {
    
    def apply(): Any = js.native
    
    def manifest(): Any = js.native
    def manifest(options: IOptions): Any = js.native
    def manifest(path: String): Any = js.native
    def manifest(path: String, options: IOptions): Any = js.native
    def manifest(path: Unit, options: IOptions): Any = js.native
  }
  
  type _To = IRev
  
  /* This means you don't have to write `^`, but can instead just say `mod.foo` */
  override def _to: IRev = ^
}
