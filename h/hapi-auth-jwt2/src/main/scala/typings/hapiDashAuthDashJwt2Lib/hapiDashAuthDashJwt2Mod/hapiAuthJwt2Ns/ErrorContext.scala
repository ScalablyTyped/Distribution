package typings
package hapiDashAuthDashJwt2Lib.hapiDashAuthDashJwt2Mod.hapiAuthJwt2Ns

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait ErrorContext extends js.Object {
  /**
           * attributes passed into the Boom method call
           */
  var attributes: js.UndefOr[org.scalablytyped.runtime.StringDictionary[java.lang.String]] = js.undefined
  /**
           * Boom method to call (eg. unauthorized)
           */
  var errorType: java.lang.String
  /**
           * message passed into the Boom method call
           */
  var message: js.UndefOr[java.lang.String] = js.undefined
  /**
           * schema passed into the Boom method call
           */
  var schema: java.lang.String
}

