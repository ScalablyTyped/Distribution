package typings
package jsDashSha512Lib.jsDashSha512Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait HmacStatic extends js.Object {
  def apply(key: java.lang.String, messageToHash: java.lang.String): java.lang.String = js.native
  def create(key: java.lang.String): Hash = js.native
  def update(key: java.lang.String, messageToHash: java.lang.String): Hash = js.native
}

