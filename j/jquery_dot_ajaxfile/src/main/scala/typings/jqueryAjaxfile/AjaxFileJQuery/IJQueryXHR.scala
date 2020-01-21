package typings.jqueryAjaxfile.AjaxFileJQuery

import org.scalablytyped.runtime.StringDictionary
import typings.jqueryAjaxfile.JQueryAjaxSettings
import typings.std.Document_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IJQueryXHR extends js.Object {
  var beforeSend: js.UndefOr[js.Function2[/* jqXHR */ this.type, /* settings */ JQueryAjaxSettings, _]] = js.native
  var complete: js.UndefOr[js.Function2[/* jqXHR */ this.type, /* textStatus */ String, _]] = js.native
  var dataFilter: js.UndefOr[js.Function2[/* data */ js.Any, /* ty */ js.Any, _]] = js.native
  var error: js.UndefOr[
    js.Function3[/* jqXHR */ this.type, /* textStatus */ String, /* errorThrown */ String, _]
  ] = js.native
  var readyState: js.Any = js.native
  var responseText: String = js.native
  var responseXML: Document_ = js.native
  var status: Double = js.native
  var statusCode: js.UndefOr[StringDictionary[js.Any]] = js.native
  var statusText: String = js.native
  var success: js.UndefOr[
    js.Function3[/* data */ js.Any, /* textStatus */ String, /* jqXHR */ this.type, _]
  ] = js.native
  def abort(): Unit = js.native
  def abort(statusText: String): Unit = js.native
  def getAllResponseHeaders(): String = js.native
  def getResponseHeader(header: String): String = js.native
  def setRequestHeader(header: String, value: String): Unit = js.native
}

