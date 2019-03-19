package typings
package lokijsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CollectionOptions[E] extends js.Object {
  var adaptiveBinaryIndices: scala.Boolean
  var asyncListeners: scala.Boolean
  var autoupdate: scala.Boolean
  var cloneMethod: lokijsLib.lokijsLibStrings.`parse-stringify` | lokijsLib.lokijsLibStrings.`jquery-extend-deep` | lokijsLib.lokijsLibStrings.shallow | lokijsLib.lokijsLibStrings.`shallow-assign` | lokijsLib.lokijsLibStrings.`shallow-recurse-objects`
  @JSName("clone")
  var clone_FCollectionOptions: scala.Boolean
  var disableChangesApi: scala.Boolean
  var disableDeltaChangesApi: scala.Boolean
  var disableMeta: scala.Boolean
  var exact: js.Array[java.lang.String]
  var indices: java.lang.String | js.Array[java.lang.String]
  var serializableIndices: scala.Boolean
  var transactional: scala.Boolean
  var ttl: scala.Double
  var ttlInterval: scala.Double
  var unique: js.Array[java.lang.String]
}

object CollectionOptions {
  @scala.inline
  def apply[E](
    adaptiveBinaryIndices: scala.Boolean,
    asyncListeners: scala.Boolean,
    autoupdate: scala.Boolean,
    clone: scala.Boolean,
    cloneMethod: lokijsLib.lokijsLibStrings.`parse-stringify` | lokijsLib.lokijsLibStrings.`jquery-extend-deep` | lokijsLib.lokijsLibStrings.shallow | lokijsLib.lokijsLibStrings.`shallow-assign` | lokijsLib.lokijsLibStrings.`shallow-recurse-objects`,
    disableChangesApi: scala.Boolean,
    disableDeltaChangesApi: scala.Boolean,
    disableMeta: scala.Boolean,
    exact: js.Array[java.lang.String],
    indices: java.lang.String | js.Array[java.lang.String],
    serializableIndices: scala.Boolean,
    transactional: scala.Boolean,
    ttl: scala.Double,
    ttlInterval: scala.Double,
    unique: js.Array[java.lang.String]
  ): CollectionOptions[E] = {
    val __obj = js.Dynamic.literal(adaptiveBinaryIndices = adaptiveBinaryIndices, asyncListeners = asyncListeners, autoupdate = autoupdate, clone = clone, cloneMethod = cloneMethod.asInstanceOf[js.Any], disableChangesApi = disableChangesApi, disableDeltaChangesApi = disableDeltaChangesApi, disableMeta = disableMeta, exact = exact, indices = indices.asInstanceOf[js.Any], serializableIndices = serializableIndices, transactional = transactional, ttl = ttl, ttlInterval = ttlInterval, unique = unique)
  
    __obj.asInstanceOf[CollectionOptions[E]]
  }
}

