package typings.googleapis.fitnessV1Mod.fitnessV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SchemaApplication extends js.Object {
  /**
    * An optional URI that can be used to link back to the application.
    */
  var detailsUrl: js.UndefOr[String] = js.native
  /**
    * The name of this application. This is required for REST clients, but we
    * do not enforce uniqueness of this name. It is provided as a matter of
    * convenience for other developers who would like to identify which REST
    * created an Application or Data Source.
    */
  var name: js.UndefOr[String] = js.native
  /**
    * Package name for this application. This is used as a unique identifier
    * when created by Android applications, but cannot be specified by REST
    * clients. REST clients will have their developer project number reflected
    * into the Data Source data stream IDs, instead of the packageName.
    */
  var packageName: js.UndefOr[String] = js.native
  /**
    * Version of the application. You should update this field whenever the
    * application changes in a way that affects the computation of the data.
    */
  var version: js.UndefOr[String] = js.native
}

object SchemaApplication {
  @scala.inline
  def apply(detailsUrl: String = null, name: String = null, packageName: String = null, version: String = null): SchemaApplication = {
    val __obj = js.Dynamic.literal()
    if (detailsUrl != null) __obj.updateDynamic("detailsUrl")(detailsUrl.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (packageName != null) __obj.updateDynamic("packageName")(packageName.asInstanceOf[js.Any])
    if (version != null) __obj.updateDynamic("version")(version.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaApplication]
  }
}

