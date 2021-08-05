package typings.kendoUi.global.kendo.data

import typings.kendoUi.kendo.data.DataSourceBinder
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object binders {
  
  @JSGlobal("kendo.data.binders")
  @js.native
  val ^ : js.Any = js.native
  
  @JSGlobal("kendo.data.binders.attr")
  @js.native
  class attr ()
    extends StObject
       with typings.kendoUi.kendo.data.Binder
  
  @JSGlobal("kendo.data.binders.css")
  @js.native
  class css ()
    extends StObject
       with typings.kendoUi.kendo.data.Binder
  
  inline def dataSourceBinding(bindingName: String, fieldName: String, setter: String): DataSourceBinder = (^.asInstanceOf[js.Dynamic].applyDynamic("dataSourceBinding")(bindingName.asInstanceOf[js.Any], fieldName.asInstanceOf[js.Any], setter.asInstanceOf[js.Any])).asInstanceOf[DataSourceBinder]
  
  @JSGlobal("kendo.data.binders.disabled")
  @js.native
  class disabled ()
    extends StObject
       with typings.kendoUi.kendo.data.Binder
  
  @JSGlobal("kendo.data.binders.enabled")
  @js.native
  class enabled ()
    extends StObject
       with typings.kendoUi.kendo.data.Binder
  
  @JSGlobal("kendo.data.binders.events")
  @js.native
  class events ()
    extends StObject
       with typings.kendoUi.kendo.data.Binder
  
  @JSGlobal("kendo.data.binders.html")
  @js.native
  class html ()
    extends StObject
       with typings.kendoUi.kendo.data.Binder
  
  object input {
    
    @JSGlobal("kendo.data.binders.input.checked")
    @js.native
    class checked ()
      extends StObject
         with typings.kendoUi.kendo.data.binders.input.checked
  }
  
  @JSGlobal("kendo.data.binders.invisible")
  @js.native
  class invisible ()
    extends StObject
       with typings.kendoUi.kendo.data.Binder
  
  @JSGlobal("kendo.data.binders.readonly")
  @js.native
  class readonly ()
    extends StObject
       with typings.kendoUi.kendo.data.Binder
  
  object select {
    
    @JSGlobal("kendo.data.binders.select.source")
    @js.native
    class source ()
      extends StObject
         with typings.kendoUi.kendo.data.binders.source
    
    @JSGlobal("kendo.data.binders.select.value")
    @js.native
    class value ()
      extends StObject
         with typings.kendoUi.kendo.data.binders.select.value
  }
  
  @JSGlobal("kendo.data.binders.source")
  @js.native
  class source ()
    extends StObject
       with typings.kendoUi.kendo.data.binders.source
  
  @JSGlobal("kendo.data.binders.style")
  @js.native
  class style ()
    extends StObject
       with typings.kendoUi.kendo.data.Binder
  
  @JSGlobal("kendo.data.binders.text")
  @js.native
  class text ()
    extends StObject
       with typings.kendoUi.kendo.data.Binder
  
  @JSGlobal("kendo.data.binders.value")
  @js.native
  class value ()
    extends StObject
       with typings.kendoUi.kendo.data.binders.value
  
  @JSGlobal("kendo.data.binders.visible")
  @js.native
  class visible ()
    extends StObject
       with typings.kendoUi.kendo.data.Binder
  
  object widget {
    
    @JSGlobal("kendo.data.binders.widget")
    @js.native
    val ^ : js.Any = js.native
    
    @JSGlobal("kendo.data.binders.widget.checked")
    @js.native
    class checked ()
      extends StObject
         with typings.kendoUi.kendo.data.binders.widget.checked
    
    @JSGlobal("kendo.data.binders.widget.disabled")
    @js.native
    class disabled ()
      extends StObject
         with typings.kendoUi.kendo.data.Binder
    
    object dropdowntree {
      
      @JSGlobal("kendo.data.binders.widget.dropdowntree.value")
      @js.native
      class value ()
        extends StObject
           with typings.kendoUi.kendo.data.binders.widget.dropdowntree.value
    }
    
    @JSGlobal("kendo.data.binders.widget.enabled")
    @js.native
    class enabled ()
      extends StObject
         with typings.kendoUi.kendo.data.Binder
    
    @JSGlobal("kendo.data.binders.widget.end")
    @js.native
    class end ()
      extends StObject
         with typings.kendoUi.kendo.data.binders.widget.end
    
    @JSGlobal("kendo.data.binders.widget.events")
    @js.native
    class events ()
      extends StObject
         with typings.kendoUi.kendo.data.Binder
    
    object gantt {
      
      @JSGlobal("kendo.data.binders.widget.gantt")
      @js.native
      val ^ : js.Any = js.native
      
      inline def dependencies(bindingName: String, fieldName: String, setter: String): DataSourceBinder = (^.asInstanceOf[js.Dynamic].applyDynamic("dependencies")(bindingName.asInstanceOf[js.Any], fieldName.asInstanceOf[js.Any], setter.asInstanceOf[js.Any])).asInstanceOf[DataSourceBinder]
    }
    
    object grid {
      
      @JSGlobal("kendo.data.binders.widget.grid")
      @js.native
      val ^ : js.Any = js.native
      
      inline def source(bindingName: String, fieldName: String, setter: String): DataSourceBinder = (^.asInstanceOf[js.Dynamic].applyDynamic("source")(bindingName.asInstanceOf[js.Any], fieldName.asInstanceOf[js.Any], setter.asInstanceOf[js.Any])).asInstanceOf[DataSourceBinder]
    }
    
    @JSGlobal("kendo.data.binders.widget.invisible")
    @js.native
    class invisible ()
      extends StObject
         with typings.kendoUi.kendo.data.Binder
    
    object multiselect {
      
      @JSGlobal("kendo.data.binders.widget.multiselect.value")
      @js.native
      class value ()
        extends StObject
           with typings.kendoUi.kendo.data.binders.widget.multiselect.value
    }
    
    object scheduler {
      
      @JSGlobal("kendo.data.binders.widget.scheduler")
      @js.native
      val ^ : js.Any = js.native
      
      inline def source(bindingName: String, fieldName: String, setter: String): DataSourceBinder = (^.asInstanceOf[js.Dynamic].applyDynamic("source")(bindingName.asInstanceOf[js.Any], fieldName.asInstanceOf[js.Any], setter.asInstanceOf[js.Any])).asInstanceOf[DataSourceBinder]
    }
    
    inline def source(bindingName: String, fieldName: String, setter: String): DataSourceBinder = (^.asInstanceOf[js.Dynamic].applyDynamic("source")(bindingName.asInstanceOf[js.Any], fieldName.asInstanceOf[js.Any], setter.asInstanceOf[js.Any])).asInstanceOf[DataSourceBinder]
    
    @JSGlobal("kendo.data.binders.widget.start")
    @js.native
    class start ()
      extends StObject
         with typings.kendoUi.kendo.data.binders.widget.start
    
    @JSGlobal("kendo.data.binders.widget.value")
    @js.native
    class value ()
      extends StObject
         with typings.kendoUi.kendo.data.binders.widget.value
    
    @JSGlobal("kendo.data.binders.widget.visible")
    @js.native
    class visible ()
      extends StObject
         with typings.kendoUi.kendo.data.Binder
  }
}
