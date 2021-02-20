package typings.joi.mod

import typings.joi.joiBooleans.`false`
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ExtensionRule extends StObject {
  
  /**
    * alternative name for this rule.
    */
  var alias: js.UndefOr[String] = js.native
  
  /**
    * list of arguments accepted by `method`.
    */
  var args: js.UndefOr[js.Array[RuleArgs | String]] = js.native
  
  /**
    * Dual rule: converts or validates.
    */
  var convert: js.UndefOr[Boolean] = js.native
  
  var manifest: js.UndefOr[Boolean] = js.native
  
  /**
    * rule body.
    */
  var method: js.UndefOr[RuleMethod | `false`] = js.native
  
  /**
    * whether rule supports multiple invocations.
    */
  var multi: js.UndefOr[Boolean] = js.native
  
  /**
    * undocumented flags.
    */
  var priority: js.UndefOr[Boolean] = js.native
  
  /**
    * validation function.
    */
  var validate: js.UndefOr[
    js.Function4[
      /* value */ js.Any, 
      /* helpers */ js.Any, 
      /* args */ Record[String, _], 
      /* options */ js.Any, 
      _
    ]
  ] = js.native
}
object ExtensionRule {
  
  @scala.inline
  def apply(): ExtensionRule = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ExtensionRule]
  }
  
  @scala.inline
  implicit class ExtensionRuleMutableBuilder[Self <: ExtensionRule] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAlias(value: String): Self = StObject.set(x, "alias", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAliasUndefined: Self = StObject.set(x, "alias", js.undefined)
    
    @scala.inline
    def setArgs(value: js.Array[RuleArgs | String]): Self = StObject.set(x, "args", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setArgsUndefined: Self = StObject.set(x, "args", js.undefined)
    
    @scala.inline
    def setArgsVarargs(value: (RuleArgs | String)*): Self = StObject.set(x, "args", js.Array(value :_*))
    
    @scala.inline
    def setConvert(value: Boolean): Self = StObject.set(x, "convert", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setConvertUndefined: Self = StObject.set(x, "convert", js.undefined)
    
    @scala.inline
    def setManifest(value: Boolean): Self = StObject.set(x, "manifest", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setManifestUndefined: Self = StObject.set(x, "manifest", js.undefined)
    
    @scala.inline
    def setMethod(value: RuleMethod | `false`): Self = StObject.set(x, "method", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMethodFunction1(value: /* repeated */ js.Any => js.Any): Self = StObject.set(x, "method", js.Any.fromFunction1(value))
    
    @scala.inline
    def setMethodUndefined: Self = StObject.set(x, "method", js.undefined)
    
    @scala.inline
    def setMulti(value: Boolean): Self = StObject.set(x, "multi", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMultiUndefined: Self = StObject.set(x, "multi", js.undefined)
    
    @scala.inline
    def setPriority(value: Boolean): Self = StObject.set(x, "priority", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPriorityUndefined: Self = StObject.set(x, "priority", js.undefined)
    
    @scala.inline
    def setValidate(
      value: (/* value */ js.Any, /* helpers */ js.Any, /* args */ Record[String, _], /* options */ js.Any) => _
    ): Self = StObject.set(x, "validate", js.Any.fromFunction4(value))
    
    @scala.inline
    def setValidateUndefined: Self = StObject.set(x, "validate", js.undefined)
  }
}
