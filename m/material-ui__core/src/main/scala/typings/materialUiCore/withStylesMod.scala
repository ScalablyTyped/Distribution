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
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object withStylesMod {
  
  @JSImport("@material-ui/core/styles/withStyles", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default[ClassKey /* <: String */, Options /* <: WithStylesOptions[ClassKey] */](style: StyleRules[ClassKey]): PropInjector[
    WithStyles[
      ClassKey, 
      /* import warning: importer.ImportType#apply Failed type conversion: Options['withTheme'] */ js.Any
    ], 
    StyledComponentProps[ClassKey]
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(style.asInstanceOf[js.Any]).asInstanceOf[PropInjector[
    WithStyles[
      ClassKey, 
      /* import warning: importer.ImportType#apply Failed type conversion: Options['withTheme'] */ js.Any
    ], 
    StyledComponentProps[ClassKey]
  ]]
  inline def default[ClassKey /* <: String */, Options /* <: WithStylesOptions[ClassKey] */](style: StyleRulesCallback[ClassKey]): PropInjector[
    WithStyles[
      ClassKey, 
      /* import warning: importer.ImportType#apply Failed type conversion: Options['withTheme'] */ js.Any
    ], 
    StyledComponentProps[ClassKey]
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(style.asInstanceOf[js.Any]).asInstanceOf[PropInjector[
    WithStyles[
      ClassKey, 
      /* import warning: importer.ImportType#apply Failed type conversion: Options['withTheme'] */ js.Any
    ], 
    StyledComponentProps[ClassKey]
  ]]
  inline def default[ClassKey /* <: String */, Options /* <: WithStylesOptions[ClassKey] */](style: StyleRulesCallback[ClassKey], options: Options): PropInjector[
    WithStyles[
      ClassKey, 
      /* import warning: importer.ImportType#apply Failed type conversion: Options['withTheme'] */ js.Any
    ], 
    StyledComponentProps[ClassKey]
  ] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(style.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[PropInjector[
    WithStyles[
      ClassKey, 
      /* import warning: importer.ImportType#apply Failed type conversion: Options['withTheme'] */ js.Any
    ], 
    StyledComponentProps[ClassKey]
  ]]
  inline def default[ClassKey /* <: String */, Options /* <: WithStylesOptions[ClassKey] */](style: StyleRules[ClassKey], options: Options): PropInjector[
    WithStyles[
      ClassKey, 
      /* import warning: importer.ImportType#apply Failed type conversion: Options['withTheme'] */ js.Any
    ], 
    StyledComponentProps[ClassKey]
  ] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(style.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[PropInjector[
    WithStyles[
      ClassKey, 
      /* import warning: importer.ImportType#apply Failed type conversion: Options['withTheme'] */ js.Any
    ], 
    StyledComponentProps[ClassKey]
  ]]
  
  trait CSSProperties
    extends StObject
       with Properties[Double | String]
       with // Allow pseudo selectors and media queries
  /* k */ StringDictionary[
          js.UndefOr[
            /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 508 */ js.Any
          ]
        ]
  object CSSProperties {
    
    inline def apply(): CSSProperties = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[CSSProperties]
    }
  }
  
  type ClassNameMap[ClassKey /* <: String */] = Record[ClassKey, String]
  
  type StyleRules[ClassKey /* <: String */] = Record[ClassKey, CSSProperties]
  
  type StyleRulesCallback[ClassKey /* <: String */] = js.Function1[/* theme */ Theme, StyleRules[ClassKey]]
  
  trait StyledComponentProps[ClassKey /* <: String */] extends StObject {
    
    var classes: js.UndefOr[Partial[ClassNameMap[ClassKey]]] = js.undefined
    
    var innerRef: js.UndefOr[Ref[js.Any] | RefObject[js.Any]] = js.undefined
  }
  object StyledComponentProps {
    
    inline def apply[ClassKey /* <: String */](): StyledComponentProps[ClassKey] = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[StyledComponentProps[ClassKey]]
    }
    
    extension [Self <: StyledComponentProps[?], ClassKey /* <: String */](x: Self & StyledComponentProps[ClassKey]) {
      
      inline def setClasses(value: Partial[ClassNameMap[ClassKey]]): Self = StObject.set(x, "classes", value.asInstanceOf[js.Any])
      
      inline def setClassesUndefined: Self = StObject.set(x, "classes", js.undefined)
      
      inline def setInnerRef(value: Ref[js.Any] | RefObject[js.Any]): Self = StObject.set(x, "innerRef", value.asInstanceOf[js.Any])
      
      inline def setInnerRefFunction1(value: /* instance */ js.Any | Null => Unit): Self = StObject.set(x, "innerRef", js.Any.fromFunction1(value))
      
      inline def setInnerRefNull: Self = StObject.set(x, "innerRef", null)
      
      inline def setInnerRefUndefined: Self = StObject.set(x, "innerRef", js.undefined)
    }
  }
  
  trait StylesCreator extends StObject {
    
    def create(theme: Theme, name: String): StyleRules[String]
    
    var options: Index
    
    var themingEnabled: Boolean
  }
  object StylesCreator {
    
    inline def apply(create: (Theme, String) => StyleRules[String], options: Index, themingEnabled: Boolean): StylesCreator = {
      val __obj = js.Dynamic.literal(create = js.Any.fromFunction2(create), options = options.asInstanceOf[js.Any], themingEnabled = themingEnabled.asInstanceOf[js.Any])
      __obj.asInstanceOf[StylesCreator]
    }
    
    extension [Self <: StylesCreator](x: Self) {
      
      inline def setCreate(value: (Theme, String) => StyleRules[String]): Self = StObject.set(x, "create", js.Any.fromFunction2(value))
      
      inline def setOptions(value: Index): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
      
      inline def setThemingEnabled(value: Boolean): Self = StObject.set(x, "themingEnabled", value.asInstanceOf[js.Any])
    }
  }
  
  type WithStyles[T /* <: String | StyleRules[String] | StyleRulesCallback[String] */, IncludeTheme /* <: js.UndefOr[Boolean] */] = (js.Object | typings.materialUiCore.anon.Theme) & Classes[T]
  
  /* import warning: RemoveDifficultInheritance.summarizeChanges 
  - Dropped / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify JSS.CreateStyleSheetOptions<ClassKey> * / any */ trait WithStylesOptions[ClassKey /* <: String */] extends StObject {
    
    var flip: js.UndefOr[Boolean] = js.undefined
    
    var name: js.UndefOr[String] = js.undefined
    
    var withTheme: js.UndefOr[Boolean] = js.undefined
  }
  object WithStylesOptions {
    
    inline def apply[ClassKey /* <: String */](): WithStylesOptions[ClassKey] = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[WithStylesOptions[ClassKey]]
    }
    
    extension [Self <: WithStylesOptions[?], ClassKey /* <: String */](x: Self & WithStylesOptions[ClassKey]) {
      
      inline def setFlip(value: Boolean): Self = StObject.set(x, "flip", value.asInstanceOf[js.Any])
      
      inline def setFlipUndefined: Self = StObject.set(x, "flip", js.undefined)
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
      
      inline def setWithTheme(value: Boolean): Self = StObject.set(x, "withTheme", value.asInstanceOf[js.Any])
      
      inline def setWithThemeUndefined: Self = StObject.set(x, "withTheme", js.undefined)
    }
  }
}
