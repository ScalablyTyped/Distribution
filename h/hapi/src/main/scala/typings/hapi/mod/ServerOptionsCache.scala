package typings.hapi.mod

import org.scalablytyped.runtime.StringDictionary
import typings.catbox.mod.ClientApi
import typings.catbox.mod.ClientOptions
import typings.catbox.mod.PolicyOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ServerOptionsCache
  extends PolicyOptions[js.Any]
     with /** other options passed to the catbox strategy used. Other options are only passed to catbox when engine above is a class or function and ignored if engine is a catbox engine object). */
/* s */ StringDictionary[js.Any] {
  /** catbox engine object. */
  var engine: js.UndefOr[ClientApi[_]] = js.native
  /**
    * an identifier used later when provisioning or configuring caching for server methods or plugins. Each cache name must be unique. A single item may omit the name option which defines
    * the default cache. If every cache includes a name, a default memory cache is provisioned as well.
    */
  var name: js.UndefOr[String] = js.native
  /** (optional) string used to isolate cached data. Defaults to 'hapi-cache'. */
  var partition: js.UndefOr[String] = js.native
  /**
    * a class or a prototype function
    */
  var provider: js.UndefOr[CacheProvider[ClientOptions]] = js.native
  /** if true, allows multiple cache users to share the same segment (e.g. multiple methods using the same cache storage container). Default to false. */
  var shared: js.UndefOr[Boolean] = js.native
}

object ServerOptionsCache {
  @scala.inline
  def apply(): ServerOptionsCache = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ServerOptionsCache]
  }
  @scala.inline
  implicit class ServerOptionsCacheOps[Self <: ServerOptionsCache] (val x: Self) extends AnyVal {
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
    def setEngine(value: ClientApi[_]): Self = this.set("engine", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEngine: Self = this.set("engine", js.undefined)
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
    @scala.inline
    def setPartition(value: String): Self = this.set("partition", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePartition: Self = this.set("partition", js.undefined)
    @scala.inline
    def setProvider(value: CacheProvider[ClientOptions]): Self = this.set("provider", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteProvider: Self = this.set("provider", js.undefined)
    @scala.inline
    def setShared(value: Boolean): Self = this.set("shared", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteShared: Self = this.set("shared", js.undefined)
  }
  
}

