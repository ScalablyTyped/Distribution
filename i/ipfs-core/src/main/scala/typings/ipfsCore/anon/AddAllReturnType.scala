package typings.ipfsCore.anon

import typings.std.ReturnType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AddAllReturnType extends js.Object {
  
  var addAll: ReturnType[
    /* import warning: importer.ImportType#apply Failed type conversion: typeof imported_add-all */ js.Any
  ] = js.native
}
object AddAllReturnType {
  
  @scala.inline
  def apply(
    addAll: ReturnType[
      /* import warning: importer.ImportType#apply Failed type conversion: typeof imported_add-all */ js.Any
    ]
  ): AddAllReturnType = {
    val __obj = js.Dynamic.literal(addAll = addAll.asInstanceOf[js.Any])
    __obj.asInstanceOf[AddAllReturnType]
  }
  
  @scala.inline
  implicit class AddAllReturnTypeOps[Self <: AddAllReturnType] (val x: Self) extends AnyVal {
    
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
    def setAddAll(
      value: ReturnType[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof imported_add-all */ js.Any
        ]
    ): Self = this.set("addAll", value.asInstanceOf[js.Any])
  }
}
