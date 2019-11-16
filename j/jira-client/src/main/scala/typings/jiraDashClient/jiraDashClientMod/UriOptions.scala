package typings.jiraDashClient.jiraDashClientMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UriOptions extends js.Object {
  var intermediatePath: js.UndefOr[String] = js.undefined
  var pathname: String
  var query: js.UndefOr[Query] = js.undefined
}

object UriOptions {
  @scala.inline
  def apply(pathname: String, intermediatePath: String = null, query: Query = null): UriOptions = {
    val __obj = js.Dynamic.literal(pathname = pathname)
    if (intermediatePath != null) __obj.updateDynamic("intermediatePath")(intermediatePath)
    if (query != null) __obj.updateDynamic("query")(query)
    __obj.asInstanceOf[UriOptions]
  }
}

