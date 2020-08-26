package typings.knockoutMapping.mod.global

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait KnockoutMappingUpdateOptions extends js.Object {
  var data: js.Any = js.native
  var observable: js.UndefOr[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify KnockoutObservable<any> */ js.Any
  ] = js.native
  var parent: js.Any = js.native
  var target: js.Any = js.native
}

object KnockoutMappingUpdateOptions {
  @scala.inline
  def apply(data: js.Any, parent: js.Any, target: js.Any): KnockoutMappingUpdateOptions = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], parent = parent.asInstanceOf[js.Any], target = target.asInstanceOf[js.Any])
    __obj.asInstanceOf[KnockoutMappingUpdateOptions]
  }
  @scala.inline
  implicit class KnockoutMappingUpdateOptionsOps[Self <: KnockoutMappingUpdateOptions] (val x: Self) extends AnyVal {
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
    def setData(value: js.Any): Self = this.set("data", value.asInstanceOf[js.Any])
    @scala.inline
    def setParent(value: js.Any): Self = this.set("parent", value.asInstanceOf[js.Any])
    @scala.inline
    def setTarget(value: js.Any): Self = this.set("target", value.asInstanceOf[js.Any])
    @scala.inline
    def setObservable(
      value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify KnockoutObservable<any> */ js.Any
    ): Self = this.set("observable", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteObservable: Self = this.set("observable", js.undefined)
  }
  
}

