package typings
package jqueryDotAjaxfileLib.AjaxFileJQueryNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IJQueryXHR extends js.Object {
  var beforeSend: js.UndefOr[
    js.Function2[/* jqXHR */ this.type, /* settings */ jqueryDotAjaxfileLib.JQueryAjaxSettings, _]
  ] = js.native
  var complete: js.UndefOr[js.Function2[/* jqXHR */ this.type, /* textStatus */ java.lang.String, _]] = js.native
  var dataFilter: js.UndefOr[js.Function2[/* data */ js.Any, /* ty */ js.Any, _]] = js.native
  var error: js.UndefOr[
    js.Function3[
      /* jqXHR */ this.type, 
      /* textStatus */ java.lang.String, 
      /* errorThrown */ java.lang.String, 
      _
    ]
  ] = js.native
  var readyState: js.Any = js.native
  var responseText: java.lang.String = js.native
  var responseXML: stdLib.Document = js.native
  var status: scala.Double = js.native
  var statusCode: js.UndefOr[org.scalablytyped.runtime.StringDictionary[js.Any]] = js.native
  var statusText: java.lang.String = js.native
  var success: js.UndefOr[
    js.Function3[/* data */ js.Any, /* textStatus */ java.lang.String, /* jqXHR */ this.type, _]
  ] = js.native
  def abort(): scala.Unit = js.native
  def abort(statusText: java.lang.String): scala.Unit = js.native
  def getAllResponseHeaders(): java.lang.String = js.native
  def getResponseHeader(header: java.lang.String): java.lang.String = js.native
  def setRequestHeader(header: java.lang.String, value: java.lang.String): scala.Unit = js.native
}

