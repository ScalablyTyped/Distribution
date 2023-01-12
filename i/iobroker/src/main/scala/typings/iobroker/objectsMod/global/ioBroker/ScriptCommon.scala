package typings.iobroker.objectsMod.global.ioBroker

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ScriptCommon
  extends StObject
     with ObjectCommon {
  
  /** If the script uses a compiled language like TypeScript, this contains the compilation output */
  var compiled: js.UndefOr[String] = js.undefined
  
  // Make it possible to narrow the object type using the custom property
  var custom: Unit
  
  var debug: Boolean
  
  /** If the script uses a compiled language like TypeScript, this contains the generated declarations (global scripts only) */
  var declarations: js.UndefOr[String] = js.undefined
  
  /** Whether this script should be executed */
  var enabled: Boolean
  
  /** The instance id of the instance which executes this script */
  var engine: String
  
  /** Defines the type of the script, e.g. TypeScript/ts, JavaScript/js or Blockly */
  var engineType: String
  
  @JSName("name")
  var name_ScriptCommon: String
  
  /** The source code of this script */
  var source: String
  
  /** Is used to determine whether a script has changed and needs to be recompiled */
  var sourceHash: js.UndefOr[String] = js.undefined
  
  var verbose: Boolean
}
object ScriptCommon {
  
  inline def apply(
    custom: Unit,
    debug: Boolean,
    enabled: Boolean,
    engine: String,
    engineType: String,
    name: String,
    source: String,
    verbose: Boolean
  ): ScriptCommon = {
    val __obj = js.Dynamic.literal(custom = custom.asInstanceOf[js.Any], debug = debug.asInstanceOf[js.Any], enabled = enabled.asInstanceOf[js.Any], engine = engine.asInstanceOf[js.Any], engineType = engineType.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], source = source.asInstanceOf[js.Any], verbose = verbose.asInstanceOf[js.Any])
    __obj.asInstanceOf[ScriptCommon]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ScriptCommon] (val x: Self) extends AnyVal {
    
    inline def setCompiled(value: String): Self = StObject.set(x, "compiled", value.asInstanceOf[js.Any])
    
    inline def setCompiledUndefined: Self = StObject.set(x, "compiled", js.undefined)
    
    inline def setCustom(value: Unit): Self = StObject.set(x, "custom", value.asInstanceOf[js.Any])
    
    inline def setDebug(value: Boolean): Self = StObject.set(x, "debug", value.asInstanceOf[js.Any])
    
    inline def setDeclarations(value: String): Self = StObject.set(x, "declarations", value.asInstanceOf[js.Any])
    
    inline def setDeclarationsUndefined: Self = StObject.set(x, "declarations", js.undefined)
    
    inline def setEnabled(value: Boolean): Self = StObject.set(x, "enabled", value.asInstanceOf[js.Any])
    
    inline def setEngine(value: String): Self = StObject.set(x, "engine", value.asInstanceOf[js.Any])
    
    inline def setEngineType(value: String): Self = StObject.set(x, "engineType", value.asInstanceOf[js.Any])
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setSource(value: String): Self = StObject.set(x, "source", value.asInstanceOf[js.Any])
    
    inline def setSourceHash(value: String): Self = StObject.set(x, "sourceHash", value.asInstanceOf[js.Any])
    
    inline def setSourceHashUndefined: Self = StObject.set(x, "sourceHash", js.undefined)
    
    inline def setVerbose(value: Boolean): Self = StObject.set(x, "verbose", value.asInstanceOf[js.Any])
  }
}
