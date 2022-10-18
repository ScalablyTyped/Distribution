package typings.hyperformula.mod

import typings.hyperformula.anon.PartialConfigParams
import typings.hyperformula.typingsCellContentParserMod.CellContentParser
import typings.hyperformula.typingsConfigMod.Config
import typings.hyperformula.typingsCrudOperationsMod.CrudOperations
import typings.hyperformula.typingsDependencyGraphMod.DependencyGraph
import typings.hyperformula.typingsEvaluatorMod.Evaluator
import typings.hyperformula.typingsExporterMod.Exporter
import typings.hyperformula.typingsI18nMod.TranslationPackage
import typings.hyperformula.typingsI18nTranslationPackageMod.RawTranslationPackage
import typings.hyperformula.typingsInterpreterFunctionRegistryMod.FunctionRegistry
import typings.hyperformula.typingsInterpreterFunctionRegistryMod.FunctionTranslationsPackage
import typings.hyperformula.typingsInterpreterPluginFunctionPluginMod.FunctionPluginDefinition
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

@JSImport("hyperformula", "HyperFormula")
@js.native
open class HyperFormula protected ()
  extends typings.hyperformula.typingsHyperFormulaMod.HyperFormula {
  /* protected */ def this(
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
/* static members */
object HyperFormula {
  
  @JSImport("hyperformula", "HyperFormula")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Latest build date.
    *
    * @category Static Properties
    */
  @JSImport("hyperformula", "HyperFormula.buildDate")
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
  
  @JSImport("hyperformula", "HyperFormula.buildFromEngineState")
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
  @JSImport("hyperformula", "HyperFormula.languages")
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
  
  @JSImport("hyperformula", "HyperFormula.registeredLanguages")
  @js.native
  def registeredLanguages: Any = js.native
  inline def registeredLanguages_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("registeredLanguages")(x.asInstanceOf[js.Any])
  
  /**
    * A release date.
    *
    * @category Static Properties
    */
  @JSImport("hyperformula", "HyperFormula.releaseDate")
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
  @JSImport("hyperformula", "HyperFormula.version")
  @js.native
  def version: String = js.native
  inline def version_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("version")(x.asInstanceOf[js.Any])
}
