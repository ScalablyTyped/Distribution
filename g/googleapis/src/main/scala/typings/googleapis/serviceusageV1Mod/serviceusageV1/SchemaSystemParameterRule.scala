package typings.googleapis.serviceusageV1Mod.serviceusageV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Define a system parameter rule mapping system parameter definitions to
  * methods.
  */
@js.native
trait SchemaSystemParameterRule extends js.Object {
  /**
    * Define parameters. Multiple names may be defined for a parameter. For a
    * given method call, only one of them should be used. If multiple names are
    * used the behavior is implementation-dependent. If none of the specified
    * names are present the behavior is parameter-dependent.
    */
  var parameters: js.UndefOr[js.Array[SchemaSystemParameter]] = js.native
  /**
    * Selects the methods to which this rule applies. Use &#39;*&#39; to
    * indicate all methods in all APIs.  Refer to selector for syntax details.
    */
  var selector: js.UndefOr[String] = js.native
}

object SchemaSystemParameterRule {
  @scala.inline
  def apply(): SchemaSystemParameterRule = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaSystemParameterRule]
  }
  @scala.inline
  implicit class SchemaSystemParameterRuleOps[Self <: SchemaSystemParameterRule] (val x: Self) extends AnyVal {
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
    def setParametersVarargs(value: SchemaSystemParameter*): Self = this.set("parameters", js.Array(value :_*))
    @scala.inline
    def setParameters(value: js.Array[SchemaSystemParameter]): Self = this.set("parameters", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteParameters: Self = this.set("parameters", js.undefined)
    @scala.inline
    def setSelector(value: String): Self = this.set("selector", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSelector: Self = this.set("selector", js.undefined)
  }
  
}

