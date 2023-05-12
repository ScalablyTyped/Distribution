package typings.hyperformula

import org.scalablytyped.runtime.Instantiable1
import org.scalablytyped.runtime.StringDictionary
import typings.hyperformula.typingsArraySizeMod.ArraySize
import typings.hyperformula.typingsArraySizeMod.ArraySizePredictor
import typings.hyperformula.typingsCellMod.CellError
import typings.hyperformula.typingsCellMod.SimpleCellAddress_
import typings.hyperformula.typingsConfigMod.Config
import typings.hyperformula.typingsDateTimeHelperMod.DateTimeHelper
import typings.hyperformula.typingsDependencyGraphMod.DependencyGraph
import typings.hyperformula.typingsInterpreterArithmeticHelperMod.ArithmeticHelper
import typings.hyperformula.typingsInterpreterArithmeticHelperMod.complex
import typings.hyperformula.typingsInterpreterInterpreterMod.Interpreter
import typings.hyperformula.typingsInterpreterInterpreterStateMod.InterpreterState
import typings.hyperformula.typingsInterpreterInterpreterValueMod.ExtendedNumber
import typings.hyperformula.typingsInterpreterInterpreterValueMod.FormatInfo
import typings.hyperformula.typingsInterpreterInterpreterValueMod.InternalScalarValue
import typings.hyperformula.typingsInterpreterInterpreterValueMod.InterpreterValue
import typings.hyperformula.typingsInterpreterInterpreterValueMod.NumberType
import typings.hyperformula.typingsInterpreterInterpreterValueMod.RawNoErrorScalarValue
import typings.hyperformula.typingsInterpreterInterpreterValueMod.RawScalarValue
import typings.hyperformula.typingsLookupSearchStrategyMod.SearchStrategy
import typings.hyperformula.typingsMaybeMod.Maybe
import typings.hyperformula.typingsParserAstMod.Ast
import typings.hyperformula.typingsParserAstMod.ProcedureAst
import typings.hyperformula.typingsSerializationMod.Serialization
import typings.hyperformula.typingsSimpleRangeValueMod.SimpleRangeValue
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typingsInterpreterPluginFunctionPluginMod {
  
  @js.native
  sealed trait FunctionArgumentType extends StObject
  @JSImport("hyperformula/typings/interpreter/plugin/FunctionPlugin", "FunctionArgumentType")
  @js.native
  object FunctionArgumentType extends StObject {
    
    @JSBracketAccess
    def apply(value: String): js.UndefOr[FunctionArgumentType & String] = js.native
    
    /**
      * Range or scalar.
      */
    @js.native
    sealed trait ANY
      extends StObject
         with FunctionArgumentType
    /* "ANY" */ val ANY: typings.hyperformula.typingsInterpreterPluginFunctionPluginMod.FunctionArgumentType.ANY & String = js.native
    
    /**
      * Boolean type.
      */
    @js.native
    sealed trait BOOLEAN
      extends StObject
         with FunctionArgumentType
    /* "BOOLEAN" */ val BOOLEAN: typings.hyperformula.typingsInterpreterPluginFunctionPluginMod.FunctionArgumentType.BOOLEAN & String = js.native
    
    /**
      * String representing complex number.
      */
    @js.native
    sealed trait COMPLEX
      extends StObject
         with FunctionArgumentType
    /* "COMPLEX" */ val COMPLEX: typings.hyperformula.typingsInterpreterPluginFunctionPluginMod.FunctionArgumentType.COMPLEX & String = js.native
    
    /**
      * Integer type.
      */
    @js.native
    sealed trait INTEGER
      extends StObject
         with FunctionArgumentType
    /* "INTEGER" */ val INTEGER: typings.hyperformula.typingsInterpreterPluginFunctionPluginMod.FunctionArgumentType.INTEGER & String = js.native
    
    /**
      * Any non-range, no-error type.
      */
    @js.native
    sealed trait NOERROR
      extends StObject
         with FunctionArgumentType
    /* "NOERROR" */ val NOERROR: typings.hyperformula.typingsInterpreterPluginFunctionPluginMod.FunctionArgumentType.NOERROR & String = js.native
    
    /**
      * Floating point type.
      */
    @js.native
    sealed trait NUMBER
      extends StObject
         with FunctionArgumentType
    /* "NUMBER" */ val NUMBER: typings.hyperformula.typingsInterpreterPluginFunctionPluginMod.FunctionArgumentType.NUMBER & String = js.native
    
    /**
      * Range type.
      */
    @js.native
    sealed trait RANGE
      extends StObject
         with FunctionArgumentType
    /* "RANGE" */ val RANGE: typings.hyperformula.typingsInterpreterPluginFunctionPluginMod.FunctionArgumentType.RANGE & String = js.native
    
    /**
      * Any non-range value.
      */
    @js.native
    sealed trait SCALAR
      extends StObject
         with FunctionArgumentType
    /* "SCALAR" */ val SCALAR: typings.hyperformula.typingsInterpreterPluginFunctionPluginMod.FunctionArgumentType.SCALAR & String = js.native
    
    /**
      * String type.
      */
    @js.native
    sealed trait STRING
      extends StObject
         with FunctionArgumentType
    /* "STRING" */ val STRING: typings.hyperformula.typingsInterpreterPluginFunctionPluginMod.FunctionArgumentType.STRING & String = js.native
  }
  
  /* import warning: RemoveDifficultInheritance.summarizeChanges 
  - Dropped {[ K in keyof hyperformula.hyperformula/typings/interpreter/plugin/FunctionPlugin.FunctionPlugin ]: hyperformula.hyperformula/typings/interpreter/plugin/FunctionPlugin.FunctionPlugin[K] extends hyperformula.hyperformula/typings/interpreter/plugin/FunctionPlugin.PluginFunctionType | hyperformula.hyperformula/typings/interpreter/plugin/FunctionPlugin.PluginArraySizeFunctionType? hyperformula.hyperformula/typings/interpreter/plugin/FunctionPlugin.FunctionPlugin[K] : never} */ /* note: abstract class */ @JSImport("hyperformula/typings/interpreter/plugin/FunctionPlugin", "FunctionPlugin")
  @js.native
  open class FunctionPlugin protected () extends StObject {
    def this(interpreter: Interpreter) = this()
    
    /* protected */ val arithmeticHelper: ArithmeticHelper = js.native
    
    /* protected */ def arraySizeForAst(ast: Ast, state: InterpreterState): ArraySize = js.native
    
    /* protected */ val arraySizePredictor: ArraySizePredictor = js.native
    
    /* protected */ def buildMetadataForEachArgumentValue(numberOfArgumentValuesPassed: Double, metadata: FunctionMetadata): js.Array[FunctionArgument] = js.native
    
    /* protected */ def calculateSingleCellOfResultArray(
      state: InterpreterState,
      vectorizedArguments: js.Array[Maybe[InterpreterValue]],
      argumentsMetadata: js.Array[FunctionArgument],
      argumentIgnorableFlags: js.Array[Boolean],
      functionImplementation: js.Function1[/* arg */ Any, InterpreterValue]
    ): InternalScalarValue | SimpleRangeValue = js.native
    /* protected */ def calculateSingleCellOfResultArray(
      state: InterpreterState,
      vectorizedArguments: js.Array[Maybe[InterpreterValue]],
      argumentsMetadata: js.Array[FunctionArgument],
      argumentIgnorableFlags: js.Array[Boolean],
      functionImplementation: js.Function1[/* arg */ Any, InterpreterValue],
      returnNumberType: NumberType
    ): InternalScalarValue | SimpleRangeValue = js.native
    
    /* protected */ def calculateSizeOfVectorizedResultArray(argumentValues: js.Array[InterpreterValue], argumentMetadata: js.Array[FunctionArgument]): js.Tuple2[Double, Double] = js.native
    
    /* protected */ def coerceArgumentsToRequiredTypes(
      state: InterpreterState,
      vectorizedArguments: js.Array[Maybe[InterpreterValue]],
      argumentsMetadata: js.Array[FunctionArgument],
      argumentIgnorableFlags: js.Array[Boolean]
    ): CellError | (js.Array[Maybe[InterpreterValue | complex | RawNoErrorScalarValue]]) = js.native
    
    /* protected */ def coerceScalarToNumberOrError(arg: InternalScalarValue): ExtendedNumber | CellError = js.native
    
    /* protected */ def coerceToType(arg: InterpreterValue, coercedType: FunctionArgument, state: InterpreterState): Maybe[InterpreterValue | complex | RawNoErrorScalarValue] = js.native
    
    /* protected */ val columnSearch: SearchStrategy = js.native
    
    /* protected */ val config: Config = js.native
    
    /* protected */ val dateTimeHelper: DateTimeHelper = js.native
    
    /* protected */ val dependencyGraph: DependencyGraph = js.native
    
    /* protected */ def evaluateArguments(args: js.Array[Ast], state: InterpreterState, metadata: FunctionMetadata): js.Array[js.Tuple2[InterpreterValue, Boolean]] = js.native
    
    /* protected */ def evaluateAst(ast: Ast, state: InterpreterState): InterpreterValue = js.native
    
    /* protected */ val interpreter: Interpreter = js.native
    
    /* protected */ def isNumberOfArgumentValuesValid(argumentsMetadata: js.Array[FunctionArgument], numberOfArgumentValuesPassed: Double): Boolean = js.native
    
    /* protected */ def isRangePassedAsAScalarArgument(argumentValue: Maybe[InterpreterValue], argumentMetadata: Maybe[FunctionArgument]): /* is hyperformula.hyperformula/typings/SimpleRangeValue.SimpleRangeValue */ Boolean = js.native
    
    /* protected */ def listOfScalarValues(asts: js.Array[Ast], state: InterpreterState): js.Array[js.Tuple2[InternalScalarValue, Boolean]] = js.native
    
    /* protected */ def metadata(name: String): FunctionMetadata = js.native
    
    /* protected */ def returnNumberWrapper[T](`val`: ExtendedNumber | T): T | ExtendedNumber = js.native
    /* protected */ def returnNumberWrapper[T](`val`: ExtendedNumber | T, `type`: Unit, format: FormatInfo): T | ExtendedNumber = js.native
    /* protected */ def returnNumberWrapper[T](`val`: ExtendedNumber | T, `type`: NumberType): T | ExtendedNumber = js.native
    /* protected */ def returnNumberWrapper[T](`val`: ExtendedNumber | T, `type`: NumberType, format: FormatInfo): T | ExtendedNumber = js.native
    
    /**
      * A method that should wrap the logic of every built-in function and custom function. It:
      * - Evaluates the function's arguments.
      * - Validates the number of arguments against the [`parameters` array](#function-options).
      * - Coerces the argument values to types set in the [`parameters` array](#argument-validation-options).
      * - Handles optional arguments and default values according to options set in the [`parameters` array](#argument-validation-options).
      * - Validates the function's arguments against the [argument validation options](#argument-validation-options).
      * - Duplicates the arguments according to the [`repeatLastArgs` option](#function-options).
      * - Handles the [array arithmetic mode](arrays.md#array-arithmetic-mode).
      * - Performs [function vectorization](arrays.md#passing-arrays-to-scalar-functions-vectorization).
      * - Performs [argument broadcasting](arrays.md#broadcasting).
      */
    /* protected */ def runFunction(
      args: js.Array[Ast],
      state: InterpreterState,
      metadata: FunctionMetadata,
      functionImplementation: js.Function1[/* arg */ Any, InterpreterValue]
    ): InterpreterValue = js.native
    
    /* protected */ def runFunctionWithReferenceArgument(
      args: js.Array[Ast],
      state: InterpreterState,
      metadata: FunctionMetadata,
      noArgCallback: js.Function0[InternalScalarValue],
      referenceCallback: js.Function1[/* reference */ SimpleCellAddress_, InternalScalarValue]
    ): InterpreterValue = js.native
    /* protected */ def runFunctionWithReferenceArgument(
      args: js.Array[Ast],
      state: InterpreterState,
      metadata: FunctionMetadata,
      noArgCallback: js.Function0[InternalScalarValue],
      referenceCallback: js.Function1[/* reference */ SimpleCellAddress_, InternalScalarValue],
      nonReferenceCallback: js.Function1[/* arg */ Any, InternalScalarValue]
    ): InterpreterValue = js.native
    
    /* protected */ val serialization: Serialization = js.native
    
    /* protected */ def vectorizeAndBroadcastArgumentsIfNecessary(
      isVectorizationOn: Boolean,
      argumentValues: js.Array[InterpreterValue],
      argumentMetadata: js.Array[FunctionArgument],
      row: Double,
      col: Double
    ): js.Array[Maybe[InterpreterValue]] = js.native
    
    /* protected */ def vectorizeAndBroadcastRangeArgument(argumentValue: SimpleRangeValue, rowNum: Double, colNum: Double): Maybe[InterpreterValue] = js.native
  }
  /* static members */
  object FunctionPlugin {
    
    @JSImport("hyperformula/typings/interpreter/plugin/FunctionPlugin", "FunctionPlugin")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("hyperformula/typings/interpreter/plugin/FunctionPlugin", "FunctionPlugin.aliases")
    @js.native
    def aliases: js.UndefOr[StringDictionary[String]] = js.native
    inline def aliases_=(x: js.UndefOr[StringDictionary[String]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("aliases")(x.asInstanceOf[js.Any])
    
    /**
      * Dictionary containing functions implemented by specific plugin, along with function name translations.
      */
    @JSImport("hyperformula/typings/interpreter/plugin/FunctionPlugin", "FunctionPlugin.implementedFunctions")
    @js.native
    def implementedFunctions: ImplementedFunctions = js.native
    inline def implementedFunctions_=(x: ImplementedFunctions): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("implementedFunctions")(x.asInstanceOf[js.Any])
  }
  
  trait FunctionArgument extends StObject {
    
    var argumentType: FunctionArgumentType
    
    /**
      * If an argument is missing, its value defaults to `defaultValue`.
      */
    var defaultValue: js.UndefOr[InternalScalarValue | RawScalarValue] = js.undefined
    
    /**
      * If set, numerical arguments need to be greater than `greaterThan`.
      */
    var greaterThan: js.UndefOr[Double] = js.undefined
    
    /**
      * If set, numerical arguments need to be less than `lessThan`.
      */
    var lessThan: js.UndefOr[Double] = js.undefined
    
    /**
      * If set, numerical arguments need to be less than or equal to `maxValue`.
      */
    var maxValue: js.UndefOr[Double] = js.undefined
    
    /**
      * If set, numerical arguments need to be greater than or equal to `minValue`.
      */
    var minValue: js.UndefOr[Double] = js.undefined
    
    /**
      * If set to `true`:
      * if an argument is missing, and no `defaultValue` is set, the argument is `undefined` (instead of throwing an error).
      *
      * This is logically equivalent to setting `defaultValue` to `undefined`.
      */
    var optionalArg: js.UndefOr[Boolean] = js.undefined
    
    /**
      * If set to `true`, arguments need to be passed with full type information.
      * (e.g. for numbers: `Date` or `DateTime` or `Time` or `Currency` or `Percentage`)
      */
    var passSubtype: js.UndefOr[Boolean] = js.undefined
  }
  object FunctionArgument {
    
    inline def apply(argumentType: FunctionArgumentType): FunctionArgument = {
      val __obj = js.Dynamic.literal(argumentType = argumentType.asInstanceOf[js.Any])
      __obj.asInstanceOf[FunctionArgument]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: FunctionArgument] (val x: Self) extends AnyVal {
      
      inline def setArgumentType(value: FunctionArgumentType): Self = StObject.set(x, "argumentType", value.asInstanceOf[js.Any])
      
      inline def setDefaultValue(value: InternalScalarValue | RawScalarValue): Self = StObject.set(x, "defaultValue", value.asInstanceOf[js.Any])
      
      inline def setDefaultValueUndefined: Self = StObject.set(x, "defaultValue", js.undefined)
      
      inline def setGreaterThan(value: Double): Self = StObject.set(x, "greaterThan", value.asInstanceOf[js.Any])
      
      inline def setGreaterThanUndefined: Self = StObject.set(x, "greaterThan", js.undefined)
      
      inline def setLessThan(value: Double): Self = StObject.set(x, "lessThan", value.asInstanceOf[js.Any])
      
      inline def setLessThanUndefined: Self = StObject.set(x, "lessThan", js.undefined)
      
      inline def setMaxValue(value: Double): Self = StObject.set(x, "maxValue", value.asInstanceOf[js.Any])
      
      inline def setMaxValueUndefined: Self = StObject.set(x, "maxValue", js.undefined)
      
      inline def setMinValue(value: Double): Self = StObject.set(x, "minValue", value.asInstanceOf[js.Any])
      
      inline def setMinValueUndefined: Self = StObject.set(x, "minValue", js.undefined)
      
      inline def setOptionalArg(value: Boolean): Self = StObject.set(x, "optionalArg", value.asInstanceOf[js.Any])
      
      inline def setOptionalArgUndefined: Self = StObject.set(x, "optionalArg", js.undefined)
      
      inline def setPassSubtype(value: Boolean): Self = StObject.set(x, "passSubtype", value.asInstanceOf[js.Any])
      
      inline def setPassSubtypeUndefined: Self = StObject.set(x, "passSubtype", js.undefined)
    }
  }
  
  trait FunctionMetadata extends StObject {
    
    /**
      * Engine.
      *
      * If set to `true`, the function enables the array arithmetic mode in its arguments and nested expressions.
      */
    var arrayFunction: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Engine.
      */
    var arraySizeMethod: js.UndefOr[String] = js.undefined
    
    /**
      * Engine.
      *
      * If set to `true`, the function treats reference or range arguments as arguments that don't create dependency.
      *
      * Other arguments are properly evaluated.
      */
    var doesNotNeedArgumentsToBeComputed: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Internal.
      *
      * If set to `true`, ranges in the function's arguments are inlined to (possibly multiple) scalar arguments.
      */
    var expandRanges: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Engine.
      *
      * If set to `true`, the function gets recalculated with each sheet shape change
      * (e.g. when adding/removing rows or columns).
      */
    var isDependentOnSheetStructureChange: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Engine.
      *
      * If set to `true`, the function is volatile.
      */
    var isVolatile: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Engine.
      */
    var method: String
    
    /**
      * Internal and engine.
      */
    var parameters: js.UndefOr[js.Array[FunctionArgument]] = js.undefined
    
    /**
      * Internal.
      *
      * For functions with a variable number of arguments: sets how many last arguments can be repeated indefinitely.
      */
    var repeatLastArgs: js.UndefOr[Double] = js.undefined
    
    /**
      * Internal.
      *
      * Return number value is packed into this subtype.
      */
    var returnNumberType: js.UndefOr[NumberType] = js.undefined
    
    /**
      * Internal.
      *
      * If set to `true`, prevents the function from ever being vectorized.
      *
      * Some functions do not allow vectorization: array-output, and special functions.
      */
    var vectorizationForbidden: js.UndefOr[Boolean] = js.undefined
  }
  object FunctionMetadata {
    
    inline def apply(method: String): FunctionMetadata = {
      val __obj = js.Dynamic.literal(method = method.asInstanceOf[js.Any])
      __obj.asInstanceOf[FunctionMetadata]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: FunctionMetadata] (val x: Self) extends AnyVal {
      
      inline def setArrayFunction(value: Boolean): Self = StObject.set(x, "arrayFunction", value.asInstanceOf[js.Any])
      
      inline def setArrayFunctionUndefined: Self = StObject.set(x, "arrayFunction", js.undefined)
      
      inline def setArraySizeMethod(value: String): Self = StObject.set(x, "arraySizeMethod", value.asInstanceOf[js.Any])
      
      inline def setArraySizeMethodUndefined: Self = StObject.set(x, "arraySizeMethod", js.undefined)
      
      inline def setDoesNotNeedArgumentsToBeComputed(value: Boolean): Self = StObject.set(x, "doesNotNeedArgumentsToBeComputed", value.asInstanceOf[js.Any])
      
      inline def setDoesNotNeedArgumentsToBeComputedUndefined: Self = StObject.set(x, "doesNotNeedArgumentsToBeComputed", js.undefined)
      
      inline def setExpandRanges(value: Boolean): Self = StObject.set(x, "expandRanges", value.asInstanceOf[js.Any])
      
      inline def setExpandRangesUndefined: Self = StObject.set(x, "expandRanges", js.undefined)
      
      inline def setIsDependentOnSheetStructureChange(value: Boolean): Self = StObject.set(x, "isDependentOnSheetStructureChange", value.asInstanceOf[js.Any])
      
      inline def setIsDependentOnSheetStructureChangeUndefined: Self = StObject.set(x, "isDependentOnSheetStructureChange", js.undefined)
      
      inline def setIsVolatile(value: Boolean): Self = StObject.set(x, "isVolatile", value.asInstanceOf[js.Any])
      
      inline def setIsVolatileUndefined: Self = StObject.set(x, "isVolatile", js.undefined)
      
      inline def setMethod(value: String): Self = StObject.set(x, "method", value.asInstanceOf[js.Any])
      
      inline def setParameters(value: js.Array[FunctionArgument]): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
      
      inline def setParametersUndefined: Self = StObject.set(x, "parameters", js.undefined)
      
      inline def setParametersVarargs(value: FunctionArgument*): Self = StObject.set(x, "parameters", js.Array(value*))
      
      inline def setRepeatLastArgs(value: Double): Self = StObject.set(x, "repeatLastArgs", value.asInstanceOf[js.Any])
      
      inline def setRepeatLastArgsUndefined: Self = StObject.set(x, "repeatLastArgs", js.undefined)
      
      inline def setReturnNumberType(value: NumberType): Self = StObject.set(x, "returnNumberType", value.asInstanceOf[js.Any])
      
      inline def setReturnNumberTypeUndefined: Self = StObject.set(x, "returnNumberType", js.undefined)
      
      inline def setVectorizationForbidden(value: Boolean): Self = StObject.set(x, "vectorizationForbidden", value.asInstanceOf[js.Any])
      
      inline def setVectorizationForbiddenUndefined: Self = StObject.set(x, "vectorizationForbidden", js.undefined)
    }
  }
  
  @js.native
  trait FunctionPluginDefinition
    extends StObject
       with Instantiable1[/* interpreter */ Interpreter, FunctionPlugin] {
    
    var aliases: js.UndefOr[StringDictionary[String]] = js.native
    
    var implementedFunctions: ImplementedFunctions = js.native
  }
  
  /** NOTE: Mapped type definitions are impossible to translate to Scala.
    * See https://www.typescriptlang.org/docs/handbook/2/mapped-types.html for an intro.
    * You'll have to cast your way around this structure, unfortunately. 
    * TS definition: {{{
    {[ K in keyof T ]: T[K] extends hyperformula.hyperformula/typings/interpreter/plugin/FunctionPlugin.PluginFunctionType | hyperformula.hyperformula/typings/interpreter/plugin/FunctionPlugin.PluginArraySizeFunctionType? T[K] : never}
    }}}
    */
  @js.native
  trait FunctionPluginTypecheck[T] extends StObject
  
  type ImplementedFunctions = StringDictionary[FunctionMetadata]
  
  type PluginArraySizeFunctionType = js.Function2[/* ast */ ProcedureAst, /* state */ InterpreterState, ArraySize]
  
  type PluginFunctionType = js.Function2[/* ast */ ProcedureAst, /* state */ InterpreterState, InterpreterValue]
}
