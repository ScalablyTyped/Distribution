package typings.markdownItContainer.mod.markdownItContainer

import typings.markdownIt.tokenMod.^
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ContainerOpts extends js.Object {
  var marker: js.UndefOr[String] = js.native
  var render: js.UndefOr[
    js.Function5[
      /* tokens */ js.Array[^], 
      /* index */ Double, 
      /* options */ js.Any, 
      /* env */ js.Any, 
      /* self */ typings.markdownIt.rendererMod.^, 
      Unit
    ]
  ] = js.native
  var validate: js.UndefOr[js.Function1[/* params */ String, Boolean]] = js.native
}

object ContainerOpts {
  @scala.inline
  def apply(): ContainerOpts = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ContainerOpts]
  }
  @scala.inline
  implicit class ContainerOptsOps[Self <: ContainerOpts] (val x: Self) extends AnyVal {
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
    def setMarker(value: String): Self = this.set("marker", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMarker: Self = this.set("marker", js.undefined)
    @scala.inline
    def setRender(
      value: (/* tokens */ js.Array[^], /* index */ Double, /* options */ js.Any, /* env */ js.Any, /* self */ typings.markdownIt.rendererMod.^) => Unit
    ): Self = this.set("render", js.Any.fromFunction5(value))
    @scala.inline
    def deleteRender: Self = this.set("render", js.undefined)
    @scala.inline
    def setValidate(value: /* params */ String => Boolean): Self = this.set("validate", js.Any.fromFunction1(value))
    @scala.inline
    def deleteValidate: Self = this.set("validate", js.undefined)
  }
  
}

