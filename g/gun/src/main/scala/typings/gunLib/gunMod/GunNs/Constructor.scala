package typings
package gunLib.gunMod.GunNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Constructor
  extends org.scalablytyped.runtime.Instantiable0[ChainReference[js.Object, js.Any, gunLib.gunLibStrings.pre_root]]
     with org.scalablytyped.runtime.Instantiable1[
      (/* options */ js.Array[java.lang.String]) | (/* options */ ConstructorOptions) | (/* options */ java.lang.String), 
      ChainReference[js.Object, js.Any, gunLib.gunLibStrings.pre_root]
    ] {
  /** @see https://gun.eco/docs/SEA */
  var SEA: gunLib.Anon_Callback = js.native
  var node: gunLib.Anon_Anything = js.native
  /**
    * @description
    * no parameters creates a local datastore using the default persistence layer, either localStorage or Radisk.
    * @param options
    * passing a URL creates the above local datastore that also tries to sync with the URL.
    *
    * or you can pass in an array of URLs to sync with multiple peers.
    */
  def apply[DataType](): ChainReference[DataType, _, gunLib.gunLibStrings.pre_root] = js.native
  def apply[DataType](options: ConstructorOptions): ChainReference[DataType, _, gunLib.gunLibStrings.pre_root] = js.native
  def apply[DataType](options: java.lang.String): ChainReference[DataType, _, gunLib.gunLibStrings.pre_root] = js.native
  def apply[DataType](options: js.Array[java.lang.String]): ChainReference[DataType, _, gunLib.gunLibStrings.pre_root] = js.native
}

