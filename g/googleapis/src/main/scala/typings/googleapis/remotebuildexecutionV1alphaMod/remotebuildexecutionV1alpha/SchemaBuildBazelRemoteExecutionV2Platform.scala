package typings.googleapis.remotebuildexecutionV1alphaMod.remotebuildexecutionV1alpha

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A `Platform` is a set of requirements, such as hardware, operating system,
  * or compiler toolchain, for an Action&#39;s execution environment. A
  * `Platform` is represented as a series of key-value pairs representing the
  * properties that are required of the platform.
  */
@js.native
trait SchemaBuildBazelRemoteExecutionV2Platform extends js.Object {
  /**
    * The properties that make up this platform. In order to ensure that
    * equivalent `Platform`s always hash to the same value, the properties MUST
    * be lexicographically sorted by name, and then by value. Sorting of
    * strings is done by code point, equivalently, by the UTF-8 bytes.
    */
  var properties: js.UndefOr[js.Array[SchemaBuildBazelRemoteExecutionV2PlatformProperty]] = js.native
}

object SchemaBuildBazelRemoteExecutionV2Platform {
  @scala.inline
  def apply(properties: js.Array[SchemaBuildBazelRemoteExecutionV2PlatformProperty] = null): SchemaBuildBazelRemoteExecutionV2Platform = {
    val __obj = js.Dynamic.literal()
    if (properties != null) __obj.updateDynamic("properties")(properties.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaBuildBazelRemoteExecutionV2Platform]
  }
}

