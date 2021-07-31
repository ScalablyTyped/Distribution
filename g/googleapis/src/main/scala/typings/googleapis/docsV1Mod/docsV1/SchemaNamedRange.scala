package typings.googleapis.docsV1Mod.docsV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
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
trait SchemaNamedRange extends StObject {
  
  /**
    * The name of the named range.
    */
  var name: js.UndefOr[String] = js.undefined
  
  /**
    * The ID of the named range.
    */
  var namedRangeId: js.UndefOr[String] = js.undefined
  
  /**
    * The ranges that belong to this named range.
    */
  var ranges: js.UndefOr[js.Array[SchemaRange]] = js.undefined
}
object SchemaNamedRange {
  
  @scala.inline
  def apply(): SchemaNamedRange = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaNamedRange]
  }
  
  @scala.inline
  implicit class SchemaNamedRangeMutableBuilder[Self <: SchemaNamedRange] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    @scala.inline
    def setNamedRangeId(value: String): Self = StObject.set(x, "namedRangeId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNamedRangeIdUndefined: Self = StObject.set(x, "namedRangeId", js.undefined)
    
    @scala.inline
    def setRanges(value: js.Array[SchemaRange]): Self = StObject.set(x, "ranges", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRangesUndefined: Self = StObject.set(x, "ranges", js.undefined)
    
    @scala.inline
    def setRangesVarargs(value: SchemaRange*): Self = StObject.set(x, "ranges", js.Array(value :_*))
  }
}
