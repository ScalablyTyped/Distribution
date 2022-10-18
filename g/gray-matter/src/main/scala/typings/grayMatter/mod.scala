package typings.grayMatter

import org.scalablytyped.runtime.StringDictionary
import typings.grayMatter.anon.Content
import typings.grayMatter.anon.ContentString
import typings.grayMatter.anon.Name
import typings.grayMatter.anon.Parse
import typings.node.bufferMod.global.Buffer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  inline def apply[I /* <: Input */, O /* <: GrayMatterOption[I, O] */](input: I): GrayMatterFile[I] = ^.asInstanceOf[js.Dynamic].apply(input.asInstanceOf[js.Any]).asInstanceOf[GrayMatterFile[I]]
  inline def apply[I /* <: Input */, O /* <: GrayMatterOption[I, O] */](input: I, options: O): GrayMatterFile[I] = (^.asInstanceOf[js.Dynamic].apply(input.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[GrayMatterFile[I]]
  inline def apply[I /* <: Input */, O /* <: GrayMatterOption[I, O] */](input: Content[I]): GrayMatterFile[I] = ^.asInstanceOf[js.Dynamic].apply(input.asInstanceOf[js.Any]).asInstanceOf[GrayMatterFile[I]]
  inline def apply[I /* <: Input */, O /* <: GrayMatterOption[I, O] */](input: Content[I], options: O): GrayMatterFile[I] = (^.asInstanceOf[js.Dynamic].apply(input.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[GrayMatterFile[I]]
  
  @JSImport("gray-matter", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def language[O /* <: GrayMatterOption[String, O] */](str: String): Name = ^.asInstanceOf[js.Dynamic].applyDynamic("language")(str.asInstanceOf[js.Any]).asInstanceOf[Name]
  inline def language[O /* <: GrayMatterOption[String, O] */](str: String, options: GrayMatterOption[String, O]): Name = (^.asInstanceOf[js.Dynamic].applyDynamic("language")(str.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Name]
  
  inline def read[O /* <: GrayMatterOption[String, O] */](fp: String): GrayMatterFile[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("read")(fp.asInstanceOf[js.Any]).asInstanceOf[GrayMatterFile[String]]
  inline def read[O /* <: GrayMatterOption[String, O] */](fp: String, options: GrayMatterOption[String, O]): GrayMatterFile[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("read")(fp.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[GrayMatterFile[String]]
  
  inline def stringify[O /* <: GrayMatterOption[String, O] */](file: String, data: js.Object): String = (^.asInstanceOf[js.Dynamic].applyDynamic("stringify")(file.asInstanceOf[js.Any], data.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def stringify[O /* <: GrayMatterOption[String, O] */](file: String, data: js.Object, options: GrayMatterOption[String, O]): String = (^.asInstanceOf[js.Dynamic].applyDynamic("stringify")(file.asInstanceOf[js.Any], data.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def stringify[O /* <: GrayMatterOption[String, O] */](file: ContentString, data: js.Object): String = (^.asInstanceOf[js.Dynamic].applyDynamic("stringify")(file.asInstanceOf[js.Any], data.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def stringify[O /* <: GrayMatterOption[String, O] */](file: ContentString, data: js.Object, options: GrayMatterOption[String, O]): String = (^.asInstanceOf[js.Dynamic].applyDynamic("stringify")(file.asInstanceOf[js.Any], data.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[String]
  
  inline def test[O /* <: GrayMatterOption[String, O] */](str: String): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("test")(str.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  inline def test[O /* <: GrayMatterOption[String, O] */](str: String, options: GrayMatterOption[String, O]): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("test")(str.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  trait GrayMatterFile[I /* <: Input */] extends StObject {
    
    var content: String
    
    var data: StringDictionary[Any]
    
    var excerpt: js.UndefOr[String] = js.undefined
    
    var language: String
    
    var matter: String
    
    var orig: Buffer | I
    
    def stringify(lang: String): String
  }
  object GrayMatterFile {
    
    inline def apply[I /* <: Input */](
      content: String,
      data: StringDictionary[Any],
      language: String,
      matter: String,
      orig: Buffer | I,
      stringify: String => String
    ): GrayMatterFile[I] = {
      val __obj = js.Dynamic.literal(content = content.asInstanceOf[js.Any], data = data.asInstanceOf[js.Any], language = language.asInstanceOf[js.Any], matter = matter.asInstanceOf[js.Any], orig = orig.asInstanceOf[js.Any], stringify = js.Any.fromFunction1(stringify))
      __obj.asInstanceOf[GrayMatterFile[I]]
    }
    
    extension [Self <: GrayMatterFile[?], I /* <: Input */](x: Self & GrayMatterFile[I]) {
      
      inline def setContent(value: String): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
      
      inline def setData(value: StringDictionary[Any]): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
      
      inline def setExcerpt(value: String): Self = StObject.set(x, "excerpt", value.asInstanceOf[js.Any])
      
      inline def setExcerptUndefined: Self = StObject.set(x, "excerpt", js.undefined)
      
      inline def setLanguage(value: String): Self = StObject.set(x, "language", value.asInstanceOf[js.Any])
      
      inline def setMatter(value: String): Self = StObject.set(x, "matter", value.asInstanceOf[js.Any])
      
      inline def setOrig(value: Buffer | I): Self = StObject.set(x, "orig", value.asInstanceOf[js.Any])
      
      inline def setStringify(value: String => String): Self = StObject.set(x, "stringify", js.Any.fromFunction1(value))
    }
  }
  
  trait GrayMatterOption[I /* <: Input */, O /* <: GrayMatterOption[I, O] */] extends StObject {
    
    var delimiters: js.UndefOr[String | (js.Tuple2[String, String])] = js.undefined
    
    var engines: js.UndefOr[StringDictionary[(js.Function1[/* input */ String, js.Object]) | Parse]] = js.undefined
    
    var eval: js.UndefOr[Boolean] = js.undefined
    
    var excerpt: js.UndefOr[Boolean | (js.Function2[/* input */ I, /* options */ O, String])] = js.undefined
    
    var excerpt_separator: js.UndefOr[String] = js.undefined
    
    var language: js.UndefOr[String] = js.undefined
    
    var parser: js.UndefOr[js.Function0[Unit]] = js.undefined
  }
  object GrayMatterOption {
    
    inline def apply[I /* <: Input */, O /* <: GrayMatterOption[I, O] */](): GrayMatterOption[I, O] = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[GrayMatterOption[I, O]]
    }
    
    extension [Self <: GrayMatterOption[?, ?], I /* <: Input */, O /* <: GrayMatterOption[I, O] */](x: Self & (GrayMatterOption[I, O])) {
      
      inline def setDelimiters(value: String | (js.Tuple2[String, String])): Self = StObject.set(x, "delimiters", value.asInstanceOf[js.Any])
      
      inline def setDelimitersUndefined: Self = StObject.set(x, "delimiters", js.undefined)
      
      inline def setEngines(value: StringDictionary[(js.Function1[/* input */ String, js.Object]) | Parse]): Self = StObject.set(x, "engines", value.asInstanceOf[js.Any])
      
      inline def setEnginesUndefined: Self = StObject.set(x, "engines", js.undefined)
      
      inline def setEval(value: Boolean): Self = StObject.set(x, "eval", value.asInstanceOf[js.Any])
      
      inline def setEvalUndefined: Self = StObject.set(x, "eval", js.undefined)
      
      inline def setExcerpt(value: Boolean | (js.Function2[/* input */ I, /* options */ O, String])): Self = StObject.set(x, "excerpt", value.asInstanceOf[js.Any])
      
      inline def setExcerptFunction2(value: (/* input */ I, /* options */ O) => String): Self = StObject.set(x, "excerpt", js.Any.fromFunction2(value))
      
      inline def setExcerptUndefined: Self = StObject.set(x, "excerpt", js.undefined)
      
      inline def setExcerpt_separator(value: String): Self = StObject.set(x, "excerpt_separator", value.asInstanceOf[js.Any])
      
      inline def setExcerpt_separatorUndefined: Self = StObject.set(x, "excerpt_separator", js.undefined)
      
      inline def setLanguage(value: String): Self = StObject.set(x, "language", value.asInstanceOf[js.Any])
      
      inline def setLanguageUndefined: Self = StObject.set(x, "language", js.undefined)
      
      inline def setParser(value: () => Unit): Self = StObject.set(x, "parser", js.Any.fromFunction0(value))
      
      inline def setParserUndefined: Self = StObject.set(x, "parser", js.undefined)
    }
  }
  
  type Input = String | Buffer
}
