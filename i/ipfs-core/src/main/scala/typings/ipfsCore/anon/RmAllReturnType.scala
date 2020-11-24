package typings.ipfsCore.anon

import typings.std.ReturnType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RmAllReturnType extends js.Object {
  
  var rmAll: ReturnType[
    /* import warning: importer.ImportType#apply Failed type conversion: typeof imported_rm-all */ js.Any
  ] = js.native
}
object RmAllReturnType {
  
  @scala.inline
  def apply(
    rmAll: ReturnType[
      /* import warning: importer.ImportType#apply Failed type conversion: typeof imported_rm-all */ js.Any
    ]
  ): RmAllReturnType = {
    val __obj = js.Dynamic.literal(rmAll = rmAll.asInstanceOf[js.Any])
    __obj.asInstanceOf[RmAllReturnType]
  }
  
  @scala.inline
  implicit class RmAllReturnTypeOps[Self <: RmAllReturnType] (val x: Self) extends AnyVal {
    
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
    def setRmAll(
      value: ReturnType[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof imported_rm-all */ js.Any
        ]
    ): Self = this.set("rmAll", value.asInstanceOf[js.Any])
  }
}
