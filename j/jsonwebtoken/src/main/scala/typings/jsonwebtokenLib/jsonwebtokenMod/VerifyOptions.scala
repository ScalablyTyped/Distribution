package typings
package jsonwebtokenLib.jsonwebtokenMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait VerifyOptions extends js.Object {
  var algorithms: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  var audience: js.UndefOr[java.lang.String | js.Array[java.lang.String]] = js.undefined
  var clockTimestamp: js.UndefOr[scala.Double] = js.undefined
  var clockTolerance: js.UndefOr[scala.Double] = js.undefined
  var ignoreExpiration: js.UndefOr[scala.Boolean] = js.undefined
  var ignoreNotBefore: js.UndefOr[scala.Boolean] = js.undefined
  var issuer: js.UndefOr[java.lang.String | js.Array[java.lang.String]] = js.undefined
  var jwtid: js.UndefOr[java.lang.String] = js.undefined
  /**
    * @deprecated
    * Max age of token
    */
  var maxAge: js.UndefOr[java.lang.String] = js.undefined
  var subject: js.UndefOr[java.lang.String] = js.undefined
}

