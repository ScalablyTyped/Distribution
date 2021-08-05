package typings.jsdevtoolsReaddirEnhanced

import typings.jsdevtoolsReaddirEnhanced.anon.Optionsstatsfalseundefine
import typings.jsdevtoolsReaddirEnhanced.anon.Optionsstatstrue
import typings.jsdevtoolsReaddirEnhanced.typesPublicMod.Callback
import typings.jsdevtoolsReaddirEnhanced.typesPublicMod.Stats
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object asyncMod {
  
  @JSImport("@jsdevtools/readdir-enhanced/lib/async", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def readdirAsync(dir: String): js.Promise[js.Array[String]] = ^.asInstanceOf[js.Dynamic].applyDynamic("readdirAsync")(dir.asInstanceOf[js.Any]).asInstanceOf[js.Promise[js.Array[String]]]
  inline def readdirAsync(dir: String, callback: Callback[js.Array[String]]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("readdirAsync")(dir.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def readdirAsync(dir: String, options: Unit, callback: Callback[js.Array[String]]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("readdirAsync")(dir.asInstanceOf[js.Any], options.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def readdirAsync(dir: String, options: Optionsstatsfalseundefine): js.Promise[js.Array[String]] = (^.asInstanceOf[js.Dynamic].applyDynamic("readdirAsync")(dir.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[js.Array[String]]]
  inline def readdirAsync(dir: String, options: Optionsstatsfalseundefine, callback: Callback[js.Array[String]]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("readdirAsync")(dir.asInstanceOf[js.Any], options.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def readdirAsync(dir: String, options: Optionsstatstrue): js.Promise[js.Array[Stats]] = (^.asInstanceOf[js.Dynamic].applyDynamic("readdirAsync")(dir.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[js.Array[Stats]]]
  inline def readdirAsync(dir: String, options: Optionsstatstrue, callback: Callback[js.Array[Stats]]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("readdirAsync")(dir.asInstanceOf[js.Any], options.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
}
