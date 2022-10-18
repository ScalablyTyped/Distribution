package typings.gulpRename

import typings.node.NodeJS.ReadWriteStream
import typings.vinyl.mod.File
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  inline def apply(obj: String): ReadWriteStream = ^.asInstanceOf[js.Dynamic].apply(obj.asInstanceOf[js.Any]).asInstanceOf[ReadWriteStream]
  inline def apply(obj: String, options: PluginOptions): ReadWriteStream = (^.asInstanceOf[js.Dynamic].apply(obj.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[ReadWriteStream]
  inline def apply(obj: js.Function2[/* path */ ParsedPath, /* file */ File, ParsedPath | Unit]): ReadWriteStream = ^.asInstanceOf[js.Dynamic].apply(obj.asInstanceOf[js.Any]).asInstanceOf[ReadWriteStream]
  inline def apply(
    obj: js.Function2[/* path */ ParsedPath, /* file */ File, ParsedPath | Unit],
    options: PluginOptions
  ): ReadWriteStream = (^.asInstanceOf[js.Dynamic].apply(obj.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[ReadWriteStream]
  inline def apply(obj: Options): ReadWriteStream = ^.asInstanceOf[js.Dynamic].apply(obj.asInstanceOf[js.Any]).asInstanceOf[ReadWriteStream]
  inline def apply(obj: Options, options: PluginOptions): ReadWriteStream = (^.asInstanceOf[js.Dynamic].apply(obj.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[ReadWriteStream]
  
  @JSImport("gulp-rename", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  trait Options extends StObject {
    
    var basename: js.UndefOr[String] = js.undefined
    
    var dirname: js.UndefOr[String] = js.undefined
    
    var extname: js.UndefOr[String] = js.undefined
    
    var prefix: js.UndefOr[String] = js.undefined
    
    var suffix: js.UndefOr[String] = js.undefined
  }
  object Options {
    
    inline def apply(): Options = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Options]
    }
    
    extension [Self <: Options](x: Self) {
      
      inline def setBasename(value: String): Self = StObject.set(x, "basename", value.asInstanceOf[js.Any])
      
      inline def setBasenameUndefined: Self = StObject.set(x, "basename", js.undefined)
      
      inline def setDirname(value: String): Self = StObject.set(x, "dirname", value.asInstanceOf[js.Any])
      
      inline def setDirnameUndefined: Self = StObject.set(x, "dirname", js.undefined)
      
      inline def setExtname(value: String): Self = StObject.set(x, "extname", value.asInstanceOf[js.Any])
      
      inline def setExtnameUndefined: Self = StObject.set(x, "extname", js.undefined)
      
      inline def setPrefix(value: String): Self = StObject.set(x, "prefix", value.asInstanceOf[js.Any])
      
      inline def setPrefixUndefined: Self = StObject.set(x, "prefix", js.undefined)
      
      inline def setSuffix(value: String): Self = StObject.set(x, "suffix", value.asInstanceOf[js.Any])
      
      inline def setSuffixUndefined: Self = StObject.set(x, "suffix", js.undefined)
    }
  }
  
  trait ParsedPath extends StObject {
    
    var basename: String
    
    var dirname: String
    
    var extname: String
  }
  object ParsedPath {
    
    inline def apply(basename: String, dirname: String, extname: String): ParsedPath = {
      val __obj = js.Dynamic.literal(basename = basename.asInstanceOf[js.Any], dirname = dirname.asInstanceOf[js.Any], extname = extname.asInstanceOf[js.Any])
      __obj.asInstanceOf[ParsedPath]
    }
    
    extension [Self <: ParsedPath](x: Self) {
      
      inline def setBasename(value: String): Self = StObject.set(x, "basename", value.asInstanceOf[js.Any])
      
      inline def setDirname(value: String): Self = StObject.set(x, "dirname", value.asInstanceOf[js.Any])
      
      inline def setExtname(value: String): Self = StObject.set(x, "extname", value.asInstanceOf[js.Any])
    }
  }
  
  trait PluginOptions extends StObject {
    
    var multiExt: js.UndefOr[Boolean] = js.undefined
  }
  object PluginOptions {
    
    inline def apply(): PluginOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PluginOptions]
    }
    
    extension [Self <: PluginOptions](x: Self) {
      
      inline def setMultiExt(value: Boolean): Self = StObject.set(x, "multiExt", value.asInstanceOf[js.Any])
      
      inline def setMultiExtUndefined: Self = StObject.set(x, "multiExt", js.undefined)
    }
  }
}
