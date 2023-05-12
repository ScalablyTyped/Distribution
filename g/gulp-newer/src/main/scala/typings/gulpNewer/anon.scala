package typings.gulpNewer

import typings.gulpNewer.mod.ValidOptionPermutations
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  /* Inlined gulp-newer.gulp-newer.IDestinationOption & std.Partial<gulp-newer.gulp-newer.IExtOption> & std.Partial<gulp-newer.gulp-newer.IMapOption> */
  trait IDestinationOptionPartial
    extends StObject
       with ValidOptionPermutations {
    
    /**
      * Path to destination directory or file.
      */
    var dest: String
    
    var ext: js.UndefOr[String] = js.undefined
    
    var map: js.UndefOr[js.Function1[/* relativePath */ String, String]] = js.undefined
  }
  object IDestinationOptionPartial {
    
    inline def apply(dest: String): IDestinationOptionPartial = {
      val __obj = js.Dynamic.literal(dest = dest.asInstanceOf[js.Any])
      __obj.asInstanceOf[IDestinationOptionPartial]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: IDestinationOptionPartial] (val x: Self) extends AnyVal {
      
      inline def setDest(value: String): Self = StObject.set(x, "dest", value.asInstanceOf[js.Any])
      
      inline def setExt(value: String): Self = StObject.set(x, "ext", value.asInstanceOf[js.Any])
      
      inline def setExtUndefined: Self = StObject.set(x, "ext", js.undefined)
      
      inline def setMap(value: /* relativePath */ String => String): Self = StObject.set(x, "map", js.Any.fromFunction1(value))
      
      inline def setMapUndefined: Self = StObject.set(x, "map", js.undefined)
    }
  }
  
  /* Inlined std.Partial<gulp-newer.gulp-newer.IDestinationOption> & std.Partial<gulp-newer.gulp-newer.IExtOption> & gulp-newer.gulp-newer.IMapOption */
  trait PartialIDestinationOption
    extends StObject
       with ValidOptionPermutations {
    
    var dest: js.UndefOr[String] = js.undefined
    
    var ext: js.UndefOr[String] = js.undefined
    
    /**
      * Map relative source paths to relative destination paths.
      */
    def map(relativePath: String): String
  }
  object PartialIDestinationOption {
    
    inline def apply(map: String => String): PartialIDestinationOption = {
      val __obj = js.Dynamic.literal(map = js.Any.fromFunction1(map))
      __obj.asInstanceOf[PartialIDestinationOption]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: PartialIDestinationOption] (val x: Self) extends AnyVal {
      
      inline def setDest(value: String): Self = StObject.set(x, "dest", value.asInstanceOf[js.Any])
      
      inline def setDestUndefined: Self = StObject.set(x, "dest", js.undefined)
      
      inline def setExt(value: String): Self = StObject.set(x, "ext", value.asInstanceOf[js.Any])
      
      inline def setExtUndefined: Self = StObject.set(x, "ext", js.undefined)
      
      inline def setMap(value: String => String): Self = StObject.set(x, "map", js.Any.fromFunction1(value))
    }
  }
}
