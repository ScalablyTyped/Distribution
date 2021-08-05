package typings.jsdevtoolsReaddirEnhanced

import typings.jsdevtoolsReaddirEnhanced.anon.Fn0
import typings.jsdevtoolsReaddirEnhanced.anon.FnCall
import typings.jsdevtoolsReaddirEnhanced.anon.FnCallDirOptions
import typings.jsdevtoolsReaddirEnhanced.anon.FnCallDirOptionsCallback
import typings.jsdevtoolsReaddirEnhanced.anon.Optionsstatsfalseundefine
import typings.jsdevtoolsReaddirEnhanced.anon.Optionsstatstrue
import typings.jsdevtoolsReaddirEnhanced.typesPublicMod.Callback
import typings.jsdevtoolsReaddirEnhanced.typesPublicMod.Stats
import typings.node.streamMod.Readable
import typings.std.AsyncIterableIterator
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("@jsdevtools/readdir-enhanced", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@jsdevtools/readdir-enhanced", JSImport.Default)
  @js.native
  val default: Readdir_ = js.native
  
  @JSImport("@jsdevtools/readdir-enhanced", "readdir")
  @js.native
  val readdir: Readdir_ = js.native
  
  inline def readdirAsync(dir: String): js.Promise[js.Array[String]] = ^.asInstanceOf[js.Dynamic].applyDynamic("readdirAsync")(dir.asInstanceOf[js.Any]).asInstanceOf[js.Promise[js.Array[String]]]
  inline def readdirAsync(dir: String, callback: Callback[js.Array[String]]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("readdirAsync")(dir.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def readdirAsync(dir: String, options: Unit, callback: Callback[js.Array[String]]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("readdirAsync")(dir.asInstanceOf[js.Any], options.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def readdirAsync(dir: String, options: Optionsstatsfalseundefine): js.Promise[js.Array[String]] = (^.asInstanceOf[js.Dynamic].applyDynamic("readdirAsync")(dir.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[js.Array[String]]]
  inline def readdirAsync(dir: String, options: Optionsstatsfalseundefine, callback: Callback[js.Array[String]]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("readdirAsync")(dir.asInstanceOf[js.Any], options.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def readdirAsync(dir: String, options: Optionsstatstrue): js.Promise[js.Array[Stats]] = (^.asInstanceOf[js.Dynamic].applyDynamic("readdirAsync")(dir.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[js.Array[Stats]]]
  inline def readdirAsync(dir: String, options: Optionsstatstrue, callback: Callback[js.Array[Stats]]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("readdirAsync")(dir.asInstanceOf[js.Any], options.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def readdirIterator(dir: String): AsyncIterableIterator[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("readdirIterator")(dir.asInstanceOf[js.Any]).asInstanceOf[AsyncIterableIterator[String]]
  inline def readdirIterator(dir: String, options: Optionsstatsfalseundefine): AsyncIterableIterator[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("readdirIterator")(dir.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[AsyncIterableIterator[String]]
  inline def readdirIterator(dir: String, options: Optionsstatstrue): AsyncIterableIterator[Stats] = (^.asInstanceOf[js.Dynamic].applyDynamic("readdirIterator")(dir.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[AsyncIterableIterator[Stats]]
  
  inline def readdirStream(dir: String): Readable = ^.asInstanceOf[js.Dynamic].applyDynamic("readdirStream")(dir.asInstanceOf[js.Any]).asInstanceOf[Readable]
  inline def readdirStream(dir: String, options: Optionsstatsfalseundefine): Readable = (^.asInstanceOf[js.Dynamic].applyDynamic("readdirStream")(dir.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Readable]
  inline def readdirStream(dir: String, options: Optionsstatstrue): Readable = (^.asInstanceOf[js.Dynamic].applyDynamic("readdirStream")(dir.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Readable]
  
  inline def readdirSync(dir: String): js.Array[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("readdirSync")(dir.asInstanceOf[js.Any]).asInstanceOf[js.Array[String]]
  inline def readdirSync(dir: String, options: Optionsstatsfalseundefine): js.Array[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("readdirSync")(dir.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Array[String]]
  inline def readdirSync(dir: String, options: Optionsstatstrue): js.Array[Stats] = (^.asInstanceOf[js.Dynamic].applyDynamic("readdirSync")(dir.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Array[Stats]]
  
  @js.native
  trait Readdir_ extends StObject {
    
    def apply(dir: String): js.Promise[js.Array[String]] = js.native
    def apply(dir: String, callback: Callback[js.Array[String]]): Unit = js.native
    def apply(dir: String, options: Unit, callback: Callback[js.Array[String]]): Unit = js.native
    def apply(dir: String, options: Optionsstatsfalseundefine): js.Promise[js.Array[String]] = js.native
    def apply(dir: String, options: Optionsstatsfalseundefine, callback: Callback[js.Array[String]]): Unit = js.native
    def apply(dir: String, options: Optionsstatstrue): js.Promise[js.Array[Stats]] = js.native
    def apply(dir: String, options: Optionsstatstrue, callback: Callback[js.Array[Stats]]): Unit = js.native
    
    def async(dir: String): js.Promise[js.Array[String]] = js.native
    def async(dir: String, callback: Callback[js.Array[String]]): Unit = js.native
    def async(dir: String, options: Unit, callback: Callback[js.Array[String]]): Unit = js.native
    def async(dir: String, options: Optionsstatsfalseundefine): js.Promise[js.Array[String]] = js.native
    def async(dir: String, options: Optionsstatsfalseundefine, callback: Callback[js.Array[String]]): Unit = js.native
    def async(dir: String, options: Optionsstatstrue): js.Promise[js.Array[Stats]] = js.native
    def async(dir: String, options: Optionsstatstrue, callback: Callback[js.Array[Stats]]): Unit = js.native
    @JSName("async")
    var async_Original: FnCallDirOptionsCallback = js.native
    
    def iterator(dir: String): AsyncIterableIterator[String] = js.native
    def iterator(dir: String, options: Optionsstatsfalseundefine): AsyncIterableIterator[String] = js.native
    def iterator(dir: String, options: Optionsstatstrue): AsyncIterableIterator[Stats] = js.native
    @JSName("iterator")
    var iterator_Original: Fn0 = js.native
    
    def stream(dir: String): Readable = js.native
    def stream(dir: String, options: Optionsstatsfalseundefine): Readable = js.native
    def stream(dir: String, options: Optionsstatstrue): Readable = js.native
    @JSName("stream")
    var stream_Original: FnCallDirOptions = js.native
    
    def sync(dir: String): js.Array[String] = js.native
    def sync(dir: String, options: Optionsstatsfalseundefine): js.Array[String] = js.native
    def sync(dir: String, options: Optionsstatstrue): js.Array[Stats] = js.native
    @JSName("sync")
    var sync_Original: FnCall = js.native
  }
}
