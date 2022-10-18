package typings.gulpPostcss

import typings.node.NodeJS.ReadWriteStream
import typings.vinyl.mod.File
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  inline def apply(): ReadWriteStream = ^.asInstanceOf[js.Dynamic].apply().asInstanceOf[ReadWriteStream]
  inline def apply(callback: js.Function1[/* file */ File, typings.gulpPostcss.anon.Options]): ReadWriteStream = ^.asInstanceOf[js.Dynamic].apply(callback.asInstanceOf[js.Any]).asInstanceOf[ReadWriteStream]
  inline def apply(plugins: js.Array[Any]): ReadWriteStream = ^.asInstanceOf[js.Dynamic].apply(plugins.asInstanceOf[js.Any]).asInstanceOf[ReadWriteStream]
  inline def apply(plugins: js.Array[Any], options: Options): ReadWriteStream = (^.asInstanceOf[js.Dynamic].apply(plugins.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[ReadWriteStream]
  inline def apply(plugins: Unit, options: Options): ReadWriteStream = (^.asInstanceOf[js.Dynamic].apply(plugins.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[ReadWriteStream]
  
  @JSImport("gulp-postcss", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  trait Options extends StObject {
    
    var parser: js.UndefOr[Any] = js.undefined
  }
  object Options {
    
    inline def apply(): Options = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Options]
    }
    
    extension [Self <: Options](x: Self) {
      
      inline def setParser(value: Any): Self = StObject.set(x, "parser", value.asInstanceOf[js.Any])
      
      inline def setParserUndefined: Self = StObject.set(x, "parser", js.undefined)
    }
  }
}
