package typings
package httperrLib.httperrMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** An instance of the HttpError class. */

trait HttpError
  extends stdLib.Error {
  var code: java.lang.String
  /** The HTTP response status code for the HTTP error. */
  var statusCode: scala.Double
  /** A human-readable title for the HTTP error. */
  var title: java.lang.String
  def toObject(skip: (java.lang.String | stdLib.RegExp)*): js.Any
}

