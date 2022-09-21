package typings.lnfs

import typings.node.fsMod.symlink.Type
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  /**
    * Safely force create symlinks.
    *
    * @param src Path to source file.
    * @param dest Path to destination.
    * @param type Default: `file`. Is only available on Windows (ignored on other platforms).
    *
    * @example
    * import lnfs = require('lnfs');
    *
    * lnfs('foo.txt', 'bar.txt').then(() => {
    *   console.log('Symlink successfully created!');
    * });
    */
  inline def apply(src: String, dest: String): js.Promise[String] = (^.asInstanceOf[js.Dynamic].apply(src.asInstanceOf[js.Any], dest.asInstanceOf[js.Any])).asInstanceOf[js.Promise[String]]
  inline def apply(src: String, dest: String, `type`: Type): js.Promise[String] = (^.asInstanceOf[js.Dynamic].apply(src.asInstanceOf[js.Any], dest.asInstanceOf[js.Any], `type`.asInstanceOf[js.Any])).asInstanceOf[js.Promise[String]]
  
  @JSImport("lnfs", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
}
