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
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typingsInterpreterPluginFunctionPluginMod {
  
  @js.native
  sealed trait ArgumentTypes extends StObject
  @JSImport("hyperformula/typings/interpreter/plugin/FunctionPlugin", "ArgumentTypes")
  @js.native
  object ArgumentTypes extends StObject {
    
    @JSBracketAccess
    def apply(value: String): js.UndefOr[ArgumentTypes & String] = js.native
    
    /**
      * Range or scalar.
      */
    @js.native
    sealed trait ANY
      extends StObject
         with ArgumentTypes
    /* "ANY" */ val ANY: typings.hyperformula.typingsInterpreterPluginFunctionPluginMod.ArgumentTypes.ANY & String = js.native
    
    /**
      * Boolean type.
      */
    @js.native
    sealed trait BOOLEAN
      extends StObject
         with ArgumentTypes
    /* "BOOLEAN" */ val BOOLEAN: typings.hyperformula.typingsInterpreterPluginFunctionPluginMod.ArgumentTypes.BOOLEAN & String = js.native
    
    /**
      * String representing complex number.
      */
    @js.native
    sealed trait COMPLEX
      extends StObject
         with ArgumentTypes
    /* "COMPLEX" */ val COMPLEX: typings.hyperformula.typingsInterpreterPluginFunctionPluginMod.ArgumentTypes.COMPLEX & String = js.native
    
    /**
      * Integer type.
      */
    @js.native
    sealed trait INTEGER
      extends StObject
         with ArgumentTypes
    /* "INTEGER" */ val INTEGER: typings.hyperformula.typingsInterpreterPluginFunctionPluginMod.ArgumentTypes.INTEGER & String = js.native
    
    /**
      * Any non-range, no-error type.
      */
    @js.native
    sealed trait NOERROR
      extends StObject
         with ArgumentTypes
    /* "NOERROR" */ val NOERROR: typings.hyperformula.typingsInterpreterPluginFunctionPluginMod.ArgumentTypes.NOERROR & String = js.native
    
    /**
      * Floating point type.
      */
    @js.native
    sealed trait NUMBER
      extends StObject
         with ArgumentTypes
    /* "NUMBER" */ val NUMBER: typings.hyperformula.typingsInterpreterPluginFunctionPluginMod.ArgumentTypes.NUMBER & String = js.native
    
    /**
      * Range type.
      */
    @js.native
    sealed trait RANGE
      extends StObject
         with ArgumentTypes
    /* "RANGE" */ val RANGE: typings.hyperformula.typingsInterpreterPluginFunctionPluginMod.ArgumentTypes.RANGE & String = js.native
    
    /**
      * Any non-range value.
      */
    @js.native
    sealed trait SCALAR
      extends StObject
         with ArgumentTypes
    /* "SCALAR" */ val SCALAR: typings.hyperformula.typingsInterpreterPluginFunctionPluginMod.ArgumentTypes.SCALAR & String = js.native
    
    /**
      * String type.
      */
    @js.native
    sealed trait STRING
      extends StObject
         with ArgumentTypes
    /* "STRING" */ val STRING: typings.hyperformula.typingsInterpreterPluginFunctionPluginMod.ArgumentTypes.STRING & String = js.native
  }
  
  /* import warning: RemoveDifficultInheritance.summarizeChanges 
  - Dropped {[ K in keyof hyperformula.hyperformula/typings/interpreter/plugin/FunctionPlugin.FunctionPlugin ]: hyperformula.hyperformula/typings/interpreter/plugin/FunctionPlugin.FunctionPlugin[K] extends hyperformula.hyperformula/typings/interpreter/plugin/FunctionPlugin.PluginFunctionType | hyperformula.hyperformula/typings/interpreter/plugin/FunctionPlugin.PluginArraySizeFunctionType? hyperformula.hyperformula/typings/interpreter/plugin/FunctionPlugin.FunctionPlugin[K] : never} */ /* note: abstract class */ @JSImport("hyperformula/typings/interpreter/plugin/FunctionPlugin", "FunctionPlugin")
  @js.native
  open class FunctionPlugin protected () extends StObject {
    def this(interpreter: Interpreter) = this()
    
    /* protected */ val arithmeticHelper: ArithmeticHelper = js.native
    
    /* protected */ def arraySizeForAst(ast: Ast, state: InterpreterState): ArraySize = js.native
    
    /* protected */ val arraySizePredictor: ArraySizePredictor = js.native
    
    /* protected */ def coerceScalarToNumberOrError(arg: InternalScalarValue): ExtendedNumber | CellError = js.native
    
    /* protected */ def coerceToType(arg: InterpreterValue, coercedType: FunctionArgument, state: InterpreterState): Maybe[InterpreterValue | complex | RawNoErrorScalarValue] = js.native
    
    /* protected */ val columnSearch: SearchStrategy = js.native
    
    /* protected */ val config: Config = js.native
    
    /* protected */ val dateTimeHelper: DateTimeHelper = js.native
    
    /* protected */ val dependencyGraph: DependencyGraph = js.native
    
    /* protected */ def evaluateAst(ast: Ast, state: InterpreterState): InterpreterValue = js.native
    
    /* protected */ val interpreter: Interpreter = js.native
    
    /* protected */ def listOfScalarValues(asts: js.Array[Ast], state: InterpreterState): js.Array[js.Tuple2[InternalScalarValue, Boolean]] = js.native
    
    /* protected */ def metadata(name: String): FunctionMetadata = js.native
    
    /* private */ var returnNumberWrapper: Any = js.native
    
    /* protected */ def runFunction(
      args: js.Array[Ast],
      state: InterpreterState,
      metadata: FunctionMetadata,
      fn: js.Function1[/* arg */ Any, InterpreterValue]
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
    
    var argumentType: ArgumentTypes
    
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
    
    inline def apply(argumentType: ArgumentTypes): FunctionArgument = {
      val __obj = js.Dynamic.literal(argumentType = argumentType.asInstanceOf[js.Any])
      __obj.asInstanceOf[FunctionArgument]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: FunctionArgument] (val x: Self) extends AnyVal {
      
      inline def setArgumentType(value: ArgumentTypes): Self = StObject.set(x, "argumentType", value.asInstanceOf[js.Any])
      
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
