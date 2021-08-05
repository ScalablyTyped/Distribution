package typings.joi.mod

import typings.joi.joiBooleans.`false`
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ExtensionRule extends StObject {
  
  /**
    * alternative name for this rule.
    */
  var alias: js.UndefOr[String] = js.undefined
  
  /**
    * list of arguments accepted by `method`.
    */
  var args: js.UndefOr[js.Array[RuleArgs | String]] = js.undefined
  
  /**
    * Dual rule: converts or validates.
    */
  var convert: js.UndefOr[Boolean] = js.undefined
  
  var manifest: js.UndefOr[Boolean] = js.undefined
  
  /**
    * rule body.
    */
  var method: js.UndefOr[RuleMethod | `false`] = js.undefined
  
  /**
    * whether rule supports multiple invocations.
    */
  var multi: js.UndefOr[Boolean] = js.undefined
  
  /**
    * undocumented flags.
    */
  var priority: js.UndefOr[Boolean] = js.undefined
  
  /**
    * validation function.
    */
  var validate: js.UndefOr[
    js.Function4[
      /* value */ js.Any, 
      /* helpers */ js.Any, 
      /* args */ Record[String, js.Any], 
      /* options */ js.Any, 
      js.Any
    ]
  ] = js.undefined
}
object ExtensionRule {
  
  inline def apply(): ExtensionRule = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ExtensionRule]
  }
  
  extension [Self <: ExtensionRule](x: Self) {
    
    inline def setAlias(value: String): Self = StObject.set(x, "alias", value.asInstanceOf[js.Any])
    
    inline def setAliasUndefined: Self = StObject.set(x, "alias", js.undefined)
    
    inline def setArgs(value: js.Array[RuleArgs | String]): Self = StObject.set(x, "args", value.asInstanceOf[js.Any])
    
    inline def setArgsUndefined: Self = StObject.set(x, "args", js.undefined)
    
    inline def setArgsVarargs(value: (RuleArgs | String)*): Self = StObject.set(x, "args", js.Array(value :_*))
    
    inline def setConvert(value: Boolean): Self = StObject.set(x, "convert", value.asInstanceOf[js.Any])
    
    inline def setConvertUndefined: Self = StObject.set(x, "convert", js.undefined)
    
    inline def setManifest(value: Boolean): Self = StObject.set(x, "manifest", value.asInstanceOf[js.Any])
    
    inline def setManifestUndefined: Self = StObject.set(x, "manifest", js.undefined)
    
    inline def setMethod(value: RuleMethod | `false`): Self = StObject.set(x, "method", value.asInstanceOf[js.Any])
    
    inline def setMethodUndefined: Self = StObject.set(x, "method", js.undefined)
    
    inline def setMulti(value: Boolean): Self = StObject.set(x, "multi", value.asInstanceOf[js.Any])
    
    inline def setMultiUndefined: Self = StObject.set(x, "multi", js.undefined)
    
    inline def setPriority(value: Boolean): Self = StObject.set(x, "priority", value.asInstanceOf[js.Any])
    
    inline def setPriorityUndefined: Self = StObject.set(x, "priority", js.undefined)
    
    inline def setValidate(
      value: (/* value */ js.Any, /* helpers */ js.Any, /* args */ Record[String, js.Any], /* options */ js.Any) => js.Any
    ): Self = StObject.set(x, "validate", js.Any.fromFunction4(value))
    
    inline def setValidateUndefined: Self = StObject.set(x, "validate", js.undefined)
  }
}
