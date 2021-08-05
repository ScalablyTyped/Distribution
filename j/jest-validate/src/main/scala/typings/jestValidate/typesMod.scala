package typings.jestValidate

import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesMod {
  
  type DeprecatedOptionFunc = js.Function1[/* arg */ Record[String, js.Any], String]
  
  type DeprecatedOptions = Record[String, DeprecatedOptionFunc]
  
  trait Title extends StObject {
    
    var deprecation: js.UndefOr[String] = js.undefined
    
    var error: js.UndefOr[String] = js.undefined
    
    var warning: js.UndefOr[String] = js.undefined
  }
  object Title {
    
    inline def apply(): Title = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Title]
    }
    
    extension [Self <: Title](x: Self) {
      
      inline def setDeprecation(value: String): Self = StObject.set(x, "deprecation", value.asInstanceOf[js.Any])
      
      inline def setDeprecationUndefined: Self = StObject.set(x, "deprecation", js.undefined)
      
      inline def setError(value: String): Self = StObject.set(x, "error", value.asInstanceOf[js.Any])
      
      inline def setErrorUndefined: Self = StObject.set(x, "error", js.undefined)
      
      inline def setWarning(value: String): Self = StObject.set(x, "warning", value.asInstanceOf[js.Any])
      
      inline def setWarningUndefined: Self = StObject.set(x, "warning", js.undefined)
    }
  }
  
  trait ValidationOptions extends StObject {
    
    var comment: js.UndefOr[String] = js.undefined
    
    var condition: js.UndefOr[js.Function2[/* option */ js.Any, /* validOption */ js.Any, Boolean]] = js.undefined
    
    var deprecate: js.UndefOr[
        js.Function4[
          /* config */ Record[String, js.Any], 
          /* option */ String, 
          /* deprecatedOptions */ DeprecatedOptions, 
          /* options */ this.type, 
          Boolean
        ]
      ] = js.undefined
    
    var deprecatedConfig: js.UndefOr[DeprecatedOptions] = js.undefined
    
    var error: js.UndefOr[
        js.Function5[
          /* option */ String, 
          /* received */ js.Any, 
          /* defaultValue */ js.Any, 
          /* options */ this.type, 
          /* path */ js.UndefOr[js.Array[String]], 
          Unit
        ]
      ] = js.undefined
    
    var exampleConfig: Record[String, js.Any]
    
    var recursive: js.UndefOr[Boolean] = js.undefined
    
    var recursiveBlacklist: js.UndefOr[js.Array[String]] = js.undefined
    
    var recursiveDenylist: js.UndefOr[js.Array[String]] = js.undefined
    
    var title: js.UndefOr[Title] = js.undefined
    
    var unknown: js.UndefOr[
        js.Function5[
          /* config */ Record[String, js.Any], 
          /* exampleConfig */ Record[String, js.Any], 
          /* option */ String, 
          /* options */ this.type, 
          /* path */ js.UndefOr[js.Array[String]], 
          Unit
        ]
      ] = js.undefined
  }
  object ValidationOptions {
    
    inline def apply(exampleConfig: Record[String, js.Any]): ValidationOptions = {
      val __obj = js.Dynamic.literal(exampleConfig = exampleConfig.asInstanceOf[js.Any])
      __obj.asInstanceOf[ValidationOptions]
    }
    
    extension [Self <: ValidationOptions](x: Self) {
      
      inline def setComment(value: String): Self = StObject.set(x, "comment", value.asInstanceOf[js.Any])
      
      inline def setCommentUndefined: Self = StObject.set(x, "comment", js.undefined)
      
      inline def setCondition(value: (/* option */ js.Any, /* validOption */ js.Any) => Boolean): Self = StObject.set(x, "condition", js.Any.fromFunction2(value))
      
      inline def setConditionUndefined: Self = StObject.set(x, "condition", js.undefined)
      
      inline def setDeprecate(
        value: (/* config */ Record[String, js.Any], /* option */ String, /* deprecatedOptions */ DeprecatedOptions, ValidationOptions) => Boolean
      ): Self = StObject.set(x, "deprecate", js.Any.fromFunction4(value))
      
      inline def setDeprecateUndefined: Self = StObject.set(x, "deprecate", js.undefined)
      
      inline def setDeprecatedConfig(value: DeprecatedOptions): Self = StObject.set(x, "deprecatedConfig", value.asInstanceOf[js.Any])
      
      inline def setDeprecatedConfigUndefined: Self = StObject.set(x, "deprecatedConfig", js.undefined)
      
      inline def setError(
        value: (/* option */ String, /* received */ js.Any, /* defaultValue */ js.Any, ValidationOptions, /* path */ js.UndefOr[js.Array[String]]) => Unit
      ): Self = StObject.set(x, "error", js.Any.fromFunction5(value))
      
      inline def setErrorUndefined: Self = StObject.set(x, "error", js.undefined)
      
      inline def setExampleConfig(value: Record[String, js.Any]): Self = StObject.set(x, "exampleConfig", value.asInstanceOf[js.Any])
      
      inline def setRecursive(value: Boolean): Self = StObject.set(x, "recursive", value.asInstanceOf[js.Any])
      
      inline def setRecursiveBlacklist(value: js.Array[String]): Self = StObject.set(x, "recursiveBlacklist", value.asInstanceOf[js.Any])
      
      inline def setRecursiveBlacklistUndefined: Self = StObject.set(x, "recursiveBlacklist", js.undefined)
      
      inline def setRecursiveBlacklistVarargs(value: String*): Self = StObject.set(x, "recursiveBlacklist", js.Array(value :_*))
      
      inline def setRecursiveDenylist(value: js.Array[String]): Self = StObject.set(x, "recursiveDenylist", value.asInstanceOf[js.Any])
      
      inline def setRecursiveDenylistUndefined: Self = StObject.set(x, "recursiveDenylist", js.undefined)
      
      inline def setRecursiveDenylistVarargs(value: String*): Self = StObject.set(x, "recursiveDenylist", js.Array(value :_*))
      
      inline def setRecursiveUndefined: Self = StObject.set(x, "recursive", js.undefined)
      
      inline def setTitle(value: Title): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
      
      inline def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
      
      inline def setUnknown(
        value: (/* config */ Record[String, js.Any], /* exampleConfig */ Record[String, js.Any], /* option */ String, ValidationOptions, /* path */ js.UndefOr[js.Array[String]]) => Unit
      ): Self = StObject.set(x, "unknown", js.Any.fromFunction5(value))
      
      inline def setUnknownUndefined: Self = StObject.set(x, "unknown", js.undefined)
    }
  }
}
