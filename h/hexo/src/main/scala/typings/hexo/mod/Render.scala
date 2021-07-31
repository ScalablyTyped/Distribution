package typings.hexo.mod

import typings.hexo.mod.Render.Data
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Render extends StObject {
  
  /**
    * Get the Output Extension
    */
  def getOutput(path: String): String = js.native
  
  /**
    * Check whether a file is renderable synchronously.
    */
  def isRenderable(path: String): Boolean = js.native
  
  /**
    * Check whether a file is renderable.
    */
  def isRenderableSync(path: String): Boolean = js.native
  
  def render(data: Data): js.Promise[String] = js.native
  def render(data: Data, fn: js.Function2[/* err */ js.Any, /* result */ String, Unit]): js.Promise[String] = js.native
  def render(data: Data, option: js.Any): js.Promise[String] = js.native
  def render(data: Data, option: js.Any, fn: js.Function2[/* err */ js.Any, /* result */ String, Unit]): js.Promise[String] = js.native
  def render(data: Data, option: Unit, fn: js.Function2[/* err */ js.Any, /* result */ String, Unit]): js.Promise[String] = js.native
  
  def renderSync(data: Data): String = js.native
  def renderSync(data: Data, option: js.Any): String = js.native
}
object Render {
  
  trait Data extends StObject {
    
    var engine: js.UndefOr[String] = js.undefined
    
    var path: js.UndefOr[String] = js.undefined
    
    var text: js.UndefOr[String] = js.undefined
  }
  object Data {
    
    @scala.inline
    def apply(): Data = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Data]
    }
    
    @scala.inline
    implicit class DataMutableBuilder[Self <: Data] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setEngine(value: String): Self = StObject.set(x, "engine", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEngineUndefined: Self = StObject.set(x, "engine", js.undefined)
      
      @scala.inline
      def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPathUndefined: Self = StObject.set(x, "path", js.undefined)
      
      @scala.inline
      def setText(value: String): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTextUndefined: Self = StObject.set(x, "text", js.undefined)
    }
  }
}
