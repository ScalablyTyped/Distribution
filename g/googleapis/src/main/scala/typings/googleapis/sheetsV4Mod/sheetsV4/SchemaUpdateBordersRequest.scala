package typings.googleapis.sheetsV4Mod.sheetsV4

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Updates the borders of a range. If a field is not set in the request, that
  * means the border remains as-is. For example, with two subsequent
  * UpdateBordersRequest:   1. range: A1:A5 `{ top: RED, bottom: WHITE }`  2.
  * range: A1:A5 `{ left: BLUE }`  That would result in A1:A5 having a borders
  * of `{ top: RED, bottom: WHITE, left: BLUE }`. If you want to clear a
  * border, explicitly set the style to NONE.
  */
@js.native
trait SchemaUpdateBordersRequest extends js.Object {
  
  /**
    * The border to put at the bottom of the range.
    */
  var bottom: js.UndefOr[SchemaBorder] = js.native
  
  /**
    * The horizontal border to put within the range.
    */
  var innerHorizontal: js.UndefOr[SchemaBorder] = js.native
  
  /**
    * The vertical border to put within the range.
    */
  var innerVertical: js.UndefOr[SchemaBorder] = js.native
  
  /**
    * The border to put at the left of the range.
    */
  var left: js.UndefOr[SchemaBorder] = js.native
  
  /**
    * The range whose borders should be updated.
    */
  var range: js.UndefOr[SchemaGridRange] = js.native
  
  /**
    * The border to put at the right of the range.
    */
  var right: js.UndefOr[SchemaBorder] = js.native
  
  /**
    * The border to put at the top of the range.
    */
  var top: js.UndefOr[SchemaBorder] = js.native
}
object SchemaUpdateBordersRequest {
  
  @scala.inline
  def apply(): SchemaUpdateBordersRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaUpdateBordersRequest]
  }
  
  @scala.inline
  implicit class SchemaUpdateBordersRequestOps[Self <: SchemaUpdateBordersRequest] (val x: Self) extends AnyVal {
    
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
    def setBottom(value: SchemaBorder): Self = this.set("bottom", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBottom: Self = this.set("bottom", js.undefined)
    
    @scala.inline
    def setInnerHorizontal(value: SchemaBorder): Self = this.set("innerHorizontal", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteInnerHorizontal: Self = this.set("innerHorizontal", js.undefined)
    
    @scala.inline
    def setInnerVertical(value: SchemaBorder): Self = this.set("innerVertical", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteInnerVertical: Self = this.set("innerVertical", js.undefined)
    
    @scala.inline
    def setLeft(value: SchemaBorder): Self = this.set("left", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLeft: Self = this.set("left", js.undefined)
    
    @scala.inline
    def setRange(value: SchemaGridRange): Self = this.set("range", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRange: Self = this.set("range", js.undefined)
    
    @scala.inline
    def setRight(value: SchemaBorder): Self = this.set("right", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRight: Self = this.set("right", js.undefined)
    
    @scala.inline
    def setTop(value: SchemaBorder): Self = this.set("top", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTop: Self = this.set("top", js.undefined)
  }
}
