package typings.jqueryAjaxfile

import typings.std.XMLHttpRequest
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Interface for the jqXHR object
  */
@js.native
trait JQueryXHR
  extends XMLHttpRequest
     with JQueryPromise[js.Any] {
  
  def abort(statusText: String): Unit = js.native
  
  /**
    * A function to be called if the request fails.
    */
  def error(xhr: JQueryXHR, textStatus: String, errorThrown: String): Unit = js.native
  
  /**
    * Property containing the parsed response if the response Content-Type is json
    */
  var responseJSON: js.UndefOr[js.Any] = js.native
  
  /**
    * Incorporates the functionality of the .done() and .fail() methods, allowing (as of jQuery 1.8) the underlying Promise to be manipulated. Refer to deferred.then() for implementation details.
    */
  def `then`(
    doneCallback: js.Function3[/* data */ js.Any, /* textStatus */ String, /* jqXHR */ this.type, Unit]
  ): JQueryPromise[_] = js.native
  def `then`(
    doneCallback: js.Function3[/* data */ js.Any, /* textStatus */ String, /* jqXHR */ this.type, Unit],
    failCallback: js.Function3[/* jqXHR */ this.type, /* textStatus */ String, /* errorThrown */ js.Any, Unit]
  ): JQueryPromise[_] = js.native
}
