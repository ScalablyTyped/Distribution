package typings.jss

import org.scalablytyped.runtime.Shortcut
import org.scalablytyped.runtime.TopLevel
import typings.csstype.mod.Properties
import typings.indefiniteObservable.typesMod.Observable
import typings.jss.anon.Instantiable
import typings.jss.anon.PartialJssOptions
import typings.jss.anon.PartialRuleOptions
import typings.jss.jssBooleans.`false`
import typings.jss.jssStrings.Exclamationmarkimportant
import typings.std.CSSRule
import typings.std.CSSRuleList
import typings.std.CSSStyleRule
import typings.std.Comment
import typings.std.HTMLElement
import typings.std.HTMLStyleElement
import typings.std.Partial
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod extends Shortcut {
  
  @JSImport("jss", JSImport.Default)
  @js.native
  val default: Jss = js.native
  
  @JSImport("jss", "RuleList")
  @js.native
  class RuleList protected () extends StObject {
    def this(options: RuleListOptions) = this()
    
    def add(name: String, decl: JssStyle): Rule = js.native
    def add(name: String, decl: JssStyle, options: RuleOptions): Rule = js.native
    
    def get(name: String): Rule = js.native
    
    def indexOf(rule: Rule): Double = js.native
    
    def process(): Unit = js.native
    
    def register(rule: Rule): Unit = js.native
    def register(rule: Rule, className: String): Unit = js.native
    
    def remove(rule: Rule): Unit = js.native
    
    def toString(options: ToCssOptions): String = js.native
    
    def unregister(rule: Rule): Unit = js.native
    
    def update(data: js.Object): Unit = js.native
    def update(name: String, data: js.Object): Unit = js.native
  }
  
  @JSImport("jss", "SheetsManager")
  @js.native
  class SheetsManager () extends StObject {
    
    def add(key: js.Object, sheet: StyleSheet[String | Double | js.Symbol]): Unit = js.native
    
    def get(key: js.Object): (StyleSheet[String | Double | js.Symbol]) | Null = js.native
    
    def manage(key: js.Object): (StyleSheet[String | Double | js.Symbol]) | Null = js.native
    
    val size: Double = js.native
    
    def unmanage(key: js.Object): Unit = js.native
  }
  
  @JSImport("jss", "SheetsRegistry")
  @js.native
  class SheetsRegistry () extends StObject {
    
    def add[RuleName /* <: String | Double | js.Symbol */](sheet: StyleSheet[RuleName]): Unit = js.native
    
    val index: Double = js.native
    
    var registry: js.Array[StyleSheet[String | Double | js.Symbol]] = js.native
    
    def remove[RuleName /* <: String | Double | js.Symbol */](sheet: StyleSheet[RuleName]): Unit = js.native
    
    def reset(): Unit = js.native
    
    def toString(options: ToCssOptions): String = js.native
  }
  
  @JSImport("jss", "create")
  @js.native
  def create(): Jss = js.native
  @JSImport("jss", "create")
  @js.native
  def create(options: PartialJssOptions): Jss = js.native
  
  @JSImport("jss", "createGenerateId")
  @js.native
  val createGenerateId: CreateGenerateId_ = js.native
  
  @JSImport("jss", "createRule")
  @js.native
  def createRule[D](name: String, decl: JssStyle, options: RuleOptions): Rule = js.native
  
  @JSImport("jss", "getDynamicStyles")
  @js.native
  def getDynamicStyles(styles: Styles[String]): Styles[String] | Null = js.native
  
  /**
    * Creates a new instance of JSS.
    */
  @JSImport("jss", "sheets")
  @js.native
  val sheets: SheetsRegistry = js.native
  
  @JSImport("jss", "toCssValue")
  @js.native
  def toCssValue(value: JssValue, ignoreImportant: Boolean): String = js.native
  
  @js.native
  trait BaseRule extends Rule {
    
    var isProcessed: Boolean = js.native
    
    var key: String = js.native
    
    // eslint-disable-next-line no-use-before-define
    var options: RuleOptions = js.native
    
    def toString(options: ToCssOptions): String = js.native
    
    var `type`: String = js.native
  }
  
  type Classes[Name /* <: String | Double | js.Symbol */] = Record[Name, String]
  
  /* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
  - typings.jss.mod.Rule because Already inherited */ @js.native
  trait ContainerRule extends BaseRule {
    
    var rules: RuleList = js.native
  }
  
  @js.native
  trait CreateGenerateIdOptions extends StObject {
    
    var minify: js.UndefOr[Boolean] = js.native
  }
  object CreateGenerateIdOptions {
    
    @scala.inline
    def apply(): CreateGenerateIdOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[CreateGenerateIdOptions]
    }
    
    @scala.inline
    implicit class CreateGenerateIdOptionsMutableBuilder[Self <: CreateGenerateIdOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setMinify(value: Boolean): Self = StObject.set(x, "minify", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMinifyUndefined: Self = StObject.set(x, "minify", js.undefined)
    }
  }
  
  type CreateGenerateId_ = js.Function1[/* options */ js.UndefOr[CreateGenerateIdOptions], GenerateId]
  
  // TODO: Type data better, currently typed as any for allowing to override it
  type Func[R] = js.Function1[/* data */ js.Any, R]
  
  type GenerateId = js.Function2[/* rule */ Rule, /* sheet */ js.UndefOr[StyleSheet[String]], String]
  
  type InsertionPoint = String | HTMLElement | Comment
  
  @js.native
  trait Jss extends StObject {
    
    def createRule(style: JssStyle): Rule = js.native
    def createRule(style: JssStyle, options: RuleFactoryOptions): Rule = js.native
    def createRule[Name /* <: String */](name: Name, style: JssStyle): Rule = js.native
    def createRule[Name /* <: String */](name: Name, style: JssStyle, options: RuleFactoryOptions): Rule = js.native
    
    def createStyleSheet[Name /* <: String | Double | js.Symbol */](styles: Partial[Styles[Name]]): StyleSheet[Name] = js.native
    def createStyleSheet[Name /* <: String | Double | js.Symbol */](styles: Partial[Styles[Name]], options: StyleSheetFactoryOptions): StyleSheet[Name] = js.native
    
    def removeStyleSheet(sheet: StyleSheet[String | Double | js.Symbol]): this.type = js.native
    
    def setup(): this.type = js.native
    def setup(options: PartialJssOptions): this.type = js.native
    
    def use(plugins: Plugin*): this.type = js.native
  }
  
  @js.native
  trait JssOptions extends StObject {
    
    var Renderer: js.UndefOr[Instantiable | Null] = js.native
    
    def createGenerateId(): GenerateId = js.native
    def createGenerateId(options: CreateGenerateIdOptions): GenerateId = js.native
    @JSName("createGenerateId")
    var createGenerateId_Original: CreateGenerateId_ = js.native
    
    var id: CreateGenerateIdOptions = js.native
    
    var insertionPoint: InsertionPoint = js.native
    
    var plugins: js.Array[Plugin] = js.native
  }
  
  type JssStyle = /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ K in keyof jss.jss.NormalCssProperties | string ]: jss.jss.NormalCssValues<K> | / * import warning: SimplifyRecursiveTypeAlias.enterTsTypeRef rewrittenOpt applyOrElse Simplified recursive type alias jss.jss.JssStyle * / object | jss.jss.Func<jss.jss.NormalCssValues<K> | / * import warning: SimplifyRecursiveTypeAlias.enterTsTypeRef rewrittenOpt applyOrElse Simplified recursive type alias jss.jss.JssStyle * / object | undefined> | indefinite-observable.indefinite-observable/dist/types.Observable<jss.jss.NormalCssValues<K> | / * import warning: SimplifyRecursiveTypeAlias.enterTsTypeRef rewrittenOpt applyOrElse Simplified recursive type alias jss.jss.JssStyle * / object | undefined>}
    */ typings.jss.jssStrings.JssStyle with TopLevel[js.Any]
  
  type JssValue = String | Double | (js.Array[String | Double | (js.Array[String | Double]) | Exclamationmarkimportant]) | Null | `false`
  
  type Keyframes[Name /* <: String */] = Record[Name, String]
  
  type NormalCssProperties = Properties[String | Double]
  
  type NormalCssValues[K] = JssValue | (/* import warning: importer.ImportType#apply Failed type conversion: jss.jss.NormalCssProperties[K] */ js.Any)
  
  @js.native
  trait Plugin extends StObject {
    
    var onChangeValue: js.UndefOr[
        js.Function3[/* value */ String, /* prop */ String, /* rule */ Rule, String | Null | `false`]
      ] = js.native
    
    var onCreateRule: js.UndefOr[
        js.Function3[/* name */ String, /* decl */ JssStyle, /* options */ RuleOptions, Rule]
      ] = js.native
    
    var onProcessRule: js.UndefOr[
        js.Function2[
          /* rule */ Rule, 
          /* sheet */ js.UndefOr[StyleSheet[String | Double | js.Symbol]], 
          Unit
        ]
      ] = js.native
    
    var onProcessSheet: js.UndefOr[
        js.Function1[/* sheet */ js.UndefOr[StyleSheet[String | Double | js.Symbol]], Unit]
      ] = js.native
    
    var onProcessStyle: js.UndefOr[
        js.Function3[
          /* style */ JssStyle, 
          /* rule */ Rule, 
          /* sheet */ js.UndefOr[StyleSheet[String | Double | js.Symbol]], 
          JssStyle
        ]
      ] = js.native
    
    var onUpdate: js.UndefOr[
        js.Function3[
          /* data */ js.Object, 
          /* rule */ Rule, 
          /* sheet */ js.UndefOr[StyleSheet[String | Double | js.Symbol]], 
          Unit
        ]
      ] = js.native
  }
  object Plugin {
    
    @scala.inline
    def apply(): Plugin = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Plugin]
    }
    
    @scala.inline
    implicit class PluginMutableBuilder[Self <: Plugin] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setOnChangeValue(value: (/* value */ String, /* prop */ String, /* rule */ Rule) => String | Null | `false`): Self = StObject.set(x, "onChangeValue", js.Any.fromFunction3(value))
      
      @scala.inline
      def setOnChangeValueUndefined: Self = StObject.set(x, "onChangeValue", js.undefined)
      
      @scala.inline
      def setOnCreateRule(value: (/* name */ String, /* decl */ JssStyle, /* options */ RuleOptions) => Rule): Self = StObject.set(x, "onCreateRule", js.Any.fromFunction3(value))
      
      @scala.inline
      def setOnCreateRuleUndefined: Self = StObject.set(x, "onCreateRule", js.undefined)
      
      @scala.inline
      def setOnProcessRule(value: (/* rule */ Rule, /* sheet */ js.UndefOr[StyleSheet[String | Double | js.Symbol]]) => Unit): Self = StObject.set(x, "onProcessRule", js.Any.fromFunction2(value))
      
      @scala.inline
      def setOnProcessRuleUndefined: Self = StObject.set(x, "onProcessRule", js.undefined)
      
      @scala.inline
      def setOnProcessSheet(value: /* sheet */ js.UndefOr[StyleSheet[String | Double | js.Symbol]] => Unit): Self = StObject.set(x, "onProcessSheet", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnProcessSheetUndefined: Self = StObject.set(x, "onProcessSheet", js.undefined)
      
      @scala.inline
      def setOnProcessStyle(
        value: (/* style */ JssStyle, /* rule */ Rule, /* sheet */ js.UndefOr[StyleSheet[String | Double | js.Symbol]]) => JssStyle
      ): Self = StObject.set(x, "onProcessStyle", js.Any.fromFunction3(value))
      
      @scala.inline
      def setOnProcessStyleUndefined: Self = StObject.set(x, "onProcessStyle", js.undefined)
      
      @scala.inline
      def setOnUpdate(
        value: (/* data */ js.Object, /* rule */ Rule, /* sheet */ js.UndefOr[StyleSheet[String | Double | js.Symbol]]) => Unit
      ): Self = StObject.set(x, "onUpdate", js.Any.fromFunction3(value))
      
      @scala.inline
      def setOnUpdateUndefined: Self = StObject.set(x, "onUpdate", js.undefined)
    }
  }
  
  @js.native
  trait Renderer extends StObject {
    
    def attach(): Unit = js.native
    
    def deleteRule(cssRule: CSSRule): Boolean = js.native
    
    def deploy(sheet: StyleSheet[String | Double | js.Symbol]): Unit = js.native
    
    def detach(): Unit = js.native
    
    def getPropertyValue(cssRule: CSSStyleRule, prop: String): String = js.native
    def getPropertyValue(cssRule: HTMLElement, prop: String): String = js.native
    
    def getRules(): CSSRuleList | Unit = js.native
    
    def indexOf(cssRule: CSSRule): Double = js.native
    
    def insertRule(rule: Rule): `false` | CSSRule = js.native
    
    def removeProperty(cssRule: CSSStyleRule, prop: String): Unit = js.native
    def removeProperty(cssRule: HTMLElement, prop: String): Unit = js.native
    
    def replaceRule(cssRule: CSSRule, rule: Rule): `false` | CSSRule = js.native
    
    def setProperty(cssRule: CSSStyleRule, prop: String, value: JssValue): Boolean = js.native
    def setProperty(cssRule: HTMLElement, prop: String, value: JssValue): Boolean = js.native
    
    def setSelector(cssRule: CSSStyleRule, selectorText: String): Boolean = js.native
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.jss.mod.BaseRule
    - typings.jss.mod.ContainerRule
  */
  trait Rule extends StObject
  
  @js.native
  trait RuleFactoryOptions extends StObject {
    
    var Renderer: js.UndefOr[typings.jss.mod.Renderer] = js.native
    
    var classes: js.UndefOr[js.Object] = js.native
    
    var generateId: js.UndefOr[GenerateId] = js.native
    
    var index: js.UndefOr[Double] = js.native
    
    var jss: js.UndefOr[Jss] = js.native
    
    var selector: js.UndefOr[String] = js.native
    
    var sheet: js.UndefOr[StyleSheet[String | Double | js.Symbol]] = js.native
  }
  object RuleFactoryOptions {
    
    @scala.inline
    def apply(): RuleFactoryOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[RuleFactoryOptions]
    }
    
    @scala.inline
    implicit class RuleFactoryOptionsMutableBuilder[Self <: RuleFactoryOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setClasses(value: js.Object): Self = StObject.set(x, "classes", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setClassesUndefined: Self = StObject.set(x, "classes", js.undefined)
      
      @scala.inline
      def setGenerateId(value: (/* rule */ Rule, /* sheet */ js.UndefOr[StyleSheet[String]]) => String): Self = StObject.set(x, "generateId", js.Any.fromFunction2(value))
      
      @scala.inline
      def setGenerateIdUndefined: Self = StObject.set(x, "generateId", js.undefined)
      
      @scala.inline
      def setIndex(value: Double): Self = StObject.set(x, "index", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIndexUndefined: Self = StObject.set(x, "index", js.undefined)
      
      @scala.inline
      def setJss(value: Jss): Self = StObject.set(x, "jss", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setJssUndefined: Self = StObject.set(x, "jss", js.undefined)
      
      @scala.inline
      def setRenderer(value: Renderer): Self = StObject.set(x, "Renderer", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRendererUndefined: Self = StObject.set(x, "Renderer", js.undefined)
      
      @scala.inline
      def setSelector(value: String): Self = StObject.set(x, "selector", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSelectorUndefined: Self = StObject.set(x, "selector", js.undefined)
      
      @scala.inline
      def setSheet(value: StyleSheet[String | Double | js.Symbol]): Self = StObject.set(x, "sheet", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSheetUndefined: Self = StObject.set(x, "sheet", js.undefined)
    }
  }
  
  @js.native
  trait RuleListOptions extends StObject {
    
    var Renderer: typings.jss.mod.Renderer = js.native
    
    var classes: Classes[String] = js.native
    
    def generateClassName(rule: Rule): String = js.native
    def generateClassName(rule: Rule, sheet: StyleSheet[String]): String = js.native
    @JSName("generateClassName")
    var generateClassName_Original: GenerateId = js.native
    
    var jss: Jss = js.native
    
    var parent: ContainerRule | (StyleSheet[String | Double | js.Symbol]) = js.native
    
    var sheet: StyleSheet[String | Double | js.Symbol] = js.native
  }
  
  @js.native
  trait RuleOptions extends StObject {
    
    var Renderer: typings.jss.mod.Renderer = js.native
    
    var classes: Classes[String] = js.native
    
    def generateId(rule: Rule): String = js.native
    def generateId(rule: Rule, sheet: StyleSheet[String]): String = js.native
    @JSName("generateId")
    var generateId_Original: GenerateId = js.native
    
    var index: js.UndefOr[Double] = js.native
    
    var jss: Jss = js.native
    
    var parent: js.UndefOr[ContainerRule | (StyleSheet[String | Double | js.Symbol])] = js.native
    
    var selector: js.UndefOr[String] = js.native
    
    var sheet: js.UndefOr[StyleSheet[String | Double | js.Symbol]] = js.native
  }
  
  @js.native
  trait StyleSheet[RuleName /* <: String | Double | js.Symbol */] extends StObject {
    
    def addRule(name: RuleName, style: JssStyle): Rule = js.native
    def addRule(name: RuleName, style: JssStyle, options: PartialRuleOptions): Rule = js.native
    /**
      * Add a rule to the current stylesheet.
      * Will insert a rule also after the stylesheet has been rendered first time.
      */
    def addRule(style: JssStyle): Rule = js.native
    def addRule(style: JssStyle, options: PartialRuleOptions): Rule = js.native
    
    /**
      * Create and add rules.
      * Will render also after Style Sheet was rendered the first time.
      */
    def addRules(styles: Partial[Styles[RuleName]]): js.Array[Rule] = js.native
    def addRules(styles: Partial[Styles[RuleName]], options: PartialRuleOptions): js.Array[Rule] = js.native
    
    /**
      * Attach renderable to the render tree.
      */
    def attach(): this.type = js.native
    
    var attached: Boolean = js.native
    
    // Gives auto-completion on the rules declared in `createStyleSheet` without
    // causing errors for rules added dynamically after creation.
    var classes: Classes[RuleName] = js.native
    
    /**
      * Delete a rule by name.
      * Returns `true`: if rule has been deleted from the DOM.
      */
    def deleteRule(name: RuleName): Boolean = js.native
    
    def deploy(): this.type = js.native
    
    /**
      * Remove renderable from render tree.
      */
    def detach(): this.type = js.native
    
    /**
      * Get a rule by name.
      */
    def getRule(name: RuleName): Rule = js.native
    
    /**
      * Get index of a rule.
      */
    def indexOf(rule: Rule): Double = js.native
    
    def insertRule(rule: Rule): Unit = js.native
    
    var keyframes: Keyframes[String] = js.native
    
    var linked: Boolean = js.native
    
    var options: StyleSheetOptions = js.native
    
    def toString(options: ToCssOptions): String = js.native
    
    def update(data: js.Object): this.type = js.native
    def update(data: js.Object, options: UpdateOptions): this.type = js.native
    /**
      * Update the function values with a new data.
      */
    def update(name: String, data: js.Object): this.type = js.native
    def update(name: String, data: js.Object, options: UpdateOptions): this.type = js.native
  }
  
  @js.native
  trait StyleSheetFactoryOptions extends StObject {
    
    var classNamePrefix: js.UndefOr[String] = js.native
    
    var element: js.UndefOr[HTMLStyleElement] = js.native
    
    var generateId: js.UndefOr[GenerateId] = js.native
    
    var index: js.UndefOr[Double] = js.native
    
    var link: js.UndefOr[Boolean] = js.native
    
    var media: js.UndefOr[String] = js.native
    
    var meta: js.UndefOr[String] = js.native
  }
  object StyleSheetFactoryOptions {
    
    @scala.inline
    def apply(): StyleSheetFactoryOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[StyleSheetFactoryOptions]
    }
    
    @scala.inline
    implicit class StyleSheetFactoryOptionsMutableBuilder[Self <: StyleSheetFactoryOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setClassNamePrefix(value: String): Self = StObject.set(x, "classNamePrefix", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setClassNamePrefixUndefined: Self = StObject.set(x, "classNamePrefix", js.undefined)
      
      @scala.inline
      def setElement(value: HTMLStyleElement): Self = StObject.set(x, "element", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setElementUndefined: Self = StObject.set(x, "element", js.undefined)
      
      @scala.inline
      def setGenerateId(value: (/* rule */ Rule, /* sheet */ js.UndefOr[StyleSheet[String]]) => String): Self = StObject.set(x, "generateId", js.Any.fromFunction2(value))
      
      @scala.inline
      def setGenerateIdUndefined: Self = StObject.set(x, "generateId", js.undefined)
      
      @scala.inline
      def setIndex(value: Double): Self = StObject.set(x, "index", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIndexUndefined: Self = StObject.set(x, "index", js.undefined)
      
      @scala.inline
      def setLink(value: Boolean): Self = StObject.set(x, "link", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLinkUndefined: Self = StObject.set(x, "link", js.undefined)
      
      @scala.inline
      def setMedia(value: String): Self = StObject.set(x, "media", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMediaUndefined: Self = StObject.set(x, "media", js.undefined)
      
      @scala.inline
      def setMeta(value: String): Self = StObject.set(x, "meta", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMetaUndefined: Self = StObject.set(x, "meta", js.undefined)
    }
  }
  
  @js.native
  trait StyleSheetOptions extends StyleSheetFactoryOptions {
    
    var Renderer: typings.jss.mod.Renderer = js.native
    
    @JSName("generateId")
    def generateId_MStyleSheetOptions(rule: Rule): String = js.native
    @JSName("generateId")
    def generateId_MStyleSheetOptions(rule: Rule, sheet: StyleSheet[String]): String = js.native
    @JSName("generateId")
    var generateId_Original: GenerateId = js.native
    
    @JSName("index")
    var index_StyleSheetOptions: Double = js.native
    
    var insertionPoint: js.UndefOr[InsertionPoint] = js.native
    
    var jss: Jss = js.native
  }
  
  type Styles[Name /* <: String | Double | js.Symbol */] = Record[
    Name, 
    JssStyle | String | (Func[js.UndefOr[JssStyle | String | Null]]) | (Observable[js.UndefOr[JssStyle | String | Null]])
  ]
  
  @js.native
  trait ToCssOptions extends StObject {
    
    var allowEmpty: js.UndefOr[Boolean] = js.native
    
    var indent: js.UndefOr[Double] = js.native
  }
  object ToCssOptions {
    
    @scala.inline
    def apply(): ToCssOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ToCssOptions]
    }
    
    @scala.inline
    implicit class ToCssOptionsMutableBuilder[Self <: ToCssOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAllowEmpty(value: Boolean): Self = StObject.set(x, "allowEmpty", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAllowEmptyUndefined: Self = StObject.set(x, "allowEmpty", js.undefined)
      
      @scala.inline
      def setIndent(value: Double): Self = StObject.set(x, "indent", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIndentUndefined: Self = StObject.set(x, "indent", js.undefined)
    }
  }
  
  @js.native
  trait UpdateOptions extends StObject {
    
    var force: js.UndefOr[Boolean] = js.native
    
    var process: js.UndefOr[Boolean] = js.native
  }
  object UpdateOptions {
    
    @scala.inline
    def apply(): UpdateOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[UpdateOptions]
    }
    
    @scala.inline
    implicit class UpdateOptionsMutableBuilder[Self <: UpdateOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setForce(value: Boolean): Self = StObject.set(x, "force", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setForceUndefined: Self = StObject.set(x, "force", js.undefined)
      
      @scala.inline
      def setProcess(value: Boolean): Self = StObject.set(x, "process", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setProcessUndefined: Self = StObject.set(x, "process", js.undefined)
    }
  }
  
  type _To = Jss
  
  /* This means you don't have to write `default`, but can instead just say `mod.foo` */
  override def _to: Jss = default
}
