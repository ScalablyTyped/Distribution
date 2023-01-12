package typings.insight

import typings.insight.mod.insight.IConfigstore
import typings.insight.mod.insight.IEvent
import typings.insight.mod.insight.IOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("insight", JSImport.Namespace)
  @js.native
  open class ^ protected ()
    extends StObject
       with Insight_ {
    def this(options: IOptions) = this()
  }
  
  @js.native
  trait Insight_ extends StObject {
    
    var appVersion: String = js.native
    
    def askPermission(): Unit = js.native
    def askPermission(msg: String): Unit = js.native
    def askPermission(msg: String, cb: js.Function): Unit = js.native
    def askPermission(msg: Unit, cb: js.Function): Unit = js.native
    
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
    
    trait IConfigstore extends StObject {
      
      var all: Any
      
      def del(key: String): Unit
      
      def get(key: String): Any
      
      var path: String
      
      def set(key: String, `val`: Any): Unit
    }
    object IConfigstore {
      
      inline def apply(all: Any, del: String => Unit, get: String => Any, path: String, set: (String, Any) => Unit): IConfigstore = {
        val __obj = js.Dynamic.literal(all = all.asInstanceOf[js.Any], del = js.Any.fromFunction1(del), get = js.Any.fromFunction1(get), path = path.asInstanceOf[js.Any], set = js.Any.fromFunction2(set))
        __obj.asInstanceOf[IConfigstore]
      }
      
      @scala.inline
      implicit open class MutableBuilder[Self <: IConfigstore] (val x: Self) extends AnyVal {
        
        inline def setAll(value: Any): Self = StObject.set(x, "all", value.asInstanceOf[js.Any])
        
        inline def setDel(value: String => Unit): Self = StObject.set(x, "del", js.Any.fromFunction1(value))
        
        inline def setGet(value: String => Any): Self = StObject.set(x, "get", js.Any.fromFunction1(value))
        
        inline def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
        
        inline def setSet(value: (String, Any) => Unit): Self = StObject.set(x, "set", js.Any.fromFunction2(value))
      }
    }
    
    trait IEvent extends StObject {
      
      var action: String
      
      var category: String
      
      var label: js.UndefOr[String] = js.undefined
      
      var value: js.UndefOr[Double | String] = js.undefined
    }
    object IEvent {
      
      inline def apply(action: String, category: String): IEvent = {
        val __obj = js.Dynamic.literal(action = action.asInstanceOf[js.Any], category = category.asInstanceOf[js.Any])
        __obj.asInstanceOf[IEvent]
      }
      
      @scala.inline
      implicit open class MutableBuilder[Self <: IEvent] (val x: Self) extends AnyVal {
        
        inline def setAction(value: String): Self = StObject.set(x, "action", value.asInstanceOf[js.Any])
        
        inline def setCategory(value: String): Self = StObject.set(x, "category", value.asInstanceOf[js.Any])
        
        inline def setLabel(value: String): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
        
        inline def setLabelUndefined: Self = StObject.set(x, "label", js.undefined)
        
        inline def setValue(value: Double | String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
        
        inline def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
      }
    }
    
    trait IOptions extends StObject {
      
      var config: js.UndefOr[IConfigstore] = js.undefined
      
      var packageName: js.UndefOr[String] = js.undefined
      
      var packageVersion: js.UndefOr[String] = js.undefined
      
      var pkg: js.UndefOr[IPackage] = js.undefined
      
      var trackingCode: String
      
      var trackingProvider: js.UndefOr[String] = js.undefined
    }
    object IOptions {
      
      inline def apply(trackingCode: String): IOptions = {
        val __obj = js.Dynamic.literal(trackingCode = trackingCode.asInstanceOf[js.Any])
        __obj.asInstanceOf[IOptions]
      }
      
      @scala.inline
      implicit open class MutableBuilder[Self <: IOptions] (val x: Self) extends AnyVal {
        
        inline def setConfig(value: IConfigstore): Self = StObject.set(x, "config", value.asInstanceOf[js.Any])
        
        inline def setConfigUndefined: Self = StObject.set(x, "config", js.undefined)
        
        inline def setPackageName(value: String): Self = StObject.set(x, "packageName", value.asInstanceOf[js.Any])
        
        inline def setPackageNameUndefined: Self = StObject.set(x, "packageName", js.undefined)
        
        inline def setPackageVersion(value: String): Self = StObject.set(x, "packageVersion", value.asInstanceOf[js.Any])
        
        inline def setPackageVersionUndefined: Self = StObject.set(x, "packageVersion", js.undefined)
        
        inline def setPkg(value: IPackage): Self = StObject.set(x, "pkg", value.asInstanceOf[js.Any])
        
        inline def setPkgUndefined: Self = StObject.set(x, "pkg", js.undefined)
        
        inline def setTrackingCode(value: String): Self = StObject.set(x, "trackingCode", value.asInstanceOf[js.Any])
        
        inline def setTrackingProvider(value: String): Self = StObject.set(x, "trackingProvider", value.asInstanceOf[js.Any])
        
        inline def setTrackingProviderUndefined: Self = StObject.set(x, "trackingProvider", js.undefined)
      }
    }
    
    trait IPackage extends StObject {
      
      var name: String
      
      var version: String
    }
    object IPackage {
      
      inline def apply(name: String, version: String): IPackage = {
        val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], version = version.asInstanceOf[js.Any])
        __obj.asInstanceOf[IPackage]
      }
      
      @scala.inline
      implicit open class MutableBuilder[Self <: IPackage] (val x: Self) extends AnyVal {
        
        inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
        
        inline def setVersion(value: String): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
      }
    }
  }
}
