package typings.gulpNgAnnotate

import org.scalablytyped.runtime.Shortcut
import typings.node.NodeJS.ReadWriteStream
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod extends Shortcut {
  
  @JSImport("gulp-ng-annotate", JSImport.Namespace)
  @js.native
  val ^ : NgAnnotate = js.native
  
  type NgAnnotate = js.Function1[/* option */ js.UndefOr[Option], ReadWriteStream]
  
  //TODO: Should be on ng-annotate module
  trait Option extends StObject {
    
    /**
      * Add annotations where non-existing
      */
    var add: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Enable optional matcher
      */
    var enable: js.UndefOr[Boolean] = js.undefined
    
    /**
      * List optional matchers
      */
    var list: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Load a user plugin with the provided path
      */
    var plugin: js.UndefOr[js.Array[Any]] = js.undefined
    
    /**
      * Restrict matching further or to expand matching
      */
    var regexp: js.UndefOr[String] = js.undefined
    
    /**
      * Remove all existing annotations
      */
    var remove: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Rename providers (services, factories, controllers, etc.) with a new name when declared and referenced through annotation
      */
    var rename: js.UndefOr[js.Array[RenameOption]] = js.undefined
    
    /**
      * Output '$scope' instead of "$scope".
      */
    var single_quotes: js.UndefOr[Boolean] = js.undefined
  }
  object Option {
    
    inline def apply(): Option = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Option]
    }
    
    extension [Self <: Option](x: Self) {
      
      inline def setAdd(value: Boolean): Self = StObject.set(x, "add", value.asInstanceOf[js.Any])
      
      inline def setAddUndefined: Self = StObject.set(x, "add", js.undefined)
      
      inline def setEnable(value: Boolean): Self = StObject.set(x, "enable", value.asInstanceOf[js.Any])
      
      inline def setEnableUndefined: Self = StObject.set(x, "enable", js.undefined)
      
      inline def setList(value: Boolean): Self = StObject.set(x, "list", value.asInstanceOf[js.Any])
      
      inline def setListUndefined: Self = StObject.set(x, "list", js.undefined)
      
      inline def setPlugin(value: js.Array[Any]): Self = StObject.set(x, "plugin", value.asInstanceOf[js.Any])
      
      inline def setPluginUndefined: Self = StObject.set(x, "plugin", js.undefined)
      
      inline def setPluginVarargs(value: Any*): Self = StObject.set(x, "plugin", js.Array(value*))
      
      inline def setRegexp(value: String): Self = StObject.set(x, "regexp", value.asInstanceOf[js.Any])
      
      inline def setRegexpUndefined: Self = StObject.set(x, "regexp", js.undefined)
      
      inline def setRemove(value: Boolean): Self = StObject.set(x, "remove", value.asInstanceOf[js.Any])
      
      inline def setRemoveUndefined: Self = StObject.set(x, "remove", js.undefined)
      
      inline def setRename(value: js.Array[RenameOption]): Self = StObject.set(x, "rename", value.asInstanceOf[js.Any])
      
      inline def setRenameUndefined: Self = StObject.set(x, "rename", js.undefined)
      
      inline def setRenameVarargs(value: RenameOption*): Self = StObject.set(x, "rename", js.Array(value*))
      
      inline def setSingle_quotes(value: Boolean): Self = StObject.set(x, "single_quotes", value.asInstanceOf[js.Any])
      
      inline def setSingle_quotesUndefined: Self = StObject.set(x, "single_quotes", js.undefined)
    }
  }
  
  trait RenameOption extends StObject {
    
    var from: String
    
    var to: String
  }
  object RenameOption {
    
    inline def apply(from: String, to: String): RenameOption = {
      val __obj = js.Dynamic.literal(from = from.asInstanceOf[js.Any], to = to.asInstanceOf[js.Any])
      __obj.asInstanceOf[RenameOption]
    }
    
    extension [Self <: RenameOption](x: Self) {
      
      inline def setFrom(value: String): Self = StObject.set(x, "from", value.asInstanceOf[js.Any])
      
      inline def setTo(value: String): Self = StObject.set(x, "to", value.asInstanceOf[js.Any])
    }
  }
  
  type _To = NgAnnotate
  
  /* This means you don't have to write `^`, but can instead just say `mod.foo` */
  override def _to: NgAnnotate = ^
}
