package typings.jupyterlabRendermimeInterfaces.mod.IRenderMime

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * The options used to create a renderer.
  */
trait IRendererOptions extends StObject {
  
  /**
    * The LaTeX typesetter.
    */
  var latexTypesetter: ILatexTypesetter | Null
  
  /**
    * An optional link handler.
    */
  var linkHandler: ILinkHandler | Null
  
  /**
    * The preferred mimeType to render.
    */
  var mimeType: String
  
  /**
    * An optional url resolver.
    */
  var resolver: IResolver | Null
  
  /**
    * The html sanitizer.
    */
  var sanitizer: ISanitizer
}
object IRendererOptions {
  
  inline def apply(mimeType: String, sanitizer: ISanitizer): IRendererOptions = {
    val __obj = js.Dynamic.literal(mimeType = mimeType.asInstanceOf[js.Any], sanitizer = sanitizer.asInstanceOf[js.Any], latexTypesetter = null, linkHandler = null, resolver = null)
    __obj.asInstanceOf[IRendererOptions]
  }
  
  extension [Self <: IRendererOptions](x: Self) {
    
    inline def setLatexTypesetter(value: ILatexTypesetter): Self = StObject.set(x, "latexTypesetter", value.asInstanceOf[js.Any])
    
    inline def setLatexTypesetterNull: Self = StObject.set(x, "latexTypesetter", null)
    
    inline def setLinkHandler(value: ILinkHandler): Self = StObject.set(x, "linkHandler", value.asInstanceOf[js.Any])
    
    inline def setLinkHandlerNull: Self = StObject.set(x, "linkHandler", null)
    
    inline def setMimeType(value: String): Self = StObject.set(x, "mimeType", value.asInstanceOf[js.Any])
    
    inline def setResolver(value: IResolver): Self = StObject.set(x, "resolver", value.asInstanceOf[js.Any])
    
    inline def setResolverNull: Self = StObject.set(x, "resolver", null)
    
    inline def setSanitizer(value: ISanitizer): Self = StObject.set(x, "sanitizer", value.asInstanceOf[js.Any])
  }
}
