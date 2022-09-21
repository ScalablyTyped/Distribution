package typings.googleapis.v1Dot1Mod.doubleclickbidmanagerV11

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaPathQueryOptions extends StObject {
  
  /**
    * Custom Channel Groupings.
    */
  var channelGrouping: js.UndefOr[SchemaChannelGrouping] = js.undefined
  
  /**
    * Path Filters. There is a limit of 100 path filters that can be set per report.
    */
  var pathFilters: js.UndefOr[js.Array[SchemaPathFilter]] = js.undefined
}
object SchemaPathQueryOptions {
  
  inline def apply(): SchemaPathQueryOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaPathQueryOptions]
  }
  
  extension [Self <: SchemaPathQueryOptions](x: Self) {
    
    inline def setChannelGrouping(value: SchemaChannelGrouping): Self = StObject.set(x, "channelGrouping", value.asInstanceOf[js.Any])
    
    inline def setChannelGroupingUndefined: Self = StObject.set(x, "channelGrouping", js.undefined)
    
    inline def setPathFilters(value: js.Array[SchemaPathFilter]): Self = StObject.set(x, "pathFilters", value.asInstanceOf[js.Any])
    
    inline def setPathFiltersUndefined: Self = StObject.set(x, "pathFilters", js.undefined)
    
    inline def setPathFiltersVarargs(value: SchemaPathFilter*): Self = StObject.set(x, "pathFilters", js.Array(value*))
  }
}
