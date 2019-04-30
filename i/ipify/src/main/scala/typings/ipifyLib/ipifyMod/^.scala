package typings
package ipifyLib.ipifyMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("ipify", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  /**
  Get your public IP address.
  @returns An IP address.
  @example
  ```
  import ipify = require('ipify');
  (async => {
  	console.log(await ipify());
  	//=> '82.142.31.236'
  })();
  ```
  */
  def apply(): js.Promise[java.lang.String] = js.native
  def apply(options: Options): js.Promise[java.lang.String] = js.native
}

