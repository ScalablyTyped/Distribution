package typings.inkTable

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("ink-table", JSImport.Default)
  @js.native
  val default: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify StatelessComponent<TableProps> */ js.Any = js.native
  
  @JSImport("ink-table", "Cell")
  @js.native
  val Cell: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify StatelessComponent<{  children :InkNode}> */ js.Any = js.native
  
  @JSImport("ink-table", "Header")
  @js.native
  val Header: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify StatelessComponent<{  children :InkNode}> */ js.Any = js.native
  
  @JSImport("ink-table", "Skeleton")
  @js.native
  val Skeleton: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify StatelessComponent<{  children :InkNode}> */ js.Any = js.native
  
  trait TableProps extends StObject {
    
    var cell: js.UndefOr[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify InkComponent */ js.Any
      ] = js.undefined
    
    var data: js.UndefOr[js.Array[js.Object]] = js.undefined
    
    var header: js.UndefOr[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify InkComponent */ js.Any
      ] = js.undefined
    
    var padding: js.UndefOr[Double] = js.undefined
    
    var skeleton: js.UndefOr[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify InkComponent */ js.Any
      ] = js.undefined
  }
  object TableProps {
    
    inline def apply(): TableProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[TableProps]
    }
    
    extension [Self <: TableProps](x: Self) {
      
      inline def setCell(
        value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify InkComponent */ js.Any
      ): Self = StObject.set(x, "cell", value.asInstanceOf[js.Any])
      
      inline def setCellUndefined: Self = StObject.set(x, "cell", js.undefined)
      
      inline def setData(value: js.Array[js.Object]): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
      
      inline def setDataUndefined: Self = StObject.set(x, "data", js.undefined)
      
      inline def setDataVarargs(value: js.Object*): Self = StObject.set(x, "data", js.Array(value :_*))
      
      inline def setHeader(
        value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify InkComponent */ js.Any
      ): Self = StObject.set(x, "header", value.asInstanceOf[js.Any])
      
      inline def setHeaderUndefined: Self = StObject.set(x, "header", js.undefined)
      
      inline def setPadding(value: Double): Self = StObject.set(x, "padding", value.asInstanceOf[js.Any])
      
      inline def setPaddingUndefined: Self = StObject.set(x, "padding", js.undefined)
      
      inline def setSkeleton(
        value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify InkComponent */ js.Any
      ): Self = StObject.set(x, "skeleton", value.asInstanceOf[js.Any])
      
      inline def setSkeletonUndefined: Self = StObject.set(x, "skeleton", js.undefined)
    }
  }
}
