package typings.googleapis.mod.redisV1

import typings.googleapisCommon.apiMod.GlobalOptions
import typings.googleapisCommon.apiMod.GoogleConfigurable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Google Cloud Memorystore for Redis API
  *
  * Creates and manages Redis instances on the Google Cloud Platform.
  *
  * @example
  * const {google} = require('googleapis');
  * const redis = google.redis('v1');
  *
  * @namespace redis
  * @type {Function}
  * @version v1
  * @variation v1
  * @param {object=} options Options for Redis
  */
@JSImport("googleapis", "redis_v1.Redis")
@js.native
class Redis protected ()
  extends typings.googleapis.redisV1Mod.redisV1.Redis {
  def this(options: GlobalOptions) = this()
  def this(options: GlobalOptions, google: GoogleConfigurable) = this()
}

