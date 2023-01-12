package typings.imagemin

import typings.node.bufferMod.global.Buffer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  object default {
    
    /**
      * @async
      */
    inline def apply(input: js.Array[String]): js.Promise[js.Array[Result]] = ^.asInstanceOf[js.Dynamic].apply(input.asInstanceOf[js.Any]).asInstanceOf[js.Promise[js.Array[Result]]]
    inline def apply(input: js.Array[String], options: Options): js.Promise[js.Array[Result]] = (^.asInstanceOf[js.Dynamic].apply(input.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[js.Array[Result]]]
    
    @JSImport("imagemin", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * @async
      */
    inline def buffer(input: Buffer): js.Promise[Buffer] = ^.asInstanceOf[js.Dynamic].applyDynamic("buffer")(input.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Buffer]]
    inline def buffer(input: Buffer, options: BufferOptions): js.Promise[Buffer] = (^.asInstanceOf[js.Dynamic].applyDynamic("buffer")(input.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Buffer]]
  }
  
  trait BufferOptions extends StObject {
    
    var plugins: js.Array[Plugin]
  }
  object BufferOptions {
    
    inline def apply(plugins: js.Array[Plugin]): BufferOptions = {
      val __obj = js.Dynamic.literal(plugins = plugins.asInstanceOf[js.Any])
      __obj.asInstanceOf[BufferOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: BufferOptions] (val x: Self) extends AnyVal {
      
      inline def setPlugins(value: js.Array[Plugin]): Self = StObject.set(x, "plugins", value.asInstanceOf[js.Any])
      
      inline def setPluginsVarargs(value: Plugin*): Self = StObject.set(x, "plugins", js.Array(value*))
    }
  }
  
  trait Options extends StObject {
    
    var destination: js.UndefOr[String] = js.undefined
    
    var glob: js.UndefOr[Boolean] = js.undefined
    
    var plugins: js.Array[Plugin]
  }
  object Options {
    
    inline def apply(plugins: js.Array[Plugin]): Options = {
      val __obj = js.Dynamic.literal(plugins = plugins.asInstanceOf[js.Any])
      __obj.asInstanceOf[Options]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Options] (val x: Self) extends AnyVal {
      
      inline def setDestination(value: String): Self = StObject.set(x, "destination", value.asInstanceOf[js.Any])
      
      inline def setDestinationUndefined: Self = StObject.set(x, "destination", js.undefined)
      
      inline def setGlob(value: Boolean): Self = StObject.set(x, "glob", value.asInstanceOf[js.Any])
      
      inline def setGlobUndefined: Self = StObject.set(x, "glob", js.undefined)
      
      inline def setPlugins(value: js.Array[Plugin]): Self = StObject.set(x, "plugins", value.asInstanceOf[js.Any])
      
      inline def setPluginsVarargs(value: Plugin*): Self = StObject.set(x, "plugins", js.Array(value*))
    }
  }
  
  type Plugin = js.Function1[/* input */ Buffer, js.Promise[Buffer]]
  
  trait Result extends StObject {
    
    var data: Buffer
    
    var destinationPath: String
    
    var sourcePath: String
  }
  object Result {
    
    inline def apply(data: Buffer, destinationPath: String, sourcePath: String): Result = {
      val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], destinationPath = destinationPath.asInstanceOf[js.Any], sourcePath = sourcePath.asInstanceOf[js.Any])
      __obj.asInstanceOf[Result]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Result] (val x: Self) extends AnyVal {
      
      inline def setData(value: Buffer): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
      
      inline def setDestinationPath(value: String): Self = StObject.set(x, "destinationPath", value.asInstanceOf[js.Any])
      
      inline def setSourcePath(value: String): Self = StObject.set(x, "sourcePath", value.asInstanceOf[js.Any])
    }
  }
}
