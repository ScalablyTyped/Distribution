package typings.gulpInject

import typings.node.NodeJS.ReadWriteStream
import typings.node.NodeJS.ReadableStream
import typings.vinyl.mod.File
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  inline def apply(sources: ReadableStream): ReadWriteStream = ^.asInstanceOf[js.Dynamic].apply(sources.asInstanceOf[js.Any]).asInstanceOf[ReadWriteStream]
  inline def apply(sources: ReadableStream, options: IOptions): ReadWriteStream = (^.asInstanceOf[js.Dynamic].apply(sources.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[ReadWriteStream]
  
  @JSImport("gulp-inject", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  trait IOptions extends StObject {
    
    var addPrefix: js.UndefOr[String] = js.undefined
    
    var addRootSlash: js.UndefOr[Boolean] = js.undefined
    
    var addSuffix: js.UndefOr[String] = js.undefined
    
    var empty: js.UndefOr[Boolean] = js.undefined
    
    var endtag: js.UndefOr[String | ITagFunction] = js.undefined
    
    var ignorePath: js.UndefOr[String | js.Array[String]] = js.undefined
    
    var name: js.UndefOr[String] = js.undefined
    
    var relative: js.UndefOr[Boolean] = js.undefined
    
    var removeTags: js.UndefOr[Boolean] = js.undefined
    
    var selfClosingTag: js.UndefOr[Boolean] = js.undefined
    
    var starttag: js.UndefOr[String | ITagFunction] = js.undefined
    
    var transform: js.UndefOr[ITransformFunction] = js.undefined
  }
  object IOptions {
    
    inline def apply(): IOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[IOptions]
    }
    
    extension [Self <: IOptions](x: Self) {
      
      inline def setAddPrefix(value: String): Self = StObject.set(x, "addPrefix", value.asInstanceOf[js.Any])
      
      inline def setAddPrefixUndefined: Self = StObject.set(x, "addPrefix", js.undefined)
      
      inline def setAddRootSlash(value: Boolean): Self = StObject.set(x, "addRootSlash", value.asInstanceOf[js.Any])
      
      inline def setAddRootSlashUndefined: Self = StObject.set(x, "addRootSlash", js.undefined)
      
      inline def setAddSuffix(value: String): Self = StObject.set(x, "addSuffix", value.asInstanceOf[js.Any])
      
      inline def setAddSuffixUndefined: Self = StObject.set(x, "addSuffix", js.undefined)
      
      inline def setEmpty(value: Boolean): Self = StObject.set(x, "empty", value.asInstanceOf[js.Any])
      
      inline def setEmptyUndefined: Self = StObject.set(x, "empty", js.undefined)
      
      inline def setEndtag(value: String | ITagFunction): Self = StObject.set(x, "endtag", value.asInstanceOf[js.Any])
      
      inline def setEndtagFunction2(value: (/* targetExt */ String, /* sourceExt */ String) => String): Self = StObject.set(x, "endtag", js.Any.fromFunction2(value))
      
      inline def setEndtagUndefined: Self = StObject.set(x, "endtag", js.undefined)
      
      inline def setIgnorePath(value: String | js.Array[String]): Self = StObject.set(x, "ignorePath", value.asInstanceOf[js.Any])
      
      inline def setIgnorePathUndefined: Self = StObject.set(x, "ignorePath", js.undefined)
      
      inline def setIgnorePathVarargs(value: String*): Self = StObject.set(x, "ignorePath", js.Array(value :_*))
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
      
      inline def setRelative(value: Boolean): Self = StObject.set(x, "relative", value.asInstanceOf[js.Any])
      
      inline def setRelativeUndefined: Self = StObject.set(x, "relative", js.undefined)
      
      inline def setRemoveTags(value: Boolean): Self = StObject.set(x, "removeTags", value.asInstanceOf[js.Any])
      
      inline def setRemoveTagsUndefined: Self = StObject.set(x, "removeTags", js.undefined)
      
      inline def setSelfClosingTag(value: Boolean): Self = StObject.set(x, "selfClosingTag", value.asInstanceOf[js.Any])
      
      inline def setSelfClosingTagUndefined: Self = StObject.set(x, "selfClosingTag", js.undefined)
      
      inline def setStarttag(value: String | ITagFunction): Self = StObject.set(x, "starttag", value.asInstanceOf[js.Any])
      
      inline def setStarttagFunction2(value: (/* targetExt */ String, /* sourceExt */ String) => String): Self = StObject.set(x, "starttag", js.Any.fromFunction2(value))
      
      inline def setStarttagUndefined: Self = StObject.set(x, "starttag", js.undefined)
      
      inline def setTransform(
        value: (/* filepath */ String, /* file */ js.UndefOr[File], /* index */ js.UndefOr[Double], /* length */ js.UndefOr[Double], /* targetFile */ js.UndefOr[File]) => String
      ): Self = StObject.set(x, "transform", js.Any.fromFunction5(value))
      
      inline def setTransformUndefined: Self = StObject.set(x, "transform", js.undefined)
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
