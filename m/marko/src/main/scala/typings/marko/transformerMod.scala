package typings.marko

import typings.marko.tagMod.^
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object transformerMod {
  
  @JSImport("marko/src/compiler/taglib-loader/Transformer", JSImport.Default)
  @js.native
  class default ()
    extends StObject
       with Transformer {
    
    /* CompleteClass */
    override def getFunc(): js.Any = js.native
    
    /* CompleteClass */
    var id: Double = js.native
    
    /* CompleteClass */
    var name: String | Null = js.native
    
    /* CompleteClass */
    var path: String | Null = js.native
    
    /* CompleteClass */
    var priority: js.Any = js.native
    
    /* CompleteClass */
    var properties: js.Any = js.native
    
    /* CompleteClass */
    var tag: ^ | Null = js.native
    
    /* CompleteClass */
    var taglibId: String = js.native
  }
  
  trait Transformer extends StObject {
    
    def getFunc(): js.Any
    
    var id: Double
    
    var name: String | Null
    
    var path: String | Null
    
    var priority: js.Any
    
    var properties: js.Any
    
    var tag: ^ | Null
    
    var taglibId: String
  }
  object Transformer {
    
    @scala.inline
    def apply(getFunc: () => js.Any, id: Double, priority: js.Any, properties: js.Any, taglibId: String): Transformer = {
      val __obj = js.Dynamic.literal(getFunc = js.Any.fromFunction0(getFunc), id = id.asInstanceOf[js.Any], priority = priority.asInstanceOf[js.Any], properties = properties.asInstanceOf[js.Any], taglibId = taglibId.asInstanceOf[js.Any], name = null, path = null, tag = null)
      __obj.asInstanceOf[Transformer]
    }
    
    @scala.inline
    implicit class TransformerMutableBuilder[Self <: Transformer] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setGetFunc(value: () => js.Any): Self = StObject.set(x, "getFunc", js.Any.fromFunction0(value))
      
      @scala.inline
      def setId(value: Double): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNameNull: Self = StObject.set(x, "name", null)
      
      @scala.inline
      def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPathNull: Self = StObject.set(x, "path", null)
      
      @scala.inline
      def setPriority(value: js.Any): Self = StObject.set(x, "priority", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setProperties(value: js.Any): Self = StObject.set(x, "properties", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTag(value: ^): Self = StObject.set(x, "tag", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTagNull: Self = StObject.set(x, "tag", null)
      
      @scala.inline
      def setTaglibId(value: String): Self = StObject.set(x, "taglibId", value.asInstanceOf[js.Any])
    }
  }
}
