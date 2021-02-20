package typings.gulpRename

import typings.node.NodeJS.ReadWriteStream
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("gulp-rename", JSImport.Namespace)
  @js.native
  def apply(callback: js.Function1[/* path */ ParsedPath, _]): ReadWriteStream = js.native
  @JSImport("gulp-rename", JSImport.Namespace)
  @js.native
  def apply(name: String): ReadWriteStream = js.native
  @JSImport("gulp-rename", JSImport.Namespace)
  @js.native
  def apply(opts: Options): ReadWriteStream = js.native
  
  @js.native
  trait Options extends ParsedPath {
    
    var prefix: js.UndefOr[String] = js.native
    
    var suffix: js.UndefOr[String] = js.native
  }
  object Options {
    
    @scala.inline
    def apply(): Options = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Options]
    }
    
    @scala.inline
    implicit class OptionsMutableBuilder[Self <: Options] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setPrefix(value: String): Self = StObject.set(x, "prefix", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPrefixUndefined: Self = StObject.set(x, "prefix", js.undefined)
      
      @scala.inline
      def setSuffix(value: String): Self = StObject.set(x, "suffix", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSuffixUndefined: Self = StObject.set(x, "suffix", js.undefined)
    }
  }
  
  @js.native
  trait ParsedPath extends StObject {
    
    var basename: js.UndefOr[String] = js.native
    
    var dirname: js.UndefOr[String] = js.native
    
    var extname: js.UndefOr[String] = js.native
  }
  object ParsedPath {
    
    @scala.inline
    def apply(): ParsedPath = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ParsedPath]
    }
    
    @scala.inline
    implicit class ParsedPathMutableBuilder[Self <: ParsedPath] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setBasename(value: String): Self = StObject.set(x, "basename", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBasenameUndefined: Self = StObject.set(x, "basename", js.undefined)
      
      @scala.inline
      def setDirname(value: String): Self = StObject.set(x, "dirname", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDirnameUndefined: Self = StObject.set(x, "dirname", js.undefined)
      
      @scala.inline
      def setExtname(value: String): Self = StObject.set(x, "extname", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setExtnameUndefined: Self = StObject.set(x, "extname", js.undefined)
    }
  }
}
