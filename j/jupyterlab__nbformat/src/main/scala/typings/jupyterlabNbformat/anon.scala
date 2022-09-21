package typings.jupyterlabNbformat

import typings.jupyterlabNbformat.jupyterlabNbformatStrings.auto
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  /* Inlined std.Partial<@jupyterlab/nbformat.@jupyterlab/nbformat.IBaseCellJupyterMetadata> */
  trait PartialIBaseCellJupyterMe extends StObject {
    
    var source_hidden: js.UndefOr[Boolean] = js.undefined
  }
  object PartialIBaseCellJupyterMe {
    
    inline def apply(): PartialIBaseCellJupyterMe = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PartialIBaseCellJupyterMe]
    }
    
    extension [Self <: PartialIBaseCellJupyterMe](x: Self) {
      
      inline def setSource_hidden(value: Boolean): Self = StObject.set(x, "source_hidden", value.asInstanceOf[js.Any])
      
      inline def setSource_hiddenUndefined: Self = StObject.set(x, "source_hidden", js.undefined)
    }
  }
  
  /* Inlined std.Partial<@jupyterlab/nbformat.@jupyterlab/nbformat.ICodeCellJupyterMetadata> */
  trait PartialICodeCellJupyterMe extends StObject {
    
    var outputs_hidden: js.UndefOr[Boolean] = js.undefined
    
    var source_hidden: js.UndefOr[Boolean] = js.undefined
  }
  object PartialICodeCellJupyterMe {
    
    inline def apply(): PartialICodeCellJupyterMe = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PartialICodeCellJupyterMe]
    }
    
    extension [Self <: PartialICodeCellJupyterMe](x: Self) {
      
      inline def setOutputs_hidden(value: Boolean): Self = StObject.set(x, "outputs_hidden", value.asInstanceOf[js.Any])
      
      inline def setOutputs_hiddenUndefined: Self = StObject.set(x, "outputs_hidden", js.undefined)
      
      inline def setSource_hidden(value: Boolean): Self = StObject.set(x, "source_hidden", value.asInstanceOf[js.Any])
      
      inline def setSource_hiddenUndefined: Self = StObject.set(x, "source_hidden", js.undefined)
    }
  }
  
  /* Inlined std.Partial<@jupyterlab/nbformat.@jupyterlab/nbformat.ICodeCellMetadata> */
  trait PartialICodeCellMetadata extends StObject {
    
    var collapsed: js.UndefOr[Boolean] = js.undefined
    
    var jupyter: js.UndefOr[PartialICodeCellJupyterMe] = js.undefined
    
    var name: js.UndefOr[String] = js.undefined
    
    var scrolled: js.UndefOr[Boolean | auto] = js.undefined
    
    var tags: js.UndefOr[js.Array[String]] = js.undefined
    
    var trusted: js.UndefOr[Boolean] = js.undefined
  }
  object PartialICodeCellMetadata {
    
    inline def apply(): PartialICodeCellMetadata = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PartialICodeCellMetadata]
    }
    
    extension [Self <: PartialICodeCellMetadata](x: Self) {
      
      inline def setCollapsed(value: Boolean): Self = StObject.set(x, "collapsed", value.asInstanceOf[js.Any])
      
      inline def setCollapsedUndefined: Self = StObject.set(x, "collapsed", js.undefined)
      
      inline def setJupyter(value: PartialICodeCellJupyterMe): Self = StObject.set(x, "jupyter", value.asInstanceOf[js.Any])
      
      inline def setJupyterUndefined: Self = StObject.set(x, "jupyter", js.undefined)
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
      
      inline def setScrolled(value: Boolean | auto): Self = StObject.set(x, "scrolled", value.asInstanceOf[js.Any])
      
      inline def setScrolledUndefined: Self = StObject.set(x, "scrolled", js.undefined)
      
      inline def setTags(value: js.Array[String]): Self = StObject.set(x, "tags", value.asInstanceOf[js.Any])
      
      inline def setTagsUndefined: Self = StObject.set(x, "tags", js.undefined)
      
      inline def setTagsVarargs(value: String*): Self = StObject.set(x, "tags", js.Array(value*))
      
      inline def setTrusted(value: Boolean): Self = StObject.set(x, "trusted", value.asInstanceOf[js.Any])
      
      inline def setTrustedUndefined: Self = StObject.set(x, "trusted", js.undefined)
    }
  }
  
  /* Inlined std.Partial<@jupyterlab/nbformat.@jupyterlab/nbformat.IRawCellMetadata> */
  trait PartialIRawCellMetadata extends StObject {
    
    var format: js.UndefOr[String] = js.undefined
    
    var jupyter: js.UndefOr[PartialIBaseCellJupyterMe] = js.undefined
    
    var name: js.UndefOr[String] = js.undefined
    
    var tags: js.UndefOr[js.Array[String]] = js.undefined
    
    var trusted: js.UndefOr[Boolean] = js.undefined
  }
  object PartialIRawCellMetadata {
    
    inline def apply(): PartialIRawCellMetadata = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PartialIRawCellMetadata]
    }
    
    extension [Self <: PartialIRawCellMetadata](x: Self) {
      
      inline def setFormat(value: String): Self = StObject.set(x, "format", value.asInstanceOf[js.Any])
      
      inline def setFormatUndefined: Self = StObject.set(x, "format", js.undefined)
      
      inline def setJupyter(value: PartialIBaseCellJupyterMe): Self = StObject.set(x, "jupyter", value.asInstanceOf[js.Any])
      
      inline def setJupyterUndefined: Self = StObject.set(x, "jupyter", js.undefined)
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
      
      inline def setTags(value: js.Array[String]): Self = StObject.set(x, "tags", value.asInstanceOf[js.Any])
      
      inline def setTagsUndefined: Self = StObject.set(x, "tags", js.undefined)
      
      inline def setTagsVarargs(value: String*): Self = StObject.set(x, "tags", js.Array(value*))
      
      inline def setTrusted(value: Boolean): Self = StObject.set(x, "trusted", value.asInstanceOf[js.Any])
      
      inline def setTrustedUndefined: Self = StObject.set(x, "trusted", js.undefined)
    }
  }
}
