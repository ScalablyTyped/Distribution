package typings.gulpSourcemaps

import typings.node.NodeJS.ReadWriteStream
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("gulp-sourcemaps", "init")
  @js.native
  def init(): ReadWriteStream = js.native
  @JSImport("gulp-sourcemaps", "init")
  @js.native
  def init(opts: InitOptions): ReadWriteStream = js.native
  
  @JSImport("gulp-sourcemaps", "write")
  @js.native
  def write(): ReadWriteStream = js.native
  @JSImport("gulp-sourcemaps", "write")
  @js.native
  def write(opts: WriteOptions): ReadWriteStream = js.native
  @JSImport("gulp-sourcemaps", "write")
  @js.native
  def write(path: js.UndefOr[scala.Nothing], opts: WriteOptions): ReadWriteStream = js.native
  @JSImport("gulp-sourcemaps", "write")
  @js.native
  def write(path: String): ReadWriteStream = js.native
  @JSImport("gulp-sourcemaps", "write")
  @js.native
  def write(path: String, opts: WriteOptions): ReadWriteStream = js.native
  
  @js.native
  trait CloneOptions extends StObject {
    
    var contents: js.UndefOr[Boolean] = js.native
    
    var deep: js.UndefOr[Boolean] = js.native
  }
  object CloneOptions {
    
    @scala.inline
    def apply(): CloneOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[CloneOptions]
    }
    
    @scala.inline
    implicit class CloneOptionsMutableBuilder[Self <: CloneOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setContents(value: Boolean): Self = StObject.set(x, "contents", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setContentsUndefined: Self = StObject.set(x, "contents", js.undefined)
      
      @scala.inline
      def setDeep(value: Boolean): Self = StObject.set(x, "deep", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDeepUndefined: Self = StObject.set(x, "deep", js.undefined)
    }
  }
  
  @js.native
  trait InitOptions extends StObject {
    
    var debug: js.UndefOr[Boolean] = js.native
    
    var loadMaps: js.UndefOr[Boolean] = js.native
  }
  object InitOptions {
    
    @scala.inline
    def apply(): InitOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[InitOptions]
    }
    
    @scala.inline
    implicit class InitOptionsMutableBuilder[Self <: InitOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDebug(value: Boolean): Self = StObject.set(x, "debug", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDebugUndefined: Self = StObject.set(x, "debug", js.undefined)
      
      @scala.inline
      def setLoadMaps(value: Boolean): Self = StObject.set(x, "loadMaps", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLoadMapsUndefined: Self = StObject.set(x, "loadMaps", js.undefined)
    }
  }
  
  type WriteMapper = js.Function1[/* file */ String, String]
  
  @js.native
  trait WriteOptions extends StObject {
    
    var addComment: js.UndefOr[Boolean] = js.native
    
    @JSName("clone")
    var clone_FWriteOptions: js.UndefOr[Boolean | CloneOptions] = js.native
    
    var includeContent: js.UndefOr[Boolean] = js.native
    
    var sourceMappingURLPrefix: js.UndefOr[String | WriteMapper] = js.native
    
    var sourceRoot: js.UndefOr[String | WriteMapper] = js.native
  }
  object WriteOptions {
    
    @scala.inline
    def apply(): WriteOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[WriteOptions]
    }
    
    @scala.inline
    implicit class WriteOptionsMutableBuilder[Self <: WriteOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAddComment(value: Boolean): Self = StObject.set(x, "addComment", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAddCommentUndefined: Self = StObject.set(x, "addComment", js.undefined)
      
      @scala.inline
      def setClone_(value: Boolean | CloneOptions): Self = StObject.set(x, "clone", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setClone_Undefined: Self = StObject.set(x, "clone", js.undefined)
      
      @scala.inline
      def setIncludeContent(value: Boolean): Self = StObject.set(x, "includeContent", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIncludeContentUndefined: Self = StObject.set(x, "includeContent", js.undefined)
      
      @scala.inline
      def setSourceMappingURLPrefix(value: String | WriteMapper): Self = StObject.set(x, "sourceMappingURLPrefix", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSourceMappingURLPrefixFunction1(value: /* file */ String => String): Self = StObject.set(x, "sourceMappingURLPrefix", js.Any.fromFunction1(value))
      
      @scala.inline
      def setSourceMappingURLPrefixUndefined: Self = StObject.set(x, "sourceMappingURLPrefix", js.undefined)
      
      @scala.inline
      def setSourceRoot(value: String | WriteMapper): Self = StObject.set(x, "sourceRoot", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSourceRootFunction1(value: /* file */ String => String): Self = StObject.set(x, "sourceRoot", js.Any.fromFunction1(value))
      
      @scala.inline
      def setSourceRootUndefined: Self = StObject.set(x, "sourceRoot", js.undefined)
    }
  }
}
