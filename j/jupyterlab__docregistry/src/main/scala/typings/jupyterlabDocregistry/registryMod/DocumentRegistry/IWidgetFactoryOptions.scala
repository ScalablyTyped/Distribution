package typings.jupyterlabDocregistry.registryMod.DocumentRegistry

import typings.luminoWidgets.mod.Widget
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * The options used to initialize a widget factory.
  */
@js.native
trait IWidgetFactoryOptions[T /* <: Widget */] extends js.Object {
  
  /**
    * Whether the widgets can start a kernel when opened.
    */
  val canStartKernel: js.UndefOr[Boolean] = js.native
  
  /**
    * The file types for which the factory should be the default.
    */
  val defaultFor: js.UndefOr[js.Array[String]] = js.native
  
  /**
    * The file types for which the factory should be the default for rendering,
    * if that is different than the default factory (which may be for editing).
    * If undefined, then it will fall back on the default file type.
    */
  val defaultRendered: js.UndefOr[js.Array[String]] = js.native
  
  /**
    * The file types the widget can view.
    */
  val fileTypes: js.Array[String] = js.native
  
  /**
    * The registered name of the model type used to create the widgets.
    */
  val modelName: js.UndefOr[String] = js.native
  
  /**
    * The name of the widget to display in dialogs.
    */
  val name: String = js.native
  
  /**
    * Whether the widgets prefer having a kernel started.
    */
  val preferKernel: js.UndefOr[Boolean] = js.native
  
  /**
    * Whether the widget factory is read only.
    */
  val readOnly: js.UndefOr[Boolean] = js.native
  
  /**
    * Whether the kernel should be shutdown when the widget is closed.
    */
  val shutdownOnClose: js.UndefOr[Boolean] = js.native
  
  /**
    * A function producing toolbar widgets, overriding the default toolbar widgets.
    */
  val toolbarFactory: js.UndefOr[js.Function1[/* widget */ T, js.Array[IToolbarItem]]] = js.native
}
object IWidgetFactoryOptions {
  
  @scala.inline
  def apply[T /* <: Widget */](fileTypes: js.Array[String], name: String): IWidgetFactoryOptions[T] = {
    val __obj = js.Dynamic.literal(fileTypes = fileTypes.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[IWidgetFactoryOptions[T]]
  }
  
  @scala.inline
  implicit class IWidgetFactoryOptionsOps[Self <: IWidgetFactoryOptions[_], T /* <: Widget */] (val x: Self with IWidgetFactoryOptions[T]) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setFileTypesVarargs(value: String*): Self = this.set("fileTypes", js.Array(value :_*))
    
    @scala.inline
    def setFileTypes(value: js.Array[String]): Self = this.set("fileTypes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCanStartKernel(value: Boolean): Self = this.set("canStartKernel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCanStartKernel: Self = this.set("canStartKernel", js.undefined)
    
    @scala.inline
    def setDefaultForVarargs(value: String*): Self = this.set("defaultFor", js.Array(value :_*))
    
    @scala.inline
    def setDefaultFor(value: js.Array[String]): Self = this.set("defaultFor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDefaultFor: Self = this.set("defaultFor", js.undefined)
    
    @scala.inline
    def setDefaultRenderedVarargs(value: String*): Self = this.set("defaultRendered", js.Array(value :_*))
    
    @scala.inline
    def setDefaultRendered(value: js.Array[String]): Self = this.set("defaultRendered", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDefaultRendered: Self = this.set("defaultRendered", js.undefined)
    
    @scala.inline
    def setModelName(value: String): Self = this.set("modelName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteModelName: Self = this.set("modelName", js.undefined)
    
    @scala.inline
    def setPreferKernel(value: Boolean): Self = this.set("preferKernel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePreferKernel: Self = this.set("preferKernel", js.undefined)
    
    @scala.inline
    def setReadOnly(value: Boolean): Self = this.set("readOnly", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteReadOnly: Self = this.set("readOnly", js.undefined)
    
    @scala.inline
    def setShutdownOnClose(value: Boolean): Self = this.set("shutdownOnClose", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteShutdownOnClose: Self = this.set("shutdownOnClose", js.undefined)
    
    @scala.inline
    def setToolbarFactory(value: /* widget */ T => js.Array[IToolbarItem]): Self = this.set("toolbarFactory", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteToolbarFactory: Self = this.set("toolbarFactory", js.undefined)
  }
}
