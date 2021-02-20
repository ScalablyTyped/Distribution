package typings.gulpInject

import typings.node.NodeJS.ReadWriteStream
import typings.node.NodeJS.ReadableStream
import typings.vinyl.mod.File
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("gulp-inject", JSImport.Namespace)
  @js.native
  def apply(sources: ReadableStream): ReadWriteStream = js.native
  @JSImport("gulp-inject", JSImport.Namespace)
  @js.native
  def apply(sources: ReadableStream, options: IOptions): ReadWriteStream = js.native
  
  @js.native
  trait IOptions extends StObject {
    
    var addPrefix: js.UndefOr[String] = js.native
    
    var addRootSlash: js.UndefOr[Boolean] = js.native
    
    var addSuffix: js.UndefOr[String] = js.native
    
    var empty: js.UndefOr[Boolean] = js.native
    
    var endtag: js.UndefOr[String | ITagFunction] = js.native
    
    var ignorePath: js.UndefOr[String | js.Array[String]] = js.native
    
    var name: js.UndefOr[String] = js.native
    
    var relative: js.UndefOr[Boolean] = js.native
    
    var removeTags: js.UndefOr[Boolean] = js.native
    
    var selfClosingTag: js.UndefOr[Boolean] = js.native
    
    var starttag: js.UndefOr[String | ITagFunction] = js.native
    
    var transform: js.UndefOr[ITransformFunction] = js.native
  }
  object IOptions {
    
    @scala.inline
    def apply(): IOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[IOptions]
    }
    
    @scala.inline
    implicit class IOptionsMutableBuilder[Self <: IOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAddPrefix(value: String): Self = StObject.set(x, "addPrefix", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAddPrefixUndefined: Self = StObject.set(x, "addPrefix", js.undefined)
      
      @scala.inline
      def setAddRootSlash(value: Boolean): Self = StObject.set(x, "addRootSlash", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAddRootSlashUndefined: Self = StObject.set(x, "addRootSlash", js.undefined)
      
      @scala.inline
      def setAddSuffix(value: String): Self = StObject.set(x, "addSuffix", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAddSuffixUndefined: Self = StObject.set(x, "addSuffix", js.undefined)
      
      @scala.inline
      def setEmpty(value: Boolean): Self = StObject.set(x, "empty", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEmptyUndefined: Self = StObject.set(x, "empty", js.undefined)
      
      @scala.inline
      def setEndtag(value: String | ITagFunction): Self = StObject.set(x, "endtag", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEndtagFunction2(value: (/* targetExt */ String, /* sourceExt */ String) => String): Self = StObject.set(x, "endtag", js.Any.fromFunction2(value))
      
      @scala.inline
      def setEndtagUndefined: Self = StObject.set(x, "endtag", js.undefined)
      
      @scala.inline
      def setIgnorePath(value: String | js.Array[String]): Self = StObject.set(x, "ignorePath", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIgnorePathUndefined: Self = StObject.set(x, "ignorePath", js.undefined)
      
      @scala.inline
      def setIgnorePathVarargs(value: String*): Self = StObject.set(x, "ignorePath", js.Array(value :_*))
      
      @scala.inline
      def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
      
      @scala.inline
      def setRelative(value: Boolean): Self = StObject.set(x, "relative", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRelativeUndefined: Self = StObject.set(x, "relative", js.undefined)
      
      @scala.inline
      def setRemoveTags(value: Boolean): Self = StObject.set(x, "removeTags", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRemoveTagsUndefined: Self = StObject.set(x, "removeTags", js.undefined)
      
      @scala.inline
      def setSelfClosingTag(value: Boolean): Self = StObject.set(x, "selfClosingTag", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSelfClosingTagUndefined: Self = StObject.set(x, "selfClosingTag", js.undefined)
      
      @scala.inline
      def setStarttag(value: String | ITagFunction): Self = StObject.set(x, "starttag", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStarttagFunction2(value: (/* targetExt */ String, /* sourceExt */ String) => String): Self = StObject.set(x, "starttag", js.Any.fromFunction2(value))
      
      @scala.inline
      def setStarttagUndefined: Self = StObject.set(x, "starttag", js.undefined)
      
      @scala.inline
      def setTransform(
        value: (/* filepath */ String, /* file */ js.UndefOr[File], /* index */ js.UndefOr[Double], /* length */ js.UndefOr[Double], /* targetFile */ js.UndefOr[File]) => String
      ): Self = StObject.set(x, "transform", js.Any.fromFunction5(value))
      
      @scala.inline
      def setTransformUndefined: Self = StObject.set(x, "transform", js.undefined)
    }
  }
  
  type ITagFunction = js.Function2[/* targetExt */ String, /* sourceExt */ String, String]
  
  type ITransformFunction = js.Function5[
    /* filepath */ String, 
    /* file */ js.UndefOr[File], 
    /* index */ js.UndefOr[Double], 
    /* length */ js.UndefOr[Double], 
    /* targetFile */ js.UndefOr[File], 
    String
  ]
}
