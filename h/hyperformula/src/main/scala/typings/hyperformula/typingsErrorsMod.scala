package typings.hyperformula

import typings.hyperformula.typingsCellMod.SimpleCellAddress_
import typings.std.Error
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typingsErrorsMod {
  
  @JSImport("hyperformula/typings/errors", "AliasAlreadyExisting")
  @js.native
  open class AliasAlreadyExisting protected ()
    extends StObject
       with Error {
    def this(name: String, pluginName: String) = this()
    
    /* standard es5 */
    /* CompleteClass */
    var message: String = js.native
    
    /* standard es5 */
    /* CompleteClass */
    var name: String = js.native
  }
  
  @JSImport("hyperformula/typings/errors", "ConfigValueEmpty")
  @js.native
  open class ConfigValueEmpty protected ()
    extends StObject
       with Error {
    def this(paramName: String) = this()
    
    /* standard es5 */
    /* CompleteClass */
    var message: String = js.native
    
    /* standard es5 */
    /* CompleteClass */
    var name: String = js.native
  }
  
  @JSImport("hyperformula/typings/errors", "ConfigValueTooBigError")
  @js.native
  open class ConfigValueTooBigError protected ()
    extends StObject
       with Error {
    def this(paramName: String, maximum: Double) = this()
    
    /* standard es5 */
    /* CompleteClass */
    var message: String = js.native
    
    /* standard es5 */
    /* CompleteClass */
    var name: String = js.native
  }
  
  @JSImport("hyperformula/typings/errors", "ConfigValueTooSmallError")
  @js.native
  open class ConfigValueTooSmallError protected ()
    extends StObject
       with Error {
    def this(paramName: String, minimum: Double) = this()
    
    /* standard es5 */
    /* CompleteClass */
    var message: String = js.native
    
    /* standard es5 */
    /* CompleteClass */
    var name: String = js.native
  }
  
  @JSImport("hyperformula/typings/errors", "EvaluationSuspendedError")
  @js.native
  open class EvaluationSuspendedError ()
    extends StObject
       with Error {
    
    /* standard es5 */
    /* CompleteClass */
    var message: String = js.native
    
    /* standard es5 */
    /* CompleteClass */
    var name: String = js.native
  }
  
  @JSImport("hyperformula/typings/errors", "ExpectedOneOfValuesError")
  @js.native
  open class ExpectedOneOfValuesError protected ()
    extends StObject
       with Error {
    def this(values: String, paramName: String) = this()
    
    /* standard es5 */
    /* CompleteClass */
    var message: String = js.native
    
    /* standard es5 */
    /* CompleteClass */
    var name: String = js.native
  }
  
  @JSImport("hyperformula/typings/errors", "ExpectedValueOfTypeError")
  @js.native
  open class ExpectedValueOfTypeError protected ()
    extends StObject
       with Error {
    def this(expectedType: String, paramName: String) = this()
    
    /* standard es5 */
    /* CompleteClass */
    var message: String = js.native
    
    /* standard es5 */
    /* CompleteClass */
    var name: String = js.native
  }
  
  @JSImport("hyperformula/typings/errors", "FunctionPluginValidationError")
  @js.native
  open class FunctionPluginValidationError ()
    extends StObject
       with Error {
    
    /* standard es5 */
    /* CompleteClass */
    var message: String = js.native
    
    /* standard es5 */
    /* CompleteClass */
    var name: String = js.native
  }
  /* static members */
  object FunctionPluginValidationError {
    
    @JSImport("hyperformula/typings/errors", "FunctionPluginValidationError")
    @js.native
    val ^ : js.Any = js.native
    
    inline def functionMethodNotFound(functionName: String, pluginName: String): FunctionPluginValidationError = (^.asInstanceOf[js.Dynamic].applyDynamic("functionMethodNotFound")(functionName.asInstanceOf[js.Any], pluginName.asInstanceOf[js.Any])).asInstanceOf[FunctionPluginValidationError]
    
    inline def functionNotDeclaredInPlugin(functionId: String, pluginName: String): FunctionPluginValidationError = (^.asInstanceOf[js.Dynamic].applyDynamic("functionNotDeclaredInPlugin")(functionId.asInstanceOf[js.Any], pluginName.asInstanceOf[js.Any])).asInstanceOf[FunctionPluginValidationError]
  }
  
  @JSImport("hyperformula/typings/errors", "InvalidAddressError")
  @js.native
  open class InvalidAddressError protected ()
    extends StObject
       with Error {
    def this(address: SimpleCellAddress_) = this()
    
    /* standard es5 */
    /* CompleteClass */
    var message: String = js.native
    
    /* standard es5 */
    /* CompleteClass */
    var name: String = js.native
  }
  
  @JSImport("hyperformula/typings/errors", "InvalidArgumentsError")
  @js.native
  open class InvalidArgumentsError protected ()
    extends StObject
       with Error {
    def this(expectedArguments: String) = this()
    
    /* standard es5 */
    /* CompleteClass */
    var message: String = js.native
    
    /* standard es5 */
    /* CompleteClass */
    var name: String = js.native
  }
  
  @JSImport("hyperformula/typings/errors", "LanguageAlreadyRegisteredError")
  @js.native
  open class LanguageAlreadyRegisteredError ()
    extends StObject
       with Error {
    
    /* standard es5 */
    /* CompleteClass */
    var message: String = js.native
    
    /* standard es5 */
    /* CompleteClass */
    var name: String = js.native
  }
  
  @JSImport("hyperformula/typings/errors", "LanguageNotRegisteredError")
  @js.native
  open class LanguageNotRegisteredError ()
    extends StObject
       with Error {
    
    /* standard es5 */
    /* CompleteClass */
    var message: String = js.native
    
    /* standard es5 */
    /* CompleteClass */
    var name: String = js.native
  }
  
  @JSImport("hyperformula/typings/errors", "MissingTranslationError")
  @js.native
  open class MissingTranslationError protected ()
    extends StObject
       with Error {
    def this(key: String) = this()
    
    /* standard es5 */
    /* CompleteClass */
    var message: String = js.native
    
    /* standard es5 */
    /* CompleteClass */
    var name: String = js.native
  }
  
  @JSImport("hyperformula/typings/errors", "NamedExpressionDoesNotExistError")
  @js.native
  open class NamedExpressionDoesNotExistError protected ()
    extends StObject
       with Error {
    def this(expressionName: String) = this()
    
    /* standard es5 */
    /* CompleteClass */
    var message: String = js.native
    
    /* standard es5 */
    /* CompleteClass */
    var name: String = js.native
  }
  
  @JSImport("hyperformula/typings/errors", "NamedExpressionNameIsAlreadyTakenError")
  @js.native
  open class NamedExpressionNameIsAlreadyTakenError protected ()
    extends StObject
       with Error {
    def this(expressionName: String) = this()
    
    /* standard es5 */
    /* CompleteClass */
    var message: String = js.native
    
    /* standard es5 */
    /* CompleteClass */
    var name: String = js.native
  }
  
  @JSImport("hyperformula/typings/errors", "NamedExpressionNameIsInvalidError")
  @js.native
  open class NamedExpressionNameIsInvalidError protected ()
    extends StObject
       with Error {
    def this(expressionName: String) = this()
    
    /* standard es5 */
    /* CompleteClass */
    var message: String = js.native
    
    /* standard es5 */
    /* CompleteClass */
    var name: String = js.native
  }
  
  @JSImport("hyperformula/typings/errors", "NoOperationToRedoError")
  @js.native
  open class NoOperationToRedoError ()
    extends StObject
       with Error {
    
    /* standard es5 */
    /* CompleteClass */
    var message: String = js.native
    
    /* standard es5 */
    /* CompleteClass */
    var name: String = js.native
  }
  
  @JSImport("hyperformula/typings/errors", "NoOperationToUndoError")
  @js.native
  open class NoOperationToUndoError ()
    extends StObject
       with Error {
    
    /* standard es5 */
    /* CompleteClass */
    var message: String = js.native
    
    /* standard es5 */
    /* CompleteClass */
    var name: String = js.native
  }
  
  @JSImport("hyperformula/typings/errors", "NoRelativeAddressesAllowedError")
  @js.native
  open class NoRelativeAddressesAllowedError ()
    extends StObject
       with Error {
    
    /* standard es5 */
    /* CompleteClass */
    var message: String = js.native
    
    /* standard es5 */
    /* CompleteClass */
    var name: String = js.native
  }
  
  @JSImport("hyperformula/typings/errors", "NoSheetWithIdError")
  @js.native
  open class NoSheetWithIdError protected ()
    extends StObject
       with Error {
    def this(sheetId: Double) = this()
    
    /* standard es5 */
    /* CompleteClass */
    var message: String = js.native
    
    /* standard es5 */
    /* CompleteClass */
    var name: String = js.native
  }
  
  @JSImport("hyperformula/typings/errors", "NoSheetWithNameError")
  @js.native
  open class NoSheetWithNameError protected ()
    extends StObject
       with Error {
    def this(sheetName: String) = this()
    
    /* standard es5 */
    /* CompleteClass */
    var message: String = js.native
    
    /* standard es5 */
    /* CompleteClass */
    var name: String = js.native
  }
  
  @JSImport("hyperformula/typings/errors", "NotAFormulaError")
  @js.native
  open class NotAFormulaError ()
    extends StObject
       with Error {
    
    /* standard es5 */
    /* CompleteClass */
    var message: String = js.native
    
    /* standard es5 */
    /* CompleteClass */
    var name: String = js.native
  }
  
  @JSImport("hyperformula/typings/errors", "NothingToPasteError")
  @js.native
  open class NothingToPasteError ()
    extends StObject
       with Error {
    
    /* standard es5 */
    /* CompleteClass */
    var message: String = js.native
    
    /* standard es5 */
    /* CompleteClass */
    var name: String = js.native
  }
  
  @JSImport("hyperformula/typings/errors", "ProtectedFunctionError")
  @js.native
  open class ProtectedFunctionError ()
    extends StObject
       with Error {
    
    /* standard es5 */
    /* CompleteClass */
    var message: String = js.native
    
    /* standard es5 */
    /* CompleteClass */
    var name: String = js.native
  }
  /* static members */
  object ProtectedFunctionError {
    
    @JSImport("hyperformula/typings/errors", "ProtectedFunctionError")
    @js.native
    val ^ : js.Any = js.native
    
    inline def cannotRegisterFunctionWithId(functionId: String): ProtectedFunctionError = ^.asInstanceOf[js.Dynamic].applyDynamic("cannotRegisterFunctionWithId")(functionId.asInstanceOf[js.Any]).asInstanceOf[ProtectedFunctionError]
    
    inline def cannotUnregisterFunctionWithId(functionId: String): ProtectedFunctionError = ^.asInstanceOf[js.Dynamic].applyDynamic("cannotUnregisterFunctionWithId")(functionId.asInstanceOf[js.Any]).asInstanceOf[ProtectedFunctionError]
    
    inline def cannotUnregisterProtectedPlugin(): ProtectedFunctionError = ^.asInstanceOf[js.Dynamic].applyDynamic("cannotUnregisterProtectedPlugin")().asInstanceOf[ProtectedFunctionError]
  }
  
  @JSImport("hyperformula/typings/errors", "ProtectedFunctionTranslationError")
  @js.native
  open class ProtectedFunctionTranslationError protected ()
    extends StObject
       with Error {
    def this(key: String) = this()
    
    /* standard es5 */
    /* CompleteClass */
    var message: String = js.native
    
    /* standard es5 */
    /* CompleteClass */
    var name: String = js.native
  }
  
  @JSImport("hyperformula/typings/errors", "SheetNameAlreadyTakenError")
  @js.native
  open class SheetNameAlreadyTakenError protected ()
    extends StObject
       with Error {
    def this(sheetName: String) = this()
    
    /* standard es5 */
    /* CompleteClass */
    var message: String = js.native
    
    /* standard es5 */
    /* CompleteClass */
    var name: String = js.native
  }
  
  @JSImport("hyperformula/typings/errors", "SheetSizeLimitExceededError")
  @js.native
  open class SheetSizeLimitExceededError ()
    extends StObject
       with Error {
    
    /* standard es5 */
    /* CompleteClass */
    var message: String = js.native
    
    /* standard es5 */
    /* CompleteClass */
    var name: String = js.native
  }
  
  @JSImport("hyperformula/typings/errors", "SheetsNotEqual")
  @js.native
  open class SheetsNotEqual protected ()
    extends StObject
       with Error {
    def this(sheet1: Double, sheet2: Double) = this()
    
    /* standard es5 */
    /* CompleteClass */
    var message: String = js.native
    
    /* standard es5 */
    /* CompleteClass */
    var name: String = js.native
  }
  
  @JSImport("hyperformula/typings/errors", "SourceLocationHasArrayError")
  @js.native
  open class SourceLocationHasArrayError ()
    extends StObject
       with Error {
    
    /* standard es5 */
    /* CompleteClass */
    var message: String = js.native
    
    /* standard es5 */
    /* CompleteClass */
    var name: String = js.native
  }
  
  @JSImport("hyperformula/typings/errors", "TargetLocationHasArrayError")
  @js.native
  open class TargetLocationHasArrayError ()
    extends StObject
       with Error {
    
    /* standard es5 */
    /* CompleteClass */
    var message: String = js.native
    
    /* standard es5 */
    /* CompleteClass */
    var name: String = js.native
  }
  
  @JSImport("hyperformula/typings/errors", "UnableToParseError")
  @js.native
  open class UnableToParseError protected ()
    extends StObject
       with Error {
    def this(value: Any) = this()
    
    /* standard es5 */
    /* CompleteClass */
    var message: String = js.native
    
    /* standard es5 */
    /* CompleteClass */
    var name: String = js.native
  }
}
