package typings.hexo.mod

import typings.hexo.mod.Router.Data
import typings.hexo.mod.Router.RouteStream
import typings.hexoUtil.mod.Pattern
import typings.node.Buffer
import typings.node.streamMod.Readable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Router extends StObject {
  
  /**
    * The `format` method transforms a string to a valid path.
    */
  def format(path: String): String = js.native
  
  /**
    * The `get` method returns a `Stream`.
    */
  def get(path: String): js.UndefOr[RouteStream] = js.native
  
  /**
    * Get the List of Routes
    */
  def list(): js.Array[String] = js.native
  
  /**
    * Remove a Path
    */
  def remove(path: String): this.type = js.native
  
  /**
    * The `set` method takes a string, a `Buffer` or a function.
    */
  def set(path: String, data: String): this.type = js.native
  def set(path: String, data: Data): this.type = js.native
  def set(path: String, data: Pattern[Boolean]): this.type = js.native
  def set(path: String, data: Buffer): this.type = js.native
}
object Router {
  
  type Callback = (js.Function2[/* err */ js.Any, /* result */ String, Unit]) | js.Function0[js.Promise[String]]
  
  @js.native
  trait Data extends StObject {
    
    var data: String | Buffer | Callback = js.native
    
    var modified: Boolean = js.native
  }
  object Data {
    
    @scala.inline
    def apply(data: String | Buffer | Callback, modified: Boolean): Data = {
      val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], modified = modified.asInstanceOf[js.Any])
      __obj.asInstanceOf[Data]
    }
    
    @scala.inline
    implicit class DataMutableBuilder[Self <: Data] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setData(value: String | Buffer | Callback): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDataFunction0(value: () => js.Promise[String]): Self = StObject.set(x, "data", js.Any.fromFunction0(value))
      
      @scala.inline
      def setDataFunction2(value: (/* err */ js.Any, /* result */ String) => Unit): Self = StObject.set(x, "data", js.Any.fromFunction2(value))
      
      @scala.inline
      def setModified(value: Boolean): Self = StObject.set(x, "modified", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait RouteStream extends Readable {
    
    val modified: Boolean = js.native
  }
}
