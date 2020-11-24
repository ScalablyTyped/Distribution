package typings.jsMd5.mod

import typings.std.ArrayBuffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Md5_ extends js.Object {
  
  def array(): js.Array[Double] = js.native
  
  def arrayBuffer(): ArrayBuffer = js.native
  
  def base64(): String = js.native
  
  def buffer(): ArrayBuffer = js.native
  
  def digest(): js.Array[Double] = js.native
  
  def hex(): String = js.native
  
  def update(message: message): Md5_ = js.native
}
object Md5_ {
  
  @scala.inline
  def apply(
    array: () => js.Array[Double],
    arrayBuffer: () => ArrayBuffer,
    base64: () => String,
    buffer: () => ArrayBuffer,
    digest: () => js.Array[Double],
    hex: () => String,
    update: message => Md5_
  ): Md5_ = {
    val __obj = js.Dynamic.literal(array = js.Any.fromFunction0(array), arrayBuffer = js.Any.fromFunction0(arrayBuffer), base64 = js.Any.fromFunction0(base64), buffer = js.Any.fromFunction0(buffer), digest = js.Any.fromFunction0(digest), hex = js.Any.fromFunction0(hex), update = js.Any.fromFunction1(update))
    __obj.asInstanceOf[Md5_]
  }
  
  @scala.inline
  implicit class Md5_Ops[Self <: Md5_] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setArray(value: () => js.Array[Double]): Self = this.set("array", js.Any.fromFunction0(value))
    
    @scala.inline
    def setArrayBuffer(value: () => ArrayBuffer): Self = this.set("arrayBuffer", js.Any.fromFunction0(value))
    
    @scala.inline
    def setBase64(value: () => String): Self = this.set("base64", js.Any.fromFunction0(value))
    
    @scala.inline
    def setBuffer(value: () => ArrayBuffer): Self = this.set("buffer", js.Any.fromFunction0(value))
    
    @scala.inline
    def setDigest(value: () => js.Array[Double]): Self = this.set("digest", js.Any.fromFunction0(value))
    
    @scala.inline
    def setHex(value: () => String): Self = this.set("hex", js.Any.fromFunction0(value))
    
    @scala.inline
    def setUpdate(value: message => Md5_): Self = this.set("update", js.Any.fromFunction1(value))
  }
}
