package typings.googleapis.docsV1Mod.docsV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * The properties of a list which describe the look and feel of bullets
  * belonging to paragraphs associated with a list.
  */
@js.native
trait SchemaListProperties extends js.Object {
  
  /**
    * Describes the properties of the bullets at the associated level.  A list
    * has at most nine levels of nesting with nesting level 0 corresponding to
    * the top-most level and nesting level 8 corresponding to the most nested
    * level. The nesting levels are returned in ascending order with the least
    * nested returned first.
    */
  var nestingLevels: js.UndefOr[js.Array[SchemaNestingLevel]] = js.native
}
object SchemaListProperties {
  
  @scala.inline
  def apply(): SchemaListProperties = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaListProperties]
  }
  
  @scala.inline
  implicit class SchemaListPropertiesOps[Self <: SchemaListProperties] (val x: Self) extends AnyVal {
    
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
    def setNestingLevelsVarargs(value: SchemaNestingLevel*): Self = this.set("nestingLevels", js.Array(value :_*))
    
    @scala.inline
    def setNestingLevels(value: js.Array[SchemaNestingLevel]): Self = this.set("nestingLevels", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNestingLevels: Self = this.set("nestingLevels", js.undefined)
  }
}
