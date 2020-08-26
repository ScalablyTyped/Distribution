package typings.jqueryFancytree.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Cache extends js.Object {
  /**
    * false: Append random '_' argument to the request url to prevent caching.
    */
  var cache: Boolean = js.native
  /**
    * Default 'json' -> Expect json format and pass json object to callbacks.
    */
  var dataType: String = js.native
  /**
    * HTTP Method (default: 'GET')
    */
  var `type`: String = js.native
}

object Cache {
  @scala.inline
  def apply(cache: Boolean, dataType: String, `type`: String): Cache = {
    val __obj = js.Dynamic.literal(cache = cache.asInstanceOf[js.Any], dataType = dataType.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Cache]
  }
  @scala.inline
  implicit class CacheOps[Self <: Cache] (val x: Self) extends AnyVal {
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
    def setCache(value: Boolean): Self = this.set("cache", value.asInstanceOf[js.Any])
    @scala.inline
    def setDataType(value: String): Self = this.set("dataType", value.asInstanceOf[js.Any])
    @scala.inline
    def setType(value: String): Self = this.set("type", value.asInstanceOf[js.Any])
  }
  
}

