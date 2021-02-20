package typings.istanbulLibSourceMaps

import typings.istanbulLibSourceMaps.istanbulLibSourceMapsStrings.file
import typings.istanbulLibSourceMaps.istanbulLibSourceMapsStrings.memory
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  @js.native
  trait Data extends StObject {
    
    var data: js.Any = js.native
    
    var `type`: String = js.native
  }
  object Data {
    
    @scala.inline
    def apply(data: js.Any, `type`: String): Data = {
      val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[Data]
    }
    
    @scala.inline
    implicit class DataMutableBuilder[Self <: Data] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setData(value: js.Any): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
  
  /* Inlined std.Partial<istanbul-lib-source-maps.istanbul-lib-source-maps.MapStoreOptions> */
  @js.native
  trait PartialMapStoreOptions extends StObject {
    
    var baseDir: js.UndefOr[String] = js.native
    
    var sourceStore: js.UndefOr[memory | file] = js.native
    
    var tmpdir: js.UndefOr[String] = js.native
    
    var verbose: js.UndefOr[Boolean] = js.native
  }
  object PartialMapStoreOptions {
    
    @scala.inline
    def apply(): PartialMapStoreOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PartialMapStoreOptions]
    }
    
    @scala.inline
    implicit class PartialMapStoreOptionsMutableBuilder[Self <: PartialMapStoreOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setBaseDir(value: String): Self = StObject.set(x, "baseDir", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBaseDirUndefined: Self = StObject.set(x, "baseDir", js.undefined)
      
      @scala.inline
      def setSourceStore(value: memory | file): Self = StObject.set(x, "sourceStore", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSourceStoreUndefined: Self = StObject.set(x, "sourceStore", js.undefined)
      
      @scala.inline
      def setTmpdir(value: String): Self = StObject.set(x, "tmpdir", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTmpdirUndefined: Self = StObject.set(x, "tmpdir", js.undefined)
      
      @scala.inline
      def setVerbose(value: Boolean): Self = StObject.set(x, "verbose", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVerboseUndefined: Self = StObject.set(x, "verbose", js.undefined)
    }
  }
}
