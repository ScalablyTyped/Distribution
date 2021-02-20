package typings.googleapis.docsV1Mod.docsV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * The properties of a list which describe the look and feel of bullets
  * belonging to paragraphs associated with a list.
  */
@js.native
trait SchemaListProperties extends StObject {
  
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
  implicit class SchemaListPropertiesMutableBuilder[Self <: SchemaListProperties] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setNestingLevels(value: js.Array[SchemaNestingLevel]): Self = StObject.set(x, "nestingLevels", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNestingLevelsUndefined: Self = StObject.set(x, "nestingLevels", js.undefined)
    
    @scala.inline
    def setNestingLevelsVarargs(value: SchemaNestingLevel*): Self = StObject.set(x, "nestingLevels", js.Array(value :_*))
  }
}
