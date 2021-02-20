package typings.gulpChanged

import org.scalablytyped.runtime.Shortcut
import typings.node.Buffer
import typings.node.NodeJS.ReadWriteStream
import typings.node.streamMod.Transform
import typings.vinyl.mod.File
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod extends Shortcut {
  
  @JSImport("gulp-changed", JSImport.Namespace)
  @js.native
  val ^ : IGulpChanged = js.native
  
  type IComparator = js.Function4[
    /* stream */ Transform, 
    /* callback */ js.Function, 
    /* sourceFile */ File, 
    /* destPath */ String, 
    Unit
  ]
  
  type IDestination = js.Function1[/* file */ String | Buffer, String]
  
  @js.native
  trait IGulpChanged extends StObject {
    
    def apply(destination: String): ReadWriteStream = js.native
    def apply(destination: String, options: IOptions): ReadWriteStream = js.native
    def apply(destination: IDestination): ReadWriteStream = js.native
    def apply(destination: IDestination, options: IOptions): ReadWriteStream = js.native
    
    var compareLastModifiedTime: IComparator = js.native
    
    var compareSha1Digest: IComparator = js.native
  }
  
  @js.native
  trait IOptions extends StObject {
    
    /**
      * The working directory the folder is relative to.
      * @default process.cwd()
      */
    var cwd: js.UndefOr[String] = js.native
    
    /**
      * Extension of the destination files.
      */
    var extension: js.UndefOr[String] = js.native
    
    /**
      * Function that determines whether the source file is different from the destination file.
      * @default changed.compareLastModifiedTime
      */
    var hasChanged: js.UndefOr[IComparator] = js.native
    
    /**
      * Function to transform the path to the destination file. Should return the absolute path to the (renamed) destination file.
      */
    var transformPath: js.UndefOr[js.Function1[/* destPath */ String, String]] = js.native
  }
  object IOptions {
    
    @scala.inline
    def apply(): IOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[IOptions]
    }
    
    @scala.inline
    implicit class IOptionsMutableBuilder[Self <: IOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCwd(value: String): Self = StObject.set(x, "cwd", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCwdUndefined: Self = StObject.set(x, "cwd", js.undefined)
      
      @scala.inline
      def setExtension(value: String): Self = StObject.set(x, "extension", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setExtensionUndefined: Self = StObject.set(x, "extension", js.undefined)
      
      @scala.inline
      def setHasChanged(
        value: (/* stream */ Transform, /* callback */ js.Function, /* sourceFile */ File, /* destPath */ String) => Unit
      ): Self = StObject.set(x, "hasChanged", js.Any.fromFunction4(value))
      
      @scala.inline
      def setHasChangedUndefined: Self = StObject.set(x, "hasChanged", js.undefined)
      
      @scala.inline
      def setTransformPath(value: /* destPath */ String => String): Self = StObject.set(x, "transformPath", js.Any.fromFunction1(value))
      
      @scala.inline
      def setTransformPathUndefined: Self = StObject.set(x, "transformPath", js.undefined)
    }
  }
  
  type _To = IGulpChanged
  
  /* This means you don't have to write `^`, but can instead just say `mod.foo` */
  override def _to: IGulpChanged = ^
}
