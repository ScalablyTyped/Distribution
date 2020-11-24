package typings.googleapis.sheetsV4Mod.sheetsV4

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A named range.
  */
@js.native
trait SchemaNamedRange extends js.Object {
  
  /**
    * The name of the named range.
    */
  var name: js.UndefOr[String] = js.native
  
  /**
    * The ID of the named range.
    */
  var namedRangeId: js.UndefOr[String] = js.native
  
  /**
    * The range this represents.
    */
  var range: js.UndefOr[SchemaGridRange] = js.native
}
object SchemaNamedRange {
  
  @scala.inline
  def apply(): SchemaNamedRange = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaNamedRange]
  }
  
  @scala.inline
  implicit class SchemaNamedRangeOps[Self <: SchemaNamedRange] (val x: Self) extends AnyVal {
    
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
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
    
    @scala.inline
    def setNamedRangeId(value: String): Self = this.set("namedRangeId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNamedRangeId: Self = this.set("namedRangeId", js.undefined)
    
    @scala.inline
    def setRange(value: SchemaGridRange): Self = this.set("range", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRange: Self = this.set("range", js.undefined)
  }
}
