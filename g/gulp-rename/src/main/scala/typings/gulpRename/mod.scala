package typings.gulpRename

import typings.node.NodeJS.ReadWriteStream
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  inline def apply(callback: js.Function1[/* path */ ParsedPath, js.Any]): ReadWriteStream = ^.asInstanceOf[js.Dynamic].apply(callback.asInstanceOf[js.Any]).asInstanceOf[ReadWriteStream]
  inline def apply(name: String): ReadWriteStream = ^.asInstanceOf[js.Dynamic].apply(name.asInstanceOf[js.Any]).asInstanceOf[ReadWriteStream]
  inline def apply(opts: Options): ReadWriteStream = ^.asInstanceOf[js.Dynamic].apply(opts.asInstanceOf[js.Any]).asInstanceOf[ReadWriteStream]
  
  @JSImport("gulp-rename", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  trait Options
    extends StObject
       with ParsedPath {
    
    var prefix: js.UndefOr[String] = js.undefined
    
    var suffix: js.UndefOr[String] = js.undefined
  }
  object Options {
    
    inline def apply(): Options = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Options]
    }
    
    extension [Self <: Options](x: Self) {
      
      inline def setPrefix(value: String): Self = StObject.set(x, "prefix", value.asInstanceOf[js.Any])
      
      inline def setPrefixUndefined: Self = StObject.set(x, "prefix", js.undefined)
      
      inline def setSuffix(value: String): Self = StObject.set(x, "suffix", value.asInstanceOf[js.Any])
      
      inline def setSuffixUndefined: Self = StObject.set(x, "suffix", js.undefined)
    }
  }
  
  trait ParsedPath extends StObject {
    
    var basename: js.UndefOr[String] = js.undefined
    
    var dirname: js.UndefOr[String] = js.undefined
    
    var extname: js.UndefOr[String] = js.undefined
  }
  object ParsedPath {
    
    inline def apply(): ParsedPath = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ParsedPath]
    }
    
    extension [Self <: ParsedPath](x: Self) {
      
      inline def setBasename(value: String): Self = StObject.set(x, "basename", value.asInstanceOf[js.Any])
      
      inline def setBasenameUndefined: Self = StObject.set(x, "basename", js.undefined)
      
      inline def setDirname(value: String): Self = StObject.set(x, "dirname", value.asInstanceOf[js.Any])
      
      inline def setDirnameUndefined: Self = StObject.set(x, "dirname", js.undefined)
      
      inline def setExtname(value: String): Self = StObject.set(x, "extname", value.asInstanceOf[js.Any])
      
      inline def setExtnameUndefined: Self = StObject.set(x, "extname", js.undefined)
    }
  }
}
