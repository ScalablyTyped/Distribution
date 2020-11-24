package typings.jsqrcode

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ResultPointCallback extends js.Object {
  
  def foundPossibleResultPoint(point: FinderPattern): Unit = js.native
}
object ResultPointCallback {
  
  @scala.inline
  def apply(foundPossibleResultPoint: FinderPattern => Unit): ResultPointCallback = {
    val __obj = js.Dynamic.literal(foundPossibleResultPoint = js.Any.fromFunction1(foundPossibleResultPoint))
    __obj.asInstanceOf[ResultPointCallback]
  }
  
  @scala.inline
  implicit class ResultPointCallbackOps[Self <: ResultPointCallback] (val x: Self) extends AnyVal {
    
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
    def setFoundPossibleResultPoint(value: FinderPattern => Unit): Self = this.set("foundPossibleResultPoint", js.Any.fromFunction1(value))
  }
}
