package typings.jeeJsf.jsf.ajax

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RequestOptions extends js.Object {
  /**
    * space seperated list of client identifiers
    */
  var execute: js.UndefOr[String] = js.native
  /**
    * client behavior event name from the request parameter
    */
  @JSName("javax.faces.behavior.event")
  var javaxDotfacesDotbehaviorDotevent: js.UndefOr[js.Any] = js.native
  /**
    * function to callback for error
    * @param callback the callback function
    */
  var onerror: js.UndefOr[js.Function1[/* callback */ js.Function1[/* data */ RequestData, Unit], Unit]] = js.native
  /**
    * function to callback for event
    * @param callback the callback function
    */
  var onevent: js.UndefOr[js.Function1[/* callback */ js.Function1[/* data */ RequestData, Unit], Unit]] = js.native
  /**
    * object containing parameters to include in the request
    */
  var params: js.UndefOr[js.Any] = js.native
  /**
    * space seperated list of client identifiers
    */
  var render: js.UndefOr[String] = js.native
}

object RequestOptions {
  @scala.inline
  def apply(): RequestOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RequestOptions]
  }
  @scala.inline
  implicit class RequestOptionsOps[Self <: RequestOptions] (val x: Self) extends AnyVal {
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
    def setExecute(value: String): Self = this.set("execute", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteExecute: Self = this.set("execute", js.undefined)
    @scala.inline
    def setJavaxDotfacesDotbehaviorDotevent(value: js.Any): Self = this.set("javax.faces.behavior.event", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteJavaxDotfacesDotbehaviorDotevent: Self = this.set("javax.faces.behavior.event", js.undefined)
    @scala.inline
    def setOnerror(value: /* callback */ js.Function1[/* data */ RequestData, Unit] => Unit): Self = this.set("onerror", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnerror: Self = this.set("onerror", js.undefined)
    @scala.inline
    def setOnevent(value: /* callback */ js.Function1[/* data */ RequestData, Unit] => Unit): Self = this.set("onevent", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnevent: Self = this.set("onevent", js.undefined)
    @scala.inline
    def setParams(value: js.Any): Self = this.set("params", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteParams: Self = this.set("params", js.undefined)
    @scala.inline
    def setRender(value: String): Self = this.set("render", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRender: Self = this.set("render", js.undefined)
  }
  
}

