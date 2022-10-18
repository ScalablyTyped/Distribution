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
  inline def apply(destination: String): ReadWriteStream = ^.asInstanceOf[js.Dynamic].apply(destination.asInstanceOf[js.Any]).asInstanceOf[ReadWriteStream]
  inline def apply(destination: String, options: Options): ReadWriteStream = (^.asInstanceOf[js.Dynamic].apply(destination.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[ReadWriteStream]
  
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
    
    inline def apply(): Options = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Options]
    }
    
    extension [Self <: Options](x: Self) {
      
      inline def setCwd(value: String): Self = StObject.set(x, "cwd", value.asInstanceOf[js.Any])
      
      inline def setCwdUndefined: Self = StObject.set(x, "cwd", js.undefined)
      
      inline def setExtension(value: String): Self = StObject.set(x, "extension", value.asInstanceOf[js.Any])
      
      inline def setExtensionUndefined: Self = StObject.set(x, "extension", js.undefined)
    }
  }
}
