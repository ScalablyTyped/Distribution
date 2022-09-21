package typings.hasbin

import typings.hasbin.hasbinBooleans.`false`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  inline def apply(bin: String, done: js.Function1[/* result */ Boolean, Unit]): Unit = (^.asInstanceOf[js.Dynamic].apply(bin.asInstanceOf[js.Any], done.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  @JSImport("hasbin", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  object all {
    
    inline def apply(bins: js.Array[String], done: js.Function1[/* result */ Boolean, Unit]): Unit = (^.asInstanceOf[js.Dynamic].apply(bins.asInstanceOf[js.Any], done.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    @JSImport("hasbin", "all")
    @js.native
    val ^ : js.Any = js.native
    
    inline def sync(bins: js.Array[String]): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("sync")(bins.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  }
  
  object any {
    
    inline def apply(bins: js.Array[String], done: js.Function1[/* result */ Boolean, Unit]): Unit = (^.asInstanceOf[js.Dynamic].apply(bins.asInstanceOf[js.Any], done.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    @JSImport("hasbin", "any")
    @js.native
    val ^ : js.Any = js.native
    
    inline def sync(bins: js.Array[String]): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("sync")(bins.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  }
  
  inline def async(bin: String, done: js.Function1[/* result */ Boolean, Unit]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("async")(bin.asInstanceOf[js.Any], done.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  object every {
    
    inline def apply(bins: js.Array[String], done: js.Function1[/* result */ Boolean, Unit]): Unit = (^.asInstanceOf[js.Dynamic].apply(bins.asInstanceOf[js.Any], done.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    @JSImport("hasbin", "every")
    @js.native
    val ^ : js.Any = js.native
    
    inline def sync(bins: js.Array[String]): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("sync")(bins.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  }
  
  object first {
    
    inline def apply(bins: js.Array[String], done: js.Function1[/* result */ `false` | String, Unit]): Unit = (^.asInstanceOf[js.Dynamic].apply(bins.asInstanceOf[js.Any], done.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    @JSImport("hasbin", "first")
    @js.native
    val ^ : js.Any = js.native
    
    inline def sync(bins: js.Array[String]): `false` | String = ^.asInstanceOf[js.Dynamic].applyDynamic("sync")(bins.asInstanceOf[js.Any]).asInstanceOf[`false` | String]
  }
  
  object some {
    
    inline def apply(bins: js.Array[String], done: js.Function1[/* result */ Boolean, Unit]): Unit = (^.asInstanceOf[js.Dynamic].apply(bins.asInstanceOf[js.Any], done.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    @JSImport("hasbin", "some")
    @js.native
    val ^ : js.Any = js.native
    
    inline def sync(bins: js.Array[String]): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("sync")(bins.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  }
  
  inline def sync(bin: String): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("sync")(bin.asInstanceOf[js.Any]).asInstanceOf[Boolean]
}
