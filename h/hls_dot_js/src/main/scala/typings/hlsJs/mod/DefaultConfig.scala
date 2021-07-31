package typings.hlsJs.mod

import org.scalablytyped.runtime.Shortcut
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * override Hls default configuration
  * this configuration will be applied by default to all instances
  */
/* static member */
object DefaultConfig extends Shortcut {
  
  @JSImport("hls.js", "DefaultConfig")
  @js.native
  val ^ : Config = js.native
  
  /**
    * (default: standard XMLHttpRequest-based URL loader)
    * Override standard URL loader by a custom one. Could be useful for P2P or stubbing (testing).
    * Use this, if you want to overwrite both the fragment and the playlist loader.
    * Note: If fLoader or pLoader are used, they overwrite loader!
    */
  /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
  @JSImport("hls.js", "DefaultConfig.loader")
  @js.native
  class loader protected () extends Loader {
    def this(config: LoaderConfig) = this()
  }
  
  type _To = Config
  
  /* This means you don't have to write `^`, but can instead just say `DefaultConfig.foo` */
  override def _to: Config = ^
}
