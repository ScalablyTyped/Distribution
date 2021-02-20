package typings.localDynamo

import typings.node.childProcessMod.ChildProcess
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("local-dynamo", "launch")
  @js.native
  def launch(): ChildProcess = js.native
  @JSImport("local-dynamo", "launch")
  @js.native
  def launch(options: js.UndefOr[scala.Nothing], port: Double): ChildProcess = js.native
  @JSImport("local-dynamo", "launch")
  @js.native
  def launch(options: String): ChildProcess = js.native
  @JSImport("local-dynamo", "launch")
  @js.native
  def launch(options: String, port: Double): ChildProcess = js.native
  @JSImport("local-dynamo", "launch")
  @js.native
  def launch(options: Options): ChildProcess = js.native
  @JSImport("local-dynamo", "launch")
  @js.native
  def launch(options: Options, port: Double): ChildProcess = js.native
  
  @js.native
  trait Options extends StObject {
    
    var cors: js.UndefOr[String | js.Array[String]] = js.native
    
    var detached: js.UndefOr[Boolean] = js.native
    
    var dir: js.UndefOr[String] = js.native
    
    var heap: js.UndefOr[String] = js.native
    
    var port: Double = js.native
    
    var sharedDb: js.UndefOr[Boolean] = js.native
    
    var stdio: js.UndefOr[String] = js.native
  }
  object Options {
    
    @scala.inline
    def apply(port: Double): Options = {
      val __obj = js.Dynamic.literal(port = port.asInstanceOf[js.Any])
      __obj.asInstanceOf[Options]
    }
    
    @scala.inline
    implicit class OptionsMutableBuilder[Self <: Options] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCors(value: String | js.Array[String]): Self = StObject.set(x, "cors", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCorsUndefined: Self = StObject.set(x, "cors", js.undefined)
      
      @scala.inline
      def setCorsVarargs(value: String*): Self = StObject.set(x, "cors", js.Array(value :_*))
      
      @scala.inline
      def setDetached(value: Boolean): Self = StObject.set(x, "detached", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDetachedUndefined: Self = StObject.set(x, "detached", js.undefined)
      
      @scala.inline
      def setDir(value: String): Self = StObject.set(x, "dir", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDirUndefined: Self = StObject.set(x, "dir", js.undefined)
      
      @scala.inline
      def setHeap(value: String): Self = StObject.set(x, "heap", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHeapUndefined: Self = StObject.set(x, "heap", js.undefined)
      
      @scala.inline
      def setPort(value: Double): Self = StObject.set(x, "port", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSharedDb(value: Boolean): Self = StObject.set(x, "sharedDb", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSharedDbUndefined: Self = StObject.set(x, "sharedDb", js.undefined)
      
      @scala.inline
      def setStdio(value: String): Self = StObject.set(x, "stdio", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStdioUndefined: Self = StObject.set(x, "stdio", js.undefined)
    }
  }
}
