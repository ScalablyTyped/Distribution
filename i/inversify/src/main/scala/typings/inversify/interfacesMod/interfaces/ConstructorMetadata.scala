package typings.inversify.interfacesMod.interfaces

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ConstructorMetadata extends js.Object {
  var compilerGeneratedMetadata: js.UndefOr[js.Array[js.Function]] = js.native
  var userGeneratedMetadata: MetadataMap = js.native
}

object ConstructorMetadata {
  @scala.inline
  def apply(userGeneratedMetadata: MetadataMap): ConstructorMetadata = {
    val __obj = js.Dynamic.literal(userGeneratedMetadata = userGeneratedMetadata.asInstanceOf[js.Any])
    __obj.asInstanceOf[ConstructorMetadata]
  }
  @scala.inline
  implicit class ConstructorMetadataOps[Self <: ConstructorMetadata] (val x: Self) extends AnyVal {
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
    def setUserGeneratedMetadata(value: MetadataMap): Self = this.set("userGeneratedMetadata", value.asInstanceOf[js.Any])
    @scala.inline
    def setCompilerGeneratedMetadataVarargs(value: js.Function*): Self = this.set("compilerGeneratedMetadata", js.Array(value :_*))
    @scala.inline
    def setCompilerGeneratedMetadata(value: js.Array[js.Function]): Self = this.set("compilerGeneratedMetadata", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCompilerGeneratedMetadata: Self = this.set("compilerGeneratedMetadata", js.undefined)
  }
  
}

