package typings.googleapis.serviceusageV1beta1Mod.serviceusageV1beta1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * ### System parameter configuration  A system parameter is a special kind of
  * parameter defined by the API system, not by an individual API. It is
  * typically mapped to an HTTP header and/or a URL query parameter. This
  * configuration specifies which methods change the names of the system
  * parameters.
  */
@js.native
trait SchemaSystemParameters extends js.Object {
  /**
    * Define system parameters.  The parameters defined here will override the
    * default parameters implemented by the system. If this field is missing
    * from the service config, default system parameters will be used. Default
    * system parameters and names is implementation-dependent.  Example: define
    * api key for all methods      system_parameters       rules:         -
    * selector: &quot;*&quot;           parameters:             - name: api_key
    * url_query_parameter: api_key   Example: define 2 api key names for a
    * specific method.      system_parameters       rules:         - selector:
    * &quot;/ListShelves&quot;           parameters:             - name:
    * api_key               http_header: Api-Key1             - name: api_key
    * http_header: Api-Key2  **NOTE:** All service configuration rules follow
    * &quot;last one wins&quot; order.
    */
  var rules: js.UndefOr[js.Array[SchemaSystemParameterRule]] = js.native
}

object SchemaSystemParameters {
  @scala.inline
  def apply(): SchemaSystemParameters = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaSystemParameters]
  }
  @scala.inline
  implicit class SchemaSystemParametersOps[Self <: SchemaSystemParameters] (val x: Self) extends AnyVal {
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
    def setRulesVarargs(value: SchemaSystemParameterRule*): Self = this.set("rules", js.Array(value :_*))
    @scala.inline
    def setRules(value: js.Array[SchemaSystemParameterRule]): Self = this.set("rules", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRules: Self = this.set("rules", js.undefined)
  }
  
}

