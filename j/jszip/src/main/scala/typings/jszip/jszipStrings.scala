package typings.jszip

import typings.jszip.mod.Compression
import typings.jszip.mod.InputType
import typings.jszip.mod.OutputType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object jszipStrings {
  
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
  def stream: stream = "stream".asInstanceOf[stream]
  
  @scala.inline
  def string: string = "string".asInstanceOf[string]
  
  @scala.inline
  def text: text = "text".asInstanceOf[text]
  
  @scala.inline
  def uint8array: uint8array = "uint8array".asInstanceOf[uint8array]
  
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
    extends InputType
       with OutputType
  
  @js.native
  sealed trait arraybuffer
    extends InputType
       with OutputType
  
  @js.native
  sealed trait base64
    extends InputType
       with OutputType
  
  @js.native
  sealed trait binarystring
    extends InputType
       with OutputType
  
  @js.native
  sealed trait blob
    extends InputType
       with OutputType
  
  @js.native
  sealed trait nodebuffer extends OutputType
  
  @js.native
  sealed trait stream extends InputType
  
  @js.native
  sealed trait string
    extends InputType
       with OutputType
  
  @js.native
  sealed trait text
    extends InputType
       with OutputType
  
  @js.native
  sealed trait uint8array
    extends InputType
       with OutputType
}
