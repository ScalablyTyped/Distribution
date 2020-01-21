package typings.googleapis.servicenetworkingV1Mod.servicenetworkingV1

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
  def apply(parameters: js.Array[SchemaSystemParameter] = null, selector: String = null): SchemaSystemParameterRule = {
    val __obj = js.Dynamic.literal()
    if (parameters != null) __obj.updateDynamic("parameters")(parameters.asInstanceOf[js.Any])
    if (selector != null) __obj.updateDynamic("selector")(selector.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaSystemParameterRule]
  }
}

