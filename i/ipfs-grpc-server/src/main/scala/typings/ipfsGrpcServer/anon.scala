package typings.ipfsGrpcServer

import typings.node.bufferMod.global.Buffer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait Deserialize extends StObject {
    
    /**
      * @param {Uint8Array} buf
      */
    def deserialize(buf: js.typedarray.Uint8Array): js.Object
    
    /**
      * @param {any} message
      */
    def serialize(message: Any): Buffer
  }
  object Deserialize {
    
    inline def apply(deserialize: js.typedarray.Uint8Array => js.Object, serialize: Any => Buffer): Deserialize = {
      val __obj = js.Dynamic.literal(deserialize = js.Any.fromFunction1(deserialize), serialize = js.Any.fromFunction1(serialize))
      __obj.asInstanceOf[Deserialize]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Deserialize] (val x: Self) extends AnyVal {
      
      inline def setDeserialize(value: js.typedarray.Uint8Array => js.Object): Self = StObject.set(x, "deserialize", js.Any.fromFunction1(value))
      
      inline def setSerialize(value: Any => Buffer): Self = StObject.set(x, "serialize", js.Any.fromFunction1(value))
    }
  }
  
  /* Inlined std.Error & {  code :string | undefined} */
  trait Errorcodestringundefined extends StObject {
    
    /* standard es2022.error */
    var cause: js.UndefOr[Any] = js.undefined
    
    var code: js.UndefOr[String] = js.undefined
    
    /* standard es5 */
    var message: String
    
    /* standard es5 */
    var name: String
    
    /* standard es5 */
    var stack: js.UndefOr[String] = js.undefined
  }
  object Errorcodestringundefined {
    
    inline def apply(message: String, name: String): Errorcodestringundefined = {
      val __obj = js.Dynamic.literal(message = message.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
      __obj.asInstanceOf[Errorcodestringundefined]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Errorcodestringundefined] (val x: Self) extends AnyVal {
      
      inline def setCause(value: Any): Self = StObject.set(x, "cause", value.asInstanceOf[js.Any])
      
      inline def setCauseUndefined: Self = StObject.set(x, "cause", js.undefined)
      
      inline def setCode(value: String): Self = StObject.set(x, "code", value.asInstanceOf[js.Any])
      
      inline def setCodeUndefined: Self = StObject.set(x, "code", js.undefined)
      
      inline def setMessage(value: String): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setStack(value: String): Self = StObject.set(x, "stack", value.asInstanceOf[js.Any])
      
      inline def setStackUndefined: Self = StObject.set(x, "stack", js.undefined)
    }
  }
  
  trait Mtime extends StObject {
    
    var mtime: Double
    
    var mtime_nsecs: Double
  }
  object Mtime {
    
    inline def apply(mtime: Double, mtime_nsecs: Double): Mtime = {
      val __obj = js.Dynamic.literal(mtime = mtime.asInstanceOf[js.Any], mtime_nsecs = mtime_nsecs.asInstanceOf[js.Any])
      __obj.asInstanceOf[Mtime]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Mtime] (val x: Self) extends AnyVal {
      
      inline def setMtime(value: Double): Self = StObject.set(x, "mtime", value.asInstanceOf[js.Any])
      
      inline def setMtime_nsecs(value: Double): Self = StObject.set(x, "mtime_nsecs", value.asInstanceOf[js.Any])
    }
  }
}
