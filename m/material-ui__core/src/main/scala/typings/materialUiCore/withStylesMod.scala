package typings.materialUiCore

import org.scalablytyped.runtime.StringDictionary
import typings.csstype.mod.Properties
import typings.materialUiCore.anon.Classes
import typings.materialUiCore.anon.Index
import typings.materialUiCore.createMuiThemeMod.Theme
import typings.materialUiCore.mod.PropInjector
import typings.react.mod.Ref
import typings.react.mod.RefObject
import typings.std.Partial
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object withStylesMod {
  
  @JSImport("@material-ui/core/styles/withStyles", JSImport.Default)
  @js.native
  def default[ClassKey /* <: String */, Options /* <: WithStylesOptions[ClassKey] */](style: StyleRules[ClassKey]): PropInjector[
    WithStyles[
      ClassKey, 
      /* import warning: importer.ImportType#apply Failed type conversion: Options['withTheme'] */ js.Any
    ], 
    StyledComponentProps[ClassKey]
  ] = js.native
  @JSImport("@material-ui/core/styles/withStyles", JSImport.Default)
  @js.native
  def default[ClassKey /* <: String */, Options /* <: WithStylesOptions[ClassKey] */](style: StyleRulesCallback[ClassKey]): PropInjector[
    WithStyles[
      ClassKey, 
      /* import warning: importer.ImportType#apply Failed type conversion: Options['withTheme'] */ js.Any
    ], 
    StyledComponentProps[ClassKey]
  ] = js.native
  @JSImport("@material-ui/core/styles/withStyles", JSImport.Default)
  @js.native
  def default[ClassKey /* <: String */, Options /* <: WithStylesOptions[ClassKey] */](style: StyleRulesCallback[ClassKey], options: Options): PropInjector[
    WithStyles[
      ClassKey, 
      /* import warning: importer.ImportType#apply Failed type conversion: Options['withTheme'] */ js.Any
    ], 
    StyledComponentProps[ClassKey]
  ] = js.native
  @JSImport("@material-ui/core/styles/withStyles", JSImport.Default)
  @js.native
  def default[ClassKey /* <: String */, Options /* <: WithStylesOptions[ClassKey] */](style: StyleRules[ClassKey], options: Options): PropInjector[
    WithStyles[
      ClassKey, 
      /* import warning: importer.ImportType#apply Failed type conversion: Options['withTheme'] */ js.Any
    ], 
    StyledComponentProps[ClassKey]
  ] = js.native
  
  @js.native
  trait CSSProperties
    extends Properties[Double | String]
       with // Allow pseudo selectors and media queries
  /* k */ StringDictionary[
          js.UndefOr[
            /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 508 */ js.Any
          ]
        ]
  object CSSProperties {
    
    @scala.inline
    def apply(): CSSProperties = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[CSSProperties]
    }
  }
  
  type ClassNameMap[ClassKey /* <: String */] = Record[ClassKey, String]
  
  type StyleRules[ClassKey /* <: String */] = Record[ClassKey, CSSProperties]
  
  type StyleRulesCallback[ClassKey /* <: String */] = js.Function1[/* theme */ Theme, StyleRules[ClassKey]]
  
  @js.native
  trait StyledComponentProps[ClassKey /* <: String */] extends StObject {
    
    var classes: js.UndefOr[Partial[ClassNameMap[ClassKey]]] = js.native
    
    var innerRef: js.UndefOr[Ref[_] | RefObject[_]] = js.native
  }
  object StyledComponentProps {
    
    @scala.inline
    def apply[ClassKey /* <: String */](): StyledComponentProps[ClassKey] = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[StyledComponentProps[ClassKey]]
    }
    
    @scala.inline
    implicit class StyledComponentPropsMutableBuilder[Self <: StyledComponentProps[_], ClassKey /* <: String */] (val x: Self with StyledComponentProps[ClassKey]) extends AnyVal {
      
      @scala.inline
      def setClasses(value: Partial[ClassNameMap[ClassKey]]): Self = StObject.set(x, "classes", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setClassesUndefined: Self = StObject.set(x, "classes", js.undefined)
      
      @scala.inline
      def setInnerRef(value: Ref[_] | RefObject[_]): Self = StObject.set(x, "innerRef", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setInnerRefFunction1(value: /* instance */ _ | Null => Unit): Self = StObject.set(x, "innerRef", js.Any.fromFunction1(value))
      
      @scala.inline
      def setInnerRefNull: Self = StObject.set(x, "innerRef", null)
      
      @scala.inline
      def setInnerRefUndefined: Self = StObject.set(x, "innerRef", js.undefined)
    }
  }
  
  @js.native
  trait StylesCreator extends StObject {
    
    def create(theme: Theme, name: String): StyleRules[String] = js.native
    
    var options: Index = js.native
    
    var themingEnabled: Boolean = js.native
  }
  object StylesCreator {
    
    @scala.inline
    def apply(create: (Theme, String) => StyleRules[String], options: Index, themingEnabled: Boolean): StylesCreator = {
      val __obj = js.Dynamic.literal(create = js.Any.fromFunction2(create), options = options.asInstanceOf[js.Any], themingEnabled = themingEnabled.asInstanceOf[js.Any])
      __obj.asInstanceOf[StylesCreator]
    }
    
    @scala.inline
    implicit class StylesCreatorMutableBuilder[Self <: StylesCreator] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCreate(value: (Theme, String) => StyleRules[String]): Self = StObject.set(x, "create", js.Any.fromFunction2(value))
      
      @scala.inline
      def setOptions(value: Index): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setThemingEnabled(value: Boolean): Self = StObject.set(x, "themingEnabled", value.asInstanceOf[js.Any])
    }
  }
  
  type WithStyles[T /* <: String | StyleRules[String] | StyleRulesCallback[String] */, IncludeTheme /* <: js.UndefOr[Boolean] */] = (js.Object | typings.materialUiCore.anon.Theme) with Classes[T]
  
  /* import warning: RemoveDifficultInheritance.summarizeChanges 
  - Dropped / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify JSS.CreateStyleSheetOptions<ClassKey> * / any */ @js.native
  trait WithStylesOptions[ClassKey /* <: String */] extends StObject {
    
    var flip: js.UndefOr[Boolean] = js.native
    
    var name: js.UndefOr[String] = js.native
    
    var withTheme: js.UndefOr[Boolean] = js.native
  }
  object WithStylesOptions {
    
    @scala.inline
    def apply[ClassKey /* <: String */](): WithStylesOptions[ClassKey] = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[WithStylesOptions[ClassKey]]
    }
    
    @scala.inline
    implicit class WithStylesOptionsMutableBuilder[Self <: WithStylesOptions[_], ClassKey /* <: String */] (val x: Self with WithStylesOptions[ClassKey]) extends AnyVal {
      
      @scala.inline
      def setFlip(value: Boolean): Self = StObject.set(x, "flip", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFlipUndefined: Self = StObject.set(x, "flip", js.undefined)
      
      @scala.inline
      def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
      
      @scala.inline
      def setWithTheme(value: Boolean): Self = StObject.set(x, "withTheme", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWithThemeUndefined: Self = StObject.set(x, "withTheme", js.undefined)
    }
  }
}
