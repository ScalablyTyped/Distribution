package typings.handsontable.anon

import org.scalablytyped.runtime.Instantiable14
import typings.hyperformula.anon.PartialConfigParams
import typings.hyperformula.cellContentParserMod.CellContentParser
import typings.hyperformula.configMod.Config
import typings.hyperformula.configMod.ConfigParams
import typings.hyperformula.crudOperationsMod.CrudOperations
import typings.hyperformula.dependencyGraphMod.DependencyGraph
import typings.hyperformula.evaluatorMod.Evaluator
import typings.hyperformula.exporterMod.Exporter
import typings.hyperformula.functionPluginMod.FunctionPluginDefinition
import typings.hyperformula.functionRegistryMod.FunctionRegistry
import typings.hyperformula.functionRegistryMod.FunctionTranslationsPackage
import typings.hyperformula.i18nMod.TranslationPackage
import typings.hyperformula.lazilyTransformingAstServiceMod.LazilyTransformingAstService
import typings.hyperformula.mod.HyperFormula
import typings.hyperformula.namedExpressionsMod.NamedExpressions
import typings.hyperformula.searchStrategyMod.ColumnSearchStrategy
import typings.hyperformula.serializationMod.Serialization
import typings.hyperformula.serializationMod.SerializedNamedExpression
import typings.hyperformula.sheetMod.Sheet
import typings.hyperformula.sheetMod.Sheets
import typings.hyperformula.statisticsMod.Statistics
import typings.hyperformula.translationPackageMod.RawTranslationPackage
import typings.hyperformula.typingsParserMod.ParserWithCaching
import typings.hyperformula.typingsParserMod.Unparser
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TypeofHyperFormula
  extends StObject
     with Instantiable14[
      /* _config */ Config, 
      /* _stats */ Statistics, 
      /* _dependencyGraph */ DependencyGraph, 
      /* _columnSearch */ ColumnSearchStrategy, 
      /* _parser */ ParserWithCaching, 
      /* _unparser */ Unparser, 
      /* _cellContentParser */ CellContentParser, 
      /* _evaluator */ Evaluator, 
      /* _lazilyTransformingAstService */ LazilyTransformingAstService, 
      /* _crudOperations */ CrudOperations, 
      /* _exporter */ Exporter, 
      /* _namedExpressions */ NamedExpressions, 
      /* _serialization */ Serialization, 
      /* _functionRegistry */ FunctionRegistry, 
      HyperFormula
    ] {
  
  /**
    * Latest build date.
    *
    * @category Static Properties
    */
  var buildDate: String = js.native
  
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
  def buildEmpty(): typings.hyperformula.hyperFormulaMod.HyperFormula = js.native
  def buildEmpty(configInput: Unit, namedExpressions: js.Array[SerializedNamedExpression]): typings.hyperformula.hyperFormulaMod.HyperFormula = js.native
  def buildEmpty(configInput: PartialConfigParams): typings.hyperformula.hyperFormulaMod.HyperFormula = js.native
  def buildEmpty(configInput: PartialConfigParams, namedExpressions: js.Array[SerializedNamedExpression]): typings.hyperformula.hyperFormulaMod.HyperFormula = js.native
  
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
  def buildFromArray(sheet: Sheet): typings.hyperformula.hyperFormulaMod.HyperFormula = js.native
  def buildFromArray(sheet: Sheet, configInput: Unit, namedExpressions: js.Array[SerializedNamedExpression]): typings.hyperformula.hyperFormulaMod.HyperFormula = js.native
  def buildFromArray(sheet: Sheet, configInput: PartialConfigParams): typings.hyperformula.hyperFormulaMod.HyperFormula = js.native
  def buildFromArray(
    sheet: Sheet,
    configInput: PartialConfigParams,
    namedExpressions: js.Array[SerializedNamedExpression]
  ): typings.hyperformula.hyperFormulaMod.HyperFormula = js.native
  
  /* private */ var buildFromEngineState: Any = js.native
  
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
  def buildFromSheets(sheets: Sheets): typings.hyperformula.hyperFormulaMod.HyperFormula = js.native
  def buildFromSheets(sheets: Sheets, configInput: Unit, namedExpressions: js.Array[SerializedNamedExpression]): typings.hyperformula.hyperFormulaMod.HyperFormula = js.native
  def buildFromSheets(sheets: Sheets, configInput: PartialConfigParams): typings.hyperformula.hyperFormulaMod.HyperFormula = js.native
  def buildFromSheets(
    sheets: Sheets,
    configInput: PartialConfigParams,
    namedExpressions: js.Array[SerializedNamedExpression]
  ): typings.hyperformula.hyperFormulaMod.HyperFormula = js.native
  
  /**
    * Returns all of HyperFormula's default [configuration options](../../guide/configuration-options.md).
    *
    * @example
    * ```js
    * // returns all default configuration options
    * const defaultConfig = HyperFormula.defaultConfig;
    * ```
    *
    * @category Static Accessors
    */
  def defaultConfig: ConfigParams = js.native
  
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
  def getAllFunctionPlugins(): js.Array[FunctionPluginDefinition] = js.native
  
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
  def getFunctionPlugin(functionId: String): js.UndefOr[FunctionPluginDefinition] = js.native
  
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
  def getLanguage(languageCode: String): TranslationPackage = js.native
  
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
  def getRegisteredFunctionNames(code: String): js.Array[String] = js.native
  
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
  def getRegisteredLanguagesCodes(): js.Array[String] = js.native
  
  /**
    * Contains all available languages to use in registerLanguage.
    *
    * @category Static Properties
    */
  var languages: Record[String, RawTranslationPackage] = js.native
  
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
  def registerFunction(functionId: String, plugin: FunctionPluginDefinition): Unit = js.native
  def registerFunction(functionId: String, plugin: FunctionPluginDefinition, translations: FunctionTranslationsPackage): Unit = js.native
  
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
  def registerFunctionPlugin(plugin: FunctionPluginDefinition): Unit = js.native
  def registerFunctionPlugin(plugin: FunctionPluginDefinition, translations: FunctionTranslationsPackage): Unit = js.native
  
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
  def registerLanguage(languageCode: String, languagePackage: RawTranslationPackage): Unit = js.native
  
  /* private */ var registeredLanguages: Any = js.native
  
  /**
    * A release date.
    *
    * @category Static Properties
    */
  var releaseDate: String = js.native
  
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
  def unregisterAllFunctions(): Unit = js.native
  
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
  def unregisterFunction(functionId: String): Unit = js.native
  
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
  def unregisterFunctionPlugin(plugin: FunctionPluginDefinition): Unit = js.native
  
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
  def unregisterLanguage(languageCode: String): Unit = js.native
  
  /**
    * Version of the HyperFormula.
    *
    * @category Static Properties
    */
  var version: String = js.native
}
