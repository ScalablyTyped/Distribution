package typings.iitc

import typings.jquery.JQuery.jqXHR
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object sendRequestMod {
  
  object global {
    
    @JSGlobal("outOfDateUserPrompt")
    @js.native
    def outOfDateUserPrompt(): Unit = js.native
    
    /**
      * posts AJAX request to Ingress API.
      * @param action last part of the actual URL, the rpc/dashboard. is added automatically
      * @param data  JSON data to post. method will be derived automatically from action, but may
      *              be overridden. Expects to be given Hash. Strings are not supported.
      * @param successCallback method to call on success. See jQuery API docs for available arguments: http://api.jquery.com/jQuery.ajax/
      * @param errorCallback see above. Additionally it is logged if the request failed.
      */
    @JSGlobal("postAjax")
    @js.native
    def postAjax(
      action: String,
      data: js.Any,
      successCallback: js.Function3[/* data */ js.Any, /* textStatus */ String, /* jqXHR */ jqXHR[_], Unit],
      errorCallback: js.Function3[/* jqXHR */ jqXHR[_], /* textStatus */ String, /* errorThrown */ String, Unit]
    ): js.Any = js.native
  }
}
