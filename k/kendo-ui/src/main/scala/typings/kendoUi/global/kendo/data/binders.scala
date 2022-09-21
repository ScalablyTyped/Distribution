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
  open class attr ()
    extends StObject
       with typings.kendoUi.kendo.data.Binder
  
  @JSGlobal("kendo.data.binders.css")
  @js.native
  open class css ()
    extends StObject
       with typings.kendoUi.kendo.data.Binder
  
  inline def dataSourceBinding(bindingName: String, fieldName: String, setter: String): DataSourceBinder = (^.asInstanceOf[js.Dynamic].applyDynamic("dataSourceBinding")(bindingName.asInstanceOf[js.Any], fieldName.asInstanceOf[js.Any], setter.asInstanceOf[js.Any])).asInstanceOf[DataSourceBinder]
  
  @JSGlobal("kendo.data.binders.disabled")
  @js.native
  open class disabled ()
    extends StObject
       with typings.kendoUi.kendo.data.Binder
  
  @JSGlobal("kendo.data.binders.enabled")
  @js.native
  open class enabled ()
    extends StObject
       with typings.kendoUi.kendo.data.Binder
  
  @JSGlobal("kendo.data.binders.events")
  @js.native
  open class events ()
    extends StObject
       with typings.kendoUi.kendo.data.Binder
  
  @JSGlobal("kendo.data.binders.html")
  @js.native
  open class html ()
    extends StObject
       with typings.kendoUi.kendo.data.Binder
  
  object input {
    
    @JSGlobal("kendo.data.binders.input.checked")
    @js.native
    open class checked ()
      extends StObject
         with typings.kendoUi.kendo.data.binders.input.checked
  }
  
  @JSGlobal("kendo.data.binders.invisible")
  @js.native
  open class invisible ()
    extends StObject
       with typings.kendoUi.kendo.data.Binder
  
  @JSGlobal("kendo.data.binders.readonly")
  @js.native
  open class readonly ()
    extends StObject
       with typings.kendoUi.kendo.data.Binder
  
  object select {
    
    @JSGlobal("kendo.data.binders.select.source")
    @js.native
    open class source ()
      extends StObject
         with typings.kendoUi.kendo.data.binders.source
    
    @JSGlobal("kendo.data.binders.select.value")
    @js.native
    open class value ()
      extends StObject
         with typings.kendoUi.kendo.data.binders.select.value
  }
  
  @JSGlobal("kendo.data.binders.source")
  @js.native
  open class source ()
    extends StObject
       with typings.kendoUi.kendo.data.binders.source
  
  @JSGlobal("kendo.data.binders.style")
  @js.native
  open class style ()
    extends StObject
       with typings.kendoUi.kendo.data.Binder
  
  @JSGlobal("kendo.data.binders.text")
  @js.native
  open class text ()
    extends StObject
       with typings.kendoUi.kendo.data.Binder
  
  @JSGlobal("kendo.data.binders.value")
  @js.native
  open class value ()
    extends StObject
       with typings.kendoUi.kendo.data.binders.value
  
  @JSGlobal("kendo.data.binders.visible")
  @js.native
  open class visible ()
    extends StObject
       with typings.kendoUi.kendo.data.Binder
  
  object widget {
    
    @JSGlobal("kendo.data.binders.widget")
    @js.native
    val ^ : js.Any = js.native
    
    @JSGlobal("kendo.data.binders.widget.checked")
    @js.native
    open class checked ()
      extends StObject
         with typings.kendoUi.kendo.data.binders.widget.checked
    
    @JSGlobal("kendo.data.binders.widget.disabled")
    @js.native
    open class disabled ()
      extends StObject
         with typings.kendoUi.kendo.data.Binder
    
    object dropdowntree {
      
      @JSGlobal("kendo.data.binders.widget.dropdowntree.value")
      @js.native
      open class value ()
        extends StObject
           with typings.kendoUi.kendo.data.binders.widget.dropdowntree.value
    }
    
    @JSGlobal("kendo.data.binders.widget.enabled")
    @js.native
    open class enabled ()
      extends StObject
         with typings.kendoUi.kendo.data.Binder
    
    @JSGlobal("kendo.data.binders.widget.end")
    @js.native
    open class end ()
      extends StObject
         with typings.kendoUi.kendo.data.binders.widget.end
    
    @JSGlobal("kendo.data.binders.widget.events")
    @js.native
    open class events ()
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
    open class invisible ()
      extends StObject
         with typings.kendoUi.kendo.data.Binder
    
    object multiselect {
      
      @JSGlobal("kendo.data.binders.widget.multiselect.value")
      @js.native
      open class value ()
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
    open class start ()
      extends StObject
         with typings.kendoUi.kendo.data.binders.widget.start
    
    @JSGlobal("kendo.data.binders.widget.value")
    @js.native
    open class value ()
      extends StObject
         with typings.kendoUi.kendo.data.binders.widget.value
    
    @JSGlobal("kendo.data.binders.widget.visible")
    @js.native
    open class visible ()
      extends StObject
         with typings.kendoUi.kendo.data.Binder
  }
}
