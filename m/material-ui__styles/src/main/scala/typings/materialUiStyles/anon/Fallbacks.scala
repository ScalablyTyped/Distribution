package typings.materialUiStyles.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Fallbacks extends js.Object {
  var fallbacks: js.UndefOr[
    js.Array[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSS.FontFace */ _
    ]
  ] = js.native
}

object Fallbacks {
  @scala.inline
  def apply(): Fallbacks = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Fallbacks]
  }
  @scala.inline
  implicit class FallbacksOps[Self <: Fallbacks] (val x: Self) extends AnyVal {
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
    def setFallbacksVarargs(value: js.Any*): Self = this.set("fallbacks", js.Array(value :_*))
    @scala.inline
    def setFallbacks(
      value: js.Array[
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSS.FontFace */ _
        ]
    ): Self = this.set("fallbacks", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFallbacks: Self = this.set("fallbacks", js.undefined)
  }
  
}

