package typings.i18nextNodeFsBackend.i18nextNodeFsBackEnd

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * @summary Options for "i18next".
  * @interface
  */
@js.native
trait I18nextOptions extends js.Object {
  var backend: js.UndefOr[i18nextNodeFsBackEndOptions] = js.native
}

object I18nextOptions {
  @scala.inline
  def apply(): I18nextOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[I18nextOptions]
  }
  @scala.inline
  implicit class I18nextOptionsOps[Self <: I18nextOptions] (val x: Self) extends AnyVal {
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
    def setBackend(value: i18nextNodeFsBackEndOptions): Self = this.set("backend", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBackend: Self = this.set("backend", js.undefined)
  }
  
}

