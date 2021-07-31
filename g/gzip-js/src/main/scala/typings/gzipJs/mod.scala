package typings.gzipJs

import typings.node.Buffer
import typings.std.Uint8Array
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("gzip-js", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("gzip-js", "DEFAULT_LEVEL")
  @js.native
  val DEFAULT_LEVEL: Double = js.native
  
  @scala.inline
  def unzip(data: js.Array[Double]): js.Array[Double] = ^.asInstanceOf[js.Dynamic].applyDynamic("unzip")(data.asInstanceOf[js.Any]).asInstanceOf[js.Array[Double]]
  @scala.inline
  def unzip(data: Buffer): js.Array[Double] = ^.asInstanceOf[js.Dynamic].applyDynamic("unzip")(data.asInstanceOf[js.Any]).asInstanceOf[js.Array[Double]]
  @scala.inline
  def unzip(data: Uint8Array): js.Array[Double] = ^.asInstanceOf[js.Dynamic].applyDynamic("unzip")(data.asInstanceOf[js.Any]).asInstanceOf[js.Array[Double]]
  
  @scala.inline
  def zip(data: String): js.Array[Double] = ^.asInstanceOf[js.Dynamic].applyDynamic("zip")(data.asInstanceOf[js.Any]).asInstanceOf[js.Array[Double]]
  @scala.inline
  def zip(data: String, opts: ZipOptions): js.Array[Double] = (^.asInstanceOf[js.Dynamic].applyDynamic("zip")(data.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[js.Array[Double]]
  
  trait ZipOptions extends StObject {
    
    var level: js.UndefOr[Double] = js.undefined
    
    var name: js.UndefOr[String] = js.undefined
    
    var timestamp: js.UndefOr[Double] = js.undefined
  }
  object ZipOptions {
    
    @scala.inline
    def apply(): ZipOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ZipOptions]
    }
    
    @scala.inline
    implicit class ZipOptionsMutableBuilder[Self <: ZipOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setLevel(value: Double): Self = StObject.set(x, "level", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLevelUndefined: Self = StObject.set(x, "level", js.undefined)
      
      @scala.inline
      def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
      
      @scala.inline
      def setTimestamp(value: Double): Self = StObject.set(x, "timestamp", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTimestampUndefined: Self = StObject.set(x, "timestamp", js.undefined)
    }
  }
}
