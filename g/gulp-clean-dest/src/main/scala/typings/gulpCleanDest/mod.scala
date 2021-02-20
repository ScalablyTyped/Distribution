package typings.gulpCleanDest

import typings.node.NodeJS.ReadWriteStream
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  /**
    * Removes files from the dest directory prior to building.
    * @param destination The name of the dest directory
    * @param options Options for the cleaning process
    */
  @JSImport("gulp-clean-dest", JSImport.Namespace)
  @js.native
  def apply(destination: String): ReadWriteStream = js.native
  @JSImport("gulp-clean-dest", JSImport.Namespace)
  @js.native
  def apply(destination: String, options: Options): ReadWriteStream = js.native
  
  @js.native
  trait Options extends StObject {
    
    /**
      * The working directory the folder is relative to.
      */
    var cwd: js.UndefOr[String] = js.native
    
    /**
      * Extension of the destination files. Useful if it differs from the original.
      */
    var extension: js.UndefOr[String] = js.native
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
