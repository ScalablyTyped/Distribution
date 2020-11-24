package typings.kikBrowser

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait KikGetFromCameraCallbacks extends js.Object {
  
  def onCancel(): Unit = js.native
  
  def onComplete(photos: js.Array[String]): Unit = js.native
  
  def onPhoto(photo: String, index: Double): Unit = js.native
  
  def onSelect(numPhotos: Double): Unit = js.native
}
object KikGetFromCameraCallbacks {
  
  @scala.inline
  def apply(
    onCancel: () => Unit,
    onComplete: js.Array[String] => Unit,
    onPhoto: (String, Double) => Unit,
    onSelect: Double => Unit
  ): KikGetFromCameraCallbacks = {
    val __obj = js.Dynamic.literal(onCancel = js.Any.fromFunction0(onCancel), onComplete = js.Any.fromFunction1(onComplete), onPhoto = js.Any.fromFunction2(onPhoto), onSelect = js.Any.fromFunction1(onSelect))
    __obj.asInstanceOf[KikGetFromCameraCallbacks]
  }
  
  @scala.inline
  implicit class KikGetFromCameraCallbacksOps[Self <: KikGetFromCameraCallbacks] (val x: Self) extends AnyVal {
    
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
    def setOnCancel(value: () => Unit): Self = this.set("onCancel", js.Any.fromFunction0(value))
    
    @scala.inline
    def setOnComplete(value: js.Array[String] => Unit): Self = this.set("onComplete", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnPhoto(value: (String, Double) => Unit): Self = this.set("onPhoto", js.Any.fromFunction2(value))
    
    @scala.inline
    def setOnSelect(value: Double => Unit): Self = this.set("onSelect", js.Any.fromFunction1(value))
  }
}
