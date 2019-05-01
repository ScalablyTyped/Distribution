package typings
package iferrLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object iferrMod {
  type nodeCallback[T] = js.Function2[/* err */ stdLib.Error | scala.Null, /* repeated */ T, js.Any]
}
