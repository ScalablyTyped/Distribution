package typings
package jiraDashClientLib.jiraDashClientMod.JiraApiNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UriOptions extends js.Object {
  var intermediatePath: js.UndefOr[java.lang.String] = js.undefined
  var pathname: java.lang.String
  var query: js.UndefOr[Query] = js.undefined
}

object UriOptions {
  @scala.inline
  def apply(pathname: java.lang.String, intermediatePath: java.lang.String = null, query: Query = null): UriOptions = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("pathname")(pathname)
    if (intermediatePath != null) __obj.updateDynamic("intermediatePath")(intermediatePath)
    if (query != null) __obj.updateDynamic("query")(query)
    __obj.asInstanceOf[UriOptions]
  }
}

