package typings
package jqueryDotAjaxfileLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
 * Interface for the jqXHR object
 */
@js.native
trait JQueryXHR
  extends stdLib.XMLHttpRequest
     with JQueryPromise[js.Any] {
  /**
       * Property containing the parsed response if the response Content-Type is json
       */
  var responseJSON: js.UndefOr[js.Any] = js.native
  /**
       * Cancel the request. 
       *
       * @param statusText A string passed as the textStatus parameter for the done callback. Default value: "canceled"
       */
  def abort(statusText: java.lang.String): scala.Unit = js.native
  /**
       * A function to be called if the request fails.
       */
  def error(xhr: JQueryXHR, textStatus: java.lang.String, errorThrown: java.lang.String): scala.Unit = js.native
  /**
       * Incorporates the functionality of the .done() and .fail() methods, allowing (as of jQuery 1.8) the underlying Promise to be manipulated. Refer to deferred.then() for implementation details.
       */
  def `then`(
    doneCallback: js.Function3[
      /* data */ js.Any, 
      /* textStatus */ java.lang.String, 
      /* jqXHR */ this.type, 
      scala.Unit
    ]
  ): JQueryPromise[_] = js.native
  /**
       * Incorporates the functionality of the .done() and .fail() methods, allowing (as of jQuery 1.8) the underlying Promise to be manipulated. Refer to deferred.then() for implementation details.
       */
  def `then`(
    doneCallback: js.Function3[
      /* data */ js.Any, 
      /* textStatus */ java.lang.String, 
      /* jqXHR */ this.type, 
      scala.Unit
    ],
    failCallback: js.Function3[
      /* jqXHR */ this.type, 
      /* textStatus */ java.lang.String, 
      /* errorThrown */ js.Any, 
      scala.Unit
    ]
  ): JQueryPromise[_] = js.native
}

