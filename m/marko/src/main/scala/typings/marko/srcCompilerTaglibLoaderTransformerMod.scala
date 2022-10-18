package typings.marko

import typings.marko.srcCompilerTaglibLoaderTagMod.^
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object srcCompilerTaglibLoaderTransformerMod {
  
  @JSImport("marko/src/compiler/taglib-loader/Transformer", JSImport.Default)
  @js.native
  open class default ()
    extends StObject
       with Transformer {
    
    /* CompleteClass */
    override def getFunc(): Any = js.native
    
    /* CompleteClass */
    var id: Double = js.native
    
    /* CompleteClass */
    var name: String | Null = js.native
    
    /* CompleteClass */
    var path: String | Null = js.native
    
    /* CompleteClass */
    var priority: Any = js.native
    
    /* CompleteClass */
    var properties: Any = js.native
    
    /* CompleteClass */
    var tag: ^ | Null = js.native
    
    /* CompleteClass */
    var taglibId: String = js.native
  }
  
  trait Transformer extends StObject {
    
    def getFunc(): Any
    
    var id: Double
    
    var name: String | Null
    
    var path: String | Null
    
    var priority: Any
    
    var properties: Any
    
    var tag: ^ | Null
    
    var taglibId: String
  }
  object Transformer {
    
    inline def apply(getFunc: () => Any, id: Double, priority: Any, properties: Any, taglibId: String): Transformer = {
      val __obj = js.Dynamic.literal(getFunc = js.Any.fromFunction0(getFunc), id = id.asInstanceOf[js.Any], priority = priority.asInstanceOf[js.Any], properties = properties.asInstanceOf[js.Any], taglibId = taglibId.asInstanceOf[js.Any], name = null, path = null, tag = null)
      __obj.asInstanceOf[Transformer]
    }
    
    extension [Self <: Transformer](x: Self) {
      
      inline def setGetFunc(value: () => Any): Self = StObject.set(x, "getFunc", js.Any.fromFunction0(value))
      
      inline def setId(value: Double): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setNameNull: Self = StObject.set(x, "name", null)
      
      inline def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
      
      inline def setPathNull: Self = StObject.set(x, "path", null)
      
      inline def setPriority(value: Any): Self = StObject.set(x, "priority", value.asInstanceOf[js.Any])
      
      inline def setProperties(value: Any): Self = StObject.set(x, "properties", value.asInstanceOf[js.Any])
      
      inline def setTag(value: ^): Self = StObject.set(x, "tag", value.asInstanceOf[js.Any])
      
      inline def setTagNull: Self = StObject.set(x, "tag", null)
      
      inline def setTaglibId(value: String): Self = StObject.set(x, "taglibId", value.asInstanceOf[js.Any])
    }
  }
}
