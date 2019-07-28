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
    val __obj = js.Dynamic.literal(adaptiveBinaryIndices = adaptiveBinaryIndices, asyncListeners = asyncListeners, autoupdate = autoupdate, clone = clone, cloneMethod = cloneMethod.asInstanceOf[js.Any], disableChangesApi = disableChangesApi, disableDeltaChangesApi = disableDeltaChangesApi, disableMeta = disableMeta, exact = exact, indices = indices.asInstanceOf[js.Any], serializableIndices = serializableIndices, transactional = transactional, ttl = ttl, ttlInterval = ttlInterval, unique = unique)
  
    __obj.asInstanceOf[CollectionOptions[E]]
  }
}

