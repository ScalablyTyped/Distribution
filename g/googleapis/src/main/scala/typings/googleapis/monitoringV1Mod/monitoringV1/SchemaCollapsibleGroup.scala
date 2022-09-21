package typings.googleapis.monitoringV1Mod.monitoringV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaCollapsibleGroup extends StObject {
  
  /**
    * The collapsed state of the widget on first page load.
    */
  var collapsed: js.UndefOr[Boolean | Null] = js.undefined
}
object SchemaCollapsibleGroup {
  
  inline def apply(): SchemaCollapsibleGroup = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaCollapsibleGroup]
  }
  
  extension [Self <: SchemaCollapsibleGroup](x: Self) {
    
    inline def setCollapsed(value: Boolean): Self = StObject.set(x, "collapsed", value.asInstanceOf[js.Any])
    
    inline def setCollapsedNull: Self = StObject.set(x, "collapsed", null)
    
    inline def setCollapsedUndefined: Self = StObject.set(x, "collapsed", js.undefined)
  }
}
