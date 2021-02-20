package typings.json2md

import org.scalablytyped.runtime.StringDictionary
import typings.json2md.mod.DefaultConverters.CodeInput
import typings.json2md.mod.DefaultConverters.ImgInput
import typings.json2md.mod.DefaultConverters.TableInput
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("json2md", JSImport.Namespace)
  @js.native
  def apply(data: String): String = js.native
  @JSImport("json2md", JSImport.Namespace)
  @js.native
  def apply(data: String, prefix: String): String = js.native
  @JSImport("json2md", JSImport.Namespace)
  @js.native
  def apply(data: js.Array[DataObject | String]): String = js.native
  @JSImport("json2md", JSImport.Namespace)
  @js.native
  def apply(data: js.Array[DataObject | String], prefix: String): String = js.native
  /**
    * Converts a JSON input to markdown.
    *
    * @param data The input JSON data.
    * @param prefix A snippet to add before each line.
    * @return The generated markdown result.
    */
  @JSImport("json2md", JSImport.Namespace)
  @js.native
  def apply(data: DataObject): String = js.native
  @JSImport("json2md", JSImport.Namespace)
  @js.native
  def apply(data: DataObject, prefix: String): String = js.native
  
  @JSImport("json2md", "converters")
  @js.native
  val converters: ConvertersMethods = js.native
  
  type ConverterCallback[TInput] = js.Function2[/* input */ TInput, /* json2md */ typings.json2md.mod.json2md, String]
  
  /* Inlined {[ TConverter in keyof json2md.json2md.DefaultConverters.Converters ]: json2md.json2md.ConverterCallback<json2md.json2md.DefaultConverters.Converters[TConverter]>} */
  @js.native
  trait ConvertersMethods extends StObject {
    
    def blockquote(input: String, json2md: typings.json2md.mod.json2md): String = js.native
    def blockquote(input: js.Array[String], json2md: typings.json2md.mod.json2md): String = js.native
    @JSName("blockquote")
    var blockquote_Original: ConverterCallback[String | js.Array[String]] = js.native
    
    def code(input: CodeInput, json2md: typings.json2md.mod.json2md): String = js.native
    @JSName("code")
    var code_Original: ConverterCallback[CodeInput] = js.native
    
    def h1(input: String, json2md: typings.json2md.mod.json2md): String = js.native
    def h1(input: js.Array[String], json2md: typings.json2md.mod.json2md): String = js.native
    @JSName("h1")
    var h1_Original: ConverterCallback[String | js.Array[String]] = js.native
    
    def h2(input: String, json2md: typings.json2md.mod.json2md): String = js.native
    def h2(input: js.Array[String], json2md: typings.json2md.mod.json2md): String = js.native
    @JSName("h2")
    var h2_Original: ConverterCallback[String | js.Array[String]] = js.native
    
    def h3(input: String, json2md: typings.json2md.mod.json2md): String = js.native
    def h3(input: js.Array[String], json2md: typings.json2md.mod.json2md): String = js.native
    @JSName("h3")
    var h3_Original: ConverterCallback[String | js.Array[String]] = js.native
    
    def h4(input: String, json2md: typings.json2md.mod.json2md): String = js.native
    def h4(input: js.Array[String], json2md: typings.json2md.mod.json2md): String = js.native
    @JSName("h4")
    var h4_Original: ConverterCallback[String | js.Array[String]] = js.native
    
    def h5(input: String, json2md: typings.json2md.mod.json2md): String = js.native
    def h5(input: js.Array[String], json2md: typings.json2md.mod.json2md): String = js.native
    @JSName("h5")
    var h5_Original: ConverterCallback[String | js.Array[String]] = js.native
    
    def h6(input: String, json2md: typings.json2md.mod.json2md): String = js.native
    def h6(input: js.Array[String], json2md: typings.json2md.mod.json2md): String = js.native
    @JSName("h6")
    var h6_Original: ConverterCallback[String | js.Array[String]] = js.native
    
    def img(input: js.Array[ImgInput], json2md: typings.json2md.mod.json2md): String = js.native
    def img(input: ImgInput, json2md: typings.json2md.mod.json2md): String = js.native
    @JSName("img")
    var img_Original: ConverterCallback[ImgInput | js.Array[ImgInput]] = js.native
    
    def ol(input: js.Array[String], json2md: typings.json2md.mod.json2md): String = js.native
    @JSName("ol")
    var ol_Original: ConverterCallback[js.Array[String]] = js.native
    
    def p(input: String, json2md: typings.json2md.mod.json2md): String = js.native
    def p(input: js.Array[String], json2md: typings.json2md.mod.json2md): String = js.native
    @JSName("p")
    var p_Original: ConverterCallback[String | js.Array[String]] = js.native
    
    def table(input: TableInput, json2md: typings.json2md.mod.json2md): String = js.native
    @JSName("table")
    var table_Original: ConverterCallback[TableInput] = js.native
    
    def ul(input: js.Array[String], json2md: typings.json2md.mod.json2md): String = js.native
    @JSName("ul")
    var ul_Original: ConverterCallback[js.Array[String]] = js.native
  }
  
  /* Inlined {[ TConverter in keyof json2md.json2md.DefaultConverters.Converters ]:? json2md.json2md.DefaultConverters.Converters[TConverter]} */
  @js.native
  trait DataObject extends StObject {
    
    var blockquote: js.UndefOr[String | js.Array[String]] = js.native
    
    var code: js.UndefOr[CodeInput] = js.native
    
    var h1: js.UndefOr[String | js.Array[String]] = js.native
    
    var h2: js.UndefOr[String | js.Array[String]] = js.native
    
    var h3: js.UndefOr[String | js.Array[String]] = js.native
    
    var h4: js.UndefOr[String | js.Array[String]] = js.native
    
    var h5: js.UndefOr[String | js.Array[String]] = js.native
    
    var h6: js.UndefOr[String | js.Array[String]] = js.native
    
    var img: js.UndefOr[ImgInput | js.Array[ImgInput]] = js.native
    
    var ol: js.UndefOr[js.Array[String]] = js.native
    
    var p: js.UndefOr[String | js.Array[String]] = js.native
    
    var table: js.UndefOr[TableInput] = js.native
    
    var ul: js.UndefOr[js.Array[String]] = js.native
  }
  object DataObject {
    
    @scala.inline
    def apply(): DataObject = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[DataObject]
    }
    
    @scala.inline
    implicit class DataObjectMutableBuilder[Self <: DataObject] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setBlockquote(value: String | js.Array[String]): Self = StObject.set(x, "blockquote", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBlockquoteUndefined: Self = StObject.set(x, "blockquote", js.undefined)
      
      @scala.inline
      def setBlockquoteVarargs(value: String*): Self = StObject.set(x, "blockquote", js.Array(value :_*))
      
      @scala.inline
      def setCode(value: CodeInput): Self = StObject.set(x, "code", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCodeUndefined: Self = StObject.set(x, "code", js.undefined)
      
      @scala.inline
      def setH1(value: String | js.Array[String]): Self = StObject.set(x, "h1", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setH1Undefined: Self = StObject.set(x, "h1", js.undefined)
      
      @scala.inline
      def setH1Varargs(value: String*): Self = StObject.set(x, "h1", js.Array(value :_*))
      
      @scala.inline
      def setH2(value: String | js.Array[String]): Self = StObject.set(x, "h2", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setH2Undefined: Self = StObject.set(x, "h2", js.undefined)
      
      @scala.inline
      def setH2Varargs(value: String*): Self = StObject.set(x, "h2", js.Array(value :_*))
      
      @scala.inline
      def setH3(value: String | js.Array[String]): Self = StObject.set(x, "h3", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setH3Undefined: Self = StObject.set(x, "h3", js.undefined)
      
      @scala.inline
      def setH3Varargs(value: String*): Self = StObject.set(x, "h3", js.Array(value :_*))
      
      @scala.inline
      def setH4(value: String | js.Array[String]): Self = StObject.set(x, "h4", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setH4Undefined: Self = StObject.set(x, "h4", js.undefined)
      
      @scala.inline
      def setH4Varargs(value: String*): Self = StObject.set(x, "h4", js.Array(value :_*))
      
      @scala.inline
      def setH5(value: String | js.Array[String]): Self = StObject.set(x, "h5", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setH5Undefined: Self = StObject.set(x, "h5", js.undefined)
      
      @scala.inline
      def setH5Varargs(value: String*): Self = StObject.set(x, "h5", js.Array(value :_*))
      
      @scala.inline
      def setH6(value: String | js.Array[String]): Self = StObject.set(x, "h6", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setH6Undefined: Self = StObject.set(x, "h6", js.undefined)
      
      @scala.inline
      def setH6Varargs(value: String*): Self = StObject.set(x, "h6", js.Array(value :_*))
      
      @scala.inline
      def setImg(value: ImgInput | js.Array[ImgInput]): Self = StObject.set(x, "img", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setImgUndefined: Self = StObject.set(x, "img", js.undefined)
      
      @scala.inline
      def setImgVarargs(value: ImgInput*): Self = StObject.set(x, "img", js.Array(value :_*))
      
      @scala.inline
      def setOl(value: js.Array[String]): Self = StObject.set(x, "ol", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOlUndefined: Self = StObject.set(x, "ol", js.undefined)
      
      @scala.inline
      def setOlVarargs(value: String*): Self = StObject.set(x, "ol", js.Array(value :_*))
      
      @scala.inline
      def setP(value: String | js.Array[String]): Self = StObject.set(x, "p", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPUndefined: Self = StObject.set(x, "p", js.undefined)
      
      @scala.inline
      def setPVarargs(value: String*): Self = StObject.set(x, "p", js.Array(value :_*))
      
      @scala.inline
      def setTable(value: TableInput): Self = StObject.set(x, "table", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTableUndefined: Self = StObject.set(x, "table", js.undefined)
      
      @scala.inline
      def setUl(value: js.Array[String]): Self = StObject.set(x, "ul", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUlUndefined: Self = StObject.set(x, "ul", js.undefined)
      
      @scala.inline
      def setUlVarargs(value: String*): Self = StObject.set(x, "ul", js.Array(value :_*))
    }
  }
  
  object DefaultConverters {
    
    @js.native
    trait CodeInput extends StObject {
      
      var content: String | js.Array[String] = js.native
      
      var language: js.UndefOr[String] = js.native
    }
    object CodeInput {
      
      @scala.inline
      def apply(content: String | js.Array[String]): CodeInput = {
        val __obj = js.Dynamic.literal(content = content.asInstanceOf[js.Any])
        __obj.asInstanceOf[CodeInput]
      }
      
      @scala.inline
      implicit class CodeInputMutableBuilder[Self <: CodeInput] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setContent(value: String | js.Array[String]): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setContentVarargs(value: String*): Self = StObject.set(x, "content", js.Array(value :_*))
        
        @scala.inline
        def setLanguage(value: String): Self = StObject.set(x, "language", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setLanguageUndefined: Self = StObject.set(x, "language", js.undefined)
      }
    }
    
    @js.native
    trait Converters
      extends /* converter */ StringDictionary[js.Any] {
      
      var blockquote: String | js.Array[String] = js.native
      
      var code: CodeInput = js.native
      
      var h1: String | js.Array[String] = js.native
      
      var h2: String | js.Array[String] = js.native
      
      var h3: String | js.Array[String] = js.native
      
      var h4: String | js.Array[String] = js.native
      
      var h5: String | js.Array[String] = js.native
      
      var h6: String | js.Array[String] = js.native
      
      var img: ImgInput | js.Array[ImgInput] = js.native
      
      var ol: js.Array[String] = js.native
      
      var p: String | js.Array[String] = js.native
      
      var table: TableInput = js.native
      
      var ul: js.Array[String] = js.native
    }
    object Converters {
      
      @scala.inline
      def apply(
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
      
      @scala.inline
      implicit class ConvertersMutableBuilder[Self <: Converters] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setBlockquote(value: String | js.Array[String]): Self = StObject.set(x, "blockquote", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setBlockquoteVarargs(value: String*): Self = StObject.set(x, "blockquote", js.Array(value :_*))
        
        @scala.inline
        def setCode(value: CodeInput): Self = StObject.set(x, "code", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setH1(value: String | js.Array[String]): Self = StObject.set(x, "h1", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setH1Varargs(value: String*): Self = StObject.set(x, "h1", js.Array(value :_*))
        
        @scala.inline
        def setH2(value: String | js.Array[String]): Self = StObject.set(x, "h2", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setH2Varargs(value: String*): Self = StObject.set(x, "h2", js.Array(value :_*))
        
        @scala.inline
        def setH3(value: String | js.Array[String]): Self = StObject.set(x, "h3", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setH3Varargs(value: String*): Self = StObject.set(x, "h3", js.Array(value :_*))
        
        @scala.inline
        def setH4(value: String | js.Array[String]): Self = StObject.set(x, "h4", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setH4Varargs(value: String*): Self = StObject.set(x, "h4", js.Array(value :_*))
        
        @scala.inline
        def setH5(value: String | js.Array[String]): Self = StObject.set(x, "h5", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setH5Varargs(value: String*): Self = StObject.set(x, "h5", js.Array(value :_*))
        
        @scala.inline
        def setH6(value: String | js.Array[String]): Self = StObject.set(x, "h6", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setH6Varargs(value: String*): Self = StObject.set(x, "h6", js.Array(value :_*))
        
        @scala.inline
        def setImg(value: ImgInput | js.Array[ImgInput]): Self = StObject.set(x, "img", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setImgVarargs(value: ImgInput*): Self = StObject.set(x, "img", js.Array(value :_*))
        
        @scala.inline
        def setOl(value: js.Array[String]): Self = StObject.set(x, "ol", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setOlVarargs(value: String*): Self = StObject.set(x, "ol", js.Array(value :_*))
        
        @scala.inline
        def setP(value: String | js.Array[String]): Self = StObject.set(x, "p", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setPVarargs(value: String*): Self = StObject.set(x, "p", js.Array(value :_*))
        
        @scala.inline
        def setTable(value: TableInput): Self = StObject.set(x, "table", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setUl(value: js.Array[String]): Self = StObject.set(x, "ul", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setUlVarargs(value: String*): Self = StObject.set(x, "ul", js.Array(value :_*))
      }
    }
    
    @js.native
    trait ImgInput extends StObject {
      
      var source: String = js.native
      
      var title: String = js.native
    }
    object ImgInput {
      
      @scala.inline
      def apply(source: String, title: String): ImgInput = {
        val __obj = js.Dynamic.literal(source = source.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any])
        __obj.asInstanceOf[ImgInput]
      }
      
      @scala.inline
      implicit class ImgInputMutableBuilder[Self <: ImgInput] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setSource(value: String): Self = StObject.set(x, "source", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
      }
    }
    
    @js.native
    trait TableInput extends StObject {
      
      var headers: js.Array[String] = js.native
      
      var rows: js.Array[js.Array[String] | StringDictionary[String]] = js.native
    }
    object TableInput {
      
      @scala.inline
      def apply(headers: js.Array[String], rows: js.Array[js.Array[String] | StringDictionary[String]]): TableInput = {
        val __obj = js.Dynamic.literal(headers = headers.asInstanceOf[js.Any], rows = rows.asInstanceOf[js.Any])
        __obj.asInstanceOf[TableInput]
      }
      
      @scala.inline
      implicit class TableInputMutableBuilder[Self <: TableInput] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setHeaders(value: js.Array[String]): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setHeadersVarargs(value: String*): Self = StObject.set(x, "headers", js.Array(value :_*))
        
        @scala.inline
        def setRows(value: js.Array[js.Array[String] | StringDictionary[String]]): Self = StObject.set(x, "rows", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setRowsVarargs(value: (js.Array[String] | StringDictionary[String])*): Self = StObject.set(x, "rows", js.Array(value :_*))
      }
    }
  }
  
  type json2md = /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof json2md */ js.Any
}
