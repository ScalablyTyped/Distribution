package typings.jupyterlabRendermimeInterfaces.mod.IRenderMime

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * The interface for a renderer factory.
  */
trait IRendererFactory extends StObject {
  
  /**
    * Create a renderer which displays the mime data.
    *
    * @param options - The options used to render the data.
    */
  def createRenderer(options: IRendererOptions): IRenderer
  
  /**
    * The default rank of the factory.  If not given, defaults to 100.
    */
  val defaultRank: js.UndefOr[Double] = js.undefined
  
  /**
    * The mime types handled by this factory.
    */
  val mimeTypes: js.Array[String]
  
  /**
    * Whether the factory is a "safe" factory.
    *
    * #### Notes
    * A "safe" factory produces renderer widgets which can render
    * untrusted model data in a usable way. *All* renderers must
    * handle untrusted data safely, but some may simply failover
    * with a "Run cell to view output" message. A "safe" renderer
    * is an indication that its sanitized output will be useful.
    */
  val safe: Boolean
}
object IRendererFactory {
  
  inline def apply(createRenderer: IRendererOptions => IRenderer, mimeTypes: js.Array[String], safe: Boolean): IRendererFactory = {
    val __obj = js.Dynamic.literal(createRenderer = js.Any.fromFunction1(createRenderer), mimeTypes = mimeTypes.asInstanceOf[js.Any], safe = safe.asInstanceOf[js.Any])
    __obj.asInstanceOf[IRendererFactory]
  }
  
  extension [Self <: IRendererFactory](x: Self) {
    
    inline def setCreateRenderer(value: IRendererOptions => IRenderer): Self = StObject.set(x, "createRenderer", js.Any.fromFunction1(value))
    
    inline def setDefaultRank(value: Double): Self = StObject.set(x, "defaultRank", value.asInstanceOf[js.Any])
    
    inline def setDefaultRankUndefined: Self = StObject.set(x, "defaultRank", js.undefined)
    
    inline def setMimeTypes(value: js.Array[String]): Self = StObject.set(x, "mimeTypes", value.asInstanceOf[js.Any])
    
    inline def setMimeTypesVarargs(value: String*): Self = StObject.set(x, "mimeTypes", js.Array(value :_*))
    
    inline def setSafe(value: Boolean): Self = StObject.set(x, "safe", value.asInstanceOf[js.Any])
  }
}
