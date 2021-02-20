package typings.iobroker.objectsMod.global.ioBroker

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ScriptCommon extends ObjectCommon {
  
  /** If the script uses a compiled language like TypeScript, this contains the compilation output */
  var compiled: js.UndefOr[String] = js.native
  
  // Make it possible to narrow the object type using the custom property
  var custom: js.UndefOr[scala.Nothing] = js.native
  
  var debug: Boolean = js.native
  
  /** If the script uses a compiled language like TypeScript, this contains the generated declarations (global scripts only) */
  var declarations: js.UndefOr[String] = js.native
  
  /** Whether this script should be executed */
  var enabled: Boolean = js.native
  
  /** The instance id of the instance which executes this script */
  var engine: String = js.native
  
  /** Defines the type of the script, e.g. TypeScript/ts, JavaScript/js or Blockly */
  var engineType: String = js.native
  
  @JSName("name")
  var name_ScriptCommon: String = js.native
  
  /** The source code of this script */
  var source: String = js.native
  
  /** Is used to determine whether a script has changed and needs to be recompiled */
  var sourceHash: js.UndefOr[String] = js.native
  
  var verbose: Boolean = js.native
}
object ScriptCommon {
  
  @scala.inline
  def apply(
    debug: Boolean,
    enabled: Boolean,
    engine: String,
    engineType: String,
    name: String,
    source: String,
    verbose: Boolean
  ): ScriptCommon = {
    val __obj = js.Dynamic.literal(debug = debug.asInstanceOf[js.Any], enabled = enabled.asInstanceOf[js.Any], engine = engine.asInstanceOf[js.Any], engineType = engineType.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], source = source.asInstanceOf[js.Any], verbose = verbose.asInstanceOf[js.Any])
    __obj.asInstanceOf[ScriptCommon]
  }
  
  @scala.inline
  implicit class ScriptCommonMutableBuilder[Self <: ScriptCommon] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCompiled(value: String): Self = StObject.set(x, "compiled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCompiledUndefined: Self = StObject.set(x, "compiled", js.undefined)
    
    @scala.inline
    def setDebug(value: Boolean): Self = StObject.set(x, "debug", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDeclarations(value: String): Self = StObject.set(x, "declarations", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDeclarationsUndefined: Self = StObject.set(x, "declarations", js.undefined)
    
    @scala.inline
    def setEnabled(value: Boolean): Self = StObject.set(x, "enabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEngine(value: String): Self = StObject.set(x, "engine", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEngineType(value: String): Self = StObject.set(x, "engineType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSource(value: String): Self = StObject.set(x, "source", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSourceHash(value: String): Self = StObject.set(x, "sourceHash", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSourceHashUndefined: Self = StObject.set(x, "sourceHash", js.undefined)
    
    @scala.inline
    def setVerbose(value: Boolean): Self = StObject.set(x, "verbose", value.asInstanceOf[js.Any])
  }
}
