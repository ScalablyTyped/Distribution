package typings.magicmirrorModule

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait Classes extends StObject {
    
    var classes: String
    
    var file: String
    
    var header: String
    
    var path: String
    
    var position: String
  }
  object Classes {
    
    inline def apply(classes: String, file: String, header: String, path: String, position: String): Classes = {
      val __obj = js.Dynamic.literal(classes = classes.asInstanceOf[js.Any], file = file.asInstanceOf[js.Any], header = header.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any], position = position.asInstanceOf[js.Any])
      __obj.asInstanceOf[Classes]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Classes] (val x: Self) extends AnyVal {
      
      inline def setClasses(value: String): Self = StObject.set(x, "classes", value.asInstanceOf[js.Any])
      
      inline def setFile(value: String): Self = StObject.set(x, "file", value.asInstanceOf[js.Any])
      
      inline def setHeader(value: String): Self = StObject.set(x, "header", value.asInstanceOf[js.Any])
      
      inline def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
      
      inline def setPosition(value: String): Self = StObject.set(x, "position", value.asInstanceOf[js.Any])
    }
  }
  
  trait Force extends StObject {
    
    var force: js.UndefOr[Boolean] = js.undefined
    
    var lockString: js.UndefOr[String] = js.undefined
    
    var onError: js.UndefOr[js.Function0[Unit]] = js.undefined
  }
  object Force {
    
    inline def apply(): Force = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Force]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Force] (val x: Self) extends AnyVal {
      
      inline def setForce(value: Boolean): Self = StObject.set(x, "force", value.asInstanceOf[js.Any])
      
      inline def setForceUndefined: Self = StObject.set(x, "force", js.undefined)
      
      inline def setLockString(value: String): Self = StObject.set(x, "lockString", value.asInstanceOf[js.Any])
      
      inline def setLockStringUndefined: Self = StObject.set(x, "lockString", js.undefined)
      
      inline def setOnError(value: () => Unit): Self = StObject.set(x, "onError", js.Any.fromFunction0(value))
      
      inline def setOnErrorUndefined: Self = StObject.set(x, "onError", js.undefined)
    }
  }
  
  trait LockString extends StObject {
    
    var lockString: String
  }
  object LockString {
    
    inline def apply(lockString: String): LockString = {
      val __obj = js.Dynamic.literal(lockString = lockString.asInstanceOf[js.Any])
      __obj.asInstanceOf[LockString]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: LockString] (val x: Self) extends AnyVal {
      
      inline def setLockString(value: String): Self = StObject.set(x, "lockString", value.asInstanceOf[js.Any])
    }
  }
  
  /* Inlined std.ThisType<std.NonNullable<magicmirror-module.node_helper.NodeHelperModule>> & std.Partial<magicmirror-module.node_helper.NodeHelperModule> */
  trait ThisTypeNonNullableNodeHe extends StObject {
    
    var expressApp: js.UndefOr[Any] = js.undefined
    
    var init: js.UndefOr[js.Function0[Unit]] = js.undefined
    
    var io: js.UndefOr[Any] = js.undefined
    
    var name: js.UndefOr[String] = js.undefined
    
    var path: js.UndefOr[String] = js.undefined
    
    var requiresVersion: js.UndefOr[String] = js.undefined
    
    var sendSocketNotification: js.UndefOr[js.Function2[/* notification */ String, /* payload */ Any, Unit]] = js.undefined
    
    var socketNotificationReceived: js.UndefOr[js.Function2[/* notification */ String, /* payload */ Any, Unit]] = js.undefined
    
    var start: js.UndefOr[js.Function0[Unit]] = js.undefined
    
    var stop: js.UndefOr[js.Function0[Unit]] = js.undefined
  }
  object ThisTypeNonNullableNodeHe {
    
    inline def apply(): ThisTypeNonNullableNodeHe = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ThisTypeNonNullableNodeHe]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ThisTypeNonNullableNodeHe] (val x: Self) extends AnyVal {
      
      inline def setExpressApp(value: Any): Self = StObject.set(x, "expressApp", value.asInstanceOf[js.Any])
      
      inline def setExpressAppUndefined: Self = StObject.set(x, "expressApp", js.undefined)
      
      inline def setInit(value: () => Unit): Self = StObject.set(x, "init", js.Any.fromFunction0(value))
      
      inline def setInitUndefined: Self = StObject.set(x, "init", js.undefined)
      
      inline def setIo(value: Any): Self = StObject.set(x, "io", value.asInstanceOf[js.Any])
      
      inline def setIoUndefined: Self = StObject.set(x, "io", js.undefined)
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
      
      inline def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
      
      inline def setPathUndefined: Self = StObject.set(x, "path", js.undefined)
      
      inline def setRequiresVersion(value: String): Self = StObject.set(x, "requiresVersion", value.asInstanceOf[js.Any])
      
      inline def setRequiresVersionUndefined: Self = StObject.set(x, "requiresVersion", js.undefined)
      
      inline def setSendSocketNotification(value: (/* notification */ String, /* payload */ Any) => Unit): Self = StObject.set(x, "sendSocketNotification", js.Any.fromFunction2(value))
      
      inline def setSendSocketNotificationUndefined: Self = StObject.set(x, "sendSocketNotification", js.undefined)
      
      inline def setSocketNotificationReceived(value: (/* notification */ String, /* payload */ Any) => Unit): Self = StObject.set(x, "socketNotificationReceived", js.Any.fromFunction2(value))
      
      inline def setSocketNotificationReceivedUndefined: Self = StObject.set(x, "socketNotificationReceived", js.undefined)
      
      inline def setStart(value: () => Unit): Self = StObject.set(x, "start", js.Any.fromFunction0(value))
      
      inline def setStartUndefined: Self = StObject.set(x, "start", js.undefined)
      
      inline def setStop(value: () => Unit): Self = StObject.set(x, "stop", js.Any.fromFunction0(value))
      
      inline def setStopUndefined: Self = StObject.set(x, "stop", js.undefined)
    }
  }
}
