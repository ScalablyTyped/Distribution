package typings.hoganJs

import org.scalablytyped.runtime.StringDictionary
import typings.hoganJs.anon.HoganOptionsasStringfalse
import typings.hoganJs.anon.HoganOptionsasStringtrue
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("hogan.js", "Template")
  @js.native
  class Template_ () extends HoganTemplate
  
  @JSImport("hogan.js", "compile")
  @js.native
  def compile(text: String): String = js.native
  @JSImport("hogan.js", "compile")
  @js.native
  def compile(text: String, options: HoganOptionsasStringfalse): HoganTemplate = js.native
  @JSImport("hogan.js", "compile")
  @js.native
  def compile(text: String, options: HoganOptionsasStringtrue): String = js.native
  @JSImport("hogan.js", "compile")
  @js.native
  def compile(text: String, options: HoganOptions): HoganTemplate | String = js.native
  @JSImport("hogan.js", "compile")
  @js.native
  def compile_HoganTemplate(text: String): HoganTemplate = js.native
  @JSImport("hogan.js", "compile")
  @js.native
  def compile_Union(text: String): HoganTemplate | String = js.native
  
  @JSImport("hogan.js", "parse")
  @js.native
  def parse(tokens: js.Array[Token]): Tree = js.native
  @JSImport("hogan.js", "parse")
  @js.native
  def parse(tokens: js.Array[Token], text: js.UndefOr[scala.Nothing], options: HoganOptions): Tree = js.native
  
  @JSImport("hogan.js", "scan")
  @js.native
  def scan(text: String): js.Array[Token] = js.native
  @JSImport("hogan.js", "scan")
  @js.native
  def scan(text: String, delimiters: String): js.Array[Token] = js.native
  
  @JSImport("hogan.js", "template")
  @js.native
  class template () extends HoganTemplate
  
  type Context = StringDictionary[js.Any]
  
  @js.native
  trait HoganOptions extends StObject {
    
    var asString: js.UndefOr[Boolean] = js.native
    
    var delimiters: js.UndefOr[String] = js.native
    
    var disableLambda: js.UndefOr[Boolean] = js.native
    
    var sectionTags: js.UndefOr[js.Array[SectionTags]] = js.native
  }
  object HoganOptions {
    
    @scala.inline
    def apply(): HoganOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[HoganOptions]
    }
    
    @scala.inline
    implicit class HoganOptionsMutableBuilder[Self <: HoganOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAsString(value: Boolean): Self = StObject.set(x, "asString", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAsStringUndefined: Self = StObject.set(x, "asString", js.undefined)
      
      @scala.inline
      def setDelimiters(value: String): Self = StObject.set(x, "delimiters", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDelimitersUndefined: Self = StObject.set(x, "delimiters", js.undefined)
      
      @scala.inline
      def setDisableLambda(value: Boolean): Self = StObject.set(x, "disableLambda", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDisableLambdaUndefined: Self = StObject.set(x, "disableLambda", js.undefined)
      
      @scala.inline
      def setSectionTags(value: js.Array[SectionTags]): Self = StObject.set(x, "sectionTags", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSectionTagsUndefined: Self = StObject.set(x, "sectionTags", js.undefined)
      
      @scala.inline
      def setSectionTagsVarargs(value: SectionTags*): Self = StObject.set(x, "sectionTags", js.Array(value :_*))
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
    def render(context: Context, partials: js.UndefOr[scala.Nothing], indent: String): String = js.native
    def render(context: Context, partials: Partials): String = js.native
    def render(context: Context, partials: Partials, indent: String): String = js.native
  }
  
  @js.native
  trait Leaf extends Token {
    
    var end: Double = js.native
    
    var nodes: js.Array[Token] = js.native
  }
  object Leaf {
    
    @scala.inline
    def apply(end: Double, nodes: js.Array[Token], tag: String): Leaf = {
      val __obj = js.Dynamic.literal(end = end.asInstanceOf[js.Any], nodes = nodes.asInstanceOf[js.Any], tag = tag.asInstanceOf[js.Any])
      __obj.asInstanceOf[Leaf]
    }
    
    @scala.inline
    implicit class LeafMutableBuilder[Self <: Leaf] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setEnd(value: Double): Self = StObject.set(x, "end", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNodes(value: js.Array[Token]): Self = StObject.set(x, "nodes", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNodesVarargs(value: Token*): Self = StObject.set(x, "nodes", js.Array(value :_*))
    }
  }
  
  type Partials = StringDictionary[HoganTemplate]
  
  @js.native
  trait SectionTags extends StObject {
    
    var c: String = js.native
    
    var o: String = js.native
  }
  object SectionTags {
    
    @scala.inline
    def apply(c: String, o: String): SectionTags = {
      val __obj = js.Dynamic.literal(c = c.asInstanceOf[js.Any], o = o.asInstanceOf[js.Any])
      __obj.asInstanceOf[SectionTags]
    }
    
    @scala.inline
    implicit class SectionTagsMutableBuilder[Self <: SectionTags] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setC(value: String): Self = StObject.set(x, "c", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setO(value: String): Self = StObject.set(x, "o", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait Token extends StObject {
    
    var ctag: js.UndefOr[String] = js.native
    
    var i: js.UndefOr[Double] = js.native
    
    var n: js.UndefOr[String] = js.native
    
    var otag: js.UndefOr[String] = js.native
    
    var tag: String = js.native
    
    var text: js.UndefOr[String] = js.native
  }
  object Token {
    
    @scala.inline
    def apply(tag: String): Token = {
      val __obj = js.Dynamic.literal(tag = tag.asInstanceOf[js.Any])
      __obj.asInstanceOf[Token]
    }
    
    @scala.inline
    implicit class TokenMutableBuilder[Self <: Token] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCtag(value: String): Self = StObject.set(x, "ctag", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCtagUndefined: Self = StObject.set(x, "ctag", js.undefined)
      
      @scala.inline
      def setI(value: Double): Self = StObject.set(x, "i", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIUndefined: Self = StObject.set(x, "i", js.undefined)
      
      @scala.inline
      def setN(value: String): Self = StObject.set(x, "n", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNUndefined: Self = StObject.set(x, "n", js.undefined)
      
      @scala.inline
      def setOtag(value: String): Self = StObject.set(x, "otag", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOtagUndefined: Self = StObject.set(x, "otag", js.undefined)
      
      @scala.inline
      def setTag(value: String): Self = StObject.set(x, "tag", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setText(value: String): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTextUndefined: Self = StObject.set(x, "text", js.undefined)
    }
  }
  
  type Tree = js.Array[Leaf]
}
