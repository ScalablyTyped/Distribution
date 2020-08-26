package typings.googleapis.remotebuildexecutionV2Mod.remotebuildexecutionV2

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
  def apply(): SchemaBuildBazelRemoteExecutionV2Platform = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaBuildBazelRemoteExecutionV2Platform]
  }
  @scala.inline
  implicit class SchemaBuildBazelRemoteExecutionV2PlatformOps[Self <: SchemaBuildBazelRemoteExecutionV2Platform] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setPropertiesVarargs(value: SchemaBuildBazelRemoteExecutionV2PlatformProperty*): Self = this.set("properties", js.Array(value :_*))
    @scala.inline
    def setProperties(value: js.Array[SchemaBuildBazelRemoteExecutionV2PlatformProperty]): Self = this.set("properties", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteProperties: Self = this.set("properties", js.undefined)
  }
  
}

