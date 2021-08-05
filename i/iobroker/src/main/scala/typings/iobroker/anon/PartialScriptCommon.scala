package typings.iobroker.anon

import typings.iobroker.iobrokerBooleans.`true`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Partial<iobroker.iobroker/objects.<global>.ioBroker.ScriptCommon> */
trait PartialScriptCommon extends StObject {
  
  var compiled: js.UndefOr[String] = js.undefined
  
  var custom: Unit
  
  var debug: js.UndefOr[Boolean] = js.undefined
  
  var declarations: js.UndefOr[String] = js.undefined
  
  var dontDelete: js.UndefOr[`true`] = js.undefined
  
  var enabled: js.UndefOr[Boolean] = js.undefined
  
  var engine: js.UndefOr[String] = js.undefined
  
  var engineType: js.UndefOr[String] = js.undefined
  
  var expert: js.UndefOr[`true`] = js.undefined
  
  var icon: js.UndefOr[String] = js.undefined
  
  var name: js.UndefOr[String] = js.undefined
  
  var role: js.UndefOr[String] = js.undefined
  
  var source: js.UndefOr[String] = js.undefined
  
  var sourceHash: js.UndefOr[String] = js.undefined
  
  var verbose: js.UndefOr[Boolean] = js.undefined
}
object PartialScriptCommon {
  
  inline def apply(custom: Unit): PartialScriptCommon = {
    val __obj = js.Dynamic.literal(custom = custom.asInstanceOf[js.Any])
    __obj.asInstanceOf[PartialScriptCommon]
  }
  
  extension [Self <: PartialScriptCommon](x: Self) {
    
    inline def setCompiled(value: String): Self = StObject.set(x, "compiled", value.asInstanceOf[js.Any])
    
    inline def setCompiledUndefined: Self = StObject.set(x, "compiled", js.undefined)
    
    inline def setCustom(value: Unit): Self = StObject.set(x, "custom", value.asInstanceOf[js.Any])
    
    inline def setDebug(value: Boolean): Self = StObject.set(x, "debug", value.asInstanceOf[js.Any])
    
    inline def setDebugUndefined: Self = StObject.set(x, "debug", js.undefined)
    
    inline def setDeclarations(value: String): Self = StObject.set(x, "declarations", value.asInstanceOf[js.Any])
    
    inline def setDeclarationsUndefined: Self = StObject.set(x, "declarations", js.undefined)
    
    inline def setDontDelete(value: `true`): Self = StObject.set(x, "dontDelete", value.asInstanceOf[js.Any])
    
    inline def setDontDeleteUndefined: Self = StObject.set(x, "dontDelete", js.undefined)
    
    inline def setEnabled(value: Boolean): Self = StObject.set(x, "enabled", value.asInstanceOf[js.Any])
    
    inline def setEnabledUndefined: Self = StObject.set(x, "enabled", js.undefined)
    
    inline def setEngine(value: String): Self = StObject.set(x, "engine", value.asInstanceOf[js.Any])
    
    inline def setEngineType(value: String): Self = StObject.set(x, "engineType", value.asInstanceOf[js.Any])
    
    inline def setEngineTypeUndefined: Self = StObject.set(x, "engineType", js.undefined)
    
    inline def setEngineUndefined: Self = StObject.set(x, "engine", js.undefined)
    
    inline def setExpert(value: `true`): Self = StObject.set(x, "expert", value.asInstanceOf[js.Any])
    
    inline def setExpertUndefined: Self = StObject.set(x, "expert", js.undefined)
    
    inline def setIcon(value: String): Self = StObject.set(x, "icon", value.asInstanceOf[js.Any])
    
    inline def setIconUndefined: Self = StObject.set(x, "icon", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setRole(value: String): Self = StObject.set(x, "role", value.asInstanceOf[js.Any])
    
    inline def setRoleUndefined: Self = StObject.set(x, "role", js.undefined)
    
    inline def setSource(value: String): Self = StObject.set(x, "source", value.asInstanceOf[js.Any])
    
    inline def setSourceHash(value: String): Self = StObject.set(x, "sourceHash", value.asInstanceOf[js.Any])
    
    inline def setSourceHashUndefined: Self = StObject.set(x, "sourceHash", js.undefined)
    
    inline def setSourceUndefined: Self = StObject.set(x, "source", js.undefined)
    
    inline def setVerbose(value: Boolean): Self = StObject.set(x, "verbose", value.asInstanceOf[js.Any])
    
    inline def setVerboseUndefined: Self = StObject.set(x, "verbose", js.undefined)
  }
}
