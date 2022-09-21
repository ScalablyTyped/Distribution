package typings.googleapis.monitoringV1Mod.monitoringV1

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaDashboard extends StObject {
  
  /**
    * The content is divided into equally spaced columns and the widgets are arranged vertically.
    */
  var columnLayout: js.UndefOr[SchemaColumnLayout] = js.undefined
  
  /**
    * Filters to reduce the amount of data charted based on the filter criteria.
    */
  var dashboardFilters: js.UndefOr[js.Array[SchemaDashboardFilter]] = js.undefined
  
  /**
    * Required. The mutable, human-readable name.
    */
  var displayName: js.UndefOr[String | Null] = js.undefined
  
  /**
    * etag is used for optimistic concurrency control as a way to help prevent simultaneous updates of a policy from overwriting each other. An etag is returned in the response to GetDashboard, and users are expected to put that etag in the request to UpdateDashboard to ensure that their change will be applied to the same version of the Dashboard configuration. The field should not be passed during dashboard creation.
    */
  var etag: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Content is arranged with a basic layout that re-flows a simple list of informational elements like widgets or tiles.
    */
  var gridLayout: js.UndefOr[SchemaGridLayout] = js.undefined
  
  /**
    * Labels applied to the dashboard
    */
  var labels: js.UndefOr[StringDictionary[String] | Null] = js.undefined
  
  /**
    * The content is arranged as a grid of tiles, with each content widget occupying one or more grid blocks.
    */
  var mosaicLayout: js.UndefOr[SchemaMosaicLayout] = js.undefined
  
  /**
    * Immutable. The resource name of the dashboard.
    */
  var name: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The content is divided into equally spaced rows and the widgets are arranged horizontally.
    */
  var rowLayout: js.UndefOr[SchemaRowLayout] = js.undefined
}
object SchemaDashboard {
  
  inline def apply(): SchemaDashboard = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaDashboard]
  }
  
  extension [Self <: SchemaDashboard](x: Self) {
    
    inline def setColumnLayout(value: SchemaColumnLayout): Self = StObject.set(x, "columnLayout", value.asInstanceOf[js.Any])
    
    inline def setColumnLayoutUndefined: Self = StObject.set(x, "columnLayout", js.undefined)
    
    inline def setDashboardFilters(value: js.Array[SchemaDashboardFilter]): Self = StObject.set(x, "dashboardFilters", value.asInstanceOf[js.Any])
    
    inline def setDashboardFiltersUndefined: Self = StObject.set(x, "dashboardFilters", js.undefined)
    
    inline def setDashboardFiltersVarargs(value: SchemaDashboardFilter*): Self = StObject.set(x, "dashboardFilters", js.Array(value*))
    
    inline def setDisplayName(value: String): Self = StObject.set(x, "displayName", value.asInstanceOf[js.Any])
    
    inline def setDisplayNameNull: Self = StObject.set(x, "displayName", null)
    
    inline def setDisplayNameUndefined: Self = StObject.set(x, "displayName", js.undefined)
    
    inline def setEtag(value: String): Self = StObject.set(x, "etag", value.asInstanceOf[js.Any])
    
    inline def setEtagNull: Self = StObject.set(x, "etag", null)
    
    inline def setEtagUndefined: Self = StObject.set(x, "etag", js.undefined)
    
    inline def setGridLayout(value: SchemaGridLayout): Self = StObject.set(x, "gridLayout", value.asInstanceOf[js.Any])
    
    inline def setGridLayoutUndefined: Self = StObject.set(x, "gridLayout", js.undefined)
    
    inline def setLabels(value: StringDictionary[String]): Self = StObject.set(x, "labels", value.asInstanceOf[js.Any])
    
    inline def setLabelsNull: Self = StObject.set(x, "labels", null)
    
    inline def setLabelsUndefined: Self = StObject.set(x, "labels", js.undefined)
    
    inline def setMosaicLayout(value: SchemaMosaicLayout): Self = StObject.set(x, "mosaicLayout", value.asInstanceOf[js.Any])
    
    inline def setMosaicLayoutUndefined: Self = StObject.set(x, "mosaicLayout", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameNull: Self = StObject.set(x, "name", null)
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setRowLayout(value: SchemaRowLayout): Self = StObject.set(x, "rowLayout", value.asInstanceOf[js.Any])
    
    inline def setRowLayoutUndefined: Self = StObject.set(x, "rowLayout", js.undefined)
  }
}
