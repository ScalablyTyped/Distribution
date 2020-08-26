package typings.lokijs.anon

import org.scalablytyped.runtime.StringDictionary
import typings.lokijs.lokijsStrings.destructured
import typings.lokijs.lokijsStrings.normal
import typings.lokijs.lokijsStrings.pretty
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DictcollName
  extends /* collName */ StringDictionary[js.Any | Inflate] {
  var retainDirtyFlags: js.UndefOr[Boolean] = js.native
  var serializationMethod: js.UndefOr[normal | pretty | destructured | Null] = js.native
  var throttledSaves: js.UndefOr[Boolean] = js.native
}

object DictcollName {
  @scala.inline
  def apply(): DictcollName = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DictcollName]
  }
  @scala.inline
  implicit class DictcollNameOps[Self <: DictcollName] (val x: Self) extends AnyVal {
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
    def setRetainDirtyFlags(value: Boolean): Self = this.set("retainDirtyFlags", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRetainDirtyFlags: Self = this.set("retainDirtyFlags", js.undefined)
    @scala.inline
    def setSerializationMethod(value: normal | pretty | destructured): Self = this.set("serializationMethod", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSerializationMethod: Self = this.set("serializationMethod", js.undefined)
    @scala.inline
    def setSerializationMethodNull: Self = this.set("serializationMethod", null)
    @scala.inline
    def setThrottledSaves(value: Boolean): Self = this.set("throttledSaves", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteThrottledSaves: Self = this.set("throttledSaves", js.undefined)
  }
  
}

