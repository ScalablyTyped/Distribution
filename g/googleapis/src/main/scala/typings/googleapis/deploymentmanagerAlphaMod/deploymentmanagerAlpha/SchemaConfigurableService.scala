package typings.googleapis.deploymentmanagerAlphaMod.deploymentmanagerAlpha

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * BaseType that describes a service-backed Type.
  */
@js.native
trait SchemaConfigurableService extends js.Object {
  /**
    * Allows resource handling overrides for specific collections
    */
  var collectionOverrides: js.UndefOr[js.Array[SchemaCollectionOverride]] = js.native
  /**
    * Credential used when interacting with this type.
    */
  var credential: js.UndefOr[SchemaCredential] = js.native
  /**
    * Descriptor Url for the this type.
    */
  var descriptorUrl: js.UndefOr[String] = js.native
  /**
    * Options to apply when handling any resources in this service.
    */
  var options: js.UndefOr[SchemaOptions] = js.native
}

object SchemaConfigurableService {
  @scala.inline
  def apply(
    collectionOverrides: js.Array[SchemaCollectionOverride] = null,
    credential: SchemaCredential = null,
    descriptorUrl: String = null,
    options: SchemaOptions = null
  ): SchemaConfigurableService = {
    val __obj = js.Dynamic.literal()
    if (collectionOverrides != null) __obj.updateDynamic("collectionOverrides")(collectionOverrides.asInstanceOf[js.Any])
    if (credential != null) __obj.updateDynamic("credential")(credential.asInstanceOf[js.Any])
    if (descriptorUrl != null) __obj.updateDynamic("descriptorUrl")(descriptorUrl.asInstanceOf[js.Any])
    if (options != null) __obj.updateDynamic("options")(options.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaConfigurableService]
  }
}

