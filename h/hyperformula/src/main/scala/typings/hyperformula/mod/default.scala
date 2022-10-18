package typings.hyperformula.mod

import org.scalablytyped.runtime.Instantiable0
import org.scalablytyped.runtime.Instantiable1
import org.scalablytyped.runtime.Instantiable2
import org.scalablytyped.runtime.Instantiable3
import org.scalablytyped.runtime.StringDictionary
import typings.hyperformula.anon.PartialConfigParams
import typings.hyperformula.typingsCellContentParserMod.CellContentParser
import typings.hyperformula.typingsCellMod.CellValueNoNumber.BOOLEAN
import typings.hyperformula.typingsCellMod.CellValueNoNumber.EMPTY
import typings.hyperformula.typingsCellMod.CellValueNoNumber.ERROR
import typings.hyperformula.typingsCellMod.CellValueNoNumber.NUMBER
import typings.hyperformula.typingsCellMod.CellValueNoNumber.STRING
import typings.hyperformula.typingsCellMod.SimpleCellAddress_
import typings.hyperformula.typingsCellValueMod.CellValue
import typings.hyperformula.typingsConfigMod.Config
import typings.hyperformula.typingsCrudOperationsMod.CrudOperations
import typings.hyperformula.typingsDependencyGraphMod.DependencyGraph
import typings.hyperformula.typingsEvaluatorMod.Evaluator
import typings.hyperformula.typingsExporterMod.Exporter
import typings.hyperformula.typingsI18nMod.TranslationPackage
import typings.hyperformula.typingsI18nTranslationPackageMod.RawTranslationPackage
import typings.hyperformula.typingsInterpreterFunctionRegistryMod.FunctionRegistry
import typings.hyperformula.typingsInterpreterFunctionRegistryMod.FunctionTranslationsPackage
import typings.hyperformula.typingsInterpreterInterpreterMod.Interpreter
import typings.hyperformula.typingsInterpreterInterpreterValueMod.NumberType.NUMBER_CURRENCY
import typings.hyperformula.typingsInterpreterInterpreterValueMod.NumberType.NUMBER_DATE
import typings.hyperformula.typingsInterpreterInterpreterValueMod.NumberType.NUMBER_DATETIME
import typings.hyperformula.typingsInterpreterInterpreterValueMod.NumberType.NUMBER_PERCENT
import typings.hyperformula.typingsInterpreterInterpreterValueMod.NumberType.NUMBER_RAW
import typings.hyperformula.typingsInterpreterInterpreterValueMod.NumberType.NUMBER_TIME
import typings.hyperformula.typingsInterpreterPluginFunctionPluginMod.FunctionPluginDefinition
import typings.hyperformula.typingsInterpreterPluginFunctionPluginMod.ImplementedFunctions
import typings.hyperformula.typingsLazilyTransformingAstServiceMod.LazilyTransformingAstService
import typings.hyperformula.typingsLookupSearchStrategyMod.ColumnSearchStrategy
import typings.hyperformula.typingsNamedExpressionsMod.NamedExpressions
import typings.hyperformula.typingsParserMod.ParserWithCaching
import typings.hyperformula.typingsParserMod.Unparser
import typings.hyperformula.typingsSerializationMod.Serialization
import typings.hyperformula.typingsSerializationMod.SerializedNamedExpression
import typings.hyperformula.typingsSheetMod.Sheet
import typings.hyperformula.typingsSheetMod.Sheets
import typings.hyperformula.typingsStatisticsMod.Statistics
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** @internal */
@JSImport("hyperformula", JSImport.Default)
@js.native
open class default ()
  extends typings.hyperformula.typingsHyperFormulaMod.HyperFormula
object default {
  
  @JSImport("hyperformula", JSImport.Default)
  @js.native
  val ^ : js.Any = js.native
  
