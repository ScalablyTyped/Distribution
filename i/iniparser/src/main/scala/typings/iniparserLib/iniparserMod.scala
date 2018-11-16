package typings
package iniparserLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("iniparser", JSImport.Namespace)
@js.native
object iniparserMod extends js.Object {
  def parse[T](file: java.lang.String, callback: js.Function2[/* err */ js.Any, /* data */ T, scala.Unit]): scala.Unit = js.native
  def parseString[T](data: java.lang.String): T = js.native
  def parseSync[T](file: java.lang.String): T = js.native
}

