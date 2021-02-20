package typings.hexo.mod

import typings.hexo.mod.Post.Data
import typings.hexo.mod.Post.RenderData
import typings.moment.mod.MomentInput
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Post extends StObject {
  
  /**
    * Create a Post
    */
  def create(data: Data): js.Promise[Unit] = js.native
  def create(data: Data, fn: js.Function1[/* err */ js.Any, Unit]): js.Promise[Unit] = js.native
  def create(data: Data, replace: js.UndefOr[scala.Nothing], fn: js.Function1[/* err */ js.Any, Unit]): js.Promise[Unit] = js.native
  def create(data: Data, replace: Boolean): js.Promise[Unit] = js.native
  def create(data: Data, replace: Boolean, fn: js.Function1[/* err */ js.Any, Unit]): js.Promise[Unit] = js.native
  
  /**
    * Publish a Draft
    */
  def publish(data: Data): js.Promise[Unit] = js.native
  def publish(data: Data, fn: js.Function1[/* err */ js.Any, Unit]): js.Promise[Unit] = js.native
  def publish(data: Data, replace: js.UndefOr[scala.Nothing], fn: js.Function1[/* err */ js.Any, Unit]): js.Promise[Unit] = js.native
  def publish(data: Data, replace: Boolean): js.Promise[Unit] = js.native
  def publish(data: Data, replace: Boolean, fn: js.Function1[/* err */ js.Any, Unit]): js.Promise[Unit] = js.native
  
  def render(source: js.UndefOr[scala.Nothing], data: RenderData, fn: js.Function1[/* err */ js.Any, Unit]): js.Promise[Unit] = js.native
  def render(source: String, data: RenderData, fn: js.Function1[/* err */ js.Any, Unit]): js.Promise[Unit] = js.native
  def render(source: Null, data: RenderData, fn: js.Function1[/* err */ js.Any, Unit]): js.Promise[Unit] = js.native
}
object Post {
  
  @js.native
  trait Data extends StObject {
    
    var date: js.UndefOr[MomentInput] = js.native
    
    var layout: js.UndefOr[String] = js.native
    
    var path: js.UndefOr[String] = js.native
    
    var slug: js.UndefOr[String] = js.native
    
    var title: js.UndefOr[String] = js.native
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
      def setDate(value: MomentInput): Self = StObject.set(x, "date", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDateUndefined: Self = StObject.set(x, "date", js.undefined)
      
      @scala.inline
      def setDateVarargs(value: (Double | String)*): Self = StObject.set(x, "date", js.Array(value :_*))
      
      @scala.inline
      def setLayout(value: String): Self = StObject.set(x, "layout", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLayoutUndefined: Self = StObject.set(x, "layout", js.undefined)
      
      @scala.inline
      def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPathUndefined: Self = StObject.set(x, "path", js.undefined)
      
      @scala.inline
      def setSlug(value: String): Self = StObject.set(x, "slug", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSlugUndefined: Self = StObject.set(x, "slug", js.undefined)
      
      @scala.inline
      def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
    }
  }
  
  @js.native
  trait RenderData extends StObject {
    
    var content: js.UndefOr[String] = js.native
    
    var engine: js.UndefOr[String] = js.native
  }
  object RenderData {
    
    @scala.inline
    def apply(): RenderData = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[RenderData]
    }
    
    @scala.inline
    implicit class RenderDataMutableBuilder[Self <: RenderData] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setContent(value: String): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setContentUndefined: Self = StObject.set(x, "content", js.undefined)
      
      @scala.inline
      def setEngine(value: String): Self = StObject.set(x, "engine", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEngineUndefined: Self = StObject.set(x, "engine", js.undefined)
    }
  }
}
