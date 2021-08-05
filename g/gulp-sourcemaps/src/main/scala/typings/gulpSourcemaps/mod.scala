package typings.gulpSourcemaps

import typings.node.NodeJS.ReadWriteStream
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("gulp-sourcemaps", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def init(): ReadWriteStream = ^.asInstanceOf[js.Dynamic].applyDynamic("init")().asInstanceOf[ReadWriteStream]
  inline def init(opts: InitOptions): ReadWriteStream = ^.asInstanceOf[js.Dynamic].applyDynamic("init")(opts.asInstanceOf[js.Any]).asInstanceOf[ReadWriteStream]
  
  inline def write(): ReadWriteStream = ^.asInstanceOf[js.Dynamic].applyDynamic("write")().asInstanceOf[ReadWriteStream]
  inline def write(opts: WriteOptions): ReadWriteStream = ^.asInstanceOf[js.Dynamic].applyDynamic("write")(opts.asInstanceOf[js.Any]).asInstanceOf[ReadWriteStream]
  inline def write(path: String): ReadWriteStream = ^.asInstanceOf[js.Dynamic].applyDynamic("write")(path.asInstanceOf[js.Any]).asInstanceOf[ReadWriteStream]
  inline def write(path: String, opts: WriteOptions): ReadWriteStream = (^.asInstanceOf[js.Dynamic].applyDynamic("write")(path.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[ReadWriteStream]
  inline def write(path: Unit, opts: WriteOptions): ReadWriteStream = (^.asInstanceOf[js.Dynamic].applyDynamic("write")(path.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[ReadWriteStream]
  
  trait CloneOptions extends StObject {
    
    var contents: js.UndefOr[Boolean] = js.undefined
    
    var deep: js.UndefOr[Boolean] = js.undefined
  }
  object CloneOptions {
    
    inline def apply(): CloneOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[CloneOptions]
    }
    
    extension [Self <: CloneOptions](x: Self) {
      
      inline def setContents(value: Boolean): Self = StObject.set(x, "contents", value.asInstanceOf[js.Any])
      
      inline def setContentsUndefined: Self = StObject.set(x, "contents", js.undefined)
      
      inline def setDeep(value: Boolean): Self = StObject.set(x, "deep", value.asInstanceOf[js.Any])
      
      inline def setDeepUndefined: Self = StObject.set(x, "deep", js.undefined)
    }
  }
  
  trait InitOptions extends StObject {
    
    var debug: js.UndefOr[Boolean] = js.undefined
    
    var loadMaps: js.UndefOr[Boolean] = js.undefined
  }
  object InitOptions {
    
    inline def apply(): InitOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[InitOptions]
    }
    
    extension [Self <: InitOptions](x: Self) {
      
      inline def setDebug(value: Boolean): Self = StObject.set(x, "debug", value.asInstanceOf[js.Any])
      
      inline def setDebugUndefined: Self = StObject.set(x, "debug", js.undefined)
      
      inline def setLoadMaps(value: Boolean): Self = StObject.set(x, "loadMaps", value.asInstanceOf[js.Any])
      
      inline def setLoadMapsUndefined: Self = StObject.set(x, "loadMaps", js.undefined)
    }
  }
  
  type WriteMapper = js.Function1[/* file */ String, String]
  
  trait WriteOptions extends StObject {
    
    var addComment: js.UndefOr[Boolean] = js.undefined
    
    @JSName("clone")
    var clone_FWriteOptions: js.UndefOr[Boolean | CloneOptions] = js.undefined
    
    var includeContent: js.UndefOr[Boolean] = js.undefined
    
    var sourceMappingURLPrefix: js.UndefOr[String | WriteMapper] = js.undefined
    
    var sourceRoot: js.UndefOr[String | WriteMapper] = js.undefined
  }
  object WriteOptions {
    
    inline def apply(): WriteOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[WriteOptions]
    }
    
    extension [Self <: WriteOptions](x: Self) {
      
      inline def setAddComment(value: Boolean): Self = StObject.set(x, "addComment", value.asInstanceOf[js.Any])
      
      inline def setAddCommentUndefined: Self = StObject.set(x, "addComment", js.undefined)
      
      inline def setClone_(value: Boolean | CloneOptions): Self = StObject.set(x, "clone", value.asInstanceOf[js.Any])
      
      inline def setClone_Undefined: Self = StObject.set(x, "clone", js.undefined)
      
      inline def setIncludeContent(value: Boolean): Self = StObject.set(x, "includeContent", value.asInstanceOf[js.Any])
      
      inline def setIncludeContentUndefined: Self = StObject.set(x, "includeContent", js.undefined)
      
      inline def setSourceMappingURLPrefix(value: String | WriteMapper): Self = StObject.set(x, "sourceMappingURLPrefix", value.asInstanceOf[js.Any])
      
      inline def setSourceMappingURLPrefixFunction1(value: /* file */ String => String): Self = StObject.set(x, "sourceMappingURLPrefix", js.Any.fromFunction1(value))
      
      inline def setSourceMappingURLPrefixUndefined: Self = StObject.set(x, "sourceMappingURLPrefix", js.undefined)
      
      inline def setSourceRoot(value: String | WriteMapper): Self = StObject.set(x, "sourceRoot", value.asInstanceOf[js.Any])
      
      inline def setSourceRootFunction1(value: /* file */ String => String): Self = StObject.set(x, "sourceRoot", js.Any.fromFunction1(value))
      
      inline def setSourceRootUndefined: Self = StObject.set(x, "sourceRoot", js.undefined)
    }
  }
}
