package typings
package jsonapiDashSerializerLib.jsonapiDashSerializerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Relation extends js.Object {
  var attributes: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  var included: js.UndefOr[scala.Boolean] = js.undefined
  var ref: java.lang.String | RefFunction
}

