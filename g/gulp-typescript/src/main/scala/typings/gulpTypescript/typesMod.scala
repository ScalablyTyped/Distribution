package typings.gulpTypescript

import typings.node.Buffer
import typings.node.NodeJS.ReadableStream
import typings.typescript.mod.CustomTransformers
import typings.typescript.mod.Program
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesMod {
  
  type FinalTransformers = js.UndefOr[js.Function1[/* program */ js.UndefOr[Program], CustomTransformers]]
  
  type GetCustomTransformers = String | (js.Function1[/* program */ js.UndefOr[Program], js.UndefOr[CustomTransformers]])
  
  @js.native
  trait TsConfig extends StObject {
    
    var compilerOptions: js.UndefOr[js.Any] = js.native
    
    var exclude: js.UndefOr[js.Array[String]] = js.native
    
    var files: js.UndefOr[js.Array[String]] = js.native
    
    var include: js.UndefOr[js.Array[String]] = js.native
  }
  object TsConfig {
    
    @scala.inline
    def apply(): TsConfig = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[TsConfig]
    }
    
    @scala.inline
    implicit class TsConfigMutableBuilder[Self <: TsConfig] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCompilerOptions(value: js.Any): Self = StObject.set(x, "compilerOptions", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCompilerOptionsUndefined: Self = StObject.set(x, "compilerOptions", js.undefined)
      
      @scala.inline
      def setExclude(value: js.Array[String]): Self = StObject.set(x, "exclude", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setExcludeUndefined: Self = StObject.set(x, "exclude", js.undefined)
      
      @scala.inline
      def setExcludeVarargs(value: String*): Self = StObject.set(x, "exclude", js.Array(value :_*))
      
      @scala.inline
      def setFiles(value: js.Array[String]): Self = StObject.set(x, "files", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFilesUndefined: Self = StObject.set(x, "files", js.undefined)
      
      @scala.inline
      def setFilesVarargs(value: String*): Self = StObject.set(x, "files", js.Array(value :_*))
      
      @scala.inline
      def setInclude(value: js.Array[String]): Self = StObject.set(x, "include", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIncludeUndefined: Self = StObject.set(x, "include", js.undefined)
      
      @scala.inline
      def setIncludeVarargs(value: String*): Self = StObject.set(x, "include", js.Array(value :_*))
    }
  }
  
  @js.native
  trait VinylFile extends StObject {
    
    var base: String = js.native
    
    var basename: String = js.native
    
    var contents: Buffer | ReadableStream | Null = js.native
    
    var cwd: String = js.native
    
    var dirname: String = js.native
    
    var extname: String = js.native
    
    var path: String = js.native
    
    var sourceMap: js.UndefOr[js.Any] = js.native
    
    var stem: String = js.native
  }
  object VinylFile {
    
    @scala.inline
    def apply(
      base: String,
      basename: String,
      cwd: String,
      dirname: String,
      extname: String,
      path: String,
      stem: String
    ): VinylFile = {
      val __obj = js.Dynamic.literal(base = base.asInstanceOf[js.Any], basename = basename.asInstanceOf[js.Any], cwd = cwd.asInstanceOf[js.Any], dirname = dirname.asInstanceOf[js.Any], extname = extname.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any], stem = stem.asInstanceOf[js.Any])
      __obj.asInstanceOf[VinylFile]
    }
    
    @scala.inline
    implicit class VinylFileMutableBuilder[Self <: VinylFile] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setBase(value: String): Self = StObject.set(x, "base", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBasename(value: String): Self = StObject.set(x, "basename", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setContents(value: Buffer | ReadableStream): Self = StObject.set(x, "contents", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setContentsNull: Self = StObject.set(x, "contents", null)
      
      @scala.inline
      def setCwd(value: String): Self = StObject.set(x, "cwd", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDirname(value: String): Self = StObject.set(x, "dirname", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setExtname(value: String): Self = StObject.set(x, "extname", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSourceMap(value: js.Any): Self = StObject.set(x, "sourceMap", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSourceMapUndefined: Self = StObject.set(x, "sourceMap", js.undefined)
      
      @scala.inline
      def setStem(value: String): Self = StObject.set(x, "stem", value.asInstanceOf[js.Any])
    }
  }
}
