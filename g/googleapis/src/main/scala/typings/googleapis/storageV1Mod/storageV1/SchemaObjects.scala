package typings.googleapis.storageV1Mod.storageV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A list of objects.
  */
@js.native
trait SchemaObjects extends js.Object {
  /**
    * The list of items.
    */
  var items: js.UndefOr[js.Array[SchemaObject]] = js.native
  /**
    * The kind of item this is. For lists of objects, this is always
    * storage#objects.
    */
  var kind: js.UndefOr[String] = js.native
  /**
    * The continuation token, used to page through large result sets. Provide
    * this value in a subsequent request to return the next page of results.
    */
  var nextPageToken: js.UndefOr[String] = js.native
  /**
    * The list of prefixes of objects matching-but-not-listed up to and
    * including the requested delimiter.
    */
  var prefixes: js.UndefOr[js.Array[String]] = js.native
}

object SchemaObjects {
  @scala.inline
  def apply(
    items: js.Array[SchemaObject] = null,
    kind: String = null,
    nextPageToken: String = null,
    prefixes: js.Array[String] = null
  ): SchemaObjects = {
    val __obj = js.Dynamic.literal()
    if (items != null) __obj.updateDynamic("items")(items.asInstanceOf[js.Any])
    if (kind != null) __obj.updateDynamic("kind")(kind.asInstanceOf[js.Any])
    if (nextPageToken != null) __obj.updateDynamic("nextPageToken")(nextPageToken.asInstanceOf[js.Any])
    if (prefixes != null) __obj.updateDynamic("prefixes")(prefixes.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaObjects]
  }
}

