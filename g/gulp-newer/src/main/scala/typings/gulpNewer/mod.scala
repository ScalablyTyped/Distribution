package typings.gulpNewer

import org.scalablytyped.runtime.Shortcut
import typings.node.NodeJS.ReadWriteStream
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod extends Shortcut {
  
  @JSImport("gulp-newer", JSImport.Namespace)
  @js.native
  val ^ : IGulpNewer = js.native
  
  trait IDestinationOption extends StObject {
    
    /**
      * Path to destination directory or file.
      */
    var dest: String
  }
  object IDestinationOption {
    
    inline def apply(dest: String): IDestinationOption = {
      val __obj = js.Dynamic.literal(dest = dest.asInstanceOf[js.Any])
      __obj.asInstanceOf[IDestinationOption]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: IDestinationOption] (val x: Self) extends AnyVal {
      
      inline def setDest(value: String): Self = StObject.set(x, "dest", value.asInstanceOf[js.Any])
    }
  }
  
  trait IExtOption extends StObject {
    
    /**
      * Source files will be matched to destination files with the provided extension.
      */
    var ext: String
  }
  object IExtOption {
    
    inline def apply(ext: String): IExtOption = {
      val __obj = js.Dynamic.literal(ext = ext.asInstanceOf[js.Any])
      __obj.asInstanceOf[IExtOption]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: IExtOption] (val x: Self) extends AnyVal {
      
      inline def setExt(value: String): Self = StObject.set(x, "ext", value.asInstanceOf[js.Any])
    }
  }
  
  trait IExtraOption extends StObject {
    
    /**
      * An extra file, file glob, or list of extra files and/or globs, to check for updated time stamp(s).
      * If any of these files are newer than the destination files, then all source files will be passed into the stream.
      */
    var extra: js.UndefOr[String | js.Array[String]] = js.undefined
  }
  object IExtraOption {
    
    inline def apply(): IExtraOption = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[IExtraOption]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: IExtraOption] (val x: Self) extends AnyVal {
      
      inline def setExtra(value: String | js.Array[String]): Self = StObject.set(x, "extra", value.asInstanceOf[js.Any])
      
      inline def setExtraUndefined: Self = StObject.set(x, "extra", js.undefined)
      
      inline def setExtraVarargs(value: String*): Self = StObject.set(x, "extra", js.Array(value*))
    }
  }
  
  @js.native
  trait IGulpNewer extends StObject {
    
    /**
      * Create a transform stream that passes through files whose modification time
      * is more recent than the corresponding destination file's modification time.
      * @param dest Path to destination directory or file.
      */
    def apply(dest: String): ReadWriteStream = js.native
    /**
      * Create a transform stream that passes through files whose modification time
      * is more recent than the corresponding destination file's modification time.
      */
    def apply(options: IOptions): ReadWriteStream = js.native
  }
  
  trait IMapOption extends StObject {
    
    /**
      * Map relative source paths to relative destination paths.
      */
    def map(relativePath: String): String
  }
  object IMapOption {
    
    inline def apply(map: String => String): IMapOption = {
      val __obj = js.Dynamic.literal(map = js.Any.fromFunction1(map))
      __obj.asInstanceOf[IMapOption]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: IMapOption] (val x: Self) extends AnyVal {
      
      inline def setMap(value: String => String): Self = StObject.set(x, "map", js.Any.fromFunction1(value))
    }
  }
  
  type IOptions = IExtraOption & ValidOptionPermutations
  
  /* Rewritten from type alias, can be one of: 
    - typings.gulpNewer.anon.IDestinationOptionPartial
    - typings.gulpNewer.anon.PartialIDestinationOption
  */
  trait ValidOptionPermutations extends StObject
  object ValidOptionPermutations {
    
    inline def IDestinationOptionPartial(dest: String): typings.gulpNewer.anon.IDestinationOptionPartial = {
      val __obj = js.Dynamic.literal(dest = dest.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.gulpNewer.anon.IDestinationOptionPartial]
    }
    
    inline def PartialIDestinationOption(map: String => String): typings.gulpNewer.anon.PartialIDestinationOption = {
      val __obj = js.Dynamic.literal(map = js.Any.fromFunction1(map))
      __obj.asInstanceOf[typings.gulpNewer.anon.PartialIDestinationOption]
    }
  }
  
  type _To = IGulpNewer
  
  /* This means you don't have to write `^`, but can instead just say `mod.foo` */
  override def _to: IGulpNewer = ^
}
