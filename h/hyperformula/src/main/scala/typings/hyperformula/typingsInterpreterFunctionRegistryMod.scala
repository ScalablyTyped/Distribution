package typings.hyperformula

import typings.hyperformula.typingsConfigMod.Config
import typings.hyperformula.typingsI18nMod.TranslationSet
import typings.hyperformula.typingsInterpreterInterpreterMod.Interpreter
import typings.hyperformula.typingsInterpreterPluginFunctionPluginMod.FunctionMetadata
import typings.hyperformula.typingsInterpreterPluginFunctionPluginMod.FunctionPluginDefinition
import typings.hyperformula.typingsInterpreterPluginFunctionPluginMod.PluginArraySizeFunctionType
import typings.hyperformula.typingsInterpreterPluginFunctionPluginMod.PluginFunctionType
import typings.hyperformula.typingsMaybeMod.Maybe
import typings.std.Map
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typingsInterpreterFunctionRegistryMod {
  
  @JSImport("hyperformula/typings/interpreter/FunctionRegistry", "FunctionRegistry")
  @js.native
  open class FunctionRegistry protected () extends StObject {
    def this(config: Config) = this()
    
    /* private */ val arrayFunctions: Any = js.native
    
    /* private */ val arraySizeFunctions: Any = js.native
    
    /* private */ var categorizeFunction: Any = js.native
    
    /* private */ var config: Any = js.native
    
    def doesFunctionNeedArgumentToBeComputed(functionId: String): Boolean = js.native
    
    /* private */ val functions: Any = js.native
    
    /* private */ val functionsMetadata: Any = js.native
    
    /* private */ val functionsWhichDoesNotNeedArgumentsToBeComputed: Any = js.native
    
    def getArraySizeFunction(functionId: String): Maybe[PluginArraySizeFunctionType] = js.native
    
    def getFunction(functionId: String): Maybe[PluginFunctionType] = js.native
    
    def getFunctionPlugin(functionId: String): Maybe[FunctionPluginDefinition] = js.native
    
    def getMetadata(functionId: String): Maybe[FunctionMetadata] = js.native
    
    def getPlugins(): js.Array[FunctionPluginDefinition] = js.native
    
    def getRegisteredFunctionIds(): js.Array[String] = js.native
    
    def initializePlugins(interpreter: Interpreter): Unit = js.native
    
    /* private */ val instancePlugins: Any = js.native
    
    def isArrayFunction(functionId: String): Boolean = js.native
    
    def isFunctionDependentOnSheetStructureChange(functionId: String): Boolean = js.native
    
    def isFunctionVolatile(functionId: String): Boolean = js.native
    
    /* private */ val structuralChangeFunctions: Any = js.native
    
    /* private */ val volatileFunctions: Any = js.native
  }
  /* static members */
  object FunctionRegistry {
    
    @JSImport("hyperformula/typings/interpreter/FunctionRegistry", "FunctionRegistry")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("hyperformula/typings/interpreter/FunctionRegistry", "FunctionRegistry._protectedPlugins")
    @js.native
    val _protectedPlugins: Any = js.native
    
    inline def functionIsProtected(functionId: String): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("functionIsProtected")(functionId.asInstanceOf[js.Any]).asInstanceOf[Boolean]
    
    inline def getFunctionPlugin(functionId: String): Maybe[FunctionPluginDefinition] = ^.asInstanceOf[js.Dynamic].applyDynamic("getFunctionPlugin")(functionId.asInstanceOf[js.Any]).asInstanceOf[Maybe[FunctionPluginDefinition]]
    
    inline def getPlugins(): js.Array[FunctionPluginDefinition] = ^.asInstanceOf[js.Dynamic].applyDynamic("getPlugins")().asInstanceOf[js.Array[FunctionPluginDefinition]]
    
    inline def getRegisteredFunctionIds(): js.Array[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("getRegisteredFunctionIds")().asInstanceOf[js.Array[String]]
    
    @JSImport("hyperformula/typings/interpreter/FunctionRegistry", "FunctionRegistry.loadFunctionUnprotected")
    @js.native
    def loadFunctionUnprotected: Any = js.native
    inline def loadFunctionUnprotected_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("loadFunctionUnprotected")(x.asInstanceOf[js.Any])
    
    @JSImport("hyperformula/typings/interpreter/FunctionRegistry", "FunctionRegistry.loadPluginFunction")
    @js.native
    def loadPluginFunction: Any = js.native
    inline def loadPluginFunction_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("loadPluginFunction")(x.asInstanceOf[js.Any])
    
    @JSImport("hyperformula/typings/interpreter/FunctionRegistry", "FunctionRegistry.loadPluginFunctions")
    @js.native
    def loadPluginFunctions: Any = js.native
    inline def loadPluginFunctions_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("loadPluginFunctions")(x.asInstanceOf[js.Any])
    
    @JSImport("hyperformula/typings/interpreter/FunctionRegistry", "FunctionRegistry.loadTranslations")
    @js.native
    def loadTranslations: Any = js.native
    inline def loadTranslations_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("loadTranslations")(x.asInstanceOf[js.Any])
    
    @JSImport("hyperformula/typings/interpreter/FunctionRegistry", "FunctionRegistry.plugins")
    @js.native
    def plugins: Map[String, FunctionPluginDefinition] = js.native
    inline def plugins_=(x: Map[String, FunctionPluginDefinition]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("plugins")(x.asInstanceOf[js.Any])
    
    @JSImport("hyperformula/typings/interpreter/FunctionRegistry", "FunctionRegistry.protectedFunctions")
    @js.native
    def protectedFunctions: Any = js.native
    inline def protectedFunctions_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("protectedFunctions")(x.asInstanceOf[js.Any])
    
    @JSImport("hyperformula/typings/interpreter/FunctionRegistry", "FunctionRegistry.protectedPlugins")
    @js.native
    def protectedPlugins: Any = js.native
    inline def protectedPlugins_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("protectedPlugins")(x.asInstanceOf[js.Any])
    
    inline def registerFunction(functionId: String, plugin: FunctionPluginDefinition): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("registerFunction")(functionId.asInstanceOf[js.Any], plugin.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def registerFunction(functionId: String, plugin: FunctionPluginDefinition, translations: FunctionTranslationsPackage): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("registerFunction")(functionId.asInstanceOf[js.Any], plugin.asInstanceOf[js.Any], translations.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    inline def registerFunctionPlugin(plugin: FunctionPluginDefinition): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("registerFunctionPlugin")(plugin.asInstanceOf[js.Any]).asInstanceOf[Unit]
    inline def registerFunctionPlugin(plugin: FunctionPluginDefinition, translations: FunctionTranslationsPackage): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("registerFunctionPlugin")(plugin.asInstanceOf[js.Any], translations.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    inline def unregisterAll(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("unregisterAll")().asInstanceOf[Unit]
    
    inline def unregisterFunction(functionId: String): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("unregisterFunction")(functionId.asInstanceOf[js.Any]).asInstanceOf[Unit]
    
    inline def unregisterFunctionPlugin(plugin: FunctionPluginDefinition): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("unregisterFunctionPlugin")(plugin.asInstanceOf[js.Any]).asInstanceOf[Unit]
  }
  
  type FunctionTranslationsPackage = Record[String, TranslationSet]
}
