package typings.jpegJs.mod

import typings.jpegJs.anon.BufferRetcommentsArraystr
import typings.jpegJs.anon.ColorTransform
import typings.jpegJs.anon.FormatAsRGBA
import typings.jpegJs.anon.UintArrRetcommentsArrayst
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("jpeg-js", "decode")
@js.native
object decode extends js.Object {
  
  def apply(jpegData: BufferLike): BufferRetcommentsArraystr = js.native
  def apply(jpegData: BufferLike, opts: ColorTransform): UintArrRetcommentsArrayst = js.native
  def apply(jpegData: BufferLike, opts: FormatAsRGBA): BufferRetcommentsArraystr = js.native
}
