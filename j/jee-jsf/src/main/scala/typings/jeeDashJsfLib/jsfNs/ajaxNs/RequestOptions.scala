package typings
package jeeDashJsfLib.jsfNs.ajaxNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RequestOptions extends js.Object {
  /**
    * space seperated list of client identifiers
    */
  var execute: js.UndefOr[java.lang.String] = js.undefined
  /**
    * client behavior event name from the request parameter
    */
  var `javax.faces.behavior.event`: js.UndefOr[js.Any] = js.undefined
  /**
    * function to callback for error
    * @param callback the callback function
    */
  var onerror: js.UndefOr[
    js.Function1[/* callback */ js.Function1[/* data */ RequestData, scala.Unit], scala.Unit]
  ] = js.undefined
  /**
    * function to callback for event
    * @param callback the callback function
    */
  var onevent: js.UndefOr[
    js.Function1[/* callback */ js.Function1[/* data */ RequestData, scala.Unit], scala.Unit]
  ] = js.undefined
  /**
    * object containing parameters to include in the request
    */
  var params: js.UndefOr[js.Any] = js.undefined
  /**
    * space seperated list of client identifiers
    */
  var render: js.UndefOr[java.lang.String] = js.undefined
}

object RequestOptions {
  @scala.inline
  def apply(
    execute: java.lang.String = null,
    `javax.faces.behavior.event`: js.Any = null,
    onerror: js.Function1[/* callback */ js.Function1[/* data */ RequestData, scala.Unit], scala.Unit] = null,
    onevent: js.Function1[/* callback */ js.Function1[/* data */ RequestData, scala.Unit], scala.Unit] = null,
    params: js.Any = null,
    render: java.lang.String = null
  ): RequestOptions = {
    val __obj = js.Dynamic.literal()
    if (execute != null) __obj.updateDynamic("execute")(execute)
    if (`javax.faces.behavior.event` != null) __obj.updateDynamic("javax.faces.behavior.event")(`javax.faces.behavior.event`)
    if (onerror != null) __obj.updateDynamic("onerror")(onerror)
    if (onevent != null) __obj.updateDynamic("onevent")(onevent)
    if (params != null) __obj.updateDynamic("params")(params)
    if (render != null) __obj.updateDynamic("render")(render)
    __obj.asInstanceOf[RequestOptions]
  }
}