  /* static member */
  /* was `typeof CellType` */
  @JSImport("hyperformula", "default.CellType")
  @js.native
  def CellType: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof CellType */ Any = js.native
  inline def CellType_=(x: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof CellType */ Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("CellType")(x.asInstanceOf[js.Any])
  
  /* static member */
  object CellValueDetailedType {
    
    @JSImport("hyperformula", "default.CellValueDetailedType")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("hyperformula", "default.CellValueDetailedType.BOOLEAN")
    @js.native
    def BOOLEAN: typings.hyperformula.typingsCellMod.CellValueNoNumber.BOOLEAN = js.native
    inline def BOOLEAN_=(x: BOOLEAN): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("BOOLEAN")(x.asInstanceOf[js.Any])
    
    @JSImport("hyperformula", "default.CellValueDetailedType.EMPTY")
    @js.native
    def EMPTY: typings.hyperformula.typingsCellMod.CellValueNoNumber.EMPTY = js.native
    inline def EMPTY_=(x: EMPTY): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("EMPTY")(x.asInstanceOf[js.Any])
    
    @JSImport("hyperformula", "default.CellValueDetailedType.ERROR")
    @js.native
    def ERROR: typings.hyperformula.typingsCellMod.CellValueNoNumber.ERROR = js.native
    inline def ERROR_=(x: ERROR): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ERROR")(x.asInstanceOf[js.Any])
    
    @JSImport("hyperformula", "default.CellValueDetailedType.NUMBER")
    @js.native
    def NUMBER: typings.hyperformula.typingsCellMod.CellValueNoNumber.NUMBER = js.native
    inline def NUMBER_=(x: NUMBER): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("NUMBER")(x.asInstanceOf[js.Any])
    
    @JSImport("hyperformula", "default.CellValueDetailedType.NUMBER_CURRENCY")
    @js.native
    def NUMBER_CURRENCY: typings.hyperformula.typingsInterpreterInterpreterValueMod.NumberType.NUMBER_CURRENCY = js.native
    inline def NUMBER_CURRENCY_=(x: NUMBER_CURRENCY): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("NUMBER_CURRENCY")(x.asInstanceOf[js.Any])
    
    @JSImport("hyperformula", "default.CellValueDetailedType.NUMBER_DATE")
    @js.native
    def NUMBER_DATE: typings.hyperformula.typingsInterpreterInterpreterValueMod.NumberType.NUMBER_DATE = js.native
    
    @JSImport("hyperformula", "default.CellValueDetailedType.NUMBER_DATETIME")
    @js.native
    def NUMBER_DATETIME: typings.hyperformula.typingsInterpreterInterpreterValueMod.NumberType.NUMBER_DATETIME = js.native
    inline def NUMBER_DATETIME_=(x: NUMBER_DATETIME): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("NUMBER_DATETIME")(x.asInstanceOf[js.Any])
    
    inline def NUMBER_DATE_=(x: NUMBER_DATE): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("NUMBER_DATE")(x.asInstanceOf[js.Any])
    
    @JSImport("hyperformula", "default.CellValueDetailedType.NUMBER_PERCENT")
    @js.native
    def NUMBER_PERCENT: typings.hyperformula.typingsInterpreterInterpreterValueMod.NumberType.NUMBER_PERCENT = js.native
    inline def NUMBER_PERCENT_=(x: NUMBER_PERCENT): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("NUMBER_PERCENT")(x.asInstanceOf[js.Any])
    
    @JSImport("hyperformula", "default.CellValueDetailedType.NUMBER_RAW")
    @js.native
    def NUMBER_RAW: typings.hyperformula.typingsInterpreterInterpreterValueMod.NumberType.NUMBER_RAW = js.native
    inline def NUMBER_RAW_=(x: NUMBER_RAW): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("NUMBER_RAW")(x.asInstanceOf[js.Any])
    
    @JSImport("hyperformula", "default.CellValueDetailedType.NUMBER_TIME")
    @js.native
    def NUMBER_TIME: typings.hyperformula.typingsInterpreterInterpreterValueMod.NumberType.NUMBER_TIME = js.native
    inline def NUMBER_TIME_=(x: NUMBER_TIME): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("NUMBER_TIME")(x.asInstanceOf[js.Any])
    
    @JSImport("hyperformula", "default.CellValueDetailedType.STRING")
    @js.native
    def STRING: typings.hyperformula.typingsCellMod.CellValueNoNumber.STRING = js.native
    inline def STRING_=(x: STRING): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("STRING")(x.asInstanceOf[js.Any])
  }
  
  /* static member */
  object CellValueType {
    
    @JSImport("hyperformula", "default.CellValueType")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("hyperformula", "default.CellValueType.BOOLEAN")
    @js.native
    def BOOLEAN: typings.hyperformula.typingsCellMod.CellValueNoNumber.BOOLEAN = js.native
    inline def BOOLEAN_=(x: BOOLEAN): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("BOOLEAN")(x.asInstanceOf[js.Any])
    
    @JSImport("hyperformula", "default.CellValueType.EMPTY")
    @js.native
    def EMPTY: typings.hyperformula.typingsCellMod.CellValueNoNumber.EMPTY = js.native
    inline def EMPTY_=(x: EMPTY): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("EMPTY")(x.asInstanceOf[js.Any])
    
    @JSImport("hyperformula", "default.CellValueType.ERROR")
    @js.native
    def ERROR: typings.hyperformula.typingsCellMod.CellValueNoNumber.ERROR = js.native
    inline def ERROR_=(x: ERROR): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ERROR")(x.asInstanceOf[js.Any])
    
    @JSImport("hyperformula", "default.CellValueType.NUMBER")
    @js.native
    def NUMBER: typings.hyperformula.typingsCellMod.CellValueJustNumber.NUMBER = js.native
    inline def NUMBER_=(x: typings.hyperformula.typingsCellMod.CellValueJustNumber.NUMBER): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("NUMBER")(x.asInstanceOf[js.Any])
    
    @JSImport("hyperformula", "default.CellValueType.STRING")
    @js.native
    def STRING: typings.hyperformula.typingsCellMod.CellValueNoNumber.STRING = js.native
    inline def STRING_=(x: STRING): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("STRING")(x.asInstanceOf[js.Any])
  }
  
  /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
  @JSImport("hyperformula", "default.ConfigValueTooBigError")
  @js.native
  open class ConfigValueTooBigError protected ()
    extends typings.hyperformula.typingsErrorsMod.ConfigValueTooBigError {
    def this(paramName: String, maximum: Double) = this()
  }
  /* static member */
  /* was `typeof ConfigValueTooBigError` */
  @JSImport("hyperformula", "default.ConfigValueTooBigError")
  @js.native
  def ConfigValueTooBigError: Instantiable2[
    /* paramName */ String, 
    /* maximum */ Double, 
    typings.hyperformula.typingsErrorsMod.ConfigValueTooBigError
  ] = js.native
  inline def ConfigValueTooBigError_=(
    x: Instantiable2[
      /* paramName */ String, 
      /* maximum */ Double, 
      typings.hyperformula.typingsErrorsMod.ConfigValueTooBigError
    ]
  ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ConfigValueTooBigError")(x.asInstanceOf[js.Any])
  
  /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
  @JSImport("hyperformula", "default.ConfigValueTooSmallError")
  @js.native
  open class ConfigValueTooSmallError protected ()
    extends typings.hyperformula.typingsErrorsMod.ConfigValueTooSmallError {
    def this(paramName: String, minimum: Double) = this()
  }
  /* static member */
  /* was `typeof ConfigValueTooSmallError` */
  @JSImport("hyperformula", "default.ConfigValueTooSmallError")
  @js.native
  def ConfigValueTooSmallError: Instantiable2[
    /* paramName */ String, 
    /* minimum */ Double, 
    typings.hyperformula.typingsErrorsMod.ConfigValueTooSmallError
  ] = js.native
  inline def ConfigValueTooSmallError_=(
    x: Instantiable2[
      /* paramName */ String, 
      /* minimum */ Double, 
      typings.hyperformula.typingsErrorsMod.ConfigValueTooSmallError
    ]
  ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ConfigValueTooSmallError")(x.asInstanceOf[js.Any])
  
  /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
  @JSImport("hyperformula", "default.DetailedCellError")
  @js.native
  open class DetailedCellError protected ()
    extends typings.hyperformula.typingsCellValueMod.DetailedCellError {
    def this(error: typings.hyperformula.typingsCellMod.CellError, value: String) = this()
    def this(error: typings.hyperformula.typingsCellMod.CellError, value: String, address: String) = this()
  }
  /* static member */
  /* was `typeof DetailedCellError` */
  @JSImport("hyperformula", "default.DetailedCellError")
  @js.native
  def DetailedCellError: Instantiable3[
    /* error */ typings.hyperformula.typingsCellMod.CellError, 
    /* value */ String, 
    /* address */ js.UndefOr[String], 
    typings.hyperformula.typingsCellValueMod.DetailedCellError
  ] = js.native
  inline def DetailedCellError_=(
    x: Instantiable3[
      /* error */ typings.hyperformula.typingsCellMod.CellError, 
      /* value */ String, 
      /* address */ js.UndefOr[String], 
      typings.hyperformula.typingsCellValueMod.DetailedCellError
    ]
  ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("DetailedCellError")(x.asInstanceOf[js.Any])
  
  /* static member */
  /* was `typeof ErrorType` */
  @JSImport("hyperformula", "default.ErrorType")
  @js.native
  def ErrorType: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof ErrorType */ Any = js.native
  inline def ErrorType_=(x: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof ErrorType */ Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ErrorType")(x.asInstanceOf[js.Any])
  
  /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
  @JSImport("hyperformula", "default.EvaluationSuspendedError")
  @js.native
  open class EvaluationSuspendedError ()
    extends typings.hyperformula.typingsErrorsMod.EvaluationSuspendedError
  /* static member */
  /* was `typeof EvaluationSuspendedError` */
  @JSImport("hyperformula", "default.EvaluationSuspendedError")
  @js.native
  def EvaluationSuspendedError: Instantiable0[typings.hyperformula.typingsErrorsMod.EvaluationSuspendedError] = js.native
  inline def EvaluationSuspendedError_=(x: Instantiable0[typings.hyperformula.typingsErrorsMod.EvaluationSuspendedError]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("EvaluationSuspendedError")(x.asInstanceOf[js.Any])
  
  /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
  @JSImport("hyperformula", "default.ExpectedOneOfValuesError")
  @js.native
  open class ExpectedOneOfValuesError protected ()
    extends typings.hyperformula.typingsErrorsMod.ExpectedOneOfValuesError {
    def this(values: String, paramName: String) = this()
  }
  /* static member */
  /* was `typeof ExpectedOneOfValuesError` */
  @JSImport("hyperformula", "default.ExpectedOneOfValuesError")
  @js.native
  def ExpectedOneOfValuesError: Instantiable2[
    /* values */ String, 
    /* paramName */ String, 
    typings.hyperformula.typingsErrorsMod.ExpectedOneOfValuesError
  ] = js.native
  inline def ExpectedOneOfValuesError_=(
    x: Instantiable2[
      /* values */ String, 
      /* paramName */ String, 
      typings.hyperformula.typingsErrorsMod.ExpectedOneOfValuesError
    ]
  ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ExpectedOneOfValuesError")(x.asInstanceOf[js.Any])
  
  /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
  @JSImport("hyperformula", "default.ExpectedValueOfTypeError")
  @js.native
  open class ExpectedValueOfTypeError protected ()
    extends typings.hyperformula.typingsErrorsMod.ExpectedValueOfTypeError {
    def this(expectedType: String, paramName: String) = this()
  }
  /* static member */
  /* was `typeof ExpectedValueOfTypeError` */
  @JSImport("hyperformula", "default.ExpectedValueOfTypeError")
  @js.native
  def ExpectedValueOfTypeError: Instantiable2[
    /* expectedType */ String, 
    /* paramName */ String, 
    typings.hyperformula.typingsErrorsMod.ExpectedValueOfTypeError
  ] = js.native
  inline def ExpectedValueOfTypeError_=(
    x: Instantiable2[
      /* expectedType */ String, 
      /* paramName */ String, 
      typings.hyperformula.typingsErrorsMod.ExpectedValueOfTypeError
    ]
  ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ExpectedValueOfTypeError")(x.asInstanceOf[js.Any])
  
  /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
  @JSImport("hyperformula", "default.ExportedCellChange")
  @js.native
  open class ExportedCellChange protected ()
    extends typings.hyperformula.typingsExporterMod.ExportedCellChange {
    def this(address: SimpleCellAddress_, newValue: CellValue) = this()
  }
  /* static member */
  /* was `typeof ExportedCellChange` */
  @JSImport("hyperformula", "default.ExportedCellChange")
  @js.native
  def ExportedCellChange: Instantiable2[
    /* address */ SimpleCellAddress_, 
    /* newValue */ CellValue, 
    typings.hyperformula.typingsExporterMod.ExportedCellChange
  ] = js.native
  inline def ExportedCellChange_=(
    x: Instantiable2[
      /* address */ SimpleCellAddress_, 
      /* newValue */ CellValue, 
      typings.hyperformula.typingsExporterMod.ExportedCellChange
    ]
  ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ExportedCellChange")(x.asInstanceOf[js.Any])
  
  /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
  @JSImport("hyperformula", "default.ExportedNamedExpressionChange")
  @js.native
  open class ExportedNamedExpressionChange protected ()
    extends typings.hyperformula.typingsExporterMod.ExportedNamedExpressionChange {
    def this(name: String, newValue: js.Array[js.Array[CellValue]]) = this()
    def this(name: String, newValue: CellValue) = this()
  }
  /* static member */
  /* was `typeof ExportedNamedExpressionChange` */
  @JSImport("hyperformula", "default.ExportedNamedExpressionChange")
  @js.native
  def ExportedNamedExpressionChange: Instantiable2[
    /* name */ String, 
    /* newValue */ CellValue | js.Array[js.Array[CellValue]], 
    typings.hyperformula.typingsExporterMod.ExportedNamedExpressionChange
  ] = js.native
  inline def ExportedNamedExpressionChange_=(
    x: Instantiable2[
      /* name */ String, 
      /* newValue */ CellValue | js.Array[js.Array[CellValue]], 
      typings.hyperformula.typingsExporterMod.ExportedNamedExpressionChange
    ]
  ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ExportedNamedExpressionChange")(x.asInstanceOf[js.Any])
  
  /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
  @JSImport("hyperformula", "default.FunctionPlugin")
  @js.native
  open class FunctionPlugin protected ()
    extends typings.hyperformula.typingsInterpreterMod.FunctionPlugin {
    def this(interpreter: Interpreter) = this()
  }
  /* static member */
  /* was `typeof FunctionPlugin` */
  object FunctionPlugin {
    
    @JSImport("hyperformula", "default.FunctionPlugin")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("hyperformula", "default.FunctionPlugin.aliases")
    @js.native
    def aliases: js.UndefOr[StringDictionary[String]] = js.native
    inline def aliases_=(x: js.UndefOr[StringDictionary[String]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("aliases")(x.asInstanceOf[js.Any])
    
    /**
      * Dictionary containing functions implemented by specific plugin, along with function name translations.
      */
    @JSImport("hyperformula", "default.FunctionPlugin.implementedFunctions")
    @js.native
    def implementedFunctions: ImplementedFunctions = js.native
    inline def implementedFunctions_=(x: ImplementedFunctions): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("implementedFunctions")(x.asInstanceOf[js.Any])
  }
  
  /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
  @JSImport("hyperformula", "default.FunctionPluginValidationError")
  @js.native
  open class FunctionPluginValidationError ()
    extends typings.hyperformula.typingsErrorsMod.FunctionPluginValidationError
  /* static member */
  /* was `typeof FunctionPluginValidationError` */
  object FunctionPluginValidationError {
    
    @JSImport("hyperformula", "default.FunctionPluginValidationError")
    @js.native
    val ^ : js.Any = js.native
    
    inline def functionMethodNotFound(functionName: String, pluginName: String): typings.hyperformula.typingsErrorsMod.FunctionPluginValidationError = (^.asInstanceOf[js.Dynamic].applyDynamic("functionMethodNotFound")(functionName.asInstanceOf[js.Any], pluginName.asInstanceOf[js.Any])).asInstanceOf[typings.hyperformula.typingsErrorsMod.FunctionPluginValidationError]
    
    inline def functionNotDeclaredInPlugin(functionId: String, pluginName: String): typings.hyperformula.typingsErrorsMod.FunctionPluginValidationError = (^.asInstanceOf[js.Dynamic].applyDynamic("functionNotDeclaredInPlugin")(functionId.asInstanceOf[js.Any], pluginName.asInstanceOf[js.Any])).asInstanceOf[typings.hyperformula.typingsErrorsMod.FunctionPluginValidationError]
  }
  
  /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
  @JSImport("hyperformula", "default.HyperFormula")
  @js.native
  open class HyperFormula protected ()
    extends typings.hyperformula.typingsHyperFormulaMod.HyperFormula {
    def this(
      _config: Config,
      _stats: Statistics,
      _dependencyGraph: DependencyGraph,
      _columnSearch: ColumnSearchStrategy,
      _parser: ParserWithCaching,
      _unparser: Unparser,
      _cellContentParser: CellContentParser,
      _evaluator: Evaluator,
      _lazilyTransformingAstService: LazilyTransformingAstService,
      _crudOperations: CrudOperations,
      _exporter: Exporter,
      _namedExpressions: NamedExpressions,
      _serialization: Serialization,
      _functionRegistry: FunctionRegistry
    ) = this()
  }
  /* static member */
  /* was `typeof HyperFormula` */
  object HyperFormula {
    
    @JSImport("hyperformula", "default.HyperFormula")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Latest build date.
      *
      * @category Static Properties
      */
    @JSImport("hyperformula", "default.HyperFormula.buildDate")
    @js.native
    def buildDate: String = js.native
    inline def buildDate_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("buildDate")(x.asInstanceOf[js.Any])
    
    /**
      * Builds an empty engine instance.
      * Can be configured with the optional parameter that represents a [[ConfigParams]].
      * If not specified the engine will be built with the default configuration.
      *
      * @param {Partial<ConfigParams>} configInput - engine configuration
      * @param {SerializedNamedExpression[]} namedExpressions - starting named expressions
      *
      * @example
      * ```js
      * // build with no initial data and with optional config parameter maxColumns
      * const hfInstance = HyperFormula.buildEmpty({ maxColumns: 1000 });
      * ```
      *
      * @category Factories
      */
    inline def buildEmpty(): typings.hyperformula.typingsHyperFormulaMod.HyperFormula = ^.asInstanceOf[js.Dynamic].applyDynamic("buildEmpty")().asInstanceOf[typings.hyperformula.typingsHyperFormulaMod.HyperFormula]
    inline def buildEmpty(configInput: Unit, namedExpressions: js.Array[SerializedNamedExpression]): typings.hyperformula.typingsHyperFormulaMod.HyperFormula = (^.asInstanceOf[js.Dynamic].applyDynamic("buildEmpty")(configInput.asInstanceOf[js.Any], namedExpressions.asInstanceOf[js.Any])).asInstanceOf[typings.hyperformula.typingsHyperFormulaMod.HyperFormula]
    inline def buildEmpty(configInput: PartialConfigParams): typings.hyperformula.typingsHyperFormulaMod.HyperFormula = ^.asInstanceOf[js.Dynamic].applyDynamic("buildEmpty")(configInput.asInstanceOf[js.Any]).asInstanceOf[typings.hyperformula.typingsHyperFormulaMod.HyperFormula]
    inline def buildEmpty(configInput: PartialConfigParams, namedExpressions: js.Array[SerializedNamedExpression]): typings.hyperformula.typingsHyperFormulaMod.HyperFormula = (^.asInstanceOf[js.Dynamic].applyDynamic("buildEmpty")(configInput.asInstanceOf[js.Any], namedExpressions.asInstanceOf[js.Any])).asInstanceOf[typings.hyperformula.typingsHyperFormulaMod.HyperFormula]
    
    /**
      * Builds the engine for a sheet from a two-dimensional array representation.
      * The engine is created with a single sheet.
      * Can be configured with the optional second parameter that represents a [[ConfigParams]].
      * If not specified, the engine will be built with the default configuration.
      *
      * @param {Sheet} sheet - two-dimensional array representation of sheet
      * @param {Partial<ConfigParams>} configInput - engine configuration
      * @param {SerializedNamedExpression[]} namedExpressions - starting named expressions
      *
      * @throws [[SheetSizeLimitExceededError]] when sheet size exceeds the limits
      * @throws [[InvalidArgumentsError]] when sheet is not an array of arrays
      * @throws [[FunctionPluginValidationError]] when plugin class definition is not consistent with metadata
      *
      * @example
      * ```js
      * // data represented as an array
      * const sheetData = [
      *  ['0', '=SUM(1,2,3)', '52'],
      *  ['=SUM(A1:C1)', '', '=A1'],
      *  ['2', '=SUM(A1:C1)', '91'],
      * ];
      *
      * // method with optional config parameter maxColumns
      * const hfInstance = HyperFormula.buildFromArray(sheetData, { maxColumns: 1000 });
      * ```
      *
      * @category Factories
      */
    inline def buildFromArray(sheet: Sheet): typings.hyperformula.typingsHyperFormulaMod.HyperFormula = ^.asInstanceOf[js.Dynamic].applyDynamic("buildFromArray")(sheet.asInstanceOf[js.Any]).asInstanceOf[typings.hyperformula.typingsHyperFormulaMod.HyperFormula]
    inline def buildFromArray(sheet: Sheet, configInput: Unit, namedExpressions: js.Array[SerializedNamedExpression]): typings.hyperformula.typingsHyperFormulaMod.HyperFormula = (^.asInstanceOf[js.Dynamic].applyDynamic("buildFromArray")(sheet.asInstanceOf[js.Any], configInput.asInstanceOf[js.Any], namedExpressions.asInstanceOf[js.Any])).asInstanceOf[typings.hyperformula.typingsHyperFormulaMod.HyperFormula]
    inline def buildFromArray(sheet: Sheet, configInput: PartialConfigParams): typings.hyperformula.typingsHyperFormulaMod.HyperFormula = (^.asInstanceOf[js.Dynamic].applyDynamic("buildFromArray")(sheet.asInstanceOf[js.Any], configInput.asInstanceOf[js.Any])).asInstanceOf[typings.hyperformula.typingsHyperFormulaMod.HyperFormula]
    inline def buildFromArray(
      sheet: Sheet,
      configInput: PartialConfigParams,
      namedExpressions: js.Array[SerializedNamedExpression]
    ): typings.hyperformula.typingsHyperFormulaMod.HyperFormula = (^.asInstanceOf[js.Dynamic].applyDynamic("buildFromArray")(sheet.asInstanceOf[js.Any], configInput.asInstanceOf[js.Any], namedExpressions.asInstanceOf[js.Any])).asInstanceOf[typings.hyperformula.typingsHyperFormulaMod.HyperFormula]
    
    @JSImport("hyperformula", "default.HyperFormula.buildFromEngineState")
    @js.native
    def buildFromEngineState: Any = js.native
    inline def buildFromEngineState_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("buildFromEngineState")(x.asInstanceOf[js.Any])
    
    /**
      * Builds the engine from an object containing multiple sheets with names.
      * The engine is created with one or more sheets.
      * Can be configured with the optional second parameter that represents a [[ConfigParams]].
      * If not specified the engine will be built with the default configuration.
      *
      * @param {Sheet} sheets - object with sheets definition
      * @param {Partial<ConfigParams>} configInput - engine configuration
      * @param {SerializedNamedExpression[]} namedExpressions - starting named expressions
      *
      * @throws [[SheetSizeLimitExceededError]] when sheet size exceeds the limits
      * @throws [[InvalidArgumentsError]] when any sheet is not an array of arrays
      * @throws [[FunctionPluginValidationError]] when plugin class definition is not consistent with metadata
      *
      * @example
      * ```js
      * // data represented as an object with sheets: Sheet1 and Sheet2
      * const sheetData = {
      *  'Sheet1': [
      *    ['1', '', '=Sheet2!$A1'],
      *    ['', '2', '=SUM(1,2,3)'],
      *    ['=Sheet2!$A2', '2', ''],
      *   ],
      *  'Sheet2': [
      *    ['', '4', '=Sheet1!$B1'],
      *    ['', '8', '=SUM(9,3,3)'],
      *    ['=Sheet1!$B1', '2', ''],
      *   ],
      * };
      *
      * // method with optional config parameter useColumnIndex
      * const hfInstance = HyperFormula.buildFromSheets(sheetData, { useColumnIndex: true });
      * ```
      *
      * @category Factories
      */
    inline def buildFromSheets(sheets: Sheets): typings.hyperformula.typingsHyperFormulaMod.HyperFormula = ^.asInstanceOf[js.Dynamic].applyDynamic("buildFromSheets")(sheets.asInstanceOf[js.Any]).asInstanceOf[typings.hyperformula.typingsHyperFormulaMod.HyperFormula]
    inline def buildFromSheets(sheets: Sheets, configInput: Unit, namedExpressions: js.Array[SerializedNamedExpression]): typings.hyperformula.typingsHyperFormulaMod.HyperFormula = (^.asInstanceOf[js.Dynamic].applyDynamic("buildFromSheets")(sheets.asInstanceOf[js.Any], configInput.asInstanceOf[js.Any], namedExpressions.asInstanceOf[js.Any])).asInstanceOf[typings.hyperformula.typingsHyperFormulaMod.HyperFormula]
    inline def buildFromSheets(sheets: Sheets, configInput: PartialConfigParams): typings.hyperformula.typingsHyperFormulaMod.HyperFormula = (^.asInstanceOf[js.Dynamic].applyDynamic("buildFromSheets")(sheets.asInstanceOf[js.Any], configInput.asInstanceOf[js.Any])).asInstanceOf[typings.hyperformula.typingsHyperFormulaMod.HyperFormula]
    inline def buildFromSheets(
      sheets: Sheets,
      configInput: PartialConfigParams,
      namedExpressions: js.Array[SerializedNamedExpression]
    ): typings.hyperformula.typingsHyperFormulaMod.HyperFormula = (^.asInstanceOf[js.Dynamic].applyDynamic("buildFromSheets")(sheets.asInstanceOf[js.Any], configInput.asInstanceOf[js.Any], namedExpressions.asInstanceOf[js.Any])).asInstanceOf[typings.hyperformula.typingsHyperFormulaMod.HyperFormula]
    
    /**
      * Returns classes of all plugins registered in HyperFormula.
      *
      * @example
      * ```js
      * // return classes of all plugins
      * const allClasses = HyperFormula.getAllFunctionPlugins();
      * ```
      *
      * @category Static Methods
      */
    inline def getAllFunctionPlugins(): js.Array[FunctionPluginDefinition] = ^.asInstanceOf[js.Dynamic].applyDynamic("getAllFunctionPlugins")().asInstanceOf[js.Array[FunctionPluginDefinition]]
    
    /**
      * Returns class of a plugin used by function with given id
      *
      * @param {string} functionId - id of a function, e.g. 'SUMIF'
      *
      * @throws [[ExpectedValueOfTypeError]] if any of its basic type argument is of wrong type
      *
      * @example
      * ```js
      * // import your own plugin
      * import { MyExamplePlugin } from './file_with_your_plugin';
      *
      * // register a plugin
      * HyperFormula.registerFunctionPlugin(MyExamplePlugin);
      *
      * // return the class of a given plugin
      * const myFunctionClass = HyperFormula.getFunctionPlugin('EXAMPLE');
      * ```
      *
      * @category Static Methods
      */
    inline def getFunctionPlugin(functionId: String): js.UndefOr[FunctionPluginDefinition] = ^.asInstanceOf[js.Dynamic].applyDynamic("getFunctionPlugin")(functionId.asInstanceOf[js.Any]).asInstanceOf[js.UndefOr[FunctionPluginDefinition]]
    
    /**
      * Returns registered language from its code string.
      *
      * @param {string} languageCode - code string of the translation package
      *
      * @throws [[ExpectedValueOfTypeError]] if any of its basic type argument is of wrong type
      * @throws [[LanguageNotRegisteredError]] when trying to retrieve not registered language
      *
      * @example
      * ```js
      * // return registered language
      * const language = HyperFormula.getLanguage('enGB');
      * ```
      *
      * @category Static Methods
      */
    inline def getLanguage(languageCode: String): TranslationPackage = ^.asInstanceOf[js.Dynamic].applyDynamic("getLanguage")(languageCode.asInstanceOf[js.Any]).asInstanceOf[TranslationPackage]
    
    /**
      * Returns translated names of all registered functions for a given language
      *
      * @param {string} code - language code
      *
      * @throws [[ExpectedValueOfTypeError]] if any of its basic type argument is of wrong type
      *
      * @example
      * ```js
      * // return a list of function names registered for enGB
      * const allNames = HyperFormula.getRegisteredFunctionNames('enGB');
      * ```
      *
      * @category Static Methods
      */
    inline def getRegisteredFunctionNames(code: String): js.Array[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("getRegisteredFunctionNames")(code.asInstanceOf[js.Any]).asInstanceOf[js.Array[String]]
    
    /**
      * Returns all registered languages codes.
      *
      * @example
      * ```js
      * // should return all registered language codes: ['enGB', 'plPL']
      * const registeredLanguages = HyperFormula.getRegisteredLanguagesCodes();
      * ```
      *
      * @category Static Methods
      */
    inline def getRegisteredLanguagesCodes(): js.Array[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("getRegisteredLanguagesCodes")().asInstanceOf[js.Array[String]]
    
    /**
      * Contains all available languages to use in registerLanguage.
      *
      * @category Static Properties
      */
    @JSImport("hyperformula", "default.HyperFormula.languages")
    @js.native
    def languages: Record[String, RawTranslationPackage] = js.native
    inline def languages_=(x: Record[String, RawTranslationPackage]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("languages")(x.asInstanceOf[js.Any])
    
    /**
      * Registers a function with a given id if such exists in a plugin.
      *
      * Note: This method does not affect the existing HyperFormula instances.
      *
      * @param {string} functionId - function id, e.g. 'SUMIF'
      * @param {FunctionPluginDefinition} plugin - plugin class
      * @param translations
      *
      * @throws [[ExpectedValueOfTypeError]] if any of its basic type argument is of wrong type
      * @throws [[FunctionPluginValidationError]] when function with a given id does not exist in plugin or plugin class definition is not consistent with metadata
      * @throws [[ProtectedFunctionTranslationError]] when trying to register translation for protected function
      *
      * @example
      * ```js
      * // import your own plugin
      * import { MyExamplePlugin } from './file_with_your_plugin';
      *
      * // register a function
      * HyperFormula.registerFunction('EXAMPLE', MyExamplePlugin);
      * ```
      *
      * @category Static Methods
      */
    inline def registerFunction(functionId: String, plugin: FunctionPluginDefinition): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("registerFunction")(functionId.asInstanceOf[js.Any], plugin.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def registerFunction(functionId: String, plugin: FunctionPluginDefinition, translations: FunctionTranslationsPackage): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("registerFunction")(functionId.asInstanceOf[js.Any], plugin.asInstanceOf[js.Any], translations.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    /**
      * Registers all functions in a given plugin with optional translations.
      *
      * Note: This method does not affect the existing HyperFormula instances.
      *
      * @param {FunctionPluginDefinition} plugin - plugin class
      * @param {FunctionTranslationsPackage} translations - optional package of function names translations
      *
      * @throws [[FunctionPluginValidationError]] when plugin class definition is not consistent with metadata
      * @throws [[ProtectedFunctionTranslationError]] when trying to register translation for protected function
      *
      * @example
      * ```js
      * // import your own plugin
      * import { MyExamplePlugin } from './file_with_your_plugin';
      *
      * // register the plugin
      * HyperFormula.registerFunctionPlugin(MyExamplePlugin);
      * ```
      *
      * @category Static Methods
      */
    inline def registerFunctionPlugin(plugin: FunctionPluginDefinition): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("registerFunctionPlugin")(plugin.asInstanceOf[js.Any]).asInstanceOf[Unit]
    inline def registerFunctionPlugin(plugin: FunctionPluginDefinition, translations: FunctionTranslationsPackage): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("registerFunctionPlugin")(plugin.asInstanceOf[js.Any], translations.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    /**
      * Registers language from under given code string.
      *
      * @param {string} languageCode - code string of the translation package
      * @param {RawTranslationPackage} languagePackage - translation package to be registered
      *
      * @throws [[ExpectedValueOfTypeError]] if any of its basic type argument is of wrong type
      * @throws [[ProtectedFunctionTranslationError]] when trying to register translation for protected function
      * @throws [[LanguageAlreadyRegisteredError]] when given language is already registered
      *
      * @example
      * ```js
      * // return registered language
      * HyperFormula.registerLanguage('plPL', plPL);
      * const engine = HyperFormula.buildEmpty({language: 'plPL'});
      * ```
      *
      * @category Static Methods
      */
    inline def registerLanguage(languageCode: String, languagePackage: RawTranslationPackage): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("registerLanguage")(languageCode.asInstanceOf[js.Any], languagePackage.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    @JSImport("hyperformula", "default.HyperFormula.registeredLanguages")
    @js.native
    def registeredLanguages: Any = js.native
    inline def registeredLanguages_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("registeredLanguages")(x.asInstanceOf[js.Any])
    
    /**
      * A release date.
      *
      * @category Static Properties
      */
    @JSImport("hyperformula", "default.HyperFormula.releaseDate")
    @js.native
    def releaseDate: String = js.native
    inline def releaseDate_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("releaseDate")(x.asInstanceOf[js.Any])
    
    /**
      * Clears function registry.
      *
      * Note: This method does not affect the existing HyperFormula instances.
      *
      * @example
      * ```js
      * HyperFormula.unregisterAllFunctions();
      * ```
      *
      * @category Static Methods
      */
    inline def unregisterAllFunctions(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("unregisterAllFunctions")().asInstanceOf[Unit]
    
    /**
      * Unregisters a function with a given id.
      *
      * Note: This method does not affect the existing HyperFormula instances.
      *
      * @param {string} functionId - function id, e.g. 'SUMIF'
      *
      * @throws [[ExpectedValueOfTypeError]] if any of its basic type argument is of wrong type
      *
      * @example
      * ```js
      * // import your own plugin
      * import { MyExamplePlugin } from './file_with_your_plugin';
      *
      * // register a function
      * HyperFormula.registerFunction('EXAMPLE', MyExamplePlugin);
      *
      * // unregister a function
      * HyperFormula.unregisterFunction('EXAMPLE');
      * ```
      *
      * @category Static Methods
      */
    inline def unregisterFunction(functionId: String): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("unregisterFunction")(functionId.asInstanceOf[js.Any]).asInstanceOf[Unit]
    
    /**
      * Unregisters all functions defined in given plugin.
      *
      * Note: This method does not affect the existing HyperFormula instances.
      *
      * @param {FunctionPluginDefinition} plugin - plugin class
      *
      * @example
      * ```js
      * // get the class of a plugin
      * const registeredPluginClass = HyperFormula.getFunctionPlugin('EXAMPLE');
      *
      * // unregister all functions defined in a plugin of ID 'EXAMPLE'
      * HyperFormula.unregisterFunctionPlugin(registeredPluginClass);
      * ```
      *
      * @category Static Methods
      */
    inline def unregisterFunctionPlugin(plugin: FunctionPluginDefinition): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("unregisterFunctionPlugin")(plugin.asInstanceOf[js.Any]).asInstanceOf[Unit]
    
    /**
      * Unregisters language that is registered under given code string.
      *
      * @param {string} languageCode - code string of the translation package
      *
      * @throws [[ExpectedValueOfTypeError]] if any of its basic type argument is of wrong type
      * @throws [[LanguageNotRegisteredError]] when given language is not registered
      *
      * @example
      * ```js
      * // register the language for the instance
      * HyperFormula.registerLanguage('plPL', plPL);
      *
      * // unregister plPL
      * HyperFormula.unregisterLanguage('plPL');
      * ```
      *
      * @category Static Methods
      */
    inline def unregisterLanguage(languageCode: String): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("unregisterLanguage")(languageCode.asInstanceOf[js.Any]).asInstanceOf[Unit]
    
    /**
      * Version of the HyperFormula.
      *
      * @category Static Properties
      */
    @JSImport("hyperformula", "default.HyperFormula.version")
    @js.native
    def version: String = js.native
    inline def version_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("version")(x.asInstanceOf[js.Any])
  }
  
  /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
  @JSImport("hyperformula", "default.InvalidAddressError")
  @js.native
  open class InvalidAddressError protected ()
    extends typings.hyperformula.typingsErrorsMod.InvalidAddressError {
    def this(address: SimpleCellAddress_) = this()
  }
  /* static member */
  /* was `typeof InvalidAddressError` */
  @JSImport("hyperformula", "default.InvalidAddressError")
  @js.native
  def InvalidAddressError: Instantiable1[
    /* address */ SimpleCellAddress_, 
    typings.hyperformula.typingsErrorsMod.InvalidAddressError
  ] = js.native
  inline def InvalidAddressError_=(
    x: Instantiable1[
      /* address */ SimpleCellAddress_, 
      typings.hyperformula.typingsErrorsMod.InvalidAddressError
    ]
  ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("InvalidAddressError")(x.asInstanceOf[js.Any])
  
  /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
  @JSImport("hyperformula", "default.InvalidArgumentsError")
  @js.native
  open class InvalidArgumentsError protected ()
    extends typings.hyperformula.typingsErrorsMod.InvalidArgumentsError {
    def this(expectedArguments: String) = this()
  }
  /* static member */
  /* was `typeof InvalidArgumentsError` */
  @JSImport("hyperformula", "default.InvalidArgumentsError")
  @js.native
  def InvalidArgumentsError: Instantiable1[
    /* expectedArguments */ String, 
    typings.hyperformula.typingsErrorsMod.InvalidArgumentsError
  ] = js.native
  inline def InvalidArgumentsError_=(
    x: Instantiable1[
      /* expectedArguments */ String, 
      typings.hyperformula.typingsErrorsMod.InvalidArgumentsError
    ]
  ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("InvalidArgumentsError")(x.asInstanceOf[js.Any])
  
  /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
  @JSImport("hyperformula", "default.LanguageAlreadyRegisteredError")
  @js.native
  open class LanguageAlreadyRegisteredError ()
    extends typings.hyperformula.typingsErrorsMod.LanguageAlreadyRegisteredError
  /* static member */
  /* was `typeof LanguageAlreadyRegisteredError` */
  @JSImport("hyperformula", "default.LanguageAlreadyRegisteredError")
  @js.native
  def LanguageAlreadyRegisteredError: Instantiable0[typings.hyperformula.typingsErrorsMod.LanguageAlreadyRegisteredError] = js.native
  inline def LanguageAlreadyRegisteredError_=(x: Instantiable0[typings.hyperformula.typingsErrorsMod.LanguageAlreadyRegisteredError]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("LanguageAlreadyRegisteredError")(x.asInstanceOf[js.Any])
  
  /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
  @JSImport("hyperformula", "default.LanguageNotRegisteredError")
  @js.native
  open class LanguageNotRegisteredError ()
    extends typings.hyperformula.typingsErrorsMod.LanguageNotRegisteredError
  /* static member */
  /* was `typeof LanguageNotRegisteredError` */
  @JSImport("hyperformula", "default.LanguageNotRegisteredError")
  @js.native
  def LanguageNotRegisteredError: Instantiable0[typings.hyperformula.typingsErrorsMod.LanguageNotRegisteredError] = js.native
  inline def LanguageNotRegisteredError_=(x: Instantiable0[typings.hyperformula.typingsErrorsMod.LanguageNotRegisteredError]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("LanguageNotRegisteredError")(x.asInstanceOf[js.Any])
  
  /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
  @JSImport("hyperformula", "default.MissingTranslationError")
  @js.native
  open class MissingTranslationError protected ()
    extends typings.hyperformula.typingsErrorsMod.MissingTranslationError {
    def this(key: String) = this()
  }
  /* static member */
  /* was `typeof MissingTranslationError` */
  @JSImport("hyperformula", "default.MissingTranslationError")
  @js.native
  def MissingTranslationError: Instantiable1[/* key */ String, typings.hyperformula.typingsErrorsMod.MissingTranslationError] = js.native
  inline def MissingTranslationError_=(x: Instantiable1[/* key */ String, typings.hyperformula.typingsErrorsMod.MissingTranslationError]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("MissingTranslationError")(x.asInstanceOf[js.Any])
  
  /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
  @JSImport("hyperformula", "default.NamedExpressionDoesNotExistError")
  @js.native
  open class NamedExpressionDoesNotExistError protected ()
    extends typings.hyperformula.typingsErrorsMod.NamedExpressionDoesNotExistError {
    def this(expressionName: String) = this()
  }
  /* static member */
  /* was `typeof NamedExpressionDoesNotExistError` */
  @JSImport("hyperformula", "default.NamedExpressionDoesNotExistError")
  @js.native
  def NamedExpressionDoesNotExistError: Instantiable1[
    /* expressionName */ String, 
    typings.hyperformula.typingsErrorsMod.NamedExpressionDoesNotExistError
  ] = js.native
  inline def NamedExpressionDoesNotExistError_=(
    x: Instantiable1[
      /* expressionName */ String, 
      typings.hyperformula.typingsErrorsMod.NamedExpressionDoesNotExistError
    ]
  ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("NamedExpressionDoesNotExistError")(x.asInstanceOf[js.Any])
  
  /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
  @JSImport("hyperformula", "default.NamedExpressionNameIsAlreadyTakenError")
  @js.native
  open class NamedExpressionNameIsAlreadyTakenError protected ()
    extends typings.hyperformula.typingsErrorsMod.NamedExpressionNameIsAlreadyTakenError {
    def this(expressionName: String) = this()
  }
  /* static member */
  /* was `typeof NamedExpressionNameIsAlreadyTakenError` */
  @JSImport("hyperformula", "default.NamedExpressionNameIsAlreadyTakenError")
  @js.native
  def NamedExpressionNameIsAlreadyTakenError: Instantiable1[
    /* expressionName */ String, 
    typings.hyperformula.typingsErrorsMod.NamedExpressionNameIsAlreadyTakenError
  ] = js.native
  inline def NamedExpressionNameIsAlreadyTakenError_=(
    x: Instantiable1[
      /* expressionName */ String, 
      typings.hyperformula.typingsErrorsMod.NamedExpressionNameIsAlreadyTakenError
    ]
  ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("NamedExpressionNameIsAlreadyTakenError")(x.asInstanceOf[js.Any])
  
  /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
  @JSImport("hyperformula", "default.NamedExpressionNameIsInvalidError")
  @js.native
  open class NamedExpressionNameIsInvalidError protected ()
    extends typings.hyperformula.typingsErrorsMod.NamedExpressionNameIsInvalidError {
    def this(expressionName: String) = this()
  }
  /* static member */
  /* was `typeof NamedExpressionNameIsInvalidError` */
  @JSImport("hyperformula", "default.NamedExpressionNameIsInvalidError")
  @js.native
  def NamedExpressionNameIsInvalidError: Instantiable1[
    /* expressionName */ String, 
    typings.hyperformula.typingsErrorsMod.NamedExpressionNameIsInvalidError
  ] = js.native
  inline def NamedExpressionNameIsInvalidError_=(
    x: Instantiable1[
      /* expressionName */ String, 
      typings.hyperformula.typingsErrorsMod.NamedExpressionNameIsInvalidError
    ]
  ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("NamedExpressionNameIsInvalidError")(x.asInstanceOf[js.Any])
  
  /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
  @JSImport("hyperformula", "default.NoOperationToRedoError")
  @js.native
  open class NoOperationToRedoError ()
    extends typings.hyperformula.typingsErrorsMod.NoOperationToRedoError
  /* static member */
  /* was `typeof NoOperationToRedoError` */
  @JSImport("hyperformula", "default.NoOperationToRedoError")
  @js.native
  def NoOperationToRedoError: Instantiable0[typings.hyperformula.typingsErrorsMod.NoOperationToRedoError] = js.native
  inline def NoOperationToRedoError_=(x: Instantiable0[typings.hyperformula.typingsErrorsMod.NoOperationToRedoError]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("NoOperationToRedoError")(x.asInstanceOf[js.Any])
  
  /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
  @JSImport("hyperformula", "default.NoOperationToUndoError")
  @js.native
  open class NoOperationToUndoError ()
    extends typings.hyperformula.typingsErrorsMod.NoOperationToUndoError
  /* static member */
  /* was `typeof NoOperationToUndoError` */
  @JSImport("hyperformula", "default.NoOperationToUndoError")
  @js.native
  def NoOperationToUndoError: Instantiable0[typings.hyperformula.typingsErrorsMod.NoOperationToUndoError] = js.native
  inline def NoOperationToUndoError_=(x: Instantiable0[typings.hyperformula.typingsErrorsMod.NoOperationToUndoError]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("NoOperationToUndoError")(x.asInstanceOf[js.Any])
  
  /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
  @JSImport("hyperformula", "default.NoRelativeAddressesAllowedError")
  @js.native
  open class NoRelativeAddressesAllowedError ()
    extends typings.hyperformula.typingsErrorsMod.NoRelativeAddressesAllowedError
  /* static member */
  /* was `typeof NoRelativeAddressesAllowedError` */
  @JSImport("hyperformula", "default.NoRelativeAddressesAllowedError")
  @js.native
  def NoRelativeAddressesAllowedError: Instantiable0[typings.hyperformula.typingsErrorsMod.NoRelativeAddressesAllowedError] = js.native
  inline def NoRelativeAddressesAllowedError_=(x: Instantiable0[typings.hyperformula.typingsErrorsMod.NoRelativeAddressesAllowedError]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("NoRelativeAddressesAllowedError")(x.asInstanceOf[js.Any])
  
  /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
  @JSImport("hyperformula", "default.NoSheetWithIdError")
  @js.native
  open class NoSheetWithIdError protected ()
    extends typings.hyperformula.typingsErrorsMod.NoSheetWithIdError {
    def this(sheetId: Double) = this()
  }
  /* static member */
  /* was `typeof NoSheetWithIdError` */
  @JSImport("hyperformula", "default.NoSheetWithIdError")
  @js.native
  def NoSheetWithIdError: Instantiable1[/* sheetId */ Double, typings.hyperformula.typingsErrorsMod.NoSheetWithIdError] = js.native
  inline def NoSheetWithIdError_=(x: Instantiable1[/* sheetId */ Double, typings.hyperformula.typingsErrorsMod.NoSheetWithIdError]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("NoSheetWithIdError")(x.asInstanceOf[js.Any])
  
  /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
  @JSImport("hyperformula", "default.NoSheetWithNameError")
  @js.native
  open class NoSheetWithNameError protected ()
    extends typings.hyperformula.typingsErrorsMod.NoSheetWithNameError {
    def this(sheetName: String) = this()
  }
  /* static member */
  /* was `typeof NoSheetWithNameError` */
  @JSImport("hyperformula", "default.NoSheetWithNameError")
  @js.native
  def NoSheetWithNameError: Instantiable1[/* sheetName */ String, typings.hyperformula.typingsErrorsMod.NoSheetWithNameError] = js.native
  inline def NoSheetWithNameError_=(
    x: Instantiable1[/* sheetName */ String, typings.hyperformula.typingsErrorsMod.NoSheetWithNameError]
  ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("NoSheetWithNameError")(x.asInstanceOf[js.Any])
  
  /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
  @JSImport("hyperformula", "default.NotAFormulaError")
  @js.native
  open class NotAFormulaError ()
    extends typings.hyperformula.typingsErrorsMod.NotAFormulaError
  /* static member */
  /* was `typeof NotAFormulaError` */
  @JSImport("hyperformula", "default.NotAFormulaError")
  @js.native
  def NotAFormulaError: Instantiable0[typings.hyperformula.typingsErrorsMod.NotAFormulaError] = js.native
  inline def NotAFormulaError_=(x: Instantiable0[typings.hyperformula.typingsErrorsMod.NotAFormulaError]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("NotAFormulaError")(x.asInstanceOf[js.Any])
  
  /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
  @JSImport("hyperformula", "default.NothingToPasteError")
  @js.native
  open class NothingToPasteError ()
    extends typings.hyperformula.typingsErrorsMod.NothingToPasteError
  /* static member */
  /* was `typeof NothingToPasteError` */
  @JSImport("hyperformula", "default.NothingToPasteError")
  @js.native
  def NothingToPasteError: Instantiable0[typings.hyperformula.typingsErrorsMod.NothingToPasteError] = js.native
  inline def NothingToPasteError_=(x: Instantiable0[typings.hyperformula.typingsErrorsMod.NothingToPasteError]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("NothingToPasteError")(x.asInstanceOf[js.Any])
  
  /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
  @JSImport("hyperformula", "default.ProtectedFunctionTranslationError")
  @js.native
  open class ProtectedFunctionTranslationError protected ()
    extends typings.hyperformula.typingsErrorsMod.ProtectedFunctionTranslationError {
    def this(key: String) = this()
  }
  /* static member */
  /* was `typeof ProtectedFunctionTranslationError` */
  @JSImport("hyperformula", "default.ProtectedFunctionTranslationError")
  @js.native
  def ProtectedFunctionTranslationError: Instantiable1[
    /* key */ String, 
    typings.hyperformula.typingsErrorsMod.ProtectedFunctionTranslationError
  ] = js.native
  inline def ProtectedFunctionTranslationError_=(
    x: Instantiable1[
      /* key */ String, 
      typings.hyperformula.typingsErrorsMod.ProtectedFunctionTranslationError
    ]
  ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ProtectedFunctionTranslationError")(x.asInstanceOf[js.Any])
  
  /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
  @JSImport("hyperformula", "default.SheetNameAlreadyTakenError")
  @js.native
  open class SheetNameAlreadyTakenError protected ()
    extends typings.hyperformula.typingsErrorsMod.SheetNameAlreadyTakenError {
    def this(sheetName: String) = this()
  }
  /* static member */
  /* was `typeof SheetNameAlreadyTakenError` */
  @JSImport("hyperformula", "default.SheetNameAlreadyTakenError")
  @js.native
  def SheetNameAlreadyTakenError: Instantiable1[
    /* sheetName */ String, 
    typings.hyperformula.typingsErrorsMod.SheetNameAlreadyTakenError
  ] = js.native
  inline def SheetNameAlreadyTakenError_=(
    x: Instantiable1[
      /* sheetName */ String, 
      typings.hyperformula.typingsErrorsMod.SheetNameAlreadyTakenError
    ]
  ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("SheetNameAlreadyTakenError")(x.asInstanceOf[js.Any])
  
  /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
  @JSImport("hyperformula", "default.SheetSizeLimitExceededError")
  @js.native
  open class SheetSizeLimitExceededError ()
    extends typings.hyperformula.typingsErrorsMod.SheetSizeLimitExceededError
  /* static member */
  /* was `typeof SheetSizeLimitExceededError` */
  @JSImport("hyperformula", "default.SheetSizeLimitExceededError")
  @js.native
  def SheetSizeLimitExceededError: Instantiable0[typings.hyperformula.typingsErrorsMod.SheetSizeLimitExceededError] = js.native
  inline def SheetSizeLimitExceededError_=(x: Instantiable0[typings.hyperformula.typingsErrorsMod.SheetSizeLimitExceededError]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("SheetSizeLimitExceededError")(x.asInstanceOf[js.Any])
  
  /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
  @JSImport("hyperformula", "default.SourceLocationHasArrayError")
  @js.native
  open class SourceLocationHasArrayError ()
    extends typings.hyperformula.typingsErrorsMod.SourceLocationHasArrayError
  /* static member */
  /* was `typeof SourceLocationHasArrayError` */
  @JSImport("hyperformula", "default.SourceLocationHasArrayError")
  @js.native
  def SourceLocationHasArrayError: Instantiable0[typings.hyperformula.typingsErrorsMod.SourceLocationHasArrayError] = js.native
  inline def SourceLocationHasArrayError_=(x: Instantiable0[typings.hyperformula.typingsErrorsMod.SourceLocationHasArrayError]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("SourceLocationHasArrayError")(x.asInstanceOf[js.Any])
  
  /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
  @JSImport("hyperformula", "default.TargetLocationHasArrayError")
  @js.native
  open class TargetLocationHasArrayError ()
    extends typings.hyperformula.typingsErrorsMod.TargetLocationHasArrayError
  /* static member */
  /* was `typeof TargetLocationHasArrayError` */
  @JSImport("hyperformula", "default.TargetLocationHasArrayError")
  @js.native
  def TargetLocationHasArrayError: Instantiable0[typings.hyperformula.typingsErrorsMod.TargetLocationHasArrayError] = js.native
  inline def TargetLocationHasArrayError_=(x: Instantiable0[typings.hyperformula.typingsErrorsMod.TargetLocationHasArrayError]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("TargetLocationHasArrayError")(x.asInstanceOf[js.Any])
  
  /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
  @JSImport("hyperformula", "default.UnableToParseError")
  @js.native
  open class UnableToParseError protected ()
    extends typings.hyperformula.typingsErrorsMod.UnableToParseError {
    def this(value: Any) = this()
  }
  /* static member */
  /* was `typeof UnableToParseError` */
  @JSImport("hyperformula", "default.UnableToParseError")
  @js.native
  def UnableToParseError: Instantiable1[/* value */ Any, typings.hyperformula.typingsErrorsMod.UnableToParseError] = js.native
  inline def UnableToParseError_=(x: Instantiable1[/* value */ Any, typings.hyperformula.typingsErrorsMod.UnableToParseError]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("UnableToParseError")(x.asInstanceOf[js.Any])
}
