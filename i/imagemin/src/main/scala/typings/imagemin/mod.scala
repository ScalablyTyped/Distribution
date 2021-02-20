package typings.imagemin

import typings.node.Buffer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("imagemin", JSImport.Namespace)
  @js.native
  def apply(input: js.Array[String]): js.Promise[js.Array[Result]] = js.native
  @JSImport("imagemin", JSImport.Namespace)
  @js.native
  def apply(input: js.Array[String], options: Options): js.Promise[js.Array[Result]] = js.native
  
  @JSImport("imagemin", "buffer")
  @js.native
  def buffer(buffer: Buffer): js.Promise[Buffer] = js.native
  @JSImport("imagemin", "buffer")
  @js.native
  def buffer(buffer: Buffer, options: BufferOptions): js.Promise[Buffer] = js.native
  
  @js.native
  trait BufferOptions extends StObject {
    
    var plugins: js.Array[Plugin] = js.native
  }
  object BufferOptions {
    
    @scala.inline
    def apply(plugins: js.Array[Plugin]): BufferOptions = {
      val __obj = js.Dynamic.literal(plugins = plugins.asInstanceOf[js.Any])
      __obj.asInstanceOf[BufferOptions]
    }
    
    @scala.inline
    implicit class BufferOptionsMutableBuilder[Self <: BufferOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setPlugins(value: js.Array[Plugin]): Self = StObject.set(x, "plugins", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPluginsVarargs(value: Plugin*): Self = StObject.set(x, "plugins", js.Array(value :_*))
    }
  }
  
  @js.native
  trait Options extends StObject {
    
    var destination: js.UndefOr[String] = js.native
    
    var glob: js.UndefOr[Boolean] = js.native
    
    var plugins: js.Array[Plugin] = js.native
  }
  object Options {
    
    @scala.inline
    def apply(plugins: js.Array[Plugin]): Options = {
      val __obj = js.Dynamic.literal(plugins = plugins.asInstanceOf[js.Any])
      __obj.asInstanceOf[Options]
    }
    
    @scala.inline
    implicit class OptionsMutableBuilder[Self <: Options] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDestination(value: String): Self = StObject.set(x, "destination", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDestinationUndefined: Self = StObject.set(x, "destination", js.undefined)
      
      @scala.inline
      def setGlob(value: Boolean): Self = StObject.set(x, "glob", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setGlobUndefined: Self = StObject.set(x, "glob", js.undefined)
      
      @scala.inline
      def setPlugins(value: js.Array[Plugin]): Self = StObject.set(x, "plugins", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPluginsVarargs(value: Plugin*): Self = StObject.set(x, "plugins", js.Array(value :_*))
    }
  }
  
  type Plugin = js.Function1[/* input */ Buffer, js.Promise[Buffer]]
  
  @js.native
  trait Result extends StObject {
    
    var data: Buffer = js.native
    
    var destinationPath: String = js.native
    
    var sourcePath: String = js.native
  }
  object Result {
    
    @scala.inline
    def apply(data: Buffer, destinationPath: String, sourcePath: String): Result = {
      val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], destinationPath = destinationPath.asInstanceOf[js.Any], sourcePath = sourcePath.asInstanceOf[js.Any])
      __obj.asInstanceOf[Result]
    }
    
    @scala.inline
    implicit class ResultMutableBuilder[Self <: Result] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setData(value: Buffer): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDestinationPath(value: String): Self = StObject.set(x, "destinationPath", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSourcePath(value: String): Self = StObject.set(x, "sourcePath", value.asInstanceOf[js.Any])
    }
  }
}
