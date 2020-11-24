package typings.joi.mod

import typings.joi.joiBooleans.`false`
import typings.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ExtensionRule extends js.Object {
  
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
  implicit class ExtensionRuleOps[Self <: ExtensionRule] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setAlias(value: String): Self = this.set("alias", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAlias: Self = this.set("alias", js.undefined)
    
    @scala.inline
    def setArgsVarargs(value: (RuleArgs | String)*): Self = this.set("args", js.Array(value :_*))
    
    @scala.inline
    def setArgs(value: js.Array[RuleArgs | String]): Self = this.set("args", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteArgs: Self = this.set("args", js.undefined)
    
    @scala.inline
    def setConvert(value: Boolean): Self = this.set("convert", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteConvert: Self = this.set("convert", js.undefined)
    
    @scala.inline
    def setManifest(value: Boolean): Self = this.set("manifest", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteManifest: Self = this.set("manifest", js.undefined)
    
    @scala.inline
    def setMethodFunction1(value: /* repeated */ js.Any => js.Any): Self = this.set("method", js.Any.fromFunction1(value))
    
    @scala.inline
    def setMethod(value: RuleMethod | `false`): Self = this.set("method", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMethod: Self = this.set("method", js.undefined)
    
    @scala.inline
    def setMulti(value: Boolean): Self = this.set("multi", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMulti: Self = this.set("multi", js.undefined)
    
    @scala.inline
    def setPriority(value: Boolean): Self = this.set("priority", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePriority: Self = this.set("priority", js.undefined)
    
    @scala.inline
    def setValidate(
      value: (/* value */ js.Any, /* helpers */ js.Any, /* args */ Record[String, _], /* options */ js.Any) => _
    ): Self = this.set("validate", js.Any.fromFunction4(value))
    
    @scala.inline
    def deleteValidate: Self = this.set("validate", js.undefined)
  }
}
