package typings.gulpCopy

import typings.through.mod.ThroughStream
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  /**
    * Copy files to destination and expose those files as source streams for the gulp pipeline.
    *
    * @param outDirectory The name of the destination directory. If this directory
    *                     does not exist, it will be created atomatically.
    */
  @scala.inline
  def apply(outDirectory: String): ThroughStream = ^.asInstanceOf[js.Dynamic].apply(outDirectory.asInstanceOf[js.Any]).asInstanceOf[ThroughStream]
  /**
    * Copy files to destination and expose those files as source streams for the gulp pipeline.
    *
    * @param outDirectory The name of the destination directory. If this directory
    *                     does not exist, it will be created atomatically.
    * @param options Override values for available settings.
    */
  @scala.inline
  def apply(outDirectory: String, options: GulpCopyOptions): ThroughStream = (^.asInstanceOf[js.Dynamic].apply(outDirectory.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[ThroughStream]
  
  @JSImport("gulp-copy", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  trait GulpCopyOptions extends StObject {
    
    /**
      * Specifies the number of parts of the path to be ignored as path prefixes.
      */
    var prefix: Double
  }
  object GulpCopyOptions {
    
    @scala.inline
    def apply(prefix: Double): GulpCopyOptions = {
      val __obj = js.Dynamic.literal(prefix = prefix.asInstanceOf[js.Any])
      __obj.asInstanceOf[GulpCopyOptions]
    }
    
    @scala.inline
    implicit class GulpCopyOptionsMutableBuilder[Self <: GulpCopyOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setPrefix(value: Double): Self = StObject.set(x, "prefix", value.asInstanceOf[js.Any])
    }
  }
}
