package typings.idyllDocument

import typings.idyllCompiler.mod.AST
import typings.idyllCompiler.mod.Node
import typings.idyllCompiler.mod.Options
import typings.idyllDocument.anon.Children
import typings.react.mod.ElementType
import typings.react.mod.PureComponent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("idyll-document", JSImport.Default)
  @js.native
  open class default () extends PureComponent[IdyllDocumentProps, Any, Any]
  
  type IdyllDocument = PureComponent[IdyllDocumentProps, Any, Any]
  
  trait IdyllDocumentProps extends StObject {
    
    /**
      * the AST to be rendered on the page
      * If provided, this will be used insteaed of
      * the markup
      */
    var ast: js.UndefOr[AST] = js.undefined
    
    /**
      * Compiler option for Idyll compiler when compiling markup
      */
    var compilerOptions: js.UndefOr[Options] = js.undefined
    
    /**
      * Components to be rendered with
      */
    var components: Any
    
    var context: js.UndefOr[js.Function1[/* context */ Any, Unit]] = js.undefined
    
    /**
      * Initial data set
      */
    var datasets: js.UndefOr[js.Object] = js.undefined
    
    /**
      * The React component rendered when an error occurs
      */
    var errorComponent: js.UndefOr[ElementType[Children]] = js.undefined
    
    var initialState: js.UndefOr[Any] = js.undefined
    
    /**
      * The layout for idyll document
      * Will correspond to one one layout in idyll-layouts package
      */
    var layout: js.UndefOr[String] = js.undefined
    
    /**
      * The Idyll markup to be compiled into AST
      */
    var markup: js.UndefOr[String] = js.undefined
    
    /**
      * Callback function if error happens during compilation
      */
    var onError: js.UndefOr[js.Function1[/* err */ js.Error, Unit]] = js.undefined
    
    /**
      * The theme for idyll document
      * Will correspond to one theme in idyll-theme package
      */
    var theme: js.UndefOr[String] = js.undefined
  }
  object IdyllDocumentProps {
    
    inline def apply(components: Any): IdyllDocumentProps = {
      val __obj = js.Dynamic.literal(components = components.asInstanceOf[js.Any])
      __obj.asInstanceOf[IdyllDocumentProps]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: IdyllDocumentProps] (val x: Self) extends AnyVal {
      
      inline def setAst(value: AST): Self = StObject.set(x, "ast", value.asInstanceOf[js.Any])
      
      inline def setAstUndefined: Self = StObject.set(x, "ast", js.undefined)
      
      inline def setAstVarargs(value: Node*): Self = StObject.set(x, "ast", js.Array(value*))
      
      inline def setCompilerOptions(value: Options): Self = StObject.set(x, "compilerOptions", value.asInstanceOf[js.Any])
      
      inline def setCompilerOptionsUndefined: Self = StObject.set(x, "compilerOptions", js.undefined)
      
      inline def setComponents(value: Any): Self = StObject.set(x, "components", value.asInstanceOf[js.Any])
      
      inline def setContext(value: /* context */ Any => Unit): Self = StObject.set(x, "context", js.Any.fromFunction1(value))
      
      inline def setContextUndefined: Self = StObject.set(x, "context", js.undefined)
      
      inline def setDatasets(value: js.Object): Self = StObject.set(x, "datasets", value.asInstanceOf[js.Any])
      
      inline def setDatasetsUndefined: Self = StObject.set(x, "datasets", js.undefined)
      
      inline def setErrorComponent(value: ElementType[Children]): Self = StObject.set(x, "errorComponent", value.asInstanceOf[js.Any])
      
      inline def setErrorComponentUndefined: Self = StObject.set(x, "errorComponent", js.undefined)
      
      inline def setInitialState(value: Any): Self = StObject.set(x, "initialState", value.asInstanceOf[js.Any])
      
      inline def setInitialStateUndefined: Self = StObject.set(x, "initialState", js.undefined)
      
      inline def setLayout(value: String): Self = StObject.set(x, "layout", value.asInstanceOf[js.Any])
      
      inline def setLayoutUndefined: Self = StObject.set(x, "layout", js.undefined)
      
      inline def setMarkup(value: String): Self = StObject.set(x, "markup", value.asInstanceOf[js.Any])
      
      inline def setMarkupUndefined: Self = StObject.set(x, "markup", js.undefined)
      
      inline def setOnError(value: /* err */ js.Error => Unit): Self = StObject.set(x, "onError", js.Any.fromFunction1(value))
      
      inline def setOnErrorUndefined: Self = StObject.set(x, "onError", js.undefined)
      
      inline def setTheme(value: String): Self = StObject.set(x, "theme", value.asInstanceOf[js.Any])
      
      inline def setThemeUndefined: Self = StObject.set(x, "theme", js.undefined)
    }
  }
}
