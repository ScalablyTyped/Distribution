package typings
package jsDashBase64Lib.jsDashBase64Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("js-base64", "Base64")
@js.native
object Base64Ns extends js.Object {
  val VERSION: java.lang.String = js.native
  def atob(base64: java.lang.String): java.lang.String = js.native
  def btoa(s: java.lang.String): java.lang.String = js.native
  def btou(s: java.lang.String): java.lang.String = js.native
  def decode(base64: java.lang.String): java.lang.String = js.native
  def encode(s: java.lang.String): java.lang.String = js.native
  def encode(s: java.lang.String, uriSafe: scala.Boolean): java.lang.String = js.native
  def encodeURI(s: java.lang.String): java.lang.String = js.native
  def extendString(): scala.Unit = js.native
  def fromBase64(base64: java.lang.String): java.lang.String = js.native
  def noConflict(): jsDashBase64Lib.Anon_Atob = js.native
  def toBase64(s: java.lang.String): java.lang.String = js.native
  def toBase64(s: java.lang.String, uriSafe: scala.Boolean): java.lang.String = js.native
  def utob(s: java.lang.String): java.lang.String = js.native
}

