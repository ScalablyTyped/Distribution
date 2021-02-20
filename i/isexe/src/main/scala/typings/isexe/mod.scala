package typings.isexe

import typings.node.NodeJS.ErrnoException
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("isexe", JSImport.Namespace)
  @js.native
  def apply(path: String): js.Promise[Boolean] = js.native
  @JSImport("isexe", JSImport.Namespace)
  @js.native
  def apply(
    path: String,
    callback: js.Function2[/* error */ js.UndefOr[ErrnoException], /* isExe */ Boolean, Unit]
  ): Unit = js.native
  @JSImport("isexe", JSImport.Namespace)
  @js.native
  def apply(path: String, options: Options): js.Promise[Boolean] = js.native
  @JSImport("isexe", JSImport.Namespace)
  @js.native
  def apply(
    path: String,
    options: Options,
    callback: js.Function2[/* error */ js.UndefOr[ErrnoException], /* isExe */ Boolean, Unit]
  ): Unit = js.native
  
  @JSImport("isexe", "sync")
  @js.native
  def sync(path: String): Boolean = js.native
  @JSImport("isexe", "sync")
  @js.native
  def sync(path: String, options: Options): Boolean = js.native
  
  @js.native
  trait Options extends StObject {
    
    var gid: js.UndefOr[Double] = js.native
    
    var ignoreErrors: js.UndefOr[Boolean] = js.native
    
    var pathExt: js.UndefOr[String] = js.native
    
    var uid: js.UndefOr[Double] = js.native
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
      def setGid(value: Double): Self = StObject.set(x, "gid", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setGidUndefined: Self = StObject.set(x, "gid", js.undefined)
      
      @scala.inline
      def setIgnoreErrors(value: Boolean): Self = StObject.set(x, "ignoreErrors", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIgnoreErrorsUndefined: Self = StObject.set(x, "ignoreErrors", js.undefined)
      
      @scala.inline
      def setPathExt(value: String): Self = StObject.set(x, "pathExt", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPathExtUndefined: Self = StObject.set(x, "pathExt", js.undefined)
      
      @scala.inline
      def setUid(value: Double): Self = StObject.set(x, "uid", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUidUndefined: Self = StObject.set(x, "uid", js.undefined)
    }
  }
}
