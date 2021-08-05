package typings.gulpTypescript

import typings.node.Buffer
import typings.node.NodeJS.ReadableStream
import typings.typescript.mod.CustomTransformers
import typings.typescript.mod.Program
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesMod {
  
  type FinalTransformers = js.UndefOr[js.Function1[/* program */ js.UndefOr[Program], CustomTransformers]]
  
  type GetCustomTransformers = String | (js.Function1[/* program */ js.UndefOr[Program], js.UndefOr[CustomTransformers]])
  
  trait TsConfig extends StObject {
    
    var compilerOptions: js.UndefOr[js.Any] = js.undefined
    
    var exclude: js.UndefOr[js.Array[String]] = js.undefined
    
    var files: js.UndefOr[js.Array[String]] = js.undefined
    
    var include: js.UndefOr[js.Array[String]] = js.undefined
  }
  object TsConfig {
    
    inline def apply(): TsConfig = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[TsConfig]
    }
    
    extension [Self <: TsConfig](x: Self) {
      
      inline def setCompilerOptions(value: js.Any): Self = StObject.set(x, "compilerOptions", value.asInstanceOf[js.Any])
      
      inline def setCompilerOptionsUndefined: Self = StObject.set(x, "compilerOptions", js.undefined)
      
      inline def setExclude(value: js.Array[String]): Self = StObject.set(x, "exclude", value.asInstanceOf[js.Any])
      
      inline def setExcludeUndefined: Self = StObject.set(x, "exclude", js.undefined)
      
      inline def setExcludeVarargs(value: String*): Self = StObject.set(x, "exclude", js.Array(value :_*))
      
      inline def setFiles(value: js.Array[String]): Self = StObject.set(x, "files", value.asInstanceOf[js.Any])
      
      inline def setFilesUndefined: Self = StObject.set(x, "files", js.undefined)
      
      inline def setFilesVarargs(value: String*): Self = StObject.set(x, "files", js.Array(value :_*))
      
      inline def setInclude(value: js.Array[String]): Self = StObject.set(x, "include", value.asInstanceOf[js.Any])
      
      inline def setIncludeUndefined: Self = StObject.set(x, "include", js.undefined)
      
      inline def setIncludeVarargs(value: String*): Self = StObject.set(x, "include", js.Array(value :_*))
    }
  }
  
  trait VinylFile extends StObject {
    
    var base: String
    
    var basename: String
    
    var contents: Buffer | ReadableStream | Null
    
    var cwd: String
    
    var dirname: String
    
    var extname: String
    
    var path: String
    
    var sourceMap: js.UndefOr[js.Any] = js.undefined
    
    var stem: String
  }
  object VinylFile {
    
    inline def apply(
      base: String,
      basename: String,
      cwd: String,
      dirname: String,
      extname: String,
      path: String,
      stem: String
    ): VinylFile = {
      val __obj = js.Dynamic.literal(base = base.asInstanceOf[js.Any], basename = basename.asInstanceOf[js.Any], cwd = cwd.asInstanceOf[js.Any], dirname = dirname.asInstanceOf[js.Any], extname = extname.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any], stem = stem.asInstanceOf[js.Any], contents = null)
      __obj.asInstanceOf[VinylFile]
    }
    
    extension [Self <: VinylFile](x: Self) {
      
      inline def setBase(value: String): Self = StObject.set(x, "base", value.asInstanceOf[js.Any])
      
      inline def setBasename(value: String): Self = StObject.set(x, "basename", value.asInstanceOf[js.Any])
      
      inline def setContents(value: Buffer | ReadableStream): Self = StObject.set(x, "contents", value.asInstanceOf[js.Any])
      
      inline def setContentsNull: Self = StObject.set(x, "contents", null)
      
      inline def setCwd(value: String): Self = StObject.set(x, "cwd", value.asInstanceOf[js.Any])
      
      inline def setDirname(value: String): Self = StObject.set(x, "dirname", value.asInstanceOf[js.Any])
      
      inline def setExtname(value: String): Self = StObject.set(x, "extname", value.asInstanceOf[js.Any])
      
      inline def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
      
      inline def setSourceMap(value: js.Any): Self = StObject.set(x, "sourceMap", value.asInstanceOf[js.Any])
      
      inline def setSourceMapUndefined: Self = StObject.set(x, "sourceMap", js.undefined)
      
      inline def setStem(value: String): Self = StObject.set(x, "stem", value.asInstanceOf[js.Any])
    }
  }
}
