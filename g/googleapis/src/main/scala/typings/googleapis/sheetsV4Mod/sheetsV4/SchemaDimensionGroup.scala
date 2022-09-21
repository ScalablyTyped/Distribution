package typings.googleapis.sheetsV4Mod.sheetsV4

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaDimensionGroup extends StObject {
  
  /**
    * This field is true if this group is collapsed. A collapsed group remains collapsed if an overlapping group at a shallower depth is expanded. A true value does not imply that all dimensions within the group are hidden, since a dimension's visibility can change independently from this group property. However, when this property is updated, all dimensions within it are set to hidden if this field is true, or set to visible if this field is false.
    */
  var collapsed: js.UndefOr[Boolean | Null] = js.undefined
  
  /**
    * The depth of the group, representing how many groups have a range that wholly contains the range of this group.
    */
  var depth: js.UndefOr[Double | Null] = js.undefined
  
  /**
    * The range over which this group exists.
    */
  var range: js.UndefOr[SchemaDimensionRange] = js.undefined
}
object SchemaDimensionGroup {
  
  inline def apply(): SchemaDimensionGroup = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaDimensionGroup]
  }
  
  extension [Self <: SchemaDimensionGroup](x: Self) {
    
    inline def setCollapsed(value: Boolean): Self = StObject.set(x, "collapsed", value.asInstanceOf[js.Any])
    
    inline def setCollapsedNull: Self = StObject.set(x, "collapsed", null)
    
    inline def setCollapsedUndefined: Self = StObject.set(x, "collapsed", js.undefined)
    
    inline def setDepth(value: Double): Self = StObject.set(x, "depth", value.asInstanceOf[js.Any])
    
    inline def setDepthNull: Self = StObject.set(x, "depth", null)
    
    inline def setDepthUndefined: Self = StObject.set(x, "depth", js.undefined)
    
    inline def setRange(value: SchemaDimensionRange): Self = StObject.set(x, "range", value.asInstanceOf[js.Any])
    
    inline def setRangeUndefined: Self = StObject.set(x, "range", js.undefined)
  }
}
