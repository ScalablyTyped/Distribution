package typings.ipfsCoreUtils.pinsNormaliseInputMod

import typings.std.InstanceType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ToPinWithPath extends js.Object {
  
  var cid: js.UndefOr[scala.Nothing] = js.native
  
  var metadata: js.UndefOr[js.Any] = js.native
  
  var path: String | (InstanceType[
    /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof window.String */ _
  ]) | typings.cids.mod.^  = js.native
  
  var recursive: js.UndefOr[Boolean] = js.native
}
object ToPinWithPath {
  
  @scala.inline
  def apply(
    path: String | (InstanceType[
      /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof window.String */ _
    ]) | typings.cids.mod.^ 
  ): ToPinWithPath = {
    val __obj = js.Dynamic.literal(path = path.asInstanceOf[js.Any])
    __obj.asInstanceOf[ToPinWithPath]
  }
  
  @scala.inline
  implicit class ToPinWithPathOps[Self <: ToPinWithPath] (val x: Self) extends AnyVal {
    
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
    def setPath(
      value: String | (InstanceType[
          /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof window.String */ _
        ]) | typings.cids.mod.^ 
    ): Self = this.set("path", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMetadata(value: js.Any): Self = this.set("metadata", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMetadata: Self = this.set("metadata", js.undefined)
    
    @scala.inline
    def setRecursive(value: Boolean): Self = this.set("recursive", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRecursive: Self = this.set("recursive", js.undefined)
  }
}
