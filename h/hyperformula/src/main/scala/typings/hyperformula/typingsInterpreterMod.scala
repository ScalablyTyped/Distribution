package typings.hyperformula

import org.scalablytyped.runtime.StringDictionary
import typings.hyperformula.typingsInterpreterInterpreterMod.Interpreter
import typings.hyperformula.typingsInterpreterPluginFunctionPluginMod.ImplementedFunctions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typingsInterpreterMod {
  
  @JSImport("hyperformula/typings/interpreter", "FunctionArgumentType")
  @js.native
  object FunctionArgumentType extends StObject {
    
    @JSBracketAccess
    def apply(value: String): js.UndefOr[
        typings.hyperformula.typingsInterpreterPluginFunctionPluginMod.FunctionArgumentType & String
      ] = js.native
    
    /* "ANY" */ val ANY: typings.hyperformula.typingsInterpreterPluginFunctionPluginMod.FunctionArgumentType.ANY & String = js.native
    
    /* "BOOLEAN" */ val BOOLEAN: typings.hyperformula.typingsInterpreterPluginFunctionPluginMod.FunctionArgumentType.BOOLEAN & String = js.native
    
    /* "COMPLEX" */ val COMPLEX: typings.hyperformula.typingsInterpreterPluginFunctionPluginMod.FunctionArgumentType.COMPLEX & String = js.native
    
    /* "INTEGER" */ val INTEGER: typings.hyperformula.typingsInterpreterPluginFunctionPluginMod.FunctionArgumentType.INTEGER & String = js.native
    
    /* "NOERROR" */ val NOERROR: typings.hyperformula.typingsInterpreterPluginFunctionPluginMod.FunctionArgumentType.NOERROR & String = js.native
    
    /* "NUMBER" */ val NUMBER: typings.hyperformula.typingsInterpreterPluginFunctionPluginMod.FunctionArgumentType.NUMBER & String = js.native
    
    /* "RANGE" */ val RANGE: typings.hyperformula.typingsInterpreterPluginFunctionPluginMod.FunctionArgumentType.RANGE & String = js.native
    
    /* "SCALAR" */ val SCALAR: typings.hyperformula.typingsInterpreterPluginFunctionPluginMod.FunctionArgumentType.SCALAR & String = js.native
    
    /* "STRING" */ val STRING: typings.hyperformula.typingsInterpreterPluginFunctionPluginMod.FunctionArgumentType.STRING & String = js.native
  }
  
  /* note: abstract class */ @JSImport("hyperformula/typings/interpreter", "FunctionPlugin")
  @js.native
  open class FunctionPlugin protected ()
    extends typings.hyperformula.typingsInterpreterPluginFunctionPluginMod.FunctionPlugin {
    def this(interpreter: Interpreter) = this()
  }
  /* static members */
  object FunctionPlugin {
    
    @JSImport("hyperformula/typings/interpreter", "FunctionPlugin")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("hyperformula/typings/interpreter", "FunctionPlugin.aliases")
    @js.native
    def aliases: js.UndefOr[StringDictionary[String]] = js.native
    inline def aliases_=(x: js.UndefOr[StringDictionary[String]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("aliases")(x.asInstanceOf[js.Any])
    
    /**
      * Dictionary containing functions implemented by specific plugin, along with function name translations.
      */
    @JSImport("hyperformula/typings/interpreter", "FunctionPlugin.implementedFunctions")
    @js.native
    def implementedFunctions: ImplementedFunctions = js.native
    inline def implementedFunctions_=(x: ImplementedFunctions): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("implementedFunctions")(x.asInstanceOf[js.Any])
  }
}
