package typings
package javaLib.javaMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object NodeJavaCoreNs {
  type Callback[T] = js.Function2[/* err */ js.UndefOr[nodeLib.Error], /* result */ js.UndefOr[T], scala.Unit]
  type Promisify = js.Function2[/* funct */ js.Function, /* receiver */ js.UndefOr[js.Any], js.Function]
}
