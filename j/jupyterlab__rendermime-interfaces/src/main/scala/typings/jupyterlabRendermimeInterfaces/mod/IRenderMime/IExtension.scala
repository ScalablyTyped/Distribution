package typings.jupyterlabRendermimeInterfaces.mod.IRenderMime

import typings.jupyterlabRendermimeInterfaces.jupyterlabRendermimeInterfacesStrings.json
import typings.jupyterlabRendermimeInterfaces.jupyterlabRendermimeInterfacesStrings.string
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * An interface for using a RenderMime.IRenderer for output and read-only documents.
  */
@js.native
trait IExtension extends js.Object {
  /**
    * Preferred data type from the model.  Defaults to `string`.
    */
  val dataType: js.UndefOr[string | json] = js.native
  /**
    * The options used to open a document with the renderer factory.
    */
  val documentWidgetFactoryOptions: js.UndefOr[IDocumentWidgetFactoryOptions | js.Array[IDocumentWidgetFactoryOptions]] = js.native
  /**
    * The optional file type associated with the extension.
    */
  val fileTypes: js.UndefOr[js.Array[IFileType]] = js.native
  /**
    * The ID of the extension.
    *
    * #### Notes
    * The convention for extension IDs in JupyterLab is the full NPM package
    * name followed by a colon and a unique string token, e.g.
    * `'@jupyterlab/apputils-extension:settings'` or `'foo-extension:bar'`.
    */
  val id: String = js.native
  /**
    * The rank passed to `RenderMime.addFactory`.  If not given,
    * defaults to the `defaultRank` of the factory.
    */
  val rank: js.UndefOr[Double] = js.native
  /**
    * The timeout after user activity to re-render the data.
    */
  val renderTimeout: js.UndefOr[Double] = js.native
  /**
    * A renderer factory to be registered to render the MIME type.
    */
  val rendererFactory: IRendererFactory = js.native
}

object IExtension {
  @scala.inline
  def apply(id: String, rendererFactory: IRendererFactory): IExtension = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], rendererFactory = rendererFactory.asInstanceOf[js.Any])
    __obj.asInstanceOf[IExtension]
  }
  @scala.inline
  implicit class IExtensionOps[Self <: IExtension] (val x: Self) extends AnyVal {
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
    def setId(value: String): Self = this.set("id", value.asInstanceOf[js.Any])
    @scala.inline
    def setRendererFactory(value: IRendererFactory): Self = this.set("rendererFactory", value.asInstanceOf[js.Any])
    @scala.inline
    def setDataType(value: string | json): Self = this.set("dataType", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDataType: Self = this.set("dataType", js.undefined)
    @scala.inline
    def setDocumentWidgetFactoryOptionsVarargs(value: IDocumentWidgetFactoryOptions*): Self = this.set("documentWidgetFactoryOptions", js.Array(value :_*))
    @scala.inline
    def setDocumentWidgetFactoryOptions(value: IDocumentWidgetFactoryOptions | js.Array[IDocumentWidgetFactoryOptions]): Self = this.set("documentWidgetFactoryOptions", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDocumentWidgetFactoryOptions: Self = this.set("documentWidgetFactoryOptions", js.undefined)
    @scala.inline
    def setFileTypesVarargs(value: IFileType*): Self = this.set("fileTypes", js.Array(value :_*))
    @scala.inline
    def setFileTypes(value: js.Array[IFileType]): Self = this.set("fileTypes", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFileTypes: Self = this.set("fileTypes", js.undefined)
    @scala.inline
    def setRank(value: Double): Self = this.set("rank", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRank: Self = this.set("rank", js.undefined)
    @scala.inline
    def setRenderTimeout(value: Double): Self = this.set("renderTimeout", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRenderTimeout: Self = this.set("renderTimeout", js.undefined)
  }
  
}

