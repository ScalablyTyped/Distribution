package typings
package inkLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object inkMod {
  type InkComponent[P /* <: stdLib.Record[java.lang.String, _] */] = (ComponentClass[P, js.Any, js.Any]) | (StatelessComponent[P, js.Any])
  type InkNode = (js.Array[InkElement | java.lang.String | scala.Double | scala.Null]) | InkElement | java.lang.String | scala.Double | scala.Null
}
