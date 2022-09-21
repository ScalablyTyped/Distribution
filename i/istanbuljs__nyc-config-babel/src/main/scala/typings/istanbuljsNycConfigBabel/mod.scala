package typings.istanbuljsNycConfigBabel

import typings.istanbuljsNycConfigBabel.istanbuljsNycConfigBabelStrings.`@babelSlashregister`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("@istanbuljs/nyc-config-babel", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@istanbuljs/nyc-config-babel", "instrument")
  @js.native
  def instrument: Boolean = js.native
  inline def instrument_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("instrument")(x.asInstanceOf[js.Any])
  
  @JSImport("@istanbuljs/nyc-config-babel", "require")
  @js.native
  def require: js.Array[`@babelSlashregister`] = js.native
  inline def require_=(x: js.Array[`@babelSlashregister`]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("require")(x.asInstanceOf[js.Any])
  
  @JSImport("@istanbuljs/nyc-config-babel", "sourceMap")
  @js.native
  def sourceMap: Boolean = js.native
  inline def sourceMap_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("sourceMap")(x.asInstanceOf[js.Any])
}
