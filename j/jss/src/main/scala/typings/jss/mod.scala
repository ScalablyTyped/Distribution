package typings.jss

import org.scalablytyped.runtime.StringDictionary
import typings.csstype.mod.Properties
import typings.jss.anon.Instantiable
import typings.jss.anon.Next
import typings.jss.anon.PartialJssOptions
import typings.jss.anon.PartialRuleOptions
import typings.jss.anon.Unsubscribe
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
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("jss", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("jss", JSImport.Default)
  @js.native
  val default: Jss = js.native
  
  @JSImport("jss", "RuleList")
  @js.native
  open class RuleList protected () extends StObject {
    def this(options: RuleListOptions) = this()
    
    def add(name: String, decl: JssStyle[Any, Unit]): Rule | Null = js.native
    def add(name: String, decl: JssStyle[Any, Unit], options: RuleOptions): Rule | Null = js.native
    
    def get(nameOrSelector: String): Rule = js.native
    
    def indexOf(rule: Rule): Double = js.native
    
    def process(): Unit = js.native
    
    def register(rule: Rule): Unit = js.native
    def register(rule: Rule, className: String): Unit = js.native
    
    def remove(rule: Rule): Unit = js.native
    
    def replace(name: String, decl: JssStyle[Any, Unit]): Rule | Null = js.native
    def replace(name: String, decl: JssStyle[Any, Unit], options: RuleOptions): Rule | Null = js.native
    
    def toString(options: ToCssOptions): String = js.native
    
    def unregister(rule: Rule): Unit = js.native
    
    def update(data: js.Object): Unit = js.native
    def update(name: String, data: js.Object): Unit = js.native
  }
  
  @JSImport("jss", "SheetsManager")
  @js.native
  open class SheetsManager () extends StObject {
    
    def add(key: js.Object, sheet: StyleSheet[String | Double | js.Symbol]): Unit = js.native
    
    def get(key: js.Object): (StyleSheet[String | Double | js.Symbol]) | Null = js.native
    
    def manage(key: js.Object): (StyleSheet[String | Double | js.Symbol]) | Null = js.native
    
    val size: Double = js.native
    
    def unmanage(key: js.Object): Unit = js.native
  }
  
  @JSImport("jss", "SheetsRegistry")
  @js.native
  open class SheetsRegistry () extends StObject {
    
    def add[RuleName /* <: String | Double | js.Symbol */](sheet: StyleSheet[RuleName]): Unit = js.native
    
    val index: Double = js.native
    
    var registry: js.Array[StyleSheet[String | Double | js.Symbol]] = js.native
    
    def remove[RuleName /* <: String | Double | js.Symbol */](sheet: StyleSheet[RuleName]): Unit = js.native
    
    def reset(): Unit = js.native
    
    def toString(options: ToCssOptions): String = js.native
  }
  
  inline def create(): Jss = ^.asInstanceOf[js.Dynamic].applyDynamic("create")().asInstanceOf[Jss]
  inline def create(options: PartialJssOptions): Jss = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(options.asInstanceOf[js.Any]).asInstanceOf[Jss]
  
  @JSImport("jss", "createGenerateId")
  @js.native
  val createGenerateId: CreateGenerateId_ = js.native
  
  inline def createRule[D](name: String, decl: JssStyle[Any, Unit], options: RuleOptions): Rule = (^.asInstanceOf[js.Dynamic].applyDynamic("createRule")(name.asInstanceOf[js.Any], decl.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Rule]
  
  inline def getDynamicStyles(styles: Styles[String, Any, Unit]): (Styles[String, Any, Unit]) | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("getDynamicStyles")(styles.asInstanceOf[js.Any]).asInstanceOf[(Styles[String, Any, Unit]) | Null]
  
  /**
    * Creates a new instance of JSS.
    */
  @JSImport("jss", "sheets")
  @js.native
  val sheets: SheetsRegistry = js.native
  
  inline def toCssValue(value: JssValue): String = ^.asInstanceOf[js.Dynamic].applyDynamic("toCssValue")(value.asInstanceOf[js.Any]).asInstanceOf[String]
  
  @js.native
  trait BaseRule extends StObject {
    
    var isProcessed: Boolean = js.native
    
    var key: String = js.native
    
    // eslint-disable-next-line no-use-before-define
    var options: RuleOptions = js.native
    
    def toString(options: ToCssOptions): String = js.native
    
    var `type`: String = js.native
  }
  
  type Classes[Name /* <: String | Double | js.Symbol */] = Record[Name, String]
  
  @js.native
  trait ContainerRule
    extends StObject
       with BaseRule {
    
    var rules: RuleList = js.native
  }
  
  trait CreateGenerateIdOptions extends StObject {
    
    var minify: js.UndefOr[Boolean] = js.undefined
  }
  object CreateGenerateIdOptions {
    
    inline def apply(): CreateGenerateIdOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[CreateGenerateIdOptions]
    }
    
    extension [Self <: CreateGenerateIdOptions](x: Self) {
      
      inline def setMinify(value: Boolean): Self = StObject.set(x, "minify", value.asInstanceOf[js.Any])
      
      inline def setMinifyUndefined: Self = StObject.set(x, "minify", js.undefined)
    }
  }
  
  type CreateGenerateId_ = js.Function1[/* options */ js.UndefOr[CreateGenerateIdOptions], GenerateId]
  
  /** NOTE: Conditional type definitions are impossible to translate to Scala.
    * See https://www.typescriptlang.org/docs/handbook/2/conditional-types.html for an intro.
    * This RHS of the type alias is guess work. You should cast if it's not correct in your case.
    * TS definition: {{{
    T extends undefined ? (data : P): R : (data : P & {  theme :T}): R
    }}}
    */
  type Func[P, T, R] = js.Function1[/* data */ P, R]
  
  type GenerateId = js.Function2[/* rule */ Rule, /* sheet */ js.UndefOr[StyleSheet[String]], String]
  
  type InsertionPoint = String | HTMLElement | Comment
  
  @js.native
  trait Jss extends StObject {
    
    def createRule(style: JssStyle[Any, Unit]): Rule = js.native
    def createRule(style: JssStyle[Any, Unit], options: RuleFactoryOptions): Rule = js.native
    def createRule[Name /* <: String */](name: Name, style: JssStyle[Any, Unit]): Rule = js.native
    def createRule[Name /* <: String */](name: Name, style: JssStyle[Any, Unit], options: RuleFactoryOptions): Rule = js.native
    
    def createStyleSheet[Name /* <: String | Double | js.Symbol */](styles: Partial[Styles[Name, Any, Unit]]): StyleSheet[Name] = js.native
    def createStyleSheet[Name /* <: String | Double | js.Symbol */](styles: Partial[Styles[Name, Any, Unit]], options: StyleSheetFactoryOptions): StyleSheet[Name] = js.native
    
    def removeStyleSheet(sheet: StyleSheet[String | Double | js.Symbol]): this.type = js.native
    
    def setup(): this.type = js.native
    def setup(options: PartialJssOptions): this.type = js.native
    
    def use(plugins: Plugin*): this.type = js.native
  }
  
  trait JssOptions extends StObject {
    
    var Renderer: js.UndefOr[Instantiable | Null] = js.undefined
    
    def createGenerateId(): GenerateId
    def createGenerateId(options: CreateGenerateIdOptions): GenerateId
    @JSName("createGenerateId")
    var createGenerateId_Original: CreateGenerateId_
    
    var id: CreateGenerateIdOptions
    
    var insertionPoint: InsertionPoint
    
    var plugins: js.Array[Plugin]
  }
  object JssOptions {
    
    inline def apply(
      createGenerateId: /* options */ js.UndefOr[CreateGenerateIdOptions] => GenerateId,
      id: CreateGenerateIdOptions,
      insertionPoint: InsertionPoint,
      plugins: js.Array[Plugin]
    ): JssOptions = {
      val __obj = js.Dynamic.literal(createGenerateId = js.Any.fromFunction1(createGenerateId), id = id.asInstanceOf[js.Any], insertionPoint = insertionPoint.asInstanceOf[js.Any], plugins = plugins.asInstanceOf[js.Any])
      __obj.asInstanceOf[JssOptions]
    }
    
    extension [Self <: JssOptions](x: Self) {
      
      inline def setCreateGenerateId(value: /* options */ js.UndefOr[CreateGenerateIdOptions] => GenerateId): Self = StObject.set(x, "createGenerateId", js.Any.fromFunction1(value))
      
      inline def setId(value: CreateGenerateIdOptions): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      inline def setInsertionPoint(value: InsertionPoint): Self = StObject.set(x, "insertionPoint", value.asInstanceOf[js.Any])
      
      inline def setPlugins(value: js.Array[Plugin]): Self = StObject.set(x, "plugins", value.asInstanceOf[js.Any])
      
      inline def setPluginsVarargs(value: Plugin*): Self = StObject.set(x, "plugins", js.Array(value*))
      
      inline def setRenderer(value: Instantiable): Self = StObject.set(x, "Renderer", value.asInstanceOf[js.Any])
      
      inline def setRendererNull: Self = StObject.set(x, "Renderer", null)
      
      inline def setRendererUndefined: Self = StObject.set(x, "Renderer", js.undefined)
    }
  }
  
  /** 
  NOTE: Rewritten from type alias:
  {{{
  type JssStyle = {[ K in keyof jss.jss.NormalCssProperties ]: jss.jss.NormalCssValues<K> | jss.jss.JssStyle<Props, Theme> | jss.jss.Func<Props, Theme, jss.jss.NormalCssValues<K> | jss.jss.JssStyle<undefined, undefined> | undefined> | jss.jss.MinimalObservable<jss.jss.NormalCssValues<K> | jss.jss.JssStyle<any, undefined> | undefined>} | {[K: string] : jss.jss.JssValue | jss.jss.JssStyle<Props, Theme> | jss.jss.Func<Props, Theme, jss.jss.JssValue | jss.jss.JssStyle<undefined, undefined> | undefined> | jss.jss.MinimalObservable<jss.jss.JssValue | jss.jss.JssStyle<any, undefined> | undefined>}
  }}}
  to avoid circular code involving: 
  - jss.jss.JssStyle
  */
  type JssStyle[Props, Theme] = (/* import warning: importer.ImportType#apply Failed type conversion: {[ K in keyof jss.jss.NormalCssProperties ]: jss.jss.NormalCssValues<K> | any | jss.jss.Func<Props, Theme, jss.jss.NormalCssValues<K> | any | undefined> | jss.jss.MinimalObservable<jss.jss.NormalCssValues<K> | any | undefined>} */ js.Any) | (StringDictionary[
    JssValue | Any | (Func[Props, Theme, js.UndefOr[JssValue | Any]]) | (MinimalObservable[js.UndefOr[JssValue | Any]])
  ])
  
  type JssValue = String | (Double & js.Object) | (js.Array[String | Double | (js.Array[String | Double]) | "!important"]) | Null | false
  
  type Keyframes[Name /* <: String */] = Record[Name, String]
  
  @js.native
  trait MinimalObservable[T] extends StObject {
    
    def subscribe(nextOrObserver: js.Function1[/* value */ T, Unit]): Unsubscribe = js.native
    def subscribe(nextOrObserver: Next[T]): Unsubscribe = js.native
  }
  
  type NormalCssProperties = Properties[String | Double, String]
  
  /** NOTE: Conditional type definitions are impossible to translate to Scala.
    * See https://www.typescriptlang.org/docs/handbook/2/conditional-types.html for an intro.
    * This RHS of the type alias is guess work. You should cast if it's not correct in your case.
    * TS definition: {{{
    K extends keyof jss.jss.NormalCssProperties ? jss.jss.NormalCssProperties[K] : jss.jss.JssValue
    }}}
    */
  type NormalCssValues[K] = JssValue
  
  trait Plugin extends StObject {
    
    var onChangeValue: js.UndefOr[
        js.Function3[/* value */ String, /* prop */ String, /* rule */ Rule, String | Null | false]
      ] = js.undefined
    
    var onCreateRule: js.UndefOr[
        js.Function3[/* name */ String, /* decl */ JssStyle[Any, Unit], /* options */ RuleOptions, Rule]
      ] = js.undefined
    
    var onProcessRule: js.UndefOr[
        js.Function2[
          /* rule */ Rule, 
          /* sheet */ js.UndefOr[StyleSheet[String | Double | js.Symbol]], 
          Unit
        ]
      ] = js.undefined
    
    var onProcessSheet: js.UndefOr[
        js.Function1[/* sheet */ js.UndefOr[StyleSheet[String | Double | js.Symbol]], Unit]
      ] = js.undefined
    
    var onProcessStyle: js.UndefOr[
        js.Function3[
          /* style */ JssStyle[Any, Unit], 
          /* rule */ Rule, 
          /* sheet */ js.UndefOr[StyleSheet[String | Double | js.Symbol]], 
          JssStyle[Any, Unit]
        ]
      ] = js.undefined
    
    var onUpdate: js.UndefOr[
        js.Function3[
          /* data */ js.Object, 
          /* rule */ Rule, 
          /* sheet */ js.UndefOr[StyleSheet[String | Double | js.Symbol]], 
          Unit
        ]
      ] = js.undefined
  }
  object Plugin {
    
    inline def apply(): Plugin = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Plugin]
    }
    
    extension [Self <: Plugin](x: Self) {
      
      inline def setOnChangeValue(value: (/* value */ String, /* prop */ String, /* rule */ Rule) => String | Null | false): Self = StObject.set(x, "onChangeValue", js.Any.fromFunction3(value))
      
      inline def setOnChangeValueUndefined: Self = StObject.set(x, "onChangeValue", js.undefined)
      
      inline def setOnCreateRule(value: (/* name */ String, /* decl */ JssStyle[Any, Unit], /* options */ RuleOptions) => Rule): Self = StObject.set(x, "onCreateRule", js.Any.fromFunction3(value))
      
      inline def setOnCreateRuleUndefined: Self = StObject.set(x, "onCreateRule", js.undefined)
      
      inline def setOnProcessRule(value: (/* rule */ Rule, /* sheet */ js.UndefOr[StyleSheet[String | Double | js.Symbol]]) => Unit): Self = StObject.set(x, "onProcessRule", js.Any.fromFunction2(value))
      
      inline def setOnProcessRuleUndefined: Self = StObject.set(x, "onProcessRule", js.undefined)
      
      inline def setOnProcessSheet(value: /* sheet */ js.UndefOr[StyleSheet[String | Double | js.Symbol]] => Unit): Self = StObject.set(x, "onProcessSheet", js.Any.fromFunction1(value))
      
      inline def setOnProcessSheetUndefined: Self = StObject.set(x, "onProcessSheet", js.undefined)
      
      inline def setOnProcessStyle(
        value: (/* style */ JssStyle[Any, Unit], /* rule */ Rule, /* sheet */ js.UndefOr[StyleSheet[String | Double | js.Symbol]]) => JssStyle[Any, Unit]
      ): Self = StObject.set(x, "onProcessStyle", js.Any.fromFunction3(value))
      
      inline def setOnProcessStyleUndefined: Self = StObject.set(x, "onProcessStyle", js.undefined)
      
      inline def setOnUpdate(
        value: (/* data */ js.Object, /* rule */ Rule, /* sheet */ js.UndefOr[StyleSheet[String | Double | js.Symbol]]) => Unit
      ): Self = StObject.set(x, "onUpdate", js.Any.fromFunction3(value))
      
      inline def setOnUpdateUndefined: Self = StObject.set(x, "onUpdate", js.undefined)
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
    
    def insertRule(rule: Rule): false | CSSRule = js.native
    
    def removeProperty(cssRule: CSSStyleRule, prop: String): Unit = js.native
    def removeProperty(cssRule: HTMLElement, prop: String): Unit = js.native
    
    def replaceRule(cssRule: CSSRule, rule: Rule): false | CSSRule = js.native
    
    def setProperty(cssRule: CSSStyleRule, prop: String, value: JssValue): Boolean = js.native
    def setProperty(cssRule: HTMLElement, prop: String, value: JssValue): Boolean = js.native
    
    def setSelector(cssRule: CSSStyleRule, selectorText: String): Boolean = js.native
  }
  
  type Rule = BaseRule | ContainerRule
  
  trait RuleFactoryOptions extends StObject {
    
    var Renderer: js.UndefOr[typings.jss.mod.Renderer] = js.undefined
    
    var classes: js.UndefOr[js.Object] = js.undefined
    
    var generateId: js.UndefOr[GenerateId] = js.undefined
    
    var index: js.UndefOr[Double] = js.undefined
    
    var jss: js.UndefOr[Jss] = js.undefined
    
    var selector: js.UndefOr[String] = js.undefined
    
    var sheet: js.UndefOr[StyleSheet[String | Double | js.Symbol]] = js.undefined
  }
  object RuleFactoryOptions {
    
    inline def apply(): RuleFactoryOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[RuleFactoryOptions]
    }
    
    extension [Self <: RuleFactoryOptions](x: Self) {
      
      inline def setClasses(value: js.Object): Self = StObject.set(x, "classes", value.asInstanceOf[js.Any])
      
      inline def setClassesUndefined: Self = StObject.set(x, "classes", js.undefined)
      
      inline def setGenerateId(value: (/* rule */ Rule, /* sheet */ js.UndefOr[StyleSheet[String]]) => String): Self = StObject.set(x, "generateId", js.Any.fromFunction2(value))
      
      inline def setGenerateIdUndefined: Self = StObject.set(x, "generateId", js.undefined)
      
      inline def setIndex(value: Double): Self = StObject.set(x, "index", value.asInstanceOf[js.Any])
      
      inline def setIndexUndefined: Self = StObject.set(x, "index", js.undefined)
      
      inline def setJss(value: Jss): Self = StObject.set(x, "jss", value.asInstanceOf[js.Any])
      
      inline def setJssUndefined: Self = StObject.set(x, "jss", js.undefined)
      
      inline def setRenderer(value: Renderer): Self = StObject.set(x, "Renderer", value.asInstanceOf[js.Any])
      
      inline def setRendererUndefined: Self = StObject.set(x, "Renderer", js.undefined)
      
      inline def setSelector(value: String): Self = StObject.set(x, "selector", value.asInstanceOf[js.Any])
      
      inline def setSelectorUndefined: Self = StObject.set(x, "selector", js.undefined)
      
      inline def setSheet(value: StyleSheet[String | Double | js.Symbol]): Self = StObject.set(x, "sheet", value.asInstanceOf[js.Any])
      
      inline def setSheetUndefined: Self = StObject.set(x, "sheet", js.undefined)
    }
  }
  
  trait RuleListOptions extends StObject {
    
    var Renderer: typings.jss.mod.Renderer
    
    var classes: Classes[String]
    
    def generateClassName(rule: Rule): String
    def generateClassName(rule: Rule, sheet: StyleSheet[String]): String
    @JSName("generateClassName")
    var generateClassName_Original: GenerateId
    
    var jss: Jss
    
    var parent: ContainerRule | (StyleSheet[String | Double | js.Symbol])
    
    var sheet: StyleSheet[String | Double | js.Symbol]
  }
  object RuleListOptions {
    
    inline def apply(
      Renderer: Renderer,
      classes: Classes[String],
      generateClassName: (/* rule */ Rule, /* sheet */ js.UndefOr[StyleSheet[String]]) => String,
      jss: Jss,
      parent: ContainerRule | (StyleSheet[String | Double | js.Symbol]),
      sheet: StyleSheet[String | Double | js.Symbol]
    ): RuleListOptions = {
      val __obj = js.Dynamic.literal(Renderer = Renderer.asInstanceOf[js.Any], classes = classes.asInstanceOf[js.Any], generateClassName = js.Any.fromFunction2(generateClassName), jss = jss.asInstanceOf[js.Any], parent = parent.asInstanceOf[js.Any], sheet = sheet.asInstanceOf[js.Any])
      __obj.asInstanceOf[RuleListOptions]
    }
    
    extension [Self <: RuleListOptions](x: Self) {
      
      inline def setClasses(value: Classes[String]): Self = StObject.set(x, "classes", value.asInstanceOf[js.Any])
      
      inline def setGenerateClassName(value: (/* rule */ Rule, /* sheet */ js.UndefOr[StyleSheet[String]]) => String): Self = StObject.set(x, "generateClassName", js.Any.fromFunction2(value))
      
      inline def setJss(value: Jss): Self = StObject.set(x, "jss", value.asInstanceOf[js.Any])
      
      inline def setParent(value: ContainerRule | (StyleSheet[String | Double | js.Symbol])): Self = StObject.set(x, "parent", value.asInstanceOf[js.Any])
      
      inline def setRenderer(value: Renderer): Self = StObject.set(x, "Renderer", value.asInstanceOf[js.Any])
      
      inline def setSheet(value: StyleSheet[String | Double | js.Symbol]): Self = StObject.set(x, "sheet", value.asInstanceOf[js.Any])
    }
  }
  
  trait RuleOptions extends StObject {
    
    var Renderer: typings.jss.mod.Renderer
    
    var classes: Classes[String]
    
    def generateId(rule: Rule): String
    def generateId(rule: Rule, sheet: StyleSheet[String]): String
    @JSName("generateId")
    var generateId_Original: GenerateId
    
    var index: js.UndefOr[Double] = js.undefined
    
    var jss: Jss
    
    var parent: js.UndefOr[ContainerRule | (StyleSheet[String | Double | js.Symbol])] = js.undefined
    
    var selector: js.UndefOr[String] = js.undefined
    
    var sheet: js.UndefOr[StyleSheet[String | Double | js.Symbol]] = js.undefined
  }
  object RuleOptions {
    
    inline def apply(
      Renderer: Renderer,
      classes: Classes[String],
      generateId: (/* rule */ Rule, /* sheet */ js.UndefOr[StyleSheet[String]]) => String,
      jss: Jss
    ): RuleOptions = {
      val __obj = js.Dynamic.literal(Renderer = Renderer.asInstanceOf[js.Any], classes = classes.asInstanceOf[js.Any], generateId = js.Any.fromFunction2(generateId), jss = jss.asInstanceOf[js.Any])
      __obj.asInstanceOf[RuleOptions]
    }
    
    extension [Self <: RuleOptions](x: Self) {
      
      inline def setClasses(value: Classes[String]): Self = StObject.set(x, "classes", value.asInstanceOf[js.Any])
      
      inline def setGenerateId(value: (/* rule */ Rule, /* sheet */ js.UndefOr[StyleSheet[String]]) => String): Self = StObject.set(x, "generateId", js.Any.fromFunction2(value))
      
      inline def setIndex(value: Double): Self = StObject.set(x, "index", value.asInstanceOf[js.Any])
      
      inline def setIndexUndefined: Self = StObject.set(x, "index", js.undefined)
      
      inline def setJss(value: Jss): Self = StObject.set(x, "jss", value.asInstanceOf[js.Any])
      
      inline def setParent(value: ContainerRule | (StyleSheet[String | Double | js.Symbol])): Self = StObject.set(x, "parent", value.asInstanceOf[js.Any])
      
      inline def setParentUndefined: Self = StObject.set(x, "parent", js.undefined)
      
      inline def setRenderer(value: Renderer): Self = StObject.set(x, "Renderer", value.asInstanceOf[js.Any])
      
      inline def setSelector(value: String): Self = StObject.set(x, "selector", value.asInstanceOf[js.Any])
      
      inline def setSelectorUndefined: Self = StObject.set(x, "selector", js.undefined)
      
      inline def setSheet(value: StyleSheet[String | Double | js.Symbol]): Self = StObject.set(x, "sheet", value.asInstanceOf[js.Any])
      
      inline def setSheetUndefined: Self = StObject.set(x, "sheet", js.undefined)
    }
  }
  
  @js.native
  trait StyleSheet[RuleName /* <: String | Double | js.Symbol */] extends StObject {
    
    def addRule(name: RuleName, style: JssStyle[Any, Unit]): Rule | Null = js.native
    def addRule(name: RuleName, style: JssStyle[Any, Unit], options: PartialRuleOptions): Rule | Null = js.native
    /**
      * Add a rule to the current stylesheet.
      * Will insert a rule also after the stylesheet has been rendered first time.
      */
    def addRule(style: JssStyle[Any, Unit]): Rule = js.native
    def addRule(style: JssStyle[Any, Unit], options: PartialRuleOptions): Rule = js.native
    
    /**
      * Create and add rules.
      * Will render also after Style Sheet was rendered the first time.
      */
    def addRules(styles: Partial[Styles[RuleName, Any, Unit]]): js.Array[Rule] = js.native
    def addRules(styles: Partial[Styles[RuleName, Any, Unit]], options: PartialRuleOptions): js.Array[Rule] = js.native
    
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
      * Get a rule by name or selector.
      */
    def getRule(nameOrSelector: RuleName): Rule = js.native
    def getRule(nameOrSelector: String): Rule = js.native
    
    /**
      * Get index of a rule.
      */
    def indexOf(rule: Rule): Double = js.native
    
    def insertRule(rule: Rule): Unit = js.native
    
    var keyframes: Keyframes[String] = js.native
    
    var linked: Boolean = js.native
    
    var options: StyleSheetOptions = js.native
    
    /**
      * Replace a rule in the current stylesheet.
      */
    def replaceRule(name: RuleName, style: JssStyle[Any, Unit]): js.Tuple2[Rule | Null, Rule | Null] = js.native
    def replaceRule(name: RuleName, style: JssStyle[Any, Unit], options: PartialRuleOptions): js.Tuple2[Rule | Null, Rule | Null] = js.native
    
    def toString(options: ToCssOptions): String = js.native
    
    def update(data: js.Object): this.type = js.native
    def update(data: js.Object, options: UpdateOptions): this.type = js.native
    /**
      * Update the function values with a new data.
      */
    def update(name: String, data: js.Object): this.type = js.native
    def update(name: String, data: js.Object, options: UpdateOptions): this.type = js.native
  }
  
  trait StyleSheetFactoryOptions extends StObject {
    
    var classNamePrefix: js.UndefOr[String] = js.undefined
    
    var element: js.UndefOr[HTMLStyleElement] = js.undefined
    
    var generateId: js.UndefOr[GenerateId] = js.undefined
    
    var index: js.UndefOr[Double] = js.undefined
    
    var link: js.UndefOr[Boolean] = js.undefined
    
    var media: js.UndefOr[String] = js.undefined
    
    var meta: js.UndefOr[String] = js.undefined
  }
  object StyleSheetFactoryOptions {
    
    inline def apply(): StyleSheetFactoryOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[StyleSheetFactoryOptions]
    }
    
    extension [Self <: StyleSheetFactoryOptions](x: Self) {
      
      inline def setClassNamePrefix(value: String): Self = StObject.set(x, "classNamePrefix", value.asInstanceOf[js.Any])
      
      inline def setClassNamePrefixUndefined: Self = StObject.set(x, "classNamePrefix", js.undefined)
      
      inline def setElement(value: HTMLStyleElement): Self = StObject.set(x, "element", value.asInstanceOf[js.Any])
      
      inline def setElementUndefined: Self = StObject.set(x, "element", js.undefined)
      
      inline def setGenerateId(value: (/* rule */ Rule, /* sheet */ js.UndefOr[StyleSheet[String]]) => String): Self = StObject.set(x, "generateId", js.Any.fromFunction2(value))
      
      inline def setGenerateIdUndefined: Self = StObject.set(x, "generateId", js.undefined)
      
      inline def setIndex(value: Double): Self = StObject.set(x, "index", value.asInstanceOf[js.Any])
      
      inline def setIndexUndefined: Self = StObject.set(x, "index", js.undefined)
      
      inline def setLink(value: Boolean): Self = StObject.set(x, "link", value.asInstanceOf[js.Any])
      
      inline def setLinkUndefined: Self = StObject.set(x, "link", js.undefined)
      
      inline def setMedia(value: String): Self = StObject.set(x, "media", value.asInstanceOf[js.Any])
      
      inline def setMediaUndefined: Self = StObject.set(x, "media", js.undefined)
      
      inline def setMeta(value: String): Self = StObject.set(x, "meta", value.asInstanceOf[js.Any])
      
      inline def setMetaUndefined: Self = StObject.set(x, "meta", js.undefined)
    }
  }
  
  trait StyleSheetOptions
    extends StObject
       with StyleSheetFactoryOptions {
    
    var Renderer: typings.jss.mod.Renderer
    
    @JSName("generateId")
    def generateId_MStyleSheetOptions(rule: Rule): String
    @JSName("generateId")
    def generateId_MStyleSheetOptions(rule: Rule, sheet: StyleSheet[String]): String
    @JSName("generateId")
    var generateId_Original: GenerateId
    
    @JSName("index")
    var index_StyleSheetOptions: Double
    
    var insertionPoint: js.UndefOr[InsertionPoint] = js.undefined
    
    var jss: Jss
  }
  object StyleSheetOptions {
    
    inline def apply(
      Renderer: Renderer,
      generateId: (/* rule */ Rule, /* sheet */ js.UndefOr[StyleSheet[String]]) => String,
      index: Double,
      jss: Jss
    ): StyleSheetOptions = {
      val __obj = js.Dynamic.literal(Renderer = Renderer.asInstanceOf[js.Any], generateId = js.Any.fromFunction2(generateId), index = index.asInstanceOf[js.Any], jss = jss.asInstanceOf[js.Any])
      __obj.asInstanceOf[StyleSheetOptions]
    }
    
    extension [Self <: StyleSheetOptions](x: Self) {
      
      inline def setGenerateId(value: (/* rule */ Rule, /* sheet */ js.UndefOr[StyleSheet[String]]) => String): Self = StObject.set(x, "generateId", js.Any.fromFunction2(value))
      
      inline def setIndex(value: Double): Self = StObject.set(x, "index", value.asInstanceOf[js.Any])
      
      inline def setInsertionPoint(value: InsertionPoint): Self = StObject.set(x, "insertionPoint", value.asInstanceOf[js.Any])
      
      inline def setInsertionPointUndefined: Self = StObject.set(x, "insertionPoint", js.undefined)
      
      inline def setJss(value: Jss): Self = StObject.set(x, "jss", value.asInstanceOf[js.Any])
      
      inline def setRenderer(value: Renderer): Self = StObject.set(x, "Renderer", value.asInstanceOf[js.Any])
    }
  }
  
  /** 
  NOTE: Rewritten from type alias:
  {{{
  type Styles = std.Record<Name, jss.jss.JssStyle<Props, Theme> | std.Array<jss.jss.JssStyle<Props, Theme>> | string | jss.jss.Func<Props, Theme, jss.jss.JssStyle<undefined, undefined> | string | null | undefined> | jss.jss.MinimalObservable<jss.jss.JssStyle<any, undefined> | string | null | undefined>>
  }}}
  to avoid circular code involving: 
  - jss.jss.JssStyle
  - jss.jss.Styles
  */
  @js.native
  trait Styles[Name /* <: String | Double | js.Symbol */, Props, Theme] extends StObject
  
  trait ToCssOptions extends StObject {
    
    var allowEmpty: js.UndefOr[Boolean] = js.undefined
    
    var format: js.UndefOr[Boolean] = js.undefined
    
    var indent: js.UndefOr[Double] = js.undefined
  }
  object ToCssOptions {
    
    inline def apply(): ToCssOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ToCssOptions]
    }
    
    extension [Self <: ToCssOptions](x: Self) {
      
      inline def setAllowEmpty(value: Boolean): Self = StObject.set(x, "allowEmpty", value.asInstanceOf[js.Any])
      
      inline def setAllowEmptyUndefined: Self = StObject.set(x, "allowEmpty", js.undefined)
      
      inline def setFormat(value: Boolean): Self = StObject.set(x, "format", value.asInstanceOf[js.Any])
      
      inline def setFormatUndefined: Self = StObject.set(x, "format", js.undefined)
      
      inline def setIndent(value: Double): Self = StObject.set(x, "indent", value.asInstanceOf[js.Any])
      
      inline def setIndentUndefined: Self = StObject.set(x, "indent", js.undefined)
    }
  }
  
  trait UpdateOptions extends StObject {
    
    var force: js.UndefOr[Boolean] = js.undefined
    
    var process: js.UndefOr[Boolean] = js.undefined
  }
  object UpdateOptions {
    
    inline def apply(): UpdateOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[UpdateOptions]
    }
    
    extension [Self <: UpdateOptions](x: Self) {
      
      inline def setForce(value: Boolean): Self = StObject.set(x, "force", value.asInstanceOf[js.Any])
      
      inline def setForceUndefined: Self = StObject.set(x, "force", js.undefined)
      
      inline def setProcess(value: Boolean): Self = StObject.set(x, "process", value.asInstanceOf[js.Any])
      
      inline def setProcessUndefined: Self = StObject.set(x, "process", js.undefined)
    }
  }
}
