package typings
package jpmLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Query the add-on's environment and access arguments passed to it
  */
@JSImport("sdk/system", JSImport.Namespace)
@js.native
object systemMod extends js.Object {
  val architecture: java.lang.String = js.native
  val build: java.lang.String = js.native
  val compiler: java.lang.String = js.native
  val env: js.Any = js.native
  val id: java.lang.String = js.native
  val name: java.lang.String = js.native
  val platform: java.lang.String = js.native
  val platformVersion: java.lang.String = js.native
  val vendor: java.lang.String = js.native
  val version: java.lang.String = js.native
  def exit(code: scala.Double): scala.Unit = js.native
  def pathFor(id: java.lang.String): java.lang.String = js.native
}

