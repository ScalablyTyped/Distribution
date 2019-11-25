package typings.lokijs

import typings.lokijs.lokijsStrings.`jquery-extend-deep`
import typings.lokijs.lokijsStrings.`parse-stringify`
import typings.lokijs.lokijsStrings.`shallow-assign`
import typings.lokijs.lokijsStrings.`shallow-recurse-objects`
import typings.lokijs.lokijsStrings.shallow
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CollectionOptions[E] extends js.Object {
  var adaptiveBinaryIndices: Boolean
  var asyncListeners: Boolean
  var autoupdate: Boolean
  var cloneMethod: `parse-stringify` | `jquery-extend-deep` | shallow | `shallow-assign` | `shallow-recurse-objects`
  @JSName("clone")
  var clone_FCollectionOptions: Boolean
  var disableChangesApi: Boolean
  var disableDeltaChangesApi: Boolean
  var disableMeta: Boolean
  var exact: js.Array[String]
  var indices: String | js.Array[String]
  var serializableIndices: Boolean
  var transactional: Boolean
  var ttl: Double
  var ttlInterval: Double
  var unique: js.Array[String]
}

object CollectionOptions {
  @scala.inline
  def apply[E](
    adaptiveBinaryIndices: Boolean,
    asyncListeners: Boolean,
    autoupdate: Boolean,
    clone: Boolean,
    cloneMethod: `parse-stringify` | `jquery-extend-deep` | shallow | `shallow-assign` | `shallow-recurse-objects`,
    disableChangesApi: Boolean,
    disableDeltaChangesApi: Boolean,
    disableMeta: Boolean,
    exact: js.Array[String],
    indices: String | js.Array[String],
    serializableIndices: Boolean,
    transactional: Boolean,
    ttl: Double,
    ttlInterval: Double,
    unique: js.Array[String]
  ): CollectionOptions[E] = {
    val __obj = js.Dynamic.literal(adaptiveBinaryIndices = adaptiveBinaryIndices.asInstanceOf[js.Any], asyncListeners = asyncListeners.asInstanceOf[js.Any], autoupdate = autoupdate.asInstanceOf[js.Any], clone = clone.asInstanceOf[js.Any], cloneMethod = cloneMethod.asInstanceOf[js.Any], disableChangesApi = disableChangesApi.asInstanceOf[js.Any], disableDeltaChangesApi = disableDeltaChangesApi.asInstanceOf[js.Any], disableMeta = disableMeta.asInstanceOf[js.Any], exact = exact.asInstanceOf[js.Any], indices = indices.asInstanceOf[js.Any], serializableIndices = serializableIndices.asInstanceOf[js.Any], transactional = transactional.asInstanceOf[js.Any], ttl = ttl.asInstanceOf[js.Any], ttlInterval = ttlInterval.asInstanceOf[js.Any], unique = unique.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[CollectionOptions[E]]
  }
}

