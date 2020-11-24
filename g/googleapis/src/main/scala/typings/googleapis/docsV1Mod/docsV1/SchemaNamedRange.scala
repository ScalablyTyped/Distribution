package typings.googleapis.docsV1Mod.docsV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A collection of Ranges with the same named range ID.  Named ranges allow
  * developers to associate parts of a document with an arbitrary user-defined
  * label so their contents can be programmatically read or edited at a later
  * time. A document can contain multiple named ranges with the same name, but
  * every named range has a unique ID.  A named range is created with a single
  * Range, and content inserted inside a named range generally expands that
  * range. However, certain document changes can cause the range to be split
  * into multiple ranges.  Named ranges are not private. All applications and
  * collaborators that have access to the document can see its named ranges.
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
    * The ranges that belong to this named range.
    */
  var ranges: js.UndefOr[js.Array[SchemaRange]] = js.native
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
    def setRangesVarargs(value: SchemaRange*): Self = this.set("ranges", js.Array(value :_*))
    
    @scala.inline
    def setRanges(value: js.Array[SchemaRange]): Self = this.set("ranges", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRanges: Self = this.set("ranges", js.undefined)
  }
}
