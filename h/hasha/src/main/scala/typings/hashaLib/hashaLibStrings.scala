package typings
package hashaLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object hashaLibStrings {
  @js.native
  sealed trait base64
    extends hashaLib.hashaMod.ToStringEncoding
  
  @js.native
  sealed trait buffer
    extends hashaLib.hashaMod.HashaEncoding
  
  @js.native
  sealed trait hex
    extends hashaLib.hashaMod.ToStringEncoding
  
  @js.native
  sealed trait latin1
    extends hashaLib.hashaMod.ToStringEncoding
  
  @js.native
  sealed trait md5 extends js.Object
  
  @js.native
  sealed trait sha1 extends js.Object
  
  @js.native
  sealed trait sha256 extends js.Object
  
  @js.native
  sealed trait sha512 extends js.Object
  
  @scala.inline
  def base64: base64 = "base64".asInstanceOf[base64]
  @scala.inline
  def buffer: buffer = "buffer".asInstanceOf[buffer]
  @scala.inline
  def hex: hex = "hex".asInstanceOf[hex]
  @scala.inline
  def latin1: latin1 = "latin1".asInstanceOf[latin1]
  @scala.inline
  def md5: md5 = "md5".asInstanceOf[md5]
  @scala.inline
  def sha1: sha1 = "sha1".asInstanceOf[sha1]
  @scala.inline
  def sha256: sha256 = "sha256".asInstanceOf[sha256]
  @scala.inline
  def sha512: sha512 = "sha512".asInstanceOf[sha512]
}

