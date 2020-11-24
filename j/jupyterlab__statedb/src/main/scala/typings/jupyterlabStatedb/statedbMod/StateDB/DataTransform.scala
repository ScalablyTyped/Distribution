package typings.jupyterlabStatedb.statedbMod.StateDB

import typings.jupyterlabStatedb.jupyterlabStatedbStrings.cancel
import typings.jupyterlabStatedb.jupyterlabStatedbStrings.clear
import typings.jupyterlabStatedb.jupyterlabStatedbStrings.merge
import typings.jupyterlabStatedb.jupyterlabStatedbStrings.overwrite
import typings.luminoCoreutils.jsonMod.ReadonlyPartialJSONValue
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A data transformation that can be applied to a state database.
  */
@js.native
trait DataTransform[T /* <: ReadonlyPartialJSONValue */] extends js.Object {
  
  /**
    * The contents of the change operation.
    */
  var contents: Content[T] | Null = js.native
  
  var `type`: cancel | clear | merge | overwrite = js.native
}
object DataTransform {
  
  @scala.inline
  def apply[T /* <: ReadonlyPartialJSONValue */](`type`: cancel | clear | merge | overwrite): DataTransform[T] = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[DataTransform[T]]
  }
  
  @scala.inline
  implicit class DataTransformOps[Self <: DataTransform[_], T /* <: ReadonlyPartialJSONValue */] (val x: Self with DataTransform[T]) extends AnyVal {
    
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
    def setType(value: cancel | clear | merge | overwrite): Self = this.set("type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setContents(value: Content[T]): Self = this.set("contents", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setContentsNull: Self = this.set("contents", null)
  }
}
