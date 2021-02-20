package typings.linkifyIt

import org.scalablytyped.runtime.StringDictionary
import typings.std.RegExp
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("linkify-it", JSImport.Namespace)
  @js.native
  def apply(): LinkifyIt = js.native
  @JSImport("linkify-it", JSImport.Namespace)
  @js.native
  def apply(schemas: js.UndefOr[scala.Nothing], options: Options): LinkifyIt = js.native
  @JSImport("linkify-it", JSImport.Namespace)
  @js.native
  def apply(schemas: Options): LinkifyIt = js.native
  @JSImport("linkify-it", JSImport.Namespace)
  @js.native
  def apply(schemas: Options, options: Options): LinkifyIt = js.native
  @JSImport("linkify-it", JSImport.Namespace)
  @js.native
  def apply(schemas: SchemaRules): LinkifyIt = js.native
  @JSImport("linkify-it", JSImport.Namespace)
  @js.native
  def apply(schemas: SchemaRules, options: Options): LinkifyIt = js.native
  
  /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
  @JSImport("linkify-it", JSImport.Namespace)
  @js.native
  class ^ () extends LinkifyIt {
    def this(schemas: Options) = this()
    def this(schemas: SchemaRules) = this()
    def this(schemas: js.UndefOr[scala.Nothing], options: Options) = this()
    def this(schemas: Options, options: Options) = this()
    def this(schemas: SchemaRules, options: Options) = this()
  }
  
  @js.native
  trait FullRule extends StObject {
    
    var normalize: js.UndefOr[js.Function1[/* match */ Match, Unit]] = js.native
    
    var validate: String | RegExp | Validate = js.native
  }
  object FullRule {
    
    @scala.inline
    def apply(validate: String | RegExp | Validate): FullRule = {
      val __obj = js.Dynamic.literal(validate = validate.asInstanceOf[js.Any])
      __obj.asInstanceOf[FullRule]
    }
    
    @scala.inline
    implicit class FullRuleMutableBuilder[Self <: FullRule] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setNormalize(value: /* match */ Match => Unit): Self = StObject.set(x, "normalize", js.Any.fromFunction1(value))
      
      @scala.inline
      def setNormalizeUndefined: Self = StObject.set(x, "normalize", js.undefined)
      
      @scala.inline
      def setValidate(value: String | RegExp | Validate): Self = StObject.set(x, "validate", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setValidateFunction3(value: (/* text */ String, /* pos */ Double, /* self */ LinkifyIt) => Double | Boolean): Self = StObject.set(x, "validate", js.Any.fromFunction3(value))
    }
  }
  
  @js.native
  trait LinkifyIt extends StObject {
    
    def add(schema: String, rule: Rule): LinkifyIt = js.native
    
    def `match`(text: String): js.Array[Match] | Null = js.native
    
    def normalize(raw: String): String = js.native
    
    def pretest(text: String): Boolean = js.native
    
    var re: StringDictionary[RegExp] = js.native
    
    def set(options: Options): LinkifyIt = js.native
    
    def test(text: String): Boolean = js.native
    
    def testSchemaAt(text: String, schemaName: String, pos: Double): Double = js.native
    
    def tlds(list: String): LinkifyIt = js.native
    def tlds(list: String, keepOld: Boolean): LinkifyIt = js.native
    def tlds(list: js.Array[String]): LinkifyIt = js.native
    def tlds(list: js.Array[String], keepOld: Boolean): LinkifyIt = js.native
  }
  
  @js.native
  trait Match extends StObject {
    
    var index: Double = js.native
    
    var lastIndex: Double = js.native
    
    var raw: String = js.native
    
    var schema: String = js.native
    
    var text: String = js.native
    
    var url: String = js.native
  }
  object Match {
    
    @scala.inline
    def apply(index: Double, lastIndex: Double, raw: String, schema: String, text: String, url: String): Match = {
      val __obj = js.Dynamic.literal(index = index.asInstanceOf[js.Any], lastIndex = lastIndex.asInstanceOf[js.Any], raw = raw.asInstanceOf[js.Any], schema = schema.asInstanceOf[js.Any], text = text.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
      __obj.asInstanceOf[Match]
    }
    
    @scala.inline
    implicit class MatchMutableBuilder[Self <: Match] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setIndex(value: Double): Self = StObject.set(x, "index", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLastIndex(value: Double): Self = StObject.set(x, "lastIndex", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRaw(value: String): Self = StObject.set(x, "raw", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSchema(value: String): Self = StObject.set(x, "schema", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setText(value: String): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait Options extends StObject {
    
    var fuzzyEmail: js.UndefOr[Boolean] = js.native
    
    var fuzzyIP: js.UndefOr[Boolean] = js.native
    
    var fuzzyLink: js.UndefOr[Boolean] = js.native
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
      def setFuzzyEmail(value: Boolean): Self = StObject.set(x, "fuzzyEmail", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFuzzyEmailUndefined: Self = StObject.set(x, "fuzzyEmail", js.undefined)
      
      @scala.inline
      def setFuzzyIP(value: Boolean): Self = StObject.set(x, "fuzzyIP", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFuzzyIPUndefined: Self = StObject.set(x, "fuzzyIP", js.undefined)
      
      @scala.inline
      def setFuzzyLink(value: Boolean): Self = StObject.set(x, "fuzzyLink", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFuzzyLinkUndefined: Self = StObject.set(x, "fuzzyLink", js.undefined)
    }
  }
  
  type Rule = String | FullRule
  
  type SchemaRules = StringDictionary[Rule]
  
  type Validate = js.Function3[/* text */ String, /* pos */ Double, /* self */ LinkifyIt, Double | Boolean]
}
