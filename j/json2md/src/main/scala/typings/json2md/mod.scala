package typings.json2md

import org.scalablytyped.runtime.StringDictionary
import typings.json2md.mod.DefaultConverters.CodeInput
import typings.json2md.mod.DefaultConverters.ImgInput
import typings.json2md.mod.DefaultConverters.TableInput
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  inline def apply(data: String): String = ^.asInstanceOf[js.Dynamic].apply(data.asInstanceOf[js.Any]).asInstanceOf[String]
  inline def apply(data: String, prefix: String): String = (^.asInstanceOf[js.Dynamic].apply(data.asInstanceOf[js.Any], prefix.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def apply(data: js.Array[DataObject | String]): String = ^.asInstanceOf[js.Dynamic].apply(data.asInstanceOf[js.Any]).asInstanceOf[String]
  inline def apply(data: js.Array[DataObject | String], prefix: String): String = (^.asInstanceOf[js.Dynamic].apply(data.asInstanceOf[js.Any], prefix.asInstanceOf[js.Any])).asInstanceOf[String]
  /**
    * Converts a JSON input to markdown.
    *
    * @param data The input JSON data.
    * @param prefix A snippet to add before each line.
    * @return The generated markdown result.
    */
  inline def apply(data: DataObject): String = ^.asInstanceOf[js.Dynamic].apply(data.asInstanceOf[js.Any]).asInstanceOf[String]
  inline def apply(data: DataObject, prefix: String): String = (^.asInstanceOf[js.Dynamic].apply(data.asInstanceOf[js.Any], prefix.asInstanceOf[js.Any])).asInstanceOf[String]
  
  @JSImport("json2md", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("json2md", "converters")
  @js.native
  val converters: ConvertersMethods = js.native
  
  type ConverterCallback[TInput] = js.Function2[/* input */ TInput, /* json2md */ typings.json2md.mod.json2md, String]
  
  /* Inlined {[ TConverter in keyof json2md.json2md.DefaultConverters.Converters ]: json2md.json2md.ConverterCallback<json2md.json2md.DefaultConverters.Converters[TConverter]>} */
  trait ConvertersMethods extends StObject {
    
    def blockquote(input: String, json2md: typings.json2md.mod.json2md): String
    def blockquote(input: js.Array[String], json2md: typings.json2md.mod.json2md): String
    @JSName("blockquote")
    var blockquote_Original: ConverterCallback[String | js.Array[String]]
    
    def code(input: CodeInput, json2md: typings.json2md.mod.json2md): String
    @JSName("code")
    var code_Original: ConverterCallback[CodeInput]
    
    def h1(input: String, json2md: typings.json2md.mod.json2md): String
    def h1(input: js.Array[String], json2md: typings.json2md.mod.json2md): String
    @JSName("h1")
    var h1_Original: ConverterCallback[String | js.Array[String]]
    
    def h2(input: String, json2md: typings.json2md.mod.json2md): String
    def h2(input: js.Array[String], json2md: typings.json2md.mod.json2md): String
    @JSName("h2")
    var h2_Original: ConverterCallback[String | js.Array[String]]
    
    def h3(input: String, json2md: typings.json2md.mod.json2md): String
    def h3(input: js.Array[String], json2md: typings.json2md.mod.json2md): String
    @JSName("h3")
    var h3_Original: ConverterCallback[String | js.Array[String]]
    
    def h4(input: String, json2md: typings.json2md.mod.json2md): String
    def h4(input: js.Array[String], json2md: typings.json2md.mod.json2md): String
    @JSName("h4")
    var h4_Original: ConverterCallback[String | js.Array[String]]
    
    def h5(input: String, json2md: typings.json2md.mod.json2md): String
    def h5(input: js.Array[String], json2md: typings.json2md.mod.json2md): String
    @JSName("h5")
    var h5_Original: ConverterCallback[String | js.Array[String]]
    
    def h6(input: String, json2md: typings.json2md.mod.json2md): String
    def h6(input: js.Array[String], json2md: typings.json2md.mod.json2md): String
    @JSName("h6")
    var h6_Original: ConverterCallback[String | js.Array[String]]
    
    def img(input: js.Array[ImgInput], json2md: typings.json2md.mod.json2md): String
    def img(input: ImgInput, json2md: typings.json2md.mod.json2md): String
    @JSName("img")
    var img_Original: ConverterCallback[ImgInput | js.Array[ImgInput]]
    
    def ol(input: js.Array[String], json2md: typings.json2md.mod.json2md): String
    @JSName("ol")
    var ol_Original: ConverterCallback[js.Array[String]]
    
    def p(input: String, json2md: typings.json2md.mod.json2md): String
    def p(input: js.Array[String], json2md: typings.json2md.mod.json2md): String
    @JSName("p")
    var p_Original: ConverterCallback[String | js.Array[String]]
    
    def table(input: TableInput, json2md: typings.json2md.mod.json2md): String
    @JSName("table")
    var table_Original: ConverterCallback[TableInput]
    
    def ul(input: js.Array[String], json2md: typings.json2md.mod.json2md): String
    @JSName("ul")
    var ul_Original: ConverterCallback[js.Array[String]]
  }
  object ConvertersMethods {
    
    inline def apply(
      blockquote: (String | js.Array[String], /* json2md */ typings.json2md.mod.json2md) => String,
      code: (CodeInput, /* json2md */ typings.json2md.mod.json2md) => String,
      h1: (String | js.Array[String], /* json2md */ typings.json2md.mod.json2md) => String,
      h2: (String | js.Array[String], /* json2md */ typings.json2md.mod.json2md) => String,
      h3: (String | js.Array[String], /* json2md */ typings.json2md.mod.json2md) => String,
      h4: (String | js.Array[String], /* json2md */ typings.json2md.mod.json2md) => String,
      h5: (String | js.Array[String], /* json2md */ typings.json2md.mod.json2md) => String,
      h6: (String | js.Array[String], /* json2md */ typings.json2md.mod.json2md) => String,
      img: (ImgInput | js.Array[ImgInput], /* json2md */ typings.json2md.mod.json2md) => String,
      ol: (js.Array[String], /* json2md */ typings.json2md.mod.json2md) => String,
      p: (String | js.Array[String], /* json2md */ typings.json2md.mod.json2md) => String,
      table: (TableInput, /* json2md */ typings.json2md.mod.json2md) => String,
      ul: (js.Array[String], /* json2md */ typings.json2md.mod.json2md) => String
    ): ConvertersMethods = {
      val __obj = js.Dynamic.literal(blockquote = js.Any.fromFunction2(blockquote), code = js.Any.fromFunction2(code), h1 = js.Any.fromFunction2(h1), h2 = js.Any.fromFunction2(h2), h3 = js.Any.fromFunction2(h3), h4 = js.Any.fromFunction2(h4), h5 = js.Any.fromFunction2(h5), h6 = js.Any.fromFunction2(h6), img = js.Any.fromFunction2(img), ol = js.Any.fromFunction2(ol), p = js.Any.fromFunction2(p), table = js.Any.fromFunction2(table), ul = js.Any.fromFunction2(ul))
      __obj.asInstanceOf[ConvertersMethods]
    }
    
    extension [Self <: ConvertersMethods](x: Self) {
      
      inline def setBlockquote(value: (String | js.Array[String], /* json2md */ typings.json2md.mod.json2md) => String): Self = StObject.set(x, "blockquote", js.Any.fromFunction2(value))
      
      inline def setCode(value: (CodeInput, /* json2md */ typings.json2md.mod.json2md) => String): Self = StObject.set(x, "code", js.Any.fromFunction2(value))
      
      inline def setH1(value: (String | js.Array[String], /* json2md */ typings.json2md.mod.json2md) => String): Self = StObject.set(x, "h1", js.Any.fromFunction2(value))
      
      inline def setH2(value: (String | js.Array[String], /* json2md */ typings.json2md.mod.json2md) => String): Self = StObject.set(x, "h2", js.Any.fromFunction2(value))
      
      inline def setH3(value: (String | js.Array[String], /* json2md */ typings.json2md.mod.json2md) => String): Self = StObject.set(x, "h3", js.Any.fromFunction2(value))
      
      inline def setH4(value: (String | js.Array[String], /* json2md */ typings.json2md.mod.json2md) => String): Self = StObject.set(x, "h4", js.Any.fromFunction2(value))
      
      inline def setH5(value: (String | js.Array[String], /* json2md */ typings.json2md.mod.json2md) => String): Self = StObject.set(x, "h5", js.Any.fromFunction2(value))
      
      inline def setH6(value: (String | js.Array[String], /* json2md */ typings.json2md.mod.json2md) => String): Self = StObject.set(x, "h6", js.Any.fromFunction2(value))
      
      inline def setImg(value: (ImgInput | js.Array[ImgInput], /* json2md */ typings.json2md.mod.json2md) => String): Self = StObject.set(x, "img", js.Any.fromFunction2(value))
      
      inline def setOl(value: (js.Array[String], /* json2md */ typings.json2md.mod.json2md) => String): Self = StObject.set(x, "ol", js.Any.fromFunction2(value))
      
      inline def setP(value: (String | js.Array[String], /* json2md */ typings.json2md.mod.json2md) => String): Self = StObject.set(x, "p", js.Any.fromFunction2(value))
      
      inline def setTable(value: (TableInput, /* json2md */ typings.json2md.mod.json2md) => String): Self = StObject.set(x, "table", js.Any.fromFunction2(value))
      
      inline def setUl(value: (js.Array[String], /* json2md */ typings.json2md.mod.json2md) => String): Self = StObject.set(x, "ul", js.Any.fromFunction2(value))
    }
  }
  
  /* Inlined {[ TConverter in keyof json2md.json2md.DefaultConverters.Converters ]:? json2md.json2md.DefaultConverters.Converters[TConverter]} */
  trait DataObject extends StObject {
    
    var blockquote: js.UndefOr[String | js.Array[String]] = js.undefined
    
    var code: js.UndefOr[CodeInput] = js.undefined
    
    var h1: js.UndefOr[String | js.Array[String]] = js.undefined
    
    var h2: js.UndefOr[String | js.Array[String]] = js.undefined
    
    var h3: js.UndefOr[String | js.Array[String]] = js.undefined
    
    var h4: js.UndefOr[String | js.Array[String]] = js.undefined
    
    var h5: js.UndefOr[String | js.Array[String]] = js.undefined
    
    var h6: js.UndefOr[String | js.Array[String]] = js.undefined
    
    var img: js.UndefOr[ImgInput | js.Array[ImgInput]] = js.undefined
    
    var ol: js.UndefOr[js.Array[String]] = js.undefined
    
    var p: js.UndefOr[String | js.Array[String]] = js.undefined
    
    var table: js.UndefOr[TableInput] = js.undefined
    
    var ul: js.UndefOr[js.Array[String]] = js.undefined
  }
  object DataObject {
    
    inline def apply(): DataObject = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[DataObject]
    }
    
    extension [Self <: DataObject](x: Self) {
      
      inline def setBlockquote(value: String | js.Array[String]): Self = StObject.set(x, "blockquote", value.asInstanceOf[js.Any])
      
      inline def setBlockquoteUndefined: Self = StObject.set(x, "blockquote", js.undefined)
      
      inline def setBlockquoteVarargs(value: String*): Self = StObject.set(x, "blockquote", js.Array(value :_*))
      
      inline def setCode(value: CodeInput): Self = StObject.set(x, "code", value.asInstanceOf[js.Any])
      
      inline def setCodeUndefined: Self = StObject.set(x, "code", js.undefined)
      
      inline def setH1(value: String | js.Array[String]): Self = StObject.set(x, "h1", value.asInstanceOf[js.Any])
      
      inline def setH1Undefined: Self = StObject.set(x, "h1", js.undefined)
      
      inline def setH1Varargs(value: String*): Self = StObject.set(x, "h1", js.Array(value :_*))
      
      inline def setH2(value: String | js.Array[String]): Self = StObject.set(x, "h2", value.asInstanceOf[js.Any])
      
      inline def setH2Undefined: Self = StObject.set(x, "h2", js.undefined)
      
      inline def setH2Varargs(value: String*): Self = StObject.set(x, "h2", js.Array(value :_*))
      
      inline def setH3(value: String | js.Array[String]): Self = StObject.set(x, "h3", value.asInstanceOf[js.Any])
      
      inline def setH3Undefined: Self = StObject.set(x, "h3", js.undefined)
      
      inline def setH3Varargs(value: String*): Self = StObject.set(x, "h3", js.Array(value :_*))
      
      inline def setH4(value: String | js.Array[String]): Self = StObject.set(x, "h4", value.asInstanceOf[js.Any])
      
      inline def setH4Undefined: Self = StObject.set(x, "h4", js.undefined)
      
      inline def setH4Varargs(value: String*): Self = StObject.set(x, "h4", js.Array(value :_*))
      
      inline def setH5(value: String | js.Array[String]): Self = StObject.set(x, "h5", value.asInstanceOf[js.Any])
      
      inline def setH5Undefined: Self = StObject.set(x, "h5", js.undefined)
      
      inline def setH5Varargs(value: String*): Self = StObject.set(x, "h5", js.Array(value :_*))
      
      inline def setH6(value: String | js.Array[String]): Self = StObject.set(x, "h6", value.asInstanceOf[js.Any])
      
      inline def setH6Undefined: Self = StObject.set(x, "h6", js.undefined)
      
      inline def setH6Varargs(value: String*): Self = StObject.set(x, "h6", js.Array(value :_*))
      
      inline def setImg(value: ImgInput | js.Array[ImgInput]): Self = StObject.set(x, "img", value.asInstanceOf[js.Any])
      
      inline def setImgUndefined: Self = StObject.set(x, "img", js.undefined)
      
      inline def setImgVarargs(value: ImgInput*): Self = StObject.set(x, "img", js.Array(value :_*))
      
      inline def setOl(value: js.Array[String]): Self = StObject.set(x, "ol", value.asInstanceOf[js.Any])
      
      inline def setOlUndefined: Self = StObject.set(x, "ol", js.undefined)
      
      inline def setOlVarargs(value: String*): Self = StObject.set(x, "ol", js.Array(value :_*))
      
      inline def setP(value: String | js.Array[String]): Self = StObject.set(x, "p", value.asInstanceOf[js.Any])
      
      inline def setPUndefined: Self = StObject.set(x, "p", js.undefined)
      
      inline def setPVarargs(value: String*): Self = StObject.set(x, "p", js.Array(value :_*))
      
      inline def setTable(value: TableInput): Self = StObject.set(x, "table", value.asInstanceOf[js.Any])
      
      inline def setTableUndefined: Self = StObject.set(x, "table", js.undefined)
      
      inline def setUl(value: js.Array[String]): Self = StObject.set(x, "ul", value.asInstanceOf[js.Any])
      
      inline def setUlUndefined: Self = StObject.set(x, "ul", js.undefined)
      
      inline def setUlVarargs(value: String*): Self = StObject.set(x, "ul", js.Array(value :_*))
    }
  }
  
  object DefaultConverters {
    
    trait CodeInput extends StObject {
      
      var content: String | js.Array[String]
      
      var language: js.UndefOr[String] = js.undefined
    }
    object CodeInput {
      
      inline def apply(content: String | js.Array[String]): CodeInput = {
        val __obj = js.Dynamic.literal(content = content.asInstanceOf[js.Any])
        __obj.asInstanceOf[CodeInput]
      }
      
      extension [Self <: CodeInput](x: Self) {
        
        inline def setContent(value: String | js.Array[String]): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
        
        inline def setContentVarargs(value: String*): Self = StObject.set(x, "content", js.Array(value :_*))
        
        inline def setLanguage(value: String): Self = StObject.set(x, "language", value.asInstanceOf[js.Any])
        
        inline def setLanguageUndefined: Self = StObject.set(x, "language", js.undefined)
      }
    }
    
    trait Converters
      extends StObject
         with /* converter */ StringDictionary[js.Any] {
      
      var blockquote: String | js.Array[String]
      
      var code: CodeInput
      
      var h1: String | js.Array[String]
      
      var h2: String | js.Array[String]
      
      var h3: String | js.Array[String]
      
      var h4: String | js.Array[String]
      
      var h5: String | js.Array[String]
      
      var h6: String | js.Array[String]
      
      var img: ImgInput | js.Array[ImgInput]
      
      var ol: js.Array[String]
      
      var p: String | js.Array[String]
      
      var table: TableInput
      
      var ul: js.Array[String]
    }
    object Converters {
      
      inline def apply(
        blockquote: String | js.Array[String],
        code: CodeInput,
        h1: String | js.Array[String],
        h2: String | js.Array[String],
        h3: String | js.Array[String],
        h4: String | js.Array[String],
        h5: String | js.Array[String],
        h6: String | js.Array[String],
        img: ImgInput | js.Array[ImgInput],
        ol: js.Array[String],
        p: String | js.Array[String],
        table: TableInput,
        ul: js.Array[String]
      ): Converters = {
        val __obj = js.Dynamic.literal(blockquote = blockquote.asInstanceOf[js.Any], code = code.asInstanceOf[js.Any], h1 = h1.asInstanceOf[js.Any], h2 = h2.asInstanceOf[js.Any], h3 = h3.asInstanceOf[js.Any], h4 = h4.asInstanceOf[js.Any], h5 = h5.asInstanceOf[js.Any], h6 = h6.asInstanceOf[js.Any], img = img.asInstanceOf[js.Any], ol = ol.asInstanceOf[js.Any], p = p.asInstanceOf[js.Any], table = table.asInstanceOf[js.Any], ul = ul.asInstanceOf[js.Any])
        __obj.asInstanceOf[Converters]
      }
      
      extension [Self <: Converters](x: Self) {
        
        inline def setBlockquote(value: String | js.Array[String]): Self = StObject.set(x, "blockquote", value.asInstanceOf[js.Any])
        
        inline def setBlockquoteVarargs(value: String*): Self = StObject.set(x, "blockquote", js.Array(value :_*))
        
        inline def setCode(value: CodeInput): Self = StObject.set(x, "code", value.asInstanceOf[js.Any])
        
        inline def setH1(value: String | js.Array[String]): Self = StObject.set(x, "h1", value.asInstanceOf[js.Any])
        
        inline def setH1Varargs(value: String*): Self = StObject.set(x, "h1", js.Array(value :_*))
        
        inline def setH2(value: String | js.Array[String]): Self = StObject.set(x, "h2", value.asInstanceOf[js.Any])
        
        inline def setH2Varargs(value: String*): Self = StObject.set(x, "h2", js.Array(value :_*))
        
        inline def setH3(value: String | js.Array[String]): Self = StObject.set(x, "h3", value.asInstanceOf[js.Any])
        
        inline def setH3Varargs(value: String*): Self = StObject.set(x, "h3", js.Array(value :_*))
        
        inline def setH4(value: String | js.Array[String]): Self = StObject.set(x, "h4", value.asInstanceOf[js.Any])
        
        inline def setH4Varargs(value: String*): Self = StObject.set(x, "h4", js.Array(value :_*))
        
        inline def setH5(value: String | js.Array[String]): Self = StObject.set(x, "h5", value.asInstanceOf[js.Any])
        
        inline def setH5Varargs(value: String*): Self = StObject.set(x, "h5", js.Array(value :_*))
        
        inline def setH6(value: String | js.Array[String]): Self = StObject.set(x, "h6", value.asInstanceOf[js.Any])
        
        inline def setH6Varargs(value: String*): Self = StObject.set(x, "h6", js.Array(value :_*))
        
        inline def setImg(value: ImgInput | js.Array[ImgInput]): Self = StObject.set(x, "img", value.asInstanceOf[js.Any])
        
        inline def setImgVarargs(value: ImgInput*): Self = StObject.set(x, "img", js.Array(value :_*))
        
        inline def setOl(value: js.Array[String]): Self = StObject.set(x, "ol", value.asInstanceOf[js.Any])
        
        inline def setOlVarargs(value: String*): Self = StObject.set(x, "ol", js.Array(value :_*))
        
        inline def setP(value: String | js.Array[String]): Self = StObject.set(x, "p", value.asInstanceOf[js.Any])
        
        inline def setPVarargs(value: String*): Self = StObject.set(x, "p", js.Array(value :_*))
        
        inline def setTable(value: TableInput): Self = StObject.set(x, "table", value.asInstanceOf[js.Any])
        
        inline def setUl(value: js.Array[String]): Self = StObject.set(x, "ul", value.asInstanceOf[js.Any])
        
        inline def setUlVarargs(value: String*): Self = StObject.set(x, "ul", js.Array(value :_*))
      }
    }
    
    trait ImgInput extends StObject {
      
      var source: String
      
      var title: String
    }
    object ImgInput {
      
      inline def apply(source: String, title: String): ImgInput = {
        val __obj = js.Dynamic.literal(source = source.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any])
        __obj.asInstanceOf[ImgInput]
      }
      
      extension [Self <: ImgInput](x: Self) {
        
        inline def setSource(value: String): Self = StObject.set(x, "source", value.asInstanceOf[js.Any])
        
        inline def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
      }
    }
    
    trait TableInput extends StObject {
      
      var headers: js.Array[String]
      
      var rows: js.Array[js.Array[String] | StringDictionary[String]]
    }
    object TableInput {
      
      inline def apply(headers: js.Array[String], rows: js.Array[js.Array[String] | StringDictionary[String]]): TableInput = {
        val __obj = js.Dynamic.literal(headers = headers.asInstanceOf[js.Any], rows = rows.asInstanceOf[js.Any])
        __obj.asInstanceOf[TableInput]
      }
      
      extension [Self <: TableInput](x: Self) {
        
        inline def setHeaders(value: js.Array[String]): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
        
        inline def setHeadersVarargs(value: String*): Self = StObject.set(x, "headers", js.Array(value :_*))
        
        inline def setRows(value: js.Array[js.Array[String] | StringDictionary[String]]): Self = StObject.set(x, "rows", value.asInstanceOf[js.Any])
        
        inline def setRowsVarargs(value: (js.Array[String] | StringDictionary[String])*): Self = StObject.set(x, "rows", js.Array(value :_*))
      }
    }
  }
  
  type json2md = /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof json2md */ js.Any
}
