package typings.iitc

import typings.jquery.JQuery.jqXHR
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object coreSendRequestMod {
  
  object global {
    
    inline def outOfDateUserPrompt(): Unit = js.Dynamic.global.applyDynamic("outOfDateUserPrompt")().asInstanceOf[Unit]
    
    /**
      * posts AJAX request to Ingress API.
      * @param action last part of the actual URL, the rpc/dashboard. is added automatically
      * @param data  JSON data to post. method will be derived automatically from action, but may
      *              be overridden. Expects to be given Hash. Strings are not supported.
      * @param successCallback method to call on success. See jQuery API docs for available arguments: http://api.jquery.com/jQuery.ajax/
      * @param errorCallback see above. Additionally it is logged if the request failed.
      */
    inline def postAjax(
      action: String,
      data: Any,
      successCallback: js.Function3[/* data */ Any, /* textStatus */ String, /* jqXHR */ jqXHR[Any], Unit],
      errorCallback: js.Function3[/* jqXHR */ jqXHR[Any], /* textStatus */ String, /* errorThrown */ String, Unit]
    ): Any = (js.Dynamic.global.applyDynamic("postAjax")(action.asInstanceOf[js.Any], data.asInstanceOf[js.Any], successCallback.asInstanceOf[js.Any], errorCallback.asInstanceOf[js.Any])).asInstanceOf[Any]
  }
}
