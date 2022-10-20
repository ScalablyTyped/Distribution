package typings.jestValidate

import typings.jestTypes.mod.Argv
import typings.jestValidate.anon.DeprecationEntries
import typings.jestValidate.anon.HasDeprecationWarnings
import typings.std.Error
import typings.std.Record
import typings.yargs.mod.Options
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("jest-validate", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("jest-validate", "ValidationError")
  @js.native
  open class ValidationError protected ()
    extends StObject
       with Error {
    def this(name: String, message: String) = this()
    def this(name: String, message: String, comment: String) = this()
    
    /* standard es5 */
    /* CompleteClass */
    var message: String = js.native
    
    /* standard es5 */
    /* CompleteClass */
    var name: String = js.native
  }
  
  inline def createDidYouMeanMessage(unrecognized: String, allowedOptions: js.Array[String]): String = (^.asInstanceOf[js.Dynamic].applyDynamic("createDidYouMeanMessage")(unrecognized.asInstanceOf[js.Any], allowedOptions.asInstanceOf[js.Any])).asInstanceOf[String]
  
  inline def format(value: Any): String = ^.asInstanceOf[js.Dynamic].applyDynamic("format")(value.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def logValidationWarning(name: String, message: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("logValidationWarning")(name.asInstanceOf[js.Any], message.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def logValidationWarning(name: String, message: String, comment: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("logValidationWarning")(name.asInstanceOf[js.Any], message.asInstanceOf[js.Any], comment.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def multipleValidOptions[T /* <: js.Array[Any] */](
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type T is not an array type */ args: T
  ): /* import warning: importer.ImportType#apply Failed type conversion: T[number] */ js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("multipleValidOptions")(args.asInstanceOf[js.Any]).asInstanceOf[/* import warning: importer.ImportType#apply Failed type conversion: T[number] */ js.Any]
  
  inline def validate(config: Record[String, Any], options: ValidationOptions): HasDeprecationWarnings = (^.asInstanceOf[js.Dynamic].applyDynamic("validate")(config.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[HasDeprecationWarnings]
  
  inline def validateCLIOptions(argv: Argv): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("validateCLIOptions")(argv.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  inline def validateCLIOptions(argv: Argv, options: (Record[String, Options]) & DeprecationEntries): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("validateCLIOptions")(argv.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  inline def validateCLIOptions(argv: Argv, options: (Record[String, Options]) & DeprecationEntries, rawArgv: js.Array[String]): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("validateCLIOptions")(argv.asInstanceOf[js.Any], options.asInstanceOf[js.Any], rawArgv.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  inline def validateCLIOptions(argv: Argv, options: Unit, rawArgv: js.Array[String]): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("validateCLIOptions")(argv.asInstanceOf[js.Any], options.asInstanceOf[js.Any], rawArgv.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  type DeprecatedOptionFunc = js.Function1[/* arg */ Record[String, Any], String]
  
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
    
    var condition: js.UndefOr[js.Function2[/* option */ Any, /* validOption */ Any, Boolean]] = js.undefined
    
    var deprecate: js.UndefOr[
        js.Function4[
          /* config */ Record[String, Any], 
          /* option */ String, 
          /* deprecatedOptions */ DeprecatedOptions, 
          /* options */ ValidationOptions, 
          Boolean
        ]
      ] = js.undefined
    
    var deprecatedConfig: js.UndefOr[DeprecatedOptions] = js.undefined
    
    var error: js.UndefOr[
        js.Function5[
          /* option */ String, 
          /* received */ Any, 
          /* defaultValue */ Any, 
          /* options */ ValidationOptions, 
          /* path */ js.UndefOr[js.Array[String]], 
          Unit
        ]
      ] = js.undefined
    
    var exampleConfig: Record[String, Any]
    
    var recursive: js.UndefOr[Boolean] = js.undefined
    
    var recursiveDenylist: js.UndefOr[js.Array[String]] = js.undefined
    
    var title: js.UndefOr[Title] = js.undefined
    
    var unknown: js.UndefOr[
        js.Function5[
          /* config */ Record[String, Any], 
          /* exampleConfig */ Record[String, Any], 
          /* option */ String, 
          /* options */ ValidationOptions, 
          /* path */ js.UndefOr[js.Array[String]], 
          Unit
        ]
      ] = js.undefined
  }
  object ValidationOptions {
    
    inline def apply(exampleConfig: Record[String, Any]): ValidationOptions = {
      val __obj = js.Dynamic.literal(exampleConfig = exampleConfig.asInstanceOf[js.Any])
      __obj.asInstanceOf[ValidationOptions]
    }
    
    extension [Self <: ValidationOptions](x: Self) {
      
      inline def setComment(value: String): Self = StObject.set(x, "comment", value.asInstanceOf[js.Any])
      
      inline def setCommentUndefined: Self = StObject.set(x, "comment", js.undefined)
      
      inline def setCondition(value: (/* option */ Any, /* validOption */ Any) => Boolean): Self = StObject.set(x, "condition", js.Any.fromFunction2(value))
      
      inline def setConditionUndefined: Self = StObject.set(x, "condition", js.undefined)
      
      inline def setDeprecate(
        value: (/* config */ Record[String, Any], /* option */ String, /* deprecatedOptions */ DeprecatedOptions, /* options */ ValidationOptions) => Boolean
      ): Self = StObject.set(x, "deprecate", js.Any.fromFunction4(value))
      
      inline def setDeprecateUndefined: Self = StObject.set(x, "deprecate", js.undefined)
      
      inline def setDeprecatedConfig(value: DeprecatedOptions): Self = StObject.set(x, "deprecatedConfig", value.asInstanceOf[js.Any])
      
      inline def setDeprecatedConfigUndefined: Self = StObject.set(x, "deprecatedConfig", js.undefined)
      
      inline def setError(
        value: (/* option */ String, /* received */ Any, /* defaultValue */ Any, /* options */ ValidationOptions, /* path */ js.UndefOr[js.Array[String]]) => Unit
      ): Self = StObject.set(x, "error", js.Any.fromFunction5(value))
      
      inline def setErrorUndefined: Self = StObject.set(x, "error", js.undefined)
      
      inline def setExampleConfig(value: Record[String, Any]): Self = StObject.set(x, "exampleConfig", value.asInstanceOf[js.Any])
      
      inline def setRecursive(value: Boolean): Self = StObject.set(x, "recursive", value.asInstanceOf[js.Any])
      
      inline def setRecursiveDenylist(value: js.Array[String]): Self = StObject.set(x, "recursiveDenylist", value.asInstanceOf[js.Any])
      
      inline def setRecursiveDenylistUndefined: Self = StObject.set(x, "recursiveDenylist", js.undefined)
      
      inline def setRecursiveDenylistVarargs(value: String*): Self = StObject.set(x, "recursiveDenylist", js.Array(value*))
      
      inline def setRecursiveUndefined: Self = StObject.set(x, "recursive", js.undefined)
      
      inline def setTitle(value: Title): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
      
      inline def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
      
      inline def setUnknown(
        value: (/* config */ Record[String, Any], /* exampleConfig */ Record[String, Any], /* option */ String, /* options */ ValidationOptions, /* path */ js.UndefOr[js.Array[String]]) => Unit
      ): Self = StObject.set(x, "unknown", js.Any.fromFunction5(value))
      
      inline def setUnknownUndefined: Self = StObject.set(x, "unknown", js.undefined)
    }
  }
}
