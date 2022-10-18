package typings.jupyterlabApputils

import typings.jupyterlabApputils.libTokensMod.IToolbarWidgetRegistry
import typings.jupyterlabApputils.libTokensMod.ToolbarRegistry.IToolbarItem
import typings.jupyterlabApputils.libToolbarWidgetMod.Toolbar.IWidgetToolbar
import typings.jupyterlabObservables.libObservablelistMod.IObservableList
import typings.jupyterlabSettingregistry.libTokensMod.ISettingRegistry
import typings.jupyterlabTranslation.libTokensMod.ITranslator
import typings.luminoWidgets.mod.Widget
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libToolbarFactoryMod {
  
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
