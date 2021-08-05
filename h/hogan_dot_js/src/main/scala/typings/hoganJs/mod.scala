package typings.hoganJs

import org.scalablytyped.runtime.StringDictionary
import typings.hoganJs.anon.HoganOptionsasStringfalse
import typings.hoganJs.anon.HoganOptionsasStringtrue
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("hogan.js", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("hogan.js", "Template")
  @js.native
  class Template_ ()
    extends StObject
       with HoganTemplate
  
  inline def compile(text: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("compile")(text.asInstanceOf[js.Any]).asInstanceOf[String]
  inline def compile(text: String, options: HoganOptionsasStringfalse): HoganTemplate = (^.asInstanceOf[js.Dynamic].applyDynamic("compile")(text.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[HoganTemplate]
  inline def compile(text: String, options: HoganOptionsasStringtrue): String = (^.asInstanceOf[js.Dynamic].applyDynamic("compile")(text.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def compile(text: String, options: HoganOptions): HoganTemplate | String = (^.asInstanceOf[js.Dynamic].applyDynamic("compile")(text.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[HoganTemplate | String]
  
  inline def compile_HoganTemplate(text: String): HoganTemplate = ^.asInstanceOf[js.Dynamic].applyDynamic("compile")(text.asInstanceOf[js.Any]).asInstanceOf[HoganTemplate]
  
  inline def compile_Union(text: String): HoganTemplate | String = ^.asInstanceOf[js.Dynamic].applyDynamic("compile")(text.asInstanceOf[js.Any]).asInstanceOf[HoganTemplate | String]
  
  inline def parse(tokens: js.Array[Token]): Tree = ^.asInstanceOf[js.Dynamic].applyDynamic("parse")(tokens.asInstanceOf[js.Any]).asInstanceOf[Tree]
  inline def parse(tokens: js.Array[Token], text: Unit, options: HoganOptions): Tree = (^.asInstanceOf[js.Dynamic].applyDynamic("parse")(tokens.asInstanceOf[js.Any], text.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Tree]
  
  inline def scan(text: String): js.Array[Token] = ^.asInstanceOf[js.Dynamic].applyDynamic("scan")(text.asInstanceOf[js.Any]).asInstanceOf[js.Array[Token]]
  inline def scan(text: String, delimiters: String): js.Array[Token] = (^.asInstanceOf[js.Dynamic].applyDynamic("scan")(text.asInstanceOf[js.Any], delimiters.asInstanceOf[js.Any])).asInstanceOf[js.Array[Token]]
  
  @JSImport("hogan.js", "template")
  @js.native
  class template ()
    extends StObject
       with HoganTemplate
  
  type Context = StringDictionary[js.Any]
  
  trait HoganOptions extends StObject {
    
    var asString: js.UndefOr[Boolean] = js.undefined
    
    var delimiters: js.UndefOr[String] = js.undefined
    
    var disableLambda: js.UndefOr[Boolean] = js.undefined
    
    var sectionTags: js.UndefOr[js.Array[SectionTags]] = js.undefined
  }
  object HoganOptions {
    
    inline def apply(): HoganOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[HoganOptions]
    }
    
    extension [Self <: HoganOptions](x: Self) {
      
      inline def setAsString(value: Boolean): Self = StObject.set(x, "asString", value.asInstanceOf[js.Any])
      
      inline def setAsStringUndefined: Self = StObject.set(x, "asString", js.undefined)
      
      inline def setDelimiters(value: String): Self = StObject.set(x, "delimiters", value.asInstanceOf[js.Any])
      
      inline def setDelimitersUndefined: Self = StObject.set(x, "delimiters", js.undefined)
      
      inline def setDisableLambda(value: Boolean): Self = StObject.set(x, "disableLambda", value.asInstanceOf[js.Any])
      
      inline def setDisableLambdaUndefined: Self = StObject.set(x, "disableLambda", js.undefined)
      
      inline def setSectionTags(value: js.Array[SectionTags]): Self = StObject.set(x, "sectionTags", value.asInstanceOf[js.Any])
      
      inline def setSectionTagsUndefined: Self = StObject.set(x, "sectionTags", js.undefined)
      
      inline def setSectionTagsVarargs(value: SectionTags*): Self = StObject.set(x, "sectionTags", js.Array(value :_*))
    }
  }
  
  @js.native
  trait HoganTemplate extends StObject {
    
    /**
      * Renders the template to a string.
      *
      * @param context - The data to render the template with.
      * @param partials - The partials to render the template with.
      * @param indent - The string to indent when rendering the template.
      * @returns A rendered template.
      */
    def render(context: Context): String = js.native
    def render(context: Context, partials: Unit, indent: String): String = js.native
    def render(context: Context, partials: Partials): String = js.native
    def render(context: Context, partials: Partials, indent: String): String = js.native
  }
  
  trait Leaf
    extends StObject
       with Token {
    
    var end: Double
    
    var nodes: js.Array[Token]
  }
  object Leaf {
    
    inline def apply(end: Double, nodes: js.Array[Token], tag: String): Leaf = {
      val __obj = js.Dynamic.literal(end = end.asInstanceOf[js.Any], nodes = nodes.asInstanceOf[js.Any], tag = tag.asInstanceOf[js.Any])
      __obj.asInstanceOf[Leaf]
    }
    
    extension [Self <: Leaf](x: Self) {
      
      inline def setEnd(value: Double): Self = StObject.set(x, "end", value.asInstanceOf[js.Any])
      
      inline def setNodes(value: js.Array[Token]): Self = StObject.set(x, "nodes", value.asInstanceOf[js.Any])
      
      inline def setNodesVarargs(value: Token*): Self = StObject.set(x, "nodes", js.Array(value :_*))
    }
  }
  
  type Partials = StringDictionary[HoganTemplate]
  
  trait SectionTags extends StObject {
    
    var c: String
    
    var o: String
  }
  object SectionTags {
    
    inline def apply(c: String, o: String): SectionTags = {
      val __obj = js.Dynamic.literal(c = c.asInstanceOf[js.Any], o = o.asInstanceOf[js.Any])
      __obj.asInstanceOf[SectionTags]
    }
    
    extension [Self <: SectionTags](x: Self) {
      
      inline def setC(value: String): Self = StObject.set(x, "c", value.asInstanceOf[js.Any])
      
      inline def setO(value: String): Self = StObject.set(x, "o", value.asInstanceOf[js.Any])
    }
  }
  
  trait Token extends StObject {
    
    var ctag: js.UndefOr[String] = js.undefined
    
    var i: js.UndefOr[Double] = js.undefined
    
    var n: js.UndefOr[String] = js.undefined
    
    var otag: js.UndefOr[String] = js.undefined
    
    var tag: String
    
    var text: js.UndefOr[String] = js.undefined
  }
  object Token {
    
    inline def apply(tag: String): Token = {
      val __obj = js.Dynamic.literal(tag = tag.asInstanceOf[js.Any])
      __obj.asInstanceOf[Token]
    }
    
    extension [Self <: Token](x: Self) {
      
      inline def setCtag(value: String): Self = StObject.set(x, "ctag", value.asInstanceOf[js.Any])
      
      inline def setCtagUndefined: Self = StObject.set(x, "ctag", js.undefined)
      
      inline def setI(value: Double): Self = StObject.set(x, "i", value.asInstanceOf[js.Any])
      
      inline def setIUndefined: Self = StObject.set(x, "i", js.undefined)
      
      inline def setN(value: String): Self = StObject.set(x, "n", value.asInstanceOf[js.Any])
      
      inline def setNUndefined: Self = StObject.set(x, "n", js.undefined)
      
      inline def setOtag(value: String): Self = StObject.set(x, "otag", value.asInstanceOf[js.Any])
      
      inline def setOtagUndefined: Self = StObject.set(x, "otag", js.undefined)
      
      inline def setTag(value: String): Self = StObject.set(x, "tag", value.asInstanceOf[js.Any])
      
      inline def setText(value: String): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
      
      inline def setTextUndefined: Self = StObject.set(x, "text", js.undefined)
    }
  }
  
  type Tree = js.Array[Leaf]
}
