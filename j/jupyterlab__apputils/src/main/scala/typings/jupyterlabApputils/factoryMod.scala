package typings.jupyterlabApputils

import typings.jupyterlabApputils.tokensMod.IToolbarWidgetRegistry
import typings.jupyterlabApputils.tokensMod.ToolbarRegistry.IToolbarItem
import typings.jupyterlabApputils.widgetMod.Toolbar.IWidgetToolbar
import typings.jupyterlabObservables.observablelistMod.IObservableList
import typings.jupyterlabSettingregistry.tokensMod.ISettingRegistry
import typings.jupyterlabTranslation.tokensMod.ITranslator
import typings.luminoWidgets.mod.Widget
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object factoryMod {
  
  @JSImport("@jupyterlab/apputils/lib/toolbar/factory", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def createToolbarFactory(
    toolbarRegistry: IToolbarWidgetRegistry,
    settingsRegistry: ISettingRegistry,
    factoryName: String,
    pluginId: String,
    translator: ITranslator
  ): js.Function1[/* widget */ Widget, IObservableList[IToolbarItem]] = (^.asInstanceOf[js.Dynamic].applyDynamic("createToolbarFactory")(toolbarRegistry.asInstanceOf[js.Any], settingsRegistry.asInstanceOf[js.Any], factoryName.asInstanceOf[js.Any], pluginId.asInstanceOf[js.Any], translator.asInstanceOf[js.Any])).asInstanceOf[js.Function1[/* widget */ Widget, IObservableList[IToolbarItem]]]
  inline def createToolbarFactory(
    toolbarRegistry: IToolbarWidgetRegistry,
    settingsRegistry: ISettingRegistry,
    factoryName: String,
    pluginId: String,
    translator: ITranslator,
    propertyId: String
  ): js.Function1[/* widget */ Widget, IObservableList[IToolbarItem]] = (^.asInstanceOf[js.Dynamic].applyDynamic("createToolbarFactory")(toolbarRegistry.asInstanceOf[js.Any], settingsRegistry.asInstanceOf[js.Any], factoryName.asInstanceOf[js.Any], pluginId.asInstanceOf[js.Any], translator.asInstanceOf[js.Any], propertyId.asInstanceOf[js.Any])).asInstanceOf[js.Function1[/* widget */ Widget, IObservableList[IToolbarItem]]]
  
  inline def setToolbar(
    widget: IWidgetToolbar,
    factory: js.Function1[/* widget */ Widget, IObservableList[IToolbarItem] | js.Array[IToolbarItem]]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("setToolbar")(widget.asInstanceOf[js.Any], factory.asInstanceOf[js.Any])).asInstanceOf[Unit]
}
