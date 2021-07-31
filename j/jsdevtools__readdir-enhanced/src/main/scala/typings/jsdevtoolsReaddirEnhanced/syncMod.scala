package typings.jsdevtoolsReaddirEnhanced

import typings.jsdevtoolsReaddirEnhanced.anon.Optionsstatsfalseundefine
import typings.jsdevtoolsReaddirEnhanced.anon.Optionsstatstrue
import typings.jsdevtoolsReaddirEnhanced.typesPublicMod.Stats
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object syncMod {
  
  @JSImport("@jsdevtools/readdir-enhanced/lib/sync", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def readdirSync(dir: String): js.Array[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("readdirSync")(dir.asInstanceOf[js.Any]).asInstanceOf[js.Array[String]]
  @scala.inline
  def readdirSync(dir: String, options: Optionsstatsfalseundefine): js.Array[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("readdirSync")(dir.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Array[String]]
  @scala.inline
  def readdirSync(dir: String, options: Optionsstatstrue): js.Array[Stats] = (^.asInstanceOf[js.Dynamic].applyDynamic("readdirSync")(dir.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Array[Stats]]
}
