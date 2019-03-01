package typings
package k6Lib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object k6LibStrings {
  @js.native
  sealed trait b extends js.Object
  
  @js.native
  sealed trait base64
    extends k6Lib.cryptoMod.OutputEncoding
  
  @js.native
  sealed trait hex
    extends k6Lib.cryptoMod.OutputEncoding
  
  @scala.inline
  def b: b = "b".asInstanceOf[b]
  @scala.inline
  def base64: base64 = "base64".asInstanceOf[base64]
  @scala.inline
  def hex: hex = "hex".asInstanceOf[hex]
}

