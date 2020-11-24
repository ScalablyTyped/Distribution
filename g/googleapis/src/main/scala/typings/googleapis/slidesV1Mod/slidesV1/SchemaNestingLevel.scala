package typings.googleapis.slidesV1Mod.slidesV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Contains properties describing the look and feel of a list bullet at a
  * given level of nesting.
  */
@js.native
trait SchemaNestingLevel extends js.Object {
  
  /**
    * The style of a bullet at this level of nesting.
    */
  var bulletStyle: js.UndefOr[SchemaTextStyle] = js.native
}
object SchemaNestingLevel {
  
  @scala.inline
  def apply(): SchemaNestingLevel = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaNestingLevel]
  }
  
  @scala.inline
  implicit class SchemaNestingLevelOps[Self <: SchemaNestingLevel] (val x: Self) extends AnyVal {
    
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
    def setBulletStyle(value: SchemaTextStyle): Self = this.set("bulletStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBulletStyle: Self = this.set("bulletStyle", js.undefined)
  }
}
