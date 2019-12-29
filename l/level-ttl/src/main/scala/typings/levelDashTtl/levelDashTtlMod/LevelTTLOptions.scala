package typings.levelDashTtl.levelDashTtlMod

import typings.abstractDashLeveldown.abstractDashLeveldownMod.AbstractIterator
import typings.abstractDashLeveldown.abstractDashLeveldownMod.AbstractLevelDOWN
import typings.levelup.levelupMod.LevelUp
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LevelTTLOptions extends js.Object {
  /**
    * A number specifying the frequency of internal scans for checking for expired keys.
    * @default 10000
    */
  var checkFrequency: js.UndefOr[Double] = js.undefined
  /**
    * A number specifying the default time-to-live for new or updated values.
    * This can be overridden by explicitly setting the ttl value.
    * @default 0
    */
  var defaultTTL: js.UndefOr[Double] = js.undefined
  /**
    * Character specifying the key namespace for expiration values.
    * @default 'x'
    */
  var expiryNamespace: js.UndefOr[String] = js.undefined
  /**
    * A string for prefixing the modified database methods (i.e., put, del, batch, ttl, stop).
    */
  var methodPrefix: js.UndefOr[String] = js.undefined
  /**
    * Character specifying the key namespace for ttl values.
    * @default 'ttl'
    */
  var namespace: js.UndefOr[String] = js.undefined
  /**
    * Character for separating sublevel prefixes from user keys and each other. Should be outside the character (or byte) range of user keys.
    * @default ''
    */
  var separator: js.UndefOr[String] = js.undefined
  /**
    * A custom storage database for the meta data.
    * If it's set, that storage will contain all the ttl meta data.
    * A use case for this would be to avoid mixing data and meta data in the same keyspace, since if it's not set, all data will be sharing the same keyspace.
    */
  var sub: js.UndefOr[LevelUp[AbstractLevelDOWN[_, _], AbstractIterator[_, _]]] = js.undefined
}

object LevelTTLOptions {
  @scala.inline
  def apply(
    checkFrequency: Int | Double = null,
    defaultTTL: Int | Double = null,
    expiryNamespace: String = null,
    methodPrefix: String = null,
    namespace: String = null,
    separator: String = null,
    sub: LevelUp[AbstractLevelDOWN[_, _], AbstractIterator[_, _]] = null
  ): LevelTTLOptions = {
    val __obj = js.Dynamic.literal()
    if (checkFrequency != null) __obj.updateDynamic("checkFrequency")(checkFrequency.asInstanceOf[js.Any])
    if (defaultTTL != null) __obj.updateDynamic("defaultTTL")(defaultTTL.asInstanceOf[js.Any])
    if (expiryNamespace != null) __obj.updateDynamic("expiryNamespace")(expiryNamespace.asInstanceOf[js.Any])
    if (methodPrefix != null) __obj.updateDynamic("methodPrefix")(methodPrefix.asInstanceOf[js.Any])
    if (namespace != null) __obj.updateDynamic("namespace")(namespace.asInstanceOf[js.Any])
    if (separator != null) __obj.updateDynamic("separator")(separator.asInstanceOf[js.Any])
    if (sub != null) __obj.updateDynamic("sub")(sub.asInstanceOf[js.Any])
    __obj.asInstanceOf[LevelTTLOptions]
  }
}

