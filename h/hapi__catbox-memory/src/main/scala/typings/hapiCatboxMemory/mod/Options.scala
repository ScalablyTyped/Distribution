package typings.hapiCatboxMemory.mod

import typings.hapiCatbox.mod.ClientOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Options extends ClientOptions {
  /**
    * by default, all data is cached as JSON strings, and converted to an object using JSON.parse() on retrieval.
    * By setting this option to true, Buffer data can be stored alongside the stringified data.
    * Buffers are not stringified, and are copied before storage to prevent the value from changing while in the cache.
    * @default false
    */
  var allowMixedContent: js.UndefOr[Boolean] = js.undefined
  /**
    * by default, buffers stored in the cache with allowMixedContent set to true are copied when they are set but not when they are retrieved.
    * This means a change to the buffer returned by a get() will change the value in the cache. To prevent this,
    * set cloneBuffersOnGet to true to always return a copy of the cached buffer.
    * @default false
    */
  var cloneBuffersOnGet: js.UndefOr[Boolean] = js.undefined
  /**
    * Sets an upper limit on the number of bytes that can be stored in the cache.
    * Once this limit is reached no additional items will be added to the cache until some expire.
    * The utilized memory calculation is a rough approximation and must not be relied on.
    * @default 104857600 (100MB).
    */
  var maxByteSize: js.UndefOr[Double] = js.undefined
  /**
    * The minimum number of milliseconds in between each cache cleanup.
    * @default 1000 (1 second)
    */
  var minCleanupIntervalMsec: js.UndefOr[Double] = js.undefined
}

object Options {
  @scala.inline
  def apply(
    allowMixedContent: js.UndefOr[Boolean] = js.undefined,
    cloneBuffersOnGet: js.UndefOr[Boolean] = js.undefined,
    maxByteSize: js.UndefOr[Double] = js.undefined,
    minCleanupIntervalMsec: js.UndefOr[Double] = js.undefined,
    partition: String = null
  ): Options = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(allowMixedContent)) __obj.updateDynamic("allowMixedContent")(allowMixedContent.get.asInstanceOf[js.Any])
    if (!js.isUndefined(cloneBuffersOnGet)) __obj.updateDynamic("cloneBuffersOnGet")(cloneBuffersOnGet.get.asInstanceOf[js.Any])
    if (!js.isUndefined(maxByteSize)) __obj.updateDynamic("maxByteSize")(maxByteSize.get.asInstanceOf[js.Any])
    if (!js.isUndefined(minCleanupIntervalMsec)) __obj.updateDynamic("minCleanupIntervalMsec")(minCleanupIntervalMsec.get.asInstanceOf[js.Any])
    if (partition != null) __obj.updateDynamic("partition")(partition.asInstanceOf[js.Any])
    __obj.asInstanceOf[Options]
  }
}

