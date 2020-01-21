package typings.googleapis.deploymentmanagerAlphaMod.deploymentmanagerAlpha

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * CollectionOverride allows resource handling overrides for specific
  * resources within a BaseType
  */
@js.native
trait SchemaCollectionOverride extends js.Object {
  /**
    * The collection that identifies this resource within its service.
    */
  var collection: js.UndefOr[String] = js.native
  /**
    * Custom verb method mappings to support unordered list API mappings.
    */
  var methodMap: js.UndefOr[SchemaMethodMap] = js.native
  /**
    * The options to apply to this resource-level override
    */
  var options: js.UndefOr[SchemaOptions] = js.native
}

object SchemaCollectionOverride {
  @scala.inline
  def apply(collection: String = null, methodMap: SchemaMethodMap = null, options: SchemaOptions = null): SchemaCollectionOverride = {
    val __obj = js.Dynamic.literal()
    if (collection != null) __obj.updateDynamic("collection")(collection.asInstanceOf[js.Any])
    if (methodMap != null) __obj.updateDynamic("methodMap")(methodMap.asInstanceOf[js.Any])
    if (options != null) __obj.updateDynamic("options")(options.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaCollectionOverride]
  }
}

