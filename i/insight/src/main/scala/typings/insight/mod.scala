package typings.insight

import typings.insight.mod.insight.IConfigstore
import typings.insight.mod.insight.IEvent
import typings.insight.mod.insight.IOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("insight", JSImport.Namespace)
  @js.native
  class ^ protected () extends Insight_ {
    def this(options: IOptions) = this()
  }
  
  @js.native
  trait Insight_ extends StObject {
    
    var appVersion: String = js.native
    
    def askPermission(): Unit = js.native
    def askPermission(msg: js.UndefOr[scala.Nothing], cb: js.Function): Unit = js.native
    def askPermission(msg: String): Unit = js.native
    def askPermission(msg: String, cb: js.Function): Unit = js.native
    
    var clientId: String = js.native
    
    var config: IConfigstore = js.native
    
    var nodeVersion: String = js.native
    
    var optOut: Boolean = js.native
    
    var os: String = js.native
    
    var packageName: String = js.native
    
    var packageVersion: String = js.native
    
    def track(args: String*): Unit = js.native
    
    def trackEvent(event: IEvent): Unit = js.native
    
    var trackingCode: String = js.native
    
    var trackingProvider: String = js.native
  }
  
  object insight {
    
    @js.native
    trait IConfigstore extends StObject {
      
      var all: js.Any = js.native
      
      def del(key: String): Unit = js.native
      
      def get(key: String): js.Any = js.native
      
      var path: String = js.native
      
      def set(key: String, `val`: js.Any): Unit = js.native
    }
    object IConfigstore {
      
      @scala.inline
      def apply(
        all: js.Any,
        del: String => Unit,
        get: String => js.Any,
        path: String,
        set: (String, js.Any) => Unit
      ): IConfigstore = {
        val __obj = js.Dynamic.literal(all = all.asInstanceOf[js.Any], del = js.Any.fromFunction1(del), get = js.Any.fromFunction1(get), path = path.asInstanceOf[js.Any], set = js.Any.fromFunction2(set))
        __obj.asInstanceOf[IConfigstore]
      }
      
      @scala.inline
      implicit class IConfigstoreMutableBuilder[Self <: IConfigstore] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setAll(value: js.Any): Self = StObject.set(x, "all", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setDel(value: String => Unit): Self = StObject.set(x, "del", js.Any.fromFunction1(value))
        
        @scala.inline
        def setGet(value: String => js.Any): Self = StObject.set(x, "get", js.Any.fromFunction1(value))
        
        @scala.inline
        def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setSet(value: (String, js.Any) => Unit): Self = StObject.set(x, "set", js.Any.fromFunction2(value))
      }
    }
    
    @js.native
    trait IEvent extends StObject {
      
      var action: String = js.native
      
      var category: String = js.native
      
      var label: js.UndefOr[String] = js.native
      
      var value: js.UndefOr[Double | String] = js.native
    }
    object IEvent {
      
      @scala.inline
      def apply(action: String, category: String): IEvent = {
        val __obj = js.Dynamic.literal(action = action.asInstanceOf[js.Any], category = category.asInstanceOf[js.Any])
        __obj.asInstanceOf[IEvent]
      }
      
      @scala.inline
      implicit class IEventMutableBuilder[Self <: IEvent] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setAction(value: String): Self = StObject.set(x, "action", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setCategory(value: String): Self = StObject.set(x, "category", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setLabel(value: String): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setLabelUndefined: Self = StObject.set(x, "label", js.undefined)
        
        @scala.inline
        def setValue(value: Double | String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
      }
    }
    
    @js.native
    trait IOptions extends StObject {
      
      var config: js.UndefOr[IConfigstore] = js.native
      
      var packageName: js.UndefOr[String] = js.native
      
      var packageVersion: js.UndefOr[String] = js.native
      
      var pkg: js.UndefOr[IPackage] = js.native
      
      var trackingCode: String = js.native
      
      var trackingProvider: js.UndefOr[String] = js.native
    }
    object IOptions {
      
      @scala.inline
      def apply(trackingCode: String): IOptions = {
        val __obj = js.Dynamic.literal(trackingCode = trackingCode.asInstanceOf[js.Any])
        __obj.asInstanceOf[IOptions]
      }
      
      @scala.inline
      implicit class IOptionsMutableBuilder[Self <: IOptions] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setConfig(value: IConfigstore): Self = StObject.set(x, "config", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setConfigUndefined: Self = StObject.set(x, "config", js.undefined)
        
        @scala.inline
        def setPackageName(value: String): Self = StObject.set(x, "packageName", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setPackageNameUndefined: Self = StObject.set(x, "packageName", js.undefined)
        
        @scala.inline
        def setPackageVersion(value: String): Self = StObject.set(x, "packageVersion", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setPackageVersionUndefined: Self = StObject.set(x, "packageVersion", js.undefined)
        
        @scala.inline
        def setPkg(value: IPackage): Self = StObject.set(x, "pkg", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setPkgUndefined: Self = StObject.set(x, "pkg", js.undefined)
        
        @scala.inline
        def setTrackingCode(value: String): Self = StObject.set(x, "trackingCode", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setTrackingProvider(value: String): Self = StObject.set(x, "trackingProvider", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setTrackingProviderUndefined: Self = StObject.set(x, "trackingProvider", js.undefined)
      }
    }
    
    @js.native
    trait IPackage extends StObject {
      
      var name: String = js.native
      
      var version: String = js.native
    }
    object IPackage {
      
      @scala.inline
      def apply(name: String, version: String): IPackage = {
        val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], version = version.asInstanceOf[js.Any])
        __obj.asInstanceOf[IPackage]
      }
      
      @scala.inline
      implicit class IPackageMutableBuilder[Self <: IPackage] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setVersion(value: String): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
      }
    }
  }
}
