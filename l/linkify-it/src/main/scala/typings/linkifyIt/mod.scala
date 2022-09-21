package typings.linkifyIt

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  inline def apply(): LinkifyIt = ^.asInstanceOf[js.Dynamic].apply().asInstanceOf[LinkifyIt]
  inline def apply(schemas: Unit, options: Options): LinkifyIt = (^.asInstanceOf[js.Dynamic].apply(schemas.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[LinkifyIt]
  inline def apply(schemas: Options): LinkifyIt = ^.asInstanceOf[js.Dynamic].apply(schemas.asInstanceOf[js.Any]).asInstanceOf[LinkifyIt]
  inline def apply(schemas: Options, options: Options): LinkifyIt = (^.asInstanceOf[js.Dynamic].apply(schemas.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[LinkifyIt]
  inline def apply(schemas: SchemaRules): LinkifyIt = ^.asInstanceOf[js.Dynamic].apply(schemas.asInstanceOf[js.Any]).asInstanceOf[LinkifyIt]
  inline def apply(schemas: SchemaRules, options: Options): LinkifyIt = (^.asInstanceOf[js.Dynamic].apply(schemas.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[LinkifyIt]
  
  /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
  @JSImport("linkify-it", JSImport.Namespace)
  @js.native
  open class ^ ()
    extends StObject
       with LinkifyIt {
    def this(schemas: Options) = this()
    def this(schemas: SchemaRules) = this()
    def this(schemas: Unit, options: Options) = this()
    def this(schemas: Options, options: Options) = this()
    def this(schemas: SchemaRules, options: Options) = this()
  }
  @JSImport("linkify-it", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  trait FullRule extends StObject {
    
    var normalize: js.UndefOr[js.Function1[/* match */ Match, Unit]] = js.undefined
    
    var validate: String | js.RegExp | Validate
  }
  object FullRule {
    
    inline def apply(validate: String | js.RegExp | Validate): FullRule = {
      val __obj = js.Dynamic.literal(validate = validate.asInstanceOf[js.Any])
      __obj.asInstanceOf[FullRule]
    }
    
    extension [Self <: FullRule](x: Self) {
      
      inline def setNormalize(value: /* match */ Match => Unit): Self = StObject.set(x, "normalize", js.Any.fromFunction1(value))
      
      inline def setNormalizeUndefined: Self = StObject.set(x, "normalize", js.undefined)
      
      inline def setValidate(value: String | js.RegExp | Validate): Self = StObject.set(x, "validate", value.asInstanceOf[js.Any])
      
      inline def setValidateFunction3(value: (/* text */ String, /* pos */ Double, /* self */ LinkifyIt) => Double | Boolean): Self = StObject.set(x, "validate", js.Any.fromFunction3(value))
    }
  }
  
  @js.native
  trait LinkifyIt extends StObject {
    
    // tslint:disable-next-line: unified-signatures
    def add(schema: String): LinkifyIt = js.native
    // Use overloads to provide contextual typing to `FullRule.normalize`, which is ambiguous with string.normalize
    // This appears unneeded to the unified-signatures lint rule.
    def add(schema: String, rule: String): LinkifyIt = js.native
    def add(schema: String, rule: FullRule): LinkifyIt = js.native
    
    def `match`(text: String): js.Array[Match] | Null = js.native
    
    def normalize(raw: String): String = js.native
    
    def pretest(text: String): Boolean = js.native
    
    var re: StringDictionary[js.RegExp] = js.native
    
    def set(options: Options): LinkifyIt = js.native
    
    def test(text: String): Boolean = js.native
    
    def testSchemaAt(text: String, schemaName: String, pos: Double): Double = js.native
    
    def tlds(list: String): LinkifyIt = js.native
    def tlds(list: String, keepOld: Boolean): LinkifyIt = js.native
    def tlds(list: js.Array[String]): LinkifyIt = js.native
    def tlds(list: js.Array[String], keepOld: Boolean): LinkifyIt = js.native
  }
  
  trait Match extends StObject {
    
    var index: Double
    
    var lastIndex: Double
    
    var raw: String
    
    var schema: String
    
    var text: String
    
    var url: String
  }
  object Match {
    
    inline def apply(index: Double, lastIndex: Double, raw: String, schema: String, text: String, url: String): Match = {
      val __obj = js.Dynamic.literal(index = index.asInstanceOf[js.Any], lastIndex = lastIndex.asInstanceOf[js.Any], raw = raw.asInstanceOf[js.Any], schema = schema.asInstanceOf[js.Any], text = text.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
      __obj.asInstanceOf[Match]
    }
    
    extension [Self <: Match](x: Self) {
      
      inline def setIndex(value: Double): Self = StObject.set(x, "index", value.asInstanceOf[js.Any])
      
      inline def setLastIndex(value: Double): Self = StObject.set(x, "lastIndex", value.asInstanceOf[js.Any])
      
      inline def setRaw(value: String): Self = StObject.set(x, "raw", value.asInstanceOf[js.Any])
      
      inline def setSchema(value: String): Self = StObject.set(x, "schema", value.asInstanceOf[js.Any])
      
      inline def setText(value: String): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
      
      inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
    }
  }
  
  trait Options extends StObject {
    
    var fuzzyEmail: js.UndefOr[Boolean] = js.undefined
    
    var fuzzyIP: js.UndefOr[Boolean] = js.undefined
    
    var fuzzyLink: js.UndefOr[Boolean] = js.undefined
  }
  object Options {
    
    inline def apply(): Options = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Options]
    }
    
    extension [Self <: Options](x: Self) {
      
      inline def setFuzzyEmail(value: Boolean): Self = StObject.set(x, "fuzzyEmail", value.asInstanceOf[js.Any])
      
      inline def setFuzzyEmailUndefined: Self = StObject.set(x, "fuzzyEmail", js.undefined)
      
      inline def setFuzzyIP(value: Boolean): Self = StObject.set(x, "fuzzyIP", value.asInstanceOf[js.Any])
      
      inline def setFuzzyIPUndefined: Self = StObject.set(x, "fuzzyIP", js.undefined)
      
      inline def setFuzzyLink(value: Boolean): Self = StObject.set(x, "fuzzyLink", value.asInstanceOf[js.Any])
      
      inline def setFuzzyLinkUndefined: Self = StObject.set(x, "fuzzyLink", js.undefined)
    }
  }
  
  type Rule = String | FullRule
  
  type SchemaRules = StringDictionary[Rule]
  
  type Validate = js.Function3[/* text */ String, /* pos */ Double, /* self */ LinkifyIt, Double | Boolean]
}
