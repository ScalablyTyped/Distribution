package typings
package javaLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object javaMod {
  type Callback[T] = js.Function2[/* err */ js.UndefOr[stdLib.Error], /* result */ js.UndefOr[T], scala.Unit]
  type Promisify = js.Function2[/* funct */ js.Function, /* receiver */ js.UndefOr[js.Any], js.Function]
  type ProxyFunctions = org.scalablytyped.runtime.StringDictionary[js.Function]
}
