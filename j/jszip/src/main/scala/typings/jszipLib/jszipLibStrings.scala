package typings
package jszipLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object jszipLibStrings {
  @js.native
  sealed trait DEFLATE extends Compression
  
  @js.native
  sealed trait DOS extends js.Object
  
  @js.native
  sealed trait STORE extends Compression
  
  @js.native
  sealed trait UNIX extends js.Object
  
  @js.native
  sealed trait array
    extends jszipLib.jszipMod.InputType
       with jszipLib.jszipMod.OutputType
  
  @js.native
  sealed trait arraybuffer
    extends jszipLib.jszipMod.InputType
       with jszipLib.jszipMod.OutputType
  
  @js.native
  sealed trait base64
    extends jszipLib.jszipMod.InputType
       with jszipLib.jszipMod.OutputType
  
  @js.native
  sealed trait binarystring
    extends jszipLib.jszipMod.InputType
       with jszipLib.jszipMod.OutputType
  
  @js.native
  sealed trait blob
    extends jszipLib.jszipMod.InputType
       with jszipLib.jszipMod.OutputType
  
  @js.native
  sealed trait nodebuffer
    extends jszipLib.jszipMod.OutputType
  
  @js.native
  sealed trait nodestream extends js.Object
  
  @js.native
  sealed trait stream
    extends jszipLib.jszipMod.InputType
  
  @js.native
  sealed trait string
    extends jszipLib.jszipMod.InputType
  
  @js.native
  sealed trait text
    extends jszipLib.jszipMod.InputType
       with jszipLib.jszipMod.OutputType
  
  @js.native
  sealed trait uint8array
    extends jszipLib.jszipMod.InputType
       with jszipLib.jszipMod.OutputType
  
  @scala.inline
  def DEFLATE: DEFLATE = "DEFLATE".asInstanceOf[DEFLATE]
  @scala.inline
  def DOS: DOS = "DOS".asInstanceOf[DOS]
  @scala.inline
  def STORE: STORE = "STORE".asInstanceOf[STORE]
  @scala.inline
  def UNIX: UNIX = "UNIX".asInstanceOf[UNIX]
  @scala.inline
  def array: array = "array".asInstanceOf[array]
  @scala.inline
  def arraybuffer: arraybuffer = "arraybuffer".asInstanceOf[arraybuffer]
  @scala.inline
  def base64: base64 = "base64".asInstanceOf[base64]
  @scala.inline
  def binarystring: binarystring = "binarystring".asInstanceOf[binarystring]
  @scala.inline
  def blob: blob = "blob".asInstanceOf[blob]
  @scala.inline
  def nodebuffer: nodebuffer = "nodebuffer".asInstanceOf[nodebuffer]
  @scala.inline
  def nodestream: nodestream = "nodestream".asInstanceOf[nodestream]
  @scala.inline
  def stream: stream = "stream".asInstanceOf[stream]
  @scala.inline
  def string: string = "string".asInstanceOf[string]
  @scala.inline
  def text: text = "text".asInstanceOf[text]
  @scala.inline
  def uint8array: uint8array = "uint8array".asInstanceOf[uint8array]
}

