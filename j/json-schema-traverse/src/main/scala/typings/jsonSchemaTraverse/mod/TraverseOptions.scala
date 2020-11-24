package typings.jsonSchemaTraverse.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TraverseOptions extends js.Object {
  
  /** Without option allKeys: true callback will be called only with root schema. */
  var allKeys: js.UndefOr[Boolean] = js.native
  
  /**
    * Callback function `cb` is called for each schema object (not including draft-06 boolean schemas),
    * including the root schema, in pre-order traversal. Schema references (`$ref`) are not resolved,
    * they are passed as is. Alternatively, you can pass a `{pre, post}` object as `cb`, and then `pre`
    * will be called before traversing child elements, and `post` will be called
    * after all child elementshave been traversed.
    */
  var cb: js.UndefOr[TraverseCallback] = js.native
}
object TraverseOptions {
  
  @scala.inline
  def apply(): TraverseOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TraverseOptions]
  }
  
  @scala.inline
  implicit class TraverseOptionsOps[Self <: TraverseOptions] (val x: Self) extends AnyVal {
    
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
    def setAllKeys(value: Boolean): Self = this.set("allKeys", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAllKeys: Self = this.set("allKeys", js.undefined)
    
    @scala.inline
    def setCbFunction7(
      value: (/* schema */ js.Object, /* jsonPtr */ String, /* rootSchema */ js.Object, /* parentJsonPtr */ String, /* parentKeyword */ String, /* parentSchema */ js.Object, /* keyIndex */ String | Double) => Unit
    ): Self = this.set("cb", js.Any.fromFunction7(value))
    
    @scala.inline
    def setCb(value: TraverseCallback): Self = this.set("cb", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCb: Self = this.set("cb", js.undefined)
  }
}
