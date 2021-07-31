package typings.gulpCleanDest

import typings.node.NodeJS.ReadWriteStream
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  /**
    * Removes files from the dest directory prior to building.
    * @param destination The name of the dest directory
    * @param options Options for the cleaning process
    */
  @scala.inline
  def apply(destination: String): ReadWriteStream = ^.asInstanceOf[js.Dynamic].apply(destination.asInstanceOf[js.Any]).asInstanceOf[ReadWriteStream]
  @scala.inline
  def apply(destination: String, options: Options): ReadWriteStream = (^.asInstanceOf[js.Dynamic].apply(destination.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[ReadWriteStream]
  
  @JSImport("gulp-clean-dest", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  trait Options extends StObject {
    
    /**
      * The working directory the folder is relative to.
      */
    var cwd: js.UndefOr[String] = js.undefined
    
    /**
      * Extension of the destination files. Useful if it differs from the original.
      */
    var `extension`: js.UndefOr[String] = js.undefined
  }
  object Options {
    
    @scala.inline
    def apply(): Options = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Options]
    }
    
    @scala.inline
    implicit class OptionsMutableBuilder[Self <: Options] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCwd(value: String): Self = StObject.set(x, "cwd", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCwdUndefined: Self = StObject.set(x, "cwd", js.undefined)
      
      @scala.inline
      def setExtension(value: String): Self = StObject.set(x, "extension", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setExtensionUndefined: Self = StObject.set(x, "extension", js.undefined)
    }
  }
}
