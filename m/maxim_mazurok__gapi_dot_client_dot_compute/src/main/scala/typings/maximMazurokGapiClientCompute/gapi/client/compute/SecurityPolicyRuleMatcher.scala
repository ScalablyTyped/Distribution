package typings.maximMazurokGapiClientCompute.gapi.client.compute

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SecurityPolicyRuleMatcher extends js.Object {
  
  /**
    * The configuration options available when specifying versioned_expr. This field must be specified if versioned_expr is specified and cannot be specified if versioned_expr is not
    * specified.
    */
  var config: js.UndefOr[SecurityPolicyRuleMatcherConfig] = js.native
  
  /** User defined CEVAL expression. A CEVAL expression is used to specify match criteria such as origin.ip, source.region_code and contents in the request header. */
  var expr: js.UndefOr[Expr] = js.native
  
  /**
    * Preconfigured versioned expression. If this field is specified, config must also be specified. Available preconfigured expressions along with their requirements are: SRC_IPS_V1 -
    * must specify the corresponding src_ip_range field in config.
    */
  var versionedExpr: js.UndefOr[String] = js.native
}
object SecurityPolicyRuleMatcher {
  
  @scala.inline
  def apply(): SecurityPolicyRuleMatcher = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SecurityPolicyRuleMatcher]
  }
  
  @scala.inline
  implicit class SecurityPolicyRuleMatcherOps[Self <: SecurityPolicyRuleMatcher] (val x: Self) extends AnyVal {
    
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
    def setConfig(value: SecurityPolicyRuleMatcherConfig): Self = this.set("config", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteConfig: Self = this.set("config", js.undefined)
    
    @scala.inline
    def setExpr(value: Expr): Self = this.set("expr", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteExpr: Self = this.set("expr", js.undefined)
    
    @scala.inline
    def setVersionedExpr(value: String): Self = this.set("versionedExpr", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteVersionedExpr: Self = this.set("versionedExpr", js.undefined)
  }
}
