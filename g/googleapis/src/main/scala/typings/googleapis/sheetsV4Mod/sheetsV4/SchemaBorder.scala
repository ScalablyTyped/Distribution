package typings.googleapis.sheetsV4Mod.sheetsV4

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A border along a cell.
  */
@js.native
trait SchemaBorder extends js.Object {
  
  /**
    * The color of the border.
    */
  var color: js.UndefOr[SchemaColor] = js.native
  
  /**
    * The style of the border.
    */
  var style: js.UndefOr[String] = js.native
  
  /**
    * The width of the border, in pixels. Deprecated; the width is determined
    * by the &quot;style&quot; field.
    */
  var width: js.UndefOr[Double] = js.native
}
object SchemaBorder {
  
  @scala.inline
  def apply(): SchemaBorder = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaBorder]
  }
  
  @scala.inline
  implicit class SchemaBorderOps[Self <: SchemaBorder] (val x: Self) extends AnyVal {
    
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
    def setColor(value: SchemaColor): Self = this.set("color", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteColor: Self = this.set("color", js.undefined)
    
    @scala.inline
    def setStyle(value: String): Self = this.set("style", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStyle: Self = this.set("style", js.undefined)
    
    @scala.inline
    def setWidth(value: Double): Self = this.set("width", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteWidth: Self = this.set("width", js.undefined)
  }
}
