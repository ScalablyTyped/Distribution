package typings.jupyterlabRendermimeInterfaces.mod.IRenderMime

import typings.jupyterlabRendermimeInterfaces.jupyterlabRendermimeInterfacesStrings.json
import typings.jupyterlabRendermimeInterfaces.jupyterlabRendermimeInterfacesStrings.string
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * An interface for using a RenderMime.IRenderer for output and read-only documents.
  */
trait IExtension extends StObject {
  
  /**
    * Preferred data type from the model.  Defaults to `string`.
    */
  val dataType: js.UndefOr[string | json] = js.undefined
  
  /**
    * The options used to open a document with the renderer factory.
    */
  val documentWidgetFactoryOptions: js.UndefOr[IDocumentWidgetFactoryOptions | js.Array[IDocumentWidgetFactoryOptions]] = js.undefined
  
  /**
    * The optional file type associated with the extension.
    */
  val fileTypes: js.UndefOr[js.Array[IFileType]] = js.undefined
  
  /**
    * The ID of the extension.
    *
    * #### Notes
    * The convention for extension IDs in JupyterLab is the full NPM package
    * name followed by a colon and a unique string token, e.g.
    * `'@jupyterlab/apputils-extension:settings'` or `'foo-extension:bar'`.
    */
  val id: String
  
  /**
    * The rank passed to `RenderMime.addFactory`.  If not given,
    * defaults to the `defaultRank` of the factory.
    */
  val rank: js.UndefOr[Double] = js.undefined
  
  /**
    * The timeout after user activity to re-render the data.
    */
  val renderTimeout: js.UndefOr[Double] = js.undefined
  
  /**
    * A renderer factory to be registered to render the MIME type.
    */
  val rendererFactory: IRendererFactory
}
object IExtension {
  
  inline def apply(id: String, rendererFactory: IRendererFactory): IExtension = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], rendererFactory = rendererFactory.asInstanceOf[js.Any])
    __obj.asInstanceOf[IExtension]
  }
  
  extension [Self <: IExtension](x: Self) {
    
    inline def setDataType(value: string | json): Self = StObject.set(x, "dataType", value.asInstanceOf[js.Any])
    
    inline def setDataTypeUndefined: Self = StObject.set(x, "dataType", js.undefined)
    
    inline def setDocumentWidgetFactoryOptions(value: IDocumentWidgetFactoryOptions | js.Array[IDocumentWidgetFactoryOptions]): Self = StObject.set(x, "documentWidgetFactoryOptions", value.asInstanceOf[js.Any])
    
    inline def setDocumentWidgetFactoryOptionsUndefined: Self = StObject.set(x, "documentWidgetFactoryOptions", js.undefined)
    
    inline def setDocumentWidgetFactoryOptionsVarargs(value: IDocumentWidgetFactoryOptions*): Self = StObject.set(x, "documentWidgetFactoryOptions", js.Array(value :_*))
    
    inline def setFileTypes(value: js.Array[IFileType]): Self = StObject.set(x, "fileTypes", value.asInstanceOf[js.Any])
    
    inline def setFileTypesUndefined: Self = StObject.set(x, "fileTypes", js.undefined)
    
    inline def setFileTypesVarargs(value: IFileType*): Self = StObject.set(x, "fileTypes", js.Array(value :_*))
    
    inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setRank(value: Double): Self = StObject.set(x, "rank", value.asInstanceOf[js.Any])
    
    inline def setRankUndefined: Self = StObject.set(x, "rank", js.undefined)
    
    inline def setRenderTimeout(value: Double): Self = StObject.set(x, "renderTimeout", value.asInstanceOf[js.Any])
    
    inline def setRenderTimeoutUndefined: Self = StObject.set(x, "renderTimeout", js.undefined)
    
    inline def setRendererFactory(value: IRendererFactory): Self = StObject.set(x, "rendererFactory", value.asInstanceOf[js.Any])
  }
}
