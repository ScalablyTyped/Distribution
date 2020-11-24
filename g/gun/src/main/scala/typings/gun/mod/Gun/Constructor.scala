package typings.gun.mod.Gun

import org.scalablytyped.runtime.Instantiable0
import org.scalablytyped.runtime.Instantiable1
import typings.gun.anon.Decrypt
import typings.gun.anon.Ify
import typings.gun.gunStrings.pre_root
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Constructor
  extends Instantiable0[ChainReference[js.Object, js.Any, pre_root]]
     with Instantiable1[
      (/* options */ js.Array[String]) | (/* options */ ConstructorOptions) | (/* options */ String), 
      ChainReference[js.Object, js.Any, pre_root]
    ] {
  
  /**
    * @description
    * no parameters creates a local datastore using the default persistence layer, either localStorage or Radisk.
    * @param options
    * passing a URL creates the above local datastore that also tries to sync with the URL.
    *
    * or you can pass in an array of URLs to sync with multiple peers.
    */
  def apply[DataType](): ChainReference[DataType, _, pre_root] = js.native
  def apply[DataType](options: String): ChainReference[DataType, _, pre_root] = js.native
  def apply[DataType](options: js.Array[String]): ChainReference[DataType, _, pre_root] = js.native
  def apply[DataType](options: ConstructorOptions): ChainReference[DataType, _, pre_root] = js.native
  
  /** @see https://gun.eco/docs/SEA */
  var SEA: Decrypt = js.native
  
  var node: Ify = js.native
}
